package e.d.d.p.k;

import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class d extends OutputStream {
    public long a = 0;

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || (i4 = i2 + i3) > bArr.length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.a += i3;
    }
}
