package com.calvinlsliang.caltrainschedule;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.caltrain.calvinlsliang.caltrainschedule.R;

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


        // // TODO: 12/25/16 add theme
        if (position == spinner.getSelectedItemPosition()) {
            view.setBackgroundColor(context.getResources().getColor(R.color.green));
        } else {
            view.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
        }

        return view;

    }
}
