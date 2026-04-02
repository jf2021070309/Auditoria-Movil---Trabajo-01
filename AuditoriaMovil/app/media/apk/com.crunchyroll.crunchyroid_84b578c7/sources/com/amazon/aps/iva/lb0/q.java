package com.amazon.aps.iva.lb0;

import java.util.Iterator;
/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes4.dex */
public abstract class q implements Iterator<Character>, com.amazon.aps.iva.zb0.a {
    public abstract char b();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
