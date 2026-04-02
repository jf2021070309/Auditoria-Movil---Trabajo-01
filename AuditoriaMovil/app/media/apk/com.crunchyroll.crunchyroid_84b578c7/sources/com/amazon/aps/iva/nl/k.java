package com.amazon.aps.iva.nl;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a0.p0;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.v1.t1;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.r<com.amazon.aps.iva.e0.c, Integer, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.pe0.a aVar, com.amazon.aps.iva.xb0.l lVar) {
        super(4);
        this.h = aVar;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final com.amazon.aps.iva.kb0.q K(com.amazon.aps.iva.e0.c cVar, Integer num, com.amazon.aps.iva.o0.i iVar, Integer num2) {
        int i;
        com.amazon.aps.iva.o0.i iVar2;
        int i2;
        int i3;
        com.amazon.aps.iva.e0.c cVar2 = cVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.o0.i iVar3 = iVar;
        int intValue2 = num2.intValue();
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$items");
        if ((intValue2 & 14) == 0) {
            if (iVar3.H(cVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (iVar3.c(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 731) == 146 && iVar3.h()) {
            iVar3.A();
        } else {
            e0.b bVar = e0.a;
            a aVar = (a) this.h.get(intValue);
            f.a aVar2 = f.a.c;
            com.amazon.aps.iva.a1.f e = androidx.compose.foundation.layout.e.e(aVar2);
            boolean z = aVar.d;
            com.amazon.aps.iva.xb0.l lVar = this.i;
            g gVar = new g(lVar, aVar);
            com.amazon.aps.iva.yb0.j.f(e, "$this$selectable");
            com.amazon.aps.iva.a1.f e2 = androidx.compose.foundation.layout.d.e(com.amazon.aps.iva.a1.e.a(e, t1.a, new com.amazon.aps.iva.h0.a(z, true, null, gVar)), 14);
            b.C0098b c0098b = a.C0097a.k;
            iVar3.s(693286680);
            d0 a = v1.a(com.amazon.aps.iva.d0.a.a, c0098b, iVar3);
            iVar3.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar3);
            c2 l = iVar3.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar3 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(e2);
            if (iVar3.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar3.z();
                if (iVar3.e()) {
                    iVar3.w(aVar3);
                } else {
                    iVar3.m();
                }
                com.amazon.aps.iva.cq.b.k0(iVar3, a, e.a.e);
                com.amazon.aps.iva.cq.b.k0(iVar3, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar3.e() || !com.amazon.aps.iva.yb0.j.a(iVar3.t(), Integer.valueOf(S))) {
                    b2.c(S, iVar3, S, c0752a);
                }
                com.amazon.aps.iva.b8.i.c(0, a2, new x2(iVar3), iVar3, 2058660585);
                boolean z2 = aVar.d;
                com.amazon.aps.iva.a1.f j = androidx.compose.foundation.layout.e.j(aVar2, 20);
                long j2 = com.amazon.aps.iva.ao.a.r;
                com.amazon.aps.iva.m0.x2.a(z2, new h(lVar, aVar), j, false, null, x.D(j2, iVar3, 5), iVar3, 384, 24);
                a4.b(aVar.b, androidx.compose.foundation.layout.d.i(aVar2, 34, 0.0f, 0.0f, 0.0f, 14), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.f, iVar3, 48, 0, 65528);
                iVar3.s(1694027261);
                if (aVar.c) {
                    iVar2 = iVar3;
                    p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_crown_premium_audio, iVar3), "", androidx.compose.foundation.layout.d.i(aVar2, 4, 0.0f, 0.0f, 0.0f, 14), null, f.a.a, 0.0f, null, iVar3, 25016, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
                } else {
                    iVar2 = iVar3;
                }
                iVar2.G();
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
