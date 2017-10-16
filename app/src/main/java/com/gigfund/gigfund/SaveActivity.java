package com.gigfund.gigfund;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToHome();}
        });

        Button webredirect = (Button) findViewById(R.id.webredirect);
        webredirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToWebRedirect();}
        });

    }

    private void goToHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void goToWebRedirect() {
        Intent intent = new Intent(this, WebRedirect.class);
        startActivity(intent);
    }
}
