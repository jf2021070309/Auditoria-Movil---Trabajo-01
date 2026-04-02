package com.amazon.aps.iva.sv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.jf0.b0;
import com.amazon.aps.iva.ow.a;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.x5.c;
import com.amazon.aps.iva.zv.b;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.drm.DrmProxyServiceImpl;
import com.ellation.crunchyroll.api.etp.download.DownloadService;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.Channel;
import java.util.Arrays;
import okhttp3.OkHttpClient;
/* compiled from: DownloadingFeatureImpl.kt */
/* loaded from: classes2.dex */
public final class e implements g, com.amazon.aps.iva.zv.b {
    public static com.amazon.aps.iva.zv.b e;
    public static g f;
    public final com.amazon.aps.iva.zv.b a;
    public final String b = com.amazon.aps.iva.oa.a.a(DrmProxyServiceImpl.LICENCE_PROXY_PREFIX, B().a());
    public final DownloadService c;
    public final com.amazon.aps.iva.uv.d d;

    /* compiled from: DownloadingFeatureImpl.kt */
    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes2.dex */
    public static final class a {
        public static com.amazon.aps.iva.zv.b a() {
            com.amazon.aps.iva.zv.b bVar = e.e;
            if (bVar != null) {
                return bVar;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public e(com.amazon.aps.iva.fx.f fVar) {
        this.a = fVar;
        b0.b bVar = new b0.b();
        com.amazon.aps.iva.ts.b.c.getClass();
        String str = com.amazon.aps.iva.ts.a.h;
        bVar.b("https://cr-play-service" + str);
        bVar.d(D());
        bVar.a(com.amazon.aps.iva.kf0.a.c(GsonHolder.getInstance()));
        Object b = bVar.c().b(DownloadService.class);
        com.amazon.aps.iva.yb0.j.e(b, "Builder()\n        .baseU…nloadService::class.java)");
        this.c = (DownloadService) b;
        this.d = com.amazon.aps.iva.ab.x.G(F());
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.xb0.l<String, Channel> A() {
        return this.a.A();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.ts.c B() {
        return this.a.B();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.d C() {
        return this.a.C();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final OkHttpClient D() {
        return this.a.D();
    }

    @Override // com.amazon.aps.iva.fg.a
    public final com.amazon.aps.iva.y00.a E(androidx.fragment.app.h hVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.qg.a... aVarArr) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        com.amazon.aps.iva.s00.a aVar2 = new com.amazon.aps.iva.s00.a(hVar, (com.amazon.aps.iva.qg.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        h hVar2 = h.a.a;
        if (hVar2 != null) {
            return new com.amazon.aps.iva.y00.a(aVar2, aVar, hVar2.a());
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.a F() {
        return this.a.F();
    }

    public final com.amazon.aps.iva.aw.a G(com.amazon.aps.iva.kg.b bVar) {
        h hVar = h.a.a;
        if (hVar != null) {
            c b = hVar.b();
            h hVar2 = h.a.a;
            if (hVar2 != null) {
                return new com.amazon.aps.iva.aw.a(bVar, b, hVar2.a());
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    public final com.ellation.crunchyroll.downloading.i0 H(com.amazon.aps.iva.xe0.d dVar) {
        h hVar = h.a.a;
        if (hVar != null) {
            InternalDownloadsManager a2 = hVar.a();
            f fVar = new f(this);
            com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
            return new com.ellation.crunchyroll.downloading.i0(a2, fVar, dVar);
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    public final c.a I() {
        return com.amazon.aps.iva.dw.a.a.a();
    }

    public final com.amazon.aps.iva.wg.a J() {
        int i = h.a;
        h hVar = h.a.a;
        if (hVar != null) {
            return hVar.d();
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.fg.a
    public final InternalDownloadsManager a() {
        h hVar = h.a.a;
        if (hVar != null) {
            return hVar.a();
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final boolean b(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        return this.a.b(intent);
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.aj.a c() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final String d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.ct.d e() {
        return this.a.e();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.e f() {
        return this.a.f();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.rh.a g() {
        return this.a.g();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final o2 h() {
        return this.a.h();
    }

    @Override // com.amazon.aps.iva.sv.g
    public final String i() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.fg.a
    public final com.amazon.aps.iva.rg.a j(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "view");
        LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_download_button, viewGroup, true);
        View findViewById = viewGroup.findViewById(R.id.download_button);
        com.amazon.aps.iva.yb0.j.e(findViewById, "view.findViewById<Downlo…on>(R.id.download_button)");
        return (com.amazon.aps.iva.rg.a) findViewById;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.b10.i k() {
        return this.a.k();
    }

    @Override // com.amazon.aps.iva.fg.a
    public final s2 l() {
        return new s2(this.a.C().getSkipEventsService());
    }

    @Override // com.amazon.aps.iva.fg.a
    public final com.amazon.aps.iva.iw.c m(androidx.fragment.app.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        return new com.amazon.aps.iva.iw.c(hVar);
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.sk.a n() {
        return this.a.n();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.f o() {
        return this.a.o();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.u00.q p() {
        return this.a.p();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.g q() {
        return this.a.q();
    }

    @Override // com.amazon.aps.iva.fg.a
    public final com.amazon.aps.iva.uv.d r() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.h s() {
        return this.a.s();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.zv.c> t() {
        return this.a.t();
    }

    @Override // com.amazon.aps.iva.sv.g
    public final DownloadService u() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.fg.a
    public final com.amazon.aps.iva.p00.c v(androidx.fragment.app.h hVar, com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ng.a aVar, com.amazon.aps.iva.pg.a aVar2, com.amazon.aps.iva.tg.a aVar3, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.a aVar4) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        com.amazon.aps.iva.yb0.j.f(g0Var, "lifecycleCoroutineScope");
        com.amazon.aps.iva.yb0.j.f(aVar, "matureFlowComponent");
        com.amazon.aps.iva.yb0.j.f(aVar2, "downloadAccessUpsellFlowComponent");
        com.amazon.aps.iva.yb0.j.f(aVar3, "seasonTitleFormatter");
        return new com.amazon.aps.iva.p00.c(hVar, g0Var, aVar, aVar2, aVar3, lVar, aVar4);
    }

    @Override // com.amazon.aps.iva.fg.a
    public final p2 w() {
        Context context = b.a.a;
        if (context != null) {
            com.amazon.aps.iva.ow.b bVar = a.C0586a.a;
            if (bVar == null) {
                Context applicationContext = context.getApplicationContext();
                com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
                bVar = new com.amazon.aps.iva.ow.b(applicationContext);
                a.C0586a.a = bVar;
            }
            return new p2(bVar);
        }
        com.amazon.aps.iva.yb0.j.m("internalContext");
        throw null;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.jg.a x() {
        return this.a.x();
    }

    @Override // com.amazon.aps.iva.fg.a
    public final com.amazon.aps.iva.lw.a y() {
        return new com.amazon.aps.iva.lw.a(0);
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.p00.a z() {
        return this.a.z();
    }
}
