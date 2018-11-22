package com.example.user.volly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Ravi Sharma on 26-Oct-17.
 */

public class customList extends BaseAdapter{

    Context c;
    public static String[] name;
    public static String[] username;
    public static String[] email;
    public static String[] password;

    public customList(Context c, String[] name, String[] username, String[] email, String[] password)
    {
        this.c=c;
        this.name=name;
        this.username=username;
        this.email=email;
        this.password=password;
    }


    @Override
    public int getCount() {
        return username.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater in=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView=in.inflate(R.layout.activity_custom_list,null);

        TextView t1=(TextView)convertView.findViewById(R.id.textView);
        TextView t2=(TextView)convertView.findViewById(R.id.textView2);
        TextView t3=(TextView)convertView.findViewById(R.id.textView3);
        TextView t4=(TextView)convertView.findViewById(R.id.textView4);

        t1.setText(name[position]);
        t2.setText(username[position]);
        t3.setText(email[position]);
        t4.setText(password[position]);

        return convertView;
    }
}

