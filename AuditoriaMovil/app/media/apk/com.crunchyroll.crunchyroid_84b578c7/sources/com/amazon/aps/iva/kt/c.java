package com.amazon.aps.iva.kt;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.d0.y1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.f60.t;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q3;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.UpNext;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import java.util.List;
import java.util.Locale;
/* compiled from: BigFeedContainerCard.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.kt.a h;
        public final /* synthetic */ Panel i;
        public final /* synthetic */ com.amazon.aps.iva.jt.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.kt.a aVar, Panel panel, com.amazon.aps.iva.jt.a aVar2) {
            super(0);
            this.h = aVar;
            this.i = panel;
            this.j = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.a(this.i, this.j);
            return q.a;
        }
    }

    /* compiled from: BigFeedContainerCard.kt */
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
            y.e(c0Var2, "big_feed_container_card");
            return q.a;
        }
    }

    /* compiled from: BigFeedContainerCard.kt */
    /* renamed from: com.amazon.aps.iva.kt.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0458c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.kt.a h;
        public final /* synthetic */ Panel i;
        public final /* synthetic */ com.amazon.aps.iva.jt.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0458c(com.amazon.aps.iva.kt.a aVar, Panel panel, com.amazon.aps.iva.jt.a aVar2) {
            super(0);
            this.h = aVar;
            this.i = panel;
            this.j = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.a(this.i, this.j);
            return q.a;
        }
    }

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ UpNext i;
        public final /* synthetic */ com.amazon.aps.iva.xx.k j;
        public final /* synthetic */ com.amazon.aps.iva.mt.l k;
        public final /* synthetic */ com.amazon.aps.iva.jt.a l;
        public final /* synthetic */ com.amazon.aps.iva.kt.a m;
        public final /* synthetic */ com.amazon.aps.iva.a1.f n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Panel panel, UpNext upNext, com.amazon.aps.iva.xx.k kVar, com.amazon.aps.iva.mt.l lVar, com.amazon.aps.iva.jt.a aVar, com.amazon.aps.iva.kt.a aVar2, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = upNext;
            this.j = kVar;
            this.k = lVar;
            this.l = aVar;
            this.m = aVar2;
            this.n = fVar;
            this.o = i;
            this.p = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            c.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return q.a;
        }
    }

    /* compiled from: BigFeedContainerCard.kt */
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

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final f h = new f();

        public f() {
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

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ UpNext i;
        public final /* synthetic */ com.amazon.aps.iva.xx.k j;
        public final /* synthetic */ com.amazon.aps.iva.mt.l k;
        public final /* synthetic */ com.amazon.aps.iva.jt.a l;
        public final /* synthetic */ com.amazon.aps.iva.kt.a m;
        public final /* synthetic */ com.amazon.aps.iva.a1.f n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Panel panel, UpNext upNext, com.amazon.aps.iva.xx.k kVar, com.amazon.aps.iva.mt.l lVar, com.amazon.aps.iva.jt.a aVar, com.amazon.aps.iva.kt.a aVar2, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = upNext;
            this.j = kVar;
            this.k = lVar;
            this.l = aVar;
            this.m = aVar2;
            this.n = fVar;
            this.o = i;
            this.p = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            c.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return q.a;
        }
    }

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class h extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.kt.a h;
        public final /* synthetic */ Panel i;
        public final /* synthetic */ UpNext j;
        public final /* synthetic */ com.amazon.aps.iva.jt.a k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.amazon.aps.iva.kt.a aVar, Panel panel, UpNext upNext, com.amazon.aps.iva.jt.a aVar2) {
            super(1);
            this.h = aVar;
            this.i = panel;
            this.j = upNext;
            this.k = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "it");
            this.h.c(this.i, this.j, this.k);
            return q.a;
        }
    }

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class i extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.kt.a h;
        public final /* synthetic */ Panel i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.kt.a aVar, Panel panel) {
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

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class j extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.kt.a h;
        public final /* synthetic */ Panel i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.amazon.aps.iva.kt.a aVar, Panel panel) {
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

    /* compiled from: BigFeedContainerCard.kt */
    /* loaded from: classes2.dex */
    public static final class k extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ UpNext i;
        public final /* synthetic */ com.amazon.aps.iva.mt.l j;
        public final /* synthetic */ com.amazon.aps.iva.jt.a k;
        public final /* synthetic */ com.amazon.aps.iva.kt.a l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ com.amazon.aps.iva.a1.f n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Panel panel, UpNext upNext, com.amazon.aps.iva.mt.l lVar, com.amazon.aps.iva.jt.a aVar, com.amazon.aps.iva.kt.a aVar2, boolean z, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = panel;
            this.i = upNext;
            this.j = lVar;
            this.k = aVar;
            this.l = aVar2;
            this.m = z;
            this.n = fVar;
            this.o = i;
            this.p = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            c.c(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f9, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r9.e0(), java.lang.Integer.valueOf(r2)) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.ellation.crunchyroll.model.Panel r37, com.ellation.crunchyroll.model.UpNext r38, com.amazon.aps.iva.xx.k r39, com.amazon.aps.iva.mt.l r40, com.amazon.aps.iva.jt.a r41, com.amazon.aps.iva.kt.a r42, com.amazon.aps.iva.a1.f r43, com.amazon.aps.iva.o0.i r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kt.c.a(com.ellation.crunchyroll.model.Panel, com.ellation.crunchyroll.model.UpNext, com.amazon.aps.iva.xx.k, com.amazon.aps.iva.mt.l, com.amazon.aps.iva.jt.a, com.amazon.aps.iva.kt.a, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(Panel panel, UpNext upNext, com.amazon.aps.iva.xx.k kVar, com.amazon.aps.iva.mt.l lVar, com.amazon.aps.iva.jt.a aVar, com.amazon.aps.iva.kt.a aVar2, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        f.a aVar3;
        List K;
        boolean z;
        int i4;
        com.amazon.aps.iva.o0.j g2 = iVar.g(-731140113);
        int i5 = i3 & 64;
        f.a aVar4 = f.a.c;
        if (i5 != 0) {
            aVar3 = aVar4;
        } else {
            aVar3 = fVar;
        }
        e0.b bVar = e0.a;
        g2.s(-483455358);
        d0 a2 = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, g2);
        g2.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g2);
        c2 P = g2.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar5 = e.a.b;
        com.amazon.aps.iva.v0.a a3 = u.a(aVar3);
        int i6 = ((((((i2 >> 18) & 14) << 3) & 112) << 9) & 7168) | 6;
        if (g2.a instanceof com.amazon.aps.iva.o0.d) {
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
            a3.invoke(new x2(g2), g2, Integer.valueOf((i6 >> 3) & 112));
            g2.s(2058660585);
            String title = panel.getTitle();
            long j2 = com.amazon.aps.iva.ao.a.r;
            a4.b(title, o.a(aVar4, false, e.h), j2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.b, g2, 0, 3120, 55288);
            float f2 = 8;
            com.amazon.aps.iva.a1.f f3 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.d.i(aVar4, 0.0f, f2, 0.0f, 0.0f, 13)), 3);
            if (kVar == com.amazon.aps.iva.xx.k.ODD) {
                K = f1.K(new x(com.amazon.aps.iva.ao.a.n), new x(com.amazon.aps.iva.ao.a.o));
            } else {
                K = f1.K(new x(com.amazon.aps.iva.ao.a.p), new x(com.amazon.aps.iva.ao.a.q));
            }
            com.amazon.aps.iva.d0.f.a(androidx.compose.foundation.c.a(f3, s.a.a(K)), g2, 0);
            LabelsKt.m32Labels0OtIIsQ(LabelUiModelKt.toLabelUiModel$default(panel, false, 1, null), androidx.compose.foundation.layout.d.i(aVar4, 0.0f, f2, 0.0f, 0.0f, 13), false, false, false, true, false, true, 0L, null, 0.0f, g2, LabelUiModel.$stable | 12779568, 0, 1884);
            a4.b(panel.getDescription(), o.a(androidx.compose.foundation.layout.d.i(aVar4, 0.0f, f2, 0.0f, 0.0f, 13), false, f.h), j2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, com.amazon.aps.iva.ao.b.j, g2, 0, 3120, 55288);
            g2.s(-1895832985);
            q3 q3Var = androidx.compose.ui.platform.d.b;
            if (com.amazon.aps.iva.aq.k.n((Context) g2.i(q3Var)).c() && com.amazon.aps.iva.aq.k.n((Context) g2.i(q3Var)).S0()) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            g2.U(false);
            if (com.amazon.aps.iva.aq.k.n((Context) g2.i(q3Var)).S0()) {
                i4 = 12;
            } else {
                i4 = 16;
            }
            c(panel, upNext, lVar, aVar, aVar2, z2, androidx.compose.foundation.layout.d.i(aVar4, 0.0f, i4, 0.0f, 0.0f, 13), g2, Panel.$stable | 4608 | (i2 & 14) | (UpNext.$stable << 3) | (i2 & 112) | ((i2 >> 3) & 57344), 0);
            g2.U(false);
            g2.U(true);
            g2.U(false);
            g2.U(false);
            j2 X = g2.X();
            if (X != null) {
                X.d = new g(panel, upNext, kVar, lVar, aVar, aVar2, aVar3, i2, i3);
                return;
            }
            return;
        }
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }

    public static final void c(Panel panel, UpNext upNext, com.amazon.aps.iva.mt.l lVar, com.amazon.aps.iva.jt.a aVar, com.amazon.aps.iva.kt.a aVar2, boolean z, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        f.a aVar3;
        boolean z2;
        com.amazon.aps.iva.a1.f f2;
        boolean z3;
        boolean z4;
        com.amazon.aps.iva.a1.f i4;
        com.amazon.aps.iva.o0.j g2 = iVar.g(-1697033852);
        int i5 = i3 & 64;
        f.a aVar4 = f.a.c;
        if (i5 != 0) {
            aVar3 = aVar4;
        } else {
            aVar3 = fVar;
        }
        e0.b bVar = e0.a;
        com.amazon.aps.iva.a1.f e2 = androidx.compose.foundation.layout.e.e(aVar3);
        b.C0098b c0098b = a.C0097a.k;
        g2.s(693286680);
        d0 a2 = v1.a(com.amazon.aps.iva.d0.a.a, c0098b, g2);
        g2.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g2);
        c2 P = g2.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar5 = e.a.b;
        com.amazon.aps.iva.v0.a a3 = u.a(e2);
        if (g2.a instanceof com.amazon.aps.iva.o0.d) {
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
            y1 y1Var = y1.a;
            String E = defpackage.i.E(R.string.watch_now, g2);
            g2.s(1836573770);
            if (upNext != null) {
                String seasonNumber = upNext.getPanel().getEpisodeMetadata().getSeasonNumber();
                String str = "";
                if (seasonNumber == null) {
                    seasonNumber = "";
                }
                String episodeNumber = upNext.getPanel().getEpisodeMetadata().getEpisodeNumber();
                if (episodeNumber != null) {
                    str = episodeNumber;
                }
                String a4 = lVar.a(seasonNumber, str);
                if (com.amazon.aps.iva.oe0.m.b0(a4)) {
                    g2.s(1836574117);
                    g2.U(false);
                } else if (upNext.getPlayheadSec() > 0) {
                    g2.s(1836574198);
                    E = defpackage.i.F(R.string.continue_watching_format, new Object[]{a4}, g2);
                    g2.U(false);
                } else {
                    g2.s(1836574392);
                    E = defpackage.i.F(R.string.start_watching_format, new Object[]{a4}, g2);
                    g2.U(false);
                }
            }
            g2.U(false);
            g2.s(1836574602);
            if (!com.amazon.aps.iva.aq.k.n((Context) g2.i(androidx.compose.ui.platform.d.b)).b() && ((Configuration) g2.i(androidx.compose.ui.platform.d.a)).screenWidthDp > 768) {
                z2 = false;
            } else {
                z2 = true;
            }
            g2.U(false);
            if (z2) {
                f2 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.n(y1Var.b(aVar4, true)), 44);
            } else {
                f2 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.b(androidx.compose.foundation.layout.e.p(aVar4), 192, 0.0f, 2)), 44);
            }
            com.amazon.aps.iva.a1.f fVar2 = f2;
            String upperCase = E.toUpperCase(Locale.ROOT);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            com.amazon.aps.iva.zn.a.d(new h(aVar2, panel, upNext, aVar), upperCase, fVar2, false, com.amazon.aps.iva.kt.d.a, g2, 24576, 8);
            if (z) {
                g2.s(1836575681);
                WatchlistStatus watchlistStatus = panel.getWatchlistStatus();
                if (z2) {
                    z3 = true;
                    i4 = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(y1Var.b(aVar4, true)), 12, 0.0f, 0.0f, 0.0f, 14);
                } else {
                    z3 = true;
                    i4 = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.b(androidx.compose.foundation.layout.e.p(aVar4), 192, 0.0f, 2)), 12, 0.0f, 0.0f, 0.0f, 14);
                }
                t.a(watchlistStatus, i4, new i(aVar2, panel), g2, 0, 0);
                z4 = false;
                g2.U(false);
            } else {
                z3 = true;
                g2.s(1836576410);
                com.amazon.aps.iva.f60.q.a(panel.getWatchlistStatus(), androidx.compose.foundation.layout.d.i(aVar4, 12, 0.0f, 0.0f, 0.0f, 14), new j(aVar2, panel), g2, 48, 0);
                z4 = false;
                g2.U(false);
            }
            g2.U(z4);
            g2.U(z3);
            g2.U(z4);
            g2.U(z4);
            j2 X = g2.X();
            if (X != null) {
                X.d = new k(panel, upNext, lVar, aVar, aVar2, z, aVar3, i2, i3);
                return;
            }
            return;
        }
        com.amazon.aps.iva.cq.b.W();
        throw null;
    }
}
