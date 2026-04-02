package com.amazon.aps.iva.dy;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xx.n;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.badges.CardBadgesKt;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: MusicAssetHomeFeedCard.kt */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: MusicAssetHomeFeedCard.kt */
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
            y.e(c0Var2, "music_asset_home_feed_card");
            return q.a;
        }
    }

    /* compiled from: MusicAssetHomeFeedCard.kt */
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
            y.e(c0Var2, "duration");
            return q.a;
        }
    }

    /* compiled from: MusicAssetHomeFeedCard.kt */
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
            y.e(c0Var2, "artist_name");
            return q.a;
        }
    }

    /* compiled from: MusicAssetHomeFeedCard.kt */
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
            y.e(c0Var2, "asset_title");
            return q.a;
        }
    }

    /* compiled from: MusicAssetHomeFeedCard.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "genre");
            return q.a;
        }
    }

    /* compiled from: MusicAssetHomeFeedCard.kt */
    /* renamed from: com.amazon.aps.iva.dy.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0209f extends l implements p<i, Integer, q> {
        public final /* synthetic */ n h;
        public final /* synthetic */ com.amazon.aps.iva.n70.d<n> i;
        public final /* synthetic */ DurationFormatter j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0209f(n nVar, com.amazon.aps.iva.n70.d<n> dVar, DurationFormatter durationFormatter, com.amazon.aps.iva.xb0.a<q> aVar, int i) {
            super(2);
            this.h = nVar;
            this.i = dVar;
            this.j = durationFormatter;
            this.k = aVar;
            this.l = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            f.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1));
            return q.a;
        }
    }

    public static final void a(n nVar, com.amazon.aps.iva.n70.d<n> dVar, DurationFormatter durationFormatter, com.amazon.aps.iva.xb0.a<q> aVar, i iVar, int i) {
        String formatDuration;
        com.amazon.aps.iva.a1.f b2;
        j.f(nVar, "item");
        j.f(dVar, "overflowMenuProvider");
        j.f(durationFormatter, "durationFormatter");
        j.f(aVar, "onClick");
        com.amazon.aps.iva.o0.j g = iVar.g(-910580751);
        e0.b bVar = e0.a;
        f.a aVar2 = f.a.c;
        com.amazon.aps.iva.a1.f a2 = o.a(androidx.compose.foundation.f.c(androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.e.n(aVar2), 146), aVar), false, a.h);
        g.s(733328855);
        com.amazon.aps.iva.a1.b bVar2 = a.C0097a.a;
        d0 c2 = com.amazon.aps.iva.d0.f.c(bVar2, false, g);
        g.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g);
        c2 P = g.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar3 = e.a.b;
        com.amazon.aps.iva.v0.a a3 = u.a(a2);
        com.amazon.aps.iva.o0.d<?> dVar2 = g.a;
        if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
            g.z();
            if (g.M) {
                g.w(aVar3);
            } else {
                g.m();
            }
            e.a.b bVar3 = e.a.e;
            com.amazon.aps.iva.cq.b.k0(g, c2, bVar3);
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
            com.amazon.aps.iva.v0.a a5 = u.a(aVar2);
            if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar3);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, a4, bVar3);
                com.amazon.aps.iva.cq.b.k0(g, P2, dVar3);
                if (g.M || !j.a(g.e0(), Integer.valueOf(S2))) {
                    defpackage.a.c(S2, g, S2, c0752a);
                }
                defpackage.b.d(0, a5, new x2(g), g, 2058660585);
                com.amazon.aps.iva.a1.f e2 = androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.f(aVar2, 82));
                g.s(733328855);
                d0 c3 = com.amazon.aps.iva.d0.f.c(bVar2, false, g);
                g.s(-1323940314);
                int S3 = com.amazon.aps.iva.cq.b.S(g);
                c2 P3 = g.P();
                com.amazon.aps.iva.v0.a a6 = u.a(e2);
                if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                    g.z();
                    if (g.M) {
                        g.w(aVar3);
                    } else {
                        g.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(g, c3, bVar3);
                    com.amazon.aps.iva.cq.b.k0(g, P3, dVar3);
                    if (g.M || !j.a(g.e0(), Integer.valueOf(S3))) {
                        defpackage.a.c(S3, g, S3, c0752a);
                    }
                    defpackage.b.d(0, a6, new x2(g), g, 2058660585);
                    com.amazon.aps.iva.ly.a.a(androidx.compose.foundation.layout.e.d(aVar2), null, x.m0(nVar.e.getThumbnails()), null, com.amazon.aps.iva.ao.a.v, 0.0f, null, null, g, (Image.$stable << 6) | 6, 234);
                    g.s(892154111);
                    a.h hVar = a.h.d;
                    com.amazon.aps.iva.ot.a aVar4 = nVar.g;
                    if (j.a(aVar4, hVar)) {
                        formatDuration = i.E(R.string.watched, g);
                    } else {
                        formatDuration = durationFormatter.formatDuration(nVar.h);
                    }
                    String str = formatDuration;
                    g.U(false);
                    a0 a0Var = com.amazon.aps.iva.ao.b.n;
                    long j = com.amazon.aps.iva.ao.a.r;
                    float f = 4;
                    b2 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.e.o(aVar2, null, 3), f), com.amazon.aps.iva.ao.a.A, p0.a);
                    com.amazon.aps.iva.a1.f f2 = androidx.compose.foundation.layout.d.f(b2, f, 2);
                    com.amazon.aps.iva.a1.b bVar5 = a.C0097a.i;
                    a4.b(str, o.a(bVar4.c(f2, bVar5), false, b.h), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var, g, 0, 0, 65528);
                    com.amazon.aps.iva.ot.b.a(aVar4, bVar4.d(), g, 0, 0);
                    CardBadgesKt.CardBadges(nVar.m, null, x.m0(nVar.i), true, false, false, false, g, LabelUiModel.$stable | 3072, 114);
                    defpackage.c.c(g, false, true, false, false);
                    String str2 = nVar.c;
                    a0 a0Var2 = com.amazon.aps.iva.ao.b.o;
                    long j2 = com.amazon.aps.iva.ao.a.j;
                    float f3 = 6;
                    a4.b(str2, o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar2)), 0.0f, f3, 0.0f, 0.0f, 13), false, c.h), j2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, a0Var2, g, 0, 3120, 55288);
                    a4.b(nVar.d, o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar2)), 0.0f, f, 0.0f, 0.0f, 13), false, d.h), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.j, g, 0, 3120, 55288);
                    com.amazon.aps.iva.a1.f a7 = o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar2)), 0.0f, f3, 8, f3, 1), false, e.h);
                    String str3 = nVar.f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    a4.b(str3, a7, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var2, g, 0, 0, 65528);
                    defpackage.c.c(g, false, true, false, false);
                    com.amazon.aps.iva.n70.c.a(nVar, dVar, bVar4.c(aVar2, bVar5), 0L, 16, 16, 0, 2, g, 12804168, 72);
                    defpackage.c.c(g, false, true, false, false);
                    e0.b bVar6 = e0.a;
                    j2 X = g.X();
                    if (X == null) {
                        return;
                    }
                    X.d = new C0209f(nVar, dVar, durationFormatter, aVar, i);
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
