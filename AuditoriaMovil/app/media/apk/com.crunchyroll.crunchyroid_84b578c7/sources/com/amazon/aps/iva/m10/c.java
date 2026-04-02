package com.amazon.aps.iva.m10;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
/* compiled from: GenreEmptyCard.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: GenreEmptyCard.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.a1.f fVar) {
            super(2);
            this.h = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.a1.f b;
            com.amazon.aps.iva.a1.f b2;
            com.amazon.aps.iva.a1.f b3;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                b = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.e(this.h), 1.7777778f), com.amazon.aps.iva.ao.a.v, p0.a);
                b.a aVar = a.C0097a.n;
                a.b bVar2 = com.amazon.aps.iva.d0.a.e;
                iVar2.s(-483455358);
                d0 a = m.a(bVar2, aVar, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar2 = e.a.b;
                com.amazon.aps.iva.v0.a a2 = u.a(b);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar2);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, a, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a2, new x2(iVar2), iVar2, 2058660585);
                    f.a aVar3 = f.a.c;
                    com.amazon.aps.iva.a1.f F = com.amazon.aps.iva.cq.b.F(androidx.compose.foundation.layout.e.j(aVar3, 24), com.amazon.aps.iva.i0.g.a);
                    long j = com.amazon.aps.iva.ao.a.k;
                    b2 = androidx.compose.foundation.c.b(F, j, p0.a);
                    com.amazon.aps.iva.d0.f.a(b2, iVar2, 0);
                    b3 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(aVar3, 106), 14), 0.0f, 6, 0.0f, 0.0f, 13), j, p0.a);
                    com.amazon.aps.iva.d0.f.a(b3, iVar2, 0);
                    iVar2.G();
                    iVar2.o();
                    iVar2.G();
                    iVar2.G();
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return q.a;
        }
    }

    /* compiled from: GenreEmptyCard.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            int i = this.j;
            c.a(this.h, iVar, I, i);
            return q.a;
        }
    }

    public static final void a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g = iVar.g(1602550485);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            if (i5 != 0) {
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            com.amazon.aps.iva.zn.p.a(48, 1, g, null, com.amazon.aps.iva.v0.b.b(g, 820368384, new a(fVar)));
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(fVar, i, i2);
        }
    }
}
