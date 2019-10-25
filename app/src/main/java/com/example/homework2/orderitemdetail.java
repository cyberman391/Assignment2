package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class orderitemdetail extends AppCompatActivity {
    private TextView orderitemTextView;
    private TextView orderitemDescriptionTextView;
    private ImageView imageView;
    String choices = " ";
    Double price = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderitemdetail);

        Intent intent = getIntent();

        int orderID = intent.getIntExtra("OrderID",0);

        Order order = fakedatabase.getOrderById(orderID);

        orderitemTextView = findViewById(R.id.orderitem);
        orderitemDescriptionTextView = findViewById(R.id.orderDescription);
        imageView = findViewById(R.id.detailImage);

        orderitemTextView.setText(order.getOrderitem());
        orderitemDescriptionTextView.setText(order.getDescription());
        imageView.setImageResource(order.getImageDrawableId());
    }
}
