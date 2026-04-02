package com.amazon.aps.iva.lb0;

import java.util.Iterator;
/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes4.dex */
public abstract class f0 implements Iterator<Integer>, com.amazon.aps.iva.zb0.a {
    public abstract int b();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
