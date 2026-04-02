package com.amazon.aps.iva.q;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public final class j0 {
    public static final int[] a = {16842912};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final boolean a;
        public static final Method b;
        public static final Field c;
        public static final Field d;
        public static final Field e;
        public static final Field f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = r0
                goto L49
            L2d:
                r7 = r1
                goto L47
            L2f:
                r6 = r1
                goto L46
            L31:
                r6 = r1
                goto L46
            L33:
                r6 = r1
                goto L46
            L35:
                r5 = r1
                goto L3d
            L37:
                r5 = r1
                goto L41
            L39:
                r5 = r1
                goto L45
            L3b:
                r4 = r1
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r1
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r1
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r1
                r8 = r2
            L49:
                if (r8 == 0) goto L58
                com.amazon.aps.iva.q.j0.a.b = r4
                com.amazon.aps.iva.q.j0.a.c = r5
                com.amazon.aps.iva.q.j0.a.d = r6
                com.amazon.aps.iva.q.j0.a.e = r7
                com.amazon.aps.iva.q.j0.a.f = r3
                com.amazon.aps.iva.q.j0.a.a = r0
                goto L64
            L58:
                com.amazon.aps.iva.q.j0.a.b = r1
                com.amazon.aps.iva.q.j0.a.c = r1
                com.amazon.aps.iva.q.j0.a.d = r1
                com.amazon.aps.iva.q.j0.a.e = r1
                com.amazon.aps.iva.q.j0.a.f = r1
                com.amazon.aps.iva.q.j0.a.a = r2
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.j0.a.<clinit>():void");
        }
    }

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(b);
            } else {
                drawable.setState(a);
            }
            drawable.setState(state);
        }
    }

    public static Rect b(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Insets a2 = b.a(drawable);
            i = a2.left;
            i2 = a2.top;
            i3 = a2.right;
            i4 = a2.bottom;
            return new Rect(i, i2, i3, i4);
        }
        Drawable d = com.amazon.aps.iva.h3.a.d(drawable);
        if (i5 < 29) {
            if (a.a) {
                try {
                    Object invoke = a.b.invoke(d, new Object[0]);
                    if (invoke != null) {
                        return new Rect(a.c.getInt(invoke), a.d.getInt(invoke), a.e.getInt(invoke), a.f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z = a.a;
        }
        return c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
