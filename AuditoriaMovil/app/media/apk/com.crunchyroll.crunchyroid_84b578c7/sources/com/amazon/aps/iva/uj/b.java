package com.amazon.aps.iva.uj;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.tj.i;
import com.amazon.aps.iva.tj.k;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.l;
/* compiled from: VideoPlayerController.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.uj.a {
    public final com.amazon.aps.iva.oj.a a;
    public final l0 b;
    public final g0<j> c;
    public final com.amazon.aps.iva.xb0.a<q> d;
    public final com.amazon.aps.iva.xb0.a<q> e;
    public final com.amazon.aps.iva.xb0.a<q> f;

    /* compiled from: VideoPlayerController.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<j, j> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(j jVar) {
            com.amazon.aps.iva.yb0.j.f(jVar, "$this$set");
            return new j(0);
        }
    }

    /* compiled from: VideoPlayerController.kt */
    /* renamed from: com.amazon.aps.iva.uj.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0767b extends l implements com.amazon.aps.iva.xb0.l<j, j> {
        public static final C0767b h = new C0767b();

        public C0767b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(j jVar) {
            j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            return j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, 4193791);
        }
    }

    /* compiled from: VideoPlayerController.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<j, j> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(j jVar) {
            j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            return j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, 4193791);
        }
    }

    public b(com.amazon.aps.iva.oj.a aVar, l0 l0Var, v0 v0Var, i iVar, com.amazon.aps.iva.tj.j jVar, k kVar) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "state");
        this.a = aVar;
        this.b = l0Var;
        this.c = v0Var;
        this.d = iVar;
        this.e = jVar;
        this.f = kVar;
    }

    public static String g() {
        return com.amazon.aps.iva.uj.a.class.getSimpleName();
    }

    @Override // com.amazon.aps.iva.uj.a
    public final void a() {
        l0 l0Var = this.b;
        if (l0Var.K() != null) {
            i.C(this.c, c.h);
        }
        l0Var.c(0L);
        l0Var.b();
        this.a.b(g(), e.g.a);
    }

    @Override // com.amazon.aps.iva.uj.a
    public final void b() {
        l0 l0Var = this.b;
        if (l0Var.h() == 4) {
            l0Var.c(0L);
        }
        l0Var.L(true);
        if (l0Var.K() != null) {
            i.C(this.c, C0767b.h);
            l0Var.L(true);
            l0Var.g();
        }
        this.a.b(g(), e.g.a);
    }

    @Override // com.amazon.aps.iva.uj.a
    public final void c(long j) {
        this.b.c(j);
        this.a.b(g(), new e.n(j));
    }

    @Override // com.amazon.aps.iva.uj.a
    public final void d() {
        this.b.d();
        this.a.b(g(), e.m.a);
    }

    @Override // com.amazon.aps.iva.uj.a
    public final void e() {
        this.d.invoke();
        l0 l0Var = this.b;
        l0Var.N();
        l0Var.L(true);
        this.e.invoke();
    }

    @Override // com.amazon.aps.iva.uj.a
    public final void f() {
        l0 l0Var = this.b;
        l0Var.L(false);
        l0Var.q();
        i.C(this.c, a.h);
        this.f.invoke();
    }

    public final void h() {
        l0 l0Var = this.b;
        l0Var.q();
        l0Var.stop();
        this.a.b(g(), e.o.a);
    }

    @Override // com.amazon.aps.iva.uj.a
    public final void j() {
        this.b.T0();
        this.a.b(g(), e.l.a);
    }

    @Override // com.amazon.aps.iva.uj.a
    public final void pause() {
        this.b.L(false);
        this.a.b(g(), e.f.a);
    }
}
