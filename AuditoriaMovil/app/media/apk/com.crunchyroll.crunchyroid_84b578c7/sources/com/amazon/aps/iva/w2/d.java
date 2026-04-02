package com.amazon.aps.iva.w2;

import android.util.SparseArray;
import android.view.View;
import com.amazon.aps.iva.x2.o;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: ViewTimeCycle.java */
/* loaded from: classes.dex */
public abstract class d extends com.amazon.aps.iva.t2.l {

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setAlpha(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class b extends d {
        public final String k;
        public final SparseArray<androidx.constraintlayout.widget.a> l;
        public final SparseArray<float[]> m = new SparseArray<>();
        public float[] n;
        public float[] o;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.k = str.split(",")[1];
            this.l = sparseArray;
        }

        @Override // com.amazon.aps.iva.t2.l
        public final void b(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // com.amazon.aps.iva.t2.l
        public final void c(int i) {
            float[] fArr;
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.l;
            int size = sparseArray.size();
            int c = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            int i2 = c + 2;
            this.n = new float[i2];
            this.o = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = sparseArray.keyAt(i3);
                float[] valueAt = this.m.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                sparseArray.valueAt(i3).b(this.n);
                int i4 = 0;
                while (true) {
                    if (i4 < this.n.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[c] = valueAt[0];
                dArr3[c + 1] = valueAt[1];
            }
            this.a = com.amazon.aps.iva.t2.b.a(i, dArr, dArr2);
        }

        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            boolean z;
            this.a.d(f, this.n);
            float[] fArr = this.n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float n = eVar.n(view, this.k);
                this.j = n;
                if (Float.isNaN(n)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.j) % 1.0d);
            this.j = f4;
            this.i = j;
            float a = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.o;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.h;
                float f5 = this.n[i];
                if (f5 != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.h = z2 | z;
                fArr2[i] = (f5 * a) + f3;
                i++;
            }
            com.amazon.aps.iva.w2.a.b(this.l.valueAt(0), view, this.o);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class c extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setElevation(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* renamed from: com.amazon.aps.iva.w2.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0816d extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        public boolean k = false;

        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            Method method;
            if (view instanceof o) {
                ((o) view).setProgress(d(f, j, view, eVar));
            } else if (this.k) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.k = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(d(f, j, view, eVar)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class f extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setRotation(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class g extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setRotationX(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class h extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setRotationY(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class i extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setScaleX(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class j extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setScaleY(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class k extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setTranslationX(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class l extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setTranslationY(d(f, j, view, eVar));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class m extends d {
        @Override // com.amazon.aps.iva.w2.d
        public final boolean e(float f, long j, View view, com.amazon.aps.iva.p0.e eVar) {
            view.setTranslationZ(d(f, j, view, eVar));
            return this.h;
        }
    }

    public final float d(float f2, long j2, View view, com.amazon.aps.iva.p0.e eVar) {
        float[] fArr = this.g;
        this.a.d(f2, fArr);
        boolean z = true;
        float f3 = fArr[1];
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float n = eVar.n(view, this.f);
            this.j = n;
            if (Float.isNaN(n)) {
                this.j = 0.0f;
            }
        }
        float f4 = (float) (((((j2 - this.i) * 1.0E-9d) * f3) + this.j) % 1.0d);
        this.j = f4;
        String str = this.f;
        HashMap hashMap = (HashMap) eVar.b;
        if (!hashMap.containsKey(view)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, new float[]{f4});
            hashMap.put(view, hashMap2);
        } else {
            HashMap hashMap3 = (HashMap) hashMap.get(view);
            if (hashMap3 == null) {
                hashMap3 = new HashMap();
            }
            if (!hashMap3.containsKey(str)) {
                hashMap3.put(str, new float[]{f4});
                hashMap.put(view, hashMap3);
            } else {
                float[] fArr2 = (float[]) hashMap3.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f4;
                hashMap3.put(str, fArr2);
            }
        }
        this.i = j2;
        float f5 = fArr[0];
        float a2 = (a(this.j) * f5) + fArr[2];
        if (f5 == 0.0f && i2 == 0) {
            z = false;
        }
        this.h = z;
        return a2;
    }

    public abstract boolean e(float f2, long j2, View view, com.amazon.aps.iva.p0.e eVar);
}
