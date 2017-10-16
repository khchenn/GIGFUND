package com.gigfund.gigfund;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToHome();}
        });

        Button buy = (Button) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToSearchPage();}
        });

        Button invest = (Button) findViewById(R.id.invest);
        invest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToInvestPage();}
        });

        Button save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToSavePage();}
        });
    }

    private void goToHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void goToSearchPage() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    private void goToInvestPage() {
        Intent intent = new Intent(this, InvestActivity.class);
        startActivity(intent);
    }

    private void goToSavePage() {
        Intent intent = new Intent(this, SaveActivity.class);
        startActivity(intent);
    }
}
