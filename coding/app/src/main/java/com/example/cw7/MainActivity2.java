package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        Items item = (Items) bundle.get("item22");


        TextView item22 = findViewById(R.id.ItemName);
        ImageView ITEMIMG= findViewById(R.id.ItemImage);

        item22.setText(item.getItemName());
        ITEMIMG.setImageResource(item.getItemImage());


    }
}