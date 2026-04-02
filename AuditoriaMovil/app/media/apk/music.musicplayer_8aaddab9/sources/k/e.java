package k;

import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class e extends OutputStream {
    public final /* synthetic */ d a;

    public e(d dVar) {
        this.a = dVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.a.h0(i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        h.o.c.j.e(bArr, "data");
        this.a.f0(bArr, i2, i3);
    }
}
