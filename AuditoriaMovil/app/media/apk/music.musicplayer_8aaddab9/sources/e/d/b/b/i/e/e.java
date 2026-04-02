package e.d.b.b.i.e;

import java.io.IOException;
/* loaded from: classes.dex */
public final class e implements e.d.d.p.e<q> {
    public static final e a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6073b = e.d.d.p.d.a("eventTimeMs");

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f6074c = e.d.d.p.d.a("eventCode");

    /* renamed from: d  reason: collision with root package name */
    public static final e.d.d.p.d f6075d = e.d.d.p.d.a("eventUptimeMs");

    /* renamed from: e  reason: collision with root package name */
    public static final e.d.d.p.d f6076e = e.d.d.p.d.a("sourceExtension");

    /* renamed from: f  reason: collision with root package name */
    public static final e.d.d.p.d f6077f = e.d.d.p.d.a("sourceExtensionJsonProto3");

    /* renamed from: g  reason: collision with root package name */
    public static final e.d.d.p.d f6078g = e.d.d.p.d.a("timezoneOffsetSeconds");

    /* renamed from: h  reason: collision with root package name */
    public static final e.d.d.p.d f6079h = e.d.d.p.d.a("networkConnectionInfo");

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        q qVar = (q) obj;
        e.d.d.p.f fVar2 = fVar;
        fVar2.add(f6073b, qVar.b());
        fVar2.add(f6074c, qVar.a());
        fVar2.add(f6075d, qVar.c());
        fVar2.add(f6076e, qVar.e());
        fVar2.add(f6077f, qVar.f());
        fVar2.add(f6078g, qVar.g());
        fVar2.add(f6079h, qVar.d());
    }
}
