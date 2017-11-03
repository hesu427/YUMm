package com.example.heesu.yum;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by B10544 on 2017-11-02.
 */

public class SplashActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
