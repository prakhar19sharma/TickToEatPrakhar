package com.example.lenovo.ticktoeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class FourthActivity extends AppCompatActivity {
    static List<String> items=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }
    public void getItem4(View v)
    {
        boolean c= ((CheckBox)v).isChecked();
        switch(v.getId())
        {
            case R.id.radiofourth1:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
            case R.id.radiofourth2:
                if(c) {
                    items.add(((CheckBox) v).getText().toString());
                }
                break;
            case R.id.radiofourth3:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;

            case R.id.radiofourth4:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
            case R.id.radiofourth5:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
            case R.id.radiofourth6:
                if(c) {
                    items.add(((CheckBox)v).getText().toString());
                }
                break;
        }
    }
    public void goBack4(View v)
    {
        Intent i =new Intent();
        i.putStringArrayListExtra("maincourseitems", (ArrayList<String>) items);
        i.setClass(this,FirstActivity.class);
        startActivity(i);
        this.finish();
    }
}
