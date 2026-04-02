package com.amazon.aps.iva.e4;

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
/* loaded from: classes.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int i = 0;
    public final int b;
    public boolean e;
    public volatile j1<K, V>.f f;
    public volatile j1<K, V>.b h;
    public List<j1<K, V>.d> c = Collections.emptyList();
    public Map<K, V> d = Collections.emptyMap();
    public Map<K, V> g = Collections.emptyMap();

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class a implements Iterator<Map.Entry<K, V>> {
        public int b;
        public Iterator<Map.Entry<K, V>> c;

        public a() {
            this.b = j1.this.c.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = j1.this.g.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.b;
            if ((i > 0 && i <= j1.this.c.size()) || a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<j1<K, V>.d> list = j1.this.c;
            int i = this.b - 1;
            this.b = i;
            return list.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class b extends j1<K, V>.f {
        public b() {
            super();
        }

        @Override // com.amazon.aps.iva.e4.j1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public static class c {
        public static final a a = new a();
        public static final b b = new b();

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes.dex */
        public static class a implements Iterator<Object> {
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
        /* loaded from: classes.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return c.a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class d implements Map.Entry<K, V>, Comparable<j1<K, V>.d> {
        public final K b;
        public V c;

        public d() {
            throw null;
        }

        public d(K k, V v) {
            this.b = k;
            this.c = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.b.compareTo(((d) obj).b);
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
            int i = j1.i;
            j1.this.c();
            V v2 = this.c;
            this.c = v;
            return v2;
        }

        public final String toString() {
            return this.b + "=" + this.c;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class e implements Iterator<Map.Entry<K, V>> {
        public int b = -1;
        public boolean c;
        public Iterator<Map.Entry<K, V>> d;

        public e() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.d == null) {
                this.d = j1.this.d.entrySet().iterator();
            }
            return this.d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.b + 1;
            j1 j1Var = j1.this;
            if (i < j1Var.c.size()) {
                return true;
            }
            if (!j1Var.d.isEmpty() && a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.c = true;
            int i = this.b + 1;
            this.b = i;
            j1 j1Var = j1.this;
            if (i < j1Var.c.size()) {
                return j1Var.c.get(this.b);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.c) {
                this.c = false;
                int i = j1.i;
                j1 j1Var = j1.this;
                j1Var.c();
                if (this.b < j1Var.c.size()) {
                    int i2 = this.b;
                    this.b = i2 - 1;
                    j1Var.k(i2);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                Object value = entry.getValue();
                j1.this.put((Comparable) entry.getKey(), value);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                j1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return j1.this.size();
        }
    }

    public j1(int i2) {
        this.b = i2;
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
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k.compareTo(this.c.get(i3).b);
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 > 0) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
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

    public final Map.Entry<K, V> d(int i2) {
        return this.c.get(i2);
    }

    public final int e() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f == null) {
            this.f = new f();
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int e2 = e();
        if (e2 != j1Var.e()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i2 = 0; i2 < e2; i2++) {
            if (!d(i2).equals(j1Var.d(i2))) {
                return false;
            }
        }
        if (e2 == size) {
            return true;
        }
        return this.d.equals(j1Var.d);
    }

    public final Iterable<Map.Entry<K, V>> g() {
        if (this.d.isEmpty()) {
            return c.b;
        }
        return this.d.entrySet();
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

    public final SortedMap<K, V> h() {
        c();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.g = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int e2 = e();
        int i2 = 0;
        for (int i3 = 0; i3 < e2; i3++) {
            i2 += this.c.get(i3).hashCode();
        }
        if (this.d.size() > 0) {
            return i2 + this.d.hashCode();
        }
        return i2;
    }

    public void i() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.e) {
            if (this.d.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.d);
            }
            this.d = unmodifiableMap;
            if (this.g.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.g);
            }
            this.g = unmodifiableMap2;
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: j */
    public final V put(K k, V v) {
        c();
        int b2 = b(k);
        if (b2 >= 0) {
            return this.c.get(b2).setValue(v);
        }
        c();
        boolean isEmpty = this.c.isEmpty();
        int i2 = this.b;
        if (isEmpty && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(i2);
        }
        int i3 = -(b2 + 1);
        if (i3 >= i2) {
            return h().put(k, v);
        }
        if (this.c.size() == i2) {
            j1<K, V>.d remove = this.c.remove(i2 - 1);
            h().put(remove.b, remove.c);
        }
        this.c.add(i3, new d(k, v));
        return null;
    }

    public final V k(int i2) {
        c();
        V v = this.c.remove(i2).c;
        if (!this.d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = h().entrySet().iterator();
            List<j1<K, V>.d> list = this.c;
            Map.Entry<K, V> next = it.next();
            list.add(new d(next.getKey(), next.getValue()));
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
            return (V) k(b2);
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
