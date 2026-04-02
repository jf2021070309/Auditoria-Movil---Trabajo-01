package com.amazon.aps.iva.qe0;

import com.amazon.aps.iva.yb0.j;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
/* compiled from: PersistentVectorMutableIterator.kt */
/* loaded from: classes4.dex */
public final class f<T> extends com.amazon.aps.iva.r0.a {
    public final d<T> e;
    public int f;
    public i<? extends T> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d<T> dVar, int i) {
        super(i, dVar.b(), 1);
        j.f(dVar, "builder");
        this.e = dVar;
        this.f = dVar.g();
        this.h = -1;
        j();
    }

    @Override // com.amazon.aps.iva.r0.a, java.util.ListIterator
    public final void add(T t) {
        g();
        int b = b();
        d<T> dVar = this.e;
        dVar.add(b, t);
        d(b() + 1);
        e(dVar.b());
        this.f = dVar.g();
        this.h = -1;
        j();
    }

    public final void g() {
        if (this.f == this.e.g()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void j() {
        d<T> dVar = this.e;
        Object[] objArr = dVar.g;
        if (objArr == null) {
            this.g = null;
            return;
        }
        int b = (dVar.b() - 1) & (-32);
        int b2 = b();
        if (b2 > b) {
            b2 = b;
        }
        int i = (dVar.e / 5) + 1;
        i<? extends T> iVar = this.g;
        if (iVar == null) {
            this.g = new i<>(objArr, b2, b, i);
            return;
        }
        j.c(iVar);
        iVar.d(b2);
        iVar.e(b);
        iVar.e = i;
        if (iVar.f.length < i) {
            iVar.f = new Object[i];
        }
        ?? r6 = 0;
        iVar.f[0] = objArr;
        if (b2 == b) {
            r6 = 1;
        }
        iVar.g = r6;
        iVar.j(b2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        g();
        if (hasNext()) {
            this.h = b();
            i<? extends T> iVar = this.g;
            d<T> dVar = this.e;
            if (iVar == null) {
                Object[] objArr = dVar.h;
                int b = b();
                d(b + 1);
                return (T) objArr[b];
            } else if (iVar.hasNext()) {
                d(b() + 1);
                return iVar.next();
            } else {
                Object[] objArr2 = dVar.h;
                int b2 = b();
                d(b2 + 1);
                return (T) objArr2[b2 - iVar.c()];
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        g();
        if (hasPrevious()) {
            this.h = b() - 1;
            i<? extends T> iVar = this.g;
            d<T> dVar = this.e;
            if (iVar == null) {
                Object[] objArr = dVar.h;
                d(b() - 1);
                return (T) objArr[b()];
            } else if (b() > iVar.c()) {
                Object[] objArr2 = dVar.h;
                d(b() - 1);
                return (T) objArr2[b() - iVar.c()];
            } else {
                d(b() - 1);
                return iVar.previous();
            }
        }
        throw new NoSuchElementException();
    }

    @Override // com.amazon.aps.iva.r0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        g();
        int i = this.h;
        if (i != -1) {
            d<T> dVar = this.e;
            dVar.d(i);
            if (this.h < b()) {
                d(this.h);
            }
            e(dVar.b());
            this.f = dVar.g();
            this.h = -1;
            j();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.r0.a, java.util.ListIterator
    public final void set(T t) {
        g();
        int i = this.h;
        if (i != -1) {
            d<T> dVar = this.e;
            dVar.set(i, t);
            this.f = dVar.g();
            j();
            return;
        }
        throw new IllegalStateException();
    }
}
