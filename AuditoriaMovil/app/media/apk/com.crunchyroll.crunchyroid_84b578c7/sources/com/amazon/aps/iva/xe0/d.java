package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.se0.g0;
/* compiled from: Scopes.kt */
/* loaded from: classes4.dex */
public final class d implements g0 {
    public final com.amazon.aps.iva.ob0.g b;

    public d(com.amazon.aps.iva.ob0.g gVar) {
        this.b = gVar;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.b;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.b + ')';
    }
}
