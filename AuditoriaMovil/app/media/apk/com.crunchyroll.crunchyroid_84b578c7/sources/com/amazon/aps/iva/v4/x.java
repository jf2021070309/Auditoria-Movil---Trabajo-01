package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: IntArrayList.java */
/* loaded from: classes.dex */
public final class x extends c<Integer> implements RandomAccess, y0 {
    public int[] c;
    public int d;

    static {
        new x(new int[0], 0).b = false;
    }

    public x() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i >= 0 && i <= (i2 = this.d)) {
            int[] iArr = this.c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[com.amazon.aps.iva.e4.e.a(i2, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
                this.c = iArr2;
            }
            this.c[i] = intValue;
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index:", i, ", Size:");
        d.append(this.d);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Charset charset = y.a;
        collection.getClass();
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i = xVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.c;
            if (i3 > iArr.length) {
                this.c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(xVar.c, 0, this.c, this.d, xVar.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void addInt(int i) {
        b();
        int i2 = this.d;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[com.amazon.aps.iva.e4.e.a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.c = iArr2;
        }
        int[] iArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
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
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.d != xVar.d) {
            return false;
        }
        int[] iArr = xVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Integer.valueOf(this.c[i]);
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.v4.y.d
    public final y.d mutableCopyWithCapacity(int i) {
        if (i >= this.d) {
            return new x(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        b();
        d(i);
        int[] iArr = this.c;
        int i3 = iArr[i];
        if (i < this.d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            int[] iArr = this.c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        d(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public x(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
