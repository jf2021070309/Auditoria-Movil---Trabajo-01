package com.amazon.aps.iva.va0;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
/* compiled from: CodePoints.kt */
/* loaded from: classes4.dex */
public final class a implements Collection<Integer>, com.amazon.aps.iva.zb0.a {
    public final /* synthetic */ String b;

    /* compiled from: CodePoints.kt */
    /* renamed from: com.amazon.aps.iva.va0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0792a implements Iterator<Integer>, com.amazon.aps.iva.zb0.a {
        public int b;

        public C0792a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b < a.this.b.length()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Integer next() {
            String str = a.this.b;
            int i = this.b;
            if (str != null) {
                int codePointAt = str.codePointAt(i);
                this.b = Character.charCount(codePointAt) + this.b;
                return Integer.valueOf(codePointAt);
            }
            throw new o("null cannot be cast to non-null type java.lang.String");
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(String str) {
        this.b = str;
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(Integer num) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        ((Number) obj).intValue();
        String str = this.b;
        if (str.length() <= 0) {
            return false;
        }
        str.codePointAt(0);
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        j.g(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.b.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C0792a();
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
    public final boolean removeIf(Predicate<? super Integer> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        String str = this.b;
        return str.codePointCount(0, str.length());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return z.Q(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) z.R(this, tArr);
    }
}
