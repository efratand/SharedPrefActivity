package com.myapps.and.sharedprefactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);

        if ( pref.getBoolean("display_welcome",true)) {
            Toast.makeText(this,"Welcome :)",Toast.LENGTH_SHORT).show();
        }

        Button setPrefBtn= (Button) findViewById(R.id.prefBtn);
        setPrefBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent setPrefIntent=new Intent(MainActivity.this,SetPrefs.class);
                startActivity(setPrefIntent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        pref.getString("background_color","blue");
        String bgColr=pref.getString("background_color","blue");
        LinearLayout activityMain = (LinearLayout) findViewById(R.id.activity_main);
        activityMain.setBackgroundColor(Color.parseColor(bgColr));

    }
}
