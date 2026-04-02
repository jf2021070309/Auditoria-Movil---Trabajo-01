package com.amazon.aps.iva.y0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
/* compiled from: SnapshotStateList.kt */
/* loaded from: classes.dex */
public final class b0<T> implements ListIterator<T>, com.amazon.aps.iva.zb0.a {
    public final u<T> b;
    public int c;
    public int d;

    public b0(u<T> uVar, int i) {
        com.amazon.aps.iva.yb0.j.f(uVar, "list");
        this.b = uVar;
        this.c = i - 1;
        this.d = uVar.b();
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        b();
        u<T> uVar = this.b;
        uVar.add(this.c + 1, t);
        this.c++;
        this.d = uVar.b();
    }

    public final void b() {
        if (this.b.b() == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.c >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        b();
        int i = this.c + 1;
        u<T> uVar = this.b;
        v.a(i, uVar.size());
        T t = uVar.get(i);
        this.c = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        b();
        int i = this.c;
        u<T> uVar = this.b;
        v.a(i, uVar.size());
        this.c--;
        return uVar.get(this.c);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i = this.c;
        u<T> uVar = this.b;
        uVar.remove(i);
        this.c--;
        this.d = uVar.b();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        b();
        int i = this.c;
        u<T> uVar = this.b;
        uVar.set(i, t);
        this.d = uVar.b();
    }
}
