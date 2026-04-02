package k;
/* loaded from: classes2.dex */
public final class a0 {
    public static final boolean a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        h.o.c.j.e(bArr, "a");
        h.o.c.j.e(bArr2, "b");
        if (i4 <= 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
            if (i6 >= i4) {
                return true;
            }
            i5 = i6;
        }
    }

    public static final void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final String c(byte b2) {
        char[] cArr = k.b0.b.a;
        char[] cArr2 = {cArr[(b2 >> 4) & 15], cArr[b2 & 15]};
        h.o.c.j.e(cArr2, "<this>");
        return new String(cArr2);
    }
}
