package com.amazon.aps.iva.ci;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MusicAssetsAdapter.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, h hVar) {
        super(0);
        this.h = eVar;
        this.i = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        com.amazon.aps.iva.xb0.l<h, q> lVar = this.h.b;
        h hVar = this.i;
        j.e(hVar, "item");
        lVar.invoke(hVar);
        return q.a;
    }
}
