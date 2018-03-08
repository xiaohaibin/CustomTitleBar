package com.stx.xhb.commontitlebar.utils;

import android.graphics.Paint;;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.annotation.ColorInt;
public class UIDrawableHelper {

    /**
     * 动态创建带上分隔线或下分隔线的Drawable。
     *
     * @param separatorColor 分割线颜色。
     * @param bgColor        Drawable 的背景色。
     * @param top            true 则分割线为上分割线，false 则为下分割线。
     * @param separatorHeight
     * @return 返回所创建的 Drawable。
     */
    public static LayerDrawable createItemSeparatorBg(@ColorInt int separatorColor, @ColorInt int bgColor, int separatorHeight, boolean top) {

        ShapeDrawable separator = new ShapeDrawable();
        separator.getPaint().setStyle(Paint.Style.FILL);
        separator.getPaint().setColor(separatorColor);

        ShapeDrawable bg = new ShapeDrawable();
        bg.getPaint().setStyle(Paint.Style.FILL);
        bg.getPaint().setColor(bgColor);

        Drawable[] layers = {separator, bg};
        LayerDrawable layerDrawable = new LayerDrawable(layers);

        layerDrawable.setLayerInset(1, 0, top ? separatorHeight : 0, 0, top ? 0 : separatorHeight);
        return layerDrawable;
    }

}
