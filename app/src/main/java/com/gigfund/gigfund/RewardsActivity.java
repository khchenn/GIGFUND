package com.gigfund.gigfund;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RewardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToHome();}
        });

        Button income = (Button) findViewById(R.id.income);
        income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToIncomeActivity();}
        });

        Button expense = (Button) findViewById(R.id.expense);
        expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToExpenseActivity();}
        });

        Button tax = (Button) findViewById(R.id.tax);
        tax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToTaxActivity();}
        });

        Button notification = (Button) findViewById(R.id.notification);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToCongrats();}
        });
    }

    private void goToHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void goToIncomeActivity() {
        Intent intent = new Intent(this, IncomeActivity.class);
        startActivity(intent);
    }

    private void goToExpenseActivity() {
        Intent intent = new Intent(this, ExpenseActivity.class);
        startActivity(intent);
    }

    private void goToTaxActivity() {
        Intent intent = new Intent(this, TaxActivity.class);
        startActivity(intent);
    }

    private void goToCongrats() {
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }
}
