package com.crunchyroll.player.exoplayercomponent.components;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.b8.h2;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.o6.m;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.pj.d;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.pj.f;
import com.amazon.aps.iva.pj.j;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.qj.v;
import com.amazon.aps.iva.rj.b;
import com.amazon.aps.iva.s6.a;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.v1;
import com.amazon.aps.iva.tj.c0;
import com.amazon.aps.iva.tj.d0;
import com.amazon.aps.iva.tj.f0;
import com.amazon.aps.iva.tj.h0;
import com.amazon.aps.iva.tj.j0;
import com.amazon.aps.iva.tj.k0;
import com.amazon.aps.iva.tj.o;
import com.amazon.aps.iva.tj.o0;
import com.amazon.aps.iva.tj.p0;
import com.amazon.aps.iva.tj.q0;
import com.amazon.aps.iva.tj.s;
import com.amazon.aps.iva.tj.t;
import com.amazon.aps.iva.tj.u;
import com.amazon.aps.iva.tj.w;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.w5.j;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.e0;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
/* compiled from: ExoplayerComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/player/exoplayercomponent/components/ExoplayerComponent;", "Lcom/amazon/aps/iva/fj/f;", "Lcom/crunchyroll/player/exoplayercomponent/components/ExoplayerComponent$a;", "Lcom/amazon/aps/iva/i5/g;", "a", "exoplayer-component_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ExoplayerComponent extends com.amazon.aps.iva.fj.f<a> implements com.amazon.aps.iva.i5.g {
    public final v0 A;
    public final v0 B;
    public final v0 C;
    public com.amazon.aps.iva.jk.a D;
    public final com.amazon.aps.iva.u6.a E;
    public com.amazon.aps.iva.jk.j F;
    public final v0 G;
    public final m H;
    public final m I;
    public final o J;
    public final m K;
    public final com.amazon.aps.iva.gk.b L;
    public final m M;
    public final m N;
    public final m O;
    public final m P;
    public final m Q;
    public com.amazon.aps.iva.bk.d R;
    public final Context c;
    public final g0 d;
    public final com.amazon.aps.iva.nk.i e;
    public final com.amazon.aps.iva.zj.b f;
    public final f.a g;
    public final com.amazon.aps.iva.p0.e h;
    public final com.amazon.aps.iva.yl.d i;
    public a j;
    public final v0 k;
    public com.amazon.aps.iva.qj.o l;
    public q m;
    public com.amazon.aps.iva.jk.b n;
    public com.amazon.aps.iva.xe0.d o;
    public m0 p;
    public androidx.media3.ui.d q;
    public com.amazon.aps.iva.rj.b r;
    public final com.amazon.aps.iva.rj.a s;
    public final String t;
    public boolean u;
    public long v;
    public final n3 w;
    public com.amazon.aps.iva.uj.b x;
    public com.amazon.aps.iva.uj.d y;
    public final List<com.amazon.aps.iva.fc0.d<? extends com.amazon.aps.iva.pj.a>> z;

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.fj.g {
        public boolean b;
        public boolean d;
        public com.amazon.aps.iva.mk.a e;
        public boolean g;
        public int i;
        public boolean j;
        public boolean k;
        public com.amazon.aps.iva.kk.a a = new com.amazon.aps.iva.kk.a(false, false, null, null, null, null, null, 134217727);
        public com.amazon.aps.iva.ck.g c = new com.amazon.aps.iva.ck.g(a0.b);
        public final com.amazon.aps.iva.ek.b f = new com.amazon.aps.iva.ek.b(0);
        public int h = 24;
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.qj.i.values().length];
            iArr[com.amazon.aps.iva.qj.i.CURRENT.ordinal()] = 1;
            iArr[com.amazon.aps.iva.qj.i.NEXT.ordinal()] = 2;
            iArr[com.amazon.aps.iva.qj.i.PREVIOUS.ordinal()] = 3;
            a = iArr;
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
            com.amazon.aps.iva.yb0.j.f(jVar, "$this$set");
            return new com.amazon.aps.iva.nk.j(0);
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.d, com.amazon.aps.iva.nk.d> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.d invoke(com.amazon.aps.iva.nk.d dVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "$this$set");
            return new com.amazon.aps.iva.nk.d(0);
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.f, com.amazon.aps.iva.nk.f> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.f invoke(com.amazon.aps.iva.nk.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, "$this$set");
            return new com.amazon.aps.iva.nk.f(0);
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent$init$1", f = "ExoplayerComponent.kt", l = {357}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        /* compiled from: ExoplayerComponent.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ ExoplayerComponent b;

            public a(ExoplayerComponent exoplayerComponent) {
                this.b = exoplayerComponent;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                defpackage.i.C(this.b.k, new com.crunchyroll.player.exoplayercomponent.components.a((com.amazon.aps.iva.nk.c) obj));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public f(com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                ExoplayerComponent exoplayerComponent = ExoplayerComponent.this;
                com.amazon.aps.iva.rj.b bVar = exoplayerComponent.r;
                if (bVar != null) {
                    a aVar2 = new a(exoplayerComponent);
                    this.h = 1;
                    if (bVar.k.c(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("adsHelper");
                    throw null;
                }
            }
            throw new com.amazon.aps.iva.la.a();
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.d, com.amazon.aps.iva.nk.d> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.d invoke(com.amazon.aps.iva.nk.d dVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "$this$set");
            return new com.amazon.aps.iva.nk.d(0);
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.f, com.amazon.aps.iva.nk.f> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.f invoke(com.amazon.aps.iva.nk.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, "$this$set");
            return new com.amazon.aps.iva.nk.f(0);
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
        public final /* synthetic */ com.amazon.aps.iva.pj.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.pj.a aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
            com.amazon.aps.iva.nk.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            return com.amazon.aps.iva.nk.j.a(jVar2, false, 0L, ((com.amazon.aps.iva.pj.g) this.h).a * 1000, 0.0f, 0L, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, 4194299);
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
        public final /* synthetic */ com.amazon.aps.iva.kk.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.amazon.aps.iva.kk.c cVar) {
            super(1);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
            com.amazon.aps.iva.nk.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            return com.amazon.aps.iva.nk.j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, this.h, 0, null, null, null, null, null, null, null, null, false, null, null, 4194175);
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.d, com.amazon.aps.iva.nk.d> {
        public final /* synthetic */ com.amazon.aps.iva.kk.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.amazon.aps.iva.kk.c cVar) {
            super(1);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.d invoke(com.amazon.aps.iva.nk.d dVar) {
            com.amazon.aps.iva.nk.d dVar2 = dVar;
            com.amazon.aps.iva.yb0.j.f(dVar2, "$this$set");
            return com.amazon.aps.iva.nk.d.a(dVar2, this.h, null, null, null, null, 254);
        }
    }

    /* compiled from: ExoplayerComponent.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.f, com.amazon.aps.iva.nk.f> {
        public final /* synthetic */ com.amazon.aps.iva.kk.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.amazon.aps.iva.kk.c cVar) {
            super(1);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.f invoke(com.amazon.aps.iva.nk.f fVar) {
            com.amazon.aps.iva.nk.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$set");
            return com.amazon.aps.iva.nk.f.a(fVar2, this.h, null, null, null, null, 254);
        }
    }

    public ExoplayerComponent(Context context, g0 g0Var, com.amazon.aps.iva.nk.j jVar, com.amazon.aps.iva.nk.i iVar, com.amazon.aps.iva.zj.b bVar, com.amazon.aps.iva.zj.d dVar, f.a aVar, com.amazon.aps.iva.p0.e eVar, com.amazon.aps.iva.yl.d dVar2) {
        g.c cVar;
        this.c = context;
        this.d = g0Var;
        this.e = iVar;
        this.f = bVar;
        this.g = aVar;
        this.h = eVar;
        this.i = dVar2;
        v0 e2 = x.e(jVar);
        this.k = e2;
        this.l = new com.amazon.aps.iva.qj.o(null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, -1, 15);
        this.s = new com.amazon.aps.iva.rj.a();
        this.t = "";
        this.v = ((com.amazon.aps.iva.nk.j) e2.getValue()).c;
        this.w = new n3(5);
        this.z = f1.K(e0.a(com.amazon.aps.iva.pj.d.class), e0.a(com.amazon.aps.iva.pj.j.class), e0.a(com.amazon.aps.iva.pj.f.class), e0.a(e.a.class), e0.a(com.amazon.aps.iva.pj.e.class), e0.a(com.amazon.aps.iva.pj.g.class));
        this.A = x.e(new com.amazon.aps.iva.nk.d(0));
        this.B = x.e(new com.amazon.aps.iva.nk.f(0));
        v0 e3 = x.e(iVar);
        this.C = e3;
        this.E = new com.amazon.aps.iva.u6.a();
        this.G = x.e(new com.amazon.aps.iva.nk.h(null, null, null));
        this.H = com.amazon.aps.iva.kb0.f.b(new com.amazon.aps.iva.tj.l(this));
        this.I = com.amazon.aps.iva.kb0.f.b(new com.amazon.aps.iva.tj.p(this));
        this.J = new o(this);
        this.K = com.amazon.aps.iva.kb0.f.b(new com.amazon.aps.iva.tj.m(this));
        com.amazon.aps.iva.s6.g gVar = new com.amazon.aps.iva.s6.g(context, new a.b());
        synchronized (gVar.d) {
            cVar = gVar.h;
        }
        cVar.getClass();
        g.c.a aVar2 = new g.c.a(cVar);
        aVar2.L = false;
        gVar.U(new g.c(aVar2));
        this.L = new com.amazon.aps.iva.gk.b(new com.amazon.aps.iva.ik.e(e2, e3, gVar), new com.amazon.aps.iva.hk.c(context, gVar, dVar, new com.amazon.aps.iva.hk.a(context), e2), gVar);
        this.M = com.amazon.aps.iva.kb0.f.b(new o0(this));
        this.N = com.amazon.aps.iva.kb0.f.b(new p0(this));
        this.O = com.amazon.aps.iva.kb0.f.b(new com.amazon.aps.iva.tj.a(this));
        this.P = com.amazon.aps.iva.kb0.f.b(new com.amazon.aps.iva.tj.g(this));
        this.Q = com.amazon.aps.iva.kb0.f.b(new com.amazon.aps.iva.tj.a0(this));
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void d(com.amazon.aps.iva.xb0.l<? super a, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "block");
        a aVar = new a();
        lVar.invoke(aVar);
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void dismiss() {
        ViewGroup adViewGroup;
        com.amazon.aps.iva.jk.j jVar;
        ((com.amazon.aps.iva.uj.b) l()).h();
        q qVar = this.m;
        if (qVar != null) {
            l0 a2 = qVar.a();
            com.amazon.aps.iva.jk.b bVar = this.n;
            if (bVar != null) {
                a2.t0(bVar);
                this.n = null;
                com.amazon.aps.iva.xe0.d dVar = this.o;
                if (dVar != null) {
                    z.l(dVar, null);
                }
                this.o = null;
            }
            com.amazon.aps.iva.jk.j jVar2 = this.F;
            if (jVar2 != null) {
                a2.t0(jVar2);
            }
            com.amazon.aps.iva.rj.b bVar2 = this.r;
            if (bVar2 != null) {
                a2.t0(bVar2.m);
                a2.t0(this.L);
                a2.t0((com.amazon.aps.iva.ck.b) this.Q.getValue());
                a2.t0(p());
                m0 m0Var = this.p;
                if (m0Var != null) {
                    m0Var.D0(this.E);
                    com.amazon.aps.iva.jk.a aVar = this.D;
                    if (aVar != null) {
                        m0Var.D0(aVar);
                    } else {
                        com.amazon.aps.iva.yb0.j.m("playbackStatsListener");
                        throw null;
                    }
                }
                q qVar2 = this.m;
                if (qVar2 != null) {
                    l0 a3 = qVar2.a();
                    if (a3 != null && (jVar = this.F) != null) {
                        String str = ((com.amazon.aps.iva.nk.d) n().getValue()).g;
                        if (str != null) {
                            String str2 = ((com.amazon.aps.iva.nk.d) n().getValue()).a.a;
                            com.amazon.aps.iva.jk.j jVar3 = this.F;
                            if (jVar3 != null) {
                                com.amazon.aps.iva.yb0.j.f(str2, "contentId");
                                com.amazon.aps.iva.se0.i.d(jVar3.b, v1.b, null, new com.amazon.aps.iva.jk.k(jVar3, str2, str, null), 2);
                            }
                        }
                        v0 v0Var = this.B;
                        String str3 = ((com.amazon.aps.iva.nk.f) com.amazon.aps.iva.dg.b.h(v0Var).getValue()).g;
                        if (str3 != null) {
                            String str4 = ((com.amazon.aps.iva.nk.f) com.amazon.aps.iva.dg.b.h(v0Var).getValue()).a.a;
                            com.amazon.aps.iva.jk.j jVar4 = this.F;
                            if (jVar4 != null) {
                                com.amazon.aps.iva.yb0.j.f(str4, "contentId");
                                com.amazon.aps.iva.se0.i.d(jVar4.b, v1.b, null, new com.amazon.aps.iva.jk.k(jVar4, str4, str3, null), 2);
                            }
                        }
                        c2 c2Var = jVar.l;
                        if (c2Var != null) {
                            c2Var.a(null);
                        }
                        jVar.l = null;
                        c2 c2Var2 = jVar.m;
                        if (c2Var2 != null) {
                            c2Var2.a(null);
                        }
                        jVar.m = null;
                        c2 c2Var3 = jVar.j;
                        if (c2Var3 != null) {
                            c2Var3.a(null);
                        }
                        jVar.j = null;
                        jVar.Q();
                        a3.t0(jVar);
                        this.F = null;
                        defpackage.i.C(this.G, com.amazon.aps.iva.tj.f.h);
                    }
                    com.amazon.aps.iva.jk.a aVar2 = this.D;
                    if (aVar2 != null) {
                        aVar2.b = null;
                        m0 m0Var2 = this.p;
                        if (m0Var2 != null) {
                            m0Var2.release();
                        }
                        q qVar3 = this.m;
                        if (qVar3 != null) {
                            qVar3.a().release();
                            q qVar4 = this.m;
                            if (qVar4 != null) {
                                try {
                                    synchronized (q.b) {
                                        q.c.remove(qVar4.a.g);
                                    }
                                    qVar4.a.l();
                                } catch (Exception unused) {
                                }
                                com.amazon.aps.iva.rj.b bVar3 = this.r;
                                if (bVar3 != null) {
                                    com.amazon.aps.iva.sj.b bVar4 = bVar3.e.a;
                                    if (bVar4 != null) {
                                        l0 l0Var = bVar4.l;
                                        if (l0Var != null) {
                                            l0Var.t0(bVar4.d);
                                            bVar4.l = null;
                                            bVar4.g();
                                        }
                                        bVar4.j = null;
                                        HashMap<com.amazon.aps.iva.p6.b, com.amazon.aps.iva.sj.a> hashMap = bVar4.f;
                                        for (com.amazon.aps.iva.sj.a aVar3 : hashMap.values()) {
                                            aVar3.release();
                                        }
                                        hashMap.clear();
                                        HashMap<Object, com.amazon.aps.iva.sj.a> hashMap2 = bVar4.e;
                                        for (com.amazon.aps.iva.sj.a aVar4 : hashMap2.values()) {
                                            aVar4.release();
                                        }
                                        hashMap2.clear();
                                    }
                                    androidx.media3.ui.d dVar2 = bVar3.l;
                                    if (dVar2 != null && (adViewGroup = dVar2.getAdViewGroup()) != null) {
                                        adViewGroup.removeAllViews();
                                    }
                                    com.amazon.aps.iva.yl.c cVar = bVar3.g;
                                    if (cVar != null) {
                                        cVar.release();
                                    }
                                    bVar3.g = null;
                                    bVar3.l = null;
                                    bVar3.f = null;
                                    q qVar5 = this.m;
                                    if (qVar5 != null) {
                                        qVar5.a().isLoading();
                                        i().b("ExoplayerComponent", e.k.a);
                                        ((com.amazon.aps.iva.lk.a) this.I.getValue()).release();
                                        this.p = null;
                                        this.q = null;
                                        this.s.b = null;
                                        defpackage.i.C(this.k, c.h);
                                        defpackage.i.C(this.A, d.h);
                                        defpackage.i.C(this.B, e.h);
                                        return;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("mediaSession");
                                    throw null;
                                }
                                com.amazon.aps.iva.yb0.j.m("adsHelper");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("mediaSession");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("mediaSession");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("playbackStatsListener");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("mediaSession");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("adsHelper");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("mediaSession");
        throw null;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final List<com.amazon.aps.iva.fc0.d<? extends com.amazon.aps.iva.pj.a>> f() {
        return this.z;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final Object g(com.amazon.aps.iva.pj.a aVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        int i2;
        boolean z;
        com.amazon.aps.iva.dk.c bVar;
        com.amazon.aps.iva.dk.c cVar;
        boolean z2 = aVar instanceof com.amazon.aps.iva.pj.d;
        v vVar = null;
        v0 v0Var = this.A;
        v0 v0Var2 = this.B;
        v0 v0Var3 = this.k;
        n3 n3Var = this.w;
        if (z2) {
            com.amazon.aps.iva.pj.d dVar2 = (com.amazon.aps.iva.pj.d) aVar;
            if (com.amazon.aps.iva.yb0.j.a(dVar2, d.c.a)) {
                i().b("ExoplayerComponent", e.i.b.a);
            } else {
                int i3 = 0;
                if (dVar2 instanceof d.h) {
                    d.h hVar = (d.h) dVar2;
                    int i4 = b.a[hVar.k.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                defpackage.i.C(v0Var2, new w(hVar));
                                k(hVar.a, hVar.e, ((com.amazon.aps.iva.nk.f) com.amazon.aps.iva.dg.b.h(v0Var2).getValue()).a, hVar.l, 0, ((com.amazon.aps.iva.nk.f) com.amazon.aps.iva.dg.b.h(v0Var2).getValue()).e, hVar.h, hVar.m);
                            }
                        } else {
                            defpackage.i.C(v0Var, new com.amazon.aps.iva.tj.v(hVar));
                            k(hVar.a, hVar.e, ((com.amazon.aps.iva.nk.d) n().getValue()).a, hVar.l, 2, ((com.amazon.aps.iva.nk.d) n().getValue()).e, hVar.h, hVar.m);
                        }
                    } else {
                        com.amazon.aps.iva.qj.v vVar2 = hVar.j;
                        if (vVar2 != null) {
                            com.amazon.aps.iva.ck.d m = m();
                            if (vVar2 instanceof v.a) {
                                cVar = com.amazon.aps.iva.dk.a.g;
                            } else if (vVar2 instanceof v.b) {
                                v.b bVar2 = (v.b) vVar2;
                                Integer num = bVar2.a;
                                if (num != null && num.intValue() == 420) {
                                    bVar = new com.amazon.aps.iva.dk.e(bVar2.a, bVar2.b, 4);
                                } else {
                                    bVar = new com.amazon.aps.iva.dk.b(bVar2.a, false, bVar2.b, null, 2);
                                }
                                cVar = bVar;
                            } else {
                                throw new com.amazon.aps.iva.kb0.h();
                            }
                            m.b(cVar);
                        } else if (hVar.a == null) {
                            m().b(new com.amazon.aps.iva.dk.b(1000001, hVar.i, null, null, 12));
                        } else {
                            defpackage.i.C(v0Var3, s.h);
                        }
                        defpackage.i.C(v0Var3, new t(this, hVar));
                        com.amazon.aps.iva.rj.b bVar3 = this.r;
                        if (bVar3 != null) {
                            bVar3.b();
                            if (((com.amazon.aps.iva.nk.j) v0Var3.getValue()).g == com.amazon.aps.iva.nk.e.VIDEO_SETTING_CHANGE && q()) {
                                i3 = 1;
                            }
                            k(hVar.a, hVar.e, ((com.amazon.aps.iva.nk.j) ((i0) o()).getValue()).h, hVar.l, i3, ((com.amazon.aps.iva.nk.j) ((i0) o()).getValue()).n, hVar.h, hVar.m);
                            u uVar = new u(this, i3);
                            if (n3Var.b()) {
                                uVar.invoke();
                            } else {
                                n3Var.c = uVar;
                            }
                        } else {
                            com.amazon.aps.iva.yb0.j.m("adsHelper");
                            throw null;
                        }
                    }
                } else if (dVar2 instanceof d.f) {
                    d.f fVar = (d.f) dVar2;
                    Object obj = fVar.a;
                    if (obj instanceof com.amazon.aps.iva.o6.v) {
                        vVar = (com.amazon.aps.iva.o6.v) obj;
                    }
                    int i5 = b.a[fVar.e.ordinal()];
                    String str = fVar.i;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                defpackage.i.C(v0Var2, new f0(dVar2));
                                j(0, vVar, str);
                            }
                        } else {
                            defpackage.i.C(v0Var, new com.amazon.aps.iva.tj.e0(dVar2));
                            j(2, vVar, str);
                        }
                    } else {
                        defpackage.i.C(v0Var3, new c0(dVar2));
                        if (((com.amazon.aps.iva.nk.j) v0Var3.getValue()).g == com.amazon.aps.iva.nk.e.VIDEO_SETTING_CHANGE && q()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        j(i2, vVar, str);
                        if (vVar == null) {
                            com.amazon.aps.iva.ck.d m2 = m();
                            if (fVar.h == com.amazon.aps.iva.qj.m.COMPLETE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            m2.b(new com.amazon.aps.iva.dk.b(1000002, z, null, null, 12));
                        }
                        d0 d0Var = new d0(this, i2);
                        if (n3Var.b()) {
                            d0Var.invoke();
                        } else {
                            n3Var.c = d0Var;
                        }
                    }
                } else if (dVar2 instanceof d.g) {
                    d.g gVar = (d.g) dVar2;
                    com.amazon.aps.iva.qj.o oVar = gVar.a;
                    com.amazon.aps.iva.nk.i iVar = this.e;
                    this.l = com.amazon.aps.iva.qj.o.a(oVar, null, null, null, null, null, null, null, null, iVar.e, iVar.b, 0L, 0L, null, null, null, null, -196609, 15);
                    int[] iArr = b.a;
                    com.amazon.aps.iva.qj.i iVar2 = gVar.b;
                    int i6 = iArr[iVar2.ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                s(this.l, iVar2);
                            }
                        } else {
                            s(this.l, iVar2);
                        }
                    } else {
                        s(this.l, com.amazon.aps.iva.qj.i.CURRENT);
                    }
                } else if (dVar2 instanceof d.C0620d) {
                    if (!this.u) {
                        if (!((d.C0620d) dVar2).b) {
                            defpackage.i.C(v0Var3, new h0(dVar2));
                        } else {
                            defpackage.i.C(v0Var3, com.amazon.aps.iva.tj.g0.h);
                        }
                        this.v = ((com.amazon.aps.iva.nk.j) v0Var3.getValue()).c;
                    }
                    n3Var.c(q0.PLAYHEAD);
                } else {
                    boolean z3 = dVar2 instanceof d.e;
                    v0 v0Var4 = this.C;
                    if (z3) {
                        defpackage.i.C(v0Var4, new com.amazon.aps.iva.tj.i0(dVar2, this));
                    } else if (dVar2 instanceof d.a) {
                        defpackage.i.C(v0Var4, new j0(dVar2, this));
                    } else if (dVar2 instanceof d.b) {
                        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
                        ((d.b) dVar2).getClass();
                        c0515a.c("Capturing CMS ERROR: null", new Object[0]);
                        m().b(new com.amazon.aps.iva.dk.b(null, false, null, null, 10));
                    }
                }
            }
        } else if (aVar instanceof com.amazon.aps.iva.pj.j) {
            com.amazon.aps.iva.pj.j jVar = (com.amazon.aps.iva.pj.j) aVar;
            if (jVar instanceof j.b) {
                defpackage.i.C(v0Var3, k0.h);
                com.amazon.aps.iva.jk.b bVar4 = this.n;
                if (bVar4 != null) {
                    bVar4.K();
                }
                this.v = ((com.amazon.aps.iva.nk.j) v0Var3.getValue()).c;
                this.u = true;
            } else if (jVar instanceof j.a) {
                defpackage.i.C(v0Var3, com.amazon.aps.iva.tj.l0.h);
            }
        } else if (aVar instanceof com.amazon.aps.iva.pj.f) {
            com.amazon.aps.iva.pj.f fVar2 = (com.amazon.aps.iva.pj.f) aVar;
            boolean z4 = fVar2 instanceof f.a;
            m mVar = this.I;
            if (z4) {
                ((com.amazon.aps.iva.lk.a) mVar.getValue()).a(((f.a) fVar2).a);
            } else if (fVar2 instanceof f.b) {
                ((com.amazon.aps.iva.lk.a) mVar.getValue()).b(((f.b) fVar2).a);
            }
        } else if (aVar instanceof e.a.d) {
            n3Var.c(q0.SUBTITLES);
        } else if (aVar instanceof e.a.b) {
            n3Var.c(q0.SUBTITLES);
            p().a();
        } else if (aVar instanceof e.a.C0621a) {
            m().a(new com.amazon.aps.iva.dk.f(((e.a.C0621a) aVar).a));
        } else if (aVar instanceof e.p) {
            if (((e.p) aVar).b == com.amazon.aps.iva.qj.i.NEXT) {
                String str2 = ((com.amazon.aps.iva.nk.f) v0Var2.getValue()).g;
                if (str2 != null) {
                    String str3 = ((com.amazon.aps.iva.nk.f) com.amazon.aps.iva.dg.b.h(v0Var2).getValue()).a.a;
                    com.amazon.aps.iva.jk.j jVar2 = this.F;
                    if (jVar2 != null) {
                        com.amazon.aps.iva.yb0.j.f(str3, "contentId");
                        com.amazon.aps.iva.se0.i.d(jVar2.b, v1.b, null, new com.amazon.aps.iva.jk.k(jVar2, str3, str2, null), 2);
                    }
                }
            } else {
                String str4 = ((com.amazon.aps.iva.nk.d) v0Var.getValue()).g;
                if (str4 != null) {
                    String str5 = ((com.amazon.aps.iva.nk.d) n().getValue()).a.a;
                    com.amazon.aps.iva.jk.j jVar3 = this.F;
                    if (jVar3 != null) {
                        com.amazon.aps.iva.yb0.j.f(str5, "contentId");
                        com.amazon.aps.iva.se0.i.d(jVar3.b, v1.b, null, new com.amazon.aps.iva.jk.k(jVar3, str5, str4, null), 2);
                    }
                }
            }
            defpackage.i.C(v0Var, g.h);
            defpackage.i.C(v0Var2, h.h);
        } else if (aVar instanceof com.amazon.aps.iva.pj.g) {
            defpackage.i.C(v0Var3, new i(aVar));
            this.v = ((com.amazon.aps.iva.nk.j) v0Var3.getValue()).c;
            q qVar = this.m;
            if (qVar != null) {
                qVar.a().c(this.v);
                n3Var.c(q0.PLAYHEAD);
            } else {
                com.amazon.aps.iva.yb0.j.m("mediaSession");
                throw null;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void init() {
        i().b("ExoplayerComponent", e.i.b.a);
        a aVar = this.j;
        if (aVar != null) {
            com.amazon.aps.iva.kk.a aVar2 = aVar.a;
            com.amazon.aps.iva.oj.a i2 = i();
            Context context = this.c;
            this.r = new com.amazon.aps.iva.rj.b(context, aVar2, i2, this.i);
            com.amazon.aps.iva.q5.f fVar = new com.amazon.aps.iva.q5.f(3, 0, 1, 1, 0);
            a aVar3 = this.j;
            if (aVar3 != null) {
                if (aVar3.j) {
                    this.R = new com.amazon.aps.iva.bk.d(new com.amazon.aps.iva.tj.h(this));
                }
                com.amazon.aps.iva.rj.b bVar = this.r;
                if (bVar != null) {
                    a aVar4 = this.j;
                    if (aVar4 != null) {
                        final com.amazon.aps.iva.ek.a aVar5 = (com.amazon.aps.iva.ek.a) this.O.getValue();
                        com.amazon.aps.iva.ck.f fVar2 = (com.amazon.aps.iva.ck.f) this.H.getValue();
                        com.amazon.aps.iva.bk.d dVar = this.R;
                        f.a aVar6 = this.g;
                        com.amazon.aps.iva.yb0.j.f(aVar6, "dataSourceFactory");
                        com.amazon.aps.iva.nk.i iVar = this.e;
                        com.amazon.aps.iva.yb0.j.f(iVar, "initialSettingsState");
                        com.amazon.aps.iva.rj.a aVar7 = this.s;
                        com.amazon.aps.iva.yb0.j.f(aVar7, "adViewProvider");
                        final com.amazon.aps.iva.gk.b bVar2 = this.L;
                        com.amazon.aps.iva.yb0.j.f(bVar2, "trackSelector");
                        com.amazon.aps.iva.yb0.j.f(aVar5, "loadControl");
                        com.amazon.aps.iva.yb0.j.f(fVar2, "loadErrorHandlingPolicy");
                        m.b bVar3 = new m.b(context);
                        com.amazon.aps.iva.g6.c cVar = new com.amazon.aps.iva.g6.c();
                        cVar.d = aVar6;
                        com.amazon.aps.iva.o6.m mVar = new com.amazon.aps.iva.o6.m(new j.a(context), new com.amazon.aps.iva.x6.j());
                        mVar.b = aVar6;
                        m.a aVar8 = mVar.a;
                        if (aVar6 != aVar8.e) {
                            aVar8.e = aVar6;
                            aVar8.b.clear();
                            aVar8.d.clear();
                        }
                        mVar.h(fVar2);
                        mVar.g(cVar);
                        b.a aVar9 = bVar.e;
                        if (aVar9 != null) {
                            mVar.c = aVar9;
                            mVar.d = aVar7;
                        }
                        com.amazon.aps.iva.fk.b bVar4 = new com.amazon.aps.iva.fk.b(mVar);
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.d = new com.amazon.aps.iva.a6.s(bVar4, 0);
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.p = NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.q = NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.u = !iVar.a;
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.e = new Supplier() { // from class: com.amazon.aps.iva.a6.r
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return bVar2;
                            }
                        };
                        boolean z = aVar4.d;
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.k = z;
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.f = new Supplier() { // from class: com.amazon.aps.iva.a6.n
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return aVar5;
                            }
                        };
                        final com.amazon.aps.iva.a6.k kVar = new com.amazon.aps.iva.a6.k(context);
                        kVar.c = 0;
                        if (dVar != null) {
                            kVar.d = dVar;
                        }
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.c = new Supplier() { // from class: com.amazon.aps.iva.a6.q
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return kVar;
                            }
                        };
                        com.amazon.aps.iva.cq.b.C(!bVar3.w);
                        bVar3.w = true;
                        m0 m0Var = new m0(bVar3);
                        this.p = m0Var;
                        this.D = new com.amazon.aps.iva.jk.a(i(), m0Var);
                        m0Var.x1(fVar);
                        m0Var.b0(this.E);
                        com.amazon.aps.iva.jk.a aVar10 = this.D;
                        if (aVar10 != null) {
                            m0Var.r.F(aVar10);
                            o oVar = this.J;
                            com.amazon.aps.iva.yb0.j.f(oVar, "mediaSessionCallback");
                            Bundle bundle = Bundle.EMPTY;
                            ImmutableList of = ImmutableList.of();
                            String uuid = UUID.randomUUID().toString();
                            uuid.getClass();
                            q qVar = new q(context, uuid, m0Var, of, oVar, bundle, new com.amazon.aps.iva.b8.a(new h2()));
                            this.m = qVar;
                            l0 a2 = qVar.a();
                            com.amazon.aps.iva.xe0.d j2 = z.j();
                            this.o = j2;
                            com.amazon.aps.iva.tj.b bVar5 = new com.amazon.aps.iva.tj.b(this);
                            v0 v0Var = this.k;
                            com.amazon.aps.iva.jk.b bVar6 = new com.amazon.aps.iva.jk.b(j2, bVar5, v0Var, this.A, this.B, m0Var, this.h, i());
                            this.n = bVar6;
                            a2.u(bVar6);
                            com.amazon.aps.iva.rj.b bVar7 = this.r;
                            if (bVar7 != null) {
                                a2.u(bVar7.m);
                                a2.u(bVar2);
                                a2.u((com.amazon.aps.iva.ck.b) this.Q.getValue());
                                a2.u(p());
                                a aVar11 = this.j;
                                if (aVar11 != null) {
                                    if (aVar11.k) {
                                        com.amazon.aps.iva.jk.j jVar = new com.amazon.aps.iva.jk.j(this.d, (i0) o(), this.G, m0Var, this.h, new com.amazon.aps.iva.tj.c(this), new com.amazon.aps.iva.tj.d(a2, this), new com.amazon.aps.iva.tj.e(this));
                                        this.F = jVar;
                                        a2.u(jVar);
                                    }
                                    com.amazon.aps.iva.oj.a i3 = i();
                                    q qVar2 = this.m;
                                    if (qVar2 != null) {
                                        l0 a3 = qVar2.a();
                                        com.amazon.aps.iva.yb0.j.e(a3, "mediaSession.player");
                                        this.x = new com.amazon.aps.iva.uj.b(i3, a3, v0Var, new com.amazon.aps.iva.tj.i(this), new com.amazon.aps.iva.tj.j(this), new com.amazon.aps.iva.tj.k(this));
                                        this.y = new com.amazon.aps.iva.uj.d(m0Var, this.C, bVar2, (com.amazon.aps.iva.ok.b) this.N.getValue());
                                        m0 m0Var2 = this.p;
                                        com.amazon.aps.iva.rj.b bVar8 = this.r;
                                        if (bVar8 != null) {
                                            com.amazon.aps.iva.mf0.a.a.a("ExoPlayer Set", new Object[0]);
                                            bVar8.i = m0Var2;
                                            com.amazon.aps.iva.rj.b bVar9 = this.r;
                                            if (bVar9 != null) {
                                                bVar9.h = null;
                                                com.amazon.aps.iva.se0.i.d(this.d, null, null, new f(null), 3);
                                                this.t.getClass();
                                                p().p0(i());
                                                a aVar12 = this.j;
                                                if (aVar12 != null) {
                                                    if (!aVar12.g) {
                                                        this.w.c(q0.SUBTITLES);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                com.amazon.aps.iva.yb0.j.m("playerConfig");
                                                throw null;
                                            }
                                            com.amazon.aps.iva.yb0.j.m("adsHelper");
                                            throw null;
                                        }
                                        com.amazon.aps.iva.yb0.j.m("adsHelper");
                                        throw null;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("mediaSession");
                                    throw null;
                                }
                                com.amazon.aps.iva.yb0.j.m("playerConfig");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("adsHelper");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("playbackStatsListener");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("playerConfig");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("adsHelper");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("playerConfig");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }

    public final void j(int i2, com.amazon.aps.iva.o6.v vVar, String str) {
        com.amazon.aps.iva.rj.b bVar = this.r;
        if (bVar != null) {
            bVar.b();
            if (vVar == null) {
                q qVar = this.m;
                if (qVar != null) {
                    l0 a2 = qVar.a();
                    com.amazon.aps.iva.yb0.j.e(a2, "mediaSession.player");
                    b0.b bVar2 = new b0.b();
                    str.getClass();
                    bVar2.a = str;
                    com.amazon.aps.iva.aq.j.g(a2, bVar2.a(), i2);
                } else {
                    com.amazon.aps.iva.yb0.j.m("mediaSession");
                    throw null;
                }
            } else {
                m0 m0Var = this.p;
                if (m0Var != null) {
                    String str2 = vVar.b().b;
                    com.amazon.aps.iva.yb0.j.e(str2, "mediaSource.mediaItem.mediaId");
                    Integer u = com.amazon.aps.iva.aq.j.u(m0Var, str2);
                    if (u != null) {
                        m0Var.E(u.intValue());
                    }
                    m0Var.d1(i2, vVar);
                }
            }
            if (this.u) {
                q qVar2 = this.m;
                if (qVar2 != null) {
                    qVar2.a().c(((com.amazon.aps.iva.nk.j) this.k.getValue()).c);
                    this.u = false;
                    ((com.amazon.aps.iva.uj.b) l()).pause();
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("mediaSession");
                throw null;
            }
            return;
        }
        com.amazon.aps.iva.yb0.j.m("adsHelper");
        throw null;
    }

    public final void k(String str, com.amazon.aps.iva.qj.j jVar, com.amazon.aps.iva.kk.c cVar, boolean z, int i2, String str2, String str3, String str4) {
        boolean z2;
        String str5;
        String str6;
        String str7;
        boolean z3 = true;
        if (str3 != null && str3.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        com.amazon.aps.iva.p0.e eVar = this.h;
        if (!z2) {
            str5 = ((com.amazon.aps.iva.yj.a) eVar.b).a.a.a();
        } else if (str != null) {
            String M0 = com.amazon.aps.iva.oe0.q.M0(com.amazon.aps.iva.oe0.q.I0(str, "/p/", str), "_");
            eVar.getClass();
            com.amazon.aps.iva.yj.a aVar = (com.amazon.aps.iva.yj.a) eVar.b;
            aVar.getClass();
            com.amazon.aps.iva.ak.a aVar2 = aVar.a;
            aVar2.getClass();
            if (M0.length() <= 0) {
                z3 = false;
            }
            if (z3) {
                M0 = aVar2.a.b(M0);
            }
            str5 = M0;
        } else {
            str5 = null;
        }
        com.amazon.aps.iva.bk.a aVar3 = (com.amazon.aps.iva.bk.a) this.K.getValue();
        d0.a aVar4 = new d0.a();
        aVar4.a = cVar.c;
        aVar4.e = cVar.d;
        aVar4.g = "";
        aVar4.b = " ";
        com.amazon.aps.iva.q5.d0 d0Var = new com.amazon.aps.iva.q5.d0(aVar4);
        if (str4 == null) {
            str6 = cVar.a;
        } else {
            str6 = str4;
        }
        long j2 = cVar.s;
        String str8 = cVar.u;
        if (str8 == null) {
            str7 = "";
        } else {
            str7 = str8;
        }
        b0 a2 = aVar3.a(str, str5, jVar, d0Var, str2, str6, j2, str7, str3, z);
        q qVar = this.m;
        if (qVar != null) {
            l0 a3 = qVar.a();
            com.amazon.aps.iva.yb0.j.e(a3, "mediaSession.player");
            com.amazon.aps.iva.aq.j.g(a3, a2, i2);
            if (this.u) {
                q qVar2 = this.m;
                if (qVar2 != null) {
                    qVar2.a().c(this.v);
                    this.u = false;
                    ((com.amazon.aps.iva.uj.b) l()).pause();
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("mediaSession");
                throw null;
            }
            return;
        }
        com.amazon.aps.iva.yb0.j.m("mediaSession");
        throw null;
    }

    public final com.amazon.aps.iva.uj.a l() {
        com.amazon.aps.iva.uj.b bVar = this.x;
        if (bVar != null) {
            return bVar;
        }
        com.amazon.aps.iva.yb0.j.m("controller");
        throw null;
    }

    public final com.amazon.aps.iva.ck.d m() {
        return (com.amazon.aps.iva.ck.d) this.P.getValue();
    }

    public final i0 n() {
        return com.amazon.aps.iva.dg.b.h(this.A);
    }

    public final u0<com.amazon.aps.iva.nk.j> o() {
        return com.amazon.aps.iva.dg.b.h(this.k);
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onPause(com.amazon.aps.iva.i5.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        com.amazon.aps.iva.jk.j jVar = this.F;
        if (jVar != null) {
            jVar.K();
            if (com.amazon.aps.iva.e.w.h(jVar.c.getValue())) {
                com.amazon.aps.iva.jk.j.N(jVar.d, new com.amazon.aps.iva.jk.v(jVar));
            }
            c2 c2Var = jVar.n;
            if (c2Var != null) {
                c2Var.a(null);
            }
            jVar.n = null;
        }
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onResume(com.amazon.aps.iva.i5.o oVar) {
        com.amazon.aps.iva.jk.j jVar = this.F;
        if (jVar != null) {
            jVar.R(new com.amazon.aps.iva.jk.p(jVar));
        }
    }

    public final com.amazon.aps.iva.ok.f p() {
        return (com.amazon.aps.iva.ok.f) this.M.getValue();
    }

    public final boolean q() {
        q qVar = this.m;
        if (qVar != null) {
            if (qVar.a().F() <= 2) {
                q qVar2 = this.m;
                if (qVar2 != null) {
                    if (!qVar2.a().x0()) {
                        return false;
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("mediaSession");
                    throw null;
                }
            }
            return true;
        }
        com.amazon.aps.iva.yb0.j.m("mediaSession");
        throw null;
    }

    public final void r(int i2) {
        v0 v0Var;
        Object obj;
        q qVar = this.m;
        if (qVar != null) {
            l0 a2 = qVar.a();
            com.amazon.aps.iva.yb0.j.e(a2, "");
            Iterator it = com.amazon.aps.iva.aq.j.v(a2).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                v0Var = this.k;
                if (hasNext) {
                    obj = it.next();
                    if (com.amazon.aps.iva.yb0.j.a(((b0) obj).b, ((com.amazon.aps.iva.nk.j) v0Var.getValue()).h.a)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            b0 b0Var = (b0) obj;
            if (b0Var != null && b0Var.c != null) {
                if (!a2.k0()) {
                    a2.L(((com.amazon.aps.iva.nk.j) v0Var.getValue()).t);
                }
                a2.i0(i2, this.v);
                a aVar = this.j;
                if (aVar != null) {
                    boolean z = aVar.a.f;
                    a2.g();
                    i().b("ExoplayerComponent", new e.j(this.v));
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("playerConfig");
                throw null;
            }
            return;
        }
        com.amazon.aps.iva.yb0.j.m("mediaSession");
        throw null;
    }

    public final void s(com.amazon.aps.iva.qj.o oVar, com.amazon.aps.iva.qj.i iVar) {
        String str;
        String str2;
        String str3;
        long j2;
        String str4 = oVar.a;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        String str5 = oVar.b;
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5;
        }
        String str6 = oVar.c;
        String str7 = oVar.d;
        String str8 = oVar.e;
        String str9 = oVar.f;
        String str10 = oVar.h;
        Integer num = oVar.i;
        if (num != null) {
            str3 = num.toString();
        } else {
            str3 = null;
        }
        String str11 = str3;
        String str12 = oVar.g;
        boolean z = oVar.k;
        boolean z2 = oVar.l;
        boolean z3 = oVar.m;
        List<com.amazon.aps.iva.qj.a> list = oVar.v;
        Long l2 = oVar.u;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 1;
        }
        com.amazon.aps.iva.kk.c cVar = new com.amazon.aps.iva.kk.c(str, str2, str6, str8, str9, str10, str11, str12, str7, z, z2, z3, list, j2, oVar.y, oVar.z, oVar.C, oVar.A, oVar.D, oVar.E, oVar.F, oVar.G, oVar.H, 249856);
        int i2 = b.a[iVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    defpackage.i.C(this.B, new l(cVar));
                    return;
                }
                return;
            }
            defpackage.i.C(this.A, new k(cVar));
            return;
        }
        defpackage.i.C(this.k, new j(cVar));
    }
}
