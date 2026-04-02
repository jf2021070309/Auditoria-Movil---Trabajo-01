package e.c.a.m.u.d;

import e.c.a.m.s.w;
import java.util.Objects;
/* loaded from: classes.dex */
public class b implements w<byte[]> {
    public final byte[] a;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.a = bArr;
    }

    @Override // e.c.a.m.s.w
    public void a() {
    }

    @Override // e.c.a.m.s.w
    public Class<byte[]> c() {
        return byte[].class;
    }

    @Override // e.c.a.m.s.w
    public byte[] get() {
        return this.a;
    }

    @Override // e.c.a.m.s.w
    public int getSize() {
        return this.a.length;
    }
}
