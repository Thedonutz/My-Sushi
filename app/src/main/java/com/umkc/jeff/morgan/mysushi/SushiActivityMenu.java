package com.umkc.jeff.morgan.mysushi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static junit.framework.Assert.assertNotNull;

import com.umkc.jeff.morgan.mysushi.sushi.CaliforniaRoll_Activity;
import com.umkc.jeff.morgan.mysushi.sushi.DragonRoll_Activity;
import com.umkc.jeff.morgan.mysushi.sushi.RainbowRoll_Activity;
import com.umkc.jeff.morgan.mysushi.sushi.SpicyTuna_Activity;

public class SushiActivityMenu extends AppCompatActivity {

    Button californiaRoll;
    Button dragonRoll;
    Button rainbowRoll;
    Button spicytunaRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushi);

        // Locate the button in activity_main.xml
        californiaRoll = (Button) findViewById(R.id.california_roll_button);
        assertNotNull(californiaRoll);
        dragonRoll = (Button) findViewById(R.id.dragon_roll_button);
        assertNotNull(dragonRoll);
        rainbowRoll = (Button) findViewById(R.id.rainbow_roll_button);
        assertNotNull(rainbowRoll);
        spicytunaRoll = (Button) findViewById(R.id.spicy_tuna_button);
        assertNotNull(spicytunaRoll);
        // Capture button clicks
        californiaRoll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SushiActivityMenu.this,
                        CaliforniaRoll_Activity.class);
                startActivity(myIntent);
            }
        });
        dragonRoll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SushiActivityMenu.this,
                        DragonRoll_Activity.class);
                startActivity(myIntent);
            }
        });
        rainbowRoll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SushiActivityMenu.this,
                        RainbowRoll_Activity.class);
                startActivity(myIntent);
            }
        });
        spicytunaRoll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SushiActivityMenu.this,
                        SpicyTuna_Activity.class);
                startActivity(myIntent);
            }
        });
    }
}
