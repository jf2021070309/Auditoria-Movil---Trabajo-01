package com.amazon.aps.iva.x;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {
    public a<K, V>.C0836a i;
    public a<K, V>.c j;
    public a<K, V>.e k;

    /* compiled from: ArrayMap.java */
    /* renamed from: com.amazon.aps.iva.x.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0836a extends AbstractSet<Map.Entry<K, V>> {
        public C0836a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a.this.d;
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    public final class b extends com.amazon.aps.iva.x.e<K> {
        public b() {
            super(a.this.d);
        }

        @Override // com.amazon.aps.iva.x.e
        public final K a(int i) {
            return a.this.j(i);
        }

        @Override // com.amazon.aps.iva.x.e
        public final void b(int i) {
            a.this.l(i);
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int b;
        public int c = -1;
        public boolean d;

        public d() {
            this.b = a.this.d - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (this.d) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.c;
                a aVar = a.this;
                K j = aVar.j(i);
                if (key != j && (key == null || !key.equals(j))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                Object value = entry.getValue();
                V n = aVar.n(this.c);
                if (value != n && (value == null || !value.equals(n))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.d) {
                return a.this.j(this.c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.d) {
                return a.this.n(this.c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c < this.b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            if (this.d) {
                int i = this.c;
                a aVar = a.this;
                K j = aVar.j(i);
                V n = aVar.n(this.c);
                int i2 = 0;
                if (j == null) {
                    hashCode = 0;
                } else {
                    hashCode = j.hashCode();
                }
                if (n != null) {
                    i2 = n.hashCode();
                }
                return hashCode ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.c++;
                this.d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.d) {
                a.this.l(this.c);
                this.c--;
                this.b--;
                this.d = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.d) {
                return a.this.m(this.c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    public final class f extends com.amazon.aps.iva.x.e<V> {
        public f() {
            super(a.this.d);
        }

        @Override // com.amazon.aps.iva.x.e
        public final V a(int i) {
            return a.this.n(i);
        }

        @Override // com.amazon.aps.iva.x.e
        public final void b(int i) {
            a.this.l(i);
        }
    }

    public a() {
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0836a c0836a = this.i;
        if (c0836a == null) {
            a<K, V>.C0836a c0836a2 = new C0836a();
            this.i = c0836a2;
            return c0836a2;
        }
        return c0836a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        a<K, V>.c cVar = this.j;
        if (cVar == null) {
            a<K, V>.c cVar2 = new c();
            this.j = cVar2;
            return cVar2;
        }
        return cVar;
    }

    public final boolean o(Collection<?> collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(j(i2))) {
                l(i2);
            }
        }
        if (i != this.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] p(T[] tArr, int i) {
        int i2 = this.d;
        if (tArr.length < i2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.c[(i3 << 1) + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        c(map.size() + this.d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        a<K, V>.e eVar = this.k;
        if (eVar == null) {
            a<K, V>.e eVar2 = new e();
            this.k = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public a(a aVar) {
        if (aVar != null) {
            k(aVar);
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            a aVar = a.this;
            aVar.getClass();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!aVar.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                            return true;
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int hashCode;
            a aVar = a.this;
            int i = 0;
            for (int i2 = aVar.d - 1; i2 >= 0; i2--) {
                K j = aVar.j(i2);
                if (j == null) {
                    hashCode = 0;
                } else {
                    hashCode = j.hashCode();
                }
                i += hashCode;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            a aVar = a.this;
            int g = aVar.g(obj);
            if (g >= 0) {
                aVar.l(g);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i = aVar.d;
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                aVar.remove(it.next());
            }
            if (i != aVar.d) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return a.this.d;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int i = aVar.d;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = aVar.j(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) a.this.p(tArr, 0);
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            if (a.this.i(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            a aVar = a.this;
            int i = aVar.i(obj);
            if (i >= 0) {
                aVar.l(i);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i = aVar.d;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(aVar.n(i2))) {
                    aVar.l(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int i = aVar.d;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(aVar.n(i2))) {
                    aVar.l(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return a.this.d;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int i = aVar.d;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = aVar.n(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) a.this.p(tArr, 1);
        }
    }
}
