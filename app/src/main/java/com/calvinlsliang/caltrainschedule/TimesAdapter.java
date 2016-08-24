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

import java.util.ArrayList;
import java.util.List;

public class TimesAdapter extends RecyclerView.Adapter<TimesAdapter.ViewHolder> {

    private List<TimesModel> timesModels = new ArrayList<>();
    private Context context;

    public TimesAdapter() {
    }

    @Override
    public TimesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.times_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(TimesAdapter.ViewHolder holder, int position) {
        TimesModel timesModel = timesModels.get(holder.getAdapterPosition());
        holder.time.setText(String.format("%s - %s", timesModel.startTime, timesModel.endTime));
        holder.busNumber.setText(timesModel.busNumber);
        holder.duration.setText(String.valueOf(timesModel.duration));

        if (timesModel.transferLocation != null && timesModel.transferTime != null) {
            holder.transfer.setText(String.format(context.getString(R.string.transfer),
                    timesModel.transferLocation, timesModel.transferTime));
            holder.transfer.setVisibility(View.VISIBLE);
        } else {
            holder.transfer.setVisibility(View.GONE);
        }
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
    }

    private void clearTimesList() {
        this.timesModels.clear();
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView time;
        private TextView busNumber;
        private TextView duration;
        private TextView transfer;

        public ViewHolder(View itemView) {
            super(itemView);
            this.time = (TextView) itemView.findViewById(R.id.times);
            this.busNumber = (TextView) itemView.findViewById(R.id.busNumber);
            this.duration = (TextView) itemView.findViewById(R.id.duration);
            this.transfer = (TextView) itemView.findViewById(R.id.transfer);
        }
    }
}
