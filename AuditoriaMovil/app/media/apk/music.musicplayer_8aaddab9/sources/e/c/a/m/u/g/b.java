package e.c.a.m.u.g;

import e.c.a.l.a;
/* loaded from: classes.dex */
public final class b implements a.InterfaceC0111a {
    public final e.c.a.m.s.c0.d a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.s.c0.b f5912b;

    public b(e.c.a.m.s.c0.d dVar, e.c.a.m.s.c0.b bVar) {
        this.a = dVar;
        this.f5912b = bVar;
    }

    public byte[] a(int i2) {
        e.c.a.m.s.c0.b bVar = this.f5912b;
        return bVar == null ? new byte[i2] : (byte[]) bVar.e(i2, byte[].class);
    }
}
