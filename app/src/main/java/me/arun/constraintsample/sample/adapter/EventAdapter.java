package me.arun.constraintsample.sample.adapter;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import me.arun.constraintsample.R;
import me.arun.constraintsample.sample.EventDetailActivity;
import me.arun.constraintsample.sample.model.Event;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {

 private  Activity activity;
 ArrayList<Event> eventList=new ArrayList<>();
 
 class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvEventName, tvGroup, tvConfirm,tvLocation,tvDate;
        ConstraintLayout clConfirm,clLocation;
        View vConfirm;
         MyViewHolder(View view) {
            super(view);
            tvEventName = view.findViewById(R.id.tvEventName);
            tvConfirm = view.findViewById(R.id.tvConfirm);
            tvGroup = view.findViewById(R.id.tvGroup);
            tvLocation =  view.findViewById(R.id.tvLocation);
            tvDate = view.findViewById(R.id.tvDate);
            clConfirm=view.findViewById(R.id.clConfirm);
            clLocation=view.findViewById(R.id.clLocation);
            vConfirm=view.findViewById(R.id.vConfirm);
        }
    }
 
 
    public EventAdapter(Activity activity,ArrayList<Event> eventList) {
        this.activity=activity;
        this.eventList=eventList;
    }
 
    @Override
    public @NonNull MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_event, parent, false);
        return new MyViewHolder(itemView);
    }
 
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     Event event=eventList.get(position);
        holder.tvDate.setText(event.getDate());
        holder.tvEventName.setText(event.getName());
        holder.tvGroup.setText(event.getGroup());
     if (event.isIsconfirmed()) {
         holder.tvConfirm.setText("Confirmed");
         holder.vConfirm.setBackground(activity.getDrawable(R.drawable.bg_check));
     }else {
         holder.tvConfirm.setText("Pending");
         holder.vConfirm.setBackground(activity.getDrawable(R.drawable.bg_dot));
     }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.startActivity(new Intent(activity, EventDetailActivity.class));
            }
        });
    }
 
    @Override
    public int getItemCount() {
        return eventList.size();
    }
}