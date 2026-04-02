package com.amazon.aps.iva.r0;

import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.r0.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
/* compiled from: SmallPersistentVector.kt */
/* loaded from: classes.dex */
public final class i<E> extends b<E> implements com.amazon.aps.iva.q0.a<E> {
    public static final i c = new i(new Object[0]);
    public final Object[] b;

    public i(Object[] objArr) {
        this.b = objArr;
    }

    @Override // com.amazon.aps.iva.q0.c
    public final e a() {
        return new e(this, null, this.b, 0);
    }

    @Override // java.util.List, com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> add(int i, E e) {
        Object[] objArr = this.b;
        n.o(i, objArr.length);
        Object[] objArr2 = this.b;
        if (i == objArr2.length) {
            return add((i<E>) e);
        }
        if (objArr2.length < 32) {
            Object[] objArr3 = new Object[objArr2.length + 1];
            m.H(objArr2, objArr3, 0, 0, i, 6);
            m.F(objArr2, i + 1, objArr3, i, objArr.length);
            objArr3[i] = e;
            return new i(objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, size)");
        m.F(objArr2, i + 1, copyOf, i, objArr.length - 1);
        copyOf[i] = e;
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr2[31];
        return new d(copyOf, objArr.length + 1, 0, objArr4);
    }

    @Override // com.amazon.aps.iva.r0.b, java.util.Collection, java.util.List, com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> addAll(Collection<? extends E> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "elements");
        Object[] objArr = this.b;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            int length = objArr.length;
            for (E e : collection) {
                copyOf[length] = e;
                length++;
            }
            return new i(copyOf);
        }
        e a = a();
        a.addAll(collection);
        return a.e();
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.b.length;
    }

    @Override // java.util.List
    public final E get(int i) {
        n.n(i, b());
        return (E) this.b[i];
    }

    @Override // com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c i(b.a aVar) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) aVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    com.amazon.aps.iva.yb0.j.e(objArr2, "copyOf(this, size)");
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return c;
        }
        return new i(m.I(0, length, objArr2));
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final int indexOf(Object obj) {
        return o.T(this.b, obj);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final int lastIndexOf(Object obj) {
        return o.X(obj, this.b);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final ListIterator<E> listIterator(int i) {
        n.o(i, b());
        return new c(this.b, i, b());
    }

    @Override // com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> m(int i) {
        Object[] objArr = this.b;
        n.n(i, objArr.length);
        if (objArr.length == 1) {
            return c;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
        m.F(objArr, i, copyOf, i + 1, objArr.length);
        return new i(copyOf);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final com.amazon.aps.iva.q0.c<E> set(int i, E e) {
        n.n(i, b());
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, size)");
        copyOf[i] = e;
        return new i(copyOf);
    }

    @Override // java.util.Collection, java.util.List, com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> add(E e) {
        Object[] objArr = this.b;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            copyOf[objArr.length] = e;
            return new i(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new d(objArr, objArr.length + 1, 0, objArr2);
    }
}
