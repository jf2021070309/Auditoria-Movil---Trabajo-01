package com.amazon.aps.iva.g3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.amazon.aps.iva.f3.d;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
public class j extends o {
    public static Class<?> a;
    public static Constructor<?> b;
    public static Method c;
    public static Method d;
    public static boolean e;

    public static boolean f(boolean z, String str, int i, Object obj) {
        g();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // com.amazon.aps.iva.g3.o
    public Typeface a(Context context, d.c cVar, Resources resources, int i) {
        d.C0238d[] c0238dArr;
        g();
        try {
            Object newInstance = b.newInstance(new Object[0]);
            for (d.C0238d c0238d : cVar.a) {
                File d2 = p.d(context);
                if (d2 == null) {
                    return null;
                }
                try {
                    if (!p.b(d2, resources, c0238d.f)) {
                        return null;
                    }
                    if (!f(c0238d.c, d2.getPath(), c0238d.b, newInstance)) {
                        return null;
                    }
                    d2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d2.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
