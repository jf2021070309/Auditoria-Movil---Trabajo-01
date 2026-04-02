package com.amazon.aps.iva.lb0;

import java.util.Collection;
/* compiled from: AbstractCollection.kt */
/* loaded from: classes4.dex */
public abstract class a<E> implements Collection<E>, com.amazon.aps.iva.zb0.a {

    /* compiled from: AbstractCollection.kt */
    /* renamed from: com.amazon.aps.iva.lb0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0473a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<E, CharSequence> {
        public final /* synthetic */ a<E> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0473a(a<? extends E> aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(Object obj) {
            if (obj == this.h) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (E e2 : this) {
            if (com.amazon.aps.iva.yb0.j.a(e2, e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
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

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return com.amazon.aps.iva.e.z.Q(this);
    }

    public final String toString() {
        return x.B0(this, ", ", "[", "]", new C0473a(this), 24);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "array");
        return (T[]) com.amazon.aps.iva.e.z.R(this, tArr);
    }
}
