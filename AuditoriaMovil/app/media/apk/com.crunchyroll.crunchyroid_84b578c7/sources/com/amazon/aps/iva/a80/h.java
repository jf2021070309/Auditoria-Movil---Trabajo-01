package com.amazon.aps.iva.a80;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.b0;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
/* compiled from: ViewPagerTransitionAccelerator.kt */
/* loaded from: classes2.dex */
public final class h implements j {
    public final ViewPager2 b;
    public final TabLayout c;
    public final long d;
    public final AccelerateDecelerateInterpolator e;
    public final i f;

    public h(ViewPager2 viewPager2, TabLayout tabLayout) {
        com.amazon.aps.iva.yb0.j.f(viewPager2, "viewPager");
        com.amazon.aps.iva.yb0.j.f(tabLayout, "tabLayout");
        this.b = viewPager2;
        this.c = tabLayout;
        this.d = 250L;
        this.e = new AccelerateDecelerateInterpolator();
        this.f = new i(this);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.g.b(tabLayout)) {
            int tabCount = tabLayout.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabLayout.Tab tabAt = tabLayout.getTabAt(i);
                com.amazon.aps.iva.yb0.j.c(tabAt);
                View customView = tabAt.getCustomView();
                if (customView == null) {
                    customView = tabAt.view;
                }
                customView.setOnTouchListener(new b(new e(this, i)));
            }
            return;
        }
        tabLayout.addOnAttachStateChangeListener(new d(tabLayout, this));
    }

    @Override // com.amazon.aps.iva.a80.j
    public final void N7(int i) {
        final ViewPager2 viewPager2 = this.b;
        if (!viewPager2.o.b.n) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, (i - viewPager2.getCurrentItem()) * viewPager2.getWidth());
            final b0 b0Var = new b0();
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.aps.iva.a80.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    boolean z;
                    int i2;
                    float f;
                    float f2;
                    b0 b0Var2 = b0.this;
                    com.amazon.aps.iva.yb0.j.f(b0Var2, "$previousValue");
                    ViewPager2 viewPager22 = viewPager2;
                    com.amazon.aps.iva.yb0.j.f(viewPager22, "$this_switchTabTo");
                    com.amazon.aps.iva.yb0.j.f(valueAnimator, "valueAnimator");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    com.amazon.aps.iva.yb0.j.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) animatedValue).intValue();
                    float f3 = intValue - b0Var2.b;
                    Context context = viewPager22.getContext();
                    com.amazon.aps.iva.yb0.j.e(context, "context");
                    if (!q.f(context)) {
                        f3 *= -1;
                    }
                    com.amazon.aps.iva.h9.c cVar = viewPager22.o;
                    if (cVar.b.n) {
                        float f4 = cVar.f - f3;
                        cVar.f = f4;
                        int round = Math.round(f4 - cVar.g);
                        cVar.g += round;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (cVar.a.getOrientation() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i2 = round;
                        } else {
                            i2 = 0;
                        }
                        if (z) {
                            round = 0;
                        }
                        if (z) {
                            f = cVar.f;
                        } else {
                            f = 0.0f;
                        }
                        if (z) {
                            f2 = 0.0f;
                        } else {
                            f2 = cVar.f;
                        }
                        cVar.c.scrollBy(i2, round);
                        MotionEvent obtain = MotionEvent.obtain(cVar.h, uptimeMillis, 2, f, f2, 0);
                        cVar.d.addMovement(obtain);
                        obtain.recycle();
                    }
                    b0Var2.b = intValue;
                }
            });
            ofInt.addListener(new a(new f(viewPager2), new g(viewPager2)));
            ofInt.setInterpolator(this.e);
            ofInt.setDuration(this.d);
            ofInt.start();
        }
    }
}
