package com.amazon.aps.iva.ne0;

import java.util.Iterator;
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class b<T> implements h<T>, c<T> {
    public final h<T> a;
    public final int b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, com.amazon.aps.iva.zb0.a {
        public final Iterator<T> b;
        public int c;

        public a(b<T> bVar) {
            this.b = bVar.a.iterator();
            this.c = bVar.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i = this.c;
                it = this.b;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.c--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.c;
                it = this.b;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.c--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends T> hVar, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(hVar, "sequence");
        this.a = hVar;
        this.b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // com.amazon.aps.iva.ne0.c
    public final h<T> a(int i) {
        int i2 = this.b + i;
        if (i2 < 0) {
            return new b(this, i);
        }
        return new b(this.a, i2);
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
