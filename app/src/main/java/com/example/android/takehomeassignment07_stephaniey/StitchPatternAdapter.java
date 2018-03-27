package com.example.android.takehomeassignment07_stephaniey;

/**
 * Created by Stephanie on 3/26/2018.
 */


import android.support.v7.widget.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class StitchPatternAdapter extends RecyclerView.Adapter<StitchViewHolder> {
    private List<StitchPattern> stitchPatterns;
    private Context context;

    public StitchPatternAdapter(List<StitchPattern> stitchPatterns, Context context) {
        this.stitchPatterns = stitchPatterns;
        this.context = context;
    }

    @Override
    public StitchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_stitch, parent, false);
        return new StitchViewHolder(view, context);
    }


    @Override
    public void onBindViewHolder(StitchViewHolder holder, int position) {
        StitchPattern stitchPattern = stitchPatterns.get(position);
        holder.getStitchNameView().setText(stitchPattern.getName());
        holder.getStitchInstructionsView().setText(stitchPattern.getInstructions());
        holder.getStitchPhotoView().setImageResource(stitchPattern.getPhotoId());
    }

    @Override
    public int getItemCount() {
        return stitchPatterns.size();
    }


}
