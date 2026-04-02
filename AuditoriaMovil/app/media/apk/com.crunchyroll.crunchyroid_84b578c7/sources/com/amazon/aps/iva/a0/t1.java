package com.amazon.aps.iva.a0;

import android.view.View;
import android.widget.Magnifier;
import com.amazon.aps.iva.a0.s1;
/* compiled from: PlatformMagnifier.kt */
/* loaded from: classes.dex */
public final class t1 implements r1 {
    public static final t1 a = new t1();

    /* compiled from: PlatformMagnifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends s1.a {
        @Override // com.amazon.aps.iva.a0.s1.a, com.amazon.aps.iva.a0.q1
        public final void b(long j, long j2, float f) {
            boolean isNaN = Float.isNaN(f);
            Magnifier magnifier = this.a;
            if (!isNaN) {
                magnifier.setZoom(f);
            }
            if (com.amazon.aps.iva.e1.d.h(j2)) {
                magnifier.show(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j), com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.c.d(j2));
            } else {
                magnifier.show(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j));
            }
        }
    }

    @Override // com.amazon.aps.iva.a0.r1
    public final q1 a(f1 f1Var, View view, com.amazon.aps.iva.o2.c cVar, float f) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(f1Var, "style");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        if (com.amazon.aps.iva.yb0.j.a(f1Var, f1.h)) {
            return new a(new Magnifier(view));
        }
        long b1 = cVar.b1(f1Var.b);
        float P0 = cVar.P0(f1Var.c);
        float P02 = cVar.P0(f1Var.d);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (b1 != com.amazon.aps.iva.e1.g.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            builder.setSize(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(b1)), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(b1)));
        }
        if (!Float.isNaN(P0)) {
            builder.setCornerRadius(P0);
        }
        if (!Float.isNaN(P02)) {
            builder.setElevation(P02);
        }
        if (!Float.isNaN(f)) {
            builder.setInitialZoom(f);
        }
        builder.setClippingEnabled(f1Var.e);
        Magnifier build = builder.build();
        com.amazon.aps.iva.yb0.j.e(build, "Builder(view).run {\n    …    build()\n            }");
        return new a(build);
    }

    @Override // com.amazon.aps.iva.a0.r1
    public final boolean b() {
        return true;
    }
}
