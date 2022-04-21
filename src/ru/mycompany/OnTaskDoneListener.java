package ru.mycompany;

@FunctionalInterface
public interface OnTaskDoneListener {

    void onDone(String result);
}
