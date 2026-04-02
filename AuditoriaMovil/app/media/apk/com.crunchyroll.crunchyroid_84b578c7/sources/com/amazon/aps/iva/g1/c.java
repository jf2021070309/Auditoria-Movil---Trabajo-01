package com.amazon.aps.iva.g1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: ColorSpace.kt */
/* loaded from: classes.dex */
public abstract class c {
    public final String a;
    public final long b;
    public final int c;

    public c(int i, long j, String str) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i >= -1 && i <= 63) {
                return;
            }
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
        throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i);

    public abstract float c(int i);

    public boolean d() {
        return false;
    }

    public long e(float f, float f2, float f3) {
        float[] f4 = f(new float[]{f, f2, f3});
        return (Float.floatToIntBits(f4[0]) << 32) | (Float.floatToIntBits(f4[1]) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.c != cVar.c || !com.amazon.aps.iva.yb0.j.a(this.a, cVar.a)) {
            return false;
        }
        return b.a(this.b, cVar.b);
    }

    public abstract float[] f(float[] fArr);

    public float g(float f, float f2, float f3) {
        return f(new float[]{f, f2, f3})[2];
    }

    public long h(float f, float f2, float f3, float f4, c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "colorSpace");
        int i = b.e;
        float[] fArr = new float[(int) (this.b >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] a = a(fArr);
        return defpackage.i.b(a[0], a[1], a[2], f4, cVar);
    }

    public int hashCode() {
        int i = b.e;
        return com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) b.b(this.b)) + ')';
    }
}
