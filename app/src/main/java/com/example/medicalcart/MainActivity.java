package com.example.medicalcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView productListRecyclerView;
    private ProductListAdapter productListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productListRecyclerView = findViewById(R.id.product_list_recycler_view);
        productListAdapter = new ProductListAdapter();

        productListRecyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 2));
        productListRecyclerView.setAdapter(productListAdapter);

        List<String> productList = new ArrayList<>();

        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");

        productListAdapter.setProductList(productList);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.cart:
                Intent cartIntent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(cartIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
