package com.calvinlsliang.caltrainschedule;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

public class StationArrayAdapter extends ArrayAdapter<String> {

    private Context context;
    private Spinner spinner;

    public StationArrayAdapter(Context context, int resource, List<String> objects, Spinner spinner) {
        super(context, resource, objects);
        this.context = context;
        this.spinner = spinner;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View view = super.getDropDownView(position, convertView, parent);


        if (position == spinner.getSelectedItemPosition()) {
            view.setBackgroundColor(context.getResources().getColor(android.R.color.holo_red_dark));
        } else {
            view.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
        }

        return view;

    }
}
