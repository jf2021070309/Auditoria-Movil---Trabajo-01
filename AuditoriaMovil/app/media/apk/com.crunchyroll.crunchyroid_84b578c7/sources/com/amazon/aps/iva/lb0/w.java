package com.amazon.aps.iva.lb0;

import java.util.Iterator;
/* compiled from: _Collections.kt */
/* loaded from: classes4.dex */
public final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Iterator<Object>> {
    public final /* synthetic */ Iterable<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Iterable<Object> iterable) {
        super(0);
        this.h = iterable;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Iterator<Object> invoke() {
        return this.h.iterator();
    }
}
