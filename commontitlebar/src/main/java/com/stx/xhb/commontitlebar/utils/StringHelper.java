package com.stx.xhb.commontitlebar.utils;

import android.support.annotation.Nullable;
public class StringHelper {

    public static boolean isNullOrEmpty(@Nullable CharSequence string) {
        return string == null || string.length() == 0;
    }

}
