package com.amazon.aps.iva.lb0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
/* compiled from: SlidingWindow.kt */
/* loaded from: classes4.dex */
public final class l0<T> extends c<T> implements RandomAccess {
    public final Object[] b;
    public final int c;
    public int d;
    public int e;

    /* compiled from: SlidingWindow.kt */
    /* loaded from: classes4.dex */
    public static final class a extends b<T> {
        public int d;
        public int e;
        public final /* synthetic */ l0<T> f;

        public a(l0<T> l0Var) {
            this.f = l0Var;
            this.d = l0Var.b();
            this.e = l0Var.d;
        }

        @Override // com.amazon.aps.iva.lb0.b
        public final void b() {
            int i = this.d;
            if (i == 0) {
                this.b = o0.Done;
                return;
            }
            l0<T> l0Var = this.f;
            Object[] objArr = l0Var.b;
            int i2 = this.e;
            this.c = (T) objArr[i2];
            this.b = o0.Ready;
            this.e = (i2 + 1) % l0Var.c;
            this.d = i - 1;
        }
    }

    public l0(Object[] objArr, int i) {
        boolean z;
        this.b = objArr;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i <= objArr.length) {
                this.c = objArr.length;
                this.e = i;
                return;
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            d.append(objArr.length);
            throw new IllegalArgumentException(d.toString().toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("ring buffer filled size should not be negative but it is ", i).toString());
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.e;
    }

    public final void d(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > this.e) {
                z2 = false;
            }
            if (z2) {
                if (i > 0) {
                    int i2 = this.d;
                    int i3 = this.c;
                    int i4 = (i2 + i) % i3;
                    Object[] objArr = this.b;
                    if (i2 > i4) {
                        m.J(i2, i3, objArr);
                        m.J(0, i4, objArr);
                    } else {
                        m.J(i2, i4, objArr);
                    }
                    this.d = i4;
                    this.e -= i;
                    return;
                }
                return;
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
            d.append(this.e);
            throw new IllegalArgumentException(d.toString().toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("n shouldn't be negative but it is ", i).toString());
    }

    @Override // java.util.List
    public final T get(int i) {
        int b = b();
        if (i >= 0 && i < b) {
            return (T) this.b[(this.d + i) % this.c];
        }
        throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("index: ", i, ", size: ", b));
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr;
        com.amazon.aps.iva.yb0.j.f(tArr, "array");
        if (tArr.length < b()) {
            tArr = (T[]) Arrays.copyOf(tArr, b());
            com.amazon.aps.iva.yb0.j.e(tArr, "copyOf(this, newSize)");
        }
        int b = b();
        int i = this.d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr = this.b;
            if (i3 >= b || i >= this.c) {
                break;
            }
            tArr[i3] = objArr[i];
            i3++;
            i++;
        }
        while (i3 < b) {
            tArr[i3] = objArr[i2];
            i3++;
            i2++;
        }
        if (tArr.length > b()) {
            tArr[b()] = null;
        }
        return tArr;
    }
}
