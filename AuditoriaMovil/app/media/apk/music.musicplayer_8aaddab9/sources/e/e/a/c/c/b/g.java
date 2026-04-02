package e.e.a.c.c.b;

import e.e.a.c.b.m;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class g implements e.e.a.c.c.a {
    public final Set<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final m f7967b;

    public g(Set<String> set, e.e.a.c.a aVar) {
        this.a = set;
        this.f7967b = aVar.f7946m;
    }

    @Override // e.e.a.c.c.a
    public byte[] a() {
        m mVar = this.f7967b;
        Set<String> set = this.a;
        Objects.requireNonNull(mVar);
        int size = set.size();
        byte[][] bArr = new byte[size];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        for (String str : set) {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            byte[] bArr2 = {(byte) ((length >>> 24) & 255), (byte) ((length >>> 16) & 255), (byte) ((length >>> 8) & 255), (byte) (length & 255)};
            int length2 = bytes.length + 4;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, 4);
            System.arraycopy(bytes, 0, bArr3, 4, bytes.length);
            bArr[i4] = bArr3;
            i3 += length2;
            i4++;
        }
        byte[] bArr4 = new byte[i3];
        bArr4[0] = -1;
        for (int i5 = 0; i5 < size; i5++) {
            byte[] bArr5 = bArr[i5];
            System.arraycopy(bArr5, 0, bArr4, i2, bArr5.length);
            i2 += bArr5.length;
        }
        return bArr4;
    }
}
