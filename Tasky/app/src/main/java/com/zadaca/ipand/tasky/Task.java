package com.zadaca.ipand.tasky;

/**
 * Created by ipand on 15.4.2017..
 */

public class Task {

    private String mTitle;
    private String mDescription;
    private String mCategory;
    private int mPriority;

    public Task(String title, String description, String category, int priority) {
        mTitle = title;
        mDescription = description;
        mCategory = category;
        mPriority = priority;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getCategory() {
        return mCategory;
    }

    public int getPriority() {
        return mPriority;
    }

}
