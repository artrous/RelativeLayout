package com.example.user.relativelayout;

import android.content.Intent;
import android.os.Bundle;
// import android.support.design.widget.FloatingActionButton;
// import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        Button button2=(Button)findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if ((v.getId()==(R.id.button2))||(v.getId()==R.id.button)){
            EditText text=(EditText)findViewById(R.id.editText);
            Intent SendIntent=new Intent(this,Activity2.class);
            SendIntent.putExtra("str1",text.getText().toString());
            startActivity(SendIntent);
            setContentView(R.layout.activity_2);
        }
    }
}