package com.amazon.aps.iva.f1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: CanvasUtils.android.kt */
/* loaded from: classes.dex */
public final class v {
    public static Method a;
    public static Method b;
    public static boolean c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(Canvas canvas, boolean z) {
        Method method;
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            w.a.a(canvas, z);
            return;
        }
        if (!c) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        if (z) {
            try {
                Method method4 = a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = b) != null) {
            method.invoke(canvas, new Object[0]);
        }
    }
}
