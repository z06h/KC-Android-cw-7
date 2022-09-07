package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Items> ItemsArray = new ArrayList <>();




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Items cheese = new Items ("Cheese", R.drawable.cheese, 2.0 );
        Items kakao = new Items("Chocolate", R.drawable.chocolate, 1.5);
        Items coffee = new Items("Coffee", R.drawable.coffee, 2.5);
        Items donut = new Items ("Donut", R.drawable.donut, 0.5 );
        Items botat = new Items("Fries", R.drawable.fries, 1.0);
        Items honey = new Items("Honey", R.drawable.honey, 2.0);


        ItemsArray.add(cheese);
        ItemsArray.add(kakao);
        ItemsArray.add(coffee);
        ItemsArray.add(donut);
        ItemsArray.add(botat);
        ItemsArray.add(honey);




        ItemAdapter adapter =  new ItemAdapter(this, 0, ItemsArray);
        ListView Listview = findViewById(R.id.LV);
      Listview.setAdapter(adapter);



      Listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Items Ahmad = ItemsArray.get(i);
              Intent intent = new Intent(MainActivity.this, MainActivity2.class);
              intent.putExtra("item22",Ahmad);
              startActivity(intent);

          }
      });



    }

}