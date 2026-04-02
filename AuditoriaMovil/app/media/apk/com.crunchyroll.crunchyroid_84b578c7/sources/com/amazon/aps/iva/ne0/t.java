package com.amazon.aps.iva.ne0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class t<T> implements h<T> {
    public final h<T> a;
    public final com.amazon.aps.iva.xb0.l<T, Boolean> b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, com.amazon.aps.iva.zb0.a {
        public final Iterator<T> b;
        public int c = -1;
        public T d;
        public final /* synthetic */ t<T> e;

        public a(t<T> tVar) {
            this.e = tVar;
            this.b = tVar.a.iterator();
        }

        public final void b() {
            Iterator<T> it = this.b;
            if (it.hasNext()) {
                T next = it.next();
                if (this.e.b.invoke(next).booleanValue()) {
                    this.c = 1;
                    this.d = next;
                    return;
                }
            }
            this.c = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c == -1) {
                b();
            }
            if (this.c == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.c == -1) {
                b();
            }
            if (this.c != 0) {
                T t = this.d;
                this.d = null;
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
    public t(h<? extends T> hVar, com.amazon.aps.iva.xb0.l<? super T, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "sequence");
        com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
        this.a = hVar;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
