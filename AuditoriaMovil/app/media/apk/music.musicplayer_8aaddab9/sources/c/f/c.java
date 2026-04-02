package c.f;

import c.f.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {
    public static final int[] a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f1636b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    public static Object[] f1637c;

    /* renamed from: d  reason: collision with root package name */
    public static int f1638d;

    /* renamed from: e  reason: collision with root package name */
    public static Object[] f1639e;

    /* renamed from: f  reason: collision with root package name */
    public static int f1640f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f1641g;

    /* renamed from: h  reason: collision with root package name */
    public Object[] f1642h;

    /* renamed from: i  reason: collision with root package name */
    public int f1643i;

    /* renamed from: j  reason: collision with root package name */
    public g<E, E> f1644j;

    public c() {
        this(0);
    }

    public c(int i2) {
        if (i2 == 0) {
            this.f1641g = a;
            this.f1642h = f1636b;
        } else {
            a(i2);
        }
        this.f1643i = 0;
    }

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f1640f < 10) {
                    objArr[0] = f1639e;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1639e = objArr;
                    f1640f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f1638d < 10) {
                    objArr[0] = f1637c;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1637c = objArr;
                    f1638d++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                Object[] objArr = f1639e;
                if (objArr != null) {
                    this.f1642h = objArr;
                    f1639e = (Object[]) objArr[0];
                    this.f1641g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1640f--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f1637c;
                if (objArr2 != null) {
                    this.f1642h = objArr2;
                    f1637c = (Object[]) objArr2[0];
                    this.f1641g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1638d--;
                    return;
                }
            }
        }
        this.f1641g = new int[i2];
        this.f1642h = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int c2;
        if (e2 == null) {
            c2 = d();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            c2 = c(e2, hashCode);
        }
        if (c2 >= 0) {
            return false;
        }
        int i3 = c2 ^ (-1);
        int i4 = this.f1643i;
        int[] iArr = this.f1641g;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f1642h;
            a(i5);
            int[] iArr2 = this.f1641g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1642h, 0, objArr.length);
            }
            b(iArr, objArr, this.f1643i);
        }
        int i6 = this.f1643i;
        if (i3 < i6) {
            int[] iArr3 = this.f1641g;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1642h;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1643i - i3);
        }
        this.f1641g[i3] = i2;
        this.f1642h[i3] = e2;
        this.f1643i++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f1643i;
        int[] iArr = this.f1641g;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1642h;
            a(size);
            int i2 = this.f1643i;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1641g, 0, i2);
                System.arraycopy(objArr, 0, this.f1642h, 0, this.f1643i);
            }
            b(iArr, objArr, this.f1643i);
        }
        for (E e2 : collection) {
            z |= add(e2);
        }
        return z;
    }

    public final int c(Object obj, int i2) {
        int i3 = this.f1643i;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(this.f1641g, i3, i2);
        if (a2 >= 0 && !obj.equals(this.f1642h[a2])) {
            int i4 = a2 + 1;
            while (i4 < i3 && this.f1641g[i4] == i2) {
                if (obj.equals(this.f1642h[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && this.f1641g[i5] == i2; i5--) {
                if (obj.equals(this.f1642h[i5])) {
                    return i5;
                }
            }
            return i4 ^ (-1);
        }
        return a2;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f1643i;
        if (i2 != 0) {
            b(this.f1641g, this.f1642h, i2);
            this.f1641g = a;
            this.f1642h = f1636b;
            this.f1643i = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f1643i;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(this.f1641g, i2, 0);
        if (a2 >= 0 && this.f1642h[a2] != null) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.f1641g[i3] == 0) {
                if (this.f1642h[i3] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f1641g[i4] == 0; i4--) {
                if (this.f1642h[i4] == null) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return a2;
    }

    public E e(int i2) {
        Object[] objArr = this.f1642h;
        E e2 = (E) objArr[i2];
        int i3 = this.f1643i;
        if (i3 <= 1) {
            b(this.f1641g, objArr, i3);
            this.f1641g = a;
            this.f1642h = f1636b;
            this.f1643i = 0;
        } else {
            int[] iArr = this.f1641g;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f1643i = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f1642h;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f1643i - i2);
                }
                this.f1642h[this.f1643i] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f1643i--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1641g, 0, i2);
                    System.arraycopy(objArr, 0, this.f1642h, 0, i2);
                }
                int i6 = this.f1643i;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f1641g, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f1642h, i2, this.f1643i - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1643i != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1643i; i2++) {
                try {
                    if (!set.contains(this.f1642h[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1641g;
        int i2 = this.f1643i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? d() : c(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1643i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f1644j == null) {
            this.f1644j = new b(this);
        }
        g<E, E> gVar = this.f1644j;
        if (gVar.f1651b == null) {
            gVar.f1651b = new g.c();
        }
        return gVar.f1651b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1643i - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1642h[i2])) {
                e(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1643i;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f1643i;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1642h, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1643i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1643i));
        }
        System.arraycopy(this.f1642h, 0, tArr, 0, this.f1643i);
        int length = tArr.length;
        int i2 = this.f1643i;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1643i * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1643i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1642h[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
