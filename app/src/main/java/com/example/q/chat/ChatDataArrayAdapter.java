package com.example.q.chat;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.annotation.Target;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


/**
 * Created by q on 2017-01-03.
 */



public class ChatDataArrayAdapter extends ArrayAdapter<ChatData> {

    ArrayList<ChatData> adapter;
    String last="";


    public ChatDataArrayAdapter(Context context, int resource, ArrayList<ChatData> Resource) {
        super(context, resource, Resource);
        adapter = Resource;
    }

    @Override
    public int getCount(){
        return adapter.size();
    }

    @Override
    public ChatData getItem(int position){
        return adapter.get(position);
    }


    public void add(ChatData e){
        adapter.add(e);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        TextView tt = null;
        TextView t2= null;
        TextView t3=null;
        if (v == null) {
            ChatData chatData=adapter.get(position);

            if(chatData.getUserName().equals(MainActivity.username)&&!chatData.getUserName().equals(last)){

                if(chatData.getUserName().equals(MainActivity.username)) {
                    LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = inflater.inflate(R.layout.list_item1_2, null);
                    tt = (TextView) v.findViewById(R.id.textview2);
                    tt.setText(chatData.getMessage());

                    t2=(TextView) v.findViewById(R.id.timeStamp);
                    t2.setText(chatData.getTime());
                    t2.setTextSize(10);
                    t3=(TextView)v.findViewById(R.id.textView4);
                    t3.setText("USER"+chatData.getUserName());
                    t3.setTypeface(null, Typeface.BOLD);
                }


                else {
                    LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = inflater.inflate(R.layout.list_item1, null);
                    tt = (TextView) v.findViewById(R.id.textview2);
                    tt.setText(chatData.getMessage());

                    t2 = (TextView) v.findViewById(R.id.timeStamp);
                    t2.setText(chatData.getTime());
                    t2.setTextSize(10);
                    t3 = (TextView) v.findViewById(R.id.textView4);
                    t3.setText("USER" + chatData.getUserName());
                    t3.setTypeface(null, Typeface.BOLD);
                }
            }
            else{
                  if(chatData.getUserName().equals(MainActivity.username)) {
                      LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


                      v = inflater.inflate(R.layout.list_item2_2, null);
                      tt = (TextView) v.findViewById(R.id.textview5);
                      tt.setText(chatData.getMessage());

                      t2 = (TextView) v.findViewById(R.id.timeStamp2);
                      t2.setText(chatData.getTime());
                      t2.setTextSize(10);
                   }

                  else {
                      LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


                      v = inflater.inflate(R.layout.list_item2, null);
                      tt = (TextView) v.findViewById(R.id.textview5);
                      tt.setText(chatData.getMessage());

                      t2 = (TextView) v.findViewById(R.id.timeStamp2);
                      t2.setText(chatData.getTime());
                      t2.setTextSize(10);
                  }
            }


            last=chatData.getUserName();

        }



        return v;
    }


}