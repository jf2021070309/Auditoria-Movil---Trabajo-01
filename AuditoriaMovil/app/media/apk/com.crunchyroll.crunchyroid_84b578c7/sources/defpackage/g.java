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
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.dv.m;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
/* compiled from: CrunchylistUnavailableItemCard.kt */
/* renamed from: g  reason: default package */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: CrunchylistUnavailableItemCard.kt */
    /* renamed from: g$a */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: CrunchylistUnavailableItemCard.kt */
    /* renamed from: g$b */
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
            y.e(c0Var2, "crunchylist_unavailable_item_card");
            return q.a;
        }
    }

    /* compiled from: CrunchylistUnavailableItemCard.kt */
    /* renamed from: g$c */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: CrunchylistUnavailableItemCard.kt */
    /* renamed from: g$d */
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
            y.e(c0Var2, "item_title");
            return q.a;
        }
    }

    /* compiled from: CrunchylistUnavailableItemCard.kt */
    /* renamed from: g$e */
    /* loaded from: classes.dex */
    public static final class e extends l implements p<i, Integer, q> {
        public final /* synthetic */ m h;
        public final /* synthetic */ com.amazon.aps.iva.ev.i i;
        public final /* synthetic */ u0<Boolean> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m mVar, com.amazon.aps.iva.ev.i iVar, u0<Boolean> u0Var, com.amazon.aps.iva.xb0.a<q> aVar, int i, int i2) {
            super(2);
            this.h = mVar;
            this.i = iVar;
            this.j = u0Var;
            this.k = aVar;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            g.a(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return q.a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v41, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v59 */
    public static final void a(m mVar, com.amazon.aps.iva.ev.i iVar, u0<Boolean> u0Var, com.amazon.aps.iva.xb0.a<q> aVar, i iVar2, int i, int i2) {
        a aVar2;
        int i3;
        float f;
        f b2;
        e.a aVar3;
        e.a.C0752a c0752a;
        boolean z;
        e.a.C0752a c0752a2;
        e.a aVar4;
        e.a.d dVar;
        boolean z2;
        int i4;
        boolean z3;
        f.a aVar5;
        boolean z4;
        ?? r4;
        e.a aVar6;
        j.f(mVar, "item");
        j.f(iVar, "overflowMenuProvider");
        j.f(u0Var, "shadowVisibilityState");
        com.amazon.aps.iva.o0.j g = iVar2.g(896225302);
        if ((i2 & 8) != 0) {
            aVar2 = a.h;
        } else {
            aVar2 = aVar;
        }
        e0.b bVar = e0.a;
        boolean c2 = k.n((Context) g.i(androidx.compose.ui.platform.d.b)).c();
        q1 b3 = com.amazon.aps.iva.j5.b.b(u0Var, g);
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
        f.a aVar7 = f.a.c;
        f e2 = androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.n(aVar7), f2));
        long j = x.b;
        b2 = androidx.compose.foundation.c.b(e2, j, p0.a);
        f a2 = o.a(b2, false, b.h);
        g.s(693286680);
        a.i iVar3 = com.amazon.aps.iva.d0.a.a;
        b.C0098b c0098b = a.C0097a.j;
        d0 a3 = v1.a(iVar3, c0098b, g);
        g.s(-1323940314);
        int S = com.amazon.aps.iva.cq.b.S(g);
        c2 P = g.P();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar8 = e.a.b;
        com.amazon.aps.iva.v0.a a4 = u.a(a2);
        com.amazon.aps.iva.o0.d<?> dVar2 = g.a;
        if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
            g.z();
            if (g.M) {
                g.w(aVar8);
            } else {
                g.m();
            }
            e.a.b bVar2 = e.a.e;
            com.amazon.aps.iva.cq.b.k0(g, a3, bVar2);
            e.a.d dVar3 = e.a.d;
            com.amazon.aps.iva.cq.b.k0(g, P, dVar3);
            e.a.C0752a c0752a3 = e.a.f;
            if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                defpackage.a.c(S, g, S, c0752a3);
            }
            a4.invoke(new x2(g), g, 0);
            g.s(2058660585);
            float f4 = 8;
            f i5 = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.c(aVar7), f4, 0.0f, f4, 0.0f, 10);
            a.b bVar3 = com.amazon.aps.iva.d0.a.e;
            g.s(-483455358);
            b.a aVar9 = a.C0097a.m;
            d0 a5 = com.amazon.aps.iva.d0.m.a(bVar3, aVar9, g);
            g.s(-1323940314);
            int S2 = com.amazon.aps.iva.cq.b.S(g);
            c2 P2 = g.P();
            com.amazon.aps.iva.v0.a a6 = u.a(i5);
            if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar8);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, a5, bVar2);
                com.amazon.aps.iva.cq.b.k0(g, P2, dVar3);
                if (g.M || !j.a(g.e0(), Integer.valueOf(S2))) {
                    defpackage.a.c(S2, g, S2, c0752a3);
                }
                defpackage.b.d(0, a6, new x2(g), g, 2058660585);
                com.amazon.aps.iva.i1.c a7 = com.amazon.aps.iva.z1.b.a(R.drawable.ic_three_line_drag, g);
                com.amazon.aps.iva.a1.b bVar4 = a.C0097a.e;
                float f5 = 20;
                com.amazon.aps.iva.xb0.a<q> aVar10 = aVar2;
                com.amazon.aps.iva.a0.p0.a(a7, null, androidx.compose.foundation.f.d(androidx.compose.foundation.layout.e.l(aVar7, f5), aVar2, c.h), bVar4, null, 0.0f, null, g, 3128, 112);
                defpackage.c.c(g, false, true, false, false);
                f a8 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.f(aVar7, f2), f3);
                g.s(733328855);
                d0 c3 = com.amazon.aps.iva.d0.f.c(bVar4, false, g);
                g.s(-1323940314);
                int S3 = com.amazon.aps.iva.cq.b.S(g);
                c2 P3 = g.P();
                com.amazon.aps.iva.v0.a a9 = u.a(a8);
                if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                    g.z();
                    if (g.M) {
                        aVar3 = aVar8;
                        g.w(aVar3);
                    } else {
                        aVar3 = aVar8;
                        g.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(g, c3, bVar2);
                    com.amazon.aps.iva.cq.b.k0(g, P3, dVar3);
                    if (!g.M && j.a(g.e0(), Integer.valueOf(S3))) {
                        c0752a = c0752a3;
                    } else {
                        c0752a = c0752a3;
                        defpackage.a.c(S3, g, S3, c0752a);
                    }
                    defpackage.b.d(0, a9, new x2(g), g, 2058660585);
                    e.a.C0752a c0752a4 = c0752a;
                    com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_no_available, g), null, null, null, null, 0.0f, null, g, 56, 124);
                    defpackage.c.c(g, false, true, false, false);
                    f c4 = androidx.compose.foundation.layout.e.c(aVar7);
                    j.f(c4, "<this>");
                    if (1.0f > 0.0d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        f i6 = androidx.compose.foundation.layout.d.i(c4.o(new LayoutWeightElement(true)), 12, 0.0f, f4, 0.0f, 10);
                        g.s(-483455358);
                        d0 a10 = com.amazon.aps.iva.d0.m.a(bVar3, aVar9, g);
                        g.s(-1323940314);
                        int S4 = com.amazon.aps.iva.cq.b.S(g);
                        c2 P4 = g.P();
                        com.amazon.aps.iva.v0.a a11 = u.a(i6);
                        if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                            g.z();
                            if (g.M) {
                                g.w(aVar3);
                            } else {
                                g.m();
                            }
                            com.amazon.aps.iva.cq.b.k0(g, a10, bVar2);
                            com.amazon.aps.iva.cq.b.k0(g, P4, dVar3);
                            if (!g.M && j.a(g.e0(), Integer.valueOf(S4))) {
                                c0752a2 = c0752a4;
                            } else {
                                c0752a2 = c0752a4;
                                defpackage.a.c(S4, g, S4, c0752a2);
                            }
                            defpackage.b.d(0, a11, new x2(g), g, 2058660585);
                            e.a.C0752a c0752a5 = c0752a2;
                            e.a aVar11 = aVar3;
                            a4.b(i.E(R.string.crunchylist_no_longer_available, g), o.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.n(androidx.compose.foundation.layout.e.e(aVar7)), 0.0f, 0.0f, 0.0f, f4, 7), false, d.h), com.amazon.aps.iva.ao.a.r, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, com.amazon.aps.iva.ao.b.j, g, 0, 3120, 55288);
                            g.s(712214659);
                            if (!c2) {
                                f e3 = androidx.compose.foundation.layout.e.e(aVar7);
                                a.c cVar = com.amazon.aps.iva.d0.a.b;
                                g.s(693286680);
                                d0 a12 = v1.a(cVar, c0098b, g);
                                g.s(-1323940314);
                                int S5 = com.amazon.aps.iva.cq.b.S(g);
                                c2 P5 = g.P();
                                com.amazon.aps.iva.v0.a a13 = u.a(e3);
                                if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                                    g.z();
                                    if (g.M) {
                                        aVar6 = aVar11;
                                        g.w(aVar6);
                                    } else {
                                        aVar6 = aVar11;
                                        g.m();
                                    }
                                    com.amazon.aps.iva.cq.b.k0(g, a12, bVar2);
                                    com.amazon.aps.iva.cq.b.k0(g, P5, dVar3);
                                    if (g.M || !j.a(g.e0(), Integer.valueOf(S5))) {
                                        defpackage.a.c(S5, g, S5, c0752a5);
                                    }
                                    defpackage.b.d(0, a13, new x2(g), g, 2058660585);
                                    dVar = dVar3;
                                    aVar4 = aVar6;
                                    com.amazon.aps.iva.n70.c.a(mVar, iVar, androidx.compose.foundation.layout.e.j(aVar7, f5), 0L, 0, 0, 0, 0, g, (i & 14) | 384 | (i & 112), 248);
                                    z3 = true;
                                    z2 = false;
                                    defpackage.c.c(g, false, true, false, false);
                                    i4 = -1323940314;
                                } else {
                                    com.amazon.aps.iva.cq.b.W();
                                    throw null;
                                }
                            } else {
                                aVar4 = aVar11;
                                dVar = dVar3;
                                z2 = false;
                                i4 = -1323940314;
                                z3 = true;
                            }
                            defpackage.c.c(g, z2, z2, z3, z2);
                            g.U(z2);
                            g.s(1890886325);
                            if (c2) {
                                f l = androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.e.c(aVar7), 48);
                                b.a aVar12 = a.C0097a.o;
                                g.s(-483455358);
                                d0 a14 = com.amazon.aps.iva.d0.m.a(bVar3, aVar12, g);
                                g.s(i4);
                                int S6 = com.amazon.aps.iva.cq.b.S(g);
                                c2 P6 = g.P();
                                com.amazon.aps.iva.v0.a a15 = u.a(l);
                                if (dVar2 instanceof com.amazon.aps.iva.o0.d) {
                                    g.z();
                                    if (g.M) {
                                        g.w(aVar4);
                                    } else {
                                        g.m();
                                    }
                                    com.amazon.aps.iva.cq.b.k0(g, a14, bVar2);
                                    com.amazon.aps.iva.cq.b.k0(g, P6, dVar);
                                    if (g.M || !j.a(g.e0(), Integer.valueOf(S6))) {
                                        defpackage.a.c(S6, g, S6, c0752a5);
                                    }
                                    defpackage.b.d(0, a15, new x2(g), g, 2058660585);
                                    aVar5 = aVar7;
                                    com.amazon.aps.iva.n70.c.a(mVar, iVar, androidx.compose.foundation.layout.e.j(aVar5, 24), 0L, 0, 0, 0, 0, g, (i & 14) | 384 | (i & 112), 248);
                                    r4 = 1;
                                    z4 = false;
                                    defpackage.c.c(g, false, true, false, false);
                                } else {
                                    com.amazon.aps.iva.cq.b.W();
                                    throw null;
                                }
                            } else {
                                aVar5 = aVar7;
                                z4 = false;
                                r4 = z3;
                            }
                            defpackage.c.c(g, z4, z4, r4, z4);
                            g.U(z4);
                            if (((Boolean) b3.getValue()).booleanValue()) {
                                com.amazon.aps.iva.d0.f.a(androidx.compose.foundation.c.a(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.f(aVar5, 4)), 0.0f, (float) MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, r4), s.a.b(f1.K(new x(x.f), new x(j)))), g, 0);
                            }
                            e0.b bVar5 = e0.a;
                            j2 X = g.X();
                            if (X != null) {
                                X.d = new e(mVar, iVar, u0Var, aVar10, i, i2);
                                return;
                            }
                            return;
                        }
                        com.amazon.aps.iva.cq.b.W();
                        throw null;
                    }
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
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
