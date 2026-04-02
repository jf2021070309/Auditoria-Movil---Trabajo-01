package e.d.e.c0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes2.dex */
public final class s<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> a = new a();

    /* renamed from: b  reason: collision with root package name */
    public Comparator<? super K> f7822b;

    /* renamed from: c  reason: collision with root package name */
    public e<K, V> f7823c;

    /* renamed from: d  reason: collision with root package name */
    public int f7824d;

    /* renamed from: e  reason: collision with root package name */
    public int f7825e;

    /* renamed from: f  reason: collision with root package name */
    public final e<K, V> f7826f;

    /* renamed from: g  reason: collision with root package name */
    public s<K, V>.b f7827g;

    /* renamed from: h  reason: collision with root package name */
    public s<K, V>.c f7828h;

    /* loaded from: classes2.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes2.dex */
        public class a extends s<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && s.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> b2;
            if ((obj instanceof Map.Entry) && (b2 = s.this.b((Map.Entry) obj)) != null) {
                s.this.i(b2, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f7824d;
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes2.dex */
        public class a extends s<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f7836f;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return s.this.f(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            s sVar = s.this;
            e<K, V> f2 = sVar.f(obj);
            if (f2 != null) {
                sVar.i(f2, true);
            }
            return f2 != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f7824d;
        }
    }

    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {
        public e<K, V> a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f7829b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f7830c;

        public d() {
            this.a = s.this.f7826f.f7834d;
            this.f7830c = s.this.f7825e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.a;
            s sVar = s.this;
            if (eVar != sVar.f7826f) {
                if (sVar.f7825e == this.f7830c) {
                    this.a = eVar.f7834d;
                    this.f7829b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != s.this.f7826f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f7829b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            s.this.i(eVar, true);
            this.f7829b = null;
            this.f7830c = s.this.f7825e;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f7832b;

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f7833c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f7834d;

        /* renamed from: e  reason: collision with root package name */
        public e<K, V> f7835e;

        /* renamed from: f  reason: collision with root package name */
        public final K f7836f;

        /* renamed from: g  reason: collision with root package name */
        public V f7837g;

        /* renamed from: h  reason: collision with root package name */
        public int f7838h;

        public e() {
            this.f7836f = null;
            this.f7835e = this;
            this.f7834d = this;
        }

        public e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.a = eVar;
            this.f7836f = k2;
            this.f7838h = 1;
            this.f7834d = eVar2;
            this.f7835e = eVar3;
            eVar3.f7834d = this;
            eVar2.f7835e = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k2 = this.f7836f;
                if (k2 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k2.equals(entry.getKey())) {
                    return false;
                }
                V v = this.f7837g;
                if (v == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f7836f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7837g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f7836f;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f7837g;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f7837g;
            this.f7837g = v;
            return v2;
        }

        public String toString() {
            return this.f7836f + "=" + this.f7837g;
        }
    }

    public s() {
        Comparator<Comparable> comparator = a;
        this.f7824d = 0;
        this.f7825e = 0;
        this.f7826f = new e<>();
        this.f7822b = comparator;
    }

    public e<K, V> a(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f7822b;
        e<K, V> eVar2 = this.f7823c;
        if (eVar2 != null) {
            Comparable comparable = comparator == a ? (Comparable) k2 : null;
            while (true) {
                i2 = comparable != null ? comparable.compareTo(eVar2.f7836f) : comparator.compare(k2, (K) eVar2.f7836f);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f7832b : eVar2.f7833c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (z) {
            e<K, V> eVar4 = this.f7826f;
            if (eVar2 != null) {
                eVar = new e<>(eVar2, k2, eVar4, eVar4.f7835e);
                if (i2 < 0) {
                    eVar2.f7832b = eVar;
                } else {
                    eVar2.f7833c = eVar;
                }
                h(eVar2, true);
            } else if (comparator == a && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            } else {
                eVar = new e<>(eVar2, k2, eVar4, eVar4.f7835e);
                this.f7823c = eVar;
            }
            this.f7824d++;
            this.f7825e++;
            return eVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e.d.e.c0.s.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            e.d.e.c0.s$e r0 = r4.f(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.f7837g
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = 0
            goto L20
        L1f:
            r5 = 1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.c0.s.b(java.util.Map$Entry):e.d.e.c0.s$e");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f7823c = null;
        this.f7824d = 0;
        this.f7825e++;
        e<K, V> eVar = this.f7826f;
        eVar.f7835e = eVar;
        eVar.f7834d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.b bVar = this.f7827g;
        if (bVar != null) {
            return bVar;
        }
        s<K, V>.b bVar2 = new b();
        this.f7827g = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> f(Object obj) {
        if (obj != 0) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> f2 = f(obj);
        if (f2 != null) {
            return f2.f7837g;
        }
        return null;
    }

    public final void h(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f7832b;
            e<K, V> eVar3 = eVar.f7833c;
            int i2 = eVar2 != null ? eVar2.f7838h : 0;
            int i3 = eVar3 != null ? eVar3.f7838h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.f7832b;
                e<K, V> eVar5 = eVar3.f7833c;
                int i5 = (eVar4 != null ? eVar4.f7838h : 0) - (eVar5 != null ? eVar5.f7838h : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    u(eVar);
                } else {
                    v(eVar3);
                    u(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.f7832b;
                e<K, V> eVar7 = eVar2.f7833c;
                int i6 = (eVar6 != null ? eVar6.f7838h : 0) - (eVar7 != null ? eVar7.f7838h : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    v(eVar);
                } else {
                    u(eVar2);
                    v(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f7838h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f7838h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.a;
        }
    }

    public void i(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i2;
        if (z) {
            e<K, V> eVar4 = eVar.f7835e;
            eVar4.f7834d = eVar.f7834d;
            eVar.f7834d.f7835e = eVar4;
        }
        e<K, V> eVar5 = eVar.f7832b;
        e<K, V> eVar6 = eVar.f7833c;
        e<K, V> eVar7 = eVar.a;
        int i3 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                t(eVar, eVar5);
                eVar.f7832b = null;
            } else if (eVar6 != null) {
                t(eVar, eVar6);
                eVar.f7833c = null;
            } else {
                t(eVar, null);
            }
            h(eVar7, false);
            this.f7824d--;
            this.f7825e++;
            return;
        }
        if (eVar5.f7838h > eVar6.f7838h) {
            e<K, V> eVar8 = eVar5.f7833c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                }
                eVar8 = eVar5.f7833c;
            }
        } else {
            e<K, V> eVar10 = eVar6.f7832b;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                }
                eVar10 = eVar6.f7832b;
            }
            eVar3 = eVar2;
        }
        i(eVar3, false);
        e<K, V> eVar11 = eVar.f7832b;
        if (eVar11 != null) {
            i2 = eVar11.f7838h;
            eVar3.f7832b = eVar11;
            eVar11.a = eVar3;
            eVar.f7832b = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar12 = eVar.f7833c;
        if (eVar12 != null) {
            i3 = eVar12.f7838h;
            eVar3.f7833c = eVar12;
            eVar12.a = eVar3;
            eVar.f7833c = null;
        }
        eVar3.f7838h = Math.max(i2, i3) + 1;
        t(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        s<K, V>.c cVar = this.f7828h;
        if (cVar != null) {
            return cVar;
        }
        s<K, V>.c cVar2 = new c();
        this.f7828h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        e<K, V> a2 = a(k2, true);
        V v2 = a2.f7837g;
        a2.f7837g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> f2 = f(obj);
        if (f2 != null) {
            i(f2, true);
        }
        if (f2 != null) {
            return f2.f7837g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7824d;
    }

    public final void t(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.a;
        eVar.a = null;
        if (eVar2 != null) {
            eVar2.a = eVar3;
        }
        if (eVar3 == null) {
            this.f7823c = eVar2;
        } else if (eVar3.f7832b == eVar) {
            eVar3.f7832b = eVar2;
        } else {
            eVar3.f7833c = eVar2;
        }
    }

    public final void u(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f7832b;
        e<K, V> eVar3 = eVar.f7833c;
        e<K, V> eVar4 = eVar3.f7832b;
        e<K, V> eVar5 = eVar3.f7833c;
        eVar.f7833c = eVar4;
        if (eVar4 != null) {
            eVar4.a = eVar;
        }
        t(eVar, eVar3);
        eVar3.f7832b = eVar;
        eVar.a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f7838h : 0, eVar4 != null ? eVar4.f7838h : 0) + 1;
        eVar.f7838h = max;
        eVar3.f7838h = Math.max(max, eVar5 != null ? eVar5.f7838h : 0) + 1;
    }

    public final void v(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f7832b;
        e<K, V> eVar3 = eVar.f7833c;
        e<K, V> eVar4 = eVar2.f7832b;
        e<K, V> eVar5 = eVar2.f7833c;
        eVar.f7832b = eVar5;
        if (eVar5 != null) {
            eVar5.a = eVar;
        }
        t(eVar, eVar2);
        eVar2.f7833c = eVar;
        eVar.a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f7838h : 0, eVar5 != null ? eVar5.f7838h : 0) + 1;
        eVar.f7838h = max;
        eVar2.f7838h = Math.max(max, eVar4 != null ? eVar4.f7838h : 0) + 1;
    }
}
