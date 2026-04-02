package com.amazon.aps.iva.ne0;

import java.util.Iterator;
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class u<T, R> implements h<R> {
    public final h<T> a;
    public final com.amazon.aps.iva.xb0.l<T, R> b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<R>, com.amazon.aps.iva.zb0.a {
        public final Iterator<T> b;
        public final /* synthetic */ u<T, R> c;

        public a(u<T, R> uVar) {
            this.c = uVar;
            this.b = uVar.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return this.c.b.invoke(this.b.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(h<? extends T> hVar, com.amazon.aps.iva.xb0.l<? super T, ? extends R> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "transformer");
        this.a = hVar;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
