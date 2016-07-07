package com.teamtreehouse.pomodoro.model;

/**
 * Created by Damian on 3/9/2016.
 */
public enum AttemptKind {
    FOCUS(25*60, "Focus time"),
    BREAK(5*60, "Break time");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) { //Enum constructor
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
