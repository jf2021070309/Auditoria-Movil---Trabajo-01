package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.ee0.y0;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ArrayMap.kt */
/* loaded from: classes4.dex */
public final class r<T> extends c<T> {
    public final T b;
    public final int c;

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, com.amazon.aps.iva.zb0.a {
        public boolean b = true;
        public final /* synthetic */ r<T> c;

        public a(r<T> rVar) {
            this.c = rVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b) {
                this.b = false;
                return this.c.b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(y0 y0Var, int i) {
        this.b = y0Var;
        this.c = i;
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final int b() {
        return 1;
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final void d(int i, T t) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final T get(int i) {
        if (i == this.c) {
            return this.b;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ke0.c, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
