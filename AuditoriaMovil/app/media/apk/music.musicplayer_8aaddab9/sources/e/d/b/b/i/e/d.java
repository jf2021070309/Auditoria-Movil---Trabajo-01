package e.d.b.b.i.e;

import java.io.IOException;
/* loaded from: classes.dex */
public final class d implements e.d.d.p.e<p> {
    public static final d a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6071b = e.d.d.p.d.a("clientType");

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f6072c = e.d.d.p.d.a("androidClientInfo");

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        p pVar = (p) obj;
        e.d.d.p.f fVar2 = fVar;
        fVar2.add(f6071b, pVar.b());
        fVar2.add(f6072c, pVar.a());
    }
}
