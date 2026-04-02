package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.C0112f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.mediationsdk.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0124r implements com.ironsource.mediationsdk.sdk.c {
    ConcurrentHashMap<String, C0125s> a = new ConcurrentHashMap<>();
    private com.ironsource.mediationsdk.utils.b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0124r(List<NetworkSettings> list, com.ironsource.mediationsdk.model.i iVar, String str, String str2) {
        this.b = iVar.i;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C0110d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), true, false);
                if (a != null) {
                    this.a.put(networkSettings.getSubProviderId(), new C0125s(str, str2, networkSettings, this, iVar.e, a));
                }
            } else {
                a("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, C0125s c0125s, Object[][] objArr) {
        Map<String, Object> c = c0125s.c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(c)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put("spId", str);
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(IronSourceConstants.IS_INSTANCE_NOT_FOUND, new JSONObject(hashMap)));
    }

    private static void a(C0125s c0125s, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyIsManager " + c0125s.d() + " : " + str, 0);
    }

    private static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyIsManager " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, C0125s c0125s) {
        a(i, c0125s, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(IronSourceError ironSourceError, C0125s c0125s) {
        a(c0125s, "onInterstitialAdShowFailed error=" + ironSourceError.toString());
        a((int) IronSourceConstants.IS_INSTANCE_SHOW_FAILED, c0125s, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        C0132z.a().b(c0125s.f(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(IronSourceError ironSourceError, C0125s c0125s, long j) {
        a(c0125s, "onInterstitialAdLoadFailed error=" + ironSourceError.toString());
        if (ironSourceError.getErrorCode() == 1158) {
            a((int) IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, c0125s, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c0125s, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        C0132z.a().a(c0125s.f(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(C0125s c0125s) {
        a(c0125s, "onInterstitialAdOpened");
        a((int) IronSourceConstants.IS_INSTANCE_OPENED, c0125s, (Object[][]) null);
        final C0132z a = C0132z.a();
        final String f = c0125s.f();
        if (a.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.z.3
                @Override // java.lang.Runnable
                public final void run() {
                    a.a.onInterstitialAdOpened(f);
                    C0132z c0132z = a;
                    C0132z.a(c0132z, "onInterstitialAdOpened() instanceId=" + f);
                }
            });
        }
        if (c0125s.i()) {
            for (String str : c0125s.g) {
                C0112f.a();
                String a2 = C0112f.a(str, c0125s.d(), c0125s.e(), c0125s.h, "", "", "", "");
                C0112f.a();
                C0112f.a("onInterstitialAdOpened", c0125s.d(), a2);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(C0125s c0125s, long j) {
        a(c0125s, "onInterstitialAdReady");
        a((int) IronSourceConstants.IS_INSTANCE_LOAD_SUCCESS, c0125s, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        final C0132z a = C0132z.a();
        final String f = c0125s.f();
        if (a.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.z.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.a.onInterstitialAdReady(f);
                    C0132z c0132z = a;
                    C0132z.a(c0132z, "onInterstitialAdReady() instanceId=" + f);
                }
            });
        }
    }

    public final void a(String str, String str2, boolean z) {
        IronSourceError buildLoadFailedError;
        try {
            if (!this.a.containsKey(str)) {
                a((int) IronSourceConstants.IS_INSTANCE_NOT_FOUND, str);
                C0132z.a().a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                return;
            }
            C0125s c0125s = this.a.get(str);
            if (!z) {
                if (!c0125s.i()) {
                    a(2002, c0125s, (Object[][]) null);
                    c0125s.a("", "", null, null);
                    return;
                }
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in non IAB flow must be called by non bidder instances");
                a(buildLoadFailedError2.getErrorMessage());
                a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c0125s, (Object[][]) null);
                C0132z.a().a(str, buildLoadFailedError2);
                return;
            }
            if (c0125s.i()) {
                C0112f.a();
                JSONObject a = C0112f.a(str2);
                C0112f.a();
                C0112f.a a2 = C0112f.a(a);
                C0112f.a();
                com.ironsource.mediationsdk.a.c a3 = C0112f.a(c0125s.d(), a2.b);
                if (a3 != null) {
                    c0125s.a(a3.b());
                    c0125s.b(a2.a);
                    c0125s.a(a2.d);
                    a(2002, c0125s, (Object[][]) null);
                    c0125s.a(a3.b(), a2.a, a2.d, a3.d());
                    return;
                }
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(buildLoadFailedError.getErrorMessage());
                a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c0125s, (Object[][]) null);
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in IAB flow must be called by bidder instances");
                a(buildLoadFailedError.getErrorMessage());
                a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c0125s, (Object[][]) null);
            }
            C0132z.a().a(str, buildLoadFailedError);
        } catch (Exception unused) {
            IronSourceError buildLoadFailedError3 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm exception");
            a(buildLoadFailedError3.getErrorMessage());
            C0132z.a().a(str, buildLoadFailedError3);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void b(C0125s c0125s) {
        a(c0125s, "onInterstitialAdClosed");
        a((int) IronSourceConstants.IS_INSTANCE_CLOSED, c0125s, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.n.a().b(2))}});
        com.ironsource.mediationsdk.utils.n.a().a(2);
        final C0132z a = C0132z.a();
        final String f = c0125s.f();
        if (a.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.z.4
                @Override // java.lang.Runnable
                public final void run() {
                    a.a.onInterstitialAdClosed(f);
                    C0132z c0132z = a;
                    C0132z.a(c0132z, "onInterstitialAdClosed() instanceId=" + f);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void c(C0125s c0125s) {
        a(c0125s, "onInterstitialAdClicked");
        a((int) IronSourceConstants.IS_INSTANCE_CLICKED, c0125s, (Object[][]) null);
        final C0132z a = C0132z.a();
        final String f = c0125s.f();
        if (a.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.z.6
                @Override // java.lang.Runnable
                public final void run() {
                    a.a.onInterstitialAdClicked(f);
                    C0132z c0132z = a;
                    C0132z.a(c0132z, "onInterstitialAdClicked() instanceId=" + f);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void d(C0125s c0125s) {
        a((int) IronSourceConstants.IS_INSTANCE_VISIBLE, c0125s, (Object[][]) null);
        a(c0125s, "onInterstitialAdVisible");
    }
}
