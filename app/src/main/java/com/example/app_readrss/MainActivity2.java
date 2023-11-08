package com.example.app_readrss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {

    WebView wvTinTuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        wvTinTuc = (WebView) findViewById(R.id.wvTinTuc);

        Intent intent = getIntent();
        String link = intent.getStringExtra("linkTinTuc");

        wvTinTuc.loadUrl("link");
    }
}