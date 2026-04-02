package com.amazon.aps.iva.g2;

import com.amazon.aps.iva.h2.f;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.n1.c;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: SimpleArrayMap.kt */
/* loaded from: classes.dex */
public final class b<K, V> {
    public int[] a;
    public Object[] b;
    public int c;

    public b() {
        this(0);
    }

    public final V a(K k) {
        int b;
        if (k == null) {
            b = c();
        } else {
            b = b(k.hashCode(), k);
        }
        if (b >= 0) {
            return (V) this.b[(b << 1) + 1];
        }
        return null;
    }

    public final int b(int i, Object obj) {
        j.f(obj, "key");
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int e = c.e(i2, i, this.a);
        if (e < 0) {
            return e;
        }
        if (j.a(obj, this.b[e << 1])) {
            return e;
        }
        int i3 = e + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (j.a(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = e - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (j.a(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int e = c.e(i, 0, this.a);
        if (e < 0) {
            return e;
        }
        if (this.b[e << 1] == null) {
            return e;
        }
        int i2 = e + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = e - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object d(f.b bVar, f.a aVar) {
        int hashCode;
        int b;
        int i = this.c;
        if (bVar == null) {
            b = c();
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
            b = b(hashCode, bVar);
        }
        if (b >= 0) {
            int i2 = (b << 1) + 1;
            Object[] objArr = this.b;
            Object obj = objArr[i2];
            objArr[i2] = aVar;
            return obj;
        }
        int i3 = ~b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            j.e(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i4 << 1);
            j.e(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            m.C(i5, i3, iArr2, iArr2, i);
            Object[] objArr2 = this.b;
            m.F(objArr2, i5 << 1, objArr2, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = bVar;
                objArr3[i7 + 1] = aVar;
                this.c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        int b;
        boolean z;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i = this.c;
                if (i != bVar.c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object[] objArr = this.b;
                    int i3 = i2 << 1;
                    Object obj2 = objArr[i3];
                    Object obj3 = objArr[i3 + 1];
                    Object a = bVar.a(obj2);
                    if (obj3 == null) {
                        if (a == null) {
                            if (obj2 == null) {
                                b = bVar.c();
                            } else {
                                b = bVar.b(obj2.hashCode(), obj2);
                            }
                            if (b >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                            }
                        }
                        return false;
                    } else if (!j.a(obj3, a)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object[] objArr2 = this.b;
                    int i6 = i5 << 1;
                    Object obj4 = objArr2[i6];
                    Object obj5 = objArr2[i6 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        if (obj6 != null || !((Map) obj).containsKey(obj4)) {
                            return false;
                        }
                    } else if (!j.a(obj5, obj6)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i2 = this.c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final String toString() {
        boolean z;
        int i = this.c;
        if (i <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = i3 << 1;
            Object obj = this.b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.b[i4 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        j.e(sb2, "buffer.toString()");
        return sb2;
    }

    public b(int i) {
        this.a = c.b;
        this.b = c.c;
        this.c = 0;
    }
}
