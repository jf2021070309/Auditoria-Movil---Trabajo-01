package com.amazon.aps.iva.qe0;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
/* compiled from: SmallPersistentVector.kt */
/* loaded from: classes4.dex */
public final class h<E> extends a<E> implements com.amazon.aps.iva.pe0.a<E> {
    public static final h c = new h(new Object[0]);
    public final Object[] b;

    public h(Object[] objArr) {
        this.b = objArr;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.b.length;
    }

    public final com.amazon.aps.iva.pe0.b<E> d(Collection<? extends E> collection) {
        j.f(collection, "elements");
        Object[] objArr = this.b;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            j.e(copyOf, "copyOf(this, newSize)");
            int length = objArr.length;
            for (E e : collection) {
                copyOf[length] = e;
                length++;
            }
            return new h(copyOf);
        }
        d e2 = e();
        e2.addAll(collection);
        return e2.build();
    }

    public final d e() {
        return new d(this, null, this.b, 0);
    }

    @Override // java.util.List
    public final E get(int i) {
        r.e(i, b());
        return (E) this.b[i];
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
        r.f(i, b());
        return new b(this.b, i, b());
    }
}
