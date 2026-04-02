package com.amazon.aps.iva.qe0;

import com.amazon.aps.iva.yb0.j;
import java.util.NoSuchElementException;
/* compiled from: PersistentVectorIterator.kt */
/* loaded from: classes4.dex */
public final class e<T> extends com.amazon.aps.iva.r0.a {
    public final T[] e;
    public final i<T> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2, 1);
        j.f(objArr, "root");
        j.f(objArr2, "tail");
        this.e = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f = new i<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            i<T> iVar = this.f;
            if (iVar.hasNext()) {
                d(b() + 1);
                return iVar.next();
            }
            int b = b();
            d(b + 1);
            return this.e[b - iVar.c()];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (hasPrevious()) {
            int b = b();
            i<T> iVar = this.f;
            if (b > iVar.c()) {
                d(b() - 1);
                return this.e[b() - iVar.c()];
            }
            d(b() - 1);
            return iVar.previous();
        }
        throw new NoSuchElementException();
    }
}
