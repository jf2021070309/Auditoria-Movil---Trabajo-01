package com.amazon.aps.iva.fc;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
public final class b implements Closeable {
    public final InputStream b;
    public final Charset c;
    public byte[] d;
    public int e;
    public int f;

    /* compiled from: StrictLineReader.java */
    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, b.this.c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(c.a)) {
                this.b = fileInputStream;
                this.c = charset;
                this.d = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final String a() throws IOException {
        int i;
        synchronized (this.b) {
            byte[] bArr = this.d;
            if (bArr != null) {
                if (this.e >= this.f) {
                    int read = this.b.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.e = 0;
                        this.f = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i2 = this.e; i2 != this.f; i2++) {
                    byte[] bArr2 = this.d;
                    if (bArr2[i2] == 10) {
                        int i3 = this.e;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.c.name());
                                this.e = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.c.name());
                        this.e = i2 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f - this.e) + 80);
                while (true) {
                    byte[] bArr3 = this.d;
                    int i4 = this.e;
                    aVar.write(bArr3, i4, this.f - i4);
                    this.f = -1;
                    byte[] bArr4 = this.d;
                    int read2 = this.b.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.e = 0;
                        this.f = read2;
                        for (int i5 = 0; i5 != this.f; i5++) {
                            byte[] bArr5 = this.d;
                            if (bArr5[i5] == 10) {
                                int i6 = this.e;
                                if (i5 != i6) {
                                    aVar.write(bArr5, i6, i5 - i6);
                                }
                                this.e = i5 + 1;
                                return aVar.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.b) {
            if (this.d != null) {
                this.d = null;
                this.b.close();
            }
        }
    }
}
