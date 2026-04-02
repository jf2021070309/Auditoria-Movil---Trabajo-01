package com.amazon.aps.iva.lb0;

import java.util.Iterator;
/* compiled from: Iterables.kt */
/* loaded from: classes4.dex */
public final class n implements Iterable<Object>, com.amazon.aps.iva.zb0.a {
    public final /* synthetic */ Object[] b;

    public n(Object[] objArr) {
        this.b = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return com.amazon.aps.iva.aq.j.C(this.b);
    }
}
