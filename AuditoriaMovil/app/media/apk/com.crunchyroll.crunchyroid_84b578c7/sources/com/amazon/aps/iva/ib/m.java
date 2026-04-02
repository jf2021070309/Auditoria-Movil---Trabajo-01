package com.amazon.aps.iva.ib;
/* compiled from: IncrementalPositionIterator.java */
/* loaded from: classes.dex */
public final class m extends b {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return Integer.valueOf(i);
        }
        throw new IllegalStateException("position out of bounds reached");
    }
}
