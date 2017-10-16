package com.gigfund.gigfund;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        Button tax = (Button) findViewById(R.id.tax);
        tax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {goToTaxActivity();}
        });
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

    private void goToTaxActivity() {
        Intent intent = new Intent(this, TaxActivity.class);
        startActivity(intent);
    }


}
