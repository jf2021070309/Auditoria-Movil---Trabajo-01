package com.crunchyroll.appwidgets.continuewatching;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q3;
import com.amazon.aps.iva.o2.g;
import com.amazon.aps.iva.p4.h;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.r4.w1;
import com.amazon.aps.iva.r4.z;
import com.amazon.aps.iva.ud.a0;
import com.amazon.aps.iva.ud.c0;
import com.amazon.aps.iva.ud.f0;
import com.amazon.aps.iva.ud.v;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.appwidgets.continuewatching.a;
import java.util.List;
/* compiled from: ContinueWatchingWidget.kt */
/* loaded from: classes.dex */
public final class c extends z {
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public final b d;
    public final w1.a e;

    /* compiled from: ContinueWatchingWidget.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements p<i, Integer, q> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            c.this.a(iVar, I);
            return q.a;
        }
    }

    static {
        float f2 = 130;
        f = f1.f(f2, f2);
        float f3 = 163;
        g = f1.f(f3, f3);
        float f4 = 320;
        h = f1.f(f4, 188);
        i = f1.f(f4, f4);
        j = f1.f(f4, 470);
    }

    public c() {
        super(0);
        this.d = b.a;
        this.e = new w1.a(l1.I(new g(f), new g(g), new g(h), new g(i), new g(j)));
    }

    @Override // com.amazon.aps.iva.r4.z
    public final void a(i iVar, int i2) {
        long j2;
        boolean a2;
        j g2 = iVar.g(822575853);
        if ((i2 & 1) == 0 && g2.h()) {
            g2.A();
        } else {
            e0.b bVar = e0.a;
            q3 q3Var = h.a;
            long j3 = ((g) g2.i(q3Var)).a;
            long j4 = f;
            if (g.a(j3, j4)) {
                g2.s(899697232);
                long j5 = ((g) g2.i(q3Var)).a;
                float min = Math.min(g.c(j5), g.b(j5));
                j2 = f1.f(min, min);
                g2.U(false);
            } else {
                g2.s(899697470);
                j2 = ((g) g2.i(q3Var)).a;
                g2.U(false);
            }
            Object obj = (com.crunchyroll.appwidgets.continuewatching.a) g2.i(h.c);
            if (obj == null) {
                obj = new a.b(new g.b(null));
            }
            boolean z = obj instanceof a.C0949a;
            n.a aVar = n.a.b;
            if (z) {
                g2.s(899697616);
                com.amazon.aps.iva.ud.b.a(com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(aVar, com.amazon.aps.iva.o2.g.b(j2)), com.amazon.aps.iva.o2.g.c(j2)), g2, 0, 0);
                g2.U(false);
            } else if (obj instanceof a.b) {
                g2.s(899697715);
                com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.sd.a>> gVar = ((a.b) obj).a;
                if (gVar instanceof g.a) {
                    g2.s(899697780);
                    com.amazon.aps.iva.ud.e0.a(com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(aVar, com.amazon.aps.iva.o2.g.b(j2)), com.amazon.aps.iva.o2.g.c(j2)), g2, 0, 0);
                    g2.U(false);
                } else if (gVar instanceof g.c) {
                    g2.s(899697876);
                    com.amazon.aps.iva.pe0.a m0 = x.m0((Iterable) ((g.c) gVar).a);
                    if (m0.isEmpty()) {
                        g2.s(899697983);
                        c0.a(com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(aVar, com.amazon.aps.iva.o2.g.b(j2)), com.amazon.aps.iva.o2.g.c(j2)), g2, 0, 0);
                        g2.U(false);
                    } else {
                        g2.s(899698102);
                        long j6 = ((com.amazon.aps.iva.o2.g) g2.i(q3Var)).a;
                        boolean a3 = com.amazon.aps.iva.o2.g.a(j6, j4);
                        boolean z2 = true;
                        if (a3) {
                            a2 = true;
                        } else {
                            a2 = com.amazon.aps.iva.o2.g.a(j6, g);
                        }
                        if (a2) {
                            g2.s(899698236);
                            a0.a(m0, g2, 0);
                            g2.U(false);
                        } else if (com.amazon.aps.iva.o2.g.a(j6, h)) {
                            g2.s(899698308);
                            com.amazon.aps.iva.ud.z.a(m0, g2, 0);
                            g2.U(false);
                        } else {
                            if (!com.amazon.aps.iva.o2.g.a(j6, i)) {
                                z2 = com.amazon.aps.iva.o2.g.a(j6, j);
                            }
                            if (z2) {
                                g2.s(899698417);
                                v.a(m0, g2, 0);
                                g2.U(false);
                            } else {
                                g2.s(899698471);
                                g2.U(false);
                            }
                        }
                        g2.U(false);
                    }
                    g2.U(false);
                } else if (gVar instanceof g.b) {
                    g2.s(899698542);
                    f0.a(com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(aVar, com.amazon.aps.iva.o2.g.b(j2)), com.amazon.aps.iva.o2.g.c(j2)), g2, 0, 0);
                    g2.U(false);
                } else {
                    g2.s(899698624);
                    g2.U(false);
                }
                g2.U(false);
            } else {
                g2.s(899698634);
                g2.U(false);
            }
        }
        j2 X = g2.X();
        if (X != null) {
            X.d = new a(i2);
        }
    }

    @Override // com.amazon.aps.iva.r4.z
    public final w1 h() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.r4.z
    public final com.amazon.aps.iva.z4.b i() {
        return this.d;
    }
}
