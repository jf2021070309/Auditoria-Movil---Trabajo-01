package com.amazon.aps.iva.x;

import com.amazon.aps.iva.a9.k0;
/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public final class i<E> implements Cloneable {
    public static final Object f = new Object();
    public boolean b = false;
    public int[] c;
    public Object[] d;
    public int e;

    public i() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.c = new int[i4];
        this.d = new Object[i4];
    }

    public final void a(int i, E e) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.c[i2 - 1]) {
            f(i, e);
            return;
        }
        if (this.b && i2 >= this.c.length) {
            c();
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = iArr;
            this.d = objArr;
        }
        this.c[i3] = i;
        this.d[i3] = e;
        this.e = i3 + 1;
    }

    /* renamed from: b */
    public final i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.c = (int[]) this.c.clone();
            iVar.d = (Object[]) this.d.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void c() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final Object d(int i, Integer num) {
        Object obj;
        int e = k0.e(this.e, i, this.c);
        if (e >= 0 && (obj = this.d[e]) != f) {
            return obj;
        }
        return num;
    }

    public final int e(int i) {
        if (this.b) {
            c();
        }
        return this.c[i];
    }

    public final void f(int i, E e) {
        int e2 = k0.e(this.e, i, this.c);
        if (e2 >= 0) {
            this.d[e2] = e;
            return;
        }
        int i2 = ~e2;
        int i3 = this.e;
        if (i2 < i3) {
            Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.b && i3 >= this.c.length) {
            c();
            i2 = ~k0.e(this.e, i, this.c);
        }
        int i4 = this.e;
        if (i4 >= this.c.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr;
            this.d = objArr2;
        }
        int i9 = this.e - i2;
        if (i9 != 0) {
            int[] iArr3 = this.c;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i10, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    public final int g() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    public final E h(int i) {
        if (this.b) {
            c();
        }
        return (E) this.d[i];
    }

    public final String toString() {
        if (g() <= 0) {
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
            E h = h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
