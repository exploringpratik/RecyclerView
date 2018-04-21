package com.example.pratik.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forfirst();
        forSecond();
        forThird();
        forForth();
        forFifth();
        forSixth();
        forSeventh();
        forEight();

    }

    public void forfirst(){
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view_horizontal);
        MyAdapter adapter = new MyAdapter(places,context);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }

    public void forSecond(){
        ArrayList<Places> places = new ArrayList<>();

        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location)); places.add(new Places("Pashupati", "4 hours from Koteshor", R.drawable.location));
        RecyclerView recyclerView = findViewById(R.id.my_recycler_view_horizontal1);
        MyAdapter adapter = new MyAdapter(places);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }

    public void forThird(){
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        RecyclerView recyclerView = findViewById(R.id.my_recycler_view_horizontal2);
        MyAdapter adapter = new MyAdapter(places);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }

    public void forForth(){
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view_horizontal4);
        MyAdapter adapter = new MyAdapter(places);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }
    public void forFifth(){
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view_horizontal5);
        MyAdapter adapter = new MyAdapter(places);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }
    public void forSixth(){
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view_horizontal6);
        MyAdapter adapter = new MyAdapter(places);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }
    public void forSeventh(){
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view_horizontal7);
        MyAdapter adapter = new MyAdapter(places);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }
    public void forEight(){
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));
        places.add(new Places("Name 1", "Awesome", R.drawable.location));
        places.add(new Places("Name 2", "Good", R.drawable.location));
        places.add(new Places("Name 3", "Haha", R.drawable.location));
        places.add(new Places("Name 4", "Android is Awesome", R.drawable.location));
        places.add(new Places("Name 5", "Happy Coding", R.drawable.location));

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view_horizontal8);
        MyAdapter adapter = new MyAdapter(places);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
    }
}
