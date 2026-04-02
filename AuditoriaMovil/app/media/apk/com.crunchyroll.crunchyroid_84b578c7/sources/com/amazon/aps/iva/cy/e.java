package com.amazon.aps.iva.cy;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ArtistsDelegate.kt */
/* loaded from: classes2.dex */
public final class e extends l implements p<i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.xx.b h;
    public final /* synthetic */ g i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, int i2, com.amazon.aps.iva.xx.b bVar, g gVar) {
        super(2);
        this.h = bVar;
        this.i = gVar;
        this.j = i;
        this.k = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.xx.b bVar2 = this.h;
            g gVar = this.i;
            a.a(bVar2, gVar.a, new d(this.j, this.k, bVar2, gVar), null, iVar2, 72, 8);
        }
        return q.a;
    }
}
