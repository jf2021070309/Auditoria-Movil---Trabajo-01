package e.d.b.e.a.a;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public final class b0 extends InputStream {
    public final InputStream a;

    /* renamed from: b  reason: collision with root package name */
    public long f6735b;

    public b0(InputStream inputStream, long j2) {
        this.a = inputStream;
        this.f6735b = j2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.a.close();
        this.f6735b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j2 = this.f6735b;
        if (j2 <= 0) {
            return -1;
        }
        this.f6735b = j2 - 1;
        return this.a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f6735b;
        if (j2 <= 0) {
            return -1;
        }
        int read = this.a.read(bArr, i2, (int) Math.min(i3, j2));
        if (read != -1) {
            this.f6735b -= read;
        }
        return read;
    }
}
