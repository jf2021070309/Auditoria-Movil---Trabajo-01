package com.amazon.aps.iva.o0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class a3 implements Iterable<Object>, com.amazon.aps.iva.zb0.a {
    public final z2 b;
    public final int c;
    public final int d;

    public a3(int i, int i2, z2 z2Var) {
        com.amazon.aps.iva.yb0.j.f(z2Var, "table");
        this.b = z2Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        z2 z2Var = this.b;
        if (z2Var.h == this.d) {
            int i = this.c;
            return new z0(i + 1, com.amazon.aps.iva.ab.x.k(i, z2Var.b) + i, z2Var);
        }
        throw new ConcurrentModificationException();
    }
}
