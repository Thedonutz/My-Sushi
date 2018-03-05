package com.umkc.jeff.morgan.mysushi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityMenu extends Activity {
    Button sushiButton;
    Button nigiriButton;
    Button sashimiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Locate the button in activity_main.xml
        sushiButton = (Button) findViewById(R.id.sushi_button);

        // Capture button clicks
        sushiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivityMenu.this,
                        SushiActivityMenu.class);
                startActivity(myIntent);
            }
        });

        // Locate the button in activity_main.xml
        nigiriButton = (Button) findViewById(R.id.nigiri_button);

        // Capture button clicks
        nigiriButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivityMenu.this,
                        NigiriActivityMenu.class);
                startActivity(myIntent);
            }
        });

        // Locate the button in activity_main.xml
        sashimiButton = (Button) findViewById(R.id.shashimi_button);

        // Capture button clicks
        sashimiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivityMenu.this,
                        SashimiActivityMenu.class);
                startActivity(myIntent);
            }
        });
    }
}
