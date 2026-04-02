package com.amazon.aps.iva.w5;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DataSourceInputStream.java */
/* loaded from: classes.dex */
public final class h extends InputStream {
    public final f b;
    public final i c;
    public boolean e = false;
    public boolean f = false;
    public final byte[] d = new byte[1];

    public h(f fVar, i iVar) {
        this.b = fVar;
        this.c = iVar;
    }

    public final void a() throws IOException {
        if (!this.e) {
            this.b.b(this.c);
            this.e = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f) {
            this.b.close();
            this.f = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.d;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        com.amazon.aps.iva.cq.b.C(!this.f);
        a();
        int l = this.b.l(bArr, i, i2);
        if (l == -1) {
            return -1;
        }
        return l;
    }
}
