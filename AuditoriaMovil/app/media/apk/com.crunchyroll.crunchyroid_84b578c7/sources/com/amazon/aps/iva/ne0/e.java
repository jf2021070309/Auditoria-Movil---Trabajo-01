package com.amazon.aps.iva.ne0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class e<T> implements h<T> {
    public final h<T> a;
    public final boolean b;
    public final com.amazon.aps.iva.xb0.l<T, Boolean> c;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, com.amazon.aps.iva.zb0.a {
        public final Iterator<T> b;
        public int c = -1;
        public T d;
        public final /* synthetic */ e<T> e;

        public a(e<T> eVar) {
            this.e = eVar;
            this.b = eVar.a.iterator();
        }

        public final void b() {
            T next;
            e<T> eVar;
            do {
                Iterator<T> it = this.b;
                if (it.hasNext()) {
                    next = it.next();
                    eVar = this.e;
                } else {
                    this.c = 0;
                    return;
                }
            } while (eVar.c.invoke(next).booleanValue() != eVar.b);
            this.d = next;
            this.c = 1;
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
    public e(h<? extends T> hVar, boolean z, com.amazon.aps.iva.xb0.l<? super T, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
        this.a = hVar;
        this.b = z;
        this.c = lVar;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
