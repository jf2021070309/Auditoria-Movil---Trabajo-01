package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.pc0.h;
import java.util.Iterator;
import java.util.List;
/* compiled from: AnnotationsImpl.kt */
/* loaded from: classes4.dex */
public final class i implements h {
    public final List<c> b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends c> list) {
        this.b = list;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean A(com.amazon.aps.iva.nd0.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final c h(com.amazon.aps.iva.nd0.c cVar) {
        return h.b.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        return this.b.iterator();
    }

    public final String toString() {
        return this.b.toString();
    }
}
