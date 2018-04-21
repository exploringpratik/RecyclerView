package com.example.pratik.recyclerview;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<Places> travelList;


    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name, time;
        public ImageButton location;

       // public ConstraintLayout constraintLayout;

        private MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.textView_placeName);
            time = (TextView) view.findViewById(R.id.textView_timeInfo);
            location = (ImageButton) view.findViewById(R.id.button_location);
          //  constraintLayout =(ConstraintLayout) view.findViewById(R.id.my_list_item);
        }


    }


    public MyAdapter(List<Places> travelList) {
        this.travelList = travelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_horizontal, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Places places = travelList.get(position);
        holder.name.setText(places.getPlaceName());
        holder.time.setText(places.getPlaceInfo());
        holder.location.setImageResource(places.getLocation());
       // holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            //@Override
          //  public void onClick(View v) {


              //  Toast.makeText(context, "You Clicked", Toast.LENGTH_LONG).show();
            //}
        //});
    }

    @Override
    public int getItemCount() {
        return travelList.size();
    }
}