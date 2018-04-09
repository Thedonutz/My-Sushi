package com.umkc.jeff.morgan.mysushi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static junit.framework.Assert.assertNotNull;

import com.umkc.jeff.morgan.mysushi.sushi.CaliforniaRoll_Activity;

public class SushiActivityMenu extends AppCompatActivity {

    Button californiaRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushi);

        // Locate the button in activity_main.xml
        californiaRoll = (Button) findViewById(R.id.california_roll_button);
        assertNotNull(californiaRoll);
        // Capture button clicks
        californiaRoll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SushiActivityMenu.this,
                        CaliforniaRoll_Activity.class);
                startActivity(myIntent);
            }
        });
    }
}
