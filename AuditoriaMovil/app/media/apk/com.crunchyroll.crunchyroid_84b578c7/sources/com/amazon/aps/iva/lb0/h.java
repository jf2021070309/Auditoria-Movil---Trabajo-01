package com.amazon.aps.iva.lb0;

import java.util.AbstractSet;
import java.util.Set;
/* compiled from: AbstractMutableSet.kt */
/* loaded from: classes4.dex */
public abstract class h<E> extends AbstractSet<E> implements Set<E>, com.amazon.aps.iva.zb0.e {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
