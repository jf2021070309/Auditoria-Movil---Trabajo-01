package com.amazon.aps.iva.qe0;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.lb0.e0;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.pe0.b;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: PersistentVectorBuilder.kt */
/* loaded from: classes4.dex */
public final class d<E> extends com.amazon.aps.iva.lb0.f<E> implements b.a<E> {
    public com.amazon.aps.iva.pe0.b<? extends E> b;
    public Object[] c;
    public Object[] d;
    public int e;
    public com.amazon.aps.iva.u0.b f;
    public Object[] g;
    public Object[] h;
    public int i;

    /* compiled from: PersistentVectorBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<E, Boolean> {
        public final /* synthetic */ Collection<E> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.h = collection;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.h.contains(obj));
        }
    }

    public d(com.amazon.aps.iva.pe0.b<? extends E> bVar, Object[] objArr, Object[] objArr2, int i) {
        j.f(bVar, "vector");
        j.f(objArr2, "vectorTail");
        this.b = bVar;
        this.c = objArr;
        this.d = objArr2;
        this.e = i;
        this.f = new com.amazon.aps.iva.u0.b(8);
        this.g = objArr;
        this.h = objArr2;
        this.i = bVar.size();
    }

    public final void D(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.g = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.h = objArr;
            this.i = i;
            this.e = i2;
            return;
        }
        com.amazon.aps.iva.l9.a aVar = new com.amazon.aps.iva.l9.a((Object) null);
        j.c(objArr);
        Object[] z = z(objArr, i2, i, aVar);
        j.c(z);
        Object obj = aVar.a;
        if (obj != null) {
            this.h = (Object[]) obj;
            this.i = i;
            if (z[1] == null) {
                this.g = (Object[]) z[0];
                this.e = i2 - 5;
                return;
            }
            this.g = z;
            this.e = i2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object[] E(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        boolean z;
        if (it.hasNext()) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 == 0) {
                    return it.next();
                }
                Object[] p = p(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                p[i3] = E((Object[]) p[i3], i, i4, it);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it.hasNext()) {
                        break;
                    }
                    p[i3] = E((Object[]) p[i3], 0, i4, it);
                }
                return p;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] F(Object[] objArr, int i, Object[][] objArr2) {
        Object[] p;
        e0 C = com.amazon.aps.iva.aq.j.C(objArr2);
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 < (1 << i3)) {
            p = E(objArr, i, i3, C);
        } else {
            p = p(objArr);
        }
        while (C.hasNext()) {
            this.e += 5;
            p = u(p);
            int i4 = this.e;
            E(p, 1 << i4, i4, C);
        }
        return p;
    }

    public final void G(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.i;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 > (1 << i3)) {
            this.g = H(u(objArr), objArr2, this.e + 5);
            this.h = objArr3;
            this.e += 5;
            this.i++;
        } else if (objArr == null) {
            this.g = objArr2;
            this.h = objArr3;
            this.i = i + 1;
        } else {
            this.g = H(objArr, objArr2, i3);
            this.h = objArr3;
            this.i++;
        }
    }

    public final Object[] H(Object[] objArr, Object[] objArr2, int i) {
        int b = ((b() - 1) >> i) & 31;
        Object[] p = p(objArr);
        if (i == 5) {
            p[b] = objArr2;
        } else {
            p[b] = H((Object[]) p[b], objArr2, i - 5);
        }
        return p;
    }

    public final int I(a aVar, Object[] objArr, int i, int i2, com.amazon.aps.iva.l9.a aVar2, ArrayList arrayList, ArrayList arrayList2) {
        Object[] r;
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar2.a;
        if (obj != null) {
            Object[] objArr2 = (Object[]) obj;
            Object[] objArr3 = objArr2;
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                Object obj2 = objArr[i3];
                if (!((Boolean) aVar.invoke(obj2)).booleanValue()) {
                    if (i2 == 32) {
                        if (!arrayList.isEmpty()) {
                            r = (Object[]) arrayList.remove(arrayList.size() - 1);
                        } else {
                            r = r();
                        }
                        objArr3 = r;
                        i2 = 0;
                    }
                    objArr3[i2] = obj2;
                    i3 = i4;
                    i2++;
                } else {
                    i3 = i4;
                }
            }
            aVar2.a = objArr3;
            if (objArr2 != objArr3) {
                arrayList2.add(objArr2);
            }
            return i2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final int J(a aVar, Object[] objArr, int i, com.amazon.aps.iva.l9.a aVar2) {
        int i2 = 0;
        Object[] objArr2 = objArr;
        int i3 = i;
        boolean z = false;
        while (i2 < i) {
            int i4 = i2 + 1;
            Object obj = objArr[i2];
            if (((Boolean) aVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = p(objArr);
                    z = true;
                    i3 = i2;
                    i2 = i4;
                } else {
                    i2 = i4;
                }
            } else if (z) {
                i2 = i3 + 1;
                objArr2[i3] = obj;
                i3 = i2;
                i2 = i4;
            } else {
                i2 = i4;
            }
        }
        aVar2.a = objArr2;
        return i3;
    }

    public final int K(a aVar, int i, com.amazon.aps.iva.l9.a aVar2) {
        int J = J(aVar, this.h, i, aVar2);
        if (J == i) {
            return i;
        }
        Object obj = aVar2.a;
        if (obj != null) {
            Object[] objArr = (Object[]) obj;
            Arrays.fill(objArr, J, i, (Object) null);
            this.h = objArr;
            this.i -= i - J;
            return J;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object[] N(Object[] objArr, int i, int i2, com.amazon.aps.iva.l9.a aVar) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i4];
            Object[] p = p(objArr);
            m.F(objArr, i4, p, i4 + 1, 32);
            p[31] = aVar.a;
            aVar.a = obj;
            return p;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((P() - 1) >> i);
        }
        Object[] p2 = p(objArr);
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                int i7 = i3 - 1;
                Object obj2 = p2[i3];
                if (obj2 != null) {
                    p2[i3] = N((Object[]) obj2, i5, 0, aVar);
                    if (i3 == i6) {
                        break;
                    }
                    i3 = i7;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj3 = p2[i4];
        if (obj3 != null) {
            p2[i4] = N((Object[]) obj3, i5, i2, aVar);
            return p2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final Object O(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.i - i;
        if (i4 == 1) {
            Object obj = this.h[0];
            D(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.h;
        Object obj2 = objArr2[i3];
        Object[] p = p(objArr2);
        m.F(objArr2, i3, p, i3 + 1, i4);
        p[i4 - 1] = null;
        this.g = objArr;
        this.h = p;
        this.i = (i + i4) - 1;
        this.e = i2;
        return obj2;
    }

    public final int P() {
        if (b() <= 32) {
            return 0;
        }
        return (b() - 1) & (-32);
    }

    public final Object[] Q(Object[] objArr, int i, int i2, E e, com.amazon.aps.iva.l9.a aVar) {
        int i3 = (i2 >> i) & 31;
        Object[] p = p(objArr);
        if (i == 0) {
            if (p != objArr) {
                ((AbstractList) this).modCount++;
            }
            aVar.a = p[i3];
            p[i3] = e;
            return p;
        }
        Object obj = p[i3];
        if (obj != null) {
            p[i3] = Q((Object[]) obj, i - 5, i2, e, aVar);
            return p;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final void R(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        boolean z;
        Object[] r;
        if (i3 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] p = p(objArr);
            objArr2[0] = p;
            int i4 = i & 31;
            int size = ((collection.size() + i) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                m.F(p, size + 1, objArr3, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    r = p;
                } else {
                    r = r();
                    i3--;
                    objArr2[i3] = r;
                }
                int i7 = i2 - i6;
                m.F(p, 0, objArr3, i7, i2);
                m.F(p, size + 1, r, i4, i7);
                objArr3 = r;
            }
            Iterator<? extends E> it = collection.iterator();
            e(p, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] r2 = r();
                e(r2, 0, it);
                objArr2[i8] = r2;
            }
            e(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int S() {
        int i = this.i;
        if (i > 32) {
            return i - ((i - 1) & (-32));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        r.f(i, b());
        if (i == b()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int P = P();
        if (i >= P) {
            l(e, this.g, i - P);
            return;
        }
        com.amazon.aps.iva.l9.a aVar = new com.amazon.aps.iva.l9.a((Object) null);
        Object[] objArr = this.g;
        j.c(objArr);
        l(aVar.a, k(objArr, this.e, i, e, aVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Object[] r;
        j.f(collection, "elements");
        r.f(i, this.i);
        if (i == this.i) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.i - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            Object[] objArr = this.h;
            Object[] p = p(objArr);
            m.F(objArr, (((collection.size() + i) - 1) & 31) + 1, p, i3, S());
            e(p, i3, collection.iterator());
            this.h = p;
            this.i = collection.size() + this.i;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int S = S();
        int size2 = collection.size() + this.i;
        if (size2 > 32) {
            size2 -= (size2 - 1) & (-32);
        }
        if (i >= P()) {
            r = r();
            R(collection, i, this.h, S, objArr2, size, r);
        } else if (size2 > S) {
            int i4 = size2 - S;
            r = q(this.h, i4);
            j(collection, i, i4, objArr2, size, r);
        } else {
            Object[] objArr3 = this.h;
            r = r();
            int i5 = S - size2;
            m.F(objArr3, 0, r, i5, S);
            int i6 = 32 - i5;
            Object[] q = q(this.h, i6);
            int i7 = size - 1;
            objArr2[i7] = q;
            j(collection, i, i6, objArr2, i7, q);
        }
        this.g = F(this.g, i2, objArr2);
        this.h = r;
        this.i = collection.size() + this.i;
        return true;
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final int b() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.pe0.b.a
    public final com.amazon.aps.iva.pe0.b<E> build() {
        c cVar;
        boolean z;
        Object[] objArr = this.g;
        if (objArr == this.c && this.h == this.d) {
            cVar = this.b;
        } else {
            this.f = new com.amazon.aps.iva.u0.b(8);
            this.c = objArr;
            Object[] objArr2 = this.h;
            this.d = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    cVar = h.c;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.h, b());
                    j.e(copyOf, "copyOf(this, newSize)");
                    cVar = new h(copyOf);
                }
            } else {
                j.c(objArr);
                cVar = new c(objArr, b(), this.e, this.h);
            }
        }
        this.b = cVar;
        return (com.amazon.aps.iva.pe0.b<E>) cVar;
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final E d(int i) {
        r.e(i, b());
        ((AbstractList) this).modCount++;
        int P = P();
        if (i >= P) {
            return (E) O(this.g, P, this.e, i - P);
        }
        com.amazon.aps.iva.l9.a aVar = new com.amazon.aps.iva.l9.a(this.h[0]);
        Object[] objArr = this.g;
        j.c(objArr);
        O(N(objArr, this.e, i, aVar), P, this.e, 0);
        return (E) aVar.a;
    }

    public final void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        r.e(i, b());
        if (P() <= i) {
            objArr = this.h;
        } else {
            objArr = this.g;
            j.c(objArr);
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                if (obj != null) {
                    objArr = (Object[]) obj;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.g != null) {
            int i4 = i >> 5;
            com.amazon.aps.iva.r0.a o = o(P() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (o.previousIndex() != i4) {
                Object[] objArr4 = (Object[]) o.previous();
                m.F(objArr4, 0, objArr3, 32 - i2, 32);
                objArr3 = q(objArr4, i2);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) o.previous();
            int P = i3 - (((P() >> 5) - 1) - i4);
            if (P < i3) {
                objArr2 = objArr[P];
                j.c(objArr2);
            }
            R(collection, i, objArr5, 32, objArr, P, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] k(Object[] objArr, int i, int i2, Object obj, com.amazon.aps.iva.l9.a aVar) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            aVar.a = objArr[31];
            Object[] p = p(objArr);
            m.F(objArr, i3 + 1, p, i3, 31);
            p[i3] = obj;
            return p;
        }
        Object[] p2 = p(objArr);
        int i4 = i - 5;
        Object obj2 = p2[i3];
        if (obj2 != null) {
            p2[i3] = k((Object[]) obj2, i4, i2, obj, aVar);
            int i5 = i3 + 1;
            while (i5 < 32) {
                int i6 = i5 + 1;
                Object obj3 = p2[i5];
                if (obj3 == null) {
                    break;
                }
                p2[i5] = k((Object[]) obj3, i4, 0, aVar.a, aVar);
                i5 = i6;
            }
            return p2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final void l(Object obj, Object[] objArr, int i) {
        int S = S();
        Object[] p = p(this.h);
        if (S < 32) {
            m.F(this.h, i + 1, p, i, S);
            p[i] = obj;
            this.g = objArr;
            this.h = p;
            this.i++;
            return;
        }
        Object[] objArr2 = this.h;
        Object obj2 = objArr2[31];
        m.F(objArr2, i + 1, p, i, 31);
        p[i] = obj;
        G(objArr, p, u(obj2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        r.f(i, b());
        return new f(this, i);
    }

    public final boolean n(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f) {
            return true;
        }
        return false;
    }

    public final com.amazon.aps.iva.r0.a o(int i) {
        if (this.g != null) {
            int P = P() >> 5;
            r.f(i, P);
            int i2 = this.e;
            if (i2 == 0) {
                Object[] objArr = this.g;
                j.c(objArr);
                return new g(objArr, i);
            }
            Object[] objArr2 = this.g;
            j.c(objArr2);
            return new i(objArr2, i, P, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] p(Object[] objArr) {
        int i;
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] r = r();
        int length = objArr.length;
        if (length > 32) {
            i = 32;
        } else {
            i = length;
        }
        m.H(objArr, r, 0, 0, i, 6);
        return r;
    }

    public final Object[] q(Object[] objArr, int i) {
        if (n(objArr)) {
            m.F(objArr, i, objArr, 0, 32 - i);
            return objArr;
        }
        Object[] r = r();
        m.F(objArr, i, r, 0, 32 - i);
        return r;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f;
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 != r10) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (K(r9, r10, r11) != r10) goto L9;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r19) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qe0.d.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        r.e(i, b());
        if (P() <= i) {
            Object[] p = p(this.h);
            if (p != this.h) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) p[i2];
            p[i2] = e;
            this.h = p;
            return e2;
        }
        com.amazon.aps.iva.l9.a aVar = new com.amazon.aps.iva.l9.a((Object) null);
        Object[] objArr = this.g;
        j.c(objArr);
        this.g = Q(objArr, this.e, i, e, aVar);
        return (E) aVar.a;
    }

    public final Object[] u(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f;
        return objArr;
    }

    public final Object[] w(int i, int i2, Object[] objArr) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 == 0) {
                return objArr;
            }
            int i3 = (i >> i2) & 31;
            Object obj = objArr[i3];
            if (obj != null) {
                Object w = w(i, i2 - 5, (Object[]) obj);
                if (i3 < 31) {
                    int i4 = i3 + 1;
                    if (objArr[i4] != null) {
                        if (n(objArr)) {
                            Arrays.fill(objArr, i4, 32, (Object) null);
                        }
                        Object[] r = r();
                        m.F(objArr, 0, r, 0, i4);
                        objArr = r;
                    }
                }
                if (w != objArr[i3]) {
                    Object[] p = p(objArr);
                    p[i3] = w;
                    return p;
                }
                return objArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] z(Object[] objArr, int i, int i2, com.amazon.aps.iva.l9.a aVar) {
        Object[] z;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            aVar.a = objArr[i3];
            z = null;
        } else {
            Object obj = objArr[i3];
            if (obj != null) {
                z = z((Object[]) obj, i - 5, i2, aVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        if (z == null && i3 == 0) {
            return null;
        }
        Object[] p = p(objArr);
        p[i3] = z;
        return p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int S = S();
        if (S < 32) {
            Object[] p = p(this.h);
            p[S] = e;
            this.h = p;
            this.i = b() + 1;
        } else {
            G(this.g, this.h, u(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int S = S();
        Iterator<? extends E> it = collection.iterator();
        if (32 - S >= collection.size()) {
            Object[] p = p(this.h);
            e(p, S, it);
            this.h = p;
            this.i = collection.size() + this.i;
        } else {
            int size = ((collection.size() + S) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] p2 = p(this.h);
            e(p2, S, it);
            objArr[0] = p2;
            for (int i = 1; i < size; i++) {
                Object[] r = r();
                e(r, 0, it);
                objArr[i] = r;
            }
            this.g = F(this.g, P(), objArr);
            Object[] r2 = r();
            e(r2, 0, it);
            this.h = r2;
            this.i = collection.size() + this.i;
        }
        return true;
    }
}
