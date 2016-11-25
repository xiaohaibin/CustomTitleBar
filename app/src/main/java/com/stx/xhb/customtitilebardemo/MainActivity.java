package com.stx.xhb.customtitilebardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.stx.xhb.commontitlebar.CustomTitlebar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomTitlebar customTitlebar1 = (CustomTitlebar) findViewById(R.id.title1);
        CustomTitlebar customTitlebar2 = (CustomTitlebar) findViewById(R.id.title2);
        CustomTitlebar customTitlebar3 = (CustomTitlebar) findViewById(R.id.title3);
        CustomTitlebar customTitlebar4 = (CustomTitlebar) findViewById(R.id.title4);
        customTitlebar1.setAction(new CustomTitlebar.TitleBarOnClickListener() {
            @Override
            public void performAction(View view) {
                switch (view.getId()){
                    case R.id.iv_left:
                        Toast.makeText(MainActivity.this, "左边图片按钮", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        customTitlebar2.setAction(new CustomTitlebar.TitleBarOnClickListener() {
            @Override
            public void performAction(View view) {
                switch (view.getId()){
                    case R.id.iv_left:
                        Toast.makeText(MainActivity.this, "左边图片按钮", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tv_right:
                        Toast.makeText(MainActivity.this, "右边文字按钮", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        customTitlebar3.setAction(new CustomTitlebar.TitleBarOnClickListener() {
            @Override
            public void performAction(View view) {
                switch (view.getId()){
                    case R.id.iv_left:
                        Toast.makeText(MainActivity.this, "左边图片按钮", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.iv_right:
                        Toast.makeText(MainActivity.this, "右边图片按钮", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        customTitlebar4.setAction(new CustomTitlebar.TitleBarOnClickListener() {
            @Override
            public void performAction(View view) {
                switch (view.getId()){
                    case R.id.tv_left:
                        Toast.makeText(MainActivity.this, "左边文字按钮", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tv_right:
                        Toast.makeText(MainActivity.this, "右边文字按钮", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
