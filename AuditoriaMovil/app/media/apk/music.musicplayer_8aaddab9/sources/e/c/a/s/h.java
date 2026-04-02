package e.c.a.s;

import ch.qos.logback.classic.Level;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class h extends FilterInputStream {
    public int a;

    public h(InputStream inputStream) {
        super(inputStream);
        this.a = Level.ALL_INT;
    }

    public final long a(long j2) {
        int i2 = this.a;
        if (i2 == 0) {
            return -1L;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i2 = this.a;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    public final void f(long j2) {
        int i2 = this.a;
        if (i2 == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.a = (int) (i2 - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        super.mark(i2);
        this.a = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        f(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int a = (int) a(i3);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i2, a);
        f(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.a = Level.ALL_INT;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long a = a(j2);
        if (a == -1) {
            return 0L;
        }
        long skip = super.skip(a);
        f(skip);
        return skip;
    }
}
