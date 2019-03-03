package me.arun.constraintsample.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.arun.constraintsample.R;
import me.arun.constraintsample.sample.adapter.EventAdapter;
import me.arun.constraintsample.sample.model.Event;

public class SampleActivity extends AppCompatActivity
{
    RecyclerView rvEvent;
    EventAdapter eventAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        rvEvent=(RecyclerView)findViewById(R.id.rvEvents);
        eventAdapter=new EventAdapter(this,getEvents());
        rvEvent.setLayoutManager(new LinearLayoutManager(this));
        rvEvent.setAdapter(eventAdapter);
    }


    ArrayList<Event> getEvents(){
       ArrayList<Event> eventList=new ArrayList();
       Event event1=new Event("Mobile Developers Meetup","Google Developers",false,"Monday, 12th February","Chennai");
       event1.setAddress("No. 4, Rajiv Gandhi Salai, Taramani, Chennai - 600 113. India");
       event1.setTime("11:00 am - 5.00pm");
       event1.setDescription("The massive technology conference Techweek references past attendees and sponsors to illustrate how popular and illustrious the event is.");
       eventList.add(event1);
        Event event2=new Event("Mobile Developers Meetup","Google Developers",true,"Monday, 12th February","Chennai");
        event1.setAddress("No. 4, Rajiv Gandhi Salai, Taramani, Chennai - 600 113. India");
        event1.setTime("11:00 am - 5.00pm");
        event1.setDescription("The massive technology conference Techweek references past attendees and sponsors to illustrate how popular and illustrious the event is.");
        eventList.add(event2);
       return eventList;

    }
}
