package e.c.a.s;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes.dex */
public class d extends InputStream {
    public static final Queue<d> a;

    /* renamed from: b  reason: collision with root package name */
    public InputStream f6023b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f6024c;

    static {
        char[] cArr = j.a;
        a = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f6023b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6023b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f6023b.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f6023b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f6023b.read();
        } catch (IOException e2) {
            this.f6024c = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f6023b.read(bArr);
        } catch (IOException e2) {
            this.f6024c = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f6023b.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f6024c = e2;
            return -1;
        }
    }

    public void release() {
        this.f6024c = null;
        this.f6023b = null;
        Queue<d> queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f6023b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f6023b.skip(j2);
        } catch (IOException e2) {
            this.f6024c = e2;
            return 0L;
        }
    }
}
