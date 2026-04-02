package com.amazon.aps.iva.s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> b;
    public c<K, V> c;
    public final WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        @Override // com.amazon.aps.iva.s.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.e;
        }

        @Override // com.amazon.aps.iva.s.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: com.amazon.aps.iva.s.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0689b<K, V> extends e<K, V> {
        @Override // com.amazon.aps.iva.s.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // com.amazon.aps.iva.s.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K b;
        public final V c;
        public c<K, V> d;
        public c<K, V> e;

        public c(K k, V v) {
            this.b = k;
            this.c = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.b.equals(cVar.b) && this.c.equals(cVar.c)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.b.hashCode() ^ this.c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.b + "=" + this.c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> b;
        public boolean c = true;

        public d() {
        }

        @Override // com.amazon.aps.iva.s.b.f
        public final void a(c<K, V> cVar) {
            boolean z;
            c<K, V> cVar2 = this.b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e;
                this.b = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.c = z;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c) {
                if (b.this.b != null) {
                    return true;
                }
                return false;
            }
            c<K, V> cVar = this.b;
            if (cVar != null && cVar.d != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.c) {
                this.c = false;
                this.b = b.this.b;
            } else {
                c<K, V> cVar2 = this.b;
                if (cVar2 != null) {
                    cVar = cVar2.d;
                } else {
                    cVar = null;
                }
                this.b = cVar;
            }
            return this.b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> b;
        public c<K, V> c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.b = cVar2;
            this.c = cVar;
        }

        @Override // com.amazon.aps.iva.s.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.b == cVar && cVar == this.c) {
                this.c = null;
                this.b = null;
            }
            c<K, V> cVar3 = this.b;
            if (cVar3 == cVar) {
                this.b = b(cVar3);
            }
            c<K, V> cVar4 = this.c;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.b;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.c = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.c;
            c<K, V> cVar3 = this.b;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = c(cVar2);
            } else {
                cVar = null;
            }
            this.c = cVar;
            return cVar2;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> b(K k) {
        c<K, V> cVar = this.b;
        while (cVar != null && !cVar.b.equals(k)) {
            cVar = cVar.d;
        }
        return cVar;
    }

    public V d(K k, V v) {
        c<K, V> b = b(k);
        if (b != null) {
            return b.c;
        }
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        c<K, V> cVar2 = this.c;
        if (cVar2 == null) {
            this.b = cVar;
            this.c = cVar;
            return null;
        }
        cVar2.d = cVar;
        cVar.e = cVar2;
        this.c = cVar;
        return null;
    }

    public V e(K k) {
        c<K, V> b = b(k);
        if (b == null) {
            return null;
        }
        this.e--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (f<K, V> fVar : weakHashMap.keySet()) {
                fVar.a(b);
            }
        }
        c<K, V> cVar = b.e;
        if (cVar != null) {
            cVar.d = b.d;
        } else {
            this.b = b.d;
        }
        c<K, V> cVar2 = b.d;
        if (cVar2 != null) {
            cVar2.e = cVar;
        } else {
            this.c = cVar;
        }
        b.d = null;
        b.e = null;
        return b.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((com.amazon.aps.iva.s.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.amazon.aps.iva.s.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.amazon.aps.iva.s.b r7 = (com.amazon.aps.iva.s.b) r7
            int r1 = r6.e
            int r3 = r7.e
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            com.amazon.aps.iva.s.b$e r3 = (com.amazon.aps.iva.s.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            com.amazon.aps.iva.s.b$e r4 = (com.amazon.aps.iva.s.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            com.amazon.aps.iva.s.b$e r7 = (com.amazon.aps.iva.s.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.b, this.c);
        this.d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
