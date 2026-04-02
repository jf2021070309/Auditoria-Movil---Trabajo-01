package com.amazon.aps.iva.qb0;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public final class b implements com.amazon.aps.iva.ob0.d<Object> {
    public static final b b = new b();

    @Override // com.amazon.aps.iva.ob0.d
    public final com.amazon.aps.iva.ob0.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
