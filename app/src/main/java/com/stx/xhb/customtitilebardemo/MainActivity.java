package com.stx.xhb.customtitilebardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.stx.xhb.commontitlebar.CustomTitleBar2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomTitleBar2 mTopBar = (CustomTitleBar2) findViewById(R.id.titlebar);
        mTopBar.addLeftImageButton(R.mipmap.ic_launcher,R.id.topbar_left_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "测试", Toast.LENGTH_SHORT).show();
            }
        });
        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "测试", Toast.LENGTH_SHORT).show();
            }
        });
        mTopBar.addRightTextButton("呵呵",R.id.topbar_right_about_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "呵呵", Toast.LENGTH_SHORT).show();
            }
        });
        mTopBar.setTitle("测试");

    }
}
