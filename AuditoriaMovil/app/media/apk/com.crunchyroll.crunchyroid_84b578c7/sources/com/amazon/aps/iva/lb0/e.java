package com.amazon.aps.iva.lb0;

import java.util.AbstractCollection;
import java.util.Collection;
/* compiled from: AbstractMutableCollection.kt */
/* loaded from: classes4.dex */
public abstract class e<E> extends AbstractCollection<E> implements Collection<E>, com.amazon.aps.iva.zb0.b {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
