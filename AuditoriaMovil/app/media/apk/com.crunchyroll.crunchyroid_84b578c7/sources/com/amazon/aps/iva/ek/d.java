package com.amazon.aps.iva.ek;

import com.amazon.aps.iva.a6.o1;
import com.amazon.aps.iva.a6.t0;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.q5.e0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.s6.r;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerLoadControl.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.ek.a, t0 {
    public final t0 b;
    public com.amazon.aps.iva.xb0.a<Boolean> c = a.h;
    public final v0 d = x.e(Boolean.FALSE);

    /* compiled from: PlayerLoadControl.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public d(t0 t0Var) {
        this.b = t0Var;
    }

    @Override // com.amazon.aps.iva.ek.c
    public final v0 a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final void b() {
        this.b.b();
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final boolean c() {
        return this.b.c();
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final void d(r0 r0Var, e0 e0Var, o1[] o1VarArr, o0 o0Var, r[] rVarArr) {
        j.f(r0Var, "timeline");
        j.f(e0Var, "mediaPeriodId");
        j.f(o1VarArr, "renderers");
        j.f(o0Var, "trackGroups");
        j.f(rVarArr, "trackSelections");
        this.b.d(r0Var, e0Var, o1VarArr, o0Var, rVarArr);
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final long e() {
        return this.b.e();
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final void f() {
        this.b.f();
    }

    @Override // com.amazon.aps.iva.ek.c
    public final void g(com.amazon.aps.iva.jl.b bVar) {
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final com.amazon.aps.iva.t6.b i() {
        return this.b.i();
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final void k() {
        this.b.k();
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final boolean l(long j, long j2, float f) {
        boolean z;
        if (j2 > 0) {
            if (j >= (j + j2) - g0.Q(5000L)) {
                z = true;
            } else {
                z = false;
            }
            this.d.setValue(Boolean.valueOf(z));
            if (this.c.invoke().booleanValue() && this.b.l(j, j2, f)) {
                return true;
            }
            return false;
        }
        return this.b.l(j, j2, f);
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final boolean m(r0 r0Var, e0 e0Var, long j, float f, boolean z, long j2) {
        j.f(r0Var, "timeline");
        j.f(e0Var, "mediaPeriodId");
        return this.b.m(r0Var, e0Var, j, f, z, j2);
    }
}
