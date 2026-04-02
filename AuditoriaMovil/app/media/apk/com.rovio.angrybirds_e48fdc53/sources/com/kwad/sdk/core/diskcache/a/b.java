package com.kwad.sdk.core.diskcache.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class b implements Closeable {
    private final Charset anC;
    private byte[] buf;
    private int end;
    private final InputStream in;
    private int pos;

    private b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        }
        if (!charset.equals(com.kwad.sdk.crash.utils.a.US_ASCII)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.in = inputStream;
        this.anC = charset;
        this.buf = new byte[8192];
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void As() {
        InputStream inputStream = this.in;
        byte[] bArr = this.buf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.pos = 0;
        this.end = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.in) {
            if (this.buf != null) {
                this.buf = null;
                com.kwad.sdk.crash.utils.b.closeQuietly(this.in);
            }
        }
    }

    public final String readLine() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.in) {
            if (this.buf != null) {
                if (this.pos >= this.end) {
                    As();
                }
                for (int i3 = this.pos; i3 != this.end; i3++) {
                    byte[] bArr2 = this.buf;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.pos) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.buf;
                                int i4 = this.pos;
                                String str = new String(bArr3, i4, i2 - i4, this.anC.name());
                                this.pos = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.buf;
                        int i42 = this.pos;
                        String str2 = new String(bArr32, i42, i2 - i42, this.anC.name());
                        this.pos = i3 + 1;
                        return str2;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.end - this.pos) + 80) { // from class: com.kwad.sdk.core.diskcache.a.b.1
                    @Override // java.io.ByteArrayOutputStream
                    public final String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, b.this.anC.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr4 = this.buf;
                    int i5 = this.pos;
                    byteArrayOutputStream.write(bArr4, i5, this.end - i5);
                    this.end = -1;
                    As();
                    i = this.pos;
                    while (i != this.end) {
                        bArr = this.buf;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.pos;
                if (i != i6) {
                    byteArrayOutputStream.write(bArr, i6, i - i6);
                }
                this.pos = i + 1;
                return byteArrayOutputStream.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
