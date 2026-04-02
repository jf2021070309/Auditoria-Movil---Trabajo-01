package e.e.a.c.c.b;

import e.e.a.c.b.i;
import java.util.Objects;
/* loaded from: classes.dex */
public final class e implements e.e.a.c.c.a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final i f7965b;

    public e(long j2, e.e.a.c.a aVar) {
        this.a = j2;
        this.f7965b = aVar.f7942i;
    }

    @Override // e.e.a.c.c.a
    public byte[] a() {
        i iVar = this.f7965b;
        long j2 = this.a;
        Objects.requireNonNull(iVar);
        return new byte[]{-4, (byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
    }
}
