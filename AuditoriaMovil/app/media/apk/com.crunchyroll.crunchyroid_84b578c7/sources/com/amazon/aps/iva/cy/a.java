package com.amazon.aps.iva.cy;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.ee0.f1;
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
import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import java.util.List;
/* compiled from: ArtistCard.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: ArtistCard.kt */
    /* renamed from: com.amazon.aps.iva.cy.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0184a extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0184a h = new C0184a();

        public C0184a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "artist_card");
            return q.a;
        }
    }

    /* compiled from: ArtistCard.kt */
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
            y.e(c0Var2, "artist_name");
            return q.a;
        }
    }

    /* compiled from: ArtistCard.kt */
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
            y.e(c0Var2, "genres");
            return q.a;
        }
    }

    /* compiled from: ArtistCard.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.xx.b h;
        public final /* synthetic */ com.amazon.aps.iva.n70.d<com.amazon.aps.iva.xx.b> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;
        public final /* synthetic */ com.amazon.aps.iva.a1.f k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.xx.b bVar, com.amazon.aps.iva.n70.d<com.amazon.aps.iva.xx.b> dVar, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = bVar;
            this.i = dVar;
            this.j = aVar;
            this.k = fVar;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.xx.b bVar, com.amazon.aps.iva.n70.d<com.amazon.aps.iva.xx.b> dVar, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.a1.f fVar, i iVar, int i, int i2) {
        f.a aVar2;
        j.f(bVar, "item");
        j.f(dVar, "overflowMenuProvider");
        j.f(aVar, "onClick");
        com.amazon.aps.iva.o0.j g = iVar.g(-746489963);
        int i3 = i2 & 8;
        f.a aVar3 = f.a.c;
        if (i3 != 0) {
            aVar2 = aVar3;
        } else {
            aVar2 = fVar;
        }
        e0.b bVar2 = e0.a;
        com.amazon.aps.iva.a1.f a = o.a(androidx.compose.foundation.f.c(androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.e.n(aVar2), 146), aVar), false, C0184a.h);
        g.s(733328855);
        d0 c2 = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, g);
        g.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g);
        c2 P = g.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar4 = e.a.b;
        com.amazon.aps.iva.v0.a a2 = u.a(a);
        com.amazon.aps.iva.o0.d<?> dVar2 = g.a;
        if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
            g.z();
            if (g.M) {
                g.w(aVar4);
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
            defpackage.b.d(0, a2, new x2(g), g, 2058660585);
            androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.a;
            g.s(-483455358);
            d0 a3 = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, g);
            g.s(-1323940314);
            int S2 = com.amazon.aps.iva.cq.b.S(g);
            c2 P2 = g.P();
            com.amazon.aps.iva.v0.a a4 = u.a(aVar3);
            if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar4);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, a3, bVar3);
                com.amazon.aps.iva.cq.b.k0(g, P2, dVar3);
                if (g.M || !j.a(g.e0(), Integer.valueOf(S2))) {
                    defpackage.a.c(S2, g, S2, c0752a);
                }
                defpackage.b.d(0, a4, new x2(g), g, 2058660585);
                com.amazon.aps.iva.ly.a.a(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.e(aVar3), 220), null, x.m0(bVar.c.getPostersTall()), null, com.amazon.aps.iva.ao.a.v, 0.0f, null, null, g, (Image.$stable << 6) | 6, 234);
                float f = 8;
                a4.b(bVar.b, o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar3)), 0.0f, f, 0.0f, 0.0f, 13), false, b.h), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.j, g, 0, 3120, 55288);
                float f2 = 6;
                com.amazon.aps.iva.a1.f a5 = o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar3)), 0.0f, f2, f, f2, 1), false, c.h);
                g.s(693286680);
                d0 a6 = v1.a(com.amazon.aps.iva.d0.a.a, a.C0097a.j, g);
                g.s(-1323940314);
                int S3 = com.amazon.aps.iva.cq.b.S(g);
                c2 P3 = g.P();
                com.amazon.aps.iva.v0.a a7 = u.a(a5);
                if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                    g.z();
                    if (g.M) {
                        g.w(aVar4);
                    } else {
                        g.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(g, a6, bVar3);
                    com.amazon.aps.iva.cq.b.k0(g, P3, dVar3);
                    if (g.M || !j.a(g.e0(), Integer.valueOf(S3))) {
                        defpackage.a.c(S3, g, S3, c0752a);
                    }
                    com.amazon.aps.iva.b6.x.c(0, a7, new x2(g), g, 2058660585, 1090590234);
                    List<MusicGenre> list = bVar.h;
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            String displayValue = ((MusicGenre) obj).getDisplayValue();
                            a0 a0Var = com.amazon.aps.iva.ao.b.o;
                            long j = com.amazon.aps.iva.ao.a.j;
                            a4.b(displayValue, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, a0Var, g, 0, 3120, 55290);
                            if (i4 != f1.B(list)) {
                                LabelsKt.m35SeparatoriJQMabo(null, j, g, 0, 1);
                            }
                            i4 = i5;
                        } else {
                            f1.S();
                            throw null;
                        }
                    }
                    defpackage.c.c(g, false, false, true, false);
                    defpackage.c.c(g, false, false, true, false);
                    g.U(false);
                    com.amazon.aps.iva.n70.c.a(bVar, dVar, bVar4.c(aVar3, a.C0097a.i), 0L, 16, 16, 0, 6, g, 12804168, 72);
                    defpackage.c.c(g, false, true, false, false);
                    e0.b bVar5 = e0.a;
                    j2 X = g.X();
                    if (X != null) {
                        X.d = new d(bVar, dVar, aVar, aVar2, i, i2);
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
