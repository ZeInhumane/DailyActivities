package com.example.dailyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DailyDetailTask extends Fragment {
    TextView tasklist, todotask;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_daily_detail_task, container, false);
        tasklist = (TextView)view.findViewById(R.id.Task);
        todotask = (TextView)view.findViewById(R.id.TaskDetail);
        return view;
    }
    public void change(String utask, String utaskdetail){
        tasklist.setText(utask);
        todotask.setText(utaskdetail);
    }

}
