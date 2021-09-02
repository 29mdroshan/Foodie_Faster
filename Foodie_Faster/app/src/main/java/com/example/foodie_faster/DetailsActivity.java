package com.example.foodie_faster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView itemName,itemPrice,itemRating,a,b,itemDesc,itemDev,itemType;

    String name,price,rating,desc,type,dev_time;
    Uri imageUrl;
    int count=0;
    TextView textView16;
    Button cart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);



        Intent intent = getIntent();

        name=intent.getStringExtra("name");
        price=intent.getStringExtra("price");
        rating=intent.getStringExtra("rating");
        desc=intent.getStringExtra("desc");
        type=intent.getStringExtra("type");
        dev_time=intent.getStringExtra("dev_time");



        imageView=findViewById(R.id.imageView9);
        itemName=findViewById(R.id.textView14);
        itemPrice=findViewById(R.id.textView17);
        itemRating=findViewById(R.id.rt);
        itemDesc=findViewById(R.id.textView15);
        itemType=findViewById(R.id.textView13);
        itemDev=findViewById(R.id.textView8);



        Bundle bundle = getIntent().getExtras();

        if(bundle!= null){
            int res_image = bundle.getInt("foodImage");
            imageView.setImageResource(res_image);
        }

        itemName.setText(name);
        itemPrice.setText(price);
        itemRating.setText(rating);
        itemDesc.setText(desc);
        itemDev.setText(dev_time);
        itemType.setText(type);
        textView16 = findViewById(R.id.textView16);

    }
    public void back(View view) {
        Intent intent = new Intent(DetailsActivity.this, Main_Page.class);
        startActivity(intent);
    }

        public void book(View view) {
            Toast.makeText(this, "Your Choice is Saved for Future Orders!!!", Toast.LENGTH_SHORT).show();
        }

    public  void share(View view){
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        String a= itemName.getText().toString();
        String b = itemPrice.getText().toString();
        myIntent.setType("text/plain");
        String body = "I have found this "+a+" of Price $ "+b+"on Foodie Faster";
        String sub = "Your Subject";
        myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
        myIntent.putExtra(Intent.EXTRA_TEXT,body);
        startActivity(Intent.createChooser(myIntent, "Share Using"));
    }

    public void inc(View view){
        count=count+1;
        textView16.setText(""+count);

    }
    public void dec(View view){
        if(count >0)
        count--;
        textView16.setText(""+count);

    }
    public void add(View view){


        //display the popup window


        String str1 = itemName.getText().toString();
        String str2 = itemPrice.getText().toString();
        String str3 = textView16.getText().toString();
        if(Integer.parseInt(str3)>0) {
            Intent intent = new Intent(getApplicationContext(), popupwindowlayout.class);
            intent.putExtra("item", str1);
            intent.putExtra("price", str2);
            intent.putExtra("quantity", str3);
            startActivity(intent);
        }
        else if(str3 == ""){
            return ;

        }
        else{
            Toast.makeText(this, "Please select the Quantity", Toast.LENGTH_SHORT).show();
        }

    }

    }
