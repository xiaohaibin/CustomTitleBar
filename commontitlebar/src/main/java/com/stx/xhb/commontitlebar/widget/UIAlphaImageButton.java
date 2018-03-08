package com.stx.xhb.commontitlebar.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;

public class UIAlphaImageButton extends AppCompatImageButton {

    private UIAlphaViewHelper mAlphaViewHelper;

    public UIAlphaImageButton(Context context) {
        super(context);
    }

    public UIAlphaImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UIAlphaImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private UIAlphaViewHelper getAlphaViewHelper() {
        if (mAlphaViewHelper == null) {
            mAlphaViewHelper = new UIAlphaViewHelper(this);
        }
        return mAlphaViewHelper;
    }

    @Override
    public void setPressed(boolean pressed) {
        super.setPressed(pressed);
        getAlphaViewHelper().onPressedChanged(this, pressed);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        getAlphaViewHelper().onEnabledChanged(this, enabled);
    }

    /**
     * 设置是否要在 press 时改变透明度
     *
     * @param changeAlphaWhenPress 是否要在 press 时改变透明度
     */
    public void setChangeAlphaWhenPress(boolean changeAlphaWhenPress) {
        getAlphaViewHelper().setChangeAlphaWhenPress(changeAlphaWhenPress);
    }

    /**
     * 设置是否要在 disabled 时改变透明度
     *
     * @param changeAlphaWhenDisable 是否要在 disabled 时改变透明度
     */
    public void setChangeAlphaWhenDisable(boolean changeAlphaWhenDisable) {
        getAlphaViewHelper().setChangeAlphaWhenDisable(changeAlphaWhenDisable);
    }

}
