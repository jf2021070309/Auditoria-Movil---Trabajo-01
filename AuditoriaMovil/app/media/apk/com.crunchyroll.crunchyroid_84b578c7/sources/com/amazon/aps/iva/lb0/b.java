package com.amazon.aps.iva.lb0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: AbstractIterator.kt */
/* loaded from: classes4.dex */
public abstract class b<T> implements Iterator<T>, com.amazon.aps.iva.zb0.a {
    public o0 b = o0.NotReady;
    public T c;

    /* compiled from: AbstractIterator.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public abstract void b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        o0 o0Var = this.b;
        o0 o0Var2 = o0.Failed;
        if (o0Var != o0Var2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = a.a[o0Var.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                this.b = o0Var2;
                b();
                if (this.b != o0.Ready) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.b = o0.NotReady;
            return this.c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
