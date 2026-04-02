package e.c.a.m.r;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class c extends OutputStream {
    public final OutputStream a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f5562b;

    /* renamed from: c  reason: collision with root package name */
    public e.c.a.m.s.c0.b f5563c;

    /* renamed from: d  reason: collision with root package name */
    public int f5564d;

    public c(OutputStream outputStream, e.c.a.m.s.c0.b bVar) {
        this.a = outputStream;
        this.f5563c = bVar;
        this.f5562b = (byte[]) bVar.e(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.a.close();
            byte[] bArr = this.f5562b;
            if (bArr != null) {
                this.f5563c.d(bArr);
                this.f5562b = null;
            }
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i2 = this.f5564d;
        if (i2 > 0) {
            this.a.write(this.f5562b, 0, i2);
            this.f5564d = 0;
        }
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        byte[] bArr = this.f5562b;
        int i3 = this.f5564d;
        int i4 = i3 + 1;
        this.f5564d = i4;
        bArr[i3] = (byte) i2;
        if (i4 != bArr.length || i4 <= 0) {
            return;
        }
        this.a.write(bArr, 0, i4);
        this.f5564d = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f5564d;
            if (i7 == 0 && i5 >= this.f5562b.length) {
                this.a.write(bArr, i6, i5);
                return;
            }
            int min = Math.min(i5, this.f5562b.length - i7);
            System.arraycopy(bArr, i6, this.f5562b, this.f5564d, min);
            int i8 = this.f5564d + min;
            this.f5564d = i8;
            i4 += min;
            byte[] bArr2 = this.f5562b;
            if (i8 == bArr2.length && i8 > 0) {
                this.a.write(bArr2, 0, i8);
                this.f5564d = 0;
                continue;
            }
        } while (i4 < i3);
    }
}
