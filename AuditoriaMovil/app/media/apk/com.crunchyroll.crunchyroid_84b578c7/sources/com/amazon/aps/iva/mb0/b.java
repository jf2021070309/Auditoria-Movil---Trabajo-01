package com.amazon.aps.iva.mb0;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.ec0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.zb0.d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public final class b<K, V> implements Map<K, V>, Serializable, com.amazon.aps.iva.zb0.d {
    public static final b n;
    public K[] b;
    public V[] c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public com.amazon.aps.iva.mb0.d<K> j;
    public com.amazon.aps.iva.mb0.e<V> k;
    public com.amazon.aps.iva.mb0.c<K, V> l;
    public boolean m;

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: com.amazon.aps.iva.mb0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0508b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, com.amazon.aps.iva.zb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0508b(b<K, V> bVar) {
            super(bVar);
            j.f(bVar, "map");
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.c;
            b<K, V> bVar = this.b;
            if (i < bVar.g) {
                this.c = i + 1;
                this.d = i;
                c cVar = new c(bVar, i);
                b();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, d.a {
        public final b<K, V> b;
        public final int c;

        public c(b<K, V> bVar, int i) {
            j.f(bVar, "map");
            this.b = bVar;
            this.c = i;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (j.a(entry.getKey(), getKey()) && j.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b.b[this.c];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            V[] vArr = this.b.c;
            j.c(vArr);
            return vArr[this.c];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int i;
            K key = getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            V value = getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            b<K, V> bVar = this.b;
            bVar.c();
            V[] vArr = bVar.c;
            if (vArr == null) {
                vArr = (V[]) k.h(bVar.b.length);
                bVar.c = vArr;
            }
            int i = this.c;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static class d<K, V> {
        public final b<K, V> b;
        public int c;
        public int d;

        public d(b<K, V> bVar) {
            j.f(bVar, "map");
            this.b = bVar;
            this.d = -1;
            b();
        }

        public final void b() {
            while (true) {
                int i = this.c;
                b<K, V> bVar = this.b;
                if (i < bVar.g && bVar.d[i] < 0) {
                    this.c = i + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            if (this.c < this.b.g) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z;
            if (this.d != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b<K, V> bVar = this.b;
                bVar.c();
                bVar.n(this.d);
                this.d = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, com.amazon.aps.iva.zb0.a {
        @Override // java.util.Iterator
        public final K next() {
            int i = this.c;
            b<K, V> bVar = this.b;
            if (i < bVar.g) {
                this.c = i + 1;
                this.d = i;
                K k = bVar.b[i];
                b();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, com.amazon.aps.iva.zb0.a {
        @Override // java.util.Iterator
        public final V next() {
            int i = this.c;
            b<K, V> bVar = this.b;
            if (i < bVar.g) {
                this.c = i + 1;
                this.d = i;
                V[] vArr = bVar.c;
                j.c(vArr);
                V v = vArr[this.d];
                b();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        new a();
        b bVar = new b(0);
        bVar.m = true;
        n = bVar;
    }

    public b() {
        this(8);
    }

    public final int b(K k) {
        c();
        while (true) {
            int k2 = k(k);
            int i = this.f * 2;
            int length = this.e.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.e;
                int i3 = iArr[k2];
                if (i3 <= 0) {
                    int i4 = this.g;
                    K[] kArr = this.b;
                    if (i4 >= kArr.length) {
                        g(1);
                    } else {
                        int i5 = i4 + 1;
                        this.g = i5;
                        kArr[i4] = k;
                        this.d[i4] = k2;
                        iArr[k2] = i5;
                        this.i++;
                        if (i2 > this.f) {
                            this.f = i2;
                        }
                        return i4;
                    }
                } else if (j.a(this.b[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        l(this.e.length * 2);
                        break;
                    }
                    int i6 = k2 - 1;
                    if (k2 == 0) {
                        k2 = this.e.length - 1;
                    } else {
                        k2 = i6;
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.m) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        i it = new com.amazon.aps.iva.ec0.j(0, this.g - 1).iterator();
        while (it.d) {
            int b = it.b();
            int[] iArr = this.d;
            int i = iArr[b];
            if (i >= 0) {
                this.e[i] = 0;
                iArr[b] = -1;
            }
        }
        k.B(0, this.g, this.b);
        V[] vArr = this.c;
        if (vArr != null) {
            k.B(0, this.g, vArr);
        }
        this.i = 0;
        this.g = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (j(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.g;
        while (true) {
            i = -1;
            i2--;
            if (i2 < 0) {
                break;
            } else if (this.d[i2] >= 0) {
                V[] vArr = this.c;
                j.c(vArr);
                if (j.a(vArr[i2], obj)) {
                    i = i2;
                    break;
                }
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(Collection<?> collection) {
        j.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry<? extends K, ? extends V> entry) {
        j.f(entry, "entry");
        int j = j(entry.getKey());
        if (j < 0) {
            return false;
        }
        V[] vArr = this.c;
        j.c(vArr);
        return j.a(vArr[j], entry.getValue());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        com.amazon.aps.iva.mb0.c<K, V> cVar = this.l;
        if (cVar == null) {
            com.amazon.aps.iva.mb0.c<K, V> cVar2 = new com.amazon.aps.iva.mb0.c<>(this);
            this.l = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.i == map.size() && d(map.entrySet())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i) {
        boolean z;
        V[] vArr;
        K[] kArr = this.b;
        int length = kArr.length;
        int i2 = this.g;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        int i5 = 1;
        if (i3 < i && i3 + i4 >= i && i4 >= kArr.length / 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            l(this.e.length);
            return;
        }
        int i6 = i2 + i;
        if (i6 >= 0) {
            if (i6 > kArr.length) {
                int length2 = (kArr.length * 3) / 2;
                if (i6 <= length2) {
                    i6 = length2;
                }
                K[] kArr2 = (K[]) Arrays.copyOf(kArr, i6);
                j.e(kArr2, "copyOf(this, newSize)");
                this.b = kArr2;
                V[] vArr2 = this.c;
                if (vArr2 != null) {
                    vArr = (V[]) Arrays.copyOf(vArr2, i6);
                    j.e(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.c = vArr;
                int[] copyOf = Arrays.copyOf(this.d, i6);
                j.e(copyOf, "copyOf(this, newSize)");
                this.d = copyOf;
                if (i6 >= 1) {
                    i5 = i6;
                }
                int highestOneBit = Integer.highestOneBit(i5 * 3);
                if (highestOneBit > this.e.length) {
                    l(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int j = j(obj);
        if (j < 0) {
            return null;
        }
        V[] vArr = this.c;
        j.c(vArr);
        return vArr[j];
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        C0508b c0508b = new C0508b(this);
        int i3 = 0;
        while (c0508b.hasNext()) {
            int i4 = c0508b.c;
            b<K, V> bVar = c0508b.b;
            if (i4 < bVar.g) {
                c0508b.c = i4 + 1;
                c0508b.d = i4;
                K k = bVar.b[i4];
                if (k != null) {
                    i = k.hashCode();
                } else {
                    i = 0;
                }
                V[] vArr = bVar.c;
                j.c(vArr);
                V v = vArr[c0508b.d];
                if (v != null) {
                    i2 = v.hashCode();
                } else {
                    i2 = 0;
                }
                c0508b.b();
                i3 += i ^ i2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i3;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.i == 0) {
            return true;
        }
        return false;
    }

    public final int j(K k) {
        int k2 = k(k);
        int i = this.f;
        while (true) {
            int i2 = this.e[k2];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (j.a(this.b[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = k2 - 1;
            if (k2 == 0) {
                k2 = this.e.length - 1;
            } else {
                k2 = i4;
            }
        }
    }

    public final int k(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.h;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        com.amazon.aps.iva.mb0.d<K> dVar = this.j;
        if (dVar == null) {
            com.amazon.aps.iva.mb0.d<K> dVar2 = new com.amazon.aps.iva.mb0.d<>(this);
            this.j = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public final void l(int i) {
        boolean z;
        int i2;
        if (this.g > this.i) {
            V[] vArr = this.c;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = this.g;
                if (i3 >= i2) {
                    break;
                }
                if (this.d[i3] >= 0) {
                    K[] kArr = this.b;
                    kArr[i4] = kArr[i3];
                    if (vArr != null) {
                        vArr[i4] = vArr[i3];
                    }
                    i4++;
                }
                i3++;
            }
            k.B(i4, i2, this.b);
            if (vArr != null) {
                k.B(i4, this.g, vArr);
            }
            this.g = i4;
        }
        int[] iArr = this.e;
        if (i != iArr.length) {
            this.e = new int[i];
            this.h = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        int i5 = 0;
        while (i5 < this.g) {
            int i6 = i5 + 1;
            int k = k(this.b[i5]);
            int i7 = this.f;
            while (true) {
                int[] iArr2 = this.e;
                if (iArr2[k] == 0) {
                    iArr2[k] = i6;
                    this.d[i5] = k;
                    z = true;
                    break;
                }
                i7--;
                if (i7 < 0) {
                    z = false;
                    break;
                }
                int i8 = k - 1;
                if (k == 0) {
                    k = iArr2.length - 1;
                } else {
                    k = i8;
                }
            }
            if (z) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.b
            java.lang.String r1 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.d
            r0 = r0[r12]
            int r1 = r11.f
            int r1 = r1 * 2
            int[] r2 = r11.e
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1a
            r1 = r2
        L1a:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1e:
            int r5 = r0 + (-1)
            r6 = -1
            if (r0 != 0) goto L28
            int[] r0 = r11.e
            int r0 = r0.length
            int r0 = r0 + r6
            goto L29
        L28:
            r0 = r5
        L29:
            int r4 = r4 + 1
            int r5 = r11.f
            if (r4 <= r5) goto L34
            int[] r0 = r11.e
            r0[r1] = r2
            goto L63
        L34:
            int[] r5 = r11.e
            r7 = r5[r0]
            if (r7 != 0) goto L3d
            r5[r1] = r2
            goto L63
        L3d:
            if (r7 >= 0) goto L42
            r5[r1] = r6
            goto L5a
        L42:
            K[] r5 = r11.b
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.k(r5)
            int r5 = r5 - r0
            int[] r9 = r11.e
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L5c
            r9[r1] = r7
            int[] r4 = r11.d
            r4[r8] = r1
        L5a:
            r1 = r0
            r4 = r2
        L5c:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1e
            int[] r0 = r11.e
            r0[r1] = r6
        L63:
            int[] r0 = r11.d
            r0[r12] = r6
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.mb0.b.n(int):void");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        c();
        int b = b(k);
        V[] vArr = this.c;
        if (vArr == null) {
            vArr = (V[]) k.h(this.b.length);
            this.c = vArr;
        }
        if (b < 0) {
            int i = (-b) - 1;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }
        vArr[b] = v;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        j.f(map, "from");
        c();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            g(entrySet.size());
            for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
                int b = b(entry.getKey());
                V[] vArr = this.c;
                if (vArr == null) {
                    vArr = (V[]) k.h(this.b.length);
                    this.c = vArr;
                }
                if (b >= 0) {
                    vArr[b] = entry.getValue();
                } else {
                    int i = (-b) - 1;
                    if (!j.a(entry.getValue(), vArr[i])) {
                        vArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        c();
        int j = j(obj);
        if (j < 0) {
            j = -1;
        } else {
            n(j);
        }
        if (j < 0) {
            return null;
        }
        V[] vArr = this.c;
        j.c(vArr);
        V v = vArr[j];
        vArr[j] = null;
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        C0508b c0508b = new C0508b(this);
        int i = 0;
        while (c0508b.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c0508b.c;
            b<K, V> bVar = c0508b.b;
            if (i2 < bVar.g) {
                c0508b.c = i2 + 1;
                c0508b.d = i2;
                K k = bVar.b[i2];
                if (j.a(k, bVar)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(k);
                }
                sb.append('=');
                V[] vArr = bVar.c;
                j.c(vArr);
                V v = vArr[c0508b.d];
                if (j.a(v, bVar)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(v);
                }
                c0508b.b();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        j.e(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        com.amazon.aps.iva.mb0.e<V> eVar = this.k;
        if (eVar == null) {
            com.amazon.aps.iva.mb0.e<V> eVar2 = new com.amazon.aps.iva.mb0.e<>(this);
            this.k = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public b(int i) {
        K[] kArr = (K[]) k.h(i);
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.b = kArr;
        this.c = null;
        this.d = iArr;
        this.e = new int[highestOneBit];
        this.f = 2;
        this.g = 0;
        this.h = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
