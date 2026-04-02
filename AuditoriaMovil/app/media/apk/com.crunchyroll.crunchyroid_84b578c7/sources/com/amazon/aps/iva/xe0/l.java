package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.ee0.f1;
/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes4.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ob0.g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, Object obj, com.amazon.aps.iva.ob0.g gVar) {
        super(1);
        this.h = lVar;
        this.i = obj;
        this.j = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        y m = f1.m(this.h, this.i, null);
        if (m != null) {
            com.amazon.aps.iva.se0.i.c(this.j, m);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
