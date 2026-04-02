package com.amazon.aps.iva.c5;

import android.view.animation.Interpolator;
import com.amazon.aps.iva.e4.t0;
/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {
    public final float[] a;
    public final float b;

    public d(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = fArr[min];
        return t0.a(fArr[min + 1], f3, (f - (min * f2)) / f2, f3);
    }
}
