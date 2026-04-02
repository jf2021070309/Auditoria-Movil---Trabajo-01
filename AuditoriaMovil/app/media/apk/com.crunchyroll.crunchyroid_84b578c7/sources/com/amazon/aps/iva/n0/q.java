package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.z.k1;
import com.amazon.aps.iva.z.y;
/* compiled from: Ripple.kt */
/* loaded from: classes.dex */
public final class q {
    public static final k1<Float> a = new k1<>(15, y.b, 2);

    public static final e a(boolean z, float f, long j, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        iVar.s(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j = x.g;
        }
        e0.b bVar = e0.a;
        q1 h0 = com.amazon.aps.iva.cq.b.h0(new x(j), iVar);
        Boolean valueOf = Boolean.valueOf(z);
        com.amazon.aps.iva.o2.e eVar = new com.amazon.aps.iva.o2.e(f);
        iVar.s(511388516);
        boolean H = iVar.H(valueOf) | iVar.H(eVar);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            t = new e(z, f, h0);
            iVar.n(t);
        }
        iVar.G();
        e eVar2 = (e) t;
        iVar.G();
        return eVar2;
    }
}
