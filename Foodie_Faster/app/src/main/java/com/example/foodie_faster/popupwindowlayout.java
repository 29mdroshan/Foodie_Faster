package com.example.foodie_faster;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class popupwindowlayout extends Main_Page {
    String item,quan,price;
    TextView itemName,itemPrice,quantity,bill;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindowlayout);
        Intent intent = getIntent();
        item=intent.getStringExtra("item");
        quan=intent.getStringExtra("quantity");
        price=intent.getStringExtra("price");

        itemName=findViewById(R.id.textView18);
        itemPrice=findViewById(R.id.textView23);
        quantity=findViewById(R.id.textView22);
        bill=findViewById(R.id.textView24);

        float sum =(Float.parseFloat(quan)) * (Float.parseFloat(price));

        itemName.setText(item);
        itemPrice.setText(price);
        quantity.setText(quan);
        bill.setText(""+sum);

    }
    public void place(View view){
        Intent intent = new Intent(popupwindowlayout.this, congraturating.class);
        startActivity(intent);




    }
}