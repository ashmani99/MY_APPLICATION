package com.apps.ankitraz.myapplication;

import android.widget.ArrayAdapter;

/**
 * Created by Ankit raz on 6/28/2018.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.apps.ankitraz.myapplication.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Adapter extends ArrayAdapter<String> {
    Context context;
    ViewHolder viewHolder;
    ArrayList<String> al_newslist=new ArrayList<>();

    public Adapter(Context context,   ArrayList<String> al_newslist) {
        super(context, R.layout.adapter_layout, al_newslist);
        this.al_newslist=al_newslist;
        this.context=context;



    }

    @Override
    public int getCount() {

        Log.e("ADAPTER LIST SIZE",al_newslist.size()+"");
        return al_newslist.size();
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        if (al_newslist.size() > 0) {
            return al_newslist.size();
        } else {
            return 1;
        }
    }
    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_layout, parent, false);
            viewHolder.tv_name = (TextView) convertView.findViewById(R.id.tv_text);



            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        viewHolder.tv_name.setText(al_newslist.get(position));


        return convertView;

    }

    private static class ViewHolder {
        TextView tv_name;



    }

}
