package com.hello.app1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //监听器
        findViewById(R.id.btnStartMyActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                //跨应用启动另外一个应用的Activity，
                //条件1：另一个Activity必须是配置了隐性的Intent
                //条件2：另一个Activity必须隐性配置中开启导出功能 android:exported="true",
                //
                try {
//                    startActivity(new Intent("com.hello.usingintent.intent.action.MyActivity"));

                    //增加过滤机制 Uri.parse("app://hello"),hello是任意字母即可
                    startActivity(new Intent("com.hello.usingintent.intent.action.MyActivity",
                            Uri.parse("app://hello")));

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this,"无法启动另一个Activity",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
