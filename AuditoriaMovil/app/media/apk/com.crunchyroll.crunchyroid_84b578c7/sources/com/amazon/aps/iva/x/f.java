package com.amazon.aps.iva.x;

import com.amazon.aps.iva.a9.k0;
/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public final class f<E> implements Cloneable {
    public static final Object f = new Object();
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;

    public f() {
        this(10);
    }

    public final void a() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    /* renamed from: b */
    public final f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.c = (long[]) this.c.clone();
            fVar.d = (Object[]) this.d.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void c() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final Object d(long j, Long l) {
        Object obj;
        int f2 = k0.f(this.c, this.e, j);
        if (f2 >= 0 && (obj = this.d[f2]) != f) {
            return obj;
        }
        return l;
    }

    public final long e(int i) {
        if (this.b) {
            c();
        }
        return this.c[i];
    }

    public final void f(long j, E e) {
        int f2 = k0.f(this.c, this.e, j);
        if (f2 >= 0) {
            this.d[f2] = e;
            return;
        }
        int i = ~f2;
        int i2 = this.e;
        if (i < i2) {
            Object[] objArr = this.d;
            if (objArr[i] == f) {
                this.c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.b && i2 >= this.c.length) {
            c();
            i = ~k0.f(this.c, this.e, j);
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i8 = this.e - i;
        if (i8 != 0) {
            long[] jArr3 = this.c;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i9, this.e - i);
        }
        this.c[i] = j;
        this.d[i] = e;
        this.e++;
    }

    public final void g(long j) {
        int f2 = k0.f(this.c, this.e, j);
        if (f2 >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[f2];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[f2] = obj2;
                this.b = true;
            }
        }
    }

    public final int h() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    public final E i(int i) {
        if (this.b) {
            c();
        }
        return (E) this.d[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(e(i));
            sb.append('=');
            E i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public f(int i) {
        this.b = false;
        if (i == 0) {
            this.c = k0.f;
            this.d = k0.g;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.c = new long[i5];
        this.d = new Object[i5];
    }
}
