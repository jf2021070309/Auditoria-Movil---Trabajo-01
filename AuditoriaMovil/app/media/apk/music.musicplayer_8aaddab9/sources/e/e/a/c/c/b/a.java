package e.e.a.c.c.b;

import java.util.Objects;
/* loaded from: classes.dex */
public final class a implements e.e.a.c.c.a {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final e.e.a.c.b.a f7961b;

    public a(boolean z, e.e.a.c.a aVar) {
        this.a = z;
        this.f7961b = aVar.a;
    }

    @Override // e.e.a.c.c.a
    public byte[] a() {
        e.e.a.c.b.a aVar = this.f7961b;
        boolean z = this.a;
        Objects.requireNonNull(aVar);
        return new byte[]{-7, z ? (byte) 1 : (byte) 0};
    }
}
