package com.stx.xhb.commontitlebar.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;

import java.lang.reflect.Field;
import java.util.Locale;
public class ScreenHelper {

    /**
     * 屏幕密度,系统源码注释不推荐使用
     */
    public static final float DENSITY = Resources.getSystem()
            .getDisplayMetrics().density;
    private static final String TAG = "Devices";
    /**
     * 屏幕密度
     */
    public static float sDensity = 0f;


    public static DisplayMetrics getDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE))
                .getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /**
     * 把以 dp 为单位的值，转化为以 px 为单位的值
     *
     * @param dpValue 以 dp 为单位的值
     * @return px value
     */
    public static int dpToPx(int dpValue) {
        return (int) (dpValue * DENSITY + 0.5f);
    }

    /**
     * 把以 px 为单位的值，转化为以 dp 为单位的值
     *
     * @param pxValue 以 px 为单位的值
     * @return dp值
     */
    public static int pxToDp(float pxValue) {
        return (int) (pxValue / DENSITY + 0.5f);
    }

    public static float getDensity(Context context) {
        if (sDensity == 0f) {
            sDensity = getDisplayMetrics(context).density;
        }
        return sDensity;
    }

    /**
     * 获取屏幕宽度
     * @param context 上下文
     * @return 屏幕宽度
     */
    public static int getScreenWidth(Context context) {
        return getDisplayMetrics(context).widthPixels;
    }

    /**
     * 获取屏幕高度
     * @param context 上下文
     * @return 屏幕高度
     */
    public static int getScreenHeight(Context context) {
        return getDisplayMetrics(context).heightPixels;
    }

    /**
     * 单位转换: dp  px
     * @param context 上下文
     * @param dp dp
     * @return px
     */
    public static int dp2px(Context context, int dp) {
        return (int) (getDensity(context) * dp + 0.5);
    }

    /**
     * 单位转换:px  dp
     * @param context 上下文
     * @param px  dp
     * @return dp
     */
    public static int px2dp(Context context, int px) {
        return (int) (px / getDensity(context) + 0.5);
    }

    /**
     * 单位转换: sp  px
     *
     * @param sp sp
     * @return px
     */
    public static int sp2px(Context context, int sp) {
        return (int) (getFontDensity(context) * sp + 0.5);
    }

    public static float getFontDensity(Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity;
    }
}
