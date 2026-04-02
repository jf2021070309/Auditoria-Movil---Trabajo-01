package com.amazon.aps.iva.r0;

import java.util.NoSuchElementException;
/* compiled from: TrieIterator.kt */
/* loaded from: classes.dex */
public final class j<E> extends a {
    public int e;
    public Object[] f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, 0);
        ?? r5;
        com.amazon.aps.iva.yb0.j.f(objArr, "root");
        this.e = i3;
        Object[] objArr2 = new Object[i3];
        this.f = objArr2;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.g = r5;
        objArr2[0] = objArr;
        j(i - r5, 1);
    }

    public final E g() {
        Object obj = this.f[this.e - 1];
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[b() & 31];
    }

    public final void j(int i, int i2) {
        int i3 = (this.e - i2) * 5;
        while (i2 < this.e) {
            Object[] objArr = this.f;
            Object[] objArr2 = objArr[i2 - 1];
            com.amazon.aps.iva.yb0.j.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public final void k(int i) {
        int i2 = 0;
        while (((b() >> i2) & 31) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            j(b(), ((this.e - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (hasNext()) {
            E g = g();
            d(b() + 1);
            if (b() == c()) {
                this.g = true;
                return g;
            }
            k(0);
            return g;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            d(b() - 1);
            if (this.g) {
                this.g = false;
                return g();
            }
            k(31);
            return g();
        }
        throw new NoSuchElementException();
    }
}
