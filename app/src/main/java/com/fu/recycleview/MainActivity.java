package com.fu.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Person> mPersonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //add data
        mPersonList = new ArrayList<>();
        mPersonList.add(new Person("Roy"));
        mPersonList.add(new Person("Jack"));
        mPersonList.add(new Person("Darren"));
        mPersonList.add(new Person("Pow"));
        mPersonList.add(new Person("Jeff"));
        mPersonList.add(new Person("How"));
        mPersonList.add(new Person("Ran"));
        mPersonList.add(new Person("Ben"));
        mPersonList.add(new Person("Pan"));
        mPersonList.add(new Person("Oie"));
        mPersonList.add(new Person("Yen"));
        mPersonList.add(new Person("God"));

        // specify an adapter (see also next example)
        MyAdapter myAdapter = new MyAdapter(this, mPersonList);
        mRecyclerView.setAdapter(myAdapter);

    }
}
