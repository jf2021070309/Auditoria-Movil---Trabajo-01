package e.d.b.b.i.e;

import java.io.IOException;
/* loaded from: classes.dex */
public final class f implements e.d.d.p.e<r> {
    public static final f a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6080b = e.d.d.p.d.a("requestTimeMs");

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f6081c = e.d.d.p.d.a("requestUptimeMs");

    /* renamed from: d  reason: collision with root package name */
    public static final e.d.d.p.d f6082d = e.d.d.p.d.a("clientInfo");

    /* renamed from: e  reason: collision with root package name */
    public static final e.d.d.p.d f6083e = e.d.d.p.d.a("logSource");

    /* renamed from: f  reason: collision with root package name */
    public static final e.d.d.p.d f6084f = e.d.d.p.d.a("logSourceName");

    /* renamed from: g  reason: collision with root package name */
    public static final e.d.d.p.d f6085g = e.d.d.p.d.a("logEvent");

    /* renamed from: h  reason: collision with root package name */
    public static final e.d.d.p.d f6086h = e.d.d.p.d.a("qosTier");

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        r rVar = (r) obj;
        e.d.d.p.f fVar2 = fVar;
        fVar2.add(f6080b, rVar.f());
        fVar2.add(f6081c, rVar.g());
        fVar2.add(f6082d, rVar.a());
        fVar2.add(f6083e, rVar.c());
        fVar2.add(f6084f, rVar.d());
        fVar2.add(f6085g, rVar.b());
        fVar2.add(f6086h, rVar.e());
    }
}
