package e.c.a.k;

import ch.qos.logback.core.rolling.helper.Compressor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class b implements Closeable {
    public final InputStream a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f5513b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f5514c;

    /* renamed from: d  reason: collision with root package name */
    public int f5515d;

    /* renamed from: e  reason: collision with root package name */
    public int f5516e;

    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i2) {
            super(i2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, b.this.f5513b.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(c.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.a = inputStream;
        this.f5513b = charset;
        this.f5514c = new byte[Compressor.BUFFER_SIZE];
    }

    public final void a() throws IOException {
        InputStream inputStream = this.a;
        byte[] bArr = this.f5514c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f5515d = 0;
        this.f5516e = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.a) {
            if (this.f5514c != null) {
                this.f5514c = null;
                this.a.close();
            }
        }
    }

    public String f() throws IOException {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.a) {
            if (this.f5514c != null) {
                if (this.f5515d >= this.f5516e) {
                    a();
                }
                for (int i4 = this.f5515d; i4 != this.f5516e; i4++) {
                    byte[] bArr2 = this.f5514c;
                    if (bArr2[i4] == 10) {
                        if (i4 != this.f5515d) {
                            i3 = i4 - 1;
                            if (bArr2[i3] == 13) {
                                byte[] bArr3 = this.f5514c;
                                int i5 = this.f5515d;
                                String str = new String(bArr3, i5, i3 - i5, this.f5513b.name());
                                this.f5515d = i4 + 1;
                                return str;
                            }
                        }
                        i3 = i4;
                        byte[] bArr32 = this.f5514c;
                        int i52 = this.f5515d;
                        String str2 = new String(bArr32, i52, i3 - i52, this.f5513b.name());
                        this.f5515d = i4 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f5516e - this.f5515d) + 80);
                loop1: while (true) {
                    byte[] bArr4 = this.f5514c;
                    int i6 = this.f5515d;
                    aVar.write(bArr4, i6, this.f5516e - i6);
                    this.f5516e = -1;
                    a();
                    i2 = this.f5515d;
                    while (i2 != this.f5516e) {
                        bArr = this.f5514c;
                        if (bArr[i2] == 10) {
                            break loop1;
                        }
                        i2++;
                    }
                }
                int i7 = this.f5515d;
                if (i2 != i7) {
                    aVar.write(bArr, i7, i2 - i7);
                }
                this.f5515d = i2 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
