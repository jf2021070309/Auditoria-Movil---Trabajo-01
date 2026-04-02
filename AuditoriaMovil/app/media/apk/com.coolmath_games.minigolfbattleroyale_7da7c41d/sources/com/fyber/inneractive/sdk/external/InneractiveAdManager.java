package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewTreeObserver;
import com.appsflyer.AppsFlyerProperties;
import com.fyber.inneractive.sdk.b;
import com.fyber.inneractive.sdk.c.b;
import com.fyber.inneractive.sdk.c.c;
import com.fyber.inneractive.sdk.c.d;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.config.j;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.h.m;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.j.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.af;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.t;
import com.fyber.inneractive.sdk.util.w;
import java.lang.Thread;
/* loaded from: classes.dex */
public final class InneractiveAdManager implements j.a {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";
    private static IAConfigManager.OnConfigurationReadyAndValidListener b;
    private static int d;
    String a;
    private volatile Context c;

    /* loaded from: classes.dex */
    public enum GdprConsentSource {
        Internal,
        External
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static String getVersion() {
        return "7.8.4";
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    /* synthetic */ InneractiveAdManager(byte b2) {
        this();
    }

    static /* synthetic */ IAConfigManager.OnConfigurationReadyAndValidListener a() {
        b = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private static volatile InneractiveAdManager a = new InneractiveAdManager((byte) 0);
    }

    private InneractiveAdManager() {
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    public static void initialize(final Context context, String str, final OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        final t tVar;
        if (context == null || str == null) {
            IAlog.e("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            Object[] objArr = new Object[1];
            objArr[0] = str == null ? AppsFlyerProperties.APP_ID : "context";
            b(onFyberMarketplaceInitializedListener, (str == null || TextUtils.isEmpty(str.trim())) ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, String.format("%s is null", objArr));
            return;
        }
        boolean z = (IAConfigManager.p() == null || IAConfigManager.p().equalsIgnoreCase(str)) ? false : true;
        if (a.a.c != null && !z) {
            IAlog.b("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
            b(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            return;
        }
        IAlog.a(context);
        l.a((Application) context.getApplicationContext());
        tVar = t.a.a;
        Context applicationContext = context.getApplicationContext();
        IAlog.b("%sinit called", IAlog.a(tVar));
        tVar.c = applicationContext;
        tVar.d = new BroadcastReceiver() { // from class: com.fyber.inneractive.sdk.util.t.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                IAlog.b("%sonReceive. action = %s", IAlog.a(tVar), intent.getAction());
                tVar.a(context2, intent);
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        tVar.c.registerReceiver(tVar.d, intentFilter);
        Intent intent = new Intent();
        intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
        intent.setPackage(k.f());
        int a2 = b.a(context.getApplicationContext(), intent);
        d = a2;
        if (a2 == 0) {
            IAlog.e("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
            b(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
            return;
        }
        IAConfigManager.OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener = new IAConfigManager.OnConfigurationReadyAndValidListener() { // from class: com.fyber.inneractive.sdk.external.InneractiveAdManager.1
            @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
            public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z2, Exception exc) {
                if (context.getApplicationContext() != null) {
                    IAConfigManager.removeListener(this);
                    InneractiveAdManager.a();
                    if (z2) {
                        InneractiveAdManager.b(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
                    } else {
                        InneractiveAdManager.b(onFyberMarketplaceInitializedListener, exc instanceof InvalidAppIdException ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc.getLocalizedMessage());
                    }
                }
            }
        };
        b = onConfigurationReadyAndValidListener;
        IAConfigManager.addListener(onConfigurationReadyAndValidListener);
        if (z) {
            IAConfigManager.c(str);
            IAConfigManager.i();
        } else {
            IAConfigManager.a(context.getApplicationContext(), str, "Android", "7.8.4");
        }
        a.a.c = context.getApplicationContext();
        final SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
        String string = sharedPreferences.getString("FyberExceptionKey", "empty");
        String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
        String string3 = sharedPreferences.getString("FyberNameKey", "empty");
        String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
        IAlog.b(" name- %s   description - %s exception - %s", string3, string2, string);
        if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
            IAlog.b("Firing Event 999 for %s", string);
            n.a aVar = new n.a(m.IA_UNCAUGHT_EXCEPTION);
            aVar.a(new n.b().a("exception_name", string3).a("description", string2).a("stack_trace", string));
            aVar.b(string4);
            sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove("FyberNameKey").apply();
        }
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.fyber.inneractive.sdk.external.InneractiveAdManager.2
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                l.a(th, sharedPreferences);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
        IAConfigManager.c().b(a.a);
        IAConfigManager.c().a(a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (a.a.c == null || fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        n.a aVar = new n.a(com.fyber.inneractive.sdk.h.l.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (e) null);
        if (!TextUtils.isEmpty(str)) {
            aVar.a("message", str);
        }
        aVar.a("init_status", fyberInitStatus.name());
        aVar.b(null);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.m().a = onGlobalImpressionDataListener;
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.m().a = null;
    }

    public static void destroy() {
        t tVar;
        IAlog.b("InneractiveAdManager:destroy called", new Object[0]);
        if (a.a.c == null) {
            IAlog.b("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        a.a.c = null;
        IAConfigManager.removeListener(b);
        b = null;
        IAConfigManager.m().a = null;
        af.a();
        IAConfigManager.a();
        w a2 = w.a();
        a2.c.clear();
        for (Context context : a2.b.keySet()) {
            Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener> pair = a2.b.get(context);
            if (((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        a2.b.clear();
        tVar = t.a.a;
        tVar.a();
        c.a.a.a.clear();
        b.C0039b.a.a.clear();
        d.b.a.a.clear();
        InneractiveAdSpotManager.destroy();
        l.q();
    }

    public static void setLogLevel(int i) {
        IAlog.a = i;
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.a(inneractiveUserConfig);
    }

    public final Context getAppContext() {
        return this.c;
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, GdprConsentSource.Internal);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setGdprConsent(boolean r5, com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource r6) {
        /*
            com.fyber.inneractive.sdk.config.d r0 = com.fyber.inneractive.sdk.config.IAConfigManager.g()
            r1 = 0
            if (r0 == 0) goto L59
            com.fyber.inneractive.sdk.config.d r0 = com.fyber.inneractive.sdk.config.IAConfigManager.g()
            android.app.Application r2 = com.fyber.inneractive.sdk.util.l.p()
            java.lang.String r3 = "SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed."
            if (r2 != 0) goto L19
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.d(r3, r5)
            return
        L19:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r0.a = r2
            android.app.Application r2 = com.fyber.inneractive.sdk.util.l.p()
            if (r2 == 0) goto L3d
            r0.a()
            android.content.SharedPreferences r2 = r0.f
            if (r2 == 0) goto L3d
            android.content.SharedPreferences r2 = r0.f
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "IAGDPRBool"
            android.content.SharedPreferences$Editor r5 = r2.putBoolean(r4, r5)
            r5.apply()
            r5 = 1
            goto L3e
        L3d:
            r5 = r1
        L3e:
            if (r5 != 0) goto L45
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.d(r3, r5)
        L45:
            r0.c = r6
            java.lang.String r5 = r6.name()
            java.lang.String r6 = "IAGdprSource"
            boolean r5 = r0.a(r6, r5)
            if (r5 != 0) goto L58
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.d(r3, r5)
        L58:
            return
        L59:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "setGdprConsent() was invoked, but Fyber SDK was not properly initialized"
            com.fyber.inneractive.sdk.util.IAlog.d(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.external.InneractiveAdManager.setGdprConsent(boolean, com.fyber.inneractive.sdk.external.InneractiveAdManager$GdprConsentSource):void");
    }

    public static GdprConsentSource getGdprStatusSource() {
        if (IAConfigManager.g() == null) {
            IAlog.d("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return null;
        }
        return IAConfigManager.g().c;
    }

    public static Boolean getGdprConsent() {
        return IAConfigManager.g().b();
    }

    public static void setGdprConsentString(String str) {
        if (IAConfigManager.g() != null) {
            com.fyber.inneractive.sdk.config.d g = IAConfigManager.g();
            if (l.p() == null) {
                IAlog.d("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            g.b = str;
            if (g.a("IAGdprConsentData", g.b)) {
                return;
            }
            IAlog.d("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            return;
        }
        IAlog.d("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setUSPrivacyString(String str) {
        if (IAConfigManager.g() != null) {
            com.fyber.inneractive.sdk.config.d g = IAConfigManager.g();
            if (l.p() == null) {
                IAlog.d("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            g.e = str;
            if (g.a("IACCPAConsentData", g.e)) {
                return;
            }
            IAlog.d("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            return;
        }
        IAlog.d("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearGdprConsentData() {
        if (IAConfigManager.g() != null) {
            com.fyber.inneractive.sdk.config.d g = IAConfigManager.g();
            IAlog.b("Clearing GDPR Consent String and status", new Object[0]);
            if (l.p() == null) {
                IAlog.d("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            g.a();
            g.a = null;
            g.b = null;
            if (g.f != null) {
                g.f.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
                return;
            }
            return;
        }
        IAlog.d("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearUSPrivacyString() {
        com.fyber.inneractive.sdk.config.d g = IAConfigManager.g();
        IAlog.b("Clearing CCPA Consent String", new Object[0]);
        if (l.p() == null) {
            IAlog.d("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        g.a();
        g.e = null;
        if (g.f != null) {
            g.f.edit().remove("IACCPAConsentData").apply();
        }
    }

    public static void useSecureConnections(boolean z) {
        IAConfigManager.a(z);
    }

    public static void setUserId(String str) {
        IAConfigManager.b(str);
    }

    public static String getUserId() {
        return IAConfigManager.o();
    }

    public static void setUseLocation(boolean z) {
        IAConfigManager.b(z);
    }

    @Override // com.fyber.inneractive.sdk.config.j.a
    public final void onGlobalConfigChanged(j jVar, i iVar) {
        if (iVar == null || !iVar.a(GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT, false)) {
            return;
        }
        com.fyber.inneractive.sdk.util.m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.external.InneractiveAdManager.3
            @Override // java.lang.Runnable
            public final void run() {
                if (IAConfigManager.t()) {
                    return;
                }
                IAConfigManager.u();
                new n.a(m.FIRST_OPENED, (InneractiveAdRequest) null, (e) null).b(null);
            }
        });
    }

    public static String getAppId() {
        return IAConfigManager.n.d;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        a.a.a = str;
    }

    @Deprecated
    public static String getDevPlatform() {
        return a.a.a;
    }

    public static boolean wasInitialized() {
        return a.a.c != null;
    }
}
