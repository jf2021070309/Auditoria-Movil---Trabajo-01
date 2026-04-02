package com.amazon.aps.iva.e4;

import java.util.Iterator;
import java.util.Map;
/* compiled from: LazyField.java */
/* loaded from: classes.dex */
public final class c0 extends d0 {

    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    public static class a<K> implements Map.Entry<K, Object> {
        public final Map.Entry<K, c0> b;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.b = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            c0 value = this.b.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof q0) {
                c0 value = this.b.getValue();
                q0 q0Var = value.a;
                value.b = null;
                value.a = (q0) obj;
                return q0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public final Iterator<Map.Entry<K, Object>> b;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.b.next();
            if (next.getValue() instanceof c0) {
                return new a(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.b.remove();
        }
    }

    @Override // com.amazon.aps.iva.e4.d0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // com.amazon.aps.iva.e4.d0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
