package com.amazon.aps.iva.fl;

import android.annotation.SuppressLint;
import android.view.ScaleGestureDetector;
import com.amazon.aps.iva.el.g0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PinchToZoomController.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final l<Integer, q> a;
    public float b;
    public boolean c;

    public b(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        j.f(scaleGestureDetector, "detector");
        this.b = scaleGestureDetector.getScaleFactor();
        this.c = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        j.f(scaleGestureDetector, "detector");
        this.c = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        j.f(scaleGestureDetector, "detector");
        int i = (this.b > 1.0f ? 1 : (this.b == 1.0f ? 0 : -1));
        l<Integer, q> lVar = this.a;
        if (i > 0) {
            lVar.invoke(4);
        } else {
            lVar.invoke(0);
        }
    }
}
