package com.caltrain.calvinlsliang.caltrainscheduler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.caltrain.calvinlsliang.caltrainscheduler.model.TimesModel;

import java.util.ArrayList;
import java.util.List;

public class TimesAdapter extends RecyclerView.Adapter<TimesAdapter.ViewHolder> {

    final private List<TimesModel> timesModels;

    public TimesAdapter() {
        timesModels = new ArrayList<>();
    }

    public TimesAdapter(List<TimesModel> timesModels) {
        this.timesModels = timesModels;
    }

    @Override
    public TimesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.times_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(TimesAdapter.ViewHolder holder, int position) {
        TimesModel timesModel = timesModels.get(holder.getAdapterPosition());
        holder.time.setText(String.format("%s - %s", timesModel.startTime, timesModel.endTime));
        holder.busNumber.setText(timesModel.busNumber);
        holder.duration.setText(String.valueOf(timesModel.duration));
    }

    @Override
    public int getItemCount() {
        return timesModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView time;
        private TextView busNumber;
        private TextView duration;

        public ViewHolder(View itemView) {
            super(itemView);
            this.time = (TextView) itemView.findViewById(R.id.times);
            this.busNumber = (TextView) itemView.findViewById(R.id.busNumber);
            this.duration = (TextView) itemView.findViewById(R.id.duration);
        }
    }
}
