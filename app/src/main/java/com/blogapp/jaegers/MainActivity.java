package com.blogapp.jaegers;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
;


public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
OnClickListener listnr =new OnClickListener() {

    @Override
     public void onClick(View v){
        Intent i= new Intent("One");
        startActivity(i);
    }

Button btn =(Button) findViewById(R.id.signUp);
        btn.setOnClickListener(listnr);

    }
}





