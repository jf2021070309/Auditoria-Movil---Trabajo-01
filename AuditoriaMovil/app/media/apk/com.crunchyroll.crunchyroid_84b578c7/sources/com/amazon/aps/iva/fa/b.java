package com.amazon.aps.iva.fa;

import android.graphics.PointF;
/* compiled from: DocumentData.java */
/* loaded from: classes.dex */
public final class b {
    public String a;
    public String b;
    public float c;
    public a d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    /* compiled from: DocumentData.java */
    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f, a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = aVar;
        this.e = i;
        this.f = f2;
        this.g = f3;
        this.h = i2;
        this.i = i3;
        this.j = f4;
        this.k = z;
        this.l = pointF;
        this.m = pointF2;
    }

    public final int hashCode() {
        String str = this.b;
        int ordinal = ((this.d.ordinal() + (((int) (com.amazon.aps.iva.c80.a.b(str, this.a.hashCode() * 31, 31) + this.c)) * 31)) * 31) + this.e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.h;
    }

    public b() {
    }
}
