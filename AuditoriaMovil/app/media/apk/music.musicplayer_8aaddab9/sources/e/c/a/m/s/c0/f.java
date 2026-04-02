package e.c.a.m.s.c0;
/* loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // e.c.a.m.s.c0.a
    public int a() {
        return 1;
    }

    @Override // e.c.a.m.s.c0.a
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // e.c.a.m.s.c0.a
    public String f() {
        return "ByteArrayPool";
    }

    @Override // e.c.a.m.s.c0.a
    public byte[] newArray(int i2) {
        return new byte[i2];
    }
}
