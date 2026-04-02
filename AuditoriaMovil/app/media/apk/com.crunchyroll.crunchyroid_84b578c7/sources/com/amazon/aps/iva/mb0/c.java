package com.amazon.aps.iva.mb0;

import com.amazon.aps.iva.lb0.h;
import com.amazon.aps.iva.mb0.b;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public final class c<K, V> extends h<Map.Entry<Object, Object>> {
    public final b<K, V> b;

    public c(b<K, V> bVar) {
        j.f(bVar, "backing");
        this.b = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        j.f((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.lb0.h
    public final int b() {
        return this.b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        return this.b.d(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: d */
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> entry = (Map.Entry) obj;
        j.f(entry, "element");
        return this.b.e(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e */
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        b<K, V> bVar = this.b;
        bVar.getClass();
        bVar.c();
        int j = bVar.j(entry.getKey());
        if (j < 0) {
            return false;
        }
        V[] vArr = bVar.c;
        j.c(vArr);
        if (!j.a(vArr[j], entry.getValue())) {
            return false;
        }
        bVar.n(j);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        b<K, V> bVar = this.b;
        bVar.getClass();
        return new b.C0508b(bVar);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.b.c();
        return super.retainAll(collection);
    }
}
