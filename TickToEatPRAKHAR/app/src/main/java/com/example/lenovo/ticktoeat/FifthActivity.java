package com.example.lenovo.ticktoeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class FifthActivity extends AppCompatActivity {
    static List<String> items=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }
    public void getItem5(View v)
    {
        boolean c= ((CheckBox)v).isChecked();
        switch(v.getId())
        {
            case R.id.radiofifth1:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
            case R.id.radiofifth2:
                if(c) {
                    items.add(((CheckBox) v).getText().toString());
                }
                break;
            case R.id.radiofifth3:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;

            case R.id.radiofifth4:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
        }
    }
    public void goBack5(View v)
    {
        Intent i =new Intent();
        i.putStringArrayListExtra("dessertitems", (ArrayList<String>) items);
        i.setClass(this,FirstActivity.class);
        startActivity(i);
        this.finish();
    }
}
