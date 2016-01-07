package com.hello.usingintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //arg1:上下文
                //arg2:类的定义
                //显性Intent定义方式
//                startActivity(new Intent(MainActivity.this, MyActivity.class));

                //隐性Intent 1
//                startActivity(new Intent("com.hello.usingintent.intent.MyActivity"));

                //隐性Intent 2
                //优势：可以启动另一个Activity的类的定义，
                //用法：在被启动的Activity中定义
                //public static final String ACTION = "com.hello.usingintent.intent.action.MyActivity";
                startActivity(new Intent(MyActivity.ACTION));

            }
        });
    }
}
