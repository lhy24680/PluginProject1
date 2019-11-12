package com.example.lhy.pluginproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lhy.commonmodule.BeanManager;

public class Plugin1MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button toMainBtn;
    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plug1_activity_main);
        toMainBtn = findViewById(R.id.pulgin1_main_btn);
        toMainBtn.setOnClickListener(this);
        showText = findViewById(R.id.showText);
        showText.setText(BeanManager.getInstance().getName());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.pulgin1_main_btn) {
            Intent intent = new Intent();
            intent.setClassName("com.example.lhy.mainproject", "com.example.lhy.mainproject.MainActivity");
            intent.putExtra("value", "通过intent传递过来的值");
            startActivity(intent);
        }
    }
}
