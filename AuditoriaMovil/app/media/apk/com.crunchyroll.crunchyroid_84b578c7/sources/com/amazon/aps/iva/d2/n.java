package com.amazon.aps.iva.d2;

import android.os.Build;
import android.text.StaticLayout;
/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
public final class n implements z {
    @Override // com.amazon.aps.iva.d2.z
    public StaticLayout a(a0 a0Var) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(a0Var.a, a0Var.b, a0Var.c, a0Var.d, a0Var.e);
        obtain.setTextDirection(a0Var.f);
        obtain.setAlignment(a0Var.g);
        obtain.setMaxLines(a0Var.h);
        obtain.setEllipsize(a0Var.i);
        obtain.setEllipsizedWidth(a0Var.j);
        obtain.setLineSpacing(a0Var.l, a0Var.k);
        obtain.setIncludePad(a0Var.n);
        obtain.setBreakStrategy(a0Var.p);
        obtain.setHyphenationFrequency(a0Var.s);
        obtain.setIndents(a0Var.t, a0Var.u);
        int i = Build.VERSION.SDK_INT;
        o.a(obtain, a0Var.m);
        if (i >= 28) {
            q.a(obtain, a0Var.o);
        }
        if (i >= 33) {
            x.b(obtain, a0Var.q, a0Var.r);
        }
        StaticLayout build = obtain.build();
        com.amazon.aps.iva.yb0.j.e(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
