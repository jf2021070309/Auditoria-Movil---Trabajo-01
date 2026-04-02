package com.amazon.aps.iva.hl;

import android.content.Context;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.nf.c;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.u1.e;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
/* compiled from: PlayerRestrictionOverlay.kt */
/* loaded from: classes2.dex */
public final class e {

    /* compiled from: PlayerRestrictionOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ y h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ m0 m;
        public final /* synthetic */ com.amazon.aps.iva.cj.z n;
        public final /* synthetic */ t o;
        public final /* synthetic */ com.amazon.aps.iva.xh.b p;
        public final /* synthetic */ com.amazon.aps.iva.dj.f q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar3, com.amazon.aps.iva.a1.f fVar, m0 m0Var, com.amazon.aps.iva.cj.z zVar, t tVar, com.amazon.aps.iva.xh.b bVar, com.amazon.aps.iva.dj.f fVar2, int i, int i2) {
            super(2);
            this.h = yVar;
            this.i = aVar;
            this.j = aVar2;
            this.k = aVar3;
            this.l = fVar;
            this.m = m0Var;
            this.n = zVar;
            this.o = tVar;
            this.p = bVar;
            this.q = fVar2;
            this.r = i;
            this.s = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            e.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, iVar, com.amazon.aps.iva.ff0.b.I(this.r | 1), this.s);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerRestrictionOverlay.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.restrictionoverlay.PlayerRestrictionOverlayKt$PlayerRestrictionOverlay$2", f = "PlayerRestrictionOverlay.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ t h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.h = tVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.h, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            this.h.k();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerRestrictionOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ com.amazon.aps.iva.cj.z i;
        public final /* synthetic */ t j;
        public final /* synthetic */ y k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> l;
        public final /* synthetic */ int m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> o;
        public final /* synthetic */ p3<com.amazon.aps.iva.pe0.a<Image>> p;
        public final /* synthetic */ p3<com.amazon.aps.iva.nf.c> q;
        public final /* synthetic */ com.amazon.aps.iva.dj.f r;
        public final /* synthetic */ com.amazon.aps.iva.xh.b s;
        public final /* synthetic */ p3<Boolean> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.cj.z zVar, t tVar, y yVar, com.amazon.aps.iva.xb0.a aVar, int i, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.a aVar3, q1 q1Var, q1 q1Var2, com.amazon.aps.iva.dj.f fVar2, com.amazon.aps.iva.xh.b bVar, q1 q1Var3) {
            super(2);
            this.h = fVar;
            this.i = zVar;
            this.j = tVar;
            this.k = yVar;
            this.l = aVar;
            this.m = i;
            this.n = aVar2;
            this.o = aVar3;
            this.p = q1Var;
            this.q = q1Var2;
            this.r = fVar2;
            this.s = bVar;
            this.t = q1Var3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.a1.f b;
            com.amazon.aps.iva.s1.f fVar;
            com.amazon.aps.iva.a1.f b2;
            com.amazon.aps.iva.o0.i iVar2;
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar;
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2;
            com.amazon.aps.iva.o0.i iVar3;
            com.amazon.aps.iva.qf.b bVar;
            int i;
            com.amazon.aps.iva.o0.i iVar4 = iVar;
            if ((num.intValue() & 11) == 2 && iVar4.h()) {
                iVar4.A();
            } else {
                e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
                long j = com.amazon.aps.iva.ao.a.u;
                b = androidx.compose.foundation.c.b(this.h, j, com.amazon.aps.iva.f1.p0.a);
                com.amazon.aps.iva.a1.f d = androidx.compose.foundation.layout.e.d(b);
                com.amazon.aps.iva.a1.b bVar3 = a.C0097a.e;
                com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar3 = this.n;
                com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar4 = this.o;
                iVar4.s(733328855);
                com.amazon.aps.iva.s1.d0 c = com.amazon.aps.iva.d0.f.c(bVar3, false, iVar4);
                iVar4.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar4);
                c2 l = iVar4.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar5 = e.a.b;
                com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.s1.u.a(d);
                if (iVar4.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar4.z();
                    if (iVar4.e()) {
                        iVar4.w(aVar5);
                    } else {
                        iVar4.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar4, c, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar4, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar4.e() || !com.amazon.aps.iva.yb0.j.a(iVar4.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar4, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar4), iVar4, 2058660585);
                    androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.a;
                    com.amazon.aps.iva.rv.e n = com.amazon.aps.iva.aq.k.n((Context) iVar4.i(androidx.compose.ui.platform.d.b));
                    f.a aVar6 = f.a.c;
                    com.amazon.aps.iva.a1.f d2 = androidx.compose.foundation.layout.e.d(aVar6);
                    com.amazon.aps.iva.pe0.a<Image> value = this.p.getValue();
                    if (n.c()) {
                        fVar = f.a.d;
                    } else {
                        fVar = f.a.a;
                    }
                    com.amazon.aps.iva.ly.a.a(d2, null, value, fVar, j, 0.0f, null, null, iVar4, (Image.$stable << 6) | 6, 226);
                    b2 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.d(aVar6), com.amazon.aps.iva.ao.a.B, com.amazon.aps.iva.f1.p0.a);
                    com.amazon.aps.iva.d0.f.a(b2, iVar4, 0);
                    p3<com.amazon.aps.iva.nf.c> p3Var = this.q;
                    com.amazon.aps.iva.nf.c value2 = p3Var.getValue();
                    boolean z = value2 instanceof c.a;
                    com.amazon.aps.iva.cj.z zVar = this.i;
                    if (z) {
                        iVar4.s(1512673876);
                        aVar2 = aVar4;
                        aVar = aVar3;
                        iVar2 = iVar4;
                        com.amazon.aps.iva.k60.a.a(null, 0, null, 0, 0L, 0L, null, null, null, null, new com.amazon.aps.iva.xb0.a[]{new i(zVar)}, iVar4, 1572864, 8, 959);
                        iVar2.G();
                    } else {
                        iVar2 = iVar4;
                        aVar = aVar3;
                        aVar2 = aVar4;
                        if (value2 instanceof c.C0538c) {
                            iVar2.s(1512674049);
                            com.amazon.aps.iva.of.a.a(null, iVar2, 0, 1);
                            iVar2.G();
                        } else {
                            com.amazon.aps.iva.o0.i iVar5 = iVar2;
                            boolean z2 = value2 instanceof c.d;
                            y yVar = this.k;
                            if (z2) {
                                iVar5.s(1512674095);
                                x0.c(p3Var.getValue(), new j(yVar, null), iVar5);
                                com.amazon.aps.iva.pf.a.a(new k(zVar), null, iVar5, 0, 2);
                                iVar5.G();
                            } else {
                                boolean z3 = value2 instanceof c.f;
                                t tVar = this.j;
                                if (z3) {
                                    iVar5.s(1512674356);
                                    boolean K1 = zVar.K1();
                                    com.amazon.aps.iva.nf.c value3 = p3Var.getValue();
                                    com.amazon.aps.iva.yb0.j.d(value3, "null cannot be cast to non-null type com.crunchyroll.contentoverlays.RestrictionOverlay.Premium");
                                    c.f fVar2 = (c.f) value3;
                                    if (K1) {
                                        if (fVar2.a) {
                                            i = R.string.premium_overlay_music_subtitle;
                                        } else {
                                            i = R.string.premium_overlay_episodes_subtitle;
                                        }
                                        bVar = new com.amazon.aps.iva.qf.b(R.string.premium_overlay_title, i, R.string.premium_overlay_cta_text);
                                    } else {
                                        bVar = new com.amazon.aps.iva.qf.b(R.string.premium_overlay_offline_title, R.string.premium_overlay_offline_subtitle, R.string.premium_overlay_offline_cta_text);
                                    }
                                    com.amazon.aps.iva.qf.c.a(bVar, new l(tVar), null, iVar5, 0, 4);
                                    iVar5.G();
                                } else if (value2 instanceof c.g) {
                                    iVar5.s(1512674712);
                                    com.amazon.aps.iva.nf.c value4 = p3Var.getValue();
                                    com.amazon.aps.iva.yb0.j.d(value4, "null cannot be cast to non-null type com.crunchyroll.contentoverlays.RestrictionOverlay.PremiumDub");
                                    com.amazon.aps.iva.rf.e.a(((c.g) value4).a, yVar.d(), new m(tVar), new n(zVar), null, iVar5, 64, 16);
                                    iVar5.G();
                                } else if (value2 instanceof c.h) {
                                    iVar5.s(1512675237);
                                    com.amazon.aps.iva.nf.c value5 = p3Var.getValue();
                                    com.amazon.aps.iva.yb0.j.d(value5, "null cannot be cast to non-null type com.crunchyroll.contentoverlays.RestrictionOverlay.RecoverableError");
                                    iVar2 = iVar5;
                                    com.amazon.aps.iva.k60.a.a(null, 0, null, 0, 0L, 0L, null, null, ((c.h) value5).a, null, new com.amazon.aps.iva.xb0.a[]{new o(zVar)}, iVar2, 1572864, 8, 703);
                                    iVar2.G();
                                } else if (value2 instanceof c.i) {
                                    iVar5 = iVar5;
                                    iVar5.s(1512675488);
                                    com.amazon.aps.iva.nf.c value6 = p3Var.getValue();
                                    com.amazon.aps.iva.yb0.j.d(value6, "null cannot be cast to non-null type com.crunchyroll.contentoverlays.RestrictionOverlay.RestrictedContent");
                                    com.amazon.aps.iva.nf.c value7 = p3Var.getValue();
                                    com.amazon.aps.iva.yb0.j.d(value7, "null cannot be cast to non-null type com.crunchyroll.contentoverlays.RestrictionOverlay.RestrictedContent");
                                    yVar.h(((c.i) value6).a, ((c.i) value7).b);
                                    iVar5.s(1157296644);
                                    com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar7 = this.l;
                                    boolean H = iVar5.H(aVar7);
                                    Object t = iVar5.t();
                                    if (H || t == i.a.a) {
                                        t = new p(aVar7);
                                        iVar5.n(t);
                                    }
                                    iVar5.G();
                                    com.amazon.aps.iva.nf.b.a((com.amazon.aps.iva.xb0.l) t, null, iVar5, 0, 2);
                                    iVar5.G();
                                } else {
                                    iVar5 = iVar5;
                                    if (value2 instanceof c.j) {
                                        iVar5.s(1512675899);
                                        com.amazon.aps.iva.dj.f fVar3 = this.r;
                                        x0.c(p3Var.getValue(), new q(fVar3, null), iVar5);
                                        com.amazon.aps.iva.nf.c value8 = p3Var.getValue();
                                        com.amazon.aps.iva.yb0.j.d(value8, "null cannot be cast to non-null type com.crunchyroll.contentoverlays.RestrictionOverlay.StreamsLimitReached");
                                        c.j jVar = (c.j) value8;
                                        com.amazon.aps.iva.nf.d.a(new f(fVar3, this.s), jVar.b, new g(fVar3, zVar), null, jVar.a, iVar5, 0, 8);
                                        iVar5.G();
                                    } else if (value2 instanceof c.k) {
                                        iVar5.s(1512677089);
                                        iVar2 = iVar5;
                                        com.amazon.aps.iva.k60.a.a(null, 0, null, 0, 0L, 0L, null, null, null, null, new com.amazon.aps.iva.xb0.a[]{new h(zVar)}, iVar2, 1572864, 8, 959);
                                        iVar2.G();
                                    } else {
                                        if (value2 instanceof c.l) {
                                            iVar3 = iVar5;
                                            iVar3.s(1512677273);
                                            com.amazon.aps.iva.nf.c value9 = p3Var.getValue();
                                            com.amazon.aps.iva.yb0.j.d(value9, "null cannot be cast to non-null type com.crunchyroll.contentoverlays.RestrictionOverlay.UnrecoverableError");
                                            com.amazon.aps.iva.nf.j.a(((c.l) value9).a, null, iVar3, 0, 1);
                                            iVar3.G();
                                        } else {
                                            iVar3 = iVar5;
                                            if (value2 instanceof c.b) {
                                                iVar3.s(1512677431);
                                                com.amazon.aps.iva.hl.a.a(null, iVar3, 0, 1);
                                                iVar3.G();
                                            } else if (value2 instanceof c.e) {
                                                iVar3.s(1512677529);
                                                iVar3.G();
                                            } else {
                                                iVar3.s(1512677545);
                                                iVar3.G();
                                            }
                                        }
                                        com.amazon.aps.iva.a1.f c2 = bVar4.c(aVar6, a.C0097a.a);
                                        boolean booleanValue = this.t.getValue().booleanValue();
                                        int i2 = this.m;
                                        l0.a(booleanValue, c2, aVar, aVar2, iVar3, (i2 & 896) | ((i2 << 6) & 7168), 0);
                                        iVar3.G();
                                        iVar3.o();
                                        iVar3.G();
                                        iVar3.G();
                                    }
                                }
                            }
                            iVar3 = iVar5;
                            com.amazon.aps.iva.a1.f c22 = bVar4.c(aVar6, a.C0097a.a);
                            boolean booleanValue2 = this.t.getValue().booleanValue();
                            int i22 = this.m;
                            l0.a(booleanValue2, c22, aVar, aVar2, iVar3, (i22 & 896) | ((i22 << 6) & 7168), 0);
                            iVar3.G();
                            iVar3.o();
                            iVar3.G();
                            iVar3.G();
                        }
                    }
                    iVar3 = iVar2;
                    com.amazon.aps.iva.a1.f c222 = bVar4.c(aVar6, a.C0097a.a);
                    boolean booleanValue22 = this.t.getValue().booleanValue();
                    int i222 = this.m;
                    l0.a(booleanValue22, c222, aVar, aVar2, iVar3, (i222 & 896) | ((i222 << 6) & 7168), 0);
                    iVar3.G();
                    iVar3.o();
                    iVar3.G();
                    iVar3.G();
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerRestrictionOverlay.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ y h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ m0 m;
        public final /* synthetic */ com.amazon.aps.iva.cj.z n;
        public final /* synthetic */ t o;
        public final /* synthetic */ com.amazon.aps.iva.xh.b p;
        public final /* synthetic */ com.amazon.aps.iva.dj.f q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(y yVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar3, com.amazon.aps.iva.a1.f fVar, m0 m0Var, com.amazon.aps.iva.cj.z zVar, t tVar, com.amazon.aps.iva.xh.b bVar, com.amazon.aps.iva.dj.f fVar2, int i, int i2) {
            super(2);
            this.h = yVar;
            this.i = aVar;
            this.j = aVar2;
            this.k = aVar3;
            this.l = fVar;
            this.m = m0Var;
            this.n = zVar;
            this.o = tVar;
            this.p = bVar;
            this.q = fVar2;
            this.r = i;
            this.s = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            e.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, iVar, com.amazon.aps.iva.ff0.b.I(this.r | 1), this.s);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.hl.y r24, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r25, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r26, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r27, com.amazon.aps.iva.a1.f r28, com.amazon.aps.iva.hl.m0 r29, com.amazon.aps.iva.cj.z r30, com.amazon.aps.iva.hl.t r31, com.amazon.aps.iva.xh.b r32, com.amazon.aps.iva.dj.f r33, com.amazon.aps.iva.o0.i r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.hl.e.a(com.amazon.aps.iva.hl.y, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.hl.m0, com.amazon.aps.iva.cj.z, com.amazon.aps.iva.hl.t, com.amazon.aps.iva.xh.b, com.amazon.aps.iva.dj.f, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
