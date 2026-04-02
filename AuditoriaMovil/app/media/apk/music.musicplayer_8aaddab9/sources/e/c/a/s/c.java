package e.c.a.s;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class c extends FilterInputStream {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public int f6022b;

    public c(InputStream inputStream, long j2) {
        super(inputStream);
        this.a = j2;
    }

    public final int a(int i2) throws IOException {
        if (i2 >= 0) {
            this.f6022b += i2;
        } else if (this.a - this.f6022b > 0) {
            StringBuilder y = e.a.d.a.a.y("Failed to read all expected data, expected: ");
            y.append(this.a);
            y.append(", but read: ");
            y.append(this.f6022b);
            throw new IOException(y.toString());
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.a - this.f6022b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        int read;
        read = super.read(bArr, i2, i3);
        a(read);
        return read;
    }
}
