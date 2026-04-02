package com.amazon.aps.iva.we0;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public final class s<T> implements com.amazon.aps.iva.ob0.d<T>, com.amazon.aps.iva.qb0.d {
    public final com.amazon.aps.iva.ob0.d<T> b;
    public final com.amazon.aps.iva.ob0.g c;

    /* JADX WARN: Multi-variable type inference failed */
    public s(com.amazon.aps.iva.ob0.d<? super T> dVar, com.amazon.aps.iva.ob0.g gVar) {
        this.b = dVar;
        this.c = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.d
    public final com.amazon.aps.iva.qb0.d getCallerFrame() {
        com.amazon.aps.iva.ob0.d<T> dVar = this.b;
        if (dVar instanceof com.amazon.aps.iva.qb0.d) {
            return (com.amazon.aps.iva.qb0.d) dVar;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final com.amazon.aps.iva.ob0.g getContext() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final void resumeWith(Object obj) {
        this.b.resumeWith(obj);
    }
}
