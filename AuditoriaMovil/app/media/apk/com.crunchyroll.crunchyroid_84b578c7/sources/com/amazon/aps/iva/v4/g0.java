package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: LongArrayList.java */
/* loaded from: classes.dex */
public final class g0 extends c<Long> implements RandomAccess, y0 {
    public long[] c;
    public int d;

    static {
        new g0(new long[0], 0).b = false;
    }

    public g0() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        b();
        if (i >= 0 && i <= (i2 = this.d)) {
            long[] jArr = this.c;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[com.amazon.aps.iva.e4.e.a(i2, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.c, i, jArr2, i + 1, this.d - i);
                this.c = jArr2;
            }
            this.c[i] = longValue;
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index:", i, ", Size:");
        d.append(this.d);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        Charset charset = y.a;
        collection.getClass();
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i = g0Var.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.c;
            if (i3 > jArr.length) {
                this.c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(g0Var.c, 0, this.c, this.d, g0Var.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void addLong(long j) {
        b();
        int i = this.d;
        long[] jArr = this.c;
        if (i == jArr.length) {
            long[] jArr2 = new long[com.amazon.aps.iva.e4.e.a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.c = jArr2;
        }
        long[] jArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0 && i < this.d) {
            return;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index:", i, ", Size:");
        d.append(this.d);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        if (this.d != g0Var.d) {
            return false;
        }
        long[] jArr = g0Var.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Long.valueOf(this.c[i]);
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + y.a(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.v4.y.d
    public final y.d mutableCopyWithCapacity(int i) {
        if (i >= this.d) {
            return new g0(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        b();
        d(i);
        long[] jArr = this.c;
        long j = jArr[i];
        if (i < this.d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            long[] jArr = this.c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        d(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public g0(long[] jArr, int i) {
        this.c = jArr;
        this.d = i;
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
