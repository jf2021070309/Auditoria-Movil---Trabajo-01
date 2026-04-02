package com.amazon.aps.iva.fx;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.sv.o2;
import com.amazon.aps.iva.u00.q;
import com.ellation.crunchyroll.api.TimberLoggingInterceptor;
import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.model.Channel;
import java.util.List;
import java.util.function.Predicate;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class f implements com.amazon.aps.iva.zv.b {
    public final String a;
    public final b b;
    public final l c;
    public final c d;
    public final e e;
    public final com.amazon.aps.iva.ct.d f;
    public final k g;
    public final j h;
    public final i i;
    public final h j;
    public final com.amazon.aps.iva.ts.a k;
    public final g l;
    public final com.amazon.aps.iva.gx.e m;
    public final com.amazon.aps.iva.cx.e n;
    public final /* synthetic */ EtpNetworkModule o;
    public final /* synthetic */ com.amazon.aps.iva.ph.a p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ com.amazon.aps.iva.aj.f r;
    public final /* synthetic */ com.amazon.aps.iva.cj.l s;

    /* compiled from: DownloadingFeatureFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Interceptor, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Interceptor interceptor) {
            Interceptor interceptor2 = interceptor;
            com.amazon.aps.iva.yb0.j.f(interceptor2, "it");
            return Boolean.valueOf(interceptor2 instanceof TimberLoggingInterceptor);
        }
    }

    public f(EtpNetworkModule etpNetworkModule, com.amazon.aps.iva.ph.a aVar, com.amazon.aps.iva.ya0.f fVar, com.amazon.aps.iva.bo.f fVar2, com.amazon.aps.iva.ct.c cVar, com.amazon.aps.iva.aj.j jVar, com.amazon.aps.iva.x50.a aVar2, com.amazon.aps.iva.y30.i iVar, n nVar) {
        this.o = etpNetworkModule;
        this.p = aVar;
        this.q = fVar;
        this.r = jVar;
        this.s = nVar;
        com.amazon.aps.iva.ts.b.a.getClass();
        this.a = com.amazon.aps.iva.ts.a.j;
        this.b = new b(fVar);
        this.c = new l(fVar2);
        this.d = new c(cVar);
        this.e = e.h;
        this.f = etpNetworkModule.getUserBenefitsChangeMonitor();
        this.g = new k(aVar2);
        this.h = new j(iVar);
        this.i = new i(etpNetworkModule);
        this.j = new h(fVar);
        this.k = com.amazon.aps.iva.ts.b.b;
        this.l = new g(aVar2);
        this.m = new com.amazon.aps.iva.gx.e(aVar);
        com.ellation.crunchyroll.application.a aVar3 = a.C0959a.a;
        if (aVar3 != null) {
            Object c = aVar3.c().c(com.amazon.aps.iva.cx.e.class, "bulk_sync");
            if (c != null) {
                this.n = (com.amazon.aps.iva.cx.e) c;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BulkSyncConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.xb0.l<String, Channel> A() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.ts.c B() {
        return com.amazon.aps.iva.ts.b.c;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.d C() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final OkHttpClient D() {
        OkHttpClient.Builder newBuilder = this.o.getEtpOkHttpClient().newBuilder();
        List<Interceptor> interceptors = newBuilder.interceptors();
        final a aVar = a.h;
        interceptors.removeIf(new Predicate() { // from class: com.amazon.aps.iva.fx.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                com.amazon.aps.iva.xb0.l lVar = aVar;
                com.amazon.aps.iva.yb0.j.f(lVar, "$tmp0");
                return ((Boolean) lVar.invoke(obj)).booleanValue();
            }
        });
        return newBuilder.build();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.a F() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final boolean b(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        return com.amazon.aps.iva.gr.n.w(intent);
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.aj.a c() {
        return this.r.c();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final String d() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.ct.d e() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.e f() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.rh.a g() {
        com.amazon.aps.iva.wh.d c = this.p.c();
        Context context = this.q;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(c, "subscriptionProductStore");
        return new com.amazon.aps.iva.s20.h(context, c);
    }

    @Override // com.amazon.aps.iva.zv.b
    public final o2 h() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.b10.i k() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.sk.a n() {
        return this.s.c();
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.f o() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final q p() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.g q() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.zv.h s() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.xb0.a<d> t() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.jg.a x() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.i.class, "downloading");
            if (c != null) {
                return (com.amazon.aps.iva.cx.i) c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.DownloadingConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.zv.b
    public final com.amazon.aps.iva.p00.a z() {
        return this.b;
    }
}
