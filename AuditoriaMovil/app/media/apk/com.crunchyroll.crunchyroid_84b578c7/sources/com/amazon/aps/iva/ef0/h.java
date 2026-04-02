package com.amazon.aps.iva.ef0;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: BufferedSource.kt */
/* loaded from: classes4.dex */
public interface h extends d0, ReadableByteChannel {
    String E() throws IOException;

    void P(long j) throws IOException;

    i T(long j) throws IOException;

    long U(i iVar) throws IOException;

    long W(e eVar) throws IOException;

    byte[] X() throws IOException;

    boolean Y() throws IOException;

    long b0() throws IOException;

    e d();

    void e(long j) throws IOException;

    String f0(Charset charset) throws IOException;

    int g(t tVar) throws IOException;

    i h0() throws IOException;

    void n0(e eVar, long j) throws IOException;

    x peek();

    String q(long j) throws IOException;

    long q0() throws IOException;

    InputStream r0();

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean w(long j) throws IOException;

    boolean z(long j, i iVar) throws IOException;
}
