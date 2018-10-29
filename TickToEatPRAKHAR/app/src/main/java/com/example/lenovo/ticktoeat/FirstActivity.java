package com.example.lenovo.ticktoeat;

import android.content.Intent;
import android.support.v4.app.JobIntentService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
   static ArrayList<String> items = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent i=getIntent();
        ArrayList<String> starteritems=i.getStringArrayListExtra("starteritems");
        if(starteritems!=null) {
            for (String x : starteritems) {
                items.add(x);
            }
        }

        ArrayList<String> appetizeritems = i.getStringArrayListExtra("appetizeritems");
        if(appetizeritems!=null) {
            for (String x : appetizeritems) {
                items.add(x);
            }
        }

        ArrayList<String> maincourseitems = i.getStringArrayListExtra("maincourseitems");
        if(maincourseitems!=null) {
            for (String x : maincourseitems) {
                items.add(x);
            }
        }

        ArrayList<String> dessertitems = i.getStringArrayListExtra("dessertitems");
        if(dessertitems!=null) {
            for (String x : dessertitems) {
                items.add(x);
            }
        }
       /* ArrayList<String> prevorder=i.getStringArrayListExtra("prevorder");
        if(prevorder!=null) {
            for (String x : prevorder){
                items.add(x);
            }
        }*/
    }
        public void starters(View v)
        {
            Intent gotos=new Intent();
            gotos.setClass(this,SecondActivity.class);
            startActivity(gotos);
        }
        public void appetizer(View v)
        {
            Intent gotos=new Intent();
            gotos.setClass(this,ThirdActivity.class);
            startActivity(gotos);
        }
        public void main_course(View v)
        {
            Intent gotos=new Intent();
            gotos.setClass(this,FourthActivity.class);
            startActivity(gotos);
        }
        public void dessert(View v)
        {
            Intent gotos=new Intent();
            gotos.setClass(this,FifthActivity.class);
            startActivity(gotos);
        }
        public void placeOrder(View v)
        {

           Intent order=new Intent();
            order.putStringArrayListExtra("orderlist",items);
            order.setClass(this,SixthActivity.class);
            startActivity(order);
        }
    }


