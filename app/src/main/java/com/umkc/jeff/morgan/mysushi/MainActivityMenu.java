package com.umkc.jeff.morgan.mysushi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static junit.framework.Assert.assertNotNull;

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
       try{
        // Capture button clicks
        sushiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                assertNotNull(sushiButton);
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivityMenu.this,
                        SushiActivityMenu.class);
                startActivity(myIntent);
            }
        });} catch (Exception e) {
           e.printStackTrace();
       }

        // Locate the button in activity_main.xml
        nigiriButton = (Button) findViewById(R.id.nigiri_button);
       try{
        // Capture button clicks
        nigiriButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                assertNotNull(nigiriButton);
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivityMenu.this,
                        NigiriActivityMenu.class);
                startActivity(myIntent);
            }
        });} catch (Exception e) {
           e.printStackTrace();
       }

        // Locate the button in activity_main.xml
        sashimiButton = (Button) findViewById(R.id.sashimi_button);
        try {
        // Capture button clicks
        sashimiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                assertNotNull(sashimiButton);
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivityMenu.this,
                        SashimiActivityMenu.class);
                startActivity(myIntent);
            }
        });} catch (Exception e) {
            e.printStackTrace();
        }
    }
}
