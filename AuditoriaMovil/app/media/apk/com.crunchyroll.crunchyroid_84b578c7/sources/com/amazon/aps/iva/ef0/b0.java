package com.amazon.aps.iva.ef0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
/* compiled from: Sink.kt */
/* loaded from: classes4.dex */
public interface b0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    e0 timeout();

    void write(e eVar, long j) throws IOException;
}
