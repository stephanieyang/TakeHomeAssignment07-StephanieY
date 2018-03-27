package com.example.android.takehomeassignment07_stephaniey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    ArrayList<StitchPattern> stitchPatternList;
    StitchPatternAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setTitle("RecyclerViewActivity");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initializeData();

        adapter = new StitchPatternAdapter(stitchPatternList, this);
        recyclerView.setAdapter(adapter);
    }

    private void initializeData() {
        stitchPatternList = new ArrayList<StitchPattern>();
        stitchPatternList.add(new StitchPattern("stockinette", R.drawable.stockinette, "(knit 1 row, purl 1 row), repeat"));
        stitchPatternList.add(new StitchPattern("garter", R.drawable.garter, "(knit 1 row), repeat"));
        stitchPatternList.add(new StitchPattern("seed", R.drawable.seed, "(k1,p1)* to end, (p1,k1)* to end, repeat"));
    }

    public void addRandomStitch(View view) {
        StitchPattern newPattern;
        int num = (int) (Math.random() * 3);
        if (num == 0)
            newPattern = new StitchPattern("stockinette", R.drawable.stockinette, "(knit 1 row, purl 1 row), repeat");
        else if (num == 1)
            newPattern = new StitchPattern("garter", R.drawable.garter, "(knit 1 row), repeat");
        else
            newPattern = new StitchPattern("seed", R.drawable.seed, "(k1,p1)* to end, (p1,k1)* to end, repeat");

        stitchPatternList.add(newPattern);

        // update view
        adapter = new StitchPatternAdapter(stitchPatternList, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }
}