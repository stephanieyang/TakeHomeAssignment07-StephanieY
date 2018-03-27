package com.example.android.takehomeassignment07_stephaniey;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Stephanie on 3/26/2018.
 */

public class StitchViewHolder extends RecyclerView.ViewHolder {
    private CardView cardView;
    private TextView stitchNameView;
    private TextView stitchInstructionsView;
    private ImageView stitchPhotoView;

    public TextView getStitchNameView() {
        return stitchNameView;
    }

    public void setStitchNameView(TextView stitchNameView) {
        this.stitchNameView = stitchNameView;
    }

    public TextView getStitchInstructionsView() {
        return stitchInstructionsView;
    }

    public void setStitchInstructionsView(TextView stitchinstructionsView) {
        this.stitchInstructionsView = stitchinstructionsView;
    }

    public ImageView getStitchPhotoView() {
        return stitchPhotoView;
    }

    public void setStitchPhotoView(ImageView stitchPhotoView) {
        this.stitchPhotoView = stitchPhotoView;
    }

    private Context context;

    //b)
    public StitchViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        stitchNameView = (TextView) itemView.findViewById(R.id.stitch_name);
        stitchInstructionsView = (TextView) itemView.findViewById(R.id.stitch_instructions);
        stitchPhotoView = (ImageView) itemView.findViewById(R.id.stitch_photo);
        this.context = context;

//c)
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, stitchNameView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
