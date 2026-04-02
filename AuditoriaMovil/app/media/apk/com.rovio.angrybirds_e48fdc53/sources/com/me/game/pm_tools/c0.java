package com.me.game.pm_tools;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes5.dex */
public class c0 {
    public static final int[] a = {16842913};
    public static final int[] b = {16842910, 16842919};
    public static final int[] c = {16842912, 16842919};
    public static final int[] d = {16842912};
    public static final int[] e = {16842919};
    public static final int[] f = new int[0];
    public static final int[] g = new int[0];
    public static int h = 805306368;

    public static void a(Drawable drawable, boolean z) {
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
        if (z) {
            drawable.setColorFilter(h, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static void b(ImageView imageView) {
        a(imageView.getDrawable(), imageView.isPressed());
    }
}
