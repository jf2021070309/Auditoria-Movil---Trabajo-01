package e.c.a.m.r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class g extends FilterInputStream {
    public static final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f5566b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f5567c;

    /* renamed from: d  reason: collision with root package name */
    public final byte f5568d;

    /* renamed from: e  reason: collision with root package name */
    public int f5569e;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        a = bArr;
        int length = bArr.length;
        f5566b = length;
        f5567c = length + 2;
    }

    public g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException(e.a.d.a.a.e("Cannot add invalid orientation: ", i2));
        }
        this.f5568d = (byte) i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2;
        int i3 = this.f5569e;
        int read = (i3 < 2 || i3 > (i2 = f5567c)) ? super.read() : i3 == i2 ? this.f5568d : a[i3 - 2] & 255;
        if (read != -1) {
            this.f5569e++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.f5569e;
        int i6 = f5567c;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f5568d;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(a, this.f5569e - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.f5569e += i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long skip = super.skip(j2);
        if (skip > 0) {
            this.f5569e = (int) (this.f5569e + skip);
        }
        return skip;
    }
}
