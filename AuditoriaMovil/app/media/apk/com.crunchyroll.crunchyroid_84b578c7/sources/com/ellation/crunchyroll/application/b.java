package com.ellation.crunchyroll.application;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.jf0.b0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.ys.m;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.appconfig.ConfigDeltaService;
import com.ellation.crunchyroll.api.etp.OkHttpClientFactory;
import com.ellation.crunchyroll.api.etp.auth.EtpAuthInterceptor;
import com.ellation.crunchyroll.api.etp.auth.EtpAuthenticator;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.io.InputStreamReader;
import okhttp3.OkHttpClient;
/* compiled from: AppConfigModule.kt */
/* loaded from: classes2.dex */
public final class b implements com.ellation.crunchyroll.application.a {
    public final com.amazon.aps.iva.ms.c b;
    public final v<com.amazon.aps.iva.ms.a> c;
    public final c d;

    /* compiled from: AppConfigModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.l<? super InputStream, ? extends JsonObject>, JsonObject> {
        public final /* synthetic */ CrunchyrollApplication h;
        public final /* synthetic */ com.amazon.aps.iva.ts.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CrunchyrollApplication crunchyrollApplication, com.amazon.aps.iva.ts.a aVar) {
            super(1);
            this.h = crunchyrollApplication;
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final JsonObject invoke(com.amazon.aps.iva.xb0.l<? super InputStream, ? extends JsonObject> lVar) {
            com.amazon.aps.iva.xb0.l<? super InputStream, ? extends JsonObject> lVar2 = lVar;
            j.f(lVar2, "it");
            AssetManager assets = this.h.getAssets();
            this.i.getClass();
            InputStream open = assets.open(com.amazon.aps.iva.ts.a.r);
            j.e(open, "context.assets.open(conf…ion.appConfigDefaultFile)");
            try {
                JsonObject invoke = lVar2.invoke(open);
                com.amazon.aps.iva.a60.b.k(open, null);
                return invoke;
            } finally {
            }
        }
    }

    /* compiled from: AppConfigModule.kt */
    /* renamed from: com.ellation.crunchyroll.application.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0960b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ v<com.amazon.aps.iva.ms.a> h;
        public final /* synthetic */ b i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0960b(v<com.amazon.aps.iva.ms.a> vVar, b bVar) {
            super(0);
            this.h = vVar;
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.k(this.i.b);
            return q.a;
        }
    }

    public b(EtpAuthInterceptor etpAuthInterceptor, EtpAuthenticator etpAuthenticator, OkHttpClientFactory okHttpClientFactory, d dVar) {
        PackageInfo packageInfo;
        com.amazon.aps.iva.qs.a jVar;
        PackageManager.PackageInfoFlags of;
        CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
        CrunchyrollApplication a2 = CrunchyrollApplication.a.a();
        com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.ts.b.a;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = a2.getPackageManager();
            String packageName = a2.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0);
        }
        String str = packageInfo.versionName;
        j.e(str, "if (Build.VERSION.SDK_IN… 0)\n        }.versionName");
        aVar.getClass();
        String str2 = com.amazon.aps.iva.ts.a.e;
        SharedPreferences sharedPreferences = a2.getSharedPreferences("appConfig", 0);
        j.e(sharedPreferences, "context.getSharedPrefere…g\", Context.MODE_PRIVATE)");
        m mVar = new m(sharedPreferences, str2);
        OkHttpClient build = okHttpClientFactory.newClientBuilder(etpAuthInterceptor).authenticator(etpAuthenticator).build();
        b0.b bVar = new b0.b();
        bVar.b(com.amazon.aps.iva.ts.a.i);
        bVar.d(build);
        bVar.a(com.amazon.aps.iva.kf0.a.c(GsonHolder.getInstance()));
        b0 c = bVar.c();
        if (com.amazon.aps.iva.ts.a.s) {
            InputStream open = a2.getAssets().open("app-config-json-schema.json");
            j.e(open, "context.assets.open(\"app-config-json-schema.json\")");
            jVar = new com.amazon.aps.iva.qs.b(k.y(new InputStreamReader(open, com.amazon.aps.iva.oe0.a.b)));
        } else {
            jVar = new com.amazon.aps.iva.b30.j();
        }
        t tVar = new t();
        com.amazon.aps.iva.os.a aVar2 = new com.amazon.aps.iva.os.a(new a(a2, aVar), new com.amazon.aps.iva.a60.b());
        com.amazon.aps.iva.os.b bVar2 = new com.amazon.aps.iva.os.b((ConfigDeltaService) c.b(ConfigDeltaService.class), str);
        com.amazon.aps.iva.ye0.b bVar3 = r0.b;
        Gson gsonHolder = GsonHolder.getInstance();
        j.f(bVar3, "ioCoroutineContext");
        j.f(gsonHolder, "gson");
        com.amazon.aps.iva.ms.c cVar = new com.amazon.aps.iva.ms.c(tVar, aVar2, bVar2, mVar, jVar, bVar3, gsonHolder);
        this.b = cVar;
        v<com.amazon.aps.iva.ms.a> vVar = new v<>();
        cVar.d(new C0960b(vVar, this));
        this.c = vVar;
        this.d = new c(cVar, dVar);
    }

    @Override // com.ellation.crunchyroll.application.a
    public final v a() {
        return this.c;
    }

    @Override // com.ellation.crunchyroll.application.a
    public final com.amazon.aps.iva.ys.c b() {
        return this.d;
    }

    @Override // com.ellation.crunchyroll.application.a
    public final com.amazon.aps.iva.ms.a c() {
        return this.b;
    }
}
