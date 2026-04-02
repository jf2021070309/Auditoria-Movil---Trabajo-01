package com.amazon.aps.iva.im;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BackgroundAsset.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.v0.b.c(-1586146671, a.h, false);

    /* compiled from: BackgroundAsset.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements q<f, i, Integer, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(f fVar, i iVar, Integer num) {
            int i;
            f fVar2 = fVar;
            i iVar2 = iVar;
            int intValue = num.intValue();
            j.f(fVar2, "it");
            if ((intValue & 14) == 0) {
                if (iVar2.H(fVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            if ((intValue & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                f b = androidx.compose.foundation.c.b(fVar2, com.amazon.aps.iva.ao.a.v, p0.a);
                com.amazon.aps.iva.a1.b bVar2 = a.C0097a.e;
                iVar2.s(733328855);
                d0 c = com.amazon.aps.iva.d0.f.c(bVar2, false, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar = e.a.b;
                com.amazon.aps.iva.v0.a a = u.a(b);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, c, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar2), iVar2, 2058660585);
                    com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.image_failure_placeholder, iVar2), null, null, null, null, 0.0f, null, iVar2, 56, 124);
                    iVar2.G();
                    iVar2.o();
                    iVar2.G();
                    iVar2.G();
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }
}
