package e.e.a.c.c.b;

import java.util.Objects;
/* loaded from: classes.dex */
public final class b implements e.e.a.c.c.a {
    public final float a;

    /* renamed from: b  reason: collision with root package name */
    public final e.e.a.c.b.f f7962b;

    public b(float f2, e.e.a.c.a aVar) {
        this.a = f2;
        this.f7962b = aVar.f7939f;
    }

    @Override // e.e.a.c.c.a
    public byte[] a() {
        e.e.a.c.b.f fVar = this.f7962b;
        float f2 = this.a;
        Objects.requireNonNull(fVar);
        int floatToIntBits = Float.floatToIntBits(f2);
        return new byte[]{-6, (byte) (floatToIntBits >>> 24), (byte) (floatToIntBits >>> 16), (byte) (floatToIntBits >>> 8), (byte) floatToIntBits};
    }
}
