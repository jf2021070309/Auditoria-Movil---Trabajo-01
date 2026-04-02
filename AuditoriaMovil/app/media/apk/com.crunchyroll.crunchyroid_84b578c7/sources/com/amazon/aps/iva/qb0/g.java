package com.amazon.aps.iva.qb0;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class g extends a {
    public g(com.amazon.aps.iva.ob0.d<Object> dVar) {
        super(dVar);
        boolean z;
        if (dVar != null) {
            if (dVar.getContext() == com.amazon.aps.iva.ob0.h.b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final com.amazon.aps.iva.ob0.g getContext() {
        return com.amazon.aps.iva.ob0.h.b;
    }
}
