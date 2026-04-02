package com.amazon.aps.iva.cj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.dj.a;
import com.amazon.aps.iva.ml.f;
import com.amazon.aps.iva.o0.d2;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.tj.q0;
import com.amazon.aps.iva.ve0.q0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.x50.q;
import com.crunchyroll.octopussubtitlescomponent.renderrer.OctopusSubtitlesView;
import com.crunchyroll.player.LifecycleCallbackHandler;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
import com.crunchyroll.player.truex.TruexManagerImpl;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlayerImpl.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes.dex */
public final class s implements h {
    public final com.amazon.aps.iva.ye.f a;
    public final m b;
    public final com.amazon.aps.iva.xb0.a<String> c;
    public final com.amazon.aps.iva.cj.b d;
    public final com.crunchyroll.connectivity.d e;
    public final a0 f;
    public final com.amazon.aps.iva.t50.c g;
    public final String h;
    public final y i;
    public com.amazon.aps.iva.xe0.d j;
    public ExoplayerComponent k;
    public com.amazon.aps.iva.ij.n l;
    public com.amazon.aps.iva.wi.a m;
    public com.amazon.aps.iva.rk.b n;
    public final LifecycleCallbackHandler o;
    public final v0 p;
    public final com.amazon.aps.iva.i5.v<Boolean> q;
    public final com.amazon.aps.iva.i5.v<Boolean> r;
    public com.amazon.aps.iva.ij.g s;
    public final com.amazon.aps.iva.hj.c t;
    public com.amazon.aps.iva.jl.a u;
    public final h0 v;
    public com.amazon.aps.iva.gj.a w;

    /* compiled from: PlayerImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.PlayerImpl$init$1", f = "PlayerImpl.kt", l = {173}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        /* compiled from: PlayerImpl.kt */
        /* renamed from: com.amazon.aps.iva.cj.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0177a implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.nk.j> {
            public final /* synthetic */ s b;

