package com.amazon.aps.iva.q0;

import com.amazon.aps.iva.r0.b;
import java.util.Collection;
/* compiled from: ImmutableList.kt */
/* loaded from: classes.dex */
public interface c<E> extends a<E>, Collection, com.amazon.aps.iva.zb0.a {
    com.amazon.aps.iva.r0.e a();

    @Override // java.util.List
    c<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection
    c<E> add(E e);

    @Override // java.util.List, java.util.Collection
    c<E> addAll(Collection<? extends E> collection);

    c i(b.a aVar);

    c<E> m(int i);

    @Override // java.util.List, java.util.Collection
    c<E> remove(E e);

    @Override // java.util.List, java.util.Collection
    c<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    c<E> set(int i, E e);
}
