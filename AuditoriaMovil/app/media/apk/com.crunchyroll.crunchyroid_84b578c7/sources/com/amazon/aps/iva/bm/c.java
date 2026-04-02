package com.amazon.aps.iva.bm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import java.io.IOException;
import java.util.LinkedHashSet;
/* compiled from: ProfilesCachingStrategy.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.bm.a, g0<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.em.b>> {
    public final com.amazon.aps.iva.se0.g0 b;
    public final com.amazon.aps.iva.am.d c;
    public final com.amazon.aps.iva.t50.c d;
    public final /* synthetic */ v0 e;
    public c2 f;

    /* compiled from: ProfilesCachingStrategy.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.data.strategies.ProfilesCachingStrategyImpl$refresh$1", f = "ProfilesCachingStrategy.kt", l = {74}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public c h;
        public c i;
        public c j;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            IOException e;
            c cVar2;
            c cVar3;
            com.amazon.aps.iva.ez.g aVar;
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.k;
            if (i != 0) {
                if (i == 1) {
                    cVar2 = this.j;
                    cVar3 = this.i;
                    cVar = this.h;
                    try {
                        x.i0(obj);
                    } catch (IOException e2) {
                        e = e2;
                        aVar = new g.a(null, e);
                        cVar3 = cVar;
                        cVar3.getClass();
                        cVar3.e.setValue(aVar);
                        return q.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                c cVar4 = c.this;
                try {
                    com.amazon.aps.iva.am.d dVar = cVar4.c;
                    this.h = cVar4;
                    this.i = cVar4;
                    this.j = cVar4;
                    this.k = 1;
                    Object a = dVar.a(this);
                    if (a == aVar2) {
                        return aVar2;
                    }
                    cVar2 = cVar4;
                    cVar = cVar2;
                    obj = a;
                    cVar3 = cVar;
                } catch (IOException e3) {
                    cVar = cVar4;
                    e = e3;
                    aVar = new g.a(null, e);
                    cVar3 = cVar;
                    cVar3.getClass();
                    cVar3.e.setValue(aVar);
                    return q.a;
                }
            }
            aVar = new g.c(obj, Long.valueOf(cVar2.d.a()));
            cVar3.getClass();
            cVar3.e.setValue(aVar);
            return q.a;
        }
    }

    public c(com.amazon.aps.iva.am.e eVar, RefreshTokenMonitor refreshTokenMonitor, com.amazon.aps.iva.t50.c cVar, com.amazon.aps.iva.xe0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(refreshTokenMonitor, "tokenMonitor");
        this.b = dVar;
        this.c = eVar;
        this.d = cVar;
        this.e = x.e(new g.b(null));
        new LinkedHashSet();
        com.amazon.aps.iva.dg.b.A(dVar, new a0(com.amazon.aps.iva.dg.b.m(new e(new d(refreshTokenMonitor.getRefreshTokenState()))), new b(this, null)));
    }

    @Override // com.amazon.aps.iva.ve0.f0, com.amazon.aps.iva.ve0.g
    public final Object a(Object obj, com.amazon.aps.iva.ob0.d dVar) {
        this.e.setValue((com.amazon.aps.iva.ez.g) obj);
        return q.a;
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final boolean b(Object obj) {
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) obj;
        com.amazon.aps.iva.yb0.j.f(gVar, "value");
        this.e.setValue(gVar);
        return true;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.ez.g<com.amazon.aps.iva.em.b>> gVar, com.amazon.aps.iva.ob0.d<?> dVar) {
        return this.e.c(gVar, dVar);
    }

    public final void d(long j) {
        g.c cVar;
        long j2;
        Long l;
        v0 v0Var = this.e;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) v0Var.getValue();
        if (gVar instanceof g.c) {
            cVar = (g.c) gVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (l = cVar.b) != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        if (j <= this.d.a() - j2) {
            v0Var.setValue(new g.b(null));
            c2 c2Var = this.f;
            if (c2Var != null) {
                c2Var.a(null);
            }
            this.f = com.amazon.aps.iva.se0.i.d(this.b, null, null, new a(null), 3);
        }
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final u0<Integer> f() {
        return this.e.f();
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final void g() {
        this.e.g();
        throw null;
    }

    @Override // com.amazon.aps.iva.ve0.u0, com.amazon.aps.iva.ve0.g0
    public final com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.em.b> getValue() {
        return (com.amazon.aps.iva.ez.g) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.ve0.g0
    public final void setValue(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.em.b> gVar) {
        com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.em.b> gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "<set-?>");
        this.e.setValue(gVar2);
    }
}
