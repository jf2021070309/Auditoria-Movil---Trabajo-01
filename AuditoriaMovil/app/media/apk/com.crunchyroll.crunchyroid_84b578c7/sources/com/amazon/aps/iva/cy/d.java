package com.amazon.aps.iva.cy;

import com.amazon.aps.iva.js.k;
import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ArtistsDelegate.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ g h;
    public final /* synthetic */ com.amazon.aps.iva.xx.b i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, int i2, com.amazon.aps.iva.xx.b bVar, g gVar) {
        super(0);
        this.h = gVar;
        this.i = bVar;
        this.j = i;
        this.k = i2;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.b.a(this.i, a.C0423a.a(k.COLLECTION, this.j, this.k, null, null, 56));
        return q.a;
    }
}
