package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.rc0.p0;
import java.util.List;
/* compiled from: CloneableClassScope.kt */
/* loaded from: classes4.dex */
public final class a extends com.amazon.aps.iva.xd0.e {
    public static final com.amazon.aps.iva.nd0.f e = com.amazon.aps.iva.nd0.f.h("clone");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.rc0.n nVar) {
        super(lVar, nVar);
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
    }

    @Override // com.amazon.aps.iva.xd0.e
    public final List<com.amazon.aps.iva.oc0.v> h() {
        b.a aVar = b.a.DECLARATION;
        t0.a aVar2 = t0.a;
        com.amazon.aps.iva.nd0.f fVar = e;
        com.amazon.aps.iva.oc0.e eVar = this.b;
        p0 Q0 = p0.Q0(eVar, fVar, aVar, aVar2);
        q0 F0 = eVar.F0();
        z zVar = z.b;
        Q0.J0(null, F0, zVar, zVar, zVar, com.amazon.aps.iva.ud0.b.e(eVar).f(), b0.OPEN, com.amazon.aps.iva.oc0.q.c);
        return f1.J(Q0);
    }
}
