package com.amazon.aps.iva.ne0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class f<T, R, E> implements h<E> {
    public final h<T> a;
    public final com.amazon.aps.iva.xb0.l<T, R> b;
    public final com.amazon.aps.iva.xb0.l<R, Iterator<E>> c;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<E>, com.amazon.aps.iva.zb0.a {
        public final Iterator<T> b;
        public Iterator<? extends E> c;
        public final /* synthetic */ f<T, R, E> d;

        public a(f<T, R, E> fVar) {
            this.d = fVar;
            this.b = fVar.a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.c
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.c = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.c
                if (r0 != 0) goto L3d
                java.util.Iterator<T> r0 = r5.b
                boolean r3 = r0.hasNext()
                if (r3 != 0) goto L21
                return r2
            L21:
                java.lang.Object r0 = r0.next()
                com.amazon.aps.iva.ne0.f<T, R, E> r3 = r5.d
                com.amazon.aps.iva.xb0.l<R, java.util.Iterator<E>> r4 = r3.c
                com.amazon.aps.iva.xb0.l<T, R> r3 = r3.b
                java.lang.Object r0 = r3.invoke(r0)
                java.lang.Object r0 = r4.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.c = r0
            L3d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ne0.f.a.b():boolean");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return b();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (b()) {
                Iterator<? extends E> it = this.c;
                com.amazon.aps.iva.yb0.j.c(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h<? extends T> hVar, com.amazon.aps.iva.xb0.l<? super T, ? extends R> lVar, com.amazon.aps.iva.xb0.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        com.amazon.aps.iva.yb0.j.f(hVar, "sequence");
        com.amazon.aps.iva.yb0.j.f(lVar, "transformer");
        com.amazon.aps.iva.yb0.j.f(lVar2, "iterator");
        this.a = hVar;
        this.b = lVar;
        this.c = lVar2;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
