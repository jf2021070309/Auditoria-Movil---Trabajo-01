package com.amazon.aps.iva.gl;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.dl.a;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.t50.c;
/* compiled from: PlayerTapToSeekController.kt */
/* loaded from: classes2.dex */
public final class e implements c {
    public final com.amazon.aps.iva.hj.a a;
    public final v b;
    public final com.amazon.aps.iva.t50.c c;
    public long d;
    public long e;
    public j1 f;
    public c2 g;

    /* compiled from: PlayerTapToSeekController.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.playerview.seek.PlayerTapToSeekControllerImpl$stopSeekMode$1", f = "PlayerTapToSeekController.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
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
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                this.h = 1;
                if (com.amazon.aps.iva.ab.t.l(1000L, this) == aVar) {
                    return aVar;
                }
            }
            e eVar = e.this;
            eVar.b.V5();
            eVar.f = null;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e(com.amazon.aps.iva.hj.a aVar, w wVar) {
        c.b bVar = c.b.a;
        this.a = aVar;
        this.b = wVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.gl.c
    public final boolean a() {
        this.b.d();
        this.a.d();
        this.d = this.c.a();
        f();
        return true;
    }

    @Override // com.amazon.aps.iva.gl.c
    public final boolean b() {
        com.amazon.aps.iva.t50.c cVar = this.c;
        if (cVar.a() - this.d <= 1000) {
            this.d = cVar.a();
            this.a.d();
            this.b.d();
            f();
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.gl.c
    public final boolean c() {
        this.b.j();
        this.a.j();
        this.e = this.c.a();
        f();
        return true;
    }

    @Override // com.amazon.aps.iva.el.e0
    public final void d(a.C0199a c0199a) {
        c2 c2Var = this.g;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.g = com.amazon.aps.iva.se0.i.d(this.b.c6(), null, null, new d(this, c0199a, null), 3);
    }

    @Override // com.amazon.aps.iva.gl.c
    public final boolean e() {
        com.amazon.aps.iva.t50.c cVar = this.c;
        if (cVar.a() - this.e <= 1000) {
            this.e = cVar.a();
            this.a.j();
            this.b.j();
            f();
            return true;
        }
        return false;
    }

    public final void f() {
        c2 c2Var = this.g;
        if (c2Var != null) {
            c2Var.a(null);
        }
        j1 j1Var = this.f;
        if (j1Var != null) {
            j1Var.a(null);
        }
        this.f = com.amazon.aps.iva.se0.i.d(this.b.c6(), null, null, new a(null), 3);
    }
}
