package com.amazon.aps.iva.pd;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PersistentMessageCard.kt */
/* loaded from: classes.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.amazon.aps.iva.xb0.a<q> aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.fs.b bVar) {
        j.f(bVar, "it");
        this.h.invoke();
        return q.a;
    }
}
