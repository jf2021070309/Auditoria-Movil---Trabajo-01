package com.amazon.aps.iva.a0;

import android.view.View;
import android.widget.Magnifier;
/* compiled from: PlatformMagnifier.kt */
/* loaded from: classes.dex */
public final class s1 implements r1 {
    public static final s1 a = new s1();

    /* compiled from: PlatformMagnifier.kt */
    /* loaded from: classes.dex */
    public static class a implements q1 {
        public final Magnifier a;

        public a(Magnifier magnifier) {
            this.a = magnifier;
        }

        @Override // com.amazon.aps.iva.a0.q1
        public final long a() {
            Magnifier magnifier = this.a;
            return com.amazon.aps.iva.o2.k.a(magnifier.getWidth(), magnifier.getHeight());
        }

        @Override // com.amazon.aps.iva.a0.q1
        public void b(long j, long j2, float f) {
            this.a.show(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j));
        }

        @Override // com.amazon.aps.iva.a0.q1
        public final void c() {
            this.a.update();
        }

        @Override // com.amazon.aps.iva.a0.q1
        public final void dismiss() {
            this.a.dismiss();
        }
    }

    @Override // com.amazon.aps.iva.a0.r1
    public final q1 a(f1 f1Var, View view, com.amazon.aps.iva.o2.c cVar, float f) {
        com.amazon.aps.iva.yb0.j.f(f1Var, "style");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        return new a(new Magnifier(view));
    }

    @Override // com.amazon.aps.iva.a0.r1
    public final boolean b() {
        return false;
    }
}