            public C0177a(s sVar) {
                this.b = sVar;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(com.amazon.aps.iva.nk.j jVar, com.amazon.aps.iva.ob0.d dVar) {
                this.b.p.setValue(jVar);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                s sVar = s.this;
                ExoplayerComponent exoplayerComponent = sVar.k;
                com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
                u0<com.amazon.aps.iva.nk.j> o = exoplayerComponent.o();
                C0177a c0177a = new C0177a(sVar);
                this.h = 1;
                if (((com.amazon.aps.iva.ve0.i0) o).c(c0177a, this) == aVar) {
                    return aVar;
                }
            }
            throw new com.amazon.aps.iva.la.a();
        }
    }

    /* compiled from: PlayerImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.ij.o i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.ij.o oVar) {
            super(0);
            this.i = oVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            s sVar = s.this;
            a0 a0Var = sVar.f;
            com.amazon.aps.iva.xe0.d dVar = sVar.j;
            if (dVar != null) {
                ExoplayerComponent exoplayerComponent = sVar.k;
                com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
                com.amazon.aps.iva.uj.d dVar2 = exoplayerComponent.y;
                if (dVar2 != null) {
                    com.amazon.aps.iva.ij.o oVar = this.i;
                    ExoplayerComponent exoplayerComponent2 = sVar.k;
                    com.amazon.aps.iva.yb0.j.c(exoplayerComponent2);
                    com.amazon.aps.iva.ve0.i0 h = com.amazon.aps.iva.dg.b.h(exoplayerComponent2.C);
                    com.amazon.aps.iva.k.w wVar = com.amazon.aps.iva.lh.f.b;
                    if (wVar != null) {
                        a0Var.a(dVar, dVar2, oVar, h, wVar);
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    com.amazon.aps.iva.yb0.j.m("fallbackProvider");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("settingsController");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("coroutineScope");
            throw null;
        }
    }

    /* compiled from: PlayerImpl.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.rk.d, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.gj.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.gj.a aVar) {
            super(1);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.rk.d dVar) {
            com.amazon.aps.iva.rk.d dVar2 = dVar;
            com.amazon.aps.iva.yb0.j.f(dVar2, "$this$playerEngine");
            s sVar = s.this;
            ExoplayerComponent exoplayerComponent = sVar.k;
            com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
            com.amazon.aps.iva.gj.a aVar = this.i;
            dVar2.a(exoplayerComponent, new t(sVar, aVar));
            com.amazon.aps.iva.ij.n nVar = sVar.l;
            com.amazon.aps.iva.yb0.j.c(nVar);
            com.amazon.aps.iva.rk.c cVar = com.amazon.aps.iva.rk.c.h;
            dVar2.a(nVar, cVar);
            dVar2.a(new com.amazon.aps.iva.ej.a(0), cVar);
            dVar2.a(new com.amazon.aps.iva.nj.b(), cVar);
            boolean z = aVar.b;
            dVar2.a(new com.amazon.aps.iva.dj.n(new com.amazon.aps.iva.dj.k(a.C0197a.a, com.amazon.aps.iva.ds.c.b, z)), cVar);
            com.amazon.aps.iva.wi.a aVar2 = sVar.m;
            com.amazon.aps.iva.yb0.j.c(aVar2);
            dVar2.a(aVar2, cVar);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public s(com.amazon.aps.iva.ye.f fVar, m mVar, o oVar, com.amazon.aps.iva.cj.c cVar, com.crunchyroll.connectivity.d dVar, String str, y yVar) {
        com.amazon.aps.iva.ql.g gVar = com.amazon.aps.iva.ql.g.g;
        if (gVar != null) {
            g0 g0Var = new g0(gVar);
            c.b bVar = c.b.a;
            com.amazon.aps.iva.yb0.j.f(fVar, "castStateProvider");
            com.amazon.aps.iva.yb0.j.f(mVar, "playerConfiguration");
            com.amazon.aps.iva.yb0.j.f(yVar, "playerLoggerFactory");
            this.a = fVar;
            this.b = mVar;
            this.c = oVar;
            this.d = cVar;
            this.e = dVar;
            this.f = g0Var;
            this.g = bVar;
            this.h = str;
            this.i = yVar;
            this.o = new LifecycleCallbackHandler(this);
            this.p = com.amazon.aps.iva.ab.x.e(new com.amazon.aps.iva.nk.j(0));
            Boolean bool = Boolean.FALSE;
            this.q = new com.amazon.aps.iva.i5.v<>(bool);
            this.r = new com.amazon.aps.iva.i5.v<>(bool);
            this.t = new com.amazon.aps.iva.hj.c(new r(this), new q(this));
            this.v = new h0(new w(this));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final boolean N() {
        return ((com.amazon.aps.iva.nk.j) this.p.getValue()).m.b;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final void O(boolean z) {
        if (!this.a.isTryingToCast()) {
            ExoplayerComponent exoplayerComponent = this.k;
            com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
            defpackage.i.C(exoplayerComponent.k, new com.amazon.aps.iva.tj.x(z));
            com.amazon.aps.iva.rk.b bVar = this.n;
            if (bVar != null) {
                com.amazon.aps.iva.rk.d dVar = bVar.c;
                if (dVar.a) {
                    ArrayList arrayList = dVar.b;
                    for (com.amazon.aps.iva.fj.f fVar : com.amazon.aps.iva.lb0.x.X0(arrayList)) {
                        fVar.getClass();
                        com.amazon.aps.iva.oj.a aVar = bVar.b;
                        com.amazon.aps.iva.yb0.j.f(aVar, "eventBus");
                        fVar.b = aVar;
                        com.amazon.aps.iva.se0.g0 g0Var = bVar.a;
                        if (g0Var != null) {
                            com.amazon.aps.iva.se0.i.d(g0Var, null, null, new com.amazon.aps.iva.fj.d(fVar, null), 3);
                        } else {
                            com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.z.i(com.amazon.aps.iva.a60.b.f()), null, null, new com.amazon.aps.iva.fj.e(fVar, null), 3);
                        }
                    }
                    for (com.amazon.aps.iva.fj.f fVar2 : com.amazon.aps.iva.lb0.x.X0(arrayList)) {
                        fVar2.init();
                    }
                    bVar.d.invoke();
                }
            }
            this.q.k(Boolean.TRUE);
        }
    }

    @Override // com.amazon.aps.iva.cj.i
    public final com.amazon.aps.iva.i5.v P() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final com.amazon.aps.iva.hj.c Q() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final void R(com.amazon.aps.iva.ij.o oVar, com.amazon.aps.iva.gj.a aVar, com.amazon.aps.iva.ij.g gVar, Context context) {
        Throwable th;
        com.amazon.aps.iva.jl.a fVar;
        com.amazon.aps.iva.yb0.j.f(oVar, "playerDataSource");
        com.amazon.aps.iva.yb0.j.f(gVar, "contentAvailabilityProvider");
        this.w = aVar;
        this.s = gVar;
        com.amazon.aps.iva.xe0.d i = com.amazon.aps.iva.e.z.i(com.amazon.aps.iva.wu.b.c);
        this.j = i;
        k kVar = n.d;
        if (kVar != null) {
            PlayService playService = kVar.getPlayService();
            com.amazon.aps.iva.yb0.j.f(playService, "playService");
            com.amazon.aps.iva.vj.h hVar = new com.amazon.aps.iva.vj.h(playService);
            com.amazon.aps.iva.vj.c cVar = new com.amazon.aps.iva.vj.c(context, this.b.b());
            com.amazon.aps.iva.ql.g gVar2 = com.amazon.aps.iva.ql.g.g;
            if (gVar2 != null) {
                com.amazon.aps.iva.vj.e eVar = new com.amazon.aps.iva.vj.e(hVar, aVar.a);
                com.amazon.aps.iva.jb0.a a2 = com.amazon.aps.iva.wa0.a.a(new com.amazon.aps.iva.xj.a(new com.amazon.aps.iva.vj.a(eVar)));
                com.amazon.aps.iva.jb0.a a3 = com.amazon.aps.iva.wa0.a.a(new com.amazon.aps.iva.xj.b(new com.amazon.aps.iva.vj.b(eVar)));
                k kVar2 = n.d;
                if (kVar2 != null) {
                    CrunchyrollApplication g = kVar2.g();
                    if (g != null) {
                        this.k = new ExoplayerComponent(g, i, new com.amazon.aps.iva.nk.j(0), new com.amazon.aps.iva.nk.i(((Boolean) gVar2.d().d()).booleanValue(), com.amazon.aps.iva.dg.b.I((com.amazon.aps.iva.rl.a) gVar2.j().d()), (String) gVar2.g().d(), ((Boolean) gVar2.i().d()).booleanValue(), 6), new com.amazon.aps.iva.bo.e(), new com.amazon.aps.iva.ff0.b(), cVar.a(), new com.amazon.aps.iva.p0.e(new com.amazon.aps.iva.yj.a((com.amazon.aps.iva.ak.a) a2.get(), (com.amazon.aps.iva.ak.c) a3.get(), new com.amazon.aps.iva.ak.b(new com.amazon.aps.iva.vj.d(eVar)), new d2(new com.amazon.aps.iva.vj.d(eVar)), new com.amazon.aps.iva.p0.e((com.amazon.aps.iva.zj.e) new com.amazon.aps.iva.vj.d(eVar)), new com.amazon.aps.iva.j9.i0((com.amazon.aps.iva.zj.e) new com.amazon.aps.iva.vj.d(eVar)))), new com.amazon.aps.iva.a0.k());
                        com.amazon.aps.iva.xe0.d dVar = this.j;
                        if (dVar != null) {
                            com.amazon.aps.iva.se0.i.d(dVar, null, null, new a(null), 3);
                            this.l = new com.amazon.aps.iva.ij.n(oVar);
                            com.amazon.aps.iva.xe0.d dVar2 = this.j;
                            if (dVar2 != null) {
                                this.m = new com.amazon.aps.iva.wi.a(dVar2);
                                com.amazon.aps.iva.xe0.d dVar3 = this.j;
                                if (dVar3 != null) {
                                    b bVar = new b(oVar);
                                    c cVar2 = new c(aVar);
                                    com.amazon.aps.iva.oj.b bVar2 = new com.amazon.aps.iva.oj.b(dVar3);
                                    com.amazon.aps.iva.rk.d dVar4 = new com.amazon.aps.iva.rk.d();
                                    cVar2.invoke(dVar4);
                                    this.n = new com.amazon.aps.iva.rk.b(dVar3, bVar2, dVar4, bVar);
                                    com.amazon.aps.iva.xe0.d dVar5 = this.j;
                                    if (dVar5 != null) {
                                        ExoplayerComponent exoplayerComponent = this.k;
                                        com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
                                        com.amazon.aps.iva.ek.a aVar2 = (com.amazon.aps.iva.ek.a) exoplayerComponent.O.getValue();
                                        k kVar3 = n.d;
                                        if (kVar3 != null) {
                                            CrunchyrollApplication g2 = kVar3.g();
                                            com.amazon.aps.iva.yb0.j.f(g2, "context");
                                            if (q.a.a == null) {
                                                q.a.a = new com.amazon.aps.iva.x50.r(g2);
                                            }
                                            com.amazon.aps.iva.x50.r rVar = q.a.a;
                                            com.amazon.aps.iva.yb0.j.c(rVar);
                                            com.amazon.aps.iva.ql.g gVar3 = com.amazon.aps.iva.ql.g.g;
                                            if (gVar3 != null) {
                                                k kVar4 = n.d;
                                                if (kVar4 != null) {
                                                    com.amazon.aps.iva.pm.b a4 = kVar4.b().a();
                                                    com.amazon.aps.iva.yb0.j.f(a4, "userProfileInteractor");
                                                    com.amazon.aps.iva.ql.g gVar4 = com.amazon.aps.iva.ql.g.g;
                                                    if (gVar4 != null) {
                                                        com.amazon.aps.iva.ql.e eVar2 = new com.amazon.aps.iva.ql.e(gVar4, f.a.a(), a4);
                                                        com.amazon.aps.iva.yb0.j.f(aVar2, "loadControl");
                                                        if (aVar.b) {
                                                            th = null;
                                                            fVar = new com.amazon.aps.iva.jl.d(aVar2, dVar5, this, rVar, gVar3, eVar2);
                                                        } else {
                                                            th = null;
                                                            fVar = new com.amazon.aps.iva.jl.f();
                                                        }
                                                        this.u = fVar;
                                                        this.e.a(fVar);
                                                        this.r.k(Boolean.TRUE);
                                                        ExoplayerComponent exoplayerComponent2 = this.k;
                                                        com.amazon.aps.iva.yb0.j.c(exoplayerComponent2);
                                                        u0<com.amazon.aps.iva.nk.j> o = exoplayerComponent2.o();
                                                        ExoplayerComponent exoplayerComponent3 = this.k;
                                                        com.amazon.aps.iva.yb0.j.c(exoplayerComponent3);
                                                        com.amazon.aps.iva.ve0.i0 n = exoplayerComponent3.n();
                                                        ExoplayerComponent exoplayerComponent4 = this.k;
                                                        com.amazon.aps.iva.yb0.j.c(exoplayerComponent4);
                                                        com.amazon.aps.iva.ve0.i0 h = com.amazon.aps.iva.dg.b.h(exoplayerComponent4.C);
                                                        com.amazon.aps.iva.xe0.d dVar6 = this.j;
                                                        if (dVar6 != null) {
                                                            this.i.a((com.amazon.aps.iva.ve0.i0) o, n, h, dVar6);
                                                            com.amazon.aps.iva.xe0.d dVar7 = this.j;
                                                            if (dVar7 != null) {
                                                                new g(this.p, dVar7);
                                                                return;
                                                            } else {
                                                                com.amazon.aps.iva.yb0.j.m("coroutineScope");
                                                                throw th;
                                                            }
                                                        }
                                                        com.amazon.aps.iva.yb0.j.m("coroutineScope");
                                                        throw th;
                                                    }
                                                    com.amazon.aps.iva.yb0.j.m("instance");
                                                    throw null;
                                                }
                                                com.amazon.aps.iva.yb0.j.m("dependencies");
                                                throw null;
                                            }
                                            com.amazon.aps.iva.yb0.j.m("instance");
                                            throw null;
                                        }
                                        com.amazon.aps.iva.yb0.j.m("dependencies");
                                        throw null;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("coroutineScope");
                                    throw null;
                                }
                                com.amazon.aps.iva.yb0.j.m("coroutineScope");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("coroutineScope");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("coroutineScope");
                        throw null;
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final ExoplayerComponent S() {
        ExoplayerComponent exoplayerComponent = this.k;
        com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
        return exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final long T() {
        return ((com.amazon.aps.iva.nk.j) this.p.getValue()).c;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final void U(androidx.lifecycle.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "lifecycle");
        gVar.addObserver(this.o);
    }

    @Override // com.amazon.aps.iva.cj.i
    public final com.amazon.aps.iva.ij.n V() {
        com.amazon.aps.iva.ij.n nVar = this.l;
        com.amazon.aps.iva.yb0.j.c(nVar);
        return nVar;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final com.amazon.aps.iva.hj.c a() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final h0 b() {
        return this.v;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final com.amazon.aps.iva.gj.a c() {
        return this.w;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final u d() {
        return new u(this.p);
    }

    @Override // com.amazon.aps.iva.cj.h
    public final com.amazon.aps.iva.ij.g e() {
        com.amazon.aps.iva.ij.g gVar = this.s;
        if (gVar != null) {
            return gVar;
        }
        com.amazon.aps.iva.yb0.j.m("_contentAvailabilityProvider");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final void f(FrameLayout frameLayout) {
        ExoplayerComponent exoplayerComponent = this.k;
        com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
        com.amazon.aps.iva.rj.b bVar = exoplayerComponent.r;
        if (bVar != null) {
            bVar.f = frameLayout;
        }
    }

    @Override // com.amazon.aps.iva.cj.h
    public final com.amazon.aps.iva.ve0.i0 g() {
        ExoplayerComponent exoplayerComponent = this.k;
        com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
        return exoplayerComponent.n();
    }

    @Override // com.amazon.aps.iva.cj.h
    public final v0 getState() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final void h(androidx.media3.ui.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "view");
        ExoplayerComponent exoplayerComponent = this.k;
        com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
        exoplayerComponent.s.b = dVar;
        exoplayerComponent.q = dVar;
        dVar.setControllerHideDuringAds(true);
        androidx.media3.ui.d dVar2 = exoplayerComponent.q;
        if (dVar2 != null) {
            dVar2.setPlayer(exoplayerComponent.p);
        }
        com.amazon.aps.iva.rj.b bVar = exoplayerComponent.r;
        TruexManagerImpl truexManagerImpl = null;
        if (bVar != null) {
            com.amazon.aps.iva.mf0.a.a.a("PlayerView Set", new Object[0]);
            bVar.l = dVar;
            com.amazon.aps.iva.yl.d dVar3 = bVar.d;
            if (dVar3 != null) {
                Context context = dVar.getContext();
                com.amazon.aps.iva.a6.m mVar = bVar.i;
                com.amazon.aps.iva.kk.a aVar = bVar.b;
                truexManagerImpl = dVar3.a(context, mVar, bVar, new com.amazon.aps.iva.yl.b(aVar.a, aVar.c), bVar.c, dVar);
            }
            bVar.g = truexManagerImpl;
            androidx.media3.ui.d dVar4 = exoplayerComponent.q;
            if (dVar4 != null) {
                dVar4.setBackgroundColor(Math.abs(0));
            }
            m0 m0Var = exoplayerComponent.p;
            if (m0Var != null) {
                ((com.amazon.aps.iva.lk.a) exoplayerComponent.I.getValue()).c(dVar, m0Var, com.amazon.aps.iva.cq.b.p0((com.amazon.aps.iva.nk.j) ((com.amazon.aps.iva.ve0.i0) exoplayerComponent.o()).getValue()), new com.amazon.aps.iva.tj.b0(exoplayerComponent));
            }
            exoplayerComponent.w.c(q0.PLAYER_VIEW);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("adsHelper");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final List<com.amazon.aps.iva.kk.b> i() {
        String str;
        Uri uri;
        ExoplayerComponent exoplayerComponent = this.k;
        com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
        com.amazon.aps.iva.b8.q qVar = exoplayerComponent.m;
        if (qVar != null) {
            l0 a2 = qVar.a();
            com.amazon.aps.iva.yb0.j.e(a2, "mediaSession.player");
            ArrayList v = com.amazon.aps.iva.aq.j.v(a2);
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(v));
            Iterator it = v.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.q5.b0 b0Var = (com.amazon.aps.iva.q5.b0) it.next();
                String str2 = b0Var.b;
                com.amazon.aps.iva.yb0.j.e(str2, "it.mediaId");
                b0.g gVar = b0Var.c;
                if (gVar != null && (uri = gVar.b) != null) {
                    str = uri.toString();
                } else {
                    str = null;
                }
                arrayList.add(new com.amazon.aps.iva.kk.b(str2, str));
            }
            return arrayList;
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final void j(OctopusSubtitlesView octopusSubtitlesView) {
        boolean z;
        if (this.b.f() == k0.MAX_FULL_HD) {
            z = true;
        } else {
            z = false;
        }
        octopusSubtitlesView.setScaleSubtitlesDown(z);
        com.amazon.aps.iva.wi.a aVar = this.m;
        com.amazon.aps.iva.yb0.j.c(aVar);
        octopusSubtitlesView.d = aVar;
        octopusSubtitlesView.e = false;
        if (octopusSubtitlesView.c == null) {
            aVar.c("WebView not available!");
        }
    }

    @Override // com.amazon.aps.iva.cj.h
    public final com.amazon.aps.iva.jl.a k() {
        com.amazon.aps.iva.jl.a aVar = this.u;
        if (aVar != null) {
            return aVar;
        }
        com.amazon.aps.iva.yb0.j.m("_cellularController");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.h
    public final com.amazon.aps.iva.ve0.i0 l() {
        ExoplayerComponent exoplayerComponent = this.k;
        com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
        return com.amazon.aps.iva.dg.b.h(exoplayerComponent.C);
    }

    @Override // com.amazon.aps.iva.cj.h
    public final com.amazon.aps.iva.ve0.i0 m() {
        v vVar = new v(g());
        com.amazon.aps.iva.xe0.d dVar = this.j;
        if (dVar != null) {
            return com.amazon.aps.iva.dg.b.F(vVar, dVar, q0.a.b, null);
        }
        com.amazon.aps.iva.yb0.j.m("coroutineScope");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final void release() {
        stop();
        this.k = null;
        com.amazon.aps.iva.rk.b bVar = this.n;
        if (bVar != null) {
            bVar.c.b.clear();
        }
        com.amazon.aps.iva.xe0.d dVar = this.j;
        if (dVar != null) {
            com.amazon.aps.iva.e.z.l(dVar, null);
            this.n = null;
            this.l = null;
            this.m = null;
            this.q.k(Boolean.FALSE);
            com.amazon.aps.iva.jl.a aVar = this.u;
            if (aVar != null) {
                this.e.b(aVar);
                this.w = null;
                return;
            }
            com.amazon.aps.iva.yb0.j.m("_cellularController");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("coroutineScope");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.i
    public final void stop() {
        com.amazon.aps.iva.i5.v<Boolean> vVar = this.q;
        if (com.amazon.aps.iva.yb0.j.a(vVar.d(), Boolean.TRUE)) {
            com.amazon.aps.iva.rk.b bVar = this.n;
            if (bVar != null) {
                for (com.amazon.aps.iva.fj.f fVar : com.amazon.aps.iva.lb0.x.X0(bVar.c.b)) {
                    fVar.dismiss();
                }
            }
            vVar.k(Boolean.FALSE);
        }
    }
}
