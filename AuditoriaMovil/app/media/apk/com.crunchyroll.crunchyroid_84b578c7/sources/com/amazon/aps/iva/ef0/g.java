package com.amazon.aps.iva.ef0;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
/* compiled from: BufferedSink.kt */
/* loaded from: classes4.dex */
public interface g extends b0, WritableByteChannel {
    g J(int i, byte[] bArr, int i2) throws IOException;

    g Q(long j) throws IOException;

    g S(i iVar) throws IOException;

    e d();

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
    void flush() throws IOException;

    g g0(long j) throws IOException;

    g j() throws IOException;

    g o() throws IOException;

    long r(d0 d0Var) throws IOException;

    g u(String str) throws IOException;

    g write(byte[] bArr) throws IOException;

    g writeByte(int i) throws IOException;

    g writeInt(int i) throws IOException;

    g writeShort(int i) throws IOException;
}
