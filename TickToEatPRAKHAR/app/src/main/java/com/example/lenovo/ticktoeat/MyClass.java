package com.example.lenovo.ticktoeat;

import android.app.Application;

public class MyClass extends Application
{
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String someVariable) {
        this.s= someVariable;
    }
}
