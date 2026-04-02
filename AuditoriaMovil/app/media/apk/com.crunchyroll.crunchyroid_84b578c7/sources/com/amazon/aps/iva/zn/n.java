package com.amazon.aps.iva.zn;

import android.animation.ValueAnimator;
import com.facebook.shimmer.ShimmerFrameLayout;
/* compiled from: Shimmer.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ShimmerFrameLayout, com.amazon.aps.iva.kb0.q> {
    public static final n h = new n();

    public n() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(ShimmerFrameLayout shimmerFrameLayout) {
        boolean z;
        ShimmerFrameLayout shimmerFrameLayout2 = shimmerFrameLayout;
        com.amazon.aps.iva.yb0.j.f(shimmerFrameLayout2, "it");
        com.amazon.aps.iva.b80.b bVar = shimmerFrameLayout2.c;
        ValueAnimator valueAnimator = bVar.e;
        if (valueAnimator != null) {
            if (valueAnimator != null && valueAnimator.isStarted()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && bVar.getCallback() != null) {
                bVar.e.start();
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
