package com.amazon.aps.iva.o0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class z0 implements Iterator<Object>, com.amazon.aps.iva.zb0.a {
    public final z2 b;
    public final int c;
    public int d;
    public final int e;

    public z0(int i, int i2, z2 z2Var) {
        com.amazon.aps.iva.yb0.j.f(z2Var, "table");
        this.b = z2Var;
        this.c = i2;
        this.d = i;
        this.e = z2Var.h;
        if (!z2Var.g) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d < this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        z2 z2Var = this.b;
        int i = z2Var.h;
        int i2 = this.e;
        if (i == i2) {
            int i3 = this.d;
            this.d = com.amazon.aps.iva.ab.x.k(i3, z2Var.b) + i3;
            return new a3(i3, i2, z2Var);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
