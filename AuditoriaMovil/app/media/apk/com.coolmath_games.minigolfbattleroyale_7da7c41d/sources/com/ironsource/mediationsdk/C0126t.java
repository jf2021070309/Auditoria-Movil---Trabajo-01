package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.C0112f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.mediationsdk.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0126t implements com.ironsource.mediationsdk.sdk.d {
    ConcurrentHashMap<String, C0127u> a = new ConcurrentHashMap<>();
    private String b;
    private com.ironsource.mediationsdk.utils.b c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0126t(List<NetworkSettings> list, com.ironsource.mediationsdk.model.p pVar, String str, String str2) {
        this.b = str;
        this.c = pVar.l;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C0110d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), true, false);
                if (a != null) {
                    this.a.put(networkSettings.getSubProviderId(), new C0127u(str, str2, networkSettings, this, pVar.e, a));
                }
            } else {
                a("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, C0127u c0127u, Object[][] objArr) {
        Map<String, Object> c = c0127u.c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(c)));
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
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(1500, new JSONObject(hashMap)));
    }

    private static void a(C0127u c0127u, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRvManager " + c0127u.d() + " : " + str, 0);
    }

    private static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyRvManager " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, C0127u c0127u) {
        a(i, c0127u, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(IronSourceError ironSourceError, C0127u c0127u) {
        a(c0127u, "onRewardedVideoAdShowFailed error=" + ironSourceError);
        a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, c0127u, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        W.a().b(c0127u.f(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(IronSourceError ironSourceError, C0127u c0127u, long j) {
        a(c0127u, "onRewardedVideoAdLoadFailed error=" + ironSourceError);
        a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, c0127u, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        if (ironSourceError.getErrorCode() == 1058) {
            a((int) IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, c0127u, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, c0127u, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        W.a().a(c0127u.f(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(C0127u c0127u) {
        a(c0127u, "onRewardedVideoAdOpened");
        a(1005, c0127u, (Object[][]) null);
        final W a = W.a();
        final String f = c0127u.f();
        if (a.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.W.3
                @Override // java.lang.Runnable
                public final void run() {
                    a.a.onRewardedVideoAdOpened(f);
                    W w = a;
                    W.a(w, "onRewardedVideoAdOpened() instanceId=" + f);
                }
            });
        }
        if (c0127u.i()) {
            for (String str : c0127u.g) {
                C0112f.a();
                String a2 = C0112f.a(str, c0127u.d(), c0127u.e(), c0127u.h, "", "", "", "");
                C0112f.a();
                C0112f.a("onRewardedVideoAdOpened", c0127u.d(), a2);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(C0127u c0127u, long j) {
        a(c0127u, "onRewardedVideoLoadSuccess");
        a(1002, c0127u, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        final W a = W.a();
        final String f = c0127u.f();
        if (a.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.W.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.a.onRewardedVideoAdLoadSuccess(f);
                    W w = a;
                    W.a(w, "onRewardedVideoAdLoadSuccess() instanceId=" + f);
                }
            });
        }
    }

    public final void a(String str, String str2, boolean z) {
        IronSourceError buildLoadFailedError;
        W a;
        try {
            if (!this.a.containsKey(str)) {
                a(1500, str);
                W.a().a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            C0127u c0127u = this.a.get(str);
            if (!z) {
                if (!c0127u.i()) {
                    a(1001, c0127u, (Object[][]) null);
                    c0127u.a("", "", null, null);
                    return;
                }
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in non IAB flow must be called by non bidder instances");
                a(buildLoadFailedError2.getErrorMessage());
                a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, c0127u, (Object[][]) null);
                W.a().a(str, buildLoadFailedError2);
                return;
            }
            if (c0127u.i()) {
                C0112f.a();
                JSONObject a2 = C0112f.a(str2);
                C0112f.a();
                C0112f.a a3 = C0112f.a(a2);
                C0112f.a();
                com.ironsource.mediationsdk.a.c a4 = C0112f.a(c0127u.d(), a3.b);
                if (a4 != null) {
                    c0127u.a(a4.b());
                    c0127u.b(a3.a);
                    c0127u.a(a3.d);
                    a(1001, c0127u, (Object[][]) null);
                    c0127u.a(a4.b(), a3.a, a3.d, a4.d());
                    return;
                }
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(buildLoadFailedError.getErrorMessage());
                a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, c0127u, (Object[][]) null);
                a = W.a();
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in IAB flow must be called by bidder instances");
                a(buildLoadFailedError.getErrorMessage());
                a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, c0127u, (Object[][]) null);
                a = W.a();
            }
            a.a(str, buildLoadFailedError);
        } catch (Exception e) {
            a("loadRewardedVideoWithAdm exception " + e.getMessage());
            W.a().a(str, ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm exception"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void b(C0127u c0127u) {
        a(c0127u, "onRewardedVideoAdClosed");
        a((int) IronSourceConstants.RV_INSTANCE_CLOSED, c0127u, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.n.a().b(1))}});
        com.ironsource.mediationsdk.utils.n.a().a(1);
        final W a = W.a();
        final String f = c0127u.f();
        if (a.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.W.4
                @Override // java.lang.Runnable
                public final void run() {
                    a.a.onRewardedVideoAdClosed(f);
                    W w = a;
                    W.a(w, "onRewardedVideoAdClosed() instanceId=" + f);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void c(C0127u c0127u) {
        a(c0127u, "onRewardedVideoAdClicked");
        a(1006, c0127u, (Object[][]) null);
        final W a = W.a();
        final String f = c0127u.f();
        if (a.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.W.6
                @Override // java.lang.Runnable
                public final void run() {
                    a.a.onRewardedVideoAdClicked(f);
                    W w = a;
                    W.a(w, "onRewardedVideoAdClicked() instanceId=" + f);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void d(C0127u c0127u) {
        a(c0127u, "onRewardedVideoAdVisible");
        a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, c0127u, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void e(C0127u c0127u) {
        a(c0127u, "onRewardedVideoAdRewarded");
        Map<String, Object> c = c0127u.c();
        if (!TextUtils.isEmpty(E.a().m)) {
            c.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, E.a().m);
        }
        if (E.a().n != null) {
            for (String str : E.a().n.keySet()) {
                c.put("custom_" + str, E.a().n.get(str));
            }
        }
        Placement a = E.a().i.c.a.a();
        if (a != null) {
            c.put("placement", a.getPlacementName());
            c.put(IronSourceConstants.EVENTS_REWARD_NAME, a.getRewardName());
            c.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a.getRewardAmount()));
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "defaultPlacement is null", 3);
        }
        com.ironsource.mediationsdk.adunit.a.a aVar = new com.ironsource.mediationsdk.adunit.a.a(1010, new JSONObject(c));
        aVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.b(), c0127u.d()));
        com.ironsource.mediationsdk.a.h.e().b(aVar);
        final W a2 = W.a();
        final String f = c0127u.f();
        if (a2.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.W.7
                @Override // java.lang.Runnable
                public final void run() {
                    a2.a.onRewardedVideoAdRewarded(f);
                    W w = a2;
                    W.a(w, "onRewardedVideoAdRewarded() instanceId=" + f);
                }
            });
        }
    }
}
