package com.amazon.aps.iva.r0;

import com.amazon.aps.iva.q0.a;
import com.amazon.aps.iva.yb0.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: AbstractPersistentList.kt */
/* loaded from: classes.dex */
public abstract class b<E> extends com.amazon.aps.iva.lb0.c<E> implements com.amazon.aps.iva.q0.c<E> {

    /* compiled from: AbstractPersistentList.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<E, Boolean> {
        public final /* synthetic */ Collection<E> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.h = collection;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.h.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, com.amazon.aps.iva.q0.c
    public com.amazon.aps.iva.q0.c<E> addAll(Collection<? extends E> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        e a2 = a();
        a2.addAll(collection);
        return a2.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> remove(E e) {
        int indexOf = indexOf(e);
        if (indexOf != -1) {
            return m(indexOf);
        }
        return this;
    }

    @Override // java.util.Collection, java.util.List, com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> removeAll(Collection<? extends E> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        return i(new a(collection));
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final List subList(int i, int i2) {
        return new a.C0630a(this, i, i2);
    }
}
