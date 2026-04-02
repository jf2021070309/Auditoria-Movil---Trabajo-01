package com.amazon.aps.iva.y8;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public final class g extends Animation {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SwipeRefreshLayout d;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.d = swipeRefreshLayout;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        d dVar = this.d.A;
        int i = this.b;
        dVar.setAlpha((int) (((this.c - i) * f) + i));
    }
}
