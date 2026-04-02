package com.facebook.ads.internal.q.a;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class v {
    public static final DisplayMetrics a = Resources.getSystem().getDisplayMetrics();
    public static final float b = a.density;
    private static final AtomicInteger c = new AtomicInteger(1);

    public static int a() {
        int i;
        int i2;
        do {
            i = c.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!c.compareAndSet(i, i2));
        return i;
    }

    public static int a(int i) {
        return (int) TypedValue.applyDimension(2, i, a);
    }

    public static void a(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setId(View.generateViewId());
        } else {
            view.setId(a());
        }
    }

    public static void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void a(View... viewArr) {
        for (View view : viewArr) {
            b(view);
        }
    }

    public static void b(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }
}
