package com.example.lenovo.ticktoeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {
    static List<String> items=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void getItem3(View v)
    {
        boolean c= ((CheckBox)v).isChecked();
        switch(v.getId())
        {
            case R.id.radiothird1:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
            case R.id.radiothird2:
                if(c) {
                    items.add(((CheckBox) v).getText().toString());
                }
                break;
            case R.id.radiothird3:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;

            case R.id.radiothird4:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
        }
    }
    public void goBack3(View v)
    {
        Intent i =new Intent();
        i.putStringArrayListExtra("appetizeritems", (ArrayList<String>) items);
        i.setClass(this,FirstActivity.class);
        startActivity(i);
        this.finish();
    }

}
