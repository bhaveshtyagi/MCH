package com.loopwiki.loginregisterwithsqlite;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home_screen);
        Button btn =(Button) findViewById(R.id.button);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("Try App","DATA SAVED SUCCESSFULLY");
            Toast.makeText(getApplicationContext(),"DATA SAVED SUCCESSFULLY", Toast.LENGTH_LONG)
            .show();
        }
    });
    }
}