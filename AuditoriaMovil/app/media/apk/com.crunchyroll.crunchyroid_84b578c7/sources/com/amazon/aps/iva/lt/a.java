package com.amazon.aps.iva.lt;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.mt.n;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q3;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.f0;
import com.amazon.aps.iva.xx.k;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import java.util.List;
/* compiled from: BigFeedEpisodeCard.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: BigFeedEpisodeCard.kt */
    /* renamed from: com.amazon.aps.iva.lt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0492a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.kt.a h;
        public final /* synthetic */ Panel i;
        public final /* synthetic */ com.amazon.aps.iva.jt.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0492a(com.amazon.aps.iva.kt.a aVar, Panel panel, com.amazon.aps.iva.jt.a aVar2) {
            super(0);
            this.h = aVar;
            this.i = panel;
            this.j = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.c(this.i, null, this.j);
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "big_feed_episode_card");
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.kt.a h;
        public final /* synthetic */ Panel i;
        public final /* synthetic */ com.amazon.aps.iva.jt.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.kt.a aVar, Panel panel, com.amazon.aps.iva.jt.a aVar2) {
            super(0);
            this.h = aVar;
            this.i = panel;
            this.j = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.c(this.i, null, this.j);
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ k i;
        public final /* synthetic */ com.amazon.aps.iva.jt.a j;
        public final /* synthetic */ DurationFormatter k;
        public final /* synthetic */ n l;
        public final /* synthetic */ com.amazon.aps.iva.kt.a m;
        public final /* synthetic */ com.amazon.aps.iva.a1.f n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Panel panel, k kVar, com.amazon.aps.iva.jt.a aVar, DurationFormatter durationFormatter, n nVar, com.amazon.aps.iva.kt.a aVar2, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = kVar;
            this.j = aVar;
            this.k = durationFormatter;
            this.l = nVar;
            this.m = aVar2;
            this.n = fVar;
            this.o = i;
            this.p = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "panel_title");
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.kt.a h;
        public final /* synthetic */ Panel i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.kt.a aVar, Panel panel) {
            super(1);
            this.h = aVar;
            this.i = panel;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.fs.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "it");
            this.h.b(this.i, bVar2);
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "episode_title");
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class h extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "panel_description");
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class i extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ n i;
        public final /* synthetic */ k j;
        public final /* synthetic */ com.amazon.aps.iva.kt.a k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Panel panel, n nVar, k kVar, com.amazon.aps.iva.kt.a aVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = nVar;
            this.j = kVar;
            this.k = aVar;
            this.l = fVar;
            this.m = i;
            this.n = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.b(this.h, this.i, this.j, this.k, this.l, iVar, com.amazon.aps.iva.ff0.b.I(this.m | 1), this.n);
            return q.a;
        }
    }

    /* compiled from: BigFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class j extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ LabelUiModel h;
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<Image> i;
        public final /* synthetic */ String j;
        public final /* synthetic */ com.amazon.aps.iva.a1.f k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LabelUiModel labelUiModel, com.amazon.aps.iva.pe0.a<Image> aVar, String str, com.amazon.aps.iva.a1.f fVar, boolean z, int i, int i2) {
            super(2);
            this.h = labelUiModel;
            this.i = aVar;
            this.j = str;
            this.k = fVar;
            this.l = z;
            this.m = i;
            this.n = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.c(this.h, this.i, this.j, this.k, this.l, iVar, com.amazon.aps.iva.ff0.b.I(this.m | 1), this.n);
            return q.a;
        }
    }

    public static final void a(Panel panel, k kVar, com.amazon.aps.iva.jt.a aVar, DurationFormatter durationFormatter, n nVar, com.amazon.aps.iva.kt.a aVar2, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        f.a aVar3;
        com.amazon.aps.iva.a1.f fVar2;
        com.amazon.aps.iva.o0.j jVar;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(kVar, "feedPositionState");
        com.amazon.aps.iva.yb0.j.f(aVar, "feedAnalyticsData");
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        com.amazon.aps.iva.yb0.j.f(nVar, "seasonAndEpisodeTitleFormatter");
        com.amazon.aps.iva.yb0.j.f(aVar2, "clickHandler");
        com.amazon.aps.iva.o0.j g2 = iVar.g(718106010);
        int i4 = i3 & 64;
        f.a aVar4 = f.a.c;
        if (i4 != 0) {
            aVar3 = aVar4;
        } else {
            aVar3 = fVar;
        }
        e0.b bVar = e0.a;
        boolean z3 = false;
        LabelUiModel labelUiModel$default = LabelUiModelKt.toLabelUiModel$default(panel, false, 1, null);
        String formatDuration = durationFormatter.formatDuration(com.amazon.aps.iva.gr.n.x(panel.getEpisodeMetadata().getDurationMs()));
        com.amazon.aps.iva.pe0.a m0 = x.m0(panel.getImages().getThumbnails());
        q3 q3Var = androidx.compose.ui.platform.d.b;
        if (com.amazon.aps.iva.aq.k.n((Context) g2.i(q3Var)).c()) {
            if (((Configuration) g2.i(androidx.compose.ui.platform.d.a)).screenWidthDp <= 768 && !com.amazon.aps.iva.aq.k.n((Context) g2.i(q3Var)).S0()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z3 = true;
            }
        }
        com.amazon.aps.iva.o0.d<?> dVar = g2.a;
        if (z3) {
            g2.s(-1664894077);
            com.amazon.aps.iva.a1.f a = o.a(androidx.compose.foundation.f.c(androidx.compose.foundation.layout.d.g(aVar3, com.amazon.aps.iva.cq.b.N(R.dimen.big_feed_card_margin_horizontal, g2), 0.0f, 2), new C0492a(aVar2, panel, aVar)), false, b.h);
            b.C0098b c0098b = a.C0097a.k;
            g2.s(693286680);
            d0 a2 = v1.a(com.amazon.aps.iva.d0.a.a, c0098b, g2);
            g2.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g2);
            c2 P = g2.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            com.amazon.aps.iva.a1.f fVar3 = aVar3;
            e.a aVar5 = e.a.b;
            com.amazon.aps.iva.v0.a a3 = u.a(a);
            if (dVar instanceof com.amazon.aps.iva.o0.d) {
                g2.z();
                if (g2.M) {
                    g2.w(aVar5);
                } else {
                    g2.m();
                }
                com.amazon.aps.iva.cq.b.k0(g2, a2, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g2, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g2.M || !com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S))) {
                    defpackage.a.c(S, g2, S, c0752a);
                }
                defpackage.b.d(0, a3, new x2(g2), g2, 2058660585);
                c(labelUiModel$default, m0, formatDuration, null, false, g2, LabelUiModel.$stable | 24576 | (Image.$stable << 3), 8);
                if (1.0f > 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true);
                    aVar4.o(layoutWeightElement);
                    fVar2 = fVar3;
                    b(panel, nVar, kVar, aVar2, androidx.compose.foundation.layout.d.i(layoutWeightElement, 12, 0.0f, 0.0f, 0.0f, 14), g2, Panel.$stable | 64 | (i2 & 14) | ((i2 << 3) & 896) | ((i2 >> 6) & 7168), 0);
                    defpackage.c.c(g2, false, true, false, false);
                    g2.U(false);
                    jVar = g2;
                } else {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        } else {
            fVar2 = aVar3;
            jVar = g2;
            jVar.s(-1664893154);
            com.amazon.aps.iva.a1.f c2 = androidx.compose.foundation.f.c(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(fVar2)), com.amazon.aps.iva.cq.b.N(R.dimen.big_feed_card_margin_horizontal, jVar), 0.0f, 2), new c(aVar2, panel, aVar));
            jVar.s(-483455358);
            d0 a4 = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, jVar);
            jVar.s(-1323940314);
            int S2 = com.amazon.aps.iva.cq.b.S(jVar);
            c2 P2 = jVar.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar6 = e.a.b;
            com.amazon.aps.iva.v0.a a5 = u.a(c2);
            if (dVar instanceof com.amazon.aps.iva.o0.d) {
                jVar.z();
                if (jVar.M) {
                    jVar.w(aVar6);
                } else {
                    jVar.m();
                }
                com.amazon.aps.iva.cq.b.k0(jVar, a4, e.a.e);
                com.amazon.aps.iva.cq.b.k0(jVar, P2, e.a.d);
                e.a.C0752a c0752a2 = e.a.f;
                if (jVar.M || !com.amazon.aps.iva.yb0.j.a(jVar.e0(), Integer.valueOf(S2))) {
                    defpackage.a.c(S2, jVar, S2, c0752a2);
                }
                defpackage.b.d(0, a5, new x2(jVar), jVar, 2058660585);
                c(labelUiModel$default, m0, formatDuration, null, false, jVar, LabelUiModel.$stable | (Image.$stable << 3), 24);
                b(panel, nVar, kVar, aVar2, androidx.compose.foundation.layout.d.i(aVar4, 0.0f, 14, 0.0f, 0.0f, 13), jVar, Panel.$stable | 24640 | (i2 & 14) | ((i2 << 3) & 896) | ((i2 >> 6) & 7168), 0);
                defpackage.c.c(jVar, false, true, false, false);
                jVar.U(false);
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = jVar.X();
        if (X != null) {
            X.d = new d(panel, kVar, aVar, durationFormatter, nVar, aVar2, fVar2, i2, i3);
        }
    }

    public static final void b(Panel panel, n nVar, k kVar, com.amazon.aps.iva.kt.a aVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        f.a aVar2;
        boolean z;
        List K;
        com.amazon.aps.iva.o0.j g2 = iVar.g(1751353027);
        int i4 = i3 & 16;
        f.a aVar3 = f.a.c;
        if (i4 != 0) {
            aVar2 = aVar3;
        } else {
            aVar2 = fVar;
        }
        e0.b bVar = e0.a;
        g2.s(-483455358);
        d0 a = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, g2);
        g2.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g2);
        c2 P = g2.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar4 = e.a.b;
        com.amazon.aps.iva.v0.a a2 = u.a(aVar2);
        int i5 = ((((((i2 >> 12) & 14) << 3) & 112) << 9) & 7168) | 6;
        com.amazon.aps.iva.o0.d<?> dVar = g2.a;
        if (dVar instanceof com.amazon.aps.iva.o0.d) {
            g2.z();
            if (g2.M) {
                g2.w(aVar4);
            } else {
                g2.m();
            }
            e.a.b bVar2 = e.a.e;
            com.amazon.aps.iva.cq.b.k0(g2, a, bVar2);
            e.a.d dVar2 = e.a.d;
            com.amazon.aps.iva.cq.b.k0(g2, P, dVar2);
            e.a.C0752a c0752a = e.a.f;
            if (g2.M || !com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S))) {
                defpackage.a.c(S, g2, S, c0752a);
            }
            defpackage.b.d((i5 >> 3) & 112, a2, new x2(g2), g2, 2058660585);
            b.C0098b c0098b = a.C0097a.k;
            g2.s(693286680);
            d0 a3 = v1.a(com.amazon.aps.iva.d0.a.a, c0098b, g2);
            g2.s(-1323940314);
            int S2 = com.amazon.aps.iva.cq.b.S(g2);
            c2 P2 = g2.P();
            com.amazon.aps.iva.v0.a a4 = u.a(aVar3);
            if (dVar instanceof com.amazon.aps.iva.o0.d) {
                g2.z();
                if (g2.M) {
                    g2.w(aVar4);
                } else {
                    g2.m();
                }
                com.amazon.aps.iva.cq.b.k0(g2, a3, bVar2);
                com.amazon.aps.iva.cq.b.k0(g2, P2, dVar2);
                if (g2.M || !com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S2))) {
                    defpackage.a.c(S2, g2, S2, c0752a);
                }
                a4.invoke(new x2(g2), g2, 0);
                g2.s(2058660585);
                String d2 = f0.d(panel);
                long j2 = com.amazon.aps.iva.ao.a.j;
                a0 a0Var = com.amazon.aps.iva.ao.b.j;
                if (1.0f > 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true);
                    aVar3.o(layoutWeightElement);
                    a4.b(d2, o.a(layoutWeightElement, false, e.h), j2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, a0Var, g2, 0, 3120, 55288);
                    com.amazon.aps.iva.f60.p.a(panel.getWatchlistStatus(), null, new f(aVar, panel), g2, 0, 2);
                    defpackage.c.c(g2, false, true, false, false);
                    com.amazon.aps.iva.a1.f f2 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.d.i(aVar3, 0.0f, 10, 0.0f, 0.0f, 13)), 3);
                    if (kVar == k.ODD) {
                        K = f1.K(new com.amazon.aps.iva.f1.x(com.amazon.aps.iva.ao.a.n), new com.amazon.aps.iva.f1.x(com.amazon.aps.iva.ao.a.o));
                    } else {
                        K = f1.K(new com.amazon.aps.iva.f1.x(com.amazon.aps.iva.ao.a.p), new com.amazon.aps.iva.f1.x(com.amazon.aps.iva.ao.a.q));
                    }
                    com.amazon.aps.iva.d0.f.a(androidx.compose.foundation.c.a(f2, s.a.a(K)), g2, 0);
                    String d3 = nVar.d(panel);
                    float f3 = 8;
                    com.amazon.aps.iva.a1.f a5 = o.a(androidx.compose.foundation.layout.d.i(aVar3, 0.0f, f3, 0.0f, 0.0f, 13), false, g.h);
                    a0 a0Var2 = com.amazon.aps.iva.ao.b.b;
                    long j3 = com.amazon.aps.iva.ao.a.r;
                    a4.b(d3, a5, j3, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, a0Var2, g2, 0, 3120, 55288);
                    LabelsKt.m32Labels0OtIIsQ(LabelUiModelKt.toLabelUiModel$default(panel, false, 1, null), androidx.compose.foundation.layout.d.i(aVar3, 0.0f, f3, 0.0f, 0.0f, 13), false, false, false, false, false, true, j2, null, 0.0f, g2, LabelUiModel.$stable | 12582960, 0, 1660);
                    a4.b(panel.getDescription(), o.a(androidx.compose.foundation.layout.d.i(aVar3, 0.0f, f3, 0.0f, 0.0f, 13), false, h.h), j3, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, a0Var, g2, 0, 3120, 55288);
                    g2.U(false);
                    g2.U(true);
                    g2.U(false);
                    g2.U(false);
                    j2 X = g2.X();
                    if (X != null) {
                        X.d = new i(panel, nVar, kVar, aVar, aVar2, i2, i3);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            com.amazon.aps.iva.cq.b.W();
            throw null;
        }
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.ellation.crunchyroll.ui.labels.LabelUiModel r30, com.amazon.aps.iva.pe0.a<com.ellation.crunchyroll.api.etp.model.Image> r31, java.lang.String r32, com.amazon.aps.iva.a1.f r33, boolean r34, com.amazon.aps.iva.o0.i r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.lt.a.c(com.ellation.crunchyroll.ui.labels.LabelUiModel, com.amazon.aps.iva.pe0.a, java.lang.String, com.amazon.aps.iva.a1.f, boolean, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
