package com.amazon.aps.iva.zn;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: Shimmer.kt */
/* loaded from: classes2.dex */
public final class p {
    public static final void a(int i, int i2, com.amazon.aps.iva.o0.i iVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.p pVar) {
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(579958715);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.v(pVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            Context context = (Context) g.i(androidx.compose.ui.platform.d.b);
            g.s(-492369756);
            Object e0 = g.e0();
            ShimmerFrameLayout shimmerFrameLayout = e0;
            if (e0 == i.a.a) {
                ShimmerFrameLayout shimmerFrameLayout2 = new ShimmerFrameLayout(context);
                ComposeView composeView = new ComposeView(context, null, 6);
                composeView.setContent(pVar);
                shimmerFrameLayout2.addView(composeView);
                g.K0(shimmerFrameLayout2);
                shimmerFrameLayout = shimmerFrameLayout2;
            }
            g.U(false);
            com.amazon.aps.iva.p2.d.a(new m((ShimmerFrameLayout) shimmerFrameLayout), fVar, n.h, g, ((i3 << 3) & 112) | 384, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new o(i, i2, fVar, pVar);
        }
    }
}
