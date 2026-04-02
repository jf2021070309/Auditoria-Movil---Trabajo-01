package com.amazon.aps.iva.ne0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class g<T> implements h<T> {
    public final com.amazon.aps.iva.xb0.a<T> a;
    public final com.amazon.aps.iva.xb0.l<T, T> b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, com.amazon.aps.iva.zb0.a {
        public T b;
        public int c = -2;
        public final /* synthetic */ g<T> d;

        public a(g<T> gVar) {
            this.d = gVar;
        }

        public final void b() {
            T invoke;
            int i;
            int i2 = this.c;
            g<T> gVar = this.d;
            if (i2 == -2) {
                invoke = gVar.a.invoke();
            } else {
                com.amazon.aps.iva.xb0.l<T, T> lVar = gVar.b;
                T t = this.b;
                com.amazon.aps.iva.yb0.j.c(t);
                invoke = lVar.invoke(t);
            }
            this.b = invoke;
            if (invoke == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.c = i;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c < 0) {
                b();
            }
            if (this.c == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.c < 0) {
                b();
            }
            if (this.c != 0) {
                T t = this.b;
                com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(com.amazon.aps.iva.xb0.a<? extends T> aVar, com.amazon.aps.iva.xb0.l<? super T, ? extends T> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "getNextValue");
        this.a = aVar;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
