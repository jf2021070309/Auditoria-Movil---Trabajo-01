package com.amazon.aps.iva.ke0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ArrayMap.kt */
/* loaded from: classes4.dex */
public final class l extends c {
    public static final l b = new l();

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator, com.amazon.aps.iva.zb0.a {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final int b() {
        return 0;
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final void d(int i, Object obj) {
        Void r2 = (Void) obj;
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return null;
    }

    @Override // com.amazon.aps.iva.ke0.c, java.lang.Iterable
    public final Iterator iterator() {
        return new a();
    }
}
