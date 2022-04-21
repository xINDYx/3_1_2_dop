package ru.mycompany;

@FunctionalInterface
public interface OnTaskErrorListener {

    void onError(String result);
}
