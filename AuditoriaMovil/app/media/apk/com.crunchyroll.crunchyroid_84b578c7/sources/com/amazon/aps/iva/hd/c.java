package com.amazon.aps.iva.hd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {
    public final long b;
    public int c;

    public c(InputStream inputStream, long j) {
        super(inputStream);
        this.b = j;
    }

    public final void a(int i) throws IOException {
        if (i >= 0) {
            this.c += i;
            return;
        }
        long j = this.b;
        if (j - this.c <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + this.c);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.b - this.c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        a(read);
        return read;
    }
}
