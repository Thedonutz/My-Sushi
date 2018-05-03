package com.umkc.jeff.morgan.mysushi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.umkc.jeff.morgan.mysushi.sashimi.Akami_Sashimi;
import com.umkc.jeff.morgan.mysushi.sashimi.Chutoro_Sashimi;
import com.umkc.jeff.morgan.mysushi.sashimi.Hotate_Sashimi;
import com.umkc.jeff.morgan.mysushi.sashimi.Otoro_Sashimi;
import com.umkc.jeff.morgan.mysushi.sushi.CaliforniaRoll_Activity;
import com.umkc.jeff.morgan.mysushi.sushi.DragonRoll_Activity;
import com.umkc.jeff.morgan.mysushi.sushi.RainbowRoll_Activity;
import com.umkc.jeff.morgan.mysushi.sushi.SpicyTuna_Activity;

import static junit.framework.Assert.assertNotNull;

public class SashimiActivityMenu extends AppCompatActivity {

    Button akami;
    Button chutoro;
    Button hotate;
    Button otoro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sashimi);

        // Locate the button in activity_main.xml
        akami = (Button) findViewById(R.id.akami_button);
        assertNotNull(akami);
        chutoro = (Button) findViewById(R.id.chutoro_button);
        assertNotNull(chutoro);
        hotate = (Button) findViewById(R.id.hotate_button);
        assertNotNull(hotate);
        otoro = (Button) findViewById(R.id.otoro_button);
        assertNotNull(otoro);
        // Capture button clicks
        akami.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SashimiActivityMenu.this,
                        Akami_Sashimi.class);
                startActivity(myIntent);
            }
        });
        chutoro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SashimiActivityMenu.this,
                        Chutoro_Sashimi.class);
                startActivity(myIntent);
            }
        });
        hotate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SashimiActivityMenu.this,
                        Hotate_Sashimi.class);
                startActivity(myIntent);
            }
        });
        otoro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SashimiActivityMenu.this,
                        Otoro_Sashimi.class);
                startActivity(myIntent);
            }
        });
    }
}
