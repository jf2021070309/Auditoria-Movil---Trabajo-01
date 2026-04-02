package com.amazon.aps.iva.f10;

import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.kb0.q;
/* compiled from: DownloadsAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.d10.i i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, com.amazon.aps.iva.d10.i iVar, int i) {
        super(0);
        this.h = eVar;
        this.i = iVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        f fVar = this.h.d;
        com.amazon.aps.iva.d10.i iVar = this.i;
        com.amazon.aps.iva.yb0.j.e(iVar, "downloadPanel");
        fVar.a(iVar, a.C0423a.a(com.amazon.aps.iva.js.k.COLLECTION, 0, this.j, null, null, 56));
        return q.a;
    }
}
