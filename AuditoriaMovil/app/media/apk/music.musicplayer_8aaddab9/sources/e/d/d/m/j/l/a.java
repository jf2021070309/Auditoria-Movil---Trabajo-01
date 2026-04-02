package e.d.d.m.j.l;

import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import e.d.d.m.j.l.a0;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class a implements e.d.d.p.i.a {
    public static final e.d.d.p.i.a a = new a();

    /* renamed from: e.d.d.m.j.l.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0150a implements e.d.d.p.e<a0.a> {
        public static final C0150a a = new C0150a();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7257b = e.d.d.p.d.a("pid");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7258c = e.d.d.p.d.a("processName");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7259d = e.d.d.p.d.a("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7260e = e.d.d.p.d.a("importance");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7261f = e.d.d.p.d.a("pss");

        /* renamed from: g  reason: collision with root package name */
        public static final e.d.d.p.d f7262g = e.d.d.p.d.a("rss");

        /* renamed from: h  reason: collision with root package name */
        public static final e.d.d.p.d f7263h = e.d.d.p.d.a("timestamp");

        /* renamed from: i  reason: collision with root package name */
        public static final e.d.d.p.d f7264i = e.d.d.p.d.a("traceFile");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.a aVar = (a0.a) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7257b, aVar.b());
            fVar2.add(f7258c, aVar.c());
            fVar2.add(f7259d, aVar.e());
            fVar2.add(f7260e, aVar.a());
            fVar2.add(f7261f, aVar.d());
            fVar2.add(f7262g, aVar.f());
            fVar2.add(f7263h, aVar.g());
            fVar2.add(f7264i, aVar.h());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements e.d.d.p.e<a0.c> {
        public static final b a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7265b = e.d.d.p.d.a(Action.KEY_ATTRIBUTE);

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7266c = e.d.d.p.d.a("value");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.c cVar = (a0.c) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7265b, cVar.a());
            fVar2.add(f7266c, cVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements e.d.d.p.e<a0> {
        public static final c a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7267b = e.d.d.p.d.a("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7268c = e.d.d.p.d.a("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7269d = e.d.d.p.d.a("platform");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7270e = e.d.d.p.d.a("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7271f = e.d.d.p.d.a("buildVersion");

        /* renamed from: g  reason: collision with root package name */
        public static final e.d.d.p.d f7272g = e.d.d.p.d.a("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        public static final e.d.d.p.d f7273h = e.d.d.p.d.a("session");

        /* renamed from: i  reason: collision with root package name */
        public static final e.d.d.p.d f7274i = e.d.d.p.d.a("ndkPayload");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0 a0Var = (a0) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7267b, a0Var.g());
            fVar2.add(f7268c, a0Var.c());
            fVar2.add(f7269d, a0Var.f());
            fVar2.add(f7270e, a0Var.d());
            fVar2.add(f7271f, a0Var.a());
            fVar2.add(f7272g, a0Var.b());
            fVar2.add(f7273h, a0Var.h());
            fVar2.add(f7274i, a0Var.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements e.d.d.p.e<a0.d> {
        public static final d a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7275b = e.d.d.p.d.a("files");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7276c = e.d.d.p.d.a("orgId");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.d dVar = (a0.d) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7275b, dVar.a());
            fVar2.add(f7276c, dVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements e.d.d.p.e<a0.d.a> {
        public static final e a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7277b = e.d.d.p.d.a("filename");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7278c = e.d.d.p.d.a("contents");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.d.a aVar = (a0.d.a) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7277b, aVar.b());
            fVar2.add(f7278c, aVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements e.d.d.p.e<a0.e.a> {
        public static final f a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7279b = e.d.d.p.d.a("identifier");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7280c = e.d.d.p.d.a("version");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7281d = e.d.d.p.d.a("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7282e = e.d.d.p.d.a("organization");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7283f = e.d.d.p.d.a("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        public static final e.d.d.p.d f7284g = e.d.d.p.d.a("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        public static final e.d.d.p.d f7285h = e.d.d.p.d.a("developmentPlatformVersion");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.a aVar = (a0.e.a) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7279b, aVar.d());
            fVar2.add(f7280c, aVar.g());
            fVar2.add(f7281d, aVar.c());
            fVar2.add(f7282e, aVar.f());
            fVar2.add(f7283f, aVar.e());
            fVar2.add(f7284g, aVar.a());
            fVar2.add(f7285h, aVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements e.d.d.p.e<a0.e.a.AbstractC0152a> {
        public static final g a = new g();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7286b = e.d.d.p.d.a("clsId");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            fVar.add(f7286b, ((a0.e.a.AbstractC0152a) obj).a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements e.d.d.p.e<a0.e.c> {
        public static final h a = new h();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7287b = e.d.d.p.d.a("arch");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7288c = e.d.d.p.d.a("model");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7289d = e.d.d.p.d.a("cores");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7290e = e.d.d.p.d.a("ram");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7291f = e.d.d.p.d.a("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        public static final e.d.d.p.d f7292g = e.d.d.p.d.a("simulator");

        /* renamed from: h  reason: collision with root package name */
        public static final e.d.d.p.d f7293h = e.d.d.p.d.a("state");

        /* renamed from: i  reason: collision with root package name */
        public static final e.d.d.p.d f7294i = e.d.d.p.d.a("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        public static final e.d.d.p.d f7295j = e.d.d.p.d.a("modelClass");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.c cVar = (a0.e.c) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7287b, cVar.a());
            fVar2.add(f7288c, cVar.e());
            fVar2.add(f7289d, cVar.b());
            fVar2.add(f7290e, cVar.g());
            fVar2.add(f7291f, cVar.c());
            fVar2.add(f7292g, cVar.i());
            fVar2.add(f7293h, cVar.h());
            fVar2.add(f7294i, cVar.d());
            fVar2.add(f7295j, cVar.f());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements e.d.d.p.e<a0.e> {
        public static final i a = new i();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7296b = e.d.d.p.d.a("generator");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7297c = e.d.d.p.d.a("identifier");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7298d = e.d.d.p.d.a("startedAt");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7299e = e.d.d.p.d.a("endedAt");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7300f = e.d.d.p.d.a("crashed");

        /* renamed from: g  reason: collision with root package name */
        public static final e.d.d.p.d f7301g = e.d.d.p.d.a("app");

        /* renamed from: h  reason: collision with root package name */
        public static final e.d.d.p.d f7302h = e.d.d.p.d.a("user");

        /* renamed from: i  reason: collision with root package name */
        public static final e.d.d.p.d f7303i = e.d.d.p.d.a("os");

        /* renamed from: j  reason: collision with root package name */
        public static final e.d.d.p.d f7304j = e.d.d.p.d.a("device");

        /* renamed from: k  reason: collision with root package name */
        public static final e.d.d.p.d f7305k = e.d.d.p.d.a("events");

        /* renamed from: l  reason: collision with root package name */
        public static final e.d.d.p.d f7306l = e.d.d.p.d.a("generatorType");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e eVar = (a0.e) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7296b, eVar.e());
            fVar2.add(f7297c, eVar.g().getBytes(a0.a));
            fVar2.add(f7298d, eVar.i());
            fVar2.add(f7299e, eVar.c());
            fVar2.add(f7300f, eVar.k());
            fVar2.add(f7301g, eVar.a());
            fVar2.add(f7302h, eVar.j());
            fVar2.add(f7303i, eVar.h());
            fVar2.add(f7304j, eVar.b());
            fVar2.add(f7305k, eVar.d());
            fVar2.add(f7306l, eVar.f());
        }
    }

    /* loaded from: classes2.dex */
    public static final class j implements e.d.d.p.e<a0.e.d.a> {
        public static final j a = new j();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7307b = e.d.d.p.d.a("execution");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7308c = e.d.d.p.d.a("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7309d = e.d.d.p.d.a("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7310e = e.d.d.p.d.a("background");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7311f = e.d.d.p.d.a("uiOrientation");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d.a aVar = (a0.e.d.a) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7307b, aVar.c());
            fVar2.add(f7308c, aVar.b());
            fVar2.add(f7309d, aVar.d());
            fVar2.add(f7310e, aVar.a());
            fVar2.add(f7311f, aVar.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements e.d.d.p.e<a0.e.d.a.b.AbstractC0154a> {
        public static final k a = new k();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7312b = e.d.d.p.d.a("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7313c = e.d.d.p.d.a("size");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7314d = e.d.d.p.d.a("name");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7315e = e.d.d.p.d.a("uuid");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d.a.b.AbstractC0154a abstractC0154a = (a0.e.d.a.b.AbstractC0154a) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7312b, abstractC0154a.a());
            fVar2.add(f7313c, abstractC0154a.c());
            fVar2.add(f7314d, abstractC0154a.b());
            e.d.d.p.d dVar = f7315e;
            String d2 = abstractC0154a.d();
            fVar2.add(dVar, d2 != null ? d2.getBytes(a0.a) : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements e.d.d.p.e<a0.e.d.a.b> {
        public static final l a = new l();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7316b = e.d.d.p.d.a("threads");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7317c = e.d.d.p.d.a("exception");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7318d = e.d.d.p.d.a("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7319e = e.d.d.p.d.a("signal");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7320f = e.d.d.p.d.a("binaries");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7316b, bVar.e());
            fVar2.add(f7317c, bVar.c());
            fVar2.add(f7318d, bVar.a());
            fVar2.add(f7319e, bVar.d());
            fVar2.add(f7320f, bVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements e.d.d.p.e<a0.e.d.a.b.AbstractC0155b> {
        public static final m a = new m();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7321b = e.d.d.p.d.a("type");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7322c = e.d.d.p.d.a("reason");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7323d = e.d.d.p.d.a("frames");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7324e = e.d.d.p.d.a("causedBy");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7325f = e.d.d.p.d.a("overflowCount");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d.a.b.AbstractC0155b abstractC0155b = (a0.e.d.a.b.AbstractC0155b) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7321b, abstractC0155b.e());
            fVar2.add(f7322c, abstractC0155b.d());
            fVar2.add(f7323d, abstractC0155b.b());
            fVar2.add(f7324e, abstractC0155b.a());
            fVar2.add(f7325f, abstractC0155b.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class n implements e.d.d.p.e<a0.e.d.a.b.c> {
        public static final n a = new n();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7326b = e.d.d.p.d.a("name");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7327c = e.d.d.p.d.a("code");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7328d = e.d.d.p.d.a("address");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7326b, cVar.c());
            fVar2.add(f7327c, cVar.b());
            fVar2.add(f7328d, cVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class o implements e.d.d.p.e<a0.e.d.a.b.AbstractC0156d> {
        public static final o a = new o();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7329b = e.d.d.p.d.a("name");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7330c = e.d.d.p.d.a("importance");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7331d = e.d.d.p.d.a("frames");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d.a.b.AbstractC0156d abstractC0156d = (a0.e.d.a.b.AbstractC0156d) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7329b, abstractC0156d.c());
            fVar2.add(f7330c, abstractC0156d.b());
            fVar2.add(f7331d, abstractC0156d.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class p implements e.d.d.p.e<a0.e.d.a.b.AbstractC0156d.AbstractC0157a> {
        public static final p a = new p();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7332b = e.d.d.p.d.a("pc");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7333c = e.d.d.p.d.a("symbol");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7334d = e.d.d.p.d.a(Action.FILE_ATTRIBUTE);

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7335e = e.d.d.p.d.a("offset");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7336f = e.d.d.p.d.a("importance");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d.a.b.AbstractC0156d.AbstractC0157a abstractC0157a = (a0.e.d.a.b.AbstractC0156d.AbstractC0157a) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7332b, abstractC0157a.d());
            fVar2.add(f7333c, abstractC0157a.e());
            fVar2.add(f7334d, abstractC0157a.a());
            fVar2.add(f7335e, abstractC0157a.c());
            fVar2.add(f7336f, abstractC0157a.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class q implements e.d.d.p.e<a0.e.d.c> {
        public static final q a = new q();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7337b = e.d.d.p.d.a("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7338c = e.d.d.p.d.a("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7339d = e.d.d.p.d.a("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7340e = e.d.d.p.d.a("orientation");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7341f = e.d.d.p.d.a("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        public static final e.d.d.p.d f7342g = e.d.d.p.d.a("diskUsed");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7337b, cVar.a());
            fVar2.add(f7338c, cVar.b());
            fVar2.add(f7339d, cVar.f());
            fVar2.add(f7340e, cVar.d());
            fVar2.add(f7341f, cVar.e());
            fVar2.add(f7342g, cVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class r implements e.d.d.p.e<a0.e.d> {
        public static final r a = new r();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7343b = e.d.d.p.d.a("timestamp");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7344c = e.d.d.p.d.a("type");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7345d = e.d.d.p.d.a("app");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7346e = e.d.d.p.d.a("device");

        /* renamed from: f  reason: collision with root package name */
        public static final e.d.d.p.d f7347f = e.d.d.p.d.a("log");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.d dVar = (a0.e.d) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7343b, dVar.d());
            fVar2.add(f7344c, dVar.e());
            fVar2.add(f7345d, dVar.a());
            fVar2.add(f7346e, dVar.b());
            fVar2.add(f7347f, dVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class s implements e.d.d.p.e<a0.e.d.AbstractC0159d> {
        public static final s a = new s();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7348b = e.d.d.p.d.a(AppLovinEventTypes.USER_VIEWED_CONTENT);

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            fVar.add(f7348b, ((a0.e.d.AbstractC0159d) obj).a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class t implements e.d.d.p.e<a0.e.AbstractC0160e> {
        public static final t a = new t();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7349b = e.d.d.p.d.a("platform");

        /* renamed from: c  reason: collision with root package name */
        public static final e.d.d.p.d f7350c = e.d.d.p.d.a("version");

        /* renamed from: d  reason: collision with root package name */
        public static final e.d.d.p.d f7351d = e.d.d.p.d.a("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final e.d.d.p.d f7352e = e.d.d.p.d.a("jailbroken");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            a0.e.AbstractC0160e abstractC0160e = (a0.e.AbstractC0160e) obj;
            e.d.d.p.f fVar2 = fVar;
            fVar2.add(f7349b, abstractC0160e.b());
            fVar2.add(f7350c, abstractC0160e.c());
            fVar2.add(f7351d, abstractC0160e.a());
            fVar2.add(f7352e, abstractC0160e.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class u implements e.d.d.p.e<a0.e.f> {
        public static final u a = new u();

        /* renamed from: b  reason: collision with root package name */
        public static final e.d.d.p.d f7353b = e.d.d.p.d.a("identifier");

        @Override // e.d.d.p.b
        public void encode(Object obj, e.d.d.p.f fVar) throws IOException {
            fVar.add(f7353b, ((a0.e.f) obj).a());
        }
    }

    @Override // e.d.d.p.i.a
    public void configure(e.d.d.p.i.b<?> bVar) {
        c cVar = c.a;
        bVar.registerEncoder(a0.class, cVar);
        bVar.registerEncoder(e.d.d.m.j.l.b.class, cVar);
        i iVar = i.a;
        bVar.registerEncoder(a0.e.class, iVar);
        bVar.registerEncoder(e.d.d.m.j.l.g.class, iVar);
        f fVar = f.a;
        bVar.registerEncoder(a0.e.a.class, fVar);
        bVar.registerEncoder(e.d.d.m.j.l.h.class, fVar);
        g gVar = g.a;
        bVar.registerEncoder(a0.e.a.AbstractC0152a.class, gVar);
        bVar.registerEncoder(e.d.d.m.j.l.i.class, gVar);
        u uVar = u.a;
        bVar.registerEncoder(a0.e.f.class, uVar);
        bVar.registerEncoder(v.class, uVar);
        t tVar = t.a;
        bVar.registerEncoder(a0.e.AbstractC0160e.class, tVar);
        bVar.registerEncoder(e.d.d.m.j.l.u.class, tVar);
        h hVar = h.a;
        bVar.registerEncoder(a0.e.c.class, hVar);
        bVar.registerEncoder(e.d.d.m.j.l.j.class, hVar);
        r rVar = r.a;
        bVar.registerEncoder(a0.e.d.class, rVar);
        bVar.registerEncoder(e.d.d.m.j.l.k.class, rVar);
        j jVar = j.a;
        bVar.registerEncoder(a0.e.d.a.class, jVar);
        bVar.registerEncoder(e.d.d.m.j.l.l.class, jVar);
        l lVar = l.a;
        bVar.registerEncoder(a0.e.d.a.b.class, lVar);
        bVar.registerEncoder(e.d.d.m.j.l.m.class, lVar);
        o oVar = o.a;
        bVar.registerEncoder(a0.e.d.a.b.AbstractC0156d.class, oVar);
        bVar.registerEncoder(e.d.d.m.j.l.q.class, oVar);
        p pVar = p.a;
        bVar.registerEncoder(a0.e.d.a.b.AbstractC0156d.AbstractC0157a.class, pVar);
        bVar.registerEncoder(e.d.d.m.j.l.r.class, pVar);
        m mVar = m.a;
        bVar.registerEncoder(a0.e.d.a.b.AbstractC0155b.class, mVar);
        bVar.registerEncoder(e.d.d.m.j.l.o.class, mVar);
        C0150a c0150a = C0150a.a;
        bVar.registerEncoder(a0.a.class, c0150a);
        bVar.registerEncoder(e.d.d.m.j.l.c.class, c0150a);
        n nVar = n.a;
        bVar.registerEncoder(a0.e.d.a.b.c.class, nVar);
        bVar.registerEncoder(e.d.d.m.j.l.p.class, nVar);
        k kVar = k.a;
        bVar.registerEncoder(a0.e.d.a.b.AbstractC0154a.class, kVar);
        bVar.registerEncoder(e.d.d.m.j.l.n.class, kVar);
        b bVar2 = b.a;
        bVar.registerEncoder(a0.c.class, bVar2);
        bVar.registerEncoder(e.d.d.m.j.l.d.class, bVar2);
        q qVar = q.a;
        bVar.registerEncoder(a0.e.d.c.class, qVar);
        bVar.registerEncoder(e.d.d.m.j.l.s.class, qVar);
        s sVar = s.a;
        bVar.registerEncoder(a0.e.d.AbstractC0159d.class, sVar);
        bVar.registerEncoder(e.d.d.m.j.l.t.class, sVar);
        d dVar = d.a;
        bVar.registerEncoder(a0.d.class, dVar);
        bVar.registerEncoder(e.d.d.m.j.l.e.class, dVar);
        e eVar = e.a;
        bVar.registerEncoder(a0.d.a.class, eVar);
        bVar.registerEncoder(e.d.d.m.j.l.f.class, eVar);
    }
}
