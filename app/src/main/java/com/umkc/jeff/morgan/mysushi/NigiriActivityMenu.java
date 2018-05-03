package com.umkc.jeff.morgan.mysushi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.umkc.jeff.morgan.mysushi.nigiri.Hamachi_Nigiri;
import com.umkc.jeff.morgan.mysushi.nigiri.Ikura_Nigiri;
import com.umkc.jeff.morgan.mysushi.nigiri.Maguro_Nigiri;
import com.umkc.jeff.morgan.mysushi.nigiri.Unagi_Nigiri;
import com.umkc.jeff.morgan.mysushi.sashimi.Akami_Sashimi;
import com.umkc.jeff.morgan.mysushi.sashimi.Chutoro_Sashimi;
import com.umkc.jeff.morgan.mysushi.sashimi.Hotate_Sashimi;
import com.umkc.jeff.morgan.mysushi.sashimi.Otoro_Sashimi;

import static junit.framework.Assert.assertNotNull;

public class NigiriActivityMenu extends AppCompatActivity {

    Button hamachi;
    Button ikura;
    Button maguro;
    Button unagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nigiri);

        // Locate the button in activity_main.xml
        hamachi = (Button) findViewById(R.id.hamachi_button);
        assertNotNull(hamachi);
        ikura = (Button) findViewById(R.id.ikura_button);
        assertNotNull(ikura);
        maguro = (Button) findViewById(R.id.maguro_button);
        assertNotNull(maguro);
        unagi = (Button) findViewById(R.id.unagi_button);
        assertNotNull(unagi);
        // Capture button clicks
        hamachi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(NigiriActivityMenu.this,
                        Hamachi_Nigiri.class);
                startActivity(myIntent);
            }
        });
        ikura.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(NigiriActivityMenu.this,
                        Ikura_Nigiri.class);
                startActivity(myIntent);
            }
        });
        maguro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(NigiriActivityMenu.this,
                        Maguro_Nigiri.class);
                startActivity(myIntent);
            }
        });
        unagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(NigiriActivityMenu.this,
                        Unagi_Nigiri.class);
                startActivity(myIntent);
            }
        });
    }
}
