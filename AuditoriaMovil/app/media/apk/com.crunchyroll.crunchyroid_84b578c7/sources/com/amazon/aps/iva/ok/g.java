package com.amazon.aps.iva.ok;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.qj.h;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.tj.m0;
import com.amazon.aps.iva.tj.n0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SubtitlesTextTrackController.kt */
/* loaded from: classes.dex */
public final class g implements f {
    public final g0 b;
    public final com.amazon.aps.iva.xb0.a<Long> c;
    public final int d;
    public final int e;
    public final com.amazon.aps.iva.xb0.a<q> f;
    public com.amazon.aps.iva.oj.a g;
    public c2 h;
    public boolean i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public l0 k;

    /* compiled from: SubtitlesTextTrackController.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.text.SubtitlesTextTrackControllerImpl$startSubtitlesRendering$1", f = "SubtitlesTextTrackController.kt", l = {109}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
            do {
                gVar = g.this;
                if (gVar.j.get()) {
                    gVar.I(new e.a.c(gVar.G()));
                    this.h = 1;
                } else {
                    return q.a;
                }
            } while (t.l(1000 / gVar.d, this) != aVar);
            return aVar;
        }
    }

    public g(g0 g0Var, m0 m0Var, int i, int i2, n0 n0Var) {
        this.b = g0Var;
        this.c = m0Var;
        this.d = i;
        this.e = i2;
        this.f = n0Var;
    }

    public final long G() {
        return this.c.invoke().longValue() + this.e;
    }

    public final void I(e.a aVar) {
        com.amazon.aps.iva.oj.a aVar2 = this.g;
        if (aVar2 != null) {
            aVar2.b(f.class.getSimpleName(), aVar);
        }
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void J(int i) {
        if (i == 3) {
            I(new e.a.c(G()));
        }
    }

    public final void K() {
        I(new e.a.c(G()));
        this.j.set(true);
        c2 c2Var = this.h;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.h = com.amazon.aps.iva.se0.i.d(this.b, null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void O(l0 l0Var, l0.b bVar) {
        j.f(l0Var, "player");
        if (this.k == null) {
            this.k = l0Var;
        }
    }

    @Override // com.amazon.aps.iva.ok.f
    public final void a() {
        I(e.a.C0622e.a);
        this.j.set(false);
        this.i = false;
        this.f.invoke();
    }

    @Override // com.amazon.aps.iva.ok.f
    public final void f(h hVar) {
        I(new e.a.f(((com.amazon.aps.iva.qj.g) hVar).b));
        I(new e.a.c(G()));
        K();
        this.i = true;
    }

    @Override // com.amazon.aps.iva.ok.f
    public final void p0(com.amazon.aps.iva.oj.a aVar) {
        this.g = aVar;
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void s0(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z && this.i) {
            l0 l0Var = this.k;
            if (l0Var != null && !l0Var.o()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                K();
                return;
            }
        }
        this.j.set(false);
        l0 l0Var2 = this.k;
        if (l0Var2 == null || !l0Var2.o()) {
            z3 = false;
        }
        if (z3) {
            I(new e.a.c(-1L));
        }
    }
}
