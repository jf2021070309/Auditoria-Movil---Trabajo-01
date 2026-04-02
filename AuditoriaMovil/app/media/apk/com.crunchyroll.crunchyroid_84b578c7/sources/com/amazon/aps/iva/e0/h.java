package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.f0.i;
/* compiled from: LazyListIntervalContent.kt */
/* loaded from: classes.dex */
public final class h implements i.a {
    public final com.amazon.aps.iva.xb0.l<Integer, Object> a = null;
    public final com.amazon.aps.iva.xb0.l<Integer, Object> b;
    public final com.amazon.aps.iva.xb0.r<c, Integer, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> c;

    public h(com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.v0.a aVar) {
        this.b = lVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.f0.i.a
    public final com.amazon.aps.iva.xb0.l<Integer, Object> getKey() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.f0.i.a
    public final com.amazon.aps.iva.xb0.l<Integer, Object> getType() {
        return this.b;
    }
}
