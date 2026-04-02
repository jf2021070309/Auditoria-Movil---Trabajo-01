package e.j.d;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.AdValue;
import e.j.a.b;
import e.j.d.b0.a.a;
import e.j.d.c0.b0;
import e.j.d.c0.z;
import i.a.e0;
import i.a.o0;
import i.a.z0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import org.slf4j.Logger;
/* loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ h.r.f<Object>[] a;

    /* renamed from: b  reason: collision with root package name */
    public final Application f8524b;

    /* renamed from: c  reason: collision with root package name */
    public final e.j.d.y.b f8525c;

    /* renamed from: d  reason: collision with root package name */
    public final i f8526d;

    /* renamed from: e  reason: collision with root package name */
    public final e.j.d.z.d f8527e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8528f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8529g;

    /* renamed from: h  reason: collision with root package name */
    public String f8530h;

    /* renamed from: i  reason: collision with root package name */
    public String f8531i;

    /* loaded from: classes2.dex */
    public enum a {
        DIALOG("dialog"),
        IN_APP_REVIEW("in_app_review");
        
        private final String value;

        a(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* renamed from: e.j.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0185b {
        UNKNOWN("unknown"),
        HOLD("hold"),
        RECOVERED("recovered"),
        CANCELLED("cancelled");
        
        private final String value;

        EnumC0185b(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.Analytics$onAppOpened$1", f = "Analytics.kt", l = {449}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public int f8532b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ z f8534d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z zVar, h.m.d<? super c> dVar) {
            super(2, dVar);
            this.f8534d = zVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new c(this.f8534d, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
            return new c(this.f8534d, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.f8532b;
            if (i2 == 0) {
                w.E0(obj);
                b bVar2 = b.this;
                z zVar = this.f8534d;
                this.a = bVar2;
                this.f8532b = 1;
                Objects.requireNonNull(zVar);
                Object J0 = w.J0(o0.f9155b, new e.j.d.c0.x(zVar, null), this);
                if (J0 == aVar) {
                    return aVar;
                }
                bVar = bVar2;
                obj = J0;
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                bVar = (b) this.a;
                w.E0(obj);
            }
            String str = (String) obj;
            Objects.requireNonNull(bVar);
            h.o.c.j.e(str, "installReferrer");
            if (str.length() == 0) {
                str = "not_set";
            }
            bVar.o("Install", c.i.a.e(new h.f("source", str)));
            return h.k.a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends e.j.d.c0.d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ z f8535b;

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.Analytics$onAppOpened$2$onActivityResumed$1", f = "Analytics.kt", l = {466}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
            public Object a;

            /* renamed from: b  reason: collision with root package name */
            public Object f8536b;

            /* renamed from: c  reason: collision with root package name */
            public int f8537c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ b f8538d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ String f8539e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ z f8540f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, String str, z zVar, h.m.d<? super a> dVar) {
                super(2, dVar);
                this.f8538d = bVar;
                this.f8539e = str;
                this.f8540f = zVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new a(this.f8538d, this.f8539e, this.f8540f, dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
                return new a(this.f8538d, this.f8539e, this.f8540f, dVar).invokeSuspend(h.k.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
                if (r0 == null) goto L19;
             */
            @Override // h.m.i.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 222
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e.j.d.b.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(z zVar) {
            this.f8535b = zVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
            if (r0 == null) goto L20;
         */
        @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onActivityResumed(android.app.Activity r13) {
            /*
                r12 = this;
                java.lang.String r0 = "activity"
                h.o.c.j.e(r13, r0)
                android.content.Intent r0 = r13.getIntent()
                r1 = 0
                java.lang.String r2 = "shortcut"
                java.lang.String r3 = "widget"
                java.lang.String r4 = "notification"
                r5 = 0
                if (r0 != 0) goto L14
                goto L2f
            L14:
                boolean r6 = r0.getBooleanExtra(r4, r5)
                if (r6 == 0) goto L1c
                r0 = r4
                goto L2d
            L1c:
                boolean r6 = r0.getBooleanExtra(r3, r5)
                if (r6 == 0) goto L24
                r0 = r3
                goto L2d
            L24:
                boolean r0 = r0.getBooleanExtra(r2, r5)
                if (r0 == 0) goto L2c
                r0 = r2
                goto L2d
            L2c:
                r0 = r1
            L2d:
                if (r0 != 0) goto L31
            L2f:
                java.lang.String r0 = "launcher"
            L31:
                i.a.z0 r6 = i.a.z0.a
                r7 = 0
                r8 = 0
                e.j.d.b$d$a r9 = new e.j.d.b$d$a
                e.j.d.b r10 = e.j.d.b.this
                e.j.d.c0.z r11 = r12.f8535b
                r9.<init>(r10, r0, r11, r1)
                r10 = 3
                r11 = 0
                e.j.d.w.Y(r6, r7, r8, r9, r10, r11)
                android.content.Intent r13 = r13.getIntent()
                if (r13 != 0) goto L4a
                goto L53
            L4a:
                r13.putExtra(r4, r5)
                r13.putExtra(r3, r5)
                r13.putExtra(r2, r5)
            L53:
                e.j.d.b r13 = e.j.d.b.this
                android.app.Application r13 = r13.f8524b
                r13.unregisterActivityLifecycleCallbacks(r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j.d.b.d.onActivityResumed(android.app.Activity):void");
        }
    }

    static {
        h.o.c.n nVar = new h.o.c.n(b.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(h.o.c.r.a);
        a = new h.r.f[]{nVar};
    }

    public b(Application application, e.j.d.y.b bVar, i iVar) {
        h.o.c.j.e(application, "application");
        h.o.c.j.e(bVar, "configuration");
        h.o.c.j.e(iVar, "preferences");
        this.f8524b = application;
        this.f8525c = bVar;
        this.f8526d = iVar;
        this.f8527e = new e.j.d.z.d(null);
        this.f8529g = true;
        this.f8530h = "";
        this.f8531i = "";
        new HashMap();
    }

    public static /* synthetic */ void e(b bVar, b.a aVar, String str, int i2) {
        int i3 = i2 & 2;
        bVar.d(aVar, null);
    }

    public static /* synthetic */ void g(b bVar, b.a aVar, String str, int i2) {
        int i3 = i2 & 2;
        bVar.f(aVar, null);
    }

    public final e.j.b.i.b a(String str, boolean z, Bundle... bundleArr) {
        e.j.b.i.b bVar = new e.j.b.i.b(str, z);
        bVar.b("days_since_install", Integer.valueOf(b0.g(this.f8524b)));
        bVar.f8519d.add(new e.j.b.i.a(bVar.a, "occurrence", 2));
        int length = bundleArr.length;
        int i2 = 0;
        while (i2 < length) {
            Bundle bundle = bundleArr[i2];
            i2++;
            Bundle bundle2 = bVar.f8518c;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            bundle2.putAll(bundle);
        }
        h.o.c.j.d(bVar, "event");
        return bVar;
    }

    public final e.j.b.i.b b(String str, Bundle... bundleArr) {
        return a(str, true, (Bundle[]) Arrays.copyOf(bundleArr, bundleArr.length));
    }

    public final e.j.d.z.c c() {
        return this.f8527e.a(this, a[0]);
    }

    public final void d(b.a aVar, String str) {
        h.o.c.j.e(aVar, "type");
        try {
            e.j.b.i.b b2 = b("Ad_clicked", new Bundle[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("occurrence_");
            String name = aVar.name();
            Locale locale = Locale.ROOT;
            h.o.c.j.d(locale, Logger.ROOT_LOGGER_NAME);
            String lowerCase = name.toLowerCase(locale);
            h.o.c.j.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("_clicked");
            b2.a(sb.toString(), 2);
            String name2 = aVar.name();
            h.o.c.j.d(locale, Logger.ROOT_LOGGER_NAME);
            String lowerCase2 = name2.toLowerCase(locale);
            h.o.c.j.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            b2.f8518c.putString("type", lowerCase2);
            if (str != null) {
                b2.f8518c.putString("source", str);
            }
            e.j.b.b.a.c(b2);
        } catch (Throwable th) {
            c().k(6, th, null, new Object[0]);
        }
    }

    public final void f(b.a aVar, String str) {
        h.o.c.j.e(aVar, "type");
        try {
            e.j.b.i.b b2 = b("Ad_shown", new Bundle[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("occurrence_");
            String name = aVar.name();
            Locale locale = Locale.ROOT;
            h.o.c.j.d(locale, Logger.ROOT_LOGGER_NAME);
            String lowerCase = name.toLowerCase(locale);
            h.o.c.j.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("_shown");
            b2.a(sb.toString(), 2);
            String name2 = aVar.name();
            h.o.c.j.d(locale, Logger.ROOT_LOGGER_NAME);
            String lowerCase2 = name2.toLowerCase(locale);
            h.o.c.j.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            b2.f8518c.putString("type", lowerCase2);
            if (str != null) {
                b2.f8518c.putString("source", str);
            }
            e.j.b.b.a.c(b2);
        } catch (Throwable th) {
            c().k(6, th, null, new Object[0]);
        }
    }

    public final void h(z zVar) {
        h.o.c.j.e(zVar, "installReferrer");
        if (this.f8526d.i()) {
            Application application = this.f8524b;
            h.o.c.j.e(application, CoreConstants.CONTEXT_SCOPE_VALUE);
            boolean z = false;
            try {
                PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                    z = true;
                }
            } catch (Throwable unused) {
            }
            if (!z) {
                w.Y(z0.a, null, null, new c(zVar, null), 3, null);
            }
        }
        this.f8524b.registerActivityLifecycleCallbacks(new d(zVar));
    }

    public final void i(a.EnumC0186a enumC0186a) {
        h.o.c.j.e(enumC0186a, "happyMomentRateMode");
        o("Happy_Moment", c.i.a.e(new h.f("happy_moment", enumC0186a.name())));
    }

    public final void j(String str, AdValue adValue, String str2) {
        h.o.c.j.e(str, "adUnitId");
        h.o.c.j.e(adValue, "adValue");
        h.f[] fVarArr = new h.f[6];
        fVarArr[0] = new h.f("valuemicros", Long.valueOf(adValue.getValueMicros()));
        fVarArr[1] = new h.f("value", Float.valueOf(((float) adValue.getValueMicros()) / 1000000.0f));
        fVarArr[2] = new h.f(AppLovinEventParameters.REVENUE_CURRENCY, adValue.getCurrencyCode());
        fVarArr[3] = new h.f("precision", Integer.valueOf(adValue.getPrecisionType()));
        fVarArr[4] = new h.f("adunitid", str);
        if (str2 == null) {
            str2 = "unknown";
        }
        fVarArr[5] = new h.f("network", str2);
        n(a("paid_ad_impression", false, c.i.a.e(fVarArr)));
    }

    public final void k(String str, String str2) {
        h.o.c.j.e(str, "source");
        h.o.c.j.e(str2, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        this.f8530h = str;
        o("Purchase_started", c.i.a.e(new h.f("offer", str), new h.f(AppLovinEventParameters.PRODUCT_IDENTIFIER, str2)));
    }

    public final void l(String str) {
        h.o.c.j.e(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        o("Purchase_success", c.i.a.e(new h.f("offer", this.f8530h), new h.f(AppLovinEventParameters.PRODUCT_IDENTIFIER, str)));
    }

    public final void m(a aVar) {
        h.o.c.j.e(aVar, "type");
        o("Rate_us_shown", c.i.a.e(new h.f("type", aVar.getValue())));
    }

    public final void n(e.j.b.i.b bVar) {
        h.o.c.j.e(bVar, "event");
        try {
            e.j.b.b.a.c(bVar);
        } catch (Throwable th) {
            c().k(6, th, null, new Object[0]);
        }
    }

    public final void o(String str, Bundle... bundleArr) {
        h.o.c.j.e(str, "name");
        h.o.c.j.e(bundleArr, "params");
        n(b(str, (Bundle[]) Arrays.copyOf(bundleArr, bundleArr.length)));
    }
}
