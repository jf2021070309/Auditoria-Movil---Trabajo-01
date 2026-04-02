package com.amazon.aps.iva.qe0;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.yb0.j;
import java.util.ListIterator;
/* compiled from: PersistentVector.kt */
/* loaded from: classes4.dex */
public final class c<E> extends a<E> {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public c(Object[] objArr, int i, int i2, Object[] objArr2) {
        boolean z;
        j.f(objArr2, "tail");
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (i > 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(j.k(Integer.valueOf(i), "Trie-based persistent vector should have at least 33 elements, got ").toString());
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.d;
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr;
        r.e(i, b());
        if (((b() - 1) & (-32)) <= i) {
            objArr = this.c;
        } else {
            objArr = this.b;
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

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final ListIterator<E> listIterator(int i) {
        r.f(i, b());
        return new e(this.b, i, this.c, b(), (this.e / 5) + 1);
    }
}
