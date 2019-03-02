package me.arun.constraintsample.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import me.arun.constraintsample.R;
import me.arun.constraintsample.sample.adapter.EventAdapter;

public class SampleActivity extends AppCompatActivity
{

    RecyclerView rvEvent;
    EventAdapter eventAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        rvEvent=(RecyclerView)findViewById(R.id.rvEvents);
        eventAdapter=new EventAdapter(this);
        rvEvent.setLayoutManager(new LinearLayoutManager(this));
        rvEvent.setAdapter(eventAdapter);
    }
}
