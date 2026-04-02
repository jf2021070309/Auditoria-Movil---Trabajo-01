package com.amazon.aps.iva.dy;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xx.n;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MusicAssetDelegate.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ com.amazon.aps.iva.jt.a i;
    public final /* synthetic */ n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.jt.a aVar, n nVar, d dVar) {
        super(0);
        this.h = dVar;
        this.i = aVar;
        this.j = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.c.a(this.i, this.j);
        return q.a;
    }
}
