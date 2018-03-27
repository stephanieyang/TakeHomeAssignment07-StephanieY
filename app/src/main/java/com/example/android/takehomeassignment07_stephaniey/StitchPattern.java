package com.example.android.takehomeassignment07_stephaniey;

/**
 * Created by Stephanie on 3/26/2018.
 */

public class StitchPattern {
    private String name;
    private int photoId;
    private String instructions;

    public String getName() {
        return name;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getInstructions() {
        return instructions;
    }

    public StitchPattern(String name, int photoId, String instructions) {
        this.name = name;
        this.photoId = photoId;
        this.instructions = instructions;
    }
}
