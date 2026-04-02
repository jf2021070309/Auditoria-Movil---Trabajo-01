package c.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f1303b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f1304c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f1305d = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // c.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1308d;
        }

        @Override // c.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1307c;
        }
    }

    /* renamed from: c.c.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0023b<K, V> extends e<K, V> {
        public C0023b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // c.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1307c;
        }

        @Override // c.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1308d;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K a;

        /* renamed from: b  reason: collision with root package name */
        public final V f1306b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f1307c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f1308d;

        public c(K k2, V v) {
            this.a = k2;
            this.f1306b = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && this.f1306b.equals(cVar.f1306b);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1306b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.a.hashCode() ^ this.f1306b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.a + "=" + this.f1306b;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1309b = true;

        public d() {
        }

        @Override // c.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f1308d;
                this.a = cVar3;
                this.f1309b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1309b) {
                return b.this.a != null;
            }
            c<K, V> cVar = this.a;
            return (cVar == null || cVar.f1307c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1309b) {
                this.f1309b = false;
                this.a = b.this.a;
            } else {
                c<K, V> cVar = this.a;
                this.a = cVar != null ? cVar.f1307c : null;
            }
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f1311b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.f1311b = cVar;
        }

        @Override // c.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.a == cVar && cVar == this.f1311b) {
                this.f1311b = null;
                this.a = null;
            }
            c<K, V> cVar3 = this.a;
            if (cVar3 == cVar) {
                this.a = b(cVar3);
            }
            c<K, V> cVar4 = this.f1311b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.a;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f1311b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1311b != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f1311b;
            c<K, V> cVar2 = this.a;
            this.f1311b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k2) {
        c<K, V> cVar = this.a;
        while (cVar != null && !cVar.a.equals(k2)) {
            cVar = cVar.f1307c;
        }
        return cVar;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f1304c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> c(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f1305d++;
        c<K, V> cVar2 = this.f1303b;
        if (cVar2 == null) {
            this.a = cVar;
            this.f1303b = cVar;
            return cVar;
        }
        cVar2.f1307c = cVar;
        cVar.f1308d = cVar2;
        this.f1303b = cVar;
        return cVar;
    }

    public V d(K k2, V v) {
        c<K, V> a2 = a(k2);
        if (a2 != null) {
            return a2.f1306b;
        }
        c(k2, v);
        return null;
    }

    public V e(K k2) {
        c<K, V> a2 = a(k2);
        if (a2 == null) {
            return null;
        }
        this.f1305d--;
        if (!this.f1304c.isEmpty()) {
            for (f<K, V> fVar : this.f1304c.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.f1308d;
        if (cVar != null) {
            cVar.f1307c = a2.f1307c;
        } else {
            this.a = a2.f1307c;
        }
        c<K, V> cVar2 = a2.f1307c;
        if (cVar2 != null) {
            cVar2.f1308d = cVar;
        } else {
            this.f1303b = cVar;
        }
        a2.f1307c = null;
        a2.f1308d = null;
        return a2.f1306b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((c.c.a.b.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof c.c.a.b.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c.c.a.b.b r7 = (c.c.a.b.b) r7
            int r1 = r6.f1305d
            int r3 = r7.f1305d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            c.c.a.b.b$e r3 = (c.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            c.c.a.b.b$e r4 = (c.c.a.b.b.e) r4
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
            c.c.a.b.b$e r7 = (c.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.a, this.f1303b);
        this.f1304c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                y.append("]");
                return y.toString();
            }
            y.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                y.append(", ");
            }
        }
    }
}
