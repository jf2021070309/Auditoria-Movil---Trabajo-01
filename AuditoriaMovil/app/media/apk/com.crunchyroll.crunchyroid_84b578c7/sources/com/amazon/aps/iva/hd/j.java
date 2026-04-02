package com.amazon.aps.iva.hd;

import java.io.FilterInputStream;
import java.io.IOException;
/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes.dex */
public final class j extends FilterInputStream {
    public int b;

    public j(d dVar) {
        super(dVar);
        this.b = Integer.MIN_VALUE;
    }

    public final long a(long j) {
        int i = this.b;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE && j > i) {
            return i;
        }
        return j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public final void c(long j) {
        int i = this.b;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.b = (int) (i - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        c(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long a = a(j);
        if (a == -1) {
            return 0L;
        }
        long skip = super.skip(a);
        c(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) a(i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        c(read);
        return read;
    }
}
