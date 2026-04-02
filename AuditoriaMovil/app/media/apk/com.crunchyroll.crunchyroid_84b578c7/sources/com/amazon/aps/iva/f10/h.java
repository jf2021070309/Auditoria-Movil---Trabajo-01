package com.amazon.aps.iva.f10;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.b1;
import com.amazon.aps.iva.d0.j0;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.badges.CardBadgesKt;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import com.ellation.crunchyroll.ui.overlays.CardSelectionOverlayKt;
import java.util.Arrays;
/* compiled from: DownloadsCard.kt */
/* loaded from: classes2.dex */
public final class h {

    /* compiled from: DownloadsCard.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ com.amazon.aps.iva.d10.g i;
        public final /* synthetic */ com.amazon.aps.iva.d10.i j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, com.amazon.aps.iva.d10.g gVar, com.amazon.aps.iva.d10.i iVar, com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = z;
            this.i = gVar;
            this.j = iVar;
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            if (this.h) {
                this.i.q3(this.j.b());
            } else {
                this.k.invoke();
            }
            return q.a;
        }
    }

    /* compiled from: DownloadsCard.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "downloads_card");
            return q.a;
        }
    }

    /* compiled from: DownloadsCard.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "title");
            return q.a;
        }
    }

    /* compiled from: DownloadsCard.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "download_status");
            return q.a;
        }
    }

    /* compiled from: DownloadsCard.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.d10.g h;
        public final /* synthetic */ com.amazon.aps.iva.d10.i i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.d10.g gVar, com.amazon.aps.iva.d10.i iVar) {
            super(0);
            this.h = gVar;
            this.i = iVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.q3(this.i.b());
            return q.a;
        }
    }

    /* compiled from: DownloadsCard.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.d10.i h;
        public final /* synthetic */ com.amazon.aps.iva.d10.g i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;
        public final /* synthetic */ com.amazon.aps.iva.n70.d<com.amazon.aps.iva.d10.i> k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.d10.i iVar, com.amazon.aps.iva.d10.g gVar, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.n70.d<com.amazon.aps.iva.d10.i> dVar, com.amazon.aps.iva.a1.f fVar, boolean z, int i, int i2) {
            super(2);
            this.h = iVar;
            this.i = gVar;
            this.j = aVar;
            this.k = dVar;
            this.l = fVar;
            this.m = z;
            this.n = i;
            this.o = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            h.a(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return q.a;
        }
    }

    /* compiled from: DownloadsCard.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.d10.j.values().length];
            try {
                iArr[com.amazon.aps.iva.d10.j.COMPLETED_EPISODES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.d10.j.COMPLETED_MOVIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static final void a(com.amazon.aps.iva.d10.i iVar, com.amazon.aps.iva.d10.g gVar, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.n70.d<com.amazon.aps.iva.d10.i> dVar, com.amazon.aps.iva.a1.f fVar, boolean z, com.amazon.aps.iva.o0.i iVar2, int i, int i2) {
        f.a aVar2;
        boolean z2;
        e.a.C0752a c0752a;
        Panel panel;
        e.a.C0752a c0752a2;
        e.a.d dVar2;
        e.a aVar3;
        boolean z3;
        f.a aVar4;
        ?? r10;
        String quantityString;
        int i3;
        com.amazon.aps.iva.yb0.j.f(iVar, "downloadPanel");
        com.amazon.aps.iva.yb0.j.f(gVar, "cardEditListener");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        com.amazon.aps.iva.yb0.j.f(dVar, "overflowMenuProvider");
        com.amazon.aps.iva.o0.j g2 = iVar2.g(-787297861);
        int i4 = i2 & 16;
        f.a aVar5 = f.a.c;
        if (i4 != 0) {
            aVar2 = aVar5;
        } else {
            aVar2 = fVar;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        e0.b bVar = e0.a;
        com.amazon.aps.iva.a1.f a2 = o.a(j0.a(androidx.compose.foundation.f.c(aVar2, new a(z2, gVar, iVar, aVar)), b1.Max), false, b.h);
        g2.s(733328855);
        com.amazon.aps.iva.a1.b bVar2 = a.C0097a.a;
        d0 c2 = com.amazon.aps.iva.d0.f.c(bVar2, false, g2);
        g2.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g2);
        c2 P = g2.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar6 = e.a.b;
        com.amazon.aps.iva.v0.a a3 = u.a(a2);
        com.amazon.aps.iva.o0.d<?> dVar3 = g2.a;
        if (dVar3 instanceof com.amazon.aps.iva.o0.d) {
            g2.z();
            if (g2.M) {
                g2.w(aVar6);
            } else {
                g2.m();
            }
            e.a.b bVar3 = e.a.e;
            com.amazon.aps.iva.cq.b.k0(g2, c2, bVar3);
            e.a.d dVar4 = e.a.d;
            com.amazon.aps.iva.cq.b.k0(g2, P, dVar4);
            e.a.C0752a c0752a3 = e.a.f;
            com.amazon.aps.iva.a1.f fVar2 = aVar2;
            if (g2.M || !com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S))) {
                defpackage.a.c(S, g2, S, c0752a3);
            }
            defpackage.b.d(0, a3, new x2(g2), g2, 2058660585);
            androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.a;
            g2.s(-483455358);
            d0 a4 = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, g2);
            g2.s(-1323940314);
            int S2 = com.amazon.aps.iva.cq.b.S(g2);
            c2 P2 = g2.P();
            com.amazon.aps.iva.v0.a a5 = u.a(aVar5);
            if (dVar3 instanceof com.amazon.aps.iva.o0.d) {
                g2.z();
                if (g2.M) {
                    g2.w(aVar6);
                } else {
                    g2.m();
                }
                com.amazon.aps.iva.cq.b.k0(g2, a4, bVar3);
                com.amazon.aps.iva.cq.b.k0(g2, P2, dVar4);
                if (g2.M || !com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S2))) {
                    defpackage.a.c(S2, g2, S2, c0752a3);
                }
                x.c(0, a5, new x2(g2), g2, 2058660585, 733328855);
                d0 c3 = com.amazon.aps.iva.d0.f.c(bVar2, false, g2);
                g2.s(-1323940314);
                int S3 = com.amazon.aps.iva.cq.b.S(g2);
                c2 P3 = g2.P();
                com.amazon.aps.iva.v0.a a6 = u.a(aVar5);
                if (dVar3 instanceof com.amazon.aps.iva.o0.d) {
                    g2.z();
                    if (g2.M) {
                        g2.w(aVar6);
                    } else {
                        g2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(g2, c3, bVar3);
                    com.amazon.aps.iva.cq.b.k0(g2, P3, dVar4);
                    if (!g2.M && com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S3))) {
                        c0752a = c0752a3;
                    } else {
                        c0752a = c0752a3;
                        defpackage.a.c(S3, g2, S3, c0752a);
                    }
                    defpackage.b.d(0, a6, new x2(g2), g2, 2058660585);
                    Panel panel2 = iVar.a;
                    com.amazon.aps.iva.ly.a.a(androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.e(aVar5), 0.6666667f), null, com.amazon.aps.iva.ab.x.m0(panel2.getImages().getPostersTall()), null, com.amazon.aps.iva.ao.a.v, 0.0f, null, null, g2, (Image.$stable << 6) | 6, 234);
                    g2.s(831523584);
                    if (!z2) {
                        panel = panel2;
                        c0752a2 = c0752a;
                        dVar2 = dVar4;
                        aVar3 = aVar6;
                        z3 = z2;
                        aVar4 = aVar5;
                        CardBadgesKt.CardBadges(LabelUiModelKt.toLabelUiModel$default(panel2, false, 1, null), null, null, false, false, true, false, g2, LabelUiModel.$stable | 196608, 94);
                        r10 = 0;
                    } else {
                        panel = panel2;
                        c0752a2 = c0752a;
                        dVar2 = dVar4;
                        aVar3 = aVar6;
                        z3 = z2;
                        aVar4 = aVar5;
                        r10 = 0;
                    }
                    defpackage.c.c(g2, r10, r10, true, r10);
                    g2.U(r10);
                    float f2 = 8;
                    a4.b(panel.getTitle(), o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar4)), 0.0f, f2, 0.0f, 0.0f, 13), r10, c.h), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.j, g2, 0, 3120, 55288);
                    a.h hVar = new a.h(f2, new com.amazon.aps.iva.d0.c());
                    b.C0098b c0098b = a.C0097a.k;
                    float f3 = 6;
                    com.amazon.aps.iva.a1.f g3 = androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar4)), 0.0f, f3, 1);
                    g2.s(693286680);
                    d0 a7 = v1.a(hVar, c0098b, g2);
                    g2.s(-1323940314);
                    int S4 = com.amazon.aps.iva.cq.b.S(g2);
                    c2 P4 = g2.P();
                    com.amazon.aps.iva.v0.a a8 = u.a(g3);
                    if (dVar3 instanceof com.amazon.aps.iva.o0.d) {
                        g2.z();
                        if (g2.M) {
                            g2.w(aVar3);
                        } else {
                            g2.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(g2, a7, bVar3);
                        com.amazon.aps.iva.cq.b.k0(g2, P4, dVar2);
                        if (g2.M || !com.amazon.aps.iva.yb0.j.a(g2.e0(), Integer.valueOf(S4))) {
                            defpackage.a.c(S4, g2, S4, c0752a2);
                        }
                        defpackage.b.d(r10, a8, new x2(g2), g2, 2058660585);
                        int[] iArr = g.a;
                        com.amazon.aps.iva.d10.j jVar = iVar.b;
                        int i5 = iArr[jVar.ordinal()];
                        if (i5 != 1 && i5 != 2) {
                            g2.s(1549996122);
                            quantityString = defpackage.i.E(jVar.getLabel(), g2);
                            g2.U(r10);
                        } else {
                            g2.s(1549995815);
                            int label = jVar.getLabel();
                            int i6 = iVar.c;
                            e0.b bVar5 = e0.a;
                            quantityString = z.N(g2).getQuantityString(label, i6, Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1));
                            com.amazon.aps.iva.yb0.j.e(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
                            g2.U(r10);
                        }
                        a4.b(quantityString, o.a(androidx.compose.foundation.layout.d.i(aVar4, 0.0f, f3, 0.0f, 0.0f, 13), r10, d.h), jVar.m9getLabelColor0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.o, g2, 0, 3120, 55288);
                        defpackage.c.c(g2, r10, true, r10, r10);
                        defpackage.c.c(g2, r10, true, r10, r10);
                        g2.s(1860921770);
                        if (z3) {
                            com.amazon.aps.iva.a1.f c4 = androidx.compose.foundation.f.c(androidx.compose.foundation.layout.e.d(aVar4), new e(gVar, iVar));
                            if (iVar.d) {
                                i3 = R.string.desc_unselect_download_item;
                            } else {
                                i3 = R.string.desc_select_download_item;
                            }
                            CardSelectionOverlayKt.CardSelectionOverlay(iVar.d, defpackage.i.E(i3, g2), c4, g2, 0, 0);
                        }
                        g2.U(r10);
                        boolean z4 = r10;
                        com.amazon.aps.iva.n70.c.a(iVar, dVar, bVar4.c(androidx.compose.foundation.layout.e.o(aVar4, null, 3), a.C0097a.i), 0L, 16, 16, 0, 4, g2, 12804168, 72);
                        defpackage.c.c(g2, z4, true, z4, z4);
                        e0.b bVar6 = e0.a;
                        j2 X = g2.X();
                        if (X != null) {
                            X.d = new f(iVar, gVar, aVar, dVar, fVar2, z3, i, i2);
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
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }
}
