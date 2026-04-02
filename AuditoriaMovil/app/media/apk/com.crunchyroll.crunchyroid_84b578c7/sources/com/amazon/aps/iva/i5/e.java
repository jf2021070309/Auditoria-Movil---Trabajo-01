package com.amazon.aps.iva.i5;

import java.io.Closeable;
/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class e implements Closeable, com.amazon.aps.iva.se0.g0 {
    public final com.amazon.aps.iva.ob0.g b;

    public e(com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        this.b = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.amazon.aps.iva.a60.b.j(this.b, null);
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.b;
    }
}
