package com.netology;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
