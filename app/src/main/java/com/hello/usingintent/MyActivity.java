package com.hello.usingintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

/**
 * Created by iwan on 16/1/7.
 */
public class MyActivity  extends Activity{

    //适用于隐形Intent,其他Activity通过调用ACTION启动本Activity
    //用法：
    public static final String ACTION = "com.hello.usingintent.intent.action.MyActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        setContentView(R.layout.activity_my);


    }
}
