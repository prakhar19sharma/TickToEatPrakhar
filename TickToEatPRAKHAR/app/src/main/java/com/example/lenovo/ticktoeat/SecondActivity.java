package com.example.lenovo.ticktoeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    static List<String> items=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void getItem2(View v)
    {
        boolean c= ((CheckBox)v).isChecked();
        switch(v.getId())
        {
            case R.id.radiosecond1:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
            case R.id.radiosecond2:
                if(c) {
                    items.add(((CheckBox) v).getText().toString());
                }
                break;
            case R.id.radiosecond3:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;

            case R.id.radiosecond4:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
            case R.id.radiosecond5:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
            case R.id.radiosecond6:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
        }
    }
    public void goBack2(View v)
    {
        Intent i =new Intent();
                i.putStringArrayListExtra("starteritems", (ArrayList<String>) items);
                        i.setClass(this,FirstActivity.class);
        startActivity(i);
        this.finish();
    }
}
