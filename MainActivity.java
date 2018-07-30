package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private static int numberOfCoffees = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method is called when the order button is clicked
    public void submitOrder(View view) {
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * 5);
    }

    // This method is called when the plus button is clicked
    public void increment(View view) {
        numberOfCoffees += 1;
        display(numberOfCoffees);
    }

    // This method is called when the minus button is clicked
    public void decrement(View view) {
        if (!(numberOfCoffees == 0))
            numberOfCoffees -= 1;
        display(numberOfCoffees);
    }

    // This method displays the given quantity value on the screen
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    // This method displays the given quantity value on the screen
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
