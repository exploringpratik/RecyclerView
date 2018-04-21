package com.example.pratik.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;
//I Tried to use this but, I can't, if you have any idea to use horizontal recycler view inside main vertical recycler view then
// contact me Emain: exploringpratik@gmail.com
public class MyAdapterVertical extends RecyclerView.Adapter<MyAdapterVertical.MyViewHolder> {

    private List<PlacesVertical> mainList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mainTopic, seeAll;


        private MyViewHolder(View view) {
            super(view);
            mainTopic = (TextView) view.findViewById(R.id.text_topic);
            seeAll = (TextView) view.findViewById(R.id.text_seeAll);
        }
    }


    public MyAdapterVertical(List<PlacesVertical> mainList) {
        this.mainList = mainList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_vertical, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        PlacesVertical places = mainList.get(position);
        holder.mainTopic.setText(places.getTopic());
        holder.seeAll.setText(places.getSeeAll());
    }

    @Override
    public int getItemCount() {
        return mainList.size();
    }
}