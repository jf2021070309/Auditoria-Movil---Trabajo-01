package e.e.a.c.c.b;

import e.e.a.c.b.h;
import java.util.Objects;
/* loaded from: classes.dex */
public final class d implements e.e.a.c.c.a {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final h f7964b;

    public d(int i2, e.e.a.c.a aVar) {
        this.a = i2;
        this.f7964b = aVar.f7941h;
    }

    @Override // e.e.a.c.c.a
    public byte[] a() {
        h hVar = this.f7964b;
        int i2 = this.a;
        Objects.requireNonNull(hVar);
        return new byte[]{-3, (byte) ((i2 >>> 24) & 255), (byte) ((i2 >>> 16) & 255), (byte) ((i2 >>> 8) & 255), (byte) (i2 & 255)};
    }
}
