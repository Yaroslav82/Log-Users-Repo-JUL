package org.example.app.views;

public abstract class BaseView {

    public abstract String[] getData();

    public void getOutput(String output) {
        System.out.println(output);
    }
}
