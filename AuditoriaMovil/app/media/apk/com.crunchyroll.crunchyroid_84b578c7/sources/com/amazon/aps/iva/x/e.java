package com.amazon.aps.iva.x;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: IndexBasedArrayIterator.java */
/* loaded from: classes.dex */
public abstract class e<T> implements Iterator<T> {
    public int b;
    public int c;
    public boolean d;

    public e(int i) {
        this.b = i;
    }

    public abstract T a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T a = a(this.c);
            this.c++;
            this.d = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d) {
            int i = this.c - 1;
            this.c = i;
            b(i);
            this.b--;
            this.d = false;
            return;
        }
        throw new IllegalStateException();
    }
}
