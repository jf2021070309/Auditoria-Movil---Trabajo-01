package com.amazon.aps.iva.me0;

import com.amazon.aps.iva.aq.j;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.lb0.e0;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.yb0.h0;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: SmartSet.kt */
/* loaded from: classes4.dex */
public final class d<T> extends AbstractSet<T> {
    public static final /* synthetic */ int d = 0;
    public Object b;
    public int c;

    /* compiled from: SmartSet.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Iterator<T>, com.amazon.aps.iva.zb0.a {
        public final e0 b;

        public a(T[] tArr) {
            this.b = j.C(tArr);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) this.b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmartSet.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Iterator<T>, com.amazon.aps.iva.zb0.a {
        public final T b;
        public boolean c = true;

        public b(T t) {
            this.b = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.c) {
                this.c = false;
                return this.b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        Object[] objArr;
        int i = this.c;
        if (i == 0) {
            this.b = t;
        } else {
            if (i == 1) {
                if (com.amazon.aps.iva.yb0.j.a(this.b, t)) {
                    return false;
                }
                this.b = new Object[]{this.b, t};
            } else if (i < 5) {
                Object obj = this.b;
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                Object[] objArr2 = (Object[]) obj;
                if (o.N(objArr2, t)) {
                    return false;
                }
                int i2 = this.c;
                if (i2 == 4) {
                    Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                    com.amazon.aps.iva.yb0.j.f(copyOf, "elements");
                    ?? linkedHashSet = new LinkedHashSet(k.w(copyOf.length));
                    for (Object obj2 : copyOf) {
                        linkedHashSet.add(obj2);
                    }
                    linkedHashSet.add(t);
                    objArr = linkedHashSet;
                } else {
                    Object[] copyOf2 = Arrays.copyOf(objArr2, i2 + 1);
                    com.amazon.aps.iva.yb0.j.e(copyOf2, "copyOf(this, newSize)");
                    copyOf2[copyOf2.length - 1] = t;
                    objArr = copyOf2;
                }
                this.b = objArr;
            } else {
                Object obj3 = this.b;
                com.amazon.aps.iva.yb0.j.d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
                if (!h0.d(obj3).add(t)) {
                    return false;
                }
            }
        }
        this.c++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b = null;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.c;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return com.amazon.aps.iva.yb0.j.a(this.b, obj);
        }
        if (i < 5) {
            Object obj2 = this.b;
            com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return o.N((Object[]) obj2, obj);
        }
        Object obj3 = this.b;
        com.amazon.aps.iva.yb0.j.d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        int i = this.c;
        if (i == 0) {
            return Collections.emptySet().iterator();
        }
        if (i == 1) {
            return new b(this.b);
        }
        if (i < 5) {
            Object obj = this.b;
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.b;
        com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return h0.d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
