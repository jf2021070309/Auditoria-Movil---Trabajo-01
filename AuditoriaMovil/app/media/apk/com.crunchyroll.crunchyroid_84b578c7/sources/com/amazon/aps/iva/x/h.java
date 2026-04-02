package com.amazon.aps.iva.x;

import com.amazon.aps.iva.a9.k0;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class h<K, V> {
    public static Object[] e;
    public static int f;
    public static Object[] g;
    public static int h;
    public int[] b;
    public Object[] c;
    public int d;

    public h() {
        this.b = k0.e;
        this.c = k0.g;
        this.d = 0;
    }

    private void b(int i) {
        if (i == 8) {
            synchronized (h.class) {
                Object[] objArr = g;
                if (objArr != null) {
                    this.c = objArr;
                    g = (Object[]) objArr[0];
                    this.b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (h.class) {
                Object[] objArr2 = e;
                if (objArr2 != null) {
                    this.c = objArr2;
                    e = (Object[]) objArr2[0];
                    this.b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.b = new int[i];
        this.c = new Object[i << 1];
    }

    public static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    public final void c(int i) {
        int i2 = this.d;
        int[] iArr = this.b;
        if (iArr.length < i) {
            Object[] objArr = this.c;
            b(i);
            if (this.d > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i2);
                System.arraycopy(objArr, 0, this.c, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.d == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.b;
            Object[] objArr = this.c;
            this.b = k0.e;
            this.c = k0.g;
            this.d = 0;
            d(iArr, objArr, i);
        }
        if (this.d <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (i(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int e(int i, Object obj) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int e2 = k0.e(i2, i, this.b);
            if (e2 < 0) {
                return e2;
            }
            if (obj.equals(this.c[e2 << 1])) {
                return e2;
            }
            int i3 = e2 + 1;
            while (i3 < i2 && this.b[i3] == i) {
                if (obj.equals(this.c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = e2 - 1; i4 >= 0 && this.b[i4] == i; i4--) {
                if (obj.equals(this.c[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.d != hVar.d) {
                return false;
            }
            for (int i = 0; i < this.d; i++) {
                K j = j(i);
                V n = n(i);
                Object orDefault = hVar.getOrDefault(j, null);
                if (n == null) {
                    if (orDefault != null || !hVar.containsKey(j)) {
                        return false;
                    }
                } else if (!n.equals(orDefault)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.d != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.d; i2++) {
                K j2 = j(i2);
                V n2 = n(i2);
                Object obj2 = map.get(j2);
                if (n2 == null) {
                    if (obj2 != null || !map.containsKey(j2)) {
                        return false;
                    }
                } else if (!n2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int g(Object obj) {
        if (obj == null) {
            return h();
        }
        return e(obj.hashCode(), obj);
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v) {
        int g2 = g(obj);
        if (g2 >= 0) {
            return (V) this.c[(g2 << 1) + 1];
        }
        return v;
    }

    public final int h() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        try {
            int e2 = k0.e(i, 0, this.b);
            if (e2 < 0) {
                return e2;
            }
            if (this.c[e2 << 1] == null) {
                return e2;
            }
            int i2 = e2 + 1;
            while (i2 < i && this.b[i2] == 0) {
                if (this.c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = e2 - 1; i3 >= 0 && this.b[i3] == 0; i3--) {
                if (this.c[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int i(Object obj) {
        int i = this.d * 2;
        Object[] objArr = this.c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.d <= 0) {
            return true;
        }
        return false;
    }

    public final K j(int i) {
        return (K) this.c[i << 1];
    }

    public void k(a aVar) {
        int i = aVar.d;
        c(this.d + i);
        if (this.d == 0) {
            if (i > 0) {
                System.arraycopy(aVar.b, 0, this.b, 0, i);
                System.arraycopy(aVar.c, 0, this.c, 0, i << 1);
                this.d = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(aVar.j(i2), aVar.n(i2));
        }
    }

    public V l(int i) {
        Object[] objArr = this.c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.d;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.b;
            int i5 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                b(i5);
                if (i3 == this.d) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.b, 0, i);
                        System.arraycopy(objArr, 0, this.c, 0, i2);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        int i7 = i4 - i;
                        System.arraycopy(iArr, i6, this.b, i, i7);
                        System.arraycopy(objArr, i6 << 1, this.c, i2, i7 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.c;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.c;
                int i10 = i4 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            if (i3 == this.d) {
                this.d = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    public V m(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final V n(int i) {
        return (V) this.c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int e2;
        int i2 = this.d;
        if (k == null) {
            e2 = h();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            e2 = e(hashCode, k);
        }
        if (e2 >= 0) {
            int i3 = (e2 << 1) + 1;
            Object[] objArr = this.c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~e2;
        int[] iArr = this.b;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.c;
            b(i5);
            if (i2 == this.d) {
                int[] iArr2 = this.b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.c, 0, objArr2.length);
                }
                d(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.d - i4) << 1);
        }
        int i7 = this.d;
        if (i2 == i7) {
            int[] iArr4 = this.b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        if (orDefault == null) {
            return put(k, v);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int g2 = g(obj);
        if (g2 >= 0) {
            return l(g2);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int g2 = g(k);
        if (g2 >= 0) {
            return m(g2, v);
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K j = j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V n = n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int g2 = g(obj);
        if (g2 >= 0) {
            V n = n(g2);
            if (obj2 == n || (obj2 != null && obj2.equals(n))) {
                l(g2);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean replace(K k, V v, V v2) {
        int g2 = g(k);
        if (g2 >= 0) {
            V n = n(g2);
            if (n == v || (v != null && v.equals(n))) {
                m(g2, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public h(int i) {
        if (i == 0) {
            this.b = k0.e;
            this.c = k0.g;
        } else {
            b(i);
        }
        this.d = 0;
    }
}
