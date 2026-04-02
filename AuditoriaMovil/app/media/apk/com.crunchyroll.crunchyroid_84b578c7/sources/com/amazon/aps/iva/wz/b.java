package com.amazon.aps.iva.wz;

import androidx.compose.foundation.c;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.m;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.d;
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
/* compiled from: BrowseLoadingCard.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: BrowseLoadingCard.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<i, Integer, q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, int i) {
            super(2);
            this.h = fVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            f b;
            f b2;
            f b3;
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                iVar2.s(-483455358);
                d0 a = m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                e.o0.getClass();
                e.a aVar = e.a.b;
                com.amazon.aps.iva.v0.a a2 = u.a(this.h);
                int i = (((((this.i & 14) << 3) & 112) << 9) & 7168) | 6;
                if (iVar2.j() instanceof d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, a, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c((i >> 3) & 112, a2, new x2(iVar2), iVar2, 2058660585);
                    f.a aVar2 = f.a.c;
                    f a3 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.e(aVar2), 0.6666667f);
                    long j = com.amazon.aps.iva.ao.a.v;
                    b = c.b(a3, j, p0.a);
                    com.amazon.aps.iva.d0.f.a(b, iVar2, 0);
                    float f = 10;
                    float f2 = 16;
                    b2 = c.b(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.d.i(aVar2, 0.0f, f, 0.0f, 0.0f, 13), 106), f2), j, p0.a);
                    com.amazon.aps.iva.d0.f.a(b2, iVar2, 0);
                    b3 = c.b(androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.d.i(aVar2, 0.0f, f, 0.0f, 4, 5), 64), f2), j, p0.a);
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

    /* compiled from: BrowseLoadingCard.kt */
    /* renamed from: com.amazon.aps.iva.wz.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0835b extends l implements p<i, Integer, q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0835b(f fVar, int i, int i2) {
            super(2);
            this.h = fVar;
            this.i = i;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            int i = this.j;
            b.a(this.h, iVar, I, i);
            return q.a;
        }
    }

    public static final void a(f fVar, i iVar, int i, int i2) {
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g = iVar.g(1114977275);
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
            com.amazon.aps.iva.zn.p.a(48, 1, g, null, com.amazon.aps.iva.v0.b.b(g, -1178283162, new a(fVar, i3)));
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new C0835b(fVar, i, i2);
        }
    }
}
