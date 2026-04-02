package com.amazon.aps.iva.w2;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewSpline.java */
/* loaded from: classes.dex */
public abstract class c extends com.amazon.aps.iva.t2.j {

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setAlpha(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class b extends c {
        public final SparseArray<androidx.constraintlayout.widget.a> f;
        public float[] g;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f = sparseArray;
        }

        @Override // com.amazon.aps.iva.t2.j
        public final void b(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // com.amazon.aps.iva.t2.j
        public final void c(int i) {
            float[] fArr;
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f;
            int size = sparseArray.size();
            int c = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.g = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, c);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = sparseArray.keyAt(i2) * 0.01d;
                sparseArray.valueAt(i2).b(this.g);
                int i3 = 0;
                while (true) {
                    if (i3 < this.g.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = com.amazon.aps.iva.t2.b.a(i, dArr, dArr2);
        }

        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            this.a.d(f, this.g);
            com.amazon.aps.iva.w2.a.b(this.f.valueAt(0), view, this.g);
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: com.amazon.aps.iva.w2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0815c extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setElevation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class e extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setPivotX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class f extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setPivotY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class g extends c {
        public boolean f = false;

        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            Method method;
            if (view instanceof com.amazon.aps.iva.x2.o) {
                ((com.amazon.aps.iva.x2.o) view).setProgress(a(f));
            } else if (this.f) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f = true;
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

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class h extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class i extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class j extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class k extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class l extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class m extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class n extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class o extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
            view.setTranslationZ(a(f));
        }
    }

    public abstract void d(float f2, View view);

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // com.amazon.aps.iva.w2.c
        public final void d(float f, View view) {
        }
    }
}
