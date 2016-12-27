package com.calvinlsliang.caltrainschedule;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.caltrain.calvinlsliang.caltrainschedule.R;
import com.calvinlsliang.caltrainschedule.model.TimesModel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TimesAdapter extends RecyclerView.Adapter<TimesAdapter.ViewHolder> {

    private static final SimpleDateFormat format = new SimpleDateFormat("hh:mm aa", Locale.getDefault());
    private static final DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT);
    private static final int OFFSET = 1;

    private Context context;
    private AutoscrollCallback autoscrollCallback;

    private List<TimesModel> timesModels;
    private int bestPositionMarked;

    public TimesAdapter() {
        timesModels = new ArrayList<>();
        bestPositionMarked = -1;
    }

    @Override
    public TimesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        final View v = LayoutInflater.from(context).inflate(R.layout.times_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TimesAdapter.ViewHolder holder, int position) {
        final TimesModel timesModel = timesModels.get(holder.getAdapterPosition());
        holder.time.setText(String.format("%s - %s", timesModel.startTime, timesModel.endTime));
        holder.busNumber.setText(timesModel.busNumber);
        holder.duration.setText(String.valueOf(timesModel.duration));

        handleTransfers(holder, timesModel);
        handleBackgroundHighlighting(holder, position);
    }

    @Override
    public int getItemCount() {
        return timesModels.size();
    }

    public void setCallback(AutoscrollCallback autoscrollCallback) {
        this.autoscrollCallback = autoscrollCallback;
    }

    public void setTimesList(@Nullable List<TimesModel> timesModel, Date date) {
        if (timesModel == null) {
            clearTimesList();
            return;
        }

        this.timesModels = timesModel;
        notifyDataSetChanged();
        bestPositionMarked = -1;

        findBestTime(timesModel, date);
    }

    private void findBestTime(List<TimesModel> timesModels, Date date) {
        try {
            final Date currentDate = format.parse(dateFormat.format(date));

            for (int position = 0; position < timesModels.size(); position++) {
                final TimesModel timesModel = timesModels.get(position);
                final Date startDate = format.parse(timesModel.startTime);

                if (isNextAvailableTime(currentDate, startDate) && checkPosition(position)) {
                    // TODO: 12/26/16 fix theme
                    bestPositionMarked = position;
                    scrollToBestPosition();
                    break;
                }
            }
        } catch (ParseException e) {
        }
    }

    private void handleTransfers(TimesAdapter.ViewHolder holder, TimesModel timesModel) {
        if (timesModel.transferLocation != null && timesModel.transferTime != null) {
            holder.transfer.setText(String.format(context.getString(R.string.transfer),
                    timesModel.transferLocation, timesModel.transferTime));
            holder.transfer.setVisibility(View.VISIBLE);
        } else {
            holder.transfer.setVisibility(View.GONE);
        }
    }

    private boolean checkPosition(int position) {
        return this.bestPositionMarked < 0 || position == this.bestPositionMarked;
    }

    private boolean isNextAvailableTime(Date current, Date given) {
        return current != null && current.before(given);
    }

    private void scrollToBestPosition() {
        if (autoscrollCallback != null) {
            autoscrollCallback.bestTimeFound(bestPositionMarked - OFFSET);
        }
    }

    private void handleBackgroundHighlighting(TimesAdapter.ViewHolder holder, int position) {
        if (position == bestPositionMarked) {
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.lightGreen));
        } else {
            holder.itemView.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
        }
    }

    private void clearTimesList() {
        this.timesModels.clear();
        notifyDataSetChanged();
        bestPositionMarked = -1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView time;
        private final TextView busNumber;
        private final TextView duration;
        private final TextView transfer;

        public ViewHolder(View itemView) {
            super(itemView);
            this.time = (TextView) itemView.findViewById(R.id.times);
            this.busNumber = (TextView) itemView.findViewById(R.id.busNumber);
            this.duration = (TextView) itemView.findViewById(R.id.duration);
            this.transfer = (TextView) itemView.findViewById(R.id.transfer);
        }
    }
}
