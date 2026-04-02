package com.amazon.aps.iva.ne0;

import com.amazon.aps.iva.ab.x;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: SequenceBuilder.kt */
/* loaded from: classes4.dex */
public final class i<T> extends j<T> implements Iterator<T>, com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.zb0.a {
    public int b;
    public T c;
    public Iterator<? extends T> d;
    public com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.ne0.j
    public final com.amazon.aps.iva.pb0.a b(Object obj, com.amazon.aps.iva.ob0.d dVar) {
        this.c = obj;
        this.b = 3;
        this.e = dVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.yb0.j.f(dVar, "frame");
        return aVar;
    }

    @Override // com.amazon.aps.iva.ne0.j
    public final Object g(Iterator<? extends T> it, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        if (!it.hasNext()) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        this.d = it;
        this.b = 2;
        this.e = dVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.yb0.j.f(dVar, "frame");
        return aVar;
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final com.amazon.aps.iva.ob0.g getContext() {
        return com.amazon.aps.iva.ob0.h.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw j();
                }
                Iterator<? extends T> it = this.d;
                com.amazon.aps.iva.yb0.j.c(it);
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar = this.e;
            com.amazon.aps.iva.yb0.j.c(dVar);
            this.e = null;
            dVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
        }
    }

    public final RuntimeException j() {
        int i = this.b;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.b);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.b;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.b = 0;
                    T t = this.c;
                    this.c = null;
                    return t;
                }
                throw j();
            }
            this.b = 1;
            Iterator<? extends T> it = this.d;
            com.amazon.aps.iva.yb0.j.c(it);
            return it.next();
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final void resumeWith(Object obj) {
        x.i0(obj);
        this.b = 4;
    }
}
