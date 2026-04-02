package com.amazon.aps.iva.q;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.amazon.aps.iva.p3.g0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class m1 {
    public static final Method a;
    public static final boolean b;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        b = z;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, com.amazon.aps.iva.p3.r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        if (g0.e.d(view) == 1) {
            return true;
        }
        return false;
    }
}
