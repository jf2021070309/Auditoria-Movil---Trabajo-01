package com.amazon.aps.iva.lc;

import com.amazon.aps.iva.q.c0;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class e extends FilterInputStream {
    public static final byte[] d = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};
    public static final int e = 31;
    public final byte b;
    public int c;

    public e(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.b = (byte) i;
            return;
        }
        throw new IllegalArgumentException(c0.a("Cannot add invalid orientation: ", i));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read;
        int i;
        int i2 = this.c;
        if (i2 < 2 || i2 > (i = e)) {
            read = super.read();
        } else if (i2 == i) {
            read = this.b;
        } else {
            read = d[i2 - 2] & UnsignedBytes.MAX_VALUE;
        }
        if (read != -1) {
            this.c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.c = (int) (this.c + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.c;
        int i5 = e;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(d, this.c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.c += i3;
        }
        return i3;
    }
}
