package com.fast.daanyal.shoppingcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myview=(WebView)findViewById(R.id.webView);
        WebSettings webSettings= myview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //asdasdasdasdasdasd
        String url="http://easyonlineconverter.com/";
        String url2="http://192.168.1.102:8080/JSFTest/faces/login.xhtml";
        /* http:// 192.168.1.102:8081/JSFTest/faces/login.xhtml */
        myview.loadUrl(url2);
        myview.setWebViewClient(new WebViewClient());



    }

    @Override
    public void onBackPressed() {
        if(myview.canGoBack())
        {
            myview.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }

}
