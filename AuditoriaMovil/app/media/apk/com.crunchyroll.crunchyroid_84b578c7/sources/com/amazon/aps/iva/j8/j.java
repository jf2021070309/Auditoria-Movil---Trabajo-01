package com.amazon.aps.iva.j8;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PagedStorage.java */
/* loaded from: classes.dex */
public final class j<T> extends AbstractList<T> {
    public static final ArrayList j = new ArrayList();
    public int b;
    public final ArrayList<List<T>> c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public j() {
        this.b = 0;
        this.c = new ArrayList<>();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 1;
        this.h = 0;
        this.i = 0;
    }

    public final void b(int i, int i2) {
        int i3;
        int i4 = this.b / this.g;
        ArrayList<List<T>> arrayList = this.c;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                arrayList.add(0, null);
                i5++;
            }
            int i6 = i3 * this.g;
            this.f += i6;
            this.b -= i6;
        } else {
            i = i4;
        }
        if (i2 >= arrayList.size() + i) {
            int min = Math.min(this.d, ((i2 + 1) - (arrayList.size() + i)) * this.g);
            for (int size = arrayList.size(); size <= i2 - i; size++) {
                arrayList.add(arrayList.size(), null);
            }
            this.f += min;
            this.d -= min;
        }
    }

    public final int d() {
        int i = this.b;
        ArrayList<List<T>> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<T> list = arrayList.get(i2);
            if (list != null && list != j) {
                break;
            }
            i += this.g;
        }
        return i;
    }

    public final int e() {
        List<T> list;
        int i = this.d;
        ArrayList<List<T>> arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || !((list = arrayList.get(size)) == null || list == j)) {
                break;
            }
            i += this.g;
        }
        return i;
    }

    public final boolean f(int i, int i2) {
        List<T> list;
        int i3 = this.b / i;
        if (i2 >= i3) {
            ArrayList<List<T>> arrayList = this.c;
            if (i2 < arrayList.size() + i3 && (list = arrayList.get(i2 - i3)) != null && list != j) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i, int i2, int i3, List list) {
        this.b = i;
        ArrayList<List<T>> arrayList = this.c;
        arrayList.clear();
        arrayList.add(list);
        this.d = i2;
        this.e = i3;
        this.f = list.size();
        this.g = list.size();
        this.h = 0;
        this.i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        boolean z;
        if (i >= 0 && i < size()) {
            int i2 = i - this.b;
            if (i2 >= 0 && i2 < this.f) {
                int i3 = this.g;
                int i4 = 0;
                if (i3 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList<List<T>> arrayList = this.c;
                if (z) {
                    i4 = i2 / i3;
                    i2 %= i3;
                } else {
                    int size = arrayList.size();
                    while (i4 < size) {
                        int size2 = arrayList.get(i4).size();
                        if (size2 > i2) {
                            break;
                        }
                        i2 -= size2;
                        i4++;
                    }
                }
                List<T> list = arrayList.get(i4);
                if (list != null && list.size() != 0) {
                    return list.get(i2);
                }
            }
            return null;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index: ", i, ", Size: ");
        d.append(size());
        throw new IndexOutOfBoundsException(d.toString());
    }

    public final void j(int i, List list, o oVar) {
        boolean z;
        int size = list.size();
        int i2 = this.g;
        ArrayList<List<T>> arrayList = this.c;
        if (size != i2) {
            int size2 = size();
            int i3 = this.g;
            boolean z2 = false;
            if (i == size2 - (size2 % i3) && size < i3) {
                z = true;
            } else {
                z = false;
            }
            if (this.d == 0 && arrayList.size() == 1 && size > this.g) {
                z2 = true;
            }
            if (!z2 && !z) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            }
            if (z2) {
                this.g = size;
            }
        }
        int i4 = i / this.g;
        b(i4, i4);
        int i5 = i4 - (this.b / this.g);
        List<T> list2 = arrayList.get(i5);
        if (list2 != null && list2 != j) {
            throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Invalid position ", i, ": data already loaded"));
        }
        arrayList.set(i5, list);
        if (oVar != null) {
            oVar.p(i, list.size());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b + this.f + this.d;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("leading " + this.b + ", storage " + this.f + ", trailing " + this.d);
        int i = 0;
        while (true) {
            ArrayList<List<T>> arrayList = this.c;
            if (i < arrayList.size()) {
                sb.append(" ");
                sb.append(arrayList.get(i));
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public j(j<T> jVar) {
        this.b = jVar.b;
        this.c = new ArrayList<>(jVar.c);
        this.d = jVar.d;
        this.e = jVar.e;
        this.f = jVar.f;
        this.g = jVar.g;
        this.h = jVar.h;
        this.i = jVar.i;
    }
}
