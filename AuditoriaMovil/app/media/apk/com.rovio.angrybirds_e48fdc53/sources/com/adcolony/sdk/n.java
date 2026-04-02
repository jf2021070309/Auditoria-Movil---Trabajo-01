package com.adcolony.sdk;

import java.io.InputStream;
/* loaded from: classes2.dex */
class n extends InputStream {
    InputStream a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(InputStream inputStream, int i, int i2) {
        this.a = inputStream;
        while (i > 0) {
            i -= (int) inputStream.skip(i);
        }
        this.b = i2;
    }

    @Override // java.io.InputStream
    public int available() {
        int available = this.a.available();
        return available <= this.b ? available : this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.b == 0) {
            return -1;
        }
        this.b--;
        return this.a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.b == 0) {
            return -1;
        }
        if (i2 > this.b) {
            i2 = this.b;
        }
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b -= read;
            return read;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int i = (int) j;
        if (i <= 0) {
            return 0L;
        }
        if (i > this.b) {
            i = this.b;
        }
        this.b -= i;
        while (i > 0) {
            i -= (int) this.a.skip(j);
        }
        return j;
    }
}
