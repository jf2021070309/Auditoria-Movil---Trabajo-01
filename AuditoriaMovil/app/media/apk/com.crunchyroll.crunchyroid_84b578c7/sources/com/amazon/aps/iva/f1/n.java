package com.amazon.aps.iva.f1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: AndroidPathMeasure.android.kt */
/* loaded from: classes.dex */
public final class n implements o0 {
    public final PathMeasure a;

    public n(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // com.amazon.aps.iva.f1.o0
    public final float a() {
        return this.a.getLength();
    }

    @Override // com.amazon.aps.iva.f1.o0
    public final void b(m mVar) {
        Path path;
        if (mVar != null) {
            path = mVar.a;
        } else {
            path = null;
        }
        this.a.setPath(path, false);
    }

    @Override // com.amazon.aps.iva.f1.o0
    public final boolean c(float f, float f2, m0 m0Var) {
        com.amazon.aps.iva.yb0.j.f(m0Var, FirebaseAnalytics.Param.DESTINATION);
        if (m0Var instanceof m) {
            return this.a.getSegment(f, f2, ((m) m0Var).a, true);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
