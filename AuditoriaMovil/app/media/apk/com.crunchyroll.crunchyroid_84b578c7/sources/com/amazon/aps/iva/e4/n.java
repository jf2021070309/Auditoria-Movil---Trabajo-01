package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.z;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: DoubleArrayList.java */
/* loaded from: classes.dex */
public final class n extends c<Double> implements RandomAccess, a1 {
    public double[] c;
    public int d;

    static {
        new n(new double[0], 0).b = false;
    }

    public n() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i >= 0 && i <= (i2 = this.d)) {
            double[] dArr = this.c;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[e.a(i2, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.c, i, dArr2, i + 1, this.d - i);
                this.c = dArr2;
            }
            this.c[i] = doubleValue;
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder d = e.d("Index:", i, ", Size:");
        d.append(this.d);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // com.amazon.aps.iva.e4.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        Charset charset = z.a;
        collection.getClass();
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i = nVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.c;
            if (i3 > dArr.length) {
                this.c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(nVar.c, 0, this.c, this.d, nVar.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void addDouble(double d) {
        b();
        int i = this.d;
        double[] dArr = this.c;
        if (i == dArr.length) {
            double[] dArr2 = new double[e.a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.c = dArr2;
        }
        double[] dArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        dArr3[i2] = d;
    }

    public final void d(int i) {
        if (i >= 0 && i < this.d) {
            return;
        }
        StringBuilder d = e.d("Index:", i, ", Size:");
        d.append(this.d);
        throw new IndexOutOfBoundsException(d.toString());
    }

    @Override // com.amazon.aps.iva.e4.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.d != nVar.d) {
            return false;
        }
        double[] dArr = nVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Double.valueOf(this.c[i]);
    }

    @Override // com.amazon.aps.iva.e4.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + z.a(Double.doubleToLongBits(this.c[i2]));
        }
        return i;
    }

    @Override // com.amazon.aps.iva.e4.z.c
    public final z.c mutableCopyWithCapacity(int i) {
        if (i >= this.d) {
            return new n(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.amazon.aps.iva.e4.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Double.valueOf(this.c[i]))) {
                double[] dArr = this.c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.d - i) - 1);
                this.d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            double[] dArr = this.c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        d(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public n(double[] dArr, int i) {
        this.c = dArr;
        this.d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        b();
        d(i);
        double[] dArr = this.c;
        double d = dArr[i];
        if (i < this.d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // com.amazon.aps.iva.e4.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
