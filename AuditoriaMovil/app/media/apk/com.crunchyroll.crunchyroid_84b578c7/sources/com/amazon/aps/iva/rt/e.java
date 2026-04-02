package com.amazon.aps.iva.rt;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.gr.n;
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
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.labels.DurationLabelKt;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
/* compiled from: SmallFeedEpisodeCard.kt */
/* loaded from: classes2.dex */
public final class e {

    /* compiled from: SmallFeedEpisodeCard.kt */
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
            y.e(c0Var2, "episode_card");
            return q.a;
        }
    }

    /* compiled from: SmallFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.rt.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.rt.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.a();
            return q.a;
        }
    }

    /* compiled from: SmallFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "parent_title");
            return q.a;
        }
    }

    /* compiled from: SmallFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final d h = new d();

        public d() {
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

    /* compiled from: SmallFeedEpisodeCard.kt */
    /* renamed from: com.amazon.aps.iva.rt.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0683e extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0683e h = new C0683e();

        public C0683e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "season_and_episode_number");
            return q.a;
        }
    }

    /* compiled from: SmallFeedEpisodeCard.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.rt.a h;
        public final /* synthetic */ com.amazon.aps.iva.rt.c i;
        public final /* synthetic */ com.amazon.aps.iva.mt.l j;
        public final /* synthetic */ DurationFormatter k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.rt.a aVar, com.amazon.aps.iva.rt.c cVar, com.amazon.aps.iva.mt.l lVar, DurationFormatter durationFormatter, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = aVar;
            this.i = cVar;
            this.j = lVar;
            this.k = durationFormatter;
            this.l = fVar;
            this.m = i;
            this.n = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            e.a(this.h, this.i, this.j, this.k, this.l, iVar, com.amazon.aps.iva.ff0.b.I(this.m | 1), this.n);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.rt.a aVar, com.amazon.aps.iva.rt.c cVar, com.amazon.aps.iva.mt.l lVar, DurationFormatter durationFormatter, com.amazon.aps.iva.a1.f fVar, i iVar, int i, int i2) {
        f.a aVar2;
        boolean z;
        boolean z2;
        j.f(aVar, "item");
        j.f(cVar, "clickHandler");
        j.f(lVar, "seasonAndEpisodeFormatter");
        j.f(durationFormatter, "durationFormatter");
        com.amazon.aps.iva.o0.j g = iVar.g(-1710815462);
        int i3 = i2 & 16;
        f.a aVar3 = f.a.c;
        if (i3 != 0) {
            aVar2 = aVar3;
        } else {
            aVar2 = fVar;
        }
        e0.b bVar = e0.a;
        String formatDuration = durationFormatter.formatDuration(n.x(aVar.f));
        com.amazon.aps.iva.a1.f c2 = androidx.compose.foundation.f.c(o.a(androidx.compose.foundation.layout.e.l(aVar2, 160), false, a.h), new b(cVar));
        g.s(-483455358);
        d0 a2 = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, g);
        g.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g);
        c2 P = g.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar4 = e.a.b;
        com.amazon.aps.iva.v0.a a3 = u.a(c2);
        com.amazon.aps.iva.o0.d<?> dVar = g.a;
        if (dVar instanceof com.amazon.aps.iva.o0.d) {
            g.z();
            if (g.M) {
                g.w(aVar4);
            } else {
                g.m();
            }
            e.a.b bVar2 = e.a.e;
            com.amazon.aps.iva.cq.b.k0(g, a2, bVar2);
            e.a.d dVar2 = e.a.d;
            com.amazon.aps.iva.cq.b.k0(g, P, dVar2);
            e.a.C0752a c0752a = e.a.f;
            if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                defpackage.a.c(S, g, S, c0752a);
            }
            defpackage.b.d(0, a3, new x2(g), g, 2058660585);
            com.amazon.aps.iva.a1.f o = androidx.compose.foundation.layout.e.o(aVar3, null, 3);
            g.s(733328855);
            d0 c3 = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, g);
            g.s(-1323940314);
            int S2 = com.amazon.aps.iva.cq.b.S(g);
            c2 P2 = g.P();
            com.amazon.aps.iva.v0.a a4 = u.a(o);
            if (dVar instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar4);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, c3, bVar2);
                com.amazon.aps.iva.cq.b.k0(g, P2, dVar2);
                if (g.M || !j.a(g.e0(), Integer.valueOf(S2))) {
                    defpackage.a.c(S2, g, S2, c0752a);
                }
                defpackage.b.d(0, a4, new x2(g), g, 2058660585);
                androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.a;
                com.amazon.aps.iva.a1.f fVar2 = aVar2;
                com.amazon.aps.iva.ly.a.a(androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.e(aVar3), 1.7777778f), null, x.m0(aVar.g), null, com.amazon.aps.iva.ao.a.v, 0.0f, null, null, g, (Image.$stable << 6) | 6, 234);
                com.amazon.aps.iva.ot.b.a(aVar.i, bVar3.d(), g, 0, 0);
                float f2 = 4;
                DurationLabelKt.DurationLabel(formatDuration, androidx.compose.foundation.layout.d.e(bVar3.c(aVar3, a.C0097a.i), f2), g, 0, 0);
                g.U(false);
                g.U(true);
                g.U(false);
                g.U(false);
                String str = aVar.c;
                a0 a0Var = com.amazon.aps.iva.ao.b.o;
                long j = com.amazon.aps.iva.ao.a.j;
                float f3 = 6;
                a4.b(str, o.a(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.d.i(aVar3, 0.0f, f3, 0.0f, 0.0f, 13)), false, c.h), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, a0Var, g, 0, 3120, 55288);
                a4.b(aVar.b, o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.e(aVar3), 0.0f, f2, 0.0f, 0.0f, 13), false, d.h), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.j, g, 0, 3120, 55288);
                com.amazon.aps.iva.a1.f g2 = androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.e.e(aVar3), 0.0f, f3, 1);
                a.i iVar2 = com.amazon.aps.iva.d0.a.a;
                b.C0098b c0098b = a.C0097a.k;
                g.s(693286680);
                d0 a5 = v1.a(iVar2, c0098b, g);
                g.s(-1323940314);
                int S3 = com.amazon.aps.iva.cq.b.S(g);
                c2 P3 = g.P();
                com.amazon.aps.iva.v0.a a6 = u.a(g2);
                if (dVar instanceof com.amazon.aps.iva.o0.d) {
                    g.z();
                    if (g.M) {
                        g.w(aVar4);
                    } else {
                        g.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(g, a5, bVar2);
                    com.amazon.aps.iva.cq.b.k0(g, P3, dVar2);
                    if (g.M || !j.a(g.e0(), Integer.valueOf(S3))) {
                        defpackage.a.c(S3, g, S3, c0752a);
                    }
                    defpackage.b.d(0, a6, new x2(g), g, 2058660585);
                    String a7 = lVar.a(aVar.d, aVar.e);
                    if (aVar.h.getMediaLanguageModel().getDisplayText().length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LabelUiModel labelUiModel = aVar.h;
                    float f4 = 16;
                    com.amazon.aps.iva.a1.f o2 = androidx.compose.foundation.layout.e.o(aVar3, null, 3);
                    if (!z && (!com.amazon.aps.iva.oe0.m.b0(a7))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LabelsKt.m32Labels0OtIIsQ(labelUiModel, o2, false, true, z2, false, false, true, j, a0Var, f4, g, LabelUiModel.$stable | 12586032, 6, 100);
                    g.s(1343786540);
                    if (!com.amazon.aps.iva.oe0.m.b0(a7)) {
                        g.s(-1826484088);
                        if (z) {
                            LabelsKt.m35SeparatoriJQMabo(null, 0L, g, 0, 3);
                        }
                        g.U(false);
                        a4.b(a7, o.a(androidx.compose.foundation.layout.e.o(aVar3, null, 3), false, C0683e.h), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, a0Var, g, 0, 3120, 55288);
                    }
                    defpackage.c.c(g, false, false, true, false);
                    defpackage.c.c(g, false, false, true, false);
                    g.U(false);
                    e0.b bVar4 = e0.a;
                    j2 X = g.X();
                    if (X != null) {
                        X.d = new f(aVar, cVar, lVar, durationFormatter, fVar2, i, i2);
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
