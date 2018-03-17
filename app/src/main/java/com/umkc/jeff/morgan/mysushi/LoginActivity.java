package com.umkc.jeff.morgan.mysushi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static Button login_button;
    int attempt_counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }

    public void LoginButton(){
        username = (EditText)findViewById(R.id.editText_user);
        password = (EditText)findViewById(R.id.editText_password);
        login_button = (Button)findViewById(R.id.button_login);

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("user")){
                            if (password.getText().toString().equals("pass")){
                                Toast.makeText(LoginActivity.this, "Username and password is correct",
                                        Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent("com.umkc.jeff.morgan.mysushi.MainActivityMenu");
                                startActivity(intent);
                            }
                        }
                        }

                }
        );
    }
}
