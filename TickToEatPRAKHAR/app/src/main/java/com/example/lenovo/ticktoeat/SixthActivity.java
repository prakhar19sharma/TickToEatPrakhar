package com.example.lenovo.ticktoeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SixthActivity extends AppCompatActivity {

   public ArrayList<String> order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        Intent i=getIntent();
        order=i.getStringArrayListExtra("orderlist");
        String sp="";
        for(String x:order)
            sp=sp+"-> "+x+"\n";
        //final MyClass globalVariable = (MyClass) getApplicationContext();
        //String ss=""+globalVariable.getS();b
       // globalVariable.setS(ss+sp);
        TextView t=(TextView)findViewById(R.id.textViewFinalOrder);
        t.setText(sp);

    }
    public void goBack6(View v)
    {
        Intent i =new Intent();
        //i.putStringArrayListExtra("prevorder",order);
        i.setClass(this,FirstActivity.class);
        startActivity(i);
        this.finish();
    }
    public void done(View v)
    {
        finishAffinity();
        System.exit(0);
    }
}
