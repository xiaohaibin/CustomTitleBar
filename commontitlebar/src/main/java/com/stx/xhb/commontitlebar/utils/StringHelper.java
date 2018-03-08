package com.stx.xhb.commontitlebar.utils;

import android.support.annotation.Nullable;

/**
 * @author jxnk25
 * @time 2017/11/29/029
 * @mail:xhb_199409@163.com
 * @github:https://github.com/xiaohaibin
 * @descibe: 字符串工具类
 */

public class StringHelper {

    public static boolean isNullOrEmpty(@Nullable CharSequence string) {
        return string == null || string.length() == 0;
    }

}
