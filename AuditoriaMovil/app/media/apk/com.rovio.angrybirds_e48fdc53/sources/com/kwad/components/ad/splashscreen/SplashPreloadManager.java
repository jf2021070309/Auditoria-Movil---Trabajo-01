package com.kwad.components.ad.splashscreen;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.components.core.video.j;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.i;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class SplashPreloadManager {
    private HashMap<String, PreLoadItem> Cd;
    private List<String> Ce;
    private volatile SharedPreferences Cf;
    private final Object mLock;

    /* loaded from: classes.dex */
    public static class PreLoadItem extends com.kwad.sdk.core.response.a.a implements Serializable {
        public long cacheTime;
        public long expiredTime;
        public String preloadId;
    }

    /* loaded from: classes.dex */
    static class a {
        private static final SplashPreloadManager Cg = new SplashPreloadManager((byte) 0);
    }

    private SplashPreloadManager() {
        this.mLock = new Object();
        this.Cd = new HashMap<>();
        this.Ce = new ArrayList();
        init();
    }

    /* synthetic */ SplashPreloadManager(byte b) {
        this();
    }

    private static boolean W(String str) {
        if (str != null) {
            File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(str);
            StringBuilder sb = new StringBuilder("check preloadId ");
            sb.append(str);
            sb.append(" file exists ");
            sb.append(bP == null ? "null" : Boolean.valueOf(bP.exists()));
            com.kwad.sdk.core.e.c.d("PreloadManager", sb.toString());
            if (bP != null && bP.exists()) {
                return true;
            }
        }
        return false;
    }

    public static File X(String str) {
        if (str != null) {
            com.kwad.sdk.core.e.c.d("PreloadManager", "getVideoFile preloadId " + str + "  url " + str);
            File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(str);
            if (bP == null || !bP.exists()) {
                return null;
            }
            return bP;
        }
        return null;
    }

    public static boolean d(AdResultData adResultData) {
        if (!adResultData.getAdTemplateList().isEmpty()) {
            AdTemplate adTemplate = adResultData.getAdTemplateList().get(0);
            if (!adTemplate.adInfoList.isEmpty()) {
                return com.kwad.sdk.core.response.b.a.aV(adTemplate.adInfoList.get(0));
            }
        }
        return false;
    }

    private void init() {
        Context context = KsAdSDKImpl.get().getContext();
        if (context != null) {
            this.Cf = context.getSharedPreferences("ksadsdk_splash_preload_id_list", 0);
            initData();
        }
    }

    private void initData() {
        Map<String, ?> all = this.Cf.getAll();
        ArrayList<String> arrayList = new ArrayList();
        for (String str : all.keySet()) {
            PreLoadItem preLoadItem = new PreLoadItem();
            try {
                Object obj = all.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!TextUtils.isEmpty(str2)) {
                        preLoadItem.parseJson(new JSONObject(str2));
                        if (!TextUtils.isEmpty(preLoadItem.preloadId)) {
                            File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(preLoadItem.preloadId);
                            if (bP == null || !bP.exists()) {
                                arrayList.add(preLoadItem.preloadId);
                                com.kwad.sdk.core.e.c.d("PreloadManager", "Remove null file list " + preLoadItem.preloadId);
                            } else {
                                synchronized (this.mLock) {
                                    this.Cd.put(str, preLoadItem);
                                    if (!this.Ce.contains(str)) {
                                        this.Ce.add(str);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        SharedPreferences.Editor edit = this.Cf.edit();
        for (String str3 : arrayList) {
            edit.remove(str3);
        }
        edit.apply();
    }

    private void kC() {
        int size;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.mLock) {
            ArrayList<String> arrayList = new ArrayList();
            for (String str : this.Cd.keySet()) {
                PreLoadItem preLoadItem = this.Cd.get(str);
                if (preLoadItem != null && preLoadItem.expiredTime < currentTimeMillis) {
                    arrayList.add(str);
                }
            }
            SharedPreferences.Editor edit = this.Cf.edit();
            for (String str2 : arrayList) {
                this.Ce.remove(str2);
                this.Cd.remove(str2);
                edit.remove(str2);
                com.kwad.sdk.core.diskcache.b.a.At().remove(str2);
            }
            edit.apply();
            size = this.Ce.size();
        }
        if (size > 30) {
            com.kwad.sdk.core.e.c.d("PreloadManager", "大于 30 按失效日期远近顺序移除");
            int i = size - 15;
            for (int i2 = 0; i2 < i; i2++) {
                long j = Long.MAX_VALUE;
                String str3 = "";
                synchronized (this.mLock) {
                    for (PreLoadItem preLoadItem2 : this.Cd.values()) {
                        if (preLoadItem2.expiredTime < j) {
                            j = preLoadItem2.expiredTime;
                            str3 = preLoadItem2.preloadId;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        this.Ce.remove(str3);
                        this.Cd.remove(str3);
                        this.Cf.edit().remove(str3).apply();
                        com.kwad.sdk.core.e.c.d("PreloadManager", "移除 preloadId = " + str3 + " expiredTime =  " + j);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    com.kwad.sdk.core.diskcache.b.a.At().remove(str3);
                }
            }
        }
    }

    public static SplashPreloadManager kD() {
        SplashPreloadManager splashPreloadManager = a.Cg;
        if (splashPreloadManager.Cf == null) {
            splashPreloadManager.init();
        }
        return splashPreloadManager;
    }

    private void n(AdInfo adInfo) {
        PreLoadItem preLoadItem = new PreLoadItem();
        preLoadItem.cacheTime = System.currentTimeMillis();
        preLoadItem.expiredTime = System.currentTimeMillis() + (adInfo.adPreloadInfo.validityPeriod * 1000);
        preLoadItem.preloadId = com.kwad.sdk.core.response.b.a.aS(adInfo);
        synchronized (this.mLock) {
            this.Cd.put(adInfo.adPreloadInfo.preloadId, preLoadItem);
            if (!this.Ce.contains(adInfo.adPreloadInfo.preloadId)) {
                this.Ce.add(adInfo.adPreloadInfo.preloadId);
            }
        }
        if (this.Cf != null) {
            SharedPreferences.Editor edit = this.Cf.edit();
            edit.putString(adInfo.adPreloadInfo.preloadId, preLoadItem.toJson().toString());
            edit.apply();
        }
    }

    public final List<String> R() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            com.kwad.sdk.core.e.c.d("PreloadManager", "getPreloadIdList start ");
            for (int i = 0; i < this.Ce.size(); i++) {
                String str = this.Ce.get(i);
                File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(str);
                if (bP != null && bP.exists()) {
                    arrayList.add(str);
                }
            }
            com.kwad.sdk.core.e.c.d("PreloadManager", "getPreloadIdList end ");
        }
        com.kwad.sdk.core.e.c.d("PreloadManager", "getPreloadIdList " + this.Ce.size());
        return arrayList;
    }

    public final int b(AdResultData adResultData, boolean z) {
        int i;
        long j;
        String str;
        Iterator<AdTemplate> it = adResultData.getAdTemplateList().iterator();
        com.kwad.components.ad.splashscreen.monitor.a.kP();
        com.kwad.components.ad.splashscreen.monitor.a.e(adResultData);
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AdTemplate next = it.next();
            if (next != null) {
                for (AdInfo adInfo : next.adInfoList) {
                    if (adInfo.adPreloadInfo == null || this.Cf == null) {
                        com.kwad.components.ad.splashscreen.monitor.a.kP();
                        i = 3;
                        j = next.posId;
                        str = SplashMonitorInfo.ERROR_PRELOAD_ID_INVALID_MSG;
                    } else {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (W(adInfo.adPreloadInfo.preloadId)) {
                            com.kwad.components.ad.splashscreen.monitor.a.kP();
                            com.kwad.components.ad.splashscreen.monitor.a.a(adInfo, SystemClock.elapsedRealtime() - elapsedRealtime, 2, next.posId);
                            n(adInfo);
                            i2++;
                        } else {
                            String F = com.kwad.sdk.core.response.b.a.aU(adInfo) ? com.kwad.sdk.core.response.b.a.F(adInfo) : com.kwad.sdk.core.response.b.a.aV(adInfo) ? com.kwad.sdk.core.response.b.a.aM(adInfo).materialUrl : null;
                            if (TextUtils.isEmpty(F)) {
                                com.kwad.components.ad.splashscreen.monitor.a.kP();
                                i = 2;
                                j = next.posId;
                                str = SplashMonitorInfo.ERROR_URL_INVALID_MSG;
                            } else {
                                String aS = com.kwad.sdk.core.response.b.a.aS(adInfo);
                                if (adInfo.adPreloadInfo.preloadType != 1 || ag.isWifiConnected(KsAdSDKImpl.get().getContext()) || z) {
                                    com.kwad.sdk.core.e.c.d("PreloadManager", "start Download preloadId " + aS + " true url " + F);
                                    kC();
                                    a.C0256a c0256a = new a.C0256a();
                                    if (j.a(F, aS, c0256a)) {
                                        n(adInfo);
                                        i2++;
                                        com.kwad.components.ad.splashscreen.monitor.a.kP();
                                        com.kwad.components.ad.splashscreen.monitor.a.a(adInfo, SystemClock.elapsedRealtime() - elapsedRealtime, 1, next.posId);
                                    } else {
                                        com.kwad.components.ad.splashscreen.monitor.a.kP();
                                        com.kwad.components.ad.splashscreen.monitor.a.a(adInfo, 4, c0256a.msg, next.posId);
                                        com.kwad.components.core.p.a.pC().c(next, 1, c0256a.msg);
                                    }
                                } else {
                                    com.kwad.components.ad.splashscreen.monitor.a.kP();
                                    com.kwad.components.ad.splashscreen.monitor.a.a(adInfo, 1, SplashMonitorInfo.ERROR_NET_MSG, next.posId);
                                }
                            }
                        }
                    }
                    com.kwad.components.ad.splashscreen.monitor.a.a(adInfo, i, str, j);
                }
            }
        }
        AdTemplate adTemplate = adResultData.getAdTemplateList().size() > 0 ? adResultData.getAdTemplateList().get(0) : null;
        if (i2 > 0) {
            i.aj("splashAd_", "onSplashVideoAdCacheSuccess");
            com.kwad.components.core.p.a.pC().f(adTemplate, i2);
        } else {
            i.aj("splashAd_", "onSplashVideoAdCacheFailed");
        }
        return i2;
    }

    public final boolean c(AdResultData adResultData) {
        if (!adResultData.getAdTemplateList().isEmpty()) {
            AdTemplate adTemplate = adResultData.getAdTemplateList().get(0);
            if (!adTemplate.adInfoList.isEmpty()) {
                AdInfo adInfo = adTemplate.adInfoList.get(0);
                if (adInfo.adPreloadInfo != null) {
                    return W(com.kwad.sdk.core.response.b.a.aS(adInfo));
                }
            }
        }
        return false;
    }
}
