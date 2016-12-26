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
    private static final SimpleDateFormat dbFormat = new SimpleDateFormat("hh:mm aa", Locale.getDefault());
    private static final DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT);

    private List<TimesModel> timesModels = new ArrayList<>();
    private Context context;
    private Date currentDate;
    private int closestPositionMarked = -1;

    public TimesAdapter() {
    }

    @Override
    public TimesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.times_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TimesAdapter.ViewHolder holder, int position) {
        TimesModel timesModel = timesModels.get(holder.getAdapterPosition());
        holder.time.setText(String.format("%s - %s", timesModel.startTime, timesModel.endTime));
        holder.busNumber.setText(timesModel.busNumber);
        holder.duration.setText(String.valueOf(timesModel.duration));

        handleTransfers(holder, timesModel);
        handleAutocompleteTime(holder, timesModel, position);
    }

    @Override
    public int getItemCount() {
        return timesModels.size();
    }

    public void setTimesList(@Nullable List<TimesModel> timesModel) {
        if (timesModel == null) {
            clearTimesList();
            return;
        }

        this.timesModels = timesModel;
        notifyDataSetChanged();
        closestPositionMarked = -1;
    }

    public void setTime(Date date) {
        try {
            this.currentDate = format.parse(dateFormat.format(date));
            closestPositionMarked = -1;
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

    private void handleAutocompleteTime(TimesAdapter.ViewHolder holder, TimesModel timesModel, int position) {
        try {
            final Date startDate = dbFormat.parse(timesModel.startTime);

            if (isNextAvailableTime(startDate) && checkPosition(position)) {
                // TODO: 12/26/16 fix theme
                holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.lightGreen));
                closestPositionMarked = position;
            } else {
                holder.itemView.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
            }
        } catch (ParseException e) {
            holder.itemView.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
        }
    }

    private boolean checkPosition(int position) {
        return this.closestPositionMarked < 0 || position == this.closestPositionMarked;
    }

    private boolean isNextAvailableTime(Date given) {
        return this.currentDate != null && this.currentDate.before(given);
    }

    private void clearTimesList() {
        this.timesModels.clear();
        notifyDataSetChanged();
        closestPositionMarked = -1;
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
