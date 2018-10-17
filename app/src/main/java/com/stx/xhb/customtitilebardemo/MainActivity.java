package com.stx.xhb.customtitilebardemo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.stx.xhb.commontitlebar.CustomTitleBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomTitleBar mTopBar = (CustomTitleBar) findViewById(R.id.titlebar);
        mTopBar.addRightImageButton(R.mipmap.ic_launcher, R.id.topbar_right_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "右侧图片按钮", Toast.LENGTH_SHORT).show();
            }
        });
        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show();
            }
        });
        mTopBar.addRightTextButton("完成", R.id.topbar_right_about_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "完成", Toast.LENGTH_SHORT).show();
            }
        });
        mTopBar.setTitle("标题");


        CustomTitleBar titleBar2 = (CustomTitleBar) findViewById(R.id.titlebar2);
        titleBar2.setTitle("标题");
        titleBar2.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        titleBar2.addLeftTextButton("返回", R.id.topbar_left_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show();
            }
        });
        titleBar2.addRightTextButton("完成", R.id.topbar_right_about_button, ContextCompat.getColorStateList(this,R.color.color_yellow), 16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "完成", Toast.LENGTH_SHORT).show();
            }
        });


        CustomTitleBar titleBar3 = (CustomTitleBar) findViewById(R.id.titlebar3);
        titleBar3.setTitle("标题");
        titleBar3.setSubTitle("副标题");
        titleBar3.addLeftTextButton("返回", R.id.topbar_left_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show();
            }
        });
        titleBar3.addRightTextButton("完成", R.id.topbar_right_about_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "完成", Toast.LENGTH_SHORT).show();
            }
        });

        CustomTitleBar titleBar4 = (CustomTitleBar) findViewById(R.id.titlebar4);
        titleBar4.setTitle("标题");
        titleBar4.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show();
            }
        });
        titleBar4.addLeftTextButton("返回", R.id.topbar_left_button);
    }
}
