package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.ee0.f1;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Iterators.kt */
/* loaded from: classes4.dex */
public final class e0 implements Iterator, com.amazon.aps.iva.zb0.a {
    public final /* synthetic */ int b = 0;
    public int c;
    public final Object d;

    public e0(Iterator it) {
        com.amazon.aps.iva.yb0.j.f(it, "iterator");
        this.d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((Iterator) obj).hasNext();
            default:
                if (this.c < ((Object[]) obj).length) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new c0(i2, ((Iterator) obj).next());
                }
                f1.S();
                throw null;
            default:
                try {
                    int i3 = this.c;
                    this.c = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.c--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e0(Object[] objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "array");
        this.d = objArr;
    }
}
