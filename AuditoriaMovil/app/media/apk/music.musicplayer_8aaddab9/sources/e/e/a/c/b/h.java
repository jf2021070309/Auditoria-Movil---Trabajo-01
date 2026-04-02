package e.e.a.c.b;
/* loaded from: classes.dex */
public final class h {
    public int a(byte[] bArr, int i2) {
        return (bArr[i2 + 4] & 255) + ((bArr[i2 + 3] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + (bArr[i2 + 1] << 24);
    }
}
