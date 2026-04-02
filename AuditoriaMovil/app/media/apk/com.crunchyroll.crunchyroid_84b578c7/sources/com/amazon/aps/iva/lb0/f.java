package com.amazon.aps.iva.lb0;

import java.util.AbstractList;
import java.util.List;
/* compiled from: AbstractMutableList.kt */
/* loaded from: classes4.dex */
public abstract class f<E> extends AbstractList<E> implements List<E>, com.amazon.aps.iva.zb0.c {
    public abstract int b();

    public abstract E d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
