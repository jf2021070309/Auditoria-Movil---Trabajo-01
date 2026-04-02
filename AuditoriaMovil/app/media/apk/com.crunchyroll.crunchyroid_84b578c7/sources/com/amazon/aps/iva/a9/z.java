package com.amazon.aps.iva.a9;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.WeakHashMap;
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class z {
    public static final i0 a;
    public static final a b;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(z.a.n(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float floatValue = f.floatValue();
            z.a.o(floatValue, view);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            return g0.f.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            g0.f.c(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new j0();
        } else {
            a = new i0();
        }
        b = new a();
        new b();
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.r(view, i, i2, i3, i4);
    }
}
