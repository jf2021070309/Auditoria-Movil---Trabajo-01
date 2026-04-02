package com.amazon.aps.iva.w2;

import android.view.View;
import com.amazon.aps.iva.x2.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewOscillator.java */
/* loaded from: classes.dex */
public abstract class b extends com.amazon.aps.iva.t2.e {

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class a extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setAlpha(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* renamed from: com.amazon.aps.iva.w2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0814b extends b {
        public final float[] g = new float[1];
        public androidx.constraintlayout.widget.a h;

        @Override // com.amazon.aps.iva.t2.e
        public final void b(androidx.constraintlayout.widget.a aVar) {
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            float a = a(f);
            float[] fArr = this.g;
            fArr[0] = a;
            com.amazon.aps.iva.w2.a.b(this.h, view, fArr);
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setElevation(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class e extends b {
        public boolean g = false;

        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            Method method;
            if (view instanceof o) {
                ((o) view).setProgress(a(f));
            } else if (this.g) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.g = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class f extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class g extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class h extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class i extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class j extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class k extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class l extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class m extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
            view.setTranslationZ(a(f));
        }
    }

    public abstract void d(float f2, View view);

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class d extends b {
        @Override // com.amazon.aps.iva.w2.b
        public final void d(float f, View view) {
        }
    }
}
