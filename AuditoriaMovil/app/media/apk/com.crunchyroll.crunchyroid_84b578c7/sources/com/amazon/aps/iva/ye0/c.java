package com.amazon.aps.iva.ye0;
/* compiled from: Dispatcher.kt */
/* loaded from: classes4.dex */
public final class c extends f {
    public static final c d = new c();

    public c() {
        super(k.b, k.c, k.d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
