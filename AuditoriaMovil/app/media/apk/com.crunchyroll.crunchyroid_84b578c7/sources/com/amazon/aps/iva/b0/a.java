package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.b0.c;
/* compiled from: BringIntoViewRequestPriorityQueue.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ b h;
    public final /* synthetic */ c.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c.a aVar) {
        super(1);
        this.h = bVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        this.h.a.k(this.i);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
