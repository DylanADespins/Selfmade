package com.example.selfmade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView orchid = (TextView) findViewById(R.id.orchid);

        orchid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OrchidActivityIntent = new Intent(MainActivity.this, OrchidActivity.class);

                startActivity(OrchidActivityIntent);
            }
        });
        TextView lilies = (TextView) findViewById(R.id.lilies);

        lilies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LiliesActivityIntent = new Intent(MainActivity.this, LiliesActivity.class);

                startActivity(LiliesActivityIntent);
            }
        });
        TextView tulip = (TextView) findViewById(R.id.tulip);

        tulip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TulipActivityIntent = new Intent(MainActivity.this, TulipActivity.class);

                startActivity(TulipActivityIntent);
            }
        });
        TextView daisies = (TextView) findViewById(R.id.daisies);

        daisies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DaisyActivityIntent = new Intent(MainActivity.this, GerberaDaisyActivity.class);

                startActivity(DaisyActivityIntent);
            }
        });
        TextView roses = (TextView) findViewById(R.id.roses);

        roses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RoseActivityIntent = new Intent(MainActivity.this, RosesActivity.class);

                startActivity(RoseActivityIntent);
            }
        });
        TextView alstroemeria = (TextView) findViewById(R.id.alstroemeria);

        alstroemeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlstroemeriaActivityIntent = new Intent(MainActivity.this, AlstroemeriaActivity.class);

                startActivity(AlstroemeriaActivityIntent);
            }
        });
    }
}


