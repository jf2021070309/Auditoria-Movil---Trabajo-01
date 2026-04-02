package com.amazon.aps.iva.od0;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: LazyField.java */
/* loaded from: classes4.dex */
public final class k extends l {

    /* compiled from: LazyField.java */
    /* loaded from: classes4.dex */
    public static class a<K> implements Map.Entry<K, Object> {
        public final Map.Entry<K, k> b;

        public a(Map.Entry entry) {
            this.b = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            k value = this.b.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof p) {
                k value = this.b.getValue();
                p pVar = value.b;
                value.b = (p) obj;
                value.a = true;
                return pVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes4.dex */
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
            if (next.getValue() instanceof k) {
                return new a(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.b.remove();
        }
    }

    public final p a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
