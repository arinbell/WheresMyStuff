package com.teamcow.wheresmystuff.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.teamcow.wheresmystuff.R;

public class ItemRegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_reg);
        Button itemPostButton = (Button) findViewById(R.id.itemreg_post_button);
        itemPostButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                postItem();
            }
        });
    }

    public void postItem() {
        finish();
    }
}
