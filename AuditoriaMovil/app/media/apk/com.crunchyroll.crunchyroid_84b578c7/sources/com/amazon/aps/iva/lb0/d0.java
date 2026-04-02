package com.amazon.aps.iva.lb0;

import java.util.Iterator;
/* compiled from: Iterables.kt */
/* loaded from: classes4.dex */
public final class d0<T> implements Iterable<c0<? extends T>>, com.amazon.aps.iva.zb0.a {
    public final com.amazon.aps.iva.xb0.a<Iterator<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(com.amazon.aps.iva.xb0.a<? extends Iterator<? extends T>> aVar) {
        this.b = aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<c0<T>> iterator() {
        return new e0(this.b.invoke());
    }
}
