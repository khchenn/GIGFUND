package com.gigfund.gigfund;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);

        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToHome();}
        });

        Button rewards = (Button) findViewById(R.id.rewards);
        rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToRewardsActivity();}
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
    }

    private void goToHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void goToRewardsActivity() {
        Intent intent = new Intent(this, RewardsActivity.class);
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
}
