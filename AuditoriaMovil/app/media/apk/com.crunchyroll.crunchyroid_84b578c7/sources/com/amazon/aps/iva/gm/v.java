package com.amazon.aps.iva.gm;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.u1.e;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.r<com.amazon.aps.iva.e0.c, Integer, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ a j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.amazon.aps.iva.pe0.a aVar, boolean z, a aVar2, com.amazon.aps.iva.xb0.l lVar, int i) {
        super(4);
        this.h = aVar;
        this.i = z;
        this.j = aVar2;
        this.k = lVar;
        this.l = i;
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final com.amazon.aps.iva.kb0.q K(com.amazon.aps.iva.e0.c cVar, Integer num, com.amazon.aps.iva.o0.i iVar, Integer num2) {
        int i;
        float f;
        int i2;
        int i3;
        com.amazon.aps.iva.e0.c cVar2 = cVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        int intValue2 = num2.intValue();
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$items");
        if ((intValue2 & 14) == 0) {
            if (iVar2.H(cVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (iVar2.c(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 731) == 146 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.hm.e eVar = (com.amazon.aps.iva.hm.e) this.h.get(intValue);
            iVar2.s(-483455358);
            f.a aVar = f.a.c;
            com.amazon.aps.iva.s1.d0 a = com.amazon.aps.iva.d0.m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, iVar2);
            iVar2.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar2);
            c2 l = iVar2.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(aVar);
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
                com.amazon.aps.iva.a1.f a3 = com.amazon.aps.iva.a2.o.a(aVar, false, m.h);
                boolean z = this.i;
                if (z) {
                    f = 24;
                } else {
                    f = 16;
                }
                float f2 = 16;
                com.amazon.aps.iva.im.b.a(eVar.a, androidx.compose.foundation.layout.d.i(a3, f, 0.0f, 0.0f, f2, 6), iVar2, 0, 0);
                com.amazon.aps.iva.a1.f a4 = com.amazon.aps.iva.a2.o.a(aVar, false, n.h);
                a.h g = com.amazon.aps.iva.d0.a.g(20);
                if (z) {
                    f2 = 24;
                }
                com.amazon.aps.iva.e0.b.b(a4, null, androidx.compose.foundation.layout.d.a(f2, 2), false, g, null, null, false, new s(eVar, this.j, this.k, this.l), iVar2, 24576, 234);
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
