package me.arun.constraintsample.sample.adapter;
import android.app.Activity;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import me.arun.constraintsample.R;
import me.arun.constraintsample.sample.EventDetailActivity;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {
 
//    private List<Movie> moviesList;
Activity activity;
 
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvEventName, tvGroup, tvConfirm,tvLocation,tvDate;
        ConstraintLayout clConfirm,clLocation;
        View vConfirm;

 
        public MyViewHolder(View view) {
            super(view);
            tvEventName = (TextView) view.findViewById(R.id.tvEventName);
            tvConfirm = (TextView) view.findViewById(R.id.tvConfirm);
            tvGroup = (TextView) view.findViewById(R.id.tvGroup);
            tvLocation = (TextView) view.findViewById(R.id.tvLocation);
            tvDate = (TextView) view.findViewById(R.id.tvDate);
            clConfirm=(ConstraintLayout)view.findViewById(R.id.clConfirm);
            clLocation=(ConstraintLayout)view.findViewById(R.id.clLocation);
            vConfirm=(View)view.findViewById(R.id.vConfirm);
        }
    }
 
 
    public EventAdapter(Activity activity/*List<Movie> moviesList*/) {
//        this.moviesList = moviesList;
        this.activity=activity;
    }
 
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_event, parent, false);
        return new MyViewHolder(itemView);
    }
 
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        Movie movie = moviesList.get(position);
//        holder.title.setText(movie.getTitle());
//        holder.genre.setText(movie.getGenre());
//        holder.year.setText(movie.getYear());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.startActivity(new Intent(activity, EventDetailActivity.class));
            }
        });
    }
 
    @Override
    public int getItemCount() {
        return 2;
    }
}