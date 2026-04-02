package com.amazon.aps.iva.p8;

import java.io.File;
import java.io.IOException;
/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: classes.dex */
public final class j implements com.amazon.aps.iva.u8.b {
    public a b;
    public boolean c;

    public final void a(File file) throws IOException {
        throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
    }

    public final void c() {
        getDatabaseName();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // com.amazon.aps.iva.u8.b
    public final String getDatabaseName() {
        throw null;
    }

    @Override // com.amazon.aps.iva.u8.b
    public final synchronized com.amazon.aps.iva.u8.a getWritableDatabase() {
        if (!this.c) {
            c();
            this.c = true;
        }
        throw null;
    }

    @Override // com.amazon.aps.iva.u8.b
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}
