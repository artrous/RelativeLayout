package com.example.user.relativelayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 2/6/2016.
 */
public class Activity2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView tv1=(TextView) findViewById(R.id.textView5);
        Bundle b = this.getIntent().getExtras();
        //Toast.makeText(getActivity().getApplicationContext(), b.getString("str1"), Toast.LENGTH_SHORT).show();
        tv1.setText("Hello "+b.getString("str1"));
    }
    public void onBackPressed(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
