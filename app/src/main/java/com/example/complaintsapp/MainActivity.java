package com.example.complaintsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    ProgressBar loader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loader = (ProgressBar)findViewById(R.id.progressBar);
        loader.setVisibility(RelativeLayout.VISIBLE);
        webView = (WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://westwardho.azurewebsites.net");
        WebSettings webSettings = webView.getSettings();
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        loader.setVisibility(RelativeLayout.INVISIBLE);
    }
    public void onBackPressed(){
        if (webView.canGoBack()){
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
