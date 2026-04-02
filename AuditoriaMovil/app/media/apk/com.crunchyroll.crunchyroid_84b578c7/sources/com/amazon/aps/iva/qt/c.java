package com.amazon.aps.iva.qt;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.n70.d;
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
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.badges.CardBadgesKt;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
/* compiled from: SmallFeedContainerCard.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: SmallFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "small_feed_container_card");
            return q.a;
        }
    }

    /* compiled from: SmallFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "title");
            return q.a;
        }
    }

    /* compiled from: SmallFeedContainerCard.kt */
    /* renamed from: com.amazon.aps.iva.qt.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0655c extends l implements p<i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;
        public final /* synthetic */ d<Panel> j;
        public final /* synthetic */ f k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0655c(Panel panel, com.amazon.aps.iva.xb0.a<q> aVar, d<Panel> dVar, f fVar, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = aVar;
            this.j = dVar;
            this.k = fVar;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            c.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return q.a;
        }
    }

    public static final void a(Panel panel, com.amazon.aps.iva.xb0.a<q> aVar, d<Panel> dVar, f fVar, i iVar, int i, int i2) {
        f.a aVar2;
        j.f(panel, "panel");
        j.f(aVar, "onClick");
        j.f(dVar, "overflowMenuProvider");
        com.amazon.aps.iva.o0.j g = iVar.g(788736380);
        int i3 = i2 & 8;
        f.a aVar3 = f.a.c;
        if (i3 != 0) {
            aVar2 = aVar3;
        } else {
            aVar2 = fVar;
        }
        e0.b bVar = e0.a;
        LabelUiModel labelUiModel$default = LabelUiModelKt.toLabelUiModel$default(panel, false, 1, null);
        f a2 = o.a(androidx.compose.foundation.f.c(e.n(e.l(aVar2, 146)), aVar), false, a.h);
        g.s(733328855);
        com.amazon.aps.iva.a1.b bVar2 = a.C0097a.a;
        d0 c = com.amazon.aps.iva.d0.f.c(bVar2, false, g);
        g.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g);
        c2 P = g.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar4 = e.a.b;
        com.amazon.aps.iva.v0.a a3 = u.a(a2);
        com.amazon.aps.iva.o0.d<?> dVar2 = g.a;
        if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
            g.z();
            if (g.M) {
                g.w(aVar4);
            } else {
                g.m();
            }
            e.a.b bVar3 = e.a.e;
            com.amazon.aps.iva.cq.b.k0(g, c, bVar3);
            e.a.d dVar3 = e.a.d;
            com.amazon.aps.iva.cq.b.k0(g, P, dVar3);
            e.a.C0752a c0752a = e.a.f;
            if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                defpackage.a.c(S, g, S, c0752a);
            }
            defpackage.b.d(0, a3, new x2(g), g, 2058660585);
            androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.a;
            g.s(-483455358);
            d0 a4 = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, g);
            g.s(-1323940314);
            int S2 = com.amazon.aps.iva.cq.b.S(g);
            c2 P2 = g.P();
            com.amazon.aps.iva.v0.a a5 = u.a(aVar3);
            f fVar2 = aVar2;
            if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar4);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, a4, bVar3);
                com.amazon.aps.iva.cq.b.k0(g, P2, dVar3);
                if (g.M || !j.a(g.e0(), Integer.valueOf(S2))) {
                    defpackage.a.c(S2, g, S2, c0752a);
                }
                x.c(0, a5, new x2(g), g, 2058660585, 733328855);
                d0 c2 = com.amazon.aps.iva.d0.f.c(bVar2, false, g);
                g.s(-1323940314);
                int S3 = com.amazon.aps.iva.cq.b.S(g);
                c2 P3 = g.P();
                com.amazon.aps.iva.v0.a a6 = u.a(aVar3);
                if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                    g.z();
                    if (g.M) {
                        g.w(aVar4);
                    } else {
                        g.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(g, c2, bVar3);
                    com.amazon.aps.iva.cq.b.k0(g, P3, dVar3);
                    if (g.M || !j.a(g.e0(), Integer.valueOf(S3))) {
                        defpackage.a.c(S3, g, S3, c0752a);
                    }
                    a6.invoke(new x2(g), g, 0);
                    g.s(2058660585);
                    com.amazon.aps.iva.ly.a.a(androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar3)), 0.6666667f), null, com.amazon.aps.iva.ab.x.m0(panel.getImages().getPostersTall()), null, com.amazon.aps.iva.ao.a.v, 0.0f, null, null, g, (Image.$stable << 6) | 6, 234);
                    com.amazon.aps.iva.d60.a.a(panel.getWatchlistStatus(), bVar4.c(aVar3, a.C0097a.c), g, 0, 0);
                    int i4 = LabelUiModel.$stable;
                    CardBadgesKt.CardBadges(labelUiModel$default, null, null, false, false, true, false, g, i4 | 196608, 94);
                    defpackage.c.c(g, false, true, false, false);
                    a4.b(panel.getTitle(), o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.o(aVar3, null, 3), 0.0f, 8, 0.0f, 0.0f, 13), false, b.h), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.j, g, 0, 3120, 55288);
                    float f = 6;
                    LabelsKt.m32Labels0OtIIsQ(labelUiModel$default, androidx.compose.foundation.layout.d.i(aVar3, 0.0f, f, 20, f, 1), false, true, false, false, false, true, com.amazon.aps.iva.ao.a.j, com.amazon.aps.iva.ao.b.o, 16, g, i4 | 12586032, 6, 116);
                    defpackage.c.c(g, false, true, false, false);
                    com.amazon.aps.iva.n70.c.a(panel, dVar, bVar4.c(androidx.compose.foundation.layout.e.o(aVar3, null, 3), a.C0097a.i), 0L, 16, 16, 0, 4, g, 12804160 | Panel.$stable | (i & 14), 72);
                    g.U(false);
                    g.U(true);
                    g.U(false);
                    g.U(false);
                    j2 X = g.X();
                    if (X != null) {
                        X.d = new C0655c(panel, aVar, dVar, fVar2, i, i2);
                        return;
                    }
                    return;
                }
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
            com.amazon.aps.iva.cq.b.W();
            throw null;
        }
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }
}
