package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class b {
    public final float[] a = new float[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4476b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    public int f4477c;

    /* renamed from: d  reason: collision with root package name */
    public int f4478d;

    /* renamed from: e  reason: collision with root package name */
    public int f4479e;

    /* renamed from: f  reason: collision with root package name */
    public int f4480f;

    /* renamed from: g  reason: collision with root package name */
    public int f4481g;

    /* renamed from: h  reason: collision with root package name */
    public int f4482h;

    /* renamed from: i  reason: collision with root package name */
    public float f4483i;

    /* renamed from: j  reason: collision with root package name */
    public float f4484j;

    /* renamed from: k  reason: collision with root package name */
    public float f4485k;

    /* renamed from: l  reason: collision with root package name */
    public float f4486l;

    /* renamed from: m  reason: collision with root package name */
    public float f4487m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4488n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public long s;
    public long t;

    /* loaded from: classes.dex */
    public static class a extends AbstractC0097b<a> {
        public a() {
            this.a.p = true;
        }

        @Override // com.facebook.shimmer.b.AbstractC0097b
        public a c() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0097b<T extends AbstractC0097b<T>> {
        public final b a = new b();

        public b a() {
            b bVar = this.a;
            int i2 = bVar.f4480f;
            if (i2 != 1) {
                int[] iArr = bVar.f4476b;
                int i3 = bVar.f4479e;
                iArr[0] = i3;
                int i4 = bVar.f4478d;
                iArr[1] = i4;
                iArr[2] = i4;
                iArr[3] = i3;
            } else {
                int[] iArr2 = bVar.f4476b;
                int i5 = bVar.f4478d;
                iArr2[0] = i5;
                iArr2[1] = i5;
                int i6 = bVar.f4479e;
                iArr2[2] = i6;
                iArr2[3] = i6;
            }
            if (i2 != 1) {
                bVar.a[0] = Math.max(((1.0f - bVar.f4485k) - bVar.f4486l) / 2.0f, 0.0f);
                bVar.a[1] = Math.max(((1.0f - bVar.f4485k) - 0.001f) / 2.0f, 0.0f);
                bVar.a[2] = Math.min(((bVar.f4485k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                bVar.a[3] = Math.min(((bVar.f4485k + 1.0f) + bVar.f4486l) / 2.0f, 1.0f);
            } else {
                float[] fArr = bVar.a;
                fArr[0] = 0.0f;
                fArr[1] = Math.min(bVar.f4485k, 1.0f);
                bVar.a[2] = Math.min(bVar.f4485k + bVar.f4486l, 1.0f);
                bVar.a[3] = 1.0f;
            }
            return this.a;
        }

        public T b(TypedArray typedArray) {
            if (typedArray.hasValue(3)) {
                this.a.f4488n = typedArray.getBoolean(3, this.a.f4488n);
                c();
            }
            if (typedArray.hasValue(0)) {
                this.a.o = typedArray.getBoolean(0, this.a.o);
                c();
            }
            if (typedArray.hasValue(1)) {
                b bVar = this.a;
                bVar.f4479e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (bVar.f4479e & 16777215);
                c();
            }
            if (typedArray.hasValue(11)) {
                b bVar2 = this.a;
                bVar2.f4478d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & bVar2.f4478d);
                c();
            }
            if (typedArray.hasValue(7)) {
                long j2 = typedArray.getInt(7, (int) this.a.s);
                if (j2 < 0) {
                    throw new IllegalArgumentException(e.a.d.a.a.h("Given a negative duration: ", j2));
                }
                this.a.s = j2;
                c();
            }
            if (typedArray.hasValue(14)) {
                this.a.q = typedArray.getInt(14, this.a.q);
                c();
            }
            if (typedArray.hasValue(15)) {
                long j3 = typedArray.getInt(15, (int) this.a.t);
                if (j3 < 0) {
                    throw new IllegalArgumentException(e.a.d.a.a.h("Given a negative repeat delay: ", j3));
                }
                this.a.t = j3;
                c();
            }
            if (typedArray.hasValue(16)) {
                this.a.r = typedArray.getInt(16, this.a.r);
                c();
            }
            if (typedArray.hasValue(5)) {
                int i2 = typedArray.getInt(5, this.a.f4477c);
                if (i2 == 1) {
                    d(1);
                } else if (i2 == 2) {
                    d(2);
                } else if (i2 != 3) {
                    d(0);
                } else {
                    d(3);
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, this.a.f4480f) != 1) {
                    this.a.f4480f = 0;
                    c();
                } else {
                    this.a.f4480f = 1;
                    c();
                }
            }
            if (typedArray.hasValue(6)) {
                float f2 = typedArray.getFloat(6, this.a.f4486l);
                if (f2 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f2);
                }
                this.a.f4486l = f2;
                c();
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, this.a.f4481g);
                if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException(e.a.d.a.a.e("Given invalid width: ", dimensionPixelSize));
                }
                this.a.f4481g = dimensionPixelSize;
                c();
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, this.a.f4482h);
                if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException(e.a.d.a.a.e("Given invalid height: ", dimensionPixelSize2));
                }
                this.a.f4482h = dimensionPixelSize2;
                c();
            }
            if (typedArray.hasValue(13)) {
                float f3 = typedArray.getFloat(13, this.a.f4485k);
                if (f3 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f3);
                }
                this.a.f4485k = f3;
                c();
            }
            if (typedArray.hasValue(19)) {
                float f4 = typedArray.getFloat(19, this.a.f4483i);
                if (f4 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f4);
                }
                this.a.f4483i = f4;
                c();
            }
            if (typedArray.hasValue(10)) {
                float f5 = typedArray.getFloat(10, this.a.f4484j);
                if (f5 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f5);
                }
                this.a.f4484j = f5;
                c();
            }
            if (typedArray.hasValue(18)) {
                this.a.f4487m = typedArray.getFloat(18, this.a.f4487m);
                c();
            }
            return c();
        }

        public abstract T c();

        public T d(int i2) {
            this.a.f4477c = i2;
            return c();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends AbstractC0097b<c> {
        public c() {
            this.a.p = false;
        }

        @Override // com.facebook.shimmer.b.AbstractC0097b
        public c b(TypedArray typedArray) {
            super.b(typedArray);
            if (typedArray.hasValue(2)) {
                int color = typedArray.getColor(2, this.a.f4479e);
                b bVar = this.a;
                bVar.f4479e = (color & 16777215) | (bVar.f4479e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                this.a.f4478d = typedArray.getColor(12, this.a.f4478d);
            }
            return this;
        }

        @Override // com.facebook.shimmer.b.AbstractC0097b
        public c c() {
            return this;
        }
    }

    public b() {
        new RectF();
        this.f4477c = 0;
        this.f4478d = -1;
        this.f4479e = 1291845631;
        this.f4480f = 0;
        this.f4481g = 0;
        this.f4482h = 0;
        this.f4483i = 1.0f;
        this.f4484j = 1.0f;
        this.f4485k = 0.0f;
        this.f4486l = 0.5f;
        this.f4487m = 20.0f;
        this.f4488n = true;
        this.o = true;
        this.p = true;
        this.q = -1;
        this.r = 1;
        this.s = 1000L;
    }
}
