package com.amazon.aps.iva.od0;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: SmallSortedMap.java */
/* loaded from: classes4.dex */
public class u<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int g = 0;
    public final int b;
    public List<u<K, V>.b> c = Collections.emptyList();
    public Map<K, V> d = Collections.emptyMap();
    public boolean e;
    public volatile u<K, V>.d f;

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes4.dex */
    public static class a {
        public static final C0571a a = new C0571a();
        public static final b b = new b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: com.amazon.aps.iva.od0.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0571a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes4.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes4.dex */
    public class b implements Comparable<u<K, V>.b>, Map.Entry<K, V> {
        public final K b;
        public V c;

        public b() {
            throw null;
        }

        public b(K k, V v) {
            this.b = k;
            this.c = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.b.compareTo(((b) obj).b);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k = this.b;
            if (k == null) {
                if (key == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = k.equals(key);
            }
            if (equals) {
                V v = this.c;
                Object value = entry.getValue();
                if (v == null) {
                    if (value == null) {
                        equals2 = true;
                    } else {
                        equals2 = false;
                    }
                } else {
                    equals2 = v.equals(value);
                }
                if (equals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            int i = 0;
            K k = this.b;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.c;
            if (v != null) {
                i = v.hashCode();
            }
            return i ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = u.g;
            u.this.c();
            V v2 = this.c;
            this.c = v;
            return v2;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.b);
            String valueOf2 = String.valueOf(this.c);
            return com.amazon.aps.iva.n4.a.a(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, "=", valueOf2);
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes4.dex */
    public class c implements Iterator<Map.Entry<K, V>> {
        public int b = -1;
        public boolean c;
        public Iterator<Map.Entry<K, V>> d;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.d == null) {
                this.d = u.this.d.entrySet().iterator();
            }
            return this.d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b + 1 < u.this.c.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.c = true;
            int i = this.b + 1;
            this.b = i;
            u uVar = u.this;
            if (i < uVar.c.size()) {
                return uVar.c.get(this.b);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.c) {
                this.c = false;
                int i = u.g;
                u uVar = u.this;
                uVar.c();
                if (this.b < uVar.c.size()) {
                    int i2 = this.b;
                    this.b = i2 - 1;
                    uVar.h(i2);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes4.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                Object value = entry.getValue();
                u.this.g((Comparable) entry.getKey(), value);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                u.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return u.this.size();
        }
    }

    public u(int i) {
        this.b = i;
    }

    public final int b(K k) {
        int size = this.c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.c.get(size).b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.c.get(i2).b);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (b(comparable) < 0 && !this.d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> d() {
        if (this.d.isEmpty()) {
            return a.b;
        }
        return this.d.entrySet();
    }

    public final SortedMap<K, V> e() {
        c();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            this.d = new TreeMap();
        }
        return (SortedMap) this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f == null) {
            this.f = new d();
        }
        return this.f;
    }

    public final V g(K k, V v) {
        c();
        int b2 = b(k);
        if (b2 >= 0) {
            return this.c.get(b2).setValue(v);
        }
        c();
        boolean isEmpty = this.c.isEmpty();
        int i = this.b;
        if (isEmpty && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(i);
        }
        int i2 = -(b2 + 1);
        if (i2 >= i) {
            return e().put(k, v);
        }
        if (this.c.size() == i) {
            u<K, V>.b remove = this.c.remove(i - 1);
            e().put(remove.b, remove.c);
        }
        this.c.add(i2, new b(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return this.c.get(b2).c;
        }
        return this.d.get(comparable);
    }

    public final V h(int i) {
        c();
        V v = this.c.remove(i).c;
        if (!this.d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            List<u<K, V>.b> list = this.c;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return (V) h(b2);
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size() + this.c.size();
    }
}
