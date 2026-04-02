package e.d.b.b.i.e;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
/* loaded from: classes.dex */
public final class b implements e.d.d.p.e<a> {
    public static final b a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.d.p.d f6058b = e.d.d.p.d.a("sdkVersion");

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.d.p.d f6059c = e.d.d.p.d.a("model");

    /* renamed from: d  reason: collision with root package name */
    public static final e.d.d.p.d f6060d = e.d.d.p.d.a("hardware");

    /* renamed from: e  reason: collision with root package name */
    public static final e.d.d.p.d f6061e = e.d.d.p.d.a("device");

    /* renamed from: f  reason: collision with root package name */
    public static final e.d.d.p.d f6062f = e.d.d.p.d.a(AppLovinEventTypes.USER_VIEWED_PRODUCT);

    /* renamed from: g  reason: collision with root package name */
    public static final e.d.d.p.d f6063g = e.d.d.p.d.a("osBuild");

    /* renamed from: h  reason: collision with root package name */
    public static final e.d.d.p.d f6064h = e.d.d.p.d.a("manufacturer");

    /* renamed from: i  reason: collision with root package name */
    public static final e.d.d.p.d f6065i = e.d.d.p.d.a("fingerprint");

    /* renamed from: j  reason: collision with root package name */
    public static final e.d.d.p.d f6066j = e.d.d.p.d.a("locale");

    /* renamed from: k  reason: collision with root package name */
    public static final e.d.d.p.d f6067k = e.d.d.p.d.a("country");

    /* renamed from: l  reason: collision with root package name */
    public static final e.d.d.p.d f6068l = e.d.d.p.d.a("mccMnc");

    /* renamed from: m  reason: collision with root package name */
    public static final e.d.d.p.d f6069m = e.d.d.p.d.a("applicationBuild");

    @Override // e.d.d.p.b
    public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
        a aVar = (a) obj;
        e.d.d.p.f fVar2 = fVar;
        fVar2.add(f6058b, aVar.l());
        fVar2.add(f6059c, aVar.i());
        fVar2.add(f6060d, aVar.e());
        fVar2.add(f6061e, aVar.c());
        fVar2.add(f6062f, aVar.k());
        fVar2.add(f6063g, aVar.j());
        fVar2.add(f6064h, aVar.g());
        fVar2.add(f6065i, aVar.d());
        fVar2.add(f6066j, aVar.f());
        fVar2.add(f6067k, aVar.b());
        fVar2.add(f6068l, aVar.h());
        fVar2.add(f6069m, aVar.a());
    }
}
