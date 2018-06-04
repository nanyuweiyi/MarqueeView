package com.sunfusheng.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    private String url;

    public static void startWebViewActivity(Context context, String url){
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra("url", url);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webView = findViewById(R.id.webview);

        url = getIntent().getStringExtra("url");
        webView.loadUrl(url);

    }

}
