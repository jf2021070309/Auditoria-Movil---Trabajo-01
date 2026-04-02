package com.amazon.aps.iva.y8;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public final class f extends Animation {
    public final /* synthetic */ SwipeRefreshLayout b;

    public f(SwipeRefreshLayout swipeRefreshLayout) {
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.b.setAnimationProgress(1.0f - f);
    }
}
