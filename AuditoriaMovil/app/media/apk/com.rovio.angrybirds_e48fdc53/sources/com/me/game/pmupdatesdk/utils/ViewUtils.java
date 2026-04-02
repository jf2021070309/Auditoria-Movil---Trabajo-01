package com.me.game.pmupdatesdk.utils;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes7.dex */
public class ViewUtils {
    public static final int[] STATE_SELECTED = {16842913};
    public static final int[] STATE_PRESSED = {16842910, 16842919};
    public static final int[] STATE_CHECK_AND_SEL = {16842912, 16842919};
    public static final int[] STATE_CHECK = {16842912};
    public static final int[] STATE_SEL = {16842919};
    public static final int[] STATE_NONE = new int[0];
    public static final int[] STATE_NORMAL = new int[0];
    public static int mColorFilter = 805306368;

    public static void setColorFilter(ImageView view) {
        setColorFilter(view.getDrawable(), view.isPressed());
    }

    public static void setColorFilter(Drawable drawable, boolean filter) {
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
        if (filter) {
            drawable.setColorFilter(mColorFilter, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
