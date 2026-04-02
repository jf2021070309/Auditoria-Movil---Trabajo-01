package com.fyber.inneractive.sdk.player.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
final class l implements Closeable {
    final Charset a;
    int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    public l(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private l(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(m.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.c = inputStream;
        this.a = charset;
        this.d = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
        }
    }

    public final String a() throws IOException {
        int i;
        int i2;
        synchronized (this.c) {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.b) {
                b();
            }
            for (int i3 = this.e; i3 != this.b; i3++) {
                if (this.d[i3] == 10) {
                    if (i3 != this.e) {
                        i2 = i3 - 1;
                        if (this.d[i2] == 13) {
                            String str = new String(this.d, this.e, i2 - this.e, this.a.name());
                            this.e = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    String str2 = new String(this.d, this.e, i2 - this.e, this.a.name());
                    this.e = i3 + 1;
                    return str2;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.b - this.e) + 80) { // from class: com.fyber.inneractive.sdk.player.a.l.1
                @Override // java.io.ByteArrayOutputStream
                public final String toString() {
                    try {
                        return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, l.this.a.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byteArrayOutputStream.write(this.d, this.e, this.b - this.e);
                this.b = -1;
                b();
                i = this.e;
                while (i != this.b) {
                    if (this.d[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.e) {
                byteArrayOutputStream.write(this.d, this.e, i - this.e);
            }
            this.e = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    private void b() throws IOException {
        InputStream inputStream = this.c;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.e = 0;
        this.b = read;
    }
}
