package com.amazon.aps.iva.jl;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: CellularController.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.jl.a {
    public final com.amazon.aps.iva.ek.c b;
    public final g0 c;
    public final com.amazon.aps.iva.cj.h d;
    public final q e;
    public final com.amazon.aps.iva.ql.f f;
    public final com.amazon.aps.iva.ql.d g;
    public final v<Boolean> h;

    /* compiled from: CellularController.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.streamovercellular.CellularControllerImpl$enableStreamOverCellularAndPlay$1", f = "CellularController.kt", l = {95}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = d.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.ql.d dVar2 = dVar.g;
                this.h = 1;
                if (dVar2.d(true, this) == aVar) {
                    return aVar;
                }
            }
            dVar.d.a().b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public d(com.amazon.aps.iva.ek.a aVar, g0 g0Var, com.amazon.aps.iva.cj.h hVar, q qVar, com.amazon.aps.iva.ql.f fVar, com.amazon.aps.iva.ql.d dVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "player");
        this.b = aVar;
        this.c = g0Var;
        this.d = hVar;
        this.e = qVar;
        this.f = fVar;
        this.g = dVar;
        this.h = new v<>();
        aVar.g(new b(this));
        com.amazon.aps.iva.dg.b.A(g0Var, new a0(aVar.a(), new c(this, null)));
    }

    public final boolean a() {
        boolean z;
        q qVar = this.e;
        if (qVar.b() && qVar.c()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return ((Boolean) this.f.e().d()).booleanValue();
    }

    @Override // com.amazon.aps.iva.jl.a
    public final v o2() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
        v<Boolean> vVar = this.h;
        if (com.amazon.aps.iva.yb0.j.a(vVar.d(), Boolean.TRUE) && z && a()) {
            this.d.a().b();
            vVar.k(Boolean.FALSE);
        }
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }

    @Override // com.amazon.aps.iva.jl.a
    public final void u5(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        if (!a() && ((Boolean) this.b.a().getValue()).booleanValue()) {
            this.h.k(Boolean.TRUE);
        } else {
            aVar.invoke();
        }
    }

    @Override // com.amazon.aps.iva.jl.a
    public final void x0() {
        com.amazon.aps.iva.se0.i.d(this.c, null, null, new a(null), 3);
    }
}
