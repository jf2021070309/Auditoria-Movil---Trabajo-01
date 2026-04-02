package e.d.b.b.i.e;

import java.io.IOException;
/* loaded from: classes.dex */
public final class g implements e.d.d.p.e<t> {
    public static final g a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6087b = e.d.d.p.d.a("networkType");

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f6088c = e.d.d.p.d.a("mobileSubtype");

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        t tVar = (t) obj;
        e.d.d.p.f fVar2 = fVar;
        fVar2.add(f6087b, tVar.b());
        fVar2.add(f6088c, tVar.a());
    }
}
