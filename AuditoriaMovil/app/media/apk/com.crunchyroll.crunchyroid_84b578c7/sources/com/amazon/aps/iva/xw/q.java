package com.amazon.aps.iva.xw;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.TypedValue;
/* compiled from: ContextExtensions.kt */
/* loaded from: classes2.dex */
public final class q {
    public static final Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final float b(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static final int c(int i, Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "<this>");
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    public static final int d(int i, Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        if (typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            com.amazon.aps.iva.yb0.j.e(obtainStyledAttributes, "theme.obtainStyledAttrib…s(intArrayOf(value.data))");
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            obtainStyledAttributes.recycle();
            return dimensionPixelOffset;
        }
        return context.getResources().getDimensionPixelOffset(i);
    }

    public static final int e(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "<this>");
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final boolean f(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "<this>");
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
