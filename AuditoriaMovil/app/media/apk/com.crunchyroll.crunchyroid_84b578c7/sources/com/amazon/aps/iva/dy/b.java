package com.amazon.aps.iva.dy;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xx.n;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MusicAssetDelegate.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ n h;
    public final /* synthetic */ d i;
    public final /* synthetic */ com.amazon.aps.iva.jt.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.jt.a aVar, n nVar, d dVar) {
        super(2);
        this.h = nVar;
        this.i = dVar;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            n nVar = this.h;
            d dVar = this.i;
            f.a(nVar, dVar.a, dVar.b, new a(this.j, nVar, dVar), iVar2, 584);
        }
        return q.a;
    }
}
