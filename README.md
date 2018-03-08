# CustomTitleBar

通用Android标题栏控件，本控件是基于 [QMUI_Android](https://github.com/QMUI/QMUI_Android) 中的标题栏控件抽取出来，单独封装使用的，在此感谢QMUI团队的开源项目。


## 主要功能：
- 支持左、右 文字、图片按钮
- 支持主、副标题
- 支持自定义左右按钮图片、文字样式及标题文字样式
- 支持全局设置标题主题样式

## 效果图

![1](https://github.com/xiaohaibin/CustomTitileBar/blob/master/screenshot/gif.gif)

## 基本使用（详细的使用方法可以参考demo）

 [ ![Download](https://api.bintray.com/packages/jxnk25/maven/CommonTitleBar/images/download.svg) ](https://bintray.com/jxnk25/maven/CommonTitleBar/_latestVersion)

#### 1.添加Gradle依赖

```
dependencies {
    compile 'com.xhb:commontitlebar:latestVersion'//将latestVersion替换成上面最新的版本号
}
```

#### 2.在布局文件中添加

```
    <com.stx.xhb.commontitlebar.CustomTitleBar
        android:id="@+id/titlebar"
        android:layout_width="match_parent"
        android:layout_height="?attr/titlebar_height"/>
```

#### 3.在styles文件中配置主题

```

<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
        <item name="config_color_divider">@color/divider</item>
        <!--标题栏主题样式-->
        <item name="CustomTitleBarStyle">@style/QDTopBar</item>
        <!--设置标题栏高度-->
        <item name="titlebar_height">56dp</item>
    </style>

    <style name="QDTopBar" parent="CustomTitleBar.TopBar">
        <item name="titlebar_bg_color">@color/colorAccent</item>
        <item name="titlebar_title_text_size">16sp</item>
        <item name="titlebar_title_color">@color/color_white</item>
        <item name="titlebar_subtitle_color">@color/config_color_white</item>
        <item name="titlebar_text_btn_color_state_list">@color/s_topbar_btn_color</item>
        <item name="titlebar_image_btn_height">48dp</item>
    </style>

</resources>

```

#### 4.在Activity或者Fragment中配置

```
       CustomTitleBar mTopBar = (CustomTitleBar) findViewById(R.id.titlebar);
       
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

```


## 自定义属性说明

| 属性名 | 属性说明 | 属性值 | 
| ------------ | ------------- | ------------ |
| titlebar_title_gravity| 标题栏背景色 | color，默认为white |
| titlebar_show_divider| 是否显示分割线 | boolean 类型 ，默认显示|
| titlebar_divider_color| 分割线颜色 |color |
| titlebar_divider_height| 分割线高度 | dimension 类型，默认为1px |
| titlebar_bg_color| 标题栏背景颜色 | color 类型，默认为 Color.WHITE |
| titlebar_left_back_drawable_id| 左侧返回按钮图片资源id | reference |
| titlebar_title_text_size| 标题文字大小 |dimension 类型，默认为17sp |
| titlebar_title_text_size_with_subtitle| 有副标题下的标题文字大小| dimension 类型，默认为16sp |
| titlebar_subtitle_text_size| 副标题文字大小 |dimension 类型，默认为11sp|
| titlebar_title_color| 标题文字颜色 | color |
| titlebar_subtitle_color| 副标题文字颜色 | color |
| titlebar_title_margin_horizontal_when_no_btn_aside| 左右没有按钮时，title 距离 TopBar 左右边缘的距离 | dimension，默认为0dp |
| titlebar_title_container_padding_horizontal|  包裹 title 和 subTitle 的容器横向内边距 | dimension 类型，默认0dp |
| titlebar_image_btn_width| 图片按钮宽度 | dimension，默认48dp |
| titlebar_image_btn_height| 图片按钮高度 | dimension，默认48dp |
| titlebar_text_btn_padding_horizontal| 文本按钮横向内边距 | dimension 类型，默认12dp |
| titlebar_text_btn_color_state_list| 文字按钮点击状态 | reference 类型 |
| titlebar_text_btn_text_size| 按钮文字大小 | dimension 类型，默认16sp |

## 关于我

* **Email**: <xhb_199409@163.com>
* **Home**: <http://www.jxnk25.club>
* **掘金**: <https://juejin.im/user/56fcba0a71cfe4005ca1a57b>
* **简书**: <http://www.jianshu.com/users/42aed90cf5af/latest_articles>



### 如果觉得文章帮到你，喜欢我的文章可以关注我和朋友一起运营的微信公众号，将会定期推送优质技术文章，求关注~~~

![欢迎关注“大话安卓”微信公众号](http://upload-images.jianshu.io/upload_images/1956769-2f49dcb0dc5195b6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 欢迎加入“大话安卓”技术交流群，一起分享，共同进步
![欢迎加入“大话安卓”技术交流群，互相学习提升](http://upload-images.jianshu.io/upload_images/1956769-326c166b86ed8e94.JPG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

License
--
    Copyright (C) 2016 xhb_199409@163.com

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
### 如果喜欢，还请statr&Fork&follow进行支持，谢谢O(∩_∩)O~

