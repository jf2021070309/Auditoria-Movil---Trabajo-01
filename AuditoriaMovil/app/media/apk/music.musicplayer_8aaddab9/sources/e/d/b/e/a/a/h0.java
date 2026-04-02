package e.d.b.e.a.a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class h0 extends FilterInputStream {
    public final s1 a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f6806b;

    /* renamed from: c  reason: collision with root package name */
    public long f6807c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6808d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6809e;

    public h0(InputStream inputStream) {
        super(inputStream);
        this.a = new s1();
        this.f6806b = new byte[4096];
        this.f6808d = false;
        this.f6809e = false;
    }

    public final int a(byte[] bArr, int i2, int i3) throws IOException {
        return Math.max(0, super.read(bArr, i2, i3));
    }

    public final m2 f() throws IOException {
        byte[] bArr;
        if (this.f6807c <= 0) {
            if (this.f6808d) {
            }
            return new m2(null, -1L, -1, false, false, null);
        }
        do {
            bArr = this.f6806b;
        } while (read(bArr, 0, bArr.length) != -1);
        if (!this.f6808d || this.f6809e) {
            return new m2(null, -1L, -1, false, false, null);
        }
        if (!h(30)) {
            this.f6808d = true;
            return this.a.c();
        }
        m2 c2 = this.a.c();
        if (c2.f6862e) {
            this.f6809e = true;
            return c2;
        } else if (c2.f6859b != 4294967295L) {
            int i2 = this.a.f6937f - 30;
            long j2 = i2;
            int length = this.f6806b.length;
            if (j2 > length) {
                do {
                    length += length;
                } while (length < j2);
                this.f6806b = Arrays.copyOf(this.f6806b, length);
            }
            if (!h(i2)) {
                this.f6808d = true;
                return this.a.c();
            }
            m2 c3 = this.a.c();
            this.f6807c = c3.f6859b;
            return c3;
        } else {
            throw new p0("Files bigger than 4GiB are not supported.");
        }
    }

    public final boolean h(int i2) throws IOException {
        int a = a(this.f6806b, 0, i2);
        if (a != i2) {
            int i3 = i2 - a;
            if (a(this.f6806b, a, i3) != i3) {
                this.a.b(this.f6806b, 0, a);
                return false;
            }
        }
        this.a.b(this.f6806b, 0, i2);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f6807c;
        if (j2 <= 0 || this.f6808d) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i2, (int) Math.min(j2, i3)));
        this.f6807c -= max;
        if (max == 0) {
            this.f6808d = true;
            return 0;
        }
        return max;
    }
}
