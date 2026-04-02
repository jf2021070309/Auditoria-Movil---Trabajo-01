package com.amazon.aps.iva.kz;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayableAssetCardView.kt */
/* loaded from: classes2.dex */
public final class c extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar) {
        super(2);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.ot.b.a(this.h.l, null, iVar2, 0, 2);
        }
        return q.a;
    }
}
