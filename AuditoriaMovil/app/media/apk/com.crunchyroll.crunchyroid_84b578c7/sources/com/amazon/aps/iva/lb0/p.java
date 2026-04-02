package com.amazon.aps.iva.lb0;

import java.util.Iterator;
/* compiled from: _Arrays.kt */
/* loaded from: classes4.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Iterator<Object>> {
    public final /* synthetic */ Object[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Object[] objArr) {
        super(0);
        this.h = objArr;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Iterator<Object> invoke() {
        return com.amazon.aps.iva.aq.j.C(this.h);
    }
}
