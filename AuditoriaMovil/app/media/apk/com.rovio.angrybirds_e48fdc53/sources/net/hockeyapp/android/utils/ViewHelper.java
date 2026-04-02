package net.hockeyapp.android.utils;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
/* loaded from: classes4.dex */
public class ViewHelper {
    public static Drawable getGradient() {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, 0});
    }
}
