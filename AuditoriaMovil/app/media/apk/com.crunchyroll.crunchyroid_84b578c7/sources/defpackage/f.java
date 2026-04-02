package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.badges.CardBadgesKt;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
/* compiled from: CrunchylistSearchItemCard.kt */
/* renamed from: f  reason: default package */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: CrunchylistSearchItemCard.kt */
    /* renamed from: f$a */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Panel, q> h;
        public final /* synthetic */ com.amazon.aps.iva.iv.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.l<? super Panel, q> lVar, com.amazon.aps.iva.iv.c cVar) {
            super(0);
            this.h = lVar;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke(this.i.c);
            return q.a;
        }
    }

    /* compiled from: CrunchylistSearchItemCard.kt */
    /* renamed from: f$b */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "crunchylist_search_item_card");
            return q.a;
        }
    }

    /* compiled from: CrunchylistSearchItemCard.kt */
    /* renamed from: f$c */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "item_title");
            return q.a;
        }
    }

    /* compiled from: CrunchylistSearchItemCard.kt */
    /* renamed from: f$d */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "item_metadata");
            return q.a;
        }
    }

    /* compiled from: CrunchylistSearchItemCard.kt */
    /* renamed from: f$e */
    /* loaded from: classes.dex */
    public static final class e extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.iv.c h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Panel, q> i;
        public final /* synthetic */ com.amazon.aps.iva.hv.p j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.amazon.aps.iva.iv.c cVar, com.amazon.aps.iva.xb0.l<? super Panel, q> lVar, com.amazon.aps.iva.hv.p pVar, int i) {
            super(2);
            this.h = cVar;
            this.i = lVar;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.xb0.l<Panel, q> lVar = this.i;
            com.amazon.aps.iva.hv.p pVar = this.j;
            f.a(this.h, lVar, pVar, iVar, I);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.iv.c cVar, com.amazon.aps.iva.xb0.l<? super Panel, q> lVar, com.amazon.aps.iva.hv.p pVar, i iVar, int i) {
        int i2;
        com.amazon.aps.iva.pe0.a m0;
        int i3;
        float f;
        com.amazon.aps.iva.a1.f b2;
        boolean z;
        e.a.C0752a c0752a;
        e.a.C0752a c0752a2;
        int i4;
        int i5;
        int i6;
        j.f(cVar, "item");
        j.f(lVar, "onCrunchylistSearchItemClick");
        j.f(pVar, "metadataFormatter");
        com.amazon.aps.iva.o0.j g = iVar.g(-1567362344);
        if ((i & 14) == 0) {
            if (g.H(cVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g.v(lVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (g.H(pVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i2 & 731) == 146 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            boolean c2 = k.n((Context) g.i(androidx.compose.ui.platform.d.b)).c();
            Panel panel = cVar.c;
            if (c2) {
                m0 = x.m0(panel.getImages().getPostersWide());
            } else {
                m0 = x.m0(panel.getImages().getPostersTall());
            }
            com.amazon.aps.iva.pe0.a aVar = m0;
            if (c2) {
                i3 = 90;
            } else {
                i3 = 117;
            }
            float f2 = i3;
            if (c2) {
                f = 1.7777778f;
            } else {
                f = 0.6666667f;
            }
            float f3 = f;
            f.a aVar2 = f.a.c;
            b2 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.n(aVar2), f2)), com.amazon.aps.iva.f1.x.b, p0.a);
            com.amazon.aps.iva.a1.f a2 = o.a(androidx.compose.foundation.f.c(b2, new a(lVar, cVar)), false, b.h);
            g.s(693286680);
            a.i iVar2 = com.amazon.aps.iva.d0.a.a;
            b.C0098b c0098b = a.C0097a.j;
            d0 a3 = v1.a(iVar2, c0098b, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar3 = e.a.b;
            com.amazon.aps.iva.v0.a a4 = u.a(a2);
            com.amazon.aps.iva.o0.d<?> dVar = g.a;
            if (dVar instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar3);
                } else {
                    g.m();
                }
                e.a.b bVar2 = e.a.e;
                com.amazon.aps.iva.cq.b.k0(g, a3, bVar2);
                e.a.d dVar2 = e.a.d;
                com.amazon.aps.iva.cq.b.k0(g, P, dVar2);
                e.a.C0752a c0752a3 = e.a.f;
                if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g, S, c0752a3);
                }
                defpackage.b.d(0, a4, new x2(g), g, 2058660585);
                com.amazon.aps.iva.a1.f a5 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.f(aVar2, f2), f3);
                g.s(733328855);
                d0 c3 = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, g);
                g.s(-1323940314);
                int S2 = com.amazon.aps.iva.cq.b.S(g);
                c2 P2 = g.P();
                com.amazon.aps.iva.v0.a a6 = u.a(a5);
                if (dVar instanceof com.amazon.aps.iva.o0.d) {
                    g.z();
                    if (g.M) {
                        g.w(aVar3);
                    } else {
                        g.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(g, c3, bVar2);
                    com.amazon.aps.iva.cq.b.k0(g, P2, dVar2);
                    if (g.M || !j.a(g.e0(), Integer.valueOf(S2))) {
                        defpackage.a.c(S2, g, S2, c0752a3);
                    }
                    defpackage.b.d(0, a6, new x2(g), g, 2058660585);
                    androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.a;
                    com.amazon.aps.iva.ly.a.a(androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.f(aVar2, f2), f3), null, aVar, null, com.amazon.aps.iva.ao.a.v, 0.0f, null, null, g, Image.$stable << 6, 234);
                    com.amazon.aps.iva.d60.a.a(panel.getWatchlistStatus(), bVar3.c(aVar2, a.C0097a.c), g, 0, 0);
                    LabelUiModel labelUiModel$default = LabelUiModelKt.toLabelUiModel$default(panel, false, 1, null);
                    com.amazon.aps.iva.a1.f a7 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.f(aVar2, f2), f3);
                    int i7 = LabelUiModel.$stable;
                    CardBadgesKt.CardBadges(labelUiModel$default, a7, null, true, false, true, false, g, i7 | 199680, 84);
                    defpackage.c.c(g, false, true, false, false);
                    com.amazon.aps.iva.a1.f c4 = androidx.compose.foundation.layout.e.c(aVar2);
                    j.f(c4, "<this>");
                    if (1.0f > 0.0d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        com.amazon.aps.iva.a1.f o = c4.o(new LayoutWeightElement(true));
                        a.b bVar4 = com.amazon.aps.iva.d0.a.e;
                        g.s(-483455358);
                        d0 a8 = m.a(bVar4, a.C0097a.m, g);
                        g.s(-1323940314);
                        int S3 = com.amazon.aps.iva.cq.b.S(g);
                        c2 P3 = g.P();
                        com.amazon.aps.iva.v0.a a9 = u.a(o);
                        if (dVar instanceof com.amazon.aps.iva.o0.d) {
                            g.z();
                            if (g.M) {
                                g.w(aVar3);
                            } else {
                                g.m();
                            }
                            com.amazon.aps.iva.cq.b.k0(g, a8, bVar2);
                            com.amazon.aps.iva.cq.b.k0(g, P3, dVar2);
                            if (!g.M && j.a(g.e0(), Integer.valueOf(S3))) {
                                c0752a = c0752a3;
                            } else {
                                c0752a = c0752a3;
                                defpackage.a.c(S3, g, S3, c0752a);
                            }
                            a9.invoke(new x2(g), g, 0);
                            g.s(2058660585);
                            float f4 = 12;
                            float f5 = 8;
                            e.a.C0752a c0752a4 = c0752a;
                            a4.b(panel.getTitle(), o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar2)), f4, 0.0f, f5, 4, 2), false, c.h), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.j, g, 0, 3120, 55288);
                            String a10 = pVar.a(panel);
                            a0 a0Var = com.amazon.aps.iva.ao.b.o;
                            a4.b(a10, o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar2)), f4, 0.0f, f5, f4, 2), false, d.h), com.amazon.aps.iva.ao.a.i, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, a0Var, g, 0, 3120, 55288);
                            com.amazon.aps.iva.a1.f i8 = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.e(aVar2), f4, 0.0f, 0.0f, 0.0f, 14);
                            a.f fVar = com.amazon.aps.iva.d0.a.f;
                            g.s(693286680);
                            d0 a11 = v1.a(fVar, c0098b, g);
                            g.s(-1323940314);
                            int S4 = com.amazon.aps.iva.cq.b.S(g);
                            c2 P4 = g.P();
                            com.amazon.aps.iva.v0.a a12 = u.a(i8);
                            if (dVar instanceof com.amazon.aps.iva.o0.d) {
                                g.z();
                                if (g.M) {
                                    g.w(aVar3);
                                } else {
                                    g.m();
                                }
                                com.amazon.aps.iva.cq.b.k0(g, a11, bVar2);
                                com.amazon.aps.iva.cq.b.k0(g, P4, dVar2);
                                if (!g.M && j.a(g.e0(), Integer.valueOf(S4))) {
                                    c0752a2 = c0752a4;
                                } else {
                                    c0752a2 = c0752a4;
                                    defpackage.a.c(S4, g, S4, c0752a2);
                                }
                                defpackage.b.d(0, a12, new x2(g), g, 2058660585);
                                com.amazon.aps.iva.a1.f f6 = androidx.compose.foundation.layout.e.f(aVar2, 20);
                                d0 c5 = defpackage.e.c(g, 733328855, a.C0097a.d, false, g, -1323940314);
                                int S5 = com.amazon.aps.iva.cq.b.S(g);
                                c2 P5 = g.P();
                                com.amazon.aps.iva.v0.a a13 = u.a(f6);
                                if (dVar instanceof com.amazon.aps.iva.o0.d) {
                                    g.z();
                                    if (g.M) {
                                        g.w(aVar3);
                                    } else {
                                        g.m();
                                    }
                                    com.amazon.aps.iva.cq.b.k0(g, c5, bVar2);
                                    com.amazon.aps.iva.cq.b.k0(g, P5, dVar2);
                                    if (g.M || !j.a(g.e0(), Integer.valueOf(S5))) {
                                        defpackage.a.c(S5, g, S5, c0752a2);
                                    }
                                    defpackage.b.d(0, a13, new x2(g), g, 2058660585);
                                    e.a.C0752a c0752a5 = c0752a2;
                                    LabelsKt.m32Labels0OtIIsQ(LabelUiModelKt.toLabelUiModel$default(panel, false, 1, null), null, false, false, false, false, false, true, com.amazon.aps.iva.ao.a.j, a0Var, 0.0f, g, i7 | 12582912, 0, 1150);
                                    defpackage.c.c(g, false, true, false, false);
                                    defpackage.c.c(g, false, true, false, false);
                                    defpackage.c.c(g, false, true, false, false);
                                    com.amazon.aps.iva.a1.f l = androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.e.c(aVar2), 48);
                                    b.a aVar4 = a.C0097a.o;
                                    g.s(-483455358);
                                    d0 a14 = m.a(bVar4, aVar4, g);
                                    g.s(-1323940314);
                                    int S6 = com.amazon.aps.iva.cq.b.S(g);
                                    c2 P6 = g.P();
                                    com.amazon.aps.iva.v0.a a15 = u.a(l);
                                    if (dVar instanceof com.amazon.aps.iva.o0.d) {
                                        g.z();
                                        if (g.M) {
                                            g.w(aVar3);
                                        } else {
                                            g.m();
                                        }
                                        com.amazon.aps.iva.cq.b.k0(g, a14, bVar2);
                                        com.amazon.aps.iva.cq.b.k0(g, P6, dVar2);
                                        if (g.M || !j.a(g.e0(), Integer.valueOf(S6))) {
                                            defpackage.a.c(S6, g, S6, c0752a5);
                                        }
                                        defpackage.b.d(0, a15, new x2(g), g, 2058660585);
                                        com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_add_enabled, g), null, androidx.compose.foundation.layout.e.l(aVar2, 24), a.C0097a.e, null, 0.0f, null, g, 3512, 112);
                                        defpackage.c.c(g, false, true, false, false);
                                        defpackage.c.c(g, false, true, false, false);
                                        e0.b bVar5 = e0.a;
                                    } else {
                                        com.amazon.aps.iva.cq.b.W();
                                        throw null;
                                    }
                                } else {
                                    com.amazon.aps.iva.cq.b.W();
                                    throw null;
                                }
                            } else {
                                com.amazon.aps.iva.cq.b.W();
                                throw null;
                            }
                        } else {
                            com.amazon.aps.iva.cq.b.W();
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new e(cVar, lVar, pVar, i);
        }
    }
}
