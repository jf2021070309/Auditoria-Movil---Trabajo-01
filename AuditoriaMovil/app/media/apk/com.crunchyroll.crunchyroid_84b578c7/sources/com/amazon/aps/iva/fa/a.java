package com.amazon.aps.iva.fa;

import android.annotation.SuppressLint;
import android.graphics.PointF;
/* compiled from: CubicCurveData.java */
/* loaded from: classes.dex */
public final class a {
    public final PointF a;
    public final PointF b;
    public final PointF c;

    public a() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        PointF pointF = this.c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}
