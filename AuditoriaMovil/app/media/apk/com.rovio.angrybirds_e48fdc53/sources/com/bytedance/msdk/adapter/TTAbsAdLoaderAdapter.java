package com.bytedance.msdk.adapter;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.c;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.i;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.i0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.j0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.z;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.UIUtils;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomAd;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.base.TTBaseAd;
import com.bytedance.msdk.base.a;
import com.bytedance.msdk.base.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class TTAbsAdLoaderAdapter {
    private AdapterLoaderListener c;
    private String d;
    private int e;
    private int f;
    private double g;
    private String h;
    private String i;
    private long j;
    private long k;
    private int l;
    private int m;
    protected AdSlot mAdSlot;
    protected GMAdSlotBase mGMAdSlotBase;
    protected int mSubAdType;
    protected j mTTExtraModel;
    protected k mWaterFallConfig;
    protected String mWaterfallAbTestParam;
    private int n;
    private i o;
    private int p;
    private int q;
    private String r;
    private int s;
    private boolean t;
    private int u;
    private boolean a = false;
    private boolean b = false;
    private volatile long v = -1;

    /* loaded from: classes.dex */
    public interface AdapterLoaderListener {
        void onAdFailed(AdError adError, d dVar);

        void onAdLoaded(TTBaseAd tTBaseAd, d dVar);

        void onAdLoaded(List<TTBaseAd> list, d dVar);

        void onAdVideoCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class CallBackRunnable implements Runnable {
        private String a;
        private TTBaseAd b;
        private List<TTBaseAd> c;
        private AdError d;
        private String e;
        private long f;
        private boolean g;

        CallBackRunnable(String str, TTBaseAd tTBaseAd, List<TTBaseAd> list, AdError adError, String str2, long j, boolean z) {
            this.a = str;
            this.b = tTBaseAd;
            this.c = list;
            this.d = adError;
            this.e = str2;
            this.f = j;
            this.g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TTBaseAd tTBaseAd;
            TTBaseAd tTBaseAd2;
            String str;
            String str2;
            String str3;
            String str4;
            String sb;
            if (TTAbsAdLoaderAdapter.this.c != null) {
                d dVar = new d();
                dVar.a(TTAbsAdLoaderAdapter.this.mAdSlot.getAdType()).e(TTAbsAdLoaderAdapter.this.mSubAdType).b(TTAbsAdLoaderAdapter.this.q).c(TTAbsAdLoaderAdapter.this.e).d(TTAbsAdLoaderAdapter.this.f).a(TTAbsAdLoaderAdapter.this.getAdNetWorkName()).c(TTAbsAdLoaderAdapter.this.getCustomAdNetWorkName()).b(TTAbsAdLoaderAdapter.this.r);
                TTBaseAd tTBaseAd3 = null;
                if ("adload_ads".equals(this.a) || "adload_ad".equals(this.a)) {
                    if ("adload_ads".equals(this.a)) {
                        List<TTBaseAd> list = this.c;
                        int size = list != null ? list.size() : 0;
                        List<TTBaseAd> list2 = this.c;
                        int i = (list2 == null || list2.size() <= 0) ? 20001 : 20000;
                        Iterator<TTBaseAd> it = this.c.iterator();
                        loop0: while (true) {
                            tTBaseAd2 = tTBaseAd3;
                            while (it.hasNext()) {
                                tTBaseAd3 = it.next();
                                if (tTBaseAd3 != null) {
                                    TTAbsAdLoaderAdapter.this.b(tTBaseAd3);
                                    if (tTBaseAd2 == null) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (TTAbsAdLoaderAdapter.this.isClientBidding() || TTAbsAdLoaderAdapter.this.isMultiBidding() || TTAbsAdLoaderAdapter.this.isServerBidding()) {
                            for (TTBaseAd tTBaseAd4 : this.c) {
                                if (tTBaseAd4 != null) {
                                    TTAbsAdLoaderAdapter.this.a(i, tTBaseAd4, 1, this.e, this.f);
                                }
                            }
                        } else {
                            TTAbsAdLoaderAdapter.this.a(i, tTBaseAd2, size, this.e, this.f);
                        }
                        if (TTAbsAdLoaderAdapter.this.c != null) {
                            TTAbsAdLoaderAdapter.this.c.onAdLoaded(this.c, dVar);
                        }
                        if (!TTAbsAdLoaderAdapter.this.isServerBidding() || i0.b(this.c)) {
                            return;
                        }
                        tTBaseAd = this.c.get(0);
                    } else {
                        TTBaseAd tTBaseAd5 = this.b;
                        int i2 = tTBaseAd5 != null ? 20000 : 20001;
                        TTAbsAdLoaderAdapter.this.b(tTBaseAd5);
                        TTAbsAdLoaderAdapter.this.a(i2, this.b, 1, this.e, this.f);
                        if (TTAbsAdLoaderAdapter.this.c != null) {
                            TTAbsAdLoaderAdapter.this.c.onAdLoaded(this.b, dVar);
                        }
                        if (!TTAbsAdLoaderAdapter.this.isServerBidding()) {
                            return;
                        }
                        tTBaseAd = this.b;
                    }
                    TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = TTAbsAdLoaderAdapter.this;
                    h.a(tTBaseAd, tTAbsAdLoaderAdapter.mAdSlot, tTAbsAdLoaderAdapter.mWaterFallConfig, tTAbsAdLoaderAdapter.k);
                } else if (!"failed".equals(this.a)) {
                    if ("ad_video_cache".equals(this.a)) {
                        if (this.b == null || !(TTAbsAdLoaderAdapter.this.s == 10 || TTAbsAdLoaderAdapter.this.s == 8 || TTAbsAdLoaderAdapter.this.s == 7)) {
                            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(TTAbsAdLoaderAdapter.this.d, TTLogUtil.TAG_EVENT_FILL) + "onAdVideoCache-----ttAd=" + this.b);
                            return;
                        }
                        TTAbsAdLoaderAdapter.this.b(this.b);
                        AdError adError = this.d;
                        if (adError != null && adError.code == 30010 && TTAbsAdLoaderAdapter.this.a()) {
                            ThreadHelper.postDelayOnMSDKThread(new Runnable() { // from class: com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.CallBackRunnable.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    CallBackRunnable.this.b.setCacheSuccess(true);
                                    CallBackRunnable callBackRunnable = CallBackRunnable.this;
                                    TTAbsAdLoaderAdapter.this.a(callBackRunnable.b);
                                    if (TTAbsAdLoaderAdapter.this.isServerBidding()) {
                                        TTBaseAd tTBaseAd6 = CallBackRunnable.this.b;
                                        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter2 = TTAbsAdLoaderAdapter.this;
                                        h.a(tTBaseAd6, tTAbsAdLoaderAdapter2.mAdSlot, tTAbsAdLoaderAdapter2.mWaterFallConfig);
                                    }
                                    if (TTAbsAdLoaderAdapter.this.c != null) {
                                        TTAbsAdLoaderAdapter.this.c.onAdVideoCache();
                                    }
                                }
                            }, 1000L);
                            return;
                        }
                        this.b.setCacheSuccess(true);
                        TTAbsAdLoaderAdapter.this.a(this.b);
                        if (TTAbsAdLoaderAdapter.this.isServerBidding()) {
                            TTBaseAd tTBaseAd6 = this.b;
                            TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter2 = TTAbsAdLoaderAdapter.this;
                            h.a(tTBaseAd6, tTAbsAdLoaderAdapter2.mAdSlot, tTAbsAdLoaderAdapter2.mWaterFallConfig);
                        }
                        if (TTAbsAdLoaderAdapter.this.c != null) {
                            TTAbsAdLoaderAdapter.this.c.onAdVideoCache();
                        }
                    }
                } else {
                    TTBaseAd tTBaseAd7 = this.b;
                    if (tTBaseAd7 != null) {
                        String valueOf = String.valueOf(tTBaseAd7.getCpm());
                        str2 = this.b.getLevelTag();
                        str = valueOf;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (TTAbsAdLoaderAdapter.this.q == 2 || !this.g) {
                        str3 = "TTMediationSDK";
                        AdError adError2 = this.d;
                        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter3 = TTAbsAdLoaderAdapter.this;
                        h.a(adError2, tTAbsAdLoaderAdapter3.mAdSlot, tTAbsAdLoaderAdapter3.mWaterFallConfig, tTAbsAdLoaderAdapter3.l, TTAbsAdLoaderAdapter.this.m, TTAbsAdLoaderAdapter.this.n, TTAbsAdLoaderAdapter.this.getSdkVersion(), TTAbsAdLoaderAdapter.this.k);
                    } else {
                        AdError adError3 = this.d;
                        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter4 = TTAbsAdLoaderAdapter.this;
                        str3 = "TTMediationSDK";
                        h.a(adError3, tTAbsAdLoaderAdapter4.mAdSlot, tTAbsAdLoaderAdapter4.mWaterFallConfig, tTAbsAdLoaderAdapter4.l, TTAbsAdLoaderAdapter.this.m, TTAbsAdLoaderAdapter.this.n, TTAbsAdLoaderAdapter.this.getSdkVersion(), TTAbsAdLoaderAdapter.this.k, str, str2, this.e, this.f);
                    }
                    if (this.d != null) {
                        if (b.c) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(TTLogUtil.getTagThirdLevelByEvent(TTAbsAdLoaderAdapter.this.d, TTLogUtil.TAG_EVENT_FILL_FAIL));
                            sb2.append("AdNetWorkName[");
                            sb2.append(TTAbsAdLoaderAdapter.this.getAllAdNetWorkName());
                            sb2.append("] AdUnitId[");
                            sb2.append(TTAbsAdLoaderAdapter.this.r);
                            sb2.append("] AdType[");
                            TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter5 = TTAbsAdLoaderAdapter.this;
                            AdSlot adSlot = tTAbsAdLoaderAdapter5.mAdSlot;
                            String adNetWorkName = tTAbsAdLoaderAdapter5.getAdNetWorkName();
                            int adType = TTAbsAdLoaderAdapter.this.mAdSlot.getAdType();
                            TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter6 = TTAbsAdLoaderAdapter.this;
                            sb2.append(tTAbsAdLoaderAdapter5.a(adSlot, adNetWorkName, a.a(adType, tTAbsAdLoaderAdapter6.mSubAdType, tTAbsAdLoaderAdapter6.mWaterFallConfig, tTAbsAdLoaderAdapter6.mAdSlot.getAdStyleType())));
                            sb2.append("] 请求失败 (loadSort=");
                            sb2.append(TTAbsAdLoaderAdapter.this.e);
                            sb2.append(",showSort=");
                            sb2.append(TTAbsAdLoaderAdapter.this.f);
                            sb2.append("),error=");
                            sb2.append(this.d.thirdSdkErrorCode);
                            sb2.append(",msg=");
                            sb2.append(this.d.thirdSdkErrorMessage);
                            sb = sb2.toString();
                            str4 = str3;
                        } else {
                            str4 = str3;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(TTLogUtil.getTagThirdLevelByEvent(TTAbsAdLoaderAdapter.this.d, TTLogUtil.TAG_EVENT_FILL_FAIL));
                            sb3.append("AdNetWorkName[");
                            sb3.append(TTAbsAdLoaderAdapter.this.getAllAdNetWorkName());
                            sb3.append("] AdType[");
                            TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter7 = TTAbsAdLoaderAdapter.this;
                            AdSlot adSlot2 = tTAbsAdLoaderAdapter7.mAdSlot;
                            String adNetWorkName2 = tTAbsAdLoaderAdapter7.getAdNetWorkName();
                            int adType2 = TTAbsAdLoaderAdapter.this.mAdSlot.getAdType();
                            TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter8 = TTAbsAdLoaderAdapter.this;
                            sb3.append(tTAbsAdLoaderAdapter7.a(adSlot2, adNetWorkName2, a.a(adType2, tTAbsAdLoaderAdapter8.mSubAdType, tTAbsAdLoaderAdapter8.mWaterFallConfig, tTAbsAdLoaderAdapter8.mAdSlot.getAdStyleType())));
                            sb3.append("] 请求失败 error=");
                            sb3.append(this.d.thirdSdkErrorCode);
                            sb3.append(",msg=");
                            sb3.append(this.d.thirdSdkErrorMessage);
                            sb = sb3.toString();
                        }
                        Logger.e(str4, sb);
                        if (TTAbsAdLoaderAdapter.this.mWaterFallConfig != null) {
                            String str5 = this.d.thirdSdkErrorCode + "";
                            String a = TTAbsAdLoaderAdapter.this.a(this.d.thirdSdkErrorMessage);
                            Logger.e(str4, "errorCode = " + str5 + " errorCodeList = " + a);
                            c a2 = c.a();
                            String e = TTAbsAdLoaderAdapter.this.mWaterFallConfig.e();
                            String d = TTAbsAdLoaderAdapter.this.mWaterFallConfig.d();
                            TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter9 = TTAbsAdLoaderAdapter.this;
                            a2.a(e, d, tTAbsAdLoaderAdapter9.a(tTAbsAdLoaderAdapter9.mWaterFallConfig.e(), str5, a));
                        }
                    }
                    if (TTAbsAdLoaderAdapter.this.c != null) {
                        TTAbsAdLoaderAdapter.this.c.onAdFailed(this.d, dVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(AdSlot adSlot, String str, String str2) {
        return adSlot == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        ArrayList<String> arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int i = 0;
        while (true) {
            if (i >= charArray.length) {
                break;
            }
            char c = charArray[i];
            if (c >= '0' && c <= '9') {
                sb.append(c);
                if (i == charArray.length - 1) {
                    arrayList.add(sb.toString());
                    break;
                }
            } else if (sb.length() > 0) {
                arrayList.add(sb.toString());
                sb.delete(0, sb.length());
            }
            if (arrayList.size() > 0) {
                return (String) arrayList.get(0);
            }
            i++;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : arrayList) {
            sb2.append(str2);
            sb2.append("_");
        }
        if (sb2.length() > 0) {
            sb2.delete(sb2.length() - 1, sb2.length());
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3) && str.equals("gdt")) {
            return str2 + "_" + str3;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, TTBaseAd tTBaseAd, int i2, String str, long j) {
        StringBuilder sb;
        String str2;
        String str3 = i == 20000 ? AdError.AD_LOAD_SUCCESS_MSG : AdError.ERROR_MEDIA_REQUEST_SUCCESS_NO_ADS_MSG;
        int i3 = 0;
        j jVar = this.mTTExtraModel;
        if (jVar != null && jVar.f) {
            i3 = 1;
        }
        int i4 = i3;
        if (this.q != 2 && tTBaseAd != null) {
            h.a(tTBaseAd, i, str3, this.k, this.mAdSlot, this.l, i2, i4, str, j, this.v != -1 ? SystemClock.elapsedRealtime() - this.v : -1L);
        }
        if (b.c) {
            sb = new StringBuilder();
            sb.append(TTLogUtil.getTagThirdLevelByEvent(this.d, TTLogUtil.TAG_EVENT_FILL));
            sb.append("AdNetWorkName[");
            sb.append(getAllAdNetWorkName());
            sb.append("] AdUnitId[");
            sb.append(this.r);
            sb.append("] AdType[");
            sb.append(a(this.mAdSlot, getAdNetWorkName(), a.a(this.mAdSlot.getAdType(), this.mSubAdType, this.mWaterFallConfig, this.mAdSlot.getAdStyleType())));
            sb.append("] 请求成功 (loadSort=");
            sb.append(this.e);
            sb.append(",showSort=");
            sb.append(this.f);
            str2 = ")";
        } else {
            sb = new StringBuilder();
            sb.append(TTLogUtil.getTagThirdLevelByEvent(this.d, TTLogUtil.TAG_EVENT_FILL));
            sb.append("AdNetWorkName[");
            sb.append(getAllAdNetWorkName());
            sb.append("] AdType[");
            sb.append(a(this.mAdSlot, getAdNetWorkName(), a.a(this.mAdSlot.getAdType(), this.mSubAdType, this.mWaterFallConfig, this.mAdSlot.getAdStyleType())));
            str2 = "] 请求成功";
        }
        sb.append(str2);
        Logger.i("TTMediationSDK", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TTBaseAd tTBaseAd) {
        StringBuilder sb;
        String str;
        if (this.q != 2 && tTBaseAd != null) {
            h.a(this.mAdSlot, tTBaseAd, this.mWaterFallConfig);
        }
        if (b.c) {
            sb = new StringBuilder();
            sb.append(TTLogUtil.getTagThirdLevelByEvent(this.d, TTLogUtil.TAG_EVENT_FILL));
            sb.append("AdNetWorkName[");
            sb.append(getAllAdNetWorkName());
            sb.append("] AdUnitId[");
            sb.append(this.r);
            sb.append("] AdType[");
            sb.append(a.a(this.mAdSlot.getAdType(), this.mSubAdType, this.mWaterFallConfig, this.mAdSlot.getAdStyleType()));
            sb.append("] 视频缓存成功 (loadSort=");
            sb.append(this.e);
            sb.append(",showSort=");
            sb.append(this.f);
            str = ")";
        } else {
            sb = new StringBuilder();
            sb.append(TTLogUtil.getTagThirdLevelByEvent(this.d, TTLogUtil.TAG_EVENT_FILL));
            sb.append("AdNetWorkName[");
            sb.append(getAllAdNetWorkName());
            sb.append("] AdType[");
            sb.append(a.a(this.mAdSlot.getAdType(), this.mSubAdType, this.mWaterFallConfig, this.mAdSlot.getAdStyleType()));
            str = "] 视频缓存成功 ";
        }
        sb.append(str);
        Logger.i("TTMediationSDK", sb.toString());
    }

    private final void a(TTBaseAd tTBaseAd, AdError adError, boolean z) {
        this.b = true;
        if (this.a) {
            return;
        }
        this.a = true;
        this.k = System.currentTimeMillis() - this.j;
        a("failed", tTBaseAd, (List<TTBaseAd>) null, adError, z);
    }

    private void a(String str, TTBaseAd tTBaseAd, List<TTBaseAd> list, AdError adError, boolean z) {
        String str2;
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (u.a(this.mWaterFallConfig)) {
            str2 = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        } else {
            str2 = null;
            j = -1;
        }
        ThreadHelper.runOnMSDKThread(new CallBackRunnable(str, tTBaseAd, list, adError, str2, j, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().N() && (z.e(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()) || z.f(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(TTBaseAd tTBaseAd) {
        k kVar;
        if (tTBaseAd == null) {
            return;
        }
        int i = this.q;
        if (i == 0 || i == 100) {
            double d = this.g;
            if (d != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                tTBaseAd.setCpm(d);
            }
        }
        if (isServerBidding() && (kVar = this.mWaterFallConfig) != null) {
            tTBaseAd.setServerBiddingShowCpm(kVar.w());
            tTBaseAd.setServerBiddingLoadCpm(this.mWaterFallConfig.v());
            if (this.mWaterFallConfig.x() != null) {
                tTBaseAd.setAid(this.mWaterFallConfig.x().c());
                tTBaseAd.setAdExtra(this.mWaterFallConfig.x().a());
                tTBaseAd.setWinCallback(this.mWaterFallConfig.x().j());
                tTBaseAd.setFailCallback(this.mWaterFallConfig.x().e());
                tTBaseAd.setPricingType(this.mWaterFallConfig.x().h());
            }
        }
        tTBaseAd.setAdNetworkSlotType(this.q);
        tTBaseAd.setLoadSort(this.e);
        tTBaseAd.setShowSort(this.f);
        tTBaseAd.setSdkVersion(getSdkVersion());
        k kVar2 = this.mWaterFallConfig;
        tTBaseAd.setAdNetWorkName(kVar2 != null ? kVar2.e() : getAdNetWorkName());
        k kVar3 = this.mWaterFallConfig;
        tTBaseAd.setCustomAdNetWorkName(kVar3 != null ? kVar3.h() : null);
        tTBaseAd.setExchangeRate(this.i);
        tTBaseAd.setAdNetworkSlotId(this.r);
        tTBaseAd.setRit(this.d);
        tTBaseAd.putEventParam("waterfall_abtest", this.mWaterfallAbTestParam);
        tTBaseAd.setSdkNum(a.a(getAdNetWorkName()));
        tTBaseAd.setMediationRitReqTypeFromRealReq(this.m);
        tTBaseAd.setMediationRitReqTypeSrcFromRealReq(this.n);
        tTBaseAd.setLinkIdFromRealReq(this.h);
        tTBaseAd.setMediationRitReqType(this.m);
        tTBaseAd.setMediationRitReqTypeSrc(this.n);
        k kVar4 = this.mWaterFallConfig;
        tTBaseAd.setOriginType(kVar4 != null ? kVar4.s() : -1);
        tTBaseAd.setSubAdType(this.mSubAdType);
        tTBaseAd.setAdType(this.s);
        j0.a(tTBaseAd, this.mWaterFallConfig, this.mAdSlot, false);
        j jVar = this.mTTExtraModel;
        if (jVar != null) {
            int i2 = jVar.b;
            tTBaseAd.putEventParam("if_test", Integer.valueOf(i2 == 1 ? i2 : 0));
            tTBaseAd.putEventParam("server_bidding_extra", this.mTTExtraModel.a);
            AdSlot adSlot = this.mAdSlot;
            int mediationRitReqType = tTBaseAd.getMediationRitReqType(adSlot != null ? adSlot.getLinkedId() : null);
            if (mediationRitReqType == 1 || mediationRitReqType == 2) {
                tTBaseAd.setTimeoutFill(this.mTTExtraModel.e);
            }
        }
        i iVar = this.o;
        if (iVar == null || iVar.d() == null) {
            return;
        }
        tTBaseAd.putExtraMsg("extra_data_and_no_parse", this.o.d());
    }

    public abstract void destroy();

    public final int getAdLoadCount() {
        return this.p;
    }

    public abstract String getAdNetWorkName();

    public final String getAdSlotId() {
        return this.r;
    }

    public String getAdapterRit() {
        return this.d;
    }

    public final String getAdm() {
        i iVar;
        if (isServerBidding() && (iVar = this.o) != null) {
            return iVar.b();
        }
        return null;
    }

    public String getAllAdNetWorkName() {
        if (this.mWaterFallConfig == null || !bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().h(this.mWaterFallConfig.e())) {
            return getAdNetWorkName();
        }
        return this.mWaterFallConfig.h() + "_" + this.mWaterFallConfig.e();
    }

    public String getBiddingToken(Context context, String str, GMAdSlotBase gMAdSlotBase) {
        return null;
    }

    public String getClientReqId() {
        String str = !TextUtils.isEmpty(this.h) ? this.h : null;
        if (TextUtils.isEmpty(this.r)) {
            return str;
        }
        return (str + "_") + this.r;
    }

    public String getCustomAdNetWorkName() {
        if (this.mWaterFallConfig == null || !bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().h(this.mWaterFallConfig.e())) {
            return null;
        }
        return this.mWaterFallConfig.h();
    }

    public final Object getExtraDataNoParse() {
        i iVar;
        if (isServerBidding() && (iVar = this.o) != null) {
            return iVar.d();
        }
        return null;
    }

    public int getIfTest() {
        j jVar = this.mTTExtraModel;
        if (jVar != null) {
            return jVar.b;
        }
        return 0;
    }

    public int getReqBiddingType() {
        return this.q;
    }

    public abstract String getSdkVersion();

    public boolean hasNotifyFail() {
        return this.b;
    }

    public boolean hasNotifySuccess() {
        return this.a;
    }

    public boolean isClientBidding() {
        return this.q == 1;
    }

    public boolean isMultiBidding() {
        return this.q == 3;
    }

    public boolean isServerBidding() {
        return this.q == 2;
    }

    public abstract void loadAd(Context context, Map<String, Object> map);

    public final void loadAdInter(final Context context, k kVar, Map<String, Object> map, AdSlot adSlot, j jVar, int i, GMAdSlotBase gMAdSlotBase) {
        Map<String, Object> map2;
        this.a = false;
        this.b = false;
        this.mWaterFallConfig = kVar;
        this.d = adSlot.getAdUnitId();
        this.p = adSlot.getAdCount();
        this.h = adSlot.getLinkedId();
        this.s = adSlot.getAdType();
        this.mSubAdType = kVar.z();
        this.e = kVar.p();
        this.f = kVar.y();
        this.r = kVar.d();
        this.o = kVar.x();
        this.i = kVar.j();
        this.mAdSlot = adSlot;
        this.mTTExtraModel = jVar;
        this.q = kVar.f();
        this.mWaterfallAbTestParam = kVar.A();
        this.l = i;
        this.mGMAdSlotBase = gMAdSlotBase;
        Object obj = map.get("key_mediation_rit_req_type");
        this.m = obj != null ? ((Integer) obj).intValue() : 1;
        Object obj2 = map.get("key_mediation_rit_req_type_src");
        this.n = obj2 != null ? ((Integer) obj2).intValue() : 1;
        Object obj3 = map.get("key_is_from_developer_req");
        this.t = obj3 != null && ((Boolean) obj3).booleanValue();
        Object obj4 = map.get("key_requestwfb_ms");
        long longValue = obj4 instanceof Long ? ((Long) obj4).longValue() : -1L;
        Object obj5 = map.get("const_is_custom");
        boolean z = obj5 != null && ((Boolean) obj5).booleanValue();
        if (kVar == null || kVar.G()) {
            map2 = map;
        } else {
            this.u = this.m == 4 ? 3 : 0;
            String sdkVersion = getSdkVersion();
            boolean z2 = this.t;
            int i2 = this.u;
            int i3 = this.m;
            int i4 = this.n;
            j jVar2 = this.mTTExtraModel;
            map2 = map;
            h.a(kVar, adSlot, sdkVersion, z2, i2, i, i3, i4, (AdError) null, longValue, jVar2 != null ? jVar2.e : false, false);
        }
        this.g = (isServerBidding() || isClientBidding() || isMultiBidding()) ? PangleAdapterUtils.CPM_DEFLAUT_VALUE : kVar.i();
        this.j = System.currentTimeMillis();
        if (kVar != null && !z) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().e(kVar.d(), getSdkVersion());
        }
        if (kVar != null && (TextUtils.equals("mintegral", kVar.e()) || TextUtils.equals("baidu", kVar.e()) || TextUtils.equals("admob", kVar.e()))) {
            final Map<String, Object> map3 = map2;
            ThreadHelper.runOnUiThread(new Runnable() { // from class: com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TTAbsAdLoaderAdapter.this.loadAd(context, map3);
                    } catch (Throwable th) {
                        TTAbsAdLoaderAdapter.this.notifyAdFailed(new AdError("主线程ADN请求广告崩溃"));
                        th.printStackTrace();
                    }
                }
            });
            return;
        }
        try {
            loadAd(context, map2);
        } catch (Throwable th) {
            notifyAdFailed(new AdError("子线程ADN请求广告崩溃"));
            th.printStackTrace();
        }
    }

    public final void nativeDislikeClick(TTBaseAd tTBaseAd, String str, Map<String, Object> map) {
        if (tTBaseAd == null || tTBaseAd.getAdType() != 5) {
            return;
        }
        h.a(tTBaseAd, this.mAdSlot, str);
    }

    public final void notifyAdFailed(AdError adError) {
        a((TTBaseAd) null, adError, true);
    }

    public final void notifyAdLoaded(GMCustomAd gMCustomAd) {
        notifyAdLoaded(gMCustomAd.getTTBaseAd());
    }

    public final void notifyAdLoaded(TTBaseAd tTBaseAd) {
        int i;
        if (this.v == -1) {
            this.v = SystemClock.elapsedRealtime();
        }
        if (tTBaseAd != null) {
            tTBaseAd.setAdNetworkSlotType(this.q);
            tTBaseAd.setExchangeRate(this.i);
            tTBaseAd.setFillTime(SystemClock.elapsedRealtime());
            j0.a(tTBaseAd, this.mWaterFallConfig, this.mAdSlot, true);
            AdSlot adSlot = this.mAdSlot;
            if (adSlot != null && ((i = this.q) == 1 || i == 3)) {
                double bidFloor = adSlot.getBidFloor();
                if (bidFloor > PangleAdapterUtils.CPM_DEFLAUT_VALUE && bidFloor > tTBaseAd.getCpm()) {
                    a(tTBaseAd, new AdError(AdError.ERROR_CODE_BIDDING_PRICE_LOW, AdError.getMessage(AdError.ERROR_CODE_BIDDING_PRICE_LOW)), true);
                    return;
                }
            }
        }
        if (this.a) {
            return;
        }
        this.a = true;
        this.k = System.currentTimeMillis() - this.j;
        a("adload_ad", tTBaseAd, (List<TTBaseAd>) null, (AdError) null, true);
        k kVar = this.mWaterFallConfig;
        if (kVar != null && kVar.t() == 10 && this.mSubAdType == 1) {
            notifyAdVideoCache(tTBaseAd, (AdError) null);
        }
    }

    public final void notifyAdLoaded(List<TTBaseAd> list) {
        int i;
        int i2;
        long j;
        String str;
        long j2 = -1;
        if (this.v == -1) {
            this.v = SystemClock.elapsedRealtime();
        }
        if (list != null) {
            for (TTBaseAd tTBaseAd : list) {
                if (tTBaseAd != null) {
                    tTBaseAd.setFillTime(SystemClock.elapsedRealtime());
                }
            }
        }
        List<TTBaseAd> arrayList = new ArrayList<>();
        if (!i0.a(list)) {
            arrayList.addAll(list);
        }
        if (!i0.b(list) && ((i = this.q) == 1 || i == 3)) {
            for (TTBaseAd tTBaseAd2 : list) {
                tTBaseAd2.setAdNetworkSlotType(this.q);
                tTBaseAd2.setExchangeRate(this.i);
                j0.a(tTBaseAd2, this.mWaterFallConfig, this.mAdSlot, true);
                AdSlot adSlot = this.mAdSlot;
                if (adSlot != null && ((i2 = this.q) == 1 || i2 == 3)) {
                    double bidFloor = adSlot.getBidFloor();
                    if (bidFloor > PangleAdapterUtils.CPM_DEFLAUT_VALUE && bidFloor > tTBaseAd2.getCpm()) {
                        arrayList.remove(tTBaseAd2);
                        double cpm = tTBaseAd2.getCpm();
                        String levelTag = tTBaseAd2.getLevelTag();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (u.a(this.mWaterFallConfig)) {
                            str = u.b(Thread.currentThread().getStackTrace());
                            j = System.currentTimeMillis() - currentTimeMillis;
                        } else {
                            j = j2;
                            str = null;
                        }
                        h.a(new AdError(AdError.ERROR_CODE_BIDDING_PRICE_LOW, AdError.getMessage(AdError.ERROR_CODE_BIDDING_PRICE_LOW)), this.mAdSlot, this.mWaterFallConfig, this.l, this.m, this.n, getSdkVersion(), this.k, String.valueOf(cpm), levelTag, str, j);
                        j2 = -1;
                    }
                }
            }
            if (arrayList.size() <= 0) {
                a((TTBaseAd) null, new AdError(AdError.ERROR_CODE_BIDDING_PRICE_LOW, AdError.getMessage(AdError.ERROR_CODE_BIDDING_PRICE_LOW)), false);
                return;
            }
        }
        if (this.a) {
            return;
        }
        this.a = true;
        this.k = System.currentTimeMillis() - this.j;
        a("adload_ads", (TTBaseAd) null, arrayList, (AdError) null, true);
    }

    public final void notifyAdLoadedCustom(List<? extends GMCustomAd> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (GMCustomAd gMCustomAd : list) {
                arrayList.add(gMCustomAd.getTTBaseAd());
            }
            notifyAdLoaded(arrayList);
        }
    }

    public final void notifyAdVideoCache(GMCustomAd gMCustomAd, AdError adError) {
        notifyAdVideoCache(gMCustomAd.getTTBaseAd(), adError);
    }

    public final void notifyAdVideoCache(TTBaseAd tTBaseAd, AdError adError) {
        if (this.b) {
            return;
        }
        a("ad_video_cache", tTBaseAd, (List<TTBaseAd>) null, adError, true);
    }

    public void removeFromParent(View view) {
        UIUtils.removeFromParent(view);
    }

    public final void setAdapterListener(AdapterLoaderListener adapterLoaderListener) {
        this.c = adapterLoaderListener;
    }
}
