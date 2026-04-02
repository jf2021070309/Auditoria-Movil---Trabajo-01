package com.amazon.aps.iva.lb0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: AbstractMap.kt */
/* loaded from: classes4.dex */
public abstract class d<K, V> implements Map<K, V>, com.amazon.aps.iva.zb0.a {

    /* compiled from: AbstractMap.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Map.Entry<? extends K, ? extends V>, CharSequence> {
        public final /* synthetic */ d<K, V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d<K, ? extends V> dVar) {
            super(1);
            this.h = dVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(Object obj) {
            String valueOf;
            Map.Entry entry = (Map.Entry) obj;
            com.amazon.aps.iva.yb0.j.f(entry, "it");
            d<K, V> dVar = this.h;
            dVar.getClass();
            StringBuilder sb = new StringBuilder();
            Object key = entry.getKey();
            String str = "(this Map)";
            if (key == dVar) {
                valueOf = "(this Map)";
            } else {
                valueOf = String.valueOf(key);
            }
            sb.append(valueOf);
            sb.append('=');
            Object value = entry.getValue();
            if (value != dVar) {
                str = String.valueOf(value);
            }
            sb.append(str);
            return sb.toString();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (com.amazon.aps.iva.yb0.j.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new com.amazon.aps.iva.s0.n((com.amazon.aps.iva.s0.d) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f A[SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r5
            com.amazon.aps.iva.s0.d r1 = (com.amazon.aps.iva.s0.d) r1
            java.util.Map r6 = (java.util.Map) r6
            int r3 = r6.size()
            int r1 = r1.c
            if (r1 == r3) goto L18
            return r2
        L18:
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L2c
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2c
            goto L60
        L2c:
            java.util.Iterator r6 = r6.iterator()
        L30:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 != 0) goto L40
        L3e:
            r1 = r2
            goto L5d
        L40:
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r4 = r5.get(r3)
            boolean r1 = com.amazon.aps.iva.yb0.j.a(r1, r4)
            if (r1 != 0) goto L53
            goto L3e
        L53:
            if (r4 != 0) goto L5c
            boolean r1 = r5.containsKey(r3)
            if (r1 != 0) goto L5c
            goto L3e
        L5c:
            r1 = r0
        L5d:
            if (r1 != 0) goto L30
            r0 = r2
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.lb0.d.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((com.amazon.aps.iva.s0.d) this).c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return new com.amazon.aps.iva.s0.p((com.amazon.aps.iva.s0.d) this);
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((com.amazon.aps.iva.s0.d) this).c;
    }

    public final String toString() {
        return x.B0(entrySet(), ", ", "{", "}", new a(this), 24);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return new com.amazon.aps.iva.s0.r((com.amazon.aps.iva.s0.d) this);
    }
}
