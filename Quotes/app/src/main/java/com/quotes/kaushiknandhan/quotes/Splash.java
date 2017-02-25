package com.quotes.kaushiknandhan.quotes;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by kaushik nandhan on 2/24/2017.
 */

public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        Thread splashThread = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.getMessage();
                }finally {
                    Intent mySplash = new Intent(Splash.this ,QuoteReaderActivity.class);
                    startActivity(mySplash);                }
            }
        };
        splashThread.start();
    }
}
