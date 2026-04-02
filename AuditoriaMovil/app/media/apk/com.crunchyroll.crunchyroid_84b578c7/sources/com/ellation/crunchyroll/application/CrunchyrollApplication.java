package com.ellation.crunchyroll.application;

import android.app.ActivityManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import bin.mt.signature.KillerApplication;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.g1.o;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.jf0.b0;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.o40.k;
import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.q30.k;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.us.w;
import com.amazon.aps.iva.v90.d;
import com.amazon.aps.iva.x50.v;
import com.amazon.aps.iva.x60.a;
import com.amazon.aps.iva.xw.a0;
import com.amazon.aps.iva.y50.b;
import com.amazon.aps.iva.ya0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yb0.t;
import com.amazon.aps.iva.ys.p;
import com.amazon.aps.iva.ys.r;
import com.amazon.aps.iva.ys.s;
import com.amazon.aps.iva.yw.d0;
import com.amazon.aps.iva.zv.b;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.drm.DrmProxyServiceImpl;
import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.api.etp.OkHttpClientFactory;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.api.etp.index.EtpServiceAvailabilityMonitor;
import com.ellation.crunchyroll.api.etp.staticfiles.StaticFilesService;
import com.ellation.crunchyroll.api.indices.IndicesManager;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor;
import com.ellation.crunchyroll.model.Channel;
import com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageService;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.gson.Gson;
import com.segment.analytics.Analytics;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.android.integrations.appboy.AppboyIntegration;
import com.segment.analytics.integrations.Integration;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
/* compiled from: CrunchyrollApplication.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/application/CrunchyrollApplication;", "Landroid/app/Application;", "Lcom/amazon/aps/iva/ys/h;", "<init>", "()V", "a", "b", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CrunchyrollApplication extends KillerApplication implements com.amazon.aps.iva.ys.h {
    public static CrunchyrollApplication m;
    public static final com.amazon.aps.iva.xe0.d n = z.j();
    public EtpNetworkModule b;
    public com.amazon.aps.iva.q30.f c;
    public p d;
    public com.amazon.aps.iva.bo.g e;
    public com.amazon.aps.iva.x50.c f;
    public com.amazon.aps.iva.gz.b g;
    public d0 h;
    public v i;
    public b j = b.NOT_INITIALIZED;
    public final InitializationEventDispatcher k = new InitializationEventDispatcher();
    public final k l = new k(new com.amazon.aps.iva.o40.e());

    /* compiled from: CrunchyrollApplication.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static CrunchyrollApplication a() {
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
            if (crunchyrollApplication != null) {
                return crunchyrollApplication;
            }
            j.m("instance");
            throw null;
        }
    }

    /* compiled from: CrunchyrollApplication.kt */
    /* loaded from: classes2.dex */
    public enum b {
        INITIALIZED,
        NOT_INITIALIZED,
        INITIALIZING
    }

    /* compiled from: CrunchyrollApplication.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            AnalyticsContext analyticsContext;
            String str2 = str;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            j.e(str2, "token");
            com.amazon.aps.iva.mf0.a.a.a("Device token updated to ".concat(str2), new Object[0]);
            Analytics analytics = com.amazon.aps.iva.ds.c.c;
            if (analytics != null && (analyticsContext = analytics.getAnalyticsContext()) != null) {
                analyticsContext.putDeviceToken(str2);
            }
            return q.a;
        }
    }

    /* compiled from: CrunchyrollApplication.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<String> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            String audioLanguage;
            ProfileApiModel j0 = CrunchyrollApplication.this.b().j0();
            if (j0 == null || (audioLanguage = j0.getAudioLanguage()) == null) {
                return "";
            }
            return audioLanguage;
        }
    }

    /* compiled from: CrunchyrollApplication.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<String> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            String subtitleLanguage;
            ProfileApiModel j0 = CrunchyrollApplication.this.b().j0();
            if (j0 == null || (subtitleLanguage = j0.getSubtitleLanguage()) == null) {
                return "";
            }
            return subtitleLanguage;
        }
    }

    /* compiled from: CrunchyrollApplication.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l<s, q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(s sVar) {
            s sVar2 = sVar;
            j.f(sVar2, "config");
            if (sVar2.a()) {
                a.C0847a c0847a = com.amazon.aps.iva.x60.a.c;
                CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.this;
                com.amazon.aps.iva.x60.a a = c0847a.a(crunchyrollApplication);
                v vVar = crunchyrollApplication.i;
                if (vVar != null) {
                    com.amazon.aps.iva.y60.c cVar = a.b;
                    cVar.getClass();
                    cVar.b.b = vVar;
                } else {
                    j.m("userActivityLogger");
                    throw null;
                }
            }
            return q.a;
        }
    }

    /* compiled from: CrunchyrollApplication.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            if (CrunchyrollApplication.this.b().m0() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: CrunchyrollApplication.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.application.CrunchyrollApplication$onInitializationSuccess$1", f = "CrunchyrollApplication.kt", l = {MediaError.DetailedErrorCode.HLS_NETWORK_PLAYLIST}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        /* compiled from: CrunchyrollApplication.kt */
        /* loaded from: classes2.dex */
        public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
            public static final a h = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final q invoke() {
                w.a.a.b();
                return q.a;
            }
        }

        public h(com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new h(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((h) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.bo.d c = com.amazon.aps.iva.bo.e.c(((d0) com.ellation.crunchyroll.application.e.a()).m, crunchyrollApplication.e().getUserBenefitsSynchronizer(), ((d0) com.ellation.crunchyroll.application.e.a()).c.a, ((d0) com.ellation.crunchyroll.application.e.a()).p.d, crunchyrollApplication.b(), a.h);
                    this.h = 1;
                    Object p = z.p(new com.amazon.aps.iva.bo.c(c, null), this);
                    if (p != obj2) {
                        p = q.a;
                    }
                    if (p != obj2) {
                        p = q.a;
                    }
                    if (p == obj2) {
                        return obj2;
                    }
                }
                crunchyrollApplication.k.notify(com.amazon.aps.iva.ys.k.h);
            } catch (IOException e) {
                if (!crunchyrollApplication.e().getRefreshTokenMonitor().isRefreshTokenInvalid()) {
                    crunchyrollApplication.j = b.NOT_INITIALIZED;
                    InitializationEventDispatcher initializationEventDispatcher = crunchyrollApplication.k;
                    initializationEventDispatcher.getClass();
                    initializationEventDispatcher.notify(new com.amazon.aps.iva.ys.j(e));
                }
            }
            return q.a;
        }
    }

    /* compiled from: CrunchyrollApplication.kt */
    /* loaded from: classes2.dex */
    public static final class i implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public i(c cVar) {
            j.f(cVar, "function");
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    @Override // com.amazon.aps.iva.ys.h
    public final void a(com.amazon.aps.iva.ys.l lVar) {
        j.f(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        InitializationEventDispatcher initializationEventDispatcher = this.k;
        initializationEventDispatcher.getClass();
        initializationEventDispatcher.b.addEventListener(lVar);
    }

    @Override // com.amazon.aps.iva.ys.g
    public final com.amazon.aps.iva.bo.f b() {
        com.amazon.aps.iva.bo.g gVar = this.e;
        if (gVar != null) {
            return gVar;
        }
        j.m("userState");
        throw null;
    }

    @Override // com.amazon.aps.iva.ys.g
    public final com.amazon.aps.iva.x50.a c() {
        com.amazon.aps.iva.x50.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        j.m("applicationState");
        throw null;
    }

    @Override // com.amazon.aps.iva.ys.h
    public final void d(com.amazon.aps.iva.ys.l lVar) {
        j.f(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        InitializationEventDispatcher initializationEventDispatcher = this.k;
        initializationEventDispatcher.getClass();
        initializationEventDispatcher.b.removeEventListener(lVar);
    }

    public final EtpNetworkModule e() {
        EtpNetworkModule etpNetworkModule = this.b;
        if (etpNetworkModule != null) {
            return etpNetworkModule;
        }
        j.m("networkModule");
        throw null;
    }

    public final p f() {
        p pVar = this.d;
        if (pVar != null) {
            return pVar;
        }
        j.m("signOutDelegate");
        throw null;
    }

    public final void g() {
        boolean z;
        boolean z2;
        AnalyticsContext analyticsContext;
        String string = getString(R.string.segment_key);
        if (!com.amazon.aps.iva.us.l.a) {
            if (string != null && string.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                com.amazon.aps.iva.us.g gVar = com.amazon.aps.iva.us.g.h;
                j.f(gVar, "isUserAuthenticated");
                defpackage.i.e = gVar;
                com.amazon.aps.iva.us.h hVar = com.amazon.aps.iva.us.h.h;
                j.f(hVar, "getChannelById");
                com.amazon.aps.iva.e.w.e = hVar;
                com.amazon.aps.iva.us.i iVar = com.amazon.aps.iva.us.i.h;
                j.f(iVar, "getChannelById");
                com.amazon.aps.iva.p4.f.b = iVar;
                com.amazon.aps.iva.vs.d dVar = n.c;
                final com.amazon.aps.iva.ct.k a2 = com.ellation.crunchyroll.application.f.a(null, 3);
                t tVar = new t(a2) { // from class: com.amazon.aps.iva.us.k
                    @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                    public final Object get() {
                        return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).getHasPremiumBenefit());
                    }
                };
                com.amazon.aps.iva.us.j jVar = com.amazon.aps.iva.us.j.h;
                j.f(jVar, "getChannelById");
                dVar.a = jVar;
                dVar.b = tVar;
                com.amazon.aps.iva.hz.b bVar = new com.amazon.aps.iva.hz.b(this);
                com.amazon.aps.iva.gz.b bVar2 = this.g;
                if (bVar2 != null) {
                    com.amazon.aps.iva.bo.f b2 = b();
                    com.amazon.aps.iva.us.z zVar = w.a.a;
                    j.f(zVar, "userSessionAnalytics");
                    com.amazon.aps.iva.fz.k kVar = new com.amazon.aps.iva.fz.k(bVar2, b2, zVar);
                    com.amazon.aps.iva.ct.k a3 = com.ellation.crunchyroll.application.f.a(null, 3);
                    com.amazon.aps.iva.vs.c.b = this;
                    com.amazon.aps.iva.vs.c.c = bVar;
                    com.amazon.aps.iva.vs.c.d = kVar;
                    com.amazon.aps.iva.vs.c.e = a3;
                    Analytics.Builder builder = new Analytics.Builder(this, string);
                    Integration.Factory factory = AppboyIntegration.FACTORY;
                    j.e(factory, "FACTORY");
                    Analytics.Builder use = builder.use(factory);
                    com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
                    if (aVar != null) {
                        Object c2 = aVar.c().c(com.amazon.aps.iva.us.t.class, "singular");
                        if (c2 != null) {
                            if (((com.amazon.aps.iva.us.t) c2).a()) {
                                use.use(com.amazon.aps.iva.kn.d.a);
                            }
                            Analytics.Builder logLevel = use.trackApplicationLifecycleEvents().logLevel(Analytics.LogLevel.DEBUG);
                            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                            j.e(logLevel, "segmentAnalyticsBuilder");
                            com.amazon.aps.iva.ts.b.a.getClass();
                            Map x = com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j("api.segment.io", com.amazon.aps.iva.ts.a.q));
                            if (!x.isEmpty()) {
                                logLevel.connectionFactory(new com.amazon.aps.iva.hs.a(new com.amazon.aps.iva.hs.b(x)));
                            }
                            com.amazon.aps.iva.ds.c.c = logLevel.build();
                            String d2 = com.amazon.aps.iva.iz.a.a.d();
                            if (d2 != null) {
                                if (d2.length() > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    com.amazon.aps.iva.mf0.a.a.a("Device token updated to ".concat(d2), new Object[0]);
                                    Analytics analytics = com.amazon.aps.iva.ds.c.c;
                                    if (analytics != null && (analyticsContext = analytics.getAnalyticsContext()) != null) {
                                        analyticsContext.putDeviceToken(d2);
                                    }
                                }
                            }
                            FirebaseAnalytics.getInstance(this).getAppInstanceId().addOnCompleteListener(new o(cVar, 10));
                            Analytics.setSingletonInstance(com.amazon.aps.iva.ds.c.c);
                            com.amazon.aps.iva.us.l.a = true;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.analytics.SingularConfig");
                        }
                    } else {
                        j.m("instance");
                        throw null;
                    }
                } else {
                    j.m("notificationStateStore");
                    throw null;
                }
            }
        }
        com.amazon.aps.iva.iz.a.a.f(new i(c.h));
    }

    public final void h() {
        InitializationEventDispatcher initializationEventDispatcher = this.k;
        if (initializationEventDispatcher.getListenerCount() > 0) {
            if (e().getRefreshTokenProvider().isRefreshTokenPresent()) {
                com.amazon.aps.iva.se0.i.d(n, null, null, new h(null), 3);
                return;
            }
            initializationEventDispatcher.notify(com.amazon.aps.iva.ys.k.h);
        }
    }

    @Override // com.amazon.aps.iva.ys.h
    public final void initialize() {
        b bVar = this.j;
        if (bVar == b.NOT_INITIALIZED) {
            this.j = b.INITIALIZING;
            e().getJwtInvalidator().onAppInit();
            g();
            ((com.amazon.aps.iva.x50.c) c()).d(f1.J(new Channel(DrmProxyServiceImpl.ACCOUNTING_ID, null, "Crunchyroll", 2, null)));
            this.j = b.INITIALIZED;
            h();
        } else if (bVar == b.INITIALIZED) {
            h();
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        ActivityManager activityManager;
        String str;
        com.amazon.aps.iva.ag.b eVar;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        super.onCreate();
        m = this;
        FirebaseApp.initializeApp(this);
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        com.amazon.aps.iva.y50.b bVar = com.amazon.aps.iva.y50.b.a;
        c0515a.n(new com.amazon.aps.iva.x50.d());
        c0515a.a("APP onCreate", new Object[0]);
        com.amazon.aps.iva.gy.t.c = bVar;
        com.amazon.aps.iva.y50.c cVar = new com.amazon.aps.iva.y50.c(this);
        com.amazon.aps.iva.y50.a aVar = com.amazon.aps.iva.gy.t.c;
        if (aVar != null) {
            aVar.a("Play Services Version Code", String.valueOf(cVar.a));
            com.amazon.aps.iva.y50.a aVar2 = com.amazon.aps.iva.gy.t.c;
            if (aVar2 != null) {
                aVar2.a("Play Services Version Name", cVar.b);
                com.amazon.aps.iva.y50.a aVar3 = com.amazon.aps.iva.gy.t.c;
                if (aVar3 != null) {
                    int myPid = Process.myPid();
                    Object systemService = getSystemService("activity");
                    if (systemService instanceof ActivityManager) {
                        activityManager = (ActivityManager) systemService;
                    } else {
                        activityManager = null;
                    }
                    if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        str = "";
                    } else {
                        str = "";
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.pid == myPid) {
                                str = runningAppProcessInfo.processName;
                                j.e(str, "processInfo.processName");
                            }
                        }
                    }
                    aVar3.a("System Process", str);
                    com.amazon.aps.iva.ts.b.a.getClass();
                    String str2 = com.amazon.aps.iva.ts.a.e;
                    j.f(str2, "environment");
                    this.e = new com.amazon.aps.iva.bo.g(this, str2);
                    this.f = new com.amazon.aps.iva.x50.c(this);
                    SharedPreferences sharedPreferences = getSharedPreferences("notification_state_store", 0);
                    j.e(sharedPreferences, "getSharedPreferences(\"no…ate_store\", MODE_PRIVATE)");
                    this.g = new com.amazon.aps.iva.gz.b(sharedPreferences);
                    com.amazon.aps.iva.fz.f.c = this;
                    com.amazon.aps.iva.i5.v<String> vVar = com.amazon.aps.iva.iz.a.a;
                    FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new com.amazon.aps.iva.q5.z(11));
                    OkHttpClientFactory.Companion companion = OkHttpClientFactory.Companion;
                    File cacheDir = getCacheDir();
                    j.e(cacheDir, "cacheDir");
                    OkHttpClientFactory create = companion.create(cacheDir, com.amazon.aps.iva.ts.b.c);
                    com.amazon.aps.iva.ag.c.a.getClass();
                    m mVar = com.amazon.aps.iva.ag.c.c;
                    create.setDataDogInterceptor(((com.amazon.aps.iva.ag.a) mVar.getValue()).a);
                    create.setDataDogEventListenerFactory(((com.amazon.aps.iva.ag.a) mVar.getValue()).b);
                    b.a.a = this;
                    this.b = EtpNetworkModule.Companion.create(create);
                    IndicesManager.Companion.create(e().getJwtInvalidator(), AppLifecycleImpl.c).init();
                    com.amazon.aps.iva.uy.a aVar4 = com.amazon.aps.iva.uy.a.a;
                    com.amazon.aps.iva.uy.a.b = f.a.a(this, GsonHolder.getInstance());
                    SharedPreferences sharedPreferences2 = getSharedPreferences(str2 + "_localizations", 0);
                    j.e(sharedPreferences2, "sharedPreferences");
                    Gson gsonHolder = GsonHolder.getInstance();
                    j.f(gsonHolder, "gson");
                    com.amazon.aps.iva.o60.h hVar = new com.amazon.aps.iva.o60.h(gsonHolder, sharedPreferences2);
                    com.amazon.aps.iva.p60.g gVar = com.amazon.aps.iva.uy.a.b;
                    if (gVar != null) {
                        com.amazon.aps.iva.o60.d.b = new com.amazon.aps.iva.t60.a(new com.amazon.aps.iva.o60.c(hVar, gVar), gVar);
                        LinkedHashMap linkedHashMap = com.amazon.aps.iva.v90.a.a;
                        com.amazon.aps.iva.t60.a aVar5 = com.amazon.aps.iva.o60.d.b;
                        if (aVar5 != null) {
                            d.b bVar2 = com.amazon.aps.iva.v90.d.b;
                            com.amazon.aps.iva.v90.a.b = aVar5;
                            com.amazon.aps.iva.v90.a.c = bVar2;
                            com.amazon.aps.iva.v90.a.a.clear();
                            com.amazon.aps.iva.ya0.e.f.getClass();
                            e.a aVar6 = new e.a();
                            com.amazon.aps.iva.v90.c cVar2 = com.amazon.aps.iva.v90.c.a;
                            ArrayList arrayList = aVar6.a;
                            arrayList.add(cVar2);
                            com.amazon.aps.iva.ya0.e.e = new com.amazon.aps.iva.ya0.e(com.amazon.aps.iva.lb0.x.X0(arrayList), aVar6.b, aVar6.c);
                            String str3 = com.amazon.aps.iva.ts.a.k;
                            String f2 = com.amazon.aps.iva.c80.a.f(str3, "/i18n/etp-android-app/");
                            OkHttpClient build = create.newClientBuilder(new Interceptor[0]).build();
                            b0.b bVar3 = new b0.b();
                            bVar3.b(f2);
                            bVar3.d(build);
                            com.amazon.aps.iva.s60.c cVar3 = (com.amazon.aps.iva.s60.c) bVar3.c().b(com.amazon.aps.iva.s60.c.class);
                            com.amazon.aps.iva.o60.j jVar = new com.amazon.aps.iva.o60.j();
                            j.f(cVar3, "translationsService");
                            com.amazon.aps.iva.s60.b bVar4 = new com.amazon.aps.iva.s60.b(cVar3, jVar);
                            com.amazon.aps.iva.p60.g gVar2 = com.amazon.aps.iva.uy.a.b;
                            if (gVar2 != null) {
                                com.amazon.aps.iva.o60.i iVar = new com.amazon.aps.iva.o60.i(bVar4, hVar, gVar2, com.amazon.aps.iva.wu.b.a);
                                com.amazon.aps.iva.uy.a.c = iVar;
                                iVar.b();
                                OkHttpClient build2 = create.newClientBuilder(new Interceptor[0]).build();
                                j.f(str3, "endpoint");
                                j.f(build2, "okHttpClient");
                                com.amazon.aps.iva.lh.f.a = new com.amazon.aps.iva.lh.c(this, GsonHolder.getInstance(), new com.amazon.aps.iva.lh.d(this), new com.amazon.aps.iva.lh.e(this));
                                b0.b bVar5 = new b0.b();
                                bVar5.b(str3);
                                bVar5.b = build2;
                                StaticFilesService staticFilesService = (StaticFilesService) bVar5.c().b(StaticFilesService.class);
                                com.amazon.aps.iva.lh.c cVar4 = com.amazon.aps.iva.lh.f.a;
                                if (cVar4 != null) {
                                    j.f(staticFilesService, "staticFilesService");
                                    new com.amazon.aps.iva.jh.k(staticFilesService, cVar4, "/config/i18n/v3/timed_text_languages.json", "/config/i18n/v3/language_fallback_mapping.json").a();
                                    com.amazon.aps.iva.lh.c cVar5 = com.amazon.aps.iva.lh.f.a;
                                    if (cVar5 != null) {
                                        com.amazon.aps.iva.lh.f.b = new com.amazon.aps.iva.k.w((com.amazon.aps.iva.jh.i) cVar5);
                                        OkHttpClient build3 = create.newClientBuilder(new Interceptor[0]).build();
                                        j.f(build3, "okHttpClient");
                                        com.amazon.aps.iva.kh.d dVar = new com.amazon.aps.iva.kh.d();
                                        dVar.a = new com.amazon.aps.iva.kh.a(this, GsonHolder.getInstance(), new com.amazon.aps.iva.kh.b(this), com.amazon.aps.iva.kh.c.h);
                                        b0.b bVar6 = new b0.b();
                                        bVar6.b(str3);
                                        bVar6.b = build3;
                                        StaticFilesService staticFilesService2 = (StaticFilesService) bVar6.c().b(StaticFilesService.class);
                                        com.amazon.aps.iva.jh.i b2 = dVar.b();
                                        j.f(staticFilesService2, "staticFilesService");
                                        new com.amazon.aps.iva.jh.k(staticFilesService2, b2, "/config/i18n/v3/audio_languages.json", "").a();
                                        com.amazon.aps.iva.gy.t.a = dVar;
                                        com.amazon.aps.iva.x50.p pVar = new com.amazon.aps.iva.x50.p();
                                        registerActivityLifecycleCallbacks(pVar);
                                        AccountApiModel m0 = ((com.amazon.aps.iva.bo.g) b()).m0();
                                        SharedPreferences sharedPreferences3 = getSharedPreferences("player_settings_store_".concat((m0 == null || (r2 = m0.getGuid()) == null) ? "anonymous" : "anonymous"), 0);
                                        j.e(sharedPreferences3, "context.getSharedPrefere…PRIVATE\n                )");
                                        com.amazon.aps.iva.ql.g.g = new com.amazon.aps.iva.ql.g(sharedPreferences3);
                                        MediaLanguageService.Companion companion2 = MediaLanguageService.Companion;
                                        com.amazon.aps.iva.ya0.f a2 = com.amazon.aps.iva.o60.e.a(this);
                                        d dVar2 = new d();
                                        e eVar2 = new e();
                                        com.amazon.aps.iva.kh.d dVar3 = com.amazon.aps.iva.gy.t.a;
                                        if (dVar3 != null) {
                                            companion2.init(a2, dVar2, eVar2, dVar3.a(this), com.amazon.aps.iva.lh.f.a(this));
                                            this.h = new d0(com.amazon.aps.iva.o60.e.a(this), b(), c(), e(), pVar);
                                            g();
                                            this.c = new com.amazon.aps.iva.q30.f(k.a.a());
                                            com.amazon.aps.iva.bo.f b3 = b();
                                            com.amazon.aps.iva.ct.l userBenefitsSynchronizer = e().getUserBenefitsSynchronizer();
                                            d0 d0Var = this.h;
                                            if (d0Var != null) {
                                                com.amazon.aps.iva.ve.m mVar2 = d0Var.p.d;
                                                EtpIndexProvider etpIndexProvider = e().getEtpIndexProvider();
                                                com.amazon.aps.iva.sv.h hVar2 = h.a.a;
                                                if (hVar2 != null) {
                                                    com.amazon.aps.iva.sv.k c2 = hVar2.c();
                                                    com.amazon.aps.iva.q30.f fVar = this.c;
                                                    if (fVar != null) {
                                                        com.amazon.aps.iva.m30.b bVar7 = com.amazon.aps.iva.m30.b.a;
                                                        com.ellation.crunchyroll.application.a aVar7 = a.C0959a.a;
                                                        if (aVar7 != null) {
                                                            com.amazon.aps.iva.ys.c b4 = aVar7.b();
                                                            com.amazon.aps.iva.ds.c cVar6 = com.amazon.aps.iva.ds.c.b;
                                                            com.amazon.aps.iva.us.z zVar = w.a.a;
                                                            ChromecastUserStatusInteractor create2 = ChromecastUserStatusInteractor.Companion.create();
                                                            com.amazon.aps.iva.oz.a aVar8 = com.amazon.aps.iva.oz.a.a;
                                                            com.amazon.aps.iva.zg.d i2 = ((d0) com.ellation.crunchyroll.application.e.a()).e.i();
                                                            com.amazon.aps.iva.rd.g gVar3 = ((d0) com.ellation.crunchyroll.application.e.a()).u.b;
                                                            com.amazon.aps.iva.a0.k kVar = ((d0) com.ellation.crunchyroll.application.e.a()).B.b;
                                                            j.f(userBenefitsSynchronizer, "userBenefitsSynchronizer");
                                                            j.f(mVar2, "userBillingStatusSynchronizer");
                                                            j.f(etpIndexProvider, "etpIndexProvider");
                                                            j.f(c2, "downloadsAgent");
                                                            j.f(b4, "appConfigUpdater");
                                                            j.f(zVar, "userSessionAnalytics");
                                                            j.f(create2, "chromecastUserStatusInteractor");
                                                            j.f(i2, "tokenActionsHandler");
                                                            j.f(gVar3, "widgetsUpdateAgent");
                                                            j.f(kVar, "crStoreAuthHandler");
                                                            this.d = new p(b3, userBenefitsSynchronizer, mVar2, etpIndexProvider, c2, fVar, b4, cVar6, zVar, create2, i2, gVar3, kVar);
                                                            com.amazon.aps.iva.zs.c cVar7 = new com.amazon.aps.iva.zs.c(pVar);
                                                            RefreshTokenMonitor refreshTokenMonitor = e().getRefreshTokenMonitor();
                                                            j.f(refreshTokenMonitor, "refreshTokenMonitor");
                                                            com.amazon.aps.iva.zs.a aVar9 = new com.amazon.aps.iva.zs.a(cVar7, refreshTokenMonitor);
                                                            androidx.lifecycle.m mVar3 = androidx.lifecycle.m.j;
                                                            com.ellation.crunchyroll.mvp.lifecycle.a.a(aVar9, mVar3);
                                                            com.ellation.crunchyroll.presentation.update.a aVar10 = new com.ellation.crunchyroll.presentation.update.a(pVar);
                                                            com.amazon.aps.iva.z40.c inactiveClientMonitor = e().getInactiveClientMonitor();
                                                            j.f(inactiveClientMonitor, "inactiveClientMonitor");
                                                            new com.amazon.aps.iva.z40.a(aVar10, inactiveClientMonitor).onCreate();
                                                            com.ellation.crunchyroll.presentation.availability.a aVar11 = new com.ellation.crunchyroll.presentation.availability.a(pVar);
                                                            EtpServiceAvailabilityMonitor etpServiceMonitor = e().getEtpServiceMonitor();
                                                            j.f(etpServiceMonitor, "serviceAvailabilityMonitor");
                                                            new com.amazon.aps.iva.rz.a(aVar11, etpServiceMonitor).onCreate();
                                                            String string = getResources().getString(R.string.datadog_token);
                                                            j.e(string, "resources.getString(R.string.datadog_token)");
                                                            String string2 = getResources().getString(R.string.datadog_application_id);
                                                            j.e(string2, "resources.getString(R.st…g.datadog_application_id)");
                                                            boolean z = true ^ getSharedPreferences("USER_CONSENT", 0).getBoolean("IS_CONSENT_TO_ALL_PURPOSES", true);
                                                            com.amazon.aps.iva.ts.a aVar12 = com.amazon.aps.iva.ts.b.a;
                                                            com.ellation.crunchyroll.application.a aVar13 = a.C0959a.a;
                                                            if (aVar13 != null) {
                                                                Object c3 = aVar13.c().c(com.amazon.aps.iva.cx.g.class, "datadog");
                                                                if (c3 != null) {
                                                                    com.amazon.aps.iva.cx.g gVar4 = (com.amazon.aps.iva.cx.g) c3;
                                                                    if (gVar4.c()) {
                                                                        eVar = new com.amazon.aps.iva.ag.d(this, string, string2, z, str2, gVar4.a(), gVar4.b());
                                                                    } else {
                                                                        eVar = new com.amazon.aps.iva.ag.e();
                                                                    }
                                                                    com.amazon.aps.iva.ag.c.b = eVar;
                                                                    com.amazon.aps.iva.mf0.a.a.n(((com.amazon.aps.iva.ag.a) mVar.getValue()).c);
                                                                    new b.c("Locale", Locale.getDefault().toLanguageTag()).invoke();
                                                                    com.amazon.aps.iva.uy.a.a.getClass();
                                                                    new b.c("Locale Fallback", com.amazon.aps.iva.uy.a.a().toLanguageTag()).invoke();
                                                                    com.ellation.crunchyroll.application.a aVar14 = a.C0959a.a;
                                                                    if (aVar14 != null) {
                                                                        aVar14.a().f(new com.amazon.aps.iva.ys.b(new com.amazon.aps.iva.ys.a(eVar)));
                                                                        this.i = new v();
                                                                        com.amazon.aps.iva.x60.a a3 = com.amazon.aps.iva.x60.a.c.a(this);
                                                                        v vVar2 = this.i;
                                                                        if (vVar2 != null) {
                                                                            a3.a = vVar2;
                                                                            androidx.lifecycle.m mVar4 = androidx.lifecycle.m.j;
                                                                            f fVar2 = new f();
                                                                            com.ellation.crunchyroll.application.a aVar15 = a.C0959a.a;
                                                                            if (aVar15 != null) {
                                                                                com.amazon.aps.iva.xw.b0.b(aVar15.a(), mVar3, a0.h, new r(fVar2));
                                                                                CookieHandler.setDefault(new com.amazon.aps.iva.ys.i());
                                                                                com.amazon.aps.iva.pm.e b5 = ((d0) com.ellation.crunchyroll.application.e.a()).c.b();
                                                                                com.amazon.aps.iva.pm.c cVar8 = ((d0) com.ellation.crunchyroll.application.e.a()).c.a;
                                                                                g gVar5 = new g();
                                                                                j.f(b5, "userProfileProvider");
                                                                                j.f(cVar8, "userProfileInteractor");
                                                                                if (com.amazon.aps.iva.aq.j.a == null) {
                                                                                    androidx.lifecycle.m mVar5 = androidx.lifecycle.m.j;
                                                                                    com.amazon.aps.iva.lh.c cVar9 = com.amazon.aps.iva.lh.f.a;
                                                                                    if (cVar9 != null) {
                                                                                        com.amazon.aps.iva.kh.d dVar4 = com.amazon.aps.iva.gy.t.a;
                                                                                        if (dVar4 != null) {
                                                                                            com.amazon.aps.iva.jh.i b6 = dVar4.b();
                                                                                            com.amazon.aps.iva.ql.g gVar6 = com.amazon.aps.iva.ql.g.g;
                                                                                            if (gVar6 != null) {
                                                                                                com.amazon.aps.iva.aq.j.a = new com.amazon.aps.iva.ql.i(b5, mVar3, gVar5, cVar9, b6, gVar6, z.j(), cVar8);
                                                                                                return;
                                                                                            } else {
                                                                                                j.m("instance");
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        j.m("instance");
                                                                                        throw null;
                                                                                    }
                                                                                    j.m("store");
                                                                                    throw null;
                                                                                }
                                                                                throw new IllegalStateException("Synchronizer is already initialized!");
                                                                            }
                                                                            j.m("instance");
                                                                            throw null;
                                                                        }
                                                                        j.m("userActivityLogger");
                                                                        throw null;
                                                                    }
                                                                    j.m("instance");
                                                                    throw null;
                                                                }
                                                                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.DatadogConfigImpl");
                                                            }
                                                            j.m("instance");
                                                            throw null;
                                                        }
                                                        j.m("instance");
                                                        throw null;
                                                    }
                                                    j.m("recentSearchesAgent");
                                                    throw null;
                                                }
                                                j.m("instance");
                                                throw null;
                                            }
                                            j.m("featuresProvider");
                                            throw null;
                                        }
                                        j.m("instance");
                                        throw null;
                                    }
                                    j.m("store");
                                    throw null;
                                }
                                j.m("store");
                                throw null;
                            }
                            j.m("localeProvider");
                            throw null;
                        }
                        j.m("repositoryFactory");
                        throw null;
                    }
                    j.m("localeProvider");
                    throw null;
                }
                j.m("crashlytics");
                throw null;
            }
            j.m("crashlytics");
            throw null;
        }
        j.m("crashlytics");
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startForegroundService(Intent intent) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                return super.startForegroundService(intent);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                return null;
            }
        }
        return super.startForegroundService(intent);
    }
}
