package com.amazon.aps.iva.ef0;

import java.io.OutputStream;
/* compiled from: Buffer.kt */
/* loaded from: classes4.dex */
public final class f extends OutputStream {
    public final /* synthetic */ e b;

    public f(e eVar) {
        this.b = eVar;
    }

    public final String toString() {
        return this.b + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.b.L(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(bArr, "data");
        this.b.H(i, bArr, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
