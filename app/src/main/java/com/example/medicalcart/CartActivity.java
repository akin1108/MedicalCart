package com.example.medicalcart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    private RecyclerView cartListRecyclerView;
    private ProductListAdapter productListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_layout);

        cartListRecyclerView = findViewById(R.id.cart_list_recycler_view);
        productListAdapter = new ProductListAdapter();

        cartListRecyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 2));
        cartListRecyclerView.setAdapter(productListAdapter);

        List<String> productList = new ArrayList<>();
// will look likke this
        productList.add("Headache");
        productList.add("Stomach Pain");
        productList.add("Diarrhea");
        productList.add("Headache");


        productListAdapter.setProductList(productList);
    }
}
