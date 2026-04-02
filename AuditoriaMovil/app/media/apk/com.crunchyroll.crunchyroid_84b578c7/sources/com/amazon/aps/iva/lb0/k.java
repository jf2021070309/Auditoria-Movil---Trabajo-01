package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.ee0.f1;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ArrayDeque.kt */
/* loaded from: classes4.dex */
public final class k<E> extends f<E> {
    public static final Object[] e = new Object[0];
    public int b;
    public Object[] c;
    public int d;

    public k(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Illegal Capacity: ", i));
        }
        this.c = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        int i2 = this.d;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("index: ", i, ", size: ", i2));
        }
        if (i == i2) {
            addLast(e2);
        } else if (i == 0) {
            addFirst(e2);
        } else {
            g(i2 + 1);
            int l = l(this.b + i);
            int i3 = this.d;
            if (i < ((i3 + 1) >> 1)) {
                if (l == 0) {
                    Object[] objArr = this.c;
                    com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
                    l = objArr.length;
                }
                int i4 = l - 1;
                int i5 = this.b;
                if (i5 == 0) {
                    Object[] objArr2 = this.c;
                    com.amazon.aps.iva.yb0.j.f(objArr2, "<this>");
                    i5 = objArr2.length;
                }
                int i6 = i5 - 1;
                int i7 = this.b;
                if (i4 >= i7) {
                    Object[] objArr3 = this.c;
                    objArr3[i6] = objArr3[i7];
                    m.F(objArr3, i7, objArr3, i7 + 1, i4 + 1);
                } else {
                    Object[] objArr4 = this.c;
                    m.F(objArr4, i7 - 1, objArr4, i7, objArr4.length);
                    Object[] objArr5 = this.c;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    m.F(objArr5, 0, objArr5, 1, i4 + 1);
                }
                this.c[i4] = e2;
                this.b = i6;
            } else {
                int l2 = l(i3 + this.b);
                if (l < l2) {
                    Object[] objArr6 = this.c;
                    m.F(objArr6, l + 1, objArr6, l, l2);
                } else {
                    Object[] objArr7 = this.c;
                    m.F(objArr7, 1, objArr7, 0, l2);
                    Object[] objArr8 = this.c;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    m.F(objArr8, l + 1, objArr8, l, objArr8.length - 1);
                }
                this.c[l] = e2;
            }
            this.d++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        int i2 = this.d;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            int i3 = this.d;
            if (i == i3) {
                return addAll(collection);
            }
            g(collection.size() + i3);
            int l = l(this.d + this.b);
            int l2 = l(this.b + i);
            int size = collection.size();
            if (i < ((this.d + 1) >> 1)) {
                int i4 = this.b;
                int i5 = i4 - size;
                if (l2 < i4) {
                    Object[] objArr = this.c;
                    m.F(objArr, i5, objArr, i4, objArr.length);
                    if (size >= l2) {
                        Object[] objArr2 = this.c;
                        m.F(objArr2, objArr2.length - size, objArr2, 0, l2);
                    } else {
                        Object[] objArr3 = this.c;
                        m.F(objArr3, objArr3.length - size, objArr3, 0, size);
                        Object[] objArr4 = this.c;
                        m.F(objArr4, 0, objArr4, size, l2);
                    }
                } else if (i5 >= 0) {
                    Object[] objArr5 = this.c;
                    m.F(objArr5, i5, objArr5, i4, l2);
                } else {
                    Object[] objArr6 = this.c;
                    i5 += objArr6.length;
                    int i6 = l2 - i4;
                    int length = objArr6.length - i5;
                    if (length >= i6) {
                        m.F(objArr6, i5, objArr6, i4, l2);
                    } else {
                        m.F(objArr6, i5, objArr6, i4, i4 + length);
                        Object[] objArr7 = this.c;
                        m.F(objArr7, 0, objArr7, this.b + length, l2);
                    }
                }
                this.b = i5;
                int i7 = l2 - size;
                if (i7 < 0) {
                    i7 += this.c.length;
                }
                e(i7, collection);
            } else {
                int i8 = l2 + size;
                if (l2 < l) {
                    int i9 = size + l;
                    Object[] objArr8 = this.c;
                    if (i9 <= objArr8.length) {
                        m.F(objArr8, i8, objArr8, l2, l);
                    } else if (i8 >= objArr8.length) {
                        m.F(objArr8, i8 - objArr8.length, objArr8, l2, l);
                    } else {
                        int length2 = l - (i9 - objArr8.length);
                        m.F(objArr8, 0, objArr8, length2, l);
                        Object[] objArr9 = this.c;
                        m.F(objArr9, i8, objArr9, l2, length2);
                    }
                } else {
                    Object[] objArr10 = this.c;
                    m.F(objArr10, size, objArr10, 0, l);
                    Object[] objArr11 = this.c;
                    if (i8 >= objArr11.length) {
                        m.F(objArr11, i8 - objArr11.length, objArr11, l2, objArr11.length);
                    } else {
                        m.F(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.c;
                        m.F(objArr12, i8, objArr12, l2, objArr12.length - size);
                    }
                }
                e(l2, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("index: ", i, ", size: ", i2));
    }

    public final void addFirst(E e2) {
        g(this.d + 1);
        int i = this.b;
        if (i == 0) {
            Object[] objArr = this.c;
            com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.b = i2;
        this.c[i2] = e2;
        this.d++;
    }

    public final void addLast(E e2) {
        g(b() + 1);
        this.c[l(b() + this.b)] = e2;
        this.d = b() + 1;
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final int b() {
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int l = l(this.d + this.b);
        int i = this.b;
        if (i < l) {
            m.J(i, l, this.c);
        } else if (!isEmpty()) {
            Object[] objArr = this.c;
            m.J(this.b, objArr.length, objArr);
            m.J(0, l, this.c);
        }
        this.b = 0;
        this.d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final E d(int i) {
        int i2 = this.d;
        if (i >= 0 && i < i2) {
            if (i == f1.B(this)) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            int l = l(this.b + i);
            Object[] objArr = this.c;
            E e2 = (E) objArr[l];
            if (i < (this.d >> 1)) {
                int i3 = this.b;
                if (l >= i3) {
                    m.F(objArr, i3 + 1, objArr, i3, l);
                } else {
                    m.F(objArr, 1, objArr, 0, l);
                    Object[] objArr2 = this.c;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i4 = this.b;
                    m.F(objArr2, i4 + 1, objArr2, i4, objArr2.length - 1);
                }
                Object[] objArr3 = this.c;
                int i5 = this.b;
                objArr3[i5] = null;
                this.b = j(i5);
            } else {
                int l2 = l(f1.B(this) + this.b);
                if (l <= l2) {
                    Object[] objArr4 = this.c;
                    m.F(objArr4, l, objArr4, l + 1, l2 + 1);
                } else {
                    Object[] objArr5 = this.c;
                    m.F(objArr5, l, objArr5, l + 1, objArr5.length);
                    Object[] objArr6 = this.c;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    m.F(objArr6, 0, objArr6, 1, l2 + 1);
                }
                this.c[l2] = null;
            }
            this.d--;
            return e2;
        }
        throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("index: ", i, ", size: ", i2));
    }

    public final void e(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.c.length;
        while (i < length && it.hasNext()) {
            this.c[i] = it.next();
            i++;
        }
        int i2 = this.b;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.c[i3] = it.next();
        }
        this.d = collection.size() + b();
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.c[this.b];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void g(int i) {
        if (i >= 0) {
            Object[] objArr = this.c;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == e) {
                if (i < 10) {
                    i = 10;
                }
                this.c = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            m.F(objArr, 0, objArr2, this.b, objArr.length);
            Object[] objArr3 = this.c;
            int length2 = objArr3.length;
            int i3 = this.b;
            m.F(objArr3, length2 - i3, objArr2, 0, i3);
            this.b = 0;
            this.c = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int b = b();
        if (i >= 0 && i < b) {
            return (E) this.c[l(this.b + i)];
        }
        throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("index: ", i, ", size: ", b));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int l = l(b() + this.b);
        int i2 = this.b;
        if (i2 < l) {
            while (i2 < l) {
                if (com.amazon.aps.iva.yb0.j.a(obj, this.c[i2])) {
                    i = this.b;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 >= l) {
            int length = this.c.length;
            while (true) {
                if (i2 < length) {
                    if (com.amazon.aps.iva.yb0.j.a(obj, this.c[i2])) {
                        i = this.b;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < l; i3++) {
                        if (com.amazon.aps.iva.yb0.j.a(obj, this.c[i3])) {
                            i2 = i3 + this.c.length;
                            i = this.b;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        Object[] objArr = this.c;
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final E k() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.c[l(f1.B(this) + this.b)];
    }

    public final int l(int i) {
        Object[] objArr = this.c;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final E last() {
        if (!isEmpty()) {
            return (E) this.c[l(f1.B(this) + this.b)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int l = l(this.d + this.b);
        int i2 = this.b;
        if (i2 < l) {
            length = l - 1;
            if (i2 <= length) {
                while (!com.amazon.aps.iva.yb0.j.a(obj, this.c[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.b;
                return length - i;
            }
            return -1;
        }
        if (i2 > l) {
            int i3 = l - 1;
            while (true) {
                if (-1 < i3) {
                    if (com.amazon.aps.iva.yb0.j.a(obj, this.c[i3])) {
                        length = i3 + this.c.length;
                        i = this.b;
                        break;
                    }
                    i3--;
                } else {
                    Object[] objArr = this.c;
                    com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.b;
                    if (i4 <= length) {
                        while (!com.amazon.aps.iva.yb0.j.a(obj, this.c[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.b;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        d(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        Object[] objArr;
        int l;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.c.length == 0) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (objArr == null) {
                int l2 = l(this.d + this.b);
                int i = this.b;
                if (i < l2) {
                    l = i;
                    while (i < l2) {
                        Object obj = this.c[i];
                        if (!collection.contains(obj)) {
                            this.c[l] = obj;
                            l++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    m.J(l, l2, this.c);
                } else {
                    int length = this.c.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr2 = this.c;
                        Object obj2 = objArr2[i];
                        objArr2[i] = null;
                        if (!collection.contains(obj2)) {
                            this.c[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    l = l(i2);
                    for (int i3 = 0; i3 < l2; i3++) {
                        Object[] objArr3 = this.c;
                        Object obj3 = objArr3[i3];
                        objArr3[i3] = null;
                        if (!collection.contains(obj3)) {
                            this.c[l] = obj3;
                            l = j(l);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i4 = l - this.b;
                    if (i4 < 0) {
                        i4 += this.c.length;
                    }
                    this.d = i4;
                }
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.c;
            int i = this.b;
            E e2 = (E) objArr[i];
            objArr[i] = null;
            this.b = j(i);
            this.d = b() - 1;
            return e2;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int l = l(f1.B(this) + this.b);
            Object[] objArr = this.c;
            E e2 = (E) objArr[l];
            objArr[l] = null;
            this.d = b() - 1;
            return e2;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        Object[] objArr;
        int l;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.c.length == 0) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (objArr == null) {
                int l2 = l(this.d + this.b);
                int i = this.b;
                if (i < l2) {
                    l = i;
                    while (i < l2) {
                        Object obj = this.c[i];
                        if (collection.contains(obj)) {
                            this.c[l] = obj;
                            l++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    m.J(l, l2, this.c);
                } else {
                    int length = this.c.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr2 = this.c;
                        Object obj2 = objArr2[i];
                        objArr2[i] = null;
                        if (collection.contains(obj2)) {
                            this.c[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    l = l(i2);
                    for (int i3 = 0; i3 < l2; i3++) {
                        Object[] objArr3 = this.c;
                        Object obj3 = objArr3[i3];
                        objArr3[i3] = null;
                        if (collection.contains(obj3)) {
                            this.c[l] = obj3;
                            l = j(l);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i4 = l - this.b;
                    if (i4 < 0) {
                        i4 += this.c.length;
                    }
                    this.d = i4;
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        int b = b();
        if (i >= 0 && i < b) {
            int l = l(this.b + i);
            Object[] objArr = this.c;
            E e3 = (E) objArr[l];
            objArr[l] = e2;
            return e3;
        }
        throw new IndexOutOfBoundsException(com.amazon.aps.iva.j0.j0.e("index: ", i, ", size: ", b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "array");
        int length = tArr.length;
        int i = this.d;
        if (length < i) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
            com.amazon.aps.iva.yb0.j.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) newInstance);
        }
        int l = l(this.d + this.b);
        int i2 = this.b;
        if (i2 < l) {
            m.H(this.c, tArr, 0, i2, l, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.c;
            m.F(objArr, 0, tArr, this.b, objArr.length);
            Object[] objArr2 = this.c;
            m.F(objArr2, objArr2.length - this.b, tArr, 0, l);
        }
        int length2 = tArr.length;
        int i3 = this.d;
        if (length2 > i3) {
            tArr[i3] = null;
        }
        return tArr;
    }

    public k() {
        this.c = e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g(collection.size() + b());
        e(l(b() + this.b), collection);
        return true;
    }
}
