package com.amazon.aps.iva.a80;

import android.view.VelocityTracker;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.c;
import com.amazon.aps.iva.kb0.q;
/* compiled from: ViewPagerTransitionAccelerator.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class g extends com.amazon.aps.iva.yb0.a implements com.amazon.aps.iva.xb0.a<q> {
    public g(ViewPager2 viewPager2) {
        super(0, viewPager2, ViewPager2.class, "endFakeDrag", "endFakeDrag()Z", 8);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        boolean z;
        int[] calculateDistanceToFinalSnap;
        int i;
        com.amazon.aps.iva.h9.c cVar = ((ViewPager2) this.b).o;
        androidx.viewpager2.widget.c cVar2 = cVar.b;
        boolean z2 = cVar2.n;
        if (z2) {
            if (cVar2.g == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z || z2) {
                cVar2.n = false;
                cVar2.H6();
                c.a aVar = cVar2.h;
                if (aVar.c == 0) {
                    int i2 = aVar.a;
                    if (i2 != cVar2.i) {
                        cVar2.G(i2);
                    }
                    cVar2.b1(0);
                    cVar2.U2();
                } else {
                    cVar2.b1(2);
                }
            }
            VelocityTracker velocityTracker = cVar.d;
            velocityTracker.computeCurrentVelocity(1000, cVar.e);
            if (!cVar.c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                ViewPager2 viewPager2 = cVar.a;
                View findSnapView = viewPager2.l.findSnapView(viewPager2.h);
                if (findSnapView != null && ((i = (calculateDistanceToFinalSnap = viewPager2.l.calculateDistanceToFinalSnap(viewPager2.h, findSnapView))[0]) != 0 || calculateDistanceToFinalSnap[1] != 0)) {
                    viewPager2.k.smoothScrollBy(i, calculateDistanceToFinalSnap[1]);
                }
            }
        }
        return q.a;
    }
}
