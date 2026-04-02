package com.amazon.aps.iva.x2;

import android.view.animation.Interpolator;
/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public final class v implements Interpolator {
    public final /* synthetic */ com.amazon.aps.iva.t2.c a;

    public v(com.amazon.aps.iva.t2.c cVar) {
        this.a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.a.a(f);
    }
}
