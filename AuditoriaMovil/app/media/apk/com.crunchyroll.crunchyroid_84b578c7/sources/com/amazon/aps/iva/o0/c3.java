package com.amazon.aps.iva.o0;

import java.util.Iterator;
/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class c3 implements Iterator<Object>, com.amazon.aps.iva.zb0.a {
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ b3 d;

    public c3(int i, int i2, b3 b3Var) {
        this.c = i2;
        this.d = b3Var;
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            b3 b3Var = this.d;
            Object[] objArr = b3Var.c;
            int i = this.b;
            this.b = i + 1;
            return objArr[b3Var.h(i)];
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
