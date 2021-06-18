package com.example.butterknife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnClick)
    Button btnClick;

    @BindView(R.id.btnGotoFragment)
    Button btnGotoFragment;

    @BindView(R.id.txtClick)
    TextView txtClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnClick)
    void showName() {
        txtClick.setText("IT wala...");
    }

    @OnClick(R.id.btnGotoFragment)
    void gotoFragment() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}