package com.amazon.aps.iva.r0;

import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.lb0.e0;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.o0.o3;
import com.amazon.aps.iva.yb0.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: PersistentVectorBuilder.kt */
/* loaded from: classes.dex */
public final class e<E> extends com.amazon.aps.iva.lb0.f<E> implements Collection, com.amazon.aps.iva.zb0.b {
    public com.amazon.aps.iva.q0.c<? extends E> b;
    public Object[] c;
    public Object[] d;
    public int e;
    public com.amazon.aps.iva.u0.b f;
    public Object[] g;
    public Object[] h;
    public int i;

    /* compiled from: PersistentVectorBuilder.kt */
    /* loaded from: classes.dex */
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

    public e(com.amazon.aps.iva.q0.c<? extends E> cVar, Object[] objArr, Object[] objArr2, int i) {
        com.amazon.aps.iva.yb0.j.f(cVar, "vector");
        com.amazon.aps.iva.yb0.j.f(objArr2, "vectorTail");
        this.b = cVar;
        this.c = objArr;
        this.d = objArr2;
        this.e = i;
        this.f = new com.amazon.aps.iva.u0.b(0);
        this.g = objArr;
        this.h = objArr2;
        this.i = cVar.size();
    }

    public final Object[] D(Object[] objArr, int i, int i2, o3 o3Var) {
        Object[] D;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            o3Var.a = objArr[i3];
            D = null;
        } else {
            Object obj = objArr[i3];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            D = D((Object[]) obj, i - 5, i2, o3Var);
        }
        if (D == null && i3 == 0) {
            return null;
        }
        Object[] q = q(objArr);
        q[i3] = D;
        return q;
    }

    public final void E(int i, int i2, Object[] objArr) {
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
        o3 o3Var = new o3((Object) null);
        com.amazon.aps.iva.yb0.j.c(objArr);
        Object[] D = D(objArr, i2, i, o3Var);
        com.amazon.aps.iva.yb0.j.c(D);
        Object obj = o3Var.a;
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.h = (Object[]) obj;
        this.i = i;
        if (D[1] == null) {
            this.g = (Object[]) D[0];
            this.e = i2 - 5;
            return;
        }
        this.g = D;
        this.e = i2;
    }

    public final Object[] F(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
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
                Object[] q = q(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                q[i3] = F((Object[]) q[i3], i, i4, it);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it.hasNext()) {
                        break;
                    }
                    q[i3] = F((Object[]) q[i3], 0, i4, it);
                }
                return q;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] G(Object[] objArr, int i, Object[][] objArr2) {
        Object[] q;
        e0 C = com.amazon.aps.iva.aq.j.C(objArr2);
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 < (1 << i3)) {
            q = F(objArr, i, i3, C);
        } else {
            q = q(objArr);
        }
        while (C.hasNext()) {
            this.e += 5;
            q = w(q);
            int i4 = this.e;
            F(q, 1 << i4, i4, C);
        }
        return q;
    }

    public final void H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.i;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 > (1 << i3)) {
            this.g = I(w(objArr), objArr2, this.e + 5);
            this.h = objArr3;
            this.e += 5;
            this.i++;
        } else if (objArr == null) {
            this.g = objArr2;
            this.h = objArr3;
            this.i = i + 1;
        } else {
            this.g = I(objArr, objArr2, i3);
            this.h = objArr3;
            this.i++;
        }
    }

    public final Object[] I(Object[] objArr, Object[] objArr2, int i) {
        int b = ((b() - 1) >> i) & 31;
        Object[] q = q(objArr);
        if (i == 5) {
            q[b] = objArr2;
        } else {
            q[b] = I((Object[]) q[b], objArr2, i - 5);
        }
        return q;
    }

    public final int J(com.amazon.aps.iva.xb0.l lVar, Object[] objArr, int i, int i2, o3 o3Var, ArrayList arrayList, ArrayList arrayList2) {
        Object[] u;
        if (o(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = o3Var.a;
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    if (!arrayList.isEmpty()) {
                        u = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        u = u();
                    }
                    objArr3 = u;
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        o3Var.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int K(com.amazon.aps.iva.xb0.l<? super E, Boolean> lVar, Object[] objArr, int i, o3 o3Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = q(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        o3Var.a = objArr2;
        return i2;
    }

    public final int N(com.amazon.aps.iva.xb0.l<? super E, Boolean> lVar, int i, o3 o3Var) {
        int K = K(lVar, this.h, i, o3Var);
        if (K == i) {
            return i;
        }
        Object obj = o3Var.a;
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, K, i, (Object) null);
        this.h = objArr;
        this.i -= i - K;
        return K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r0 != r10) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (N(r19, r10, r11) != r10) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O(com.amazon.aps.iva.xb0.l<? super E, java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r0.e.O(com.amazon.aps.iva.xb0.l):boolean");
    }

    public final Object[] P(Object[] objArr, int i, int i2, o3 o3Var) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i4];
            Object[] q = q(objArr);
            m.F(objArr, i4, q, i4 + 1, 32);
            q[31] = o3Var.a;
            o3Var.a = obj;
            return q;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((R() - 1) >> i);
        }
        Object[] q2 = q(objArr);
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj2 = q2[i3];
                com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                q2[i3] = P((Object[]) obj2, i5, 0, o3Var);
                if (i3 == i6) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = q2[i4];
        com.amazon.aps.iva.yb0.j.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        q2[i4] = P((Object[]) obj3, i5, i2, o3Var);
        return q2;
    }

    public final Object Q(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.i - i;
        if (i4 == 1) {
            Object obj = this.h[0];
            E(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.h;
        Object obj2 = objArr2[i3];
        Object[] q = q(objArr2);
        m.F(objArr2, i3, q, i3 + 1, i4);
        q[i4 - 1] = null;
        this.g = objArr;
        this.h = q;
        this.i = (i + i4) - 1;
        this.e = i2;
        return obj2;
    }

    public final int R() {
        if (b() <= 32) {
            return 0;
        }
        return (b() - 1) & (-32);
    }

    public final Object[] S(Object[] objArr, int i, int i2, E e, o3 o3Var) {
        int i3 = (i2 >> i) & 31;
        Object[] q = q(objArr);
        if (i == 0) {
            if (q != objArr) {
                ((AbstractList) this).modCount++;
            }
            o3Var.a = q[i3];
            q[i3] = e;
            return q;
        }
        Object obj = q[i3];
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        q[i3] = S((Object[]) obj, i - 5, i2, e, o3Var);
        return q;
    }

    public final void T(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        boolean z;
        Object[] u;
        if (i3 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] q = q(objArr);
            objArr2[0] = q;
            int i4 = i & 31;
            int size = ((collection.size() + i) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                m.F(q, size + 1, objArr3, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    u = q;
                } else {
                    u = u();
                    i3--;
                    objArr2[i3] = u;
                }
                int i7 = i2 - i6;
                m.F(q, 0, objArr3, i7, i2);
                m.F(q, size + 1, u, i4, i7);
                objArr3 = u;
            }
            Iterator<? extends E> it = collection.iterator();
            g(q, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] u2 = u();
                g(u2, 0, it);
                objArr2[i8] = u2;
            }
            g(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int U() {
        int i = this.i;
        if (i > 32) {
            return i - ((i - 1) & (-32));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        n.o(i, b());
        if (i == b()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int R = R();
        if (i >= R) {
            n(e, this.g, i - R);
            return;
        }
        o3 o3Var = new o3((Object) null);
        Object[] objArr = this.g;
        com.amazon.aps.iva.yb0.j.c(objArr);
        n(o3Var.a, l(objArr, this.e, i, e, o3Var), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Object[] u;
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        n.o(i, this.i);
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
            Object[] q = q(objArr);
            m.F(objArr, (((collection.size() + i) - 1) & 31) + 1, q, i3, U());
            g(q, i3, collection.iterator());
            this.h = q;
            this.i = collection.size() + this.i;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int U = U();
        int size2 = collection.size() + this.i;
        if (size2 > 32) {
            size2 -= (size2 - 1) & (-32);
        }
        if (i >= R()) {
            u = u();
            T(collection, i, this.h, U, objArr2, size, u);
        } else if (size2 > U) {
            int i4 = size2 - U;
            u = r(this.h, i4);
            k(collection, i, i4, objArr2, size, u);
        } else {
            Object[] objArr3 = this.h;
            u = u();
            int i5 = U - size2;
            m.F(objArr3, 0, u, i5, U);
            int i6 = 32 - i5;
            Object[] r = r(this.h, i6);
            int i7 = size - 1;
            objArr2[i7] = r;
            k(collection, i, i6, objArr2, i7, r);
        }
        this.g = G(this.g, i2, objArr2);
        this.h = u;
        this.i = collection.size() + this.i;
        return true;
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final int b() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.lb0.f
    public final E d(int i) {
        n.n(i, b());
        ((AbstractList) this).modCount++;
        int R = R();
        if (i >= R) {
            return (E) Q(this.g, R, this.e, i - R);
        }
        o3 o3Var = new o3(this.h[0]);
        Object[] objArr = this.g;
        com.amazon.aps.iva.yb0.j.c(objArr);
        Q(P(objArr, this.e, i, o3Var), R, this.e, 0);
        return (E) o3Var.a;
    }

    public final com.amazon.aps.iva.q0.c<E> e() {
        d dVar;
        Object[] objArr = this.g;
        if (objArr == this.c && this.h == this.d) {
            dVar = this.b;
        } else {
            boolean z = false;
            this.f = new com.amazon.aps.iva.u0.b(0);
            this.c = objArr;
            Object[] objArr2 = this.h;
            this.d = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    z = true;
                }
                if (z) {
                    dVar = i.c;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.h, b());
                    com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
                    dVar = new i(copyOf);
                }
            } else {
                com.amazon.aps.iva.yb0.j.c(objArr);
                dVar = new d(objArr, b(), this.e, this.h);
            }
        }
        this.b = dVar;
        return (com.amazon.aps.iva.q0.c<E>) dVar;
    }

    public final void g(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        n.n(i, b());
        if (R() <= i) {
            objArr = this.h;
        } else {
            objArr = this.g;
            com.amazon.aps.iva.yb0.j.c(objArr);
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final int j() {
        return ((AbstractList) this).modCount;
    }

    public final void k(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.g != null) {
            int i4 = i >> 5;
            com.amazon.aps.iva.r0.a p = p(R() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (p.previousIndex() != i4) {
                Object[] objArr4 = (Object[]) p.previous();
                m.F(objArr4, 0, objArr3, 32 - i2, 32);
                objArr3 = r(objArr4, i2);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) p.previous();
            int R = i3 - (((R() >> 5) - 1) - i4);
            if (R < i3) {
                objArr2 = objArr[R];
                com.amazon.aps.iva.yb0.j.c(objArr2);
            }
            T(collection, i, objArr5, 32, objArr, R, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] l(Object[] objArr, int i, int i2, Object obj, o3 o3Var) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            o3Var.a = objArr[31];
            Object[] q = q(objArr);
            m.F(objArr, i3 + 1, q, i3, 31);
            q[i3] = obj;
            return q;
        }
        Object[] q2 = q(objArr);
        int i4 = i - 5;
        Object obj3 = q2[i3];
        com.amazon.aps.iva.yb0.j.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        q2[i3] = l((Object[]) obj3, i4, i2, obj, o3Var);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = q2[i3]) == null) {
                break;
            }
            q2[i3] = l((Object[]) obj2, i4, 0, o3Var.a, o3Var);
        }
        return q2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        n.o(i, b());
        return new g(this, i);
    }

    public final void n(Object obj, Object[] objArr, int i) {
        int U = U();
        Object[] q = q(this.h);
        if (U < 32) {
            m.F(this.h, i + 1, q, i, U);
            q[i] = obj;
            this.g = objArr;
            this.h = q;
            this.i++;
            return;
        }
        Object[] objArr2 = this.h;
        Object obj2 = objArr2[31];
        m.F(objArr2, i + 1, q, i, 31);
        q[i] = obj;
        H(objArr, q, w(obj2));
    }

    public final boolean o(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f) {
            return true;
        }
        return false;
    }

    public final com.amazon.aps.iva.r0.a p(int i) {
        if (this.g != null) {
            int R = R() >> 5;
            n.o(i, R);
            int i2 = this.e;
            if (i2 == 0) {
                Object[] objArr = this.g;
                com.amazon.aps.iva.yb0.j.c(objArr);
                return new h(objArr, i);
            }
            Object[] objArr2 = this.g;
            com.amazon.aps.iva.yb0.j.c(objArr2);
            return new j(objArr2, i, R, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] q(Object[] objArr) {
        int i;
        if (objArr == null) {
            return u();
        }
        if (o(objArr)) {
            return objArr;
        }
        Object[] u = u();
        int length = objArr.length;
        if (length > 32) {
            i = 32;
        } else {
            i = length;
        }
        m.H(objArr, u, 0, 0, i, 6);
        return u;
    }

    public final Object[] r(Object[] objArr, int i) {
        if (o(objArr)) {
            m.F(objArr, i, objArr, 0, 32 - i);
            return objArr;
        }
        Object[] u = u();
        m.F(objArr, i, u, 0, 32 - i);
        return u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        return O(new a(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        n.n(i, b());
        if (R() <= i) {
            Object[] q = q(this.h);
            if (q != this.h) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) q[i2];
            q[i2] = e;
            this.h = q;
            return e2;
        }
        o3 o3Var = new o3((Object) null);
        Object[] objArr = this.g;
        com.amazon.aps.iva.yb0.j.c(objArr);
        this.g = S(objArr, this.e, i, e, o3Var);
        return (E) o3Var.a;
    }

    public final Object[] u() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f;
        return objArr;
    }

    public final Object[] w(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f;
        return objArr;
    }

    public final Object[] z(int i, int i2, Object[] objArr) {
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
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object z2 = z(i, i2 - 5, (Object[]) obj);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (o(objArr)) {
                        Arrays.fill(objArr, i4, 32, (Object) null);
                    }
                    Object[] u = u();
                    m.F(objArr, 0, u, 0, i4);
                    objArr = u;
                }
            }
            if (z2 != objArr[i3]) {
                Object[] q = q(objArr);
                q[i3] = z2;
                return q;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int U = U();
        if (U < 32) {
            Object[] q = q(this.h);
            q[U] = e;
            this.h = q;
            this.i = b() + 1;
        } else {
            H(this.g, this.h, w(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int U = U();
        Iterator<? extends E> it = collection.iterator();
        if (32 - U >= collection.size()) {
            Object[] q = q(this.h);
            g(q, U, it);
            this.h = q;
            this.i = collection.size() + this.i;
        } else {
            int size = ((collection.size() + U) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] q2 = q(this.h);
            g(q2, U, it);
            objArr[0] = q2;
            for (int i = 1; i < size; i++) {
                Object[] u = u();
                g(u, 0, it);
                objArr[i] = u;
            }
            this.g = G(this.g, R(), objArr);
            Object[] u2 = u();
            g(u2, 0, it);
            this.h = u2;
            this.i = collection.size() + this.i;
        }
        return true;
    }
}
