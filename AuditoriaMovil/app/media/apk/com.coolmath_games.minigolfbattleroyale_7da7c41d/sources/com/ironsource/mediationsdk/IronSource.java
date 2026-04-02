package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0119m;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    /* loaded from: classes2.dex */
    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE),
        OFFERWALL("offerwall"),
        BANNER("banner");
        
        private String a;

        AD_UNIT(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        E a = E.a();
        if (com.ironsource.mediationsdk.c.a.a(impressionDataListener, "addImpressionDataListener - listener is null")) {
            com.ironsource.mediationsdk.c.b.a().a(impressionDataListener);
            if (a.y != null) {
                a.y.a(impressionDataListener);
            }
            if (a.z != null) {
                a.z.a(impressionDataListener);
            }
            if (a.B != null) {
                a.B.t.add(impressionDataListener);
            }
            if (a.A != null) {
                a.A.a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        E.a().n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "createBanner()", 1);
        if (activity == null) {
            a.f.log(IronSourceLogger.IronSourceTag.API, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(final IronSourceBannerLayout ironSourceBannerLayout) {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!a.G || a.A == null) {
                if (a.e != null) {
                    a.e.a(ironSourceBannerLayout);
                    return;
                } else if (a.J != null) {
                    a.J.a(ironSourceBannerLayout);
                    return;
                } else {
                    return;
                }
            }
            final M m = a.A;
            IronLog.INTERNAL.verbose("");
            C0119m.b bVar = new C0119m.b() { // from class: com.ironsource.mediationsdk.M.2
                @Override // com.ironsource.mediationsdk.C0119m.b
                public final void a() {
                    IronLog.INTERNAL.verbose("destroying banner");
                    M.this.b.d();
                    M.this.a(IronSourceConstants.BN_DESTROY, (Object[][]) null, M.this.e != null ? M.this.e.m() : M.this.f);
                    M m2 = M.this;
                    if (m2.e != null) {
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("mActiveSmash = " + m2.e.p());
                        m2.e.a();
                        m2.e = null;
                    }
                    ironSourceBannerLayout.b();
                    M.this.c = null;
                    M.this.d = null;
                    M.this.a(a.READY_TO_LOAD);
                }

                @Override // com.ironsource.mediationsdk.C0119m.b
                public final void a(String str) {
                    IronLog ironLog = IronLog.API;
                    ironLog.error("destroy banner failed - errorMessage = " + str);
                }
            };
            if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                bVar.a();
                return;
            }
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            bVar.a(String.format("can't destroy banner - %s", objArr));
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        E.a();
        return E.a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String l;
        synchronized (IronSource.class) {
            l = E.a().l();
        }
        return l;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String iSDemandOnlyBiddingData;
        synchronized (IronSource.class) {
            iSDemandOnlyBiddingData = getISDemandOnlyBiddingData();
        }
        return iSDemandOnlyBiddingData;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return E.a().k(str);
    }

    public static void getOfferwallCredits() {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            L l = a.d;
            if (l.a != null) {
                l.a.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return E.a().l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, null);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        E.a().a(activity, str, false, null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        E.a().a(activity, str, (com.ironsource.mediationsdk.sdk.f) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        E.a().a(context, str, (com.ironsource.mediationsdk.sdk.f) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return E.a().n(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return E.a().i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return E.a().g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return E.a().m(str);
    }

    public static boolean isInterstitialReady() {
        return E.a().g();
    }

    public static boolean isOfferwallAvailable() {
        return E.a().j();
    }

    public static boolean isRewardedVideoAvailable() {
        return E.a().c();
    }

    public static boolean isRewardedVideoPlacementCapped(String str) {
        int i;
        E a = E.a();
        int o = a.o(str);
        boolean z = o != 0 && ((i = E.AnonymousClass1.b[o - 1]) == 1 || i == 2 || i == 3);
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(a.u, a.C, a.H);
            if (str != null) {
                E.a(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            E.a((int) IronSourceConstants.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
        return z;
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        E.a().a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        E.a().a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        E.a().a(activity, ironSourceBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        E.a().d(activity, str, null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        E.a().d(null, str, null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        E.a().c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        E.a().c(null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        E.a().b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        E.a().b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        E.a().a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        E.a().a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", 1);
        try {
            if (a.v) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C0121o.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (!a.w) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                C0121o.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                J.a b = J.a().b();
                if (b == J.a.INIT_FAILED) {
                    a.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0121o.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (b == J.a.INIT_IN_PROGRESS) {
                    if (!J.a().c()) {
                        a.F = true;
                        return;
                    }
                    a.f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0121o.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (!a.h()) {
                    a.f.log(IronSourceLogger.IronSourceTag.API, "No interstitial configurations found", 3);
                    C0121o.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (!a.D) {
                    a.c.c();
                } else {
                    if (a.E) {
                        if (a.B != null) {
                            a.B.e();
                            return;
                        }
                    } else if (a.z != null) {
                        a.z.d();
                        return;
                    }
                    a.F = true;
                }
            }
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C0121o.a().a(AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        E a = E.a();
        try {
            a.f.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        E a = E.a();
        try {
            a.f.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        E a = E.a();
        if (com.ironsource.mediationsdk.c.a.a(impressionDataListener, "removeImpressionDataListener - listener is null")) {
            com.ironsource.mediationsdk.c.b.a().b(impressionDataListener);
            if (a.y != null) {
                a.y.b(impressionDataListener);
            }
            if (a.z != null) {
                a.z.b(impressionDataListener);
            }
            if (a.B != null) {
                a.B.t.remove(impressionDataListener);
            }
            if (a.A != null) {
                a.A.b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a.g.b = null;
    }

    public static void removeOfferwallListener() {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a.g.c = null;
    }

    public static void removeRewardedVideoListener() {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a.g.a = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        E a = E.a();
        if (com.ironsource.mediationsdk.c.a.a(jSONObject, "setAdRevenueData - impressionData is null") && com.ironsource.mediationsdk.c.a.a(str, "setAdRevenueData - dataSource is null")) {
            a.K.a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        E.a();
        E.a(z);
    }

    public static void setConsent(boolean z) {
        E.a().b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return E.a().c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        E.a();
        E.a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        E.a();
        E.a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        E a = E.a();
        IronLog.API.info("removing all impression data listeners");
        com.ironsource.mediationsdk.c.b.a().c();
        if (a.y != null) {
            a.y.b();
        }
        if (a.z != null) {
            a.z.b();
        }
        if (a.B != null) {
            a.B.t.clear();
        }
        if (a.A != null) {
            a.A.b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a.g.b = interstitialListener;
        A.a().a(interstitialListener);
        C0121o.a().a = interstitialListener;
    }

    public static void setLogListener(LogListener logListener) {
        E a = E.a();
        if (logListener == null) {
            a.f.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a.h.c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a.f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setMediationSegment(String str) {
        E a = E.a();
        try {
            a.f.log(IronSourceLogger.IronSourceTag.API, a.a + ":setMediationSegment(segment:" + str + ")", 1);
            com.ironsource.mediationsdk.utils.c cVar = new com.ironsource.mediationsdk.utils.c();
            E.a(str, cVar);
            if (cVar.a()) {
                a.l = str;
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, cVar.b().toString(), 2);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = a.f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, a.a + ":setMediationSegment(segment:" + str + ")", e);
        }
    }

    public static void setMediationType(String str) {
        E.a().d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        E.a().a(str, arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        E.a().a(str, list);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a.g.c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a.g.a = rewardedVideoListener;
        X.a().a(rewardedVideoListener);
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        E a = E.a();
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                a.f.log(IronSourceLogger.IronSourceTag.API, a.a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                a.n = new HashMap(map);
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager = a.f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a.a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        E a = E.a();
        if (J.a().b() == J.a.INIT_IN_PROGRESS || J.a().b() == J.a.INITIATED) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Segments must be set prior to Init. Setting a segment after the init will be ignored", 0);
        } else {
            a.s = ironSourceSegment;
        }
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        E a = E.a();
        if (a.g != null) {
            a.g.d = segmentListener;
            J.a().p = a.g;
        }
    }

    public static void setUserId(String str) {
        E.a().a(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        E a = E.a();
        a.q = context;
        a.r = Boolean.valueOf(z);
        if (a.D) {
            if (a.E) {
                if (a.B != null) {
                    a.B.b(z);
                }
            } else if (a.z != null) {
                a.z.a(z);
            }
        } else if (a.c != null) {
            a.c.a(context, z);
        }
        if (a.C) {
            if (a.y != null) {
                a.y.a(context, z);
            }
        } else if (a.b != null) {
            a.b.a(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        E a = E.a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a.v) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
            } else if (a.I == null) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial video was not initiated", 3);
                C0132z.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial video was not initiated"));
            } else {
                C0124r c0124r = a.I;
                if (c0124r.a.containsKey(str)) {
                    C0125s c0125s = c0124r.a.get(str);
                    c0124r.a(IronSourceConstants.IS_INSTANCE_SHOW, c0125s);
                    c0125s.a();
                    return;
                }
                C0124r.a((int) IronSourceConstants.IS_INSTANCE_NOT_FOUND, str);
                C0132z.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } catch (Exception e) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e);
            C0132z.a().b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        E.a().f(str);
    }

    public static void showInterstitial() {
        E a = E.a();
        a.f.log(IronSourceLogger.IronSourceTag.API, "showInterstitial()", 1);
        try {
            if (a.v) {
                a.f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                a.g.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"));
            } else if (!a.h()) {
                a.g.onInterstitialAdShowFailed(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                InterstitialPlacement e = a.e();
                if (e != null) {
                    a.h(e.getPlacementName());
                } else {
                    a.g.onInterstitialAdShowFailed(new IronSourceError(1020, "showInterstitial error: empty default placement in response"));
                }
            }
        } catch (Exception e2) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e2);
            a.g.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e2.getMessage()));
        }
    }

    public static void showInterstitial(String str) {
        E.a().h(str);
    }

    public static void showOfferwall() {
        E a = E.a();
        try {
            a.f.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a.i()) {
                a.g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.k a2 = a.i.c.c.a();
            if (a2 != null) {
                a.j(a2.b);
            }
        } catch (Exception e) {
            a.f.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            a.g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        E.a().j(str);
    }

    public static void showRewardedVideo() {
        UnityPlayer.UnitySendMessage("IronSourceEvents", "onRewardedVideoAdRewarded", "{\"placement_reward_name\":\"Virtual Item\",\"placement_name\":\"DefaultRewardedVideo\",\"placement_reward_amount\":\"1\",\"placement_id\":\"0\"}");
        UnityPlayer.UnitySendMessage("IronSourceEvents", "onRewardedVideoAdClosed", "");
        UnityPlayer.UnitySendMessage("IronSourceEvents", "onRewardedVideoAvailabilityChanged", "true");
    }

    public static void showRewardedVideo(String str) {
        UnityPlayer.UnitySendMessage("IronSourceEvents", "onRewardedVideoAdRewarded", "{\"placement_reward_name\":\"Virtual Item\",\"placement_name\":\"DefaultRewardedVideo\",\"placement_reward_amount\":\"1\",\"placement_id\":\"0\"}");
        UnityPlayer.UnitySendMessage("IronSourceEvents", "onRewardedVideoAdClosed", "");
        UnityPlayer.UnitySendMessage("IronSourceEvents", "onRewardedVideoAvailabilityChanged", "true");
    }
}
