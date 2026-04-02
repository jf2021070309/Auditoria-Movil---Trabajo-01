package com.amazon.aps.iva.a80;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.viewpager2.widget.ViewPager2;
import com.amazon.aps.iva.kb0.q;
/* compiled from: ViewPagerTransitionAccelerator.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class f extends com.amazon.aps.iva.yb0.a implements com.amazon.aps.iva.xb0.a<q> {
    public f(ViewPager2 viewPager2) {
        super(0, viewPager2, ViewPager2.class, "beginFakeDrag", "beginFakeDrag()Z", 8);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        boolean z;
        com.amazon.aps.iva.h9.c cVar = ((ViewPager2) this.b).o;
        androidx.viewpager2.widget.c cVar2 = cVar.b;
        boolean z2 = false;
        if (cVar2.g == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            cVar.g = 0;
            cVar.f = 0;
            cVar.h = SystemClock.uptimeMillis();
            VelocityTracker velocityTracker = cVar.d;
            if (velocityTracker == null) {
                cVar.d = VelocityTracker.obtain();
                cVar.e = ViewConfiguration.get(cVar.a.getContext()).getScaledMaximumFlingVelocity();
            } else {
                velocityTracker.clear();
            }
            cVar2.f = 4;
            cVar2.G4(true);
            if (cVar2.g == 0) {
                z2 = true;
            }
            if (!z2) {
                cVar.c.stopScroll();
            }
            long j = cVar.h;
            MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
            cVar.d.addMovement(obtain);
            obtain.recycle();
        }
        return q.a;
    }
}
