package com.amazon.aps.iva.r0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
/* compiled from: PersistentVectorMutableIterator.kt */
/* loaded from: classes.dex */
public final class g<T> extends a {
    public final e<T> e;
    public int f;
    public j<? extends T> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e<T> eVar, int i) {
        super(i, eVar.b(), 0);
        com.amazon.aps.iva.yb0.j.f(eVar, "builder");
        this.e = eVar;
        this.f = eVar.j();
        this.h = -1;
        j();
    }

    @Override // com.amazon.aps.iva.r0.a, java.util.ListIterator
    public final void add(T t) {
        g();
        int b = b();
        e<T> eVar = this.e;
        eVar.add(b, t);
        d(b() + 1);
        e(eVar.b());
        this.f = eVar.j();
        this.h = -1;
        j();
    }

    public final void g() {
        if (this.f == this.e.j()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void j() {
        e<T> eVar = this.e;
        Object[] objArr = eVar.g;
        if (objArr == null) {
            this.g = null;
            return;
        }
        int b = (eVar.b() - 1) & (-32);
        int b2 = b();
        if (b2 > b) {
            b2 = b;
        }
        int i = (eVar.e / 5) + 1;
        j<? extends T> jVar = this.g;
        if (jVar == null) {
            this.g = new j<>(objArr, b2, b, i);
            return;
        }
        com.amazon.aps.iva.yb0.j.c(jVar);
        jVar.d(b2);
        jVar.e(b);
        jVar.e = i;
        if (jVar.f.length < i) {
            jVar.f = new Object[i];
        }
        ?? r6 = 0;
        jVar.f[0] = objArr;
        if (b2 == b) {
            r6 = 1;
        }
        jVar.g = r6;
        jVar.j(b2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        g();
        if (hasNext()) {
            this.h = b();
            j<? extends T> jVar = this.g;
            e<T> eVar = this.e;
            if (jVar == null) {
                Object[] objArr = eVar.h;
                int b = b();
                d(b + 1);
                return (T) objArr[b];
            } else if (jVar.hasNext()) {
                d(b() + 1);
                return jVar.next();
            } else {
                Object[] objArr2 = eVar.h;
                int b2 = b();
                d(b2 + 1);
                return (T) objArr2[b2 - jVar.c()];
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        g();
        if (hasPrevious()) {
            this.h = b() - 1;
            j<? extends T> jVar = this.g;
            e<T> eVar = this.e;
            if (jVar == null) {
                Object[] objArr = eVar.h;
                d(b() - 1);
                return (T) objArr[b()];
            } else if (b() > jVar.c()) {
                Object[] objArr2 = eVar.h;
                d(b() - 1);
                return (T) objArr2[b() - jVar.c()];
            } else {
                d(b() - 1);
                return jVar.previous();
            }
        }
        throw new NoSuchElementException();
    }

    @Override // com.amazon.aps.iva.r0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        g();
        int i = this.h;
        if (i != -1) {
            e<T> eVar = this.e;
            eVar.d(i);
            if (this.h < b()) {
                d(this.h);
            }
            e(eVar.b());
            this.f = eVar.j();
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
            e<T> eVar = this.e;
            eVar.set(i, t);
            this.f = eVar.j();
            j();
            return;
        }
        throw new IllegalStateException();
    }
}
