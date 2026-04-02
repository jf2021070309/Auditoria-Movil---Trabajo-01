package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: BooleanArrayList.java */
/* loaded from: classes.dex */
public final class e extends c<Boolean> implements RandomAccess, y0 {
    public boolean[] c;
    public int d;

    static {
        new e(new boolean[0], 0).b = false;
    }

    public e() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i >= 0 && i <= (i2 = this.d)) {
            boolean[] zArr = this.c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[com.amazon.aps.iva.e4.e.a(i2, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.c, i, zArr2, i + 1, this.d - i);
                this.c = zArr2;
            }
            this.c[i] = booleanValue;
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index:", i, ", Size:");
        d.append(this.d);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        Charset charset = y.a;
        collection.getClass();
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i = eVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.c;
            if (i3 > zArr.length) {
                this.c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(eVar.c, 0, this.c, this.d, eVar.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void addBoolean(boolean z) {
        b();
        int i = this.d;
        boolean[] zArr = this.c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[com.amazon.aps.iva.e4.e.a(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.c = zArr2;
        }
        boolean[] zArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        zArr3[i2] = z;
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
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.d != eVar.d) {
            return false;
        }
        boolean[] zArr = eVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Boolean.valueOf(this.c[i]);
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        int i2 = 1;
        for (int i3 = 0; i3 < this.d; i3++) {
            int i4 = i2 * 31;
            boolean z = this.c[i3];
            Charset charset = y.a;
            if (z) {
                i = 1231;
            } else {
                i = 1237;
            }
            i2 = i4 + i;
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.v4.y.d
    public final y.d mutableCopyWithCapacity(int i) {
        if (i >= this.d) {
            return new e(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        b();
        d(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        if (i < this.d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            boolean[] zArr = this.c;
            System.arraycopy(zArr, i2, zArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public e(boolean[] zArr, int i) {
        this.c = zArr;
        this.d = i;
    }

    @Override // com.amazon.aps.iva.v4.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
