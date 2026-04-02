package com.amazon.aps.iva.r0;

import java.util.NoSuchElementException;
/* compiled from: PersistentVectorIterator.kt */
/* loaded from: classes.dex */
public final class f<T> extends a {
    public final T[] e;
    public final j<T> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2, 0);
        com.amazon.aps.iva.yb0.j.f(objArr, "root");
        com.amazon.aps.iva.yb0.j.f(objArr2, "tail");
        this.e = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f = new j<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            j<T> jVar = this.f;
            if (jVar.hasNext()) {
                d(b() + 1);
                return jVar.next();
            }
            int b = b();
            d(b + 1);
            return this.e[b - jVar.c()];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (hasPrevious()) {
            int b = b();
            j<T> jVar = this.f;
            if (b > jVar.c()) {
                d(b() - 1);
                return this.e[b() - jVar.c()];
            }
            d(b() - 1);
            return jVar.previous();
        }
        throw new NoSuchElementException();
    }
}
