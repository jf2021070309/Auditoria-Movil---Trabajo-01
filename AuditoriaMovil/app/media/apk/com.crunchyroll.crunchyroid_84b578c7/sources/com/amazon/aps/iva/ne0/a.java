package com.amazon.aps.iva.ne0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SequencesJVM.kt */
/* loaded from: classes4.dex */
public final class a<T> implements h<T> {
    public final AtomicReference<h<T>> a;

    public a(h<? extends T> hVar) {
        this.a = new AtomicReference<>(hVar);
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<T> iterator() {
        h<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
