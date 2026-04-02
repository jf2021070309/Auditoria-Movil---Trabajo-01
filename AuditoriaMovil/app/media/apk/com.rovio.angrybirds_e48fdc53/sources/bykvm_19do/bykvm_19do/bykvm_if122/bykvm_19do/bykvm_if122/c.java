package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.p;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.listener.ITTAdapterBannerAdListener;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.TTRequestExtraParams;
import com.bytedance.msdk.api.v2.GMAdDislike;
import com.bytedance.msdk.api.v2.GMDislikeCallback;
import com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener;
import com.bytedance.msdk.api.v2.ad.banner.GMBannerAdLoadCallback;
import com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo;
import com.bytedance.msdk.api.v2.ad.banner.GMNativeToBannerListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeAdAppInfo;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMViewBinder;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends d implements ITTAdapterBannerAdListener {
    private GMBannerAdListener h0;
    private GMBannerAdLoadCallback i0;
    private boolean j0;
    private GMNativeToBannerListener k0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements GMDislikeCallback {
        final /* synthetic */ View a;

        a(c cVar, View view) {
            this.a = view;
        }

        @Override // com.bytedance.msdk.api.v2.GMDislikeCallback
        public void onCancel() {
        }

        @Override // com.bytedance.msdk.api.v2.GMDislikeCallback
        public void onRefuse() {
        }

        @Override // com.bytedance.msdk.api.v2.GMDislikeCallback
        public void onSelected(int i, String str) {
            View view = this.a;
            if (view != null) {
                View view2 = (View) view.getParent();
                if (view2 instanceof ViewGroup) {
                    ((ViewGroup) view2).removeViewInLayout(this.a);
                }
            }
        }

        @Override // com.bytedance.msdk.api.v2.GMDislikeCallback
        public void onShow() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ AdError a;

        b(AdError adError) {
            this.a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.h0 != null) {
                c.this.h0.onAdShowFail(this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0040c implements GMNativeAdInfo {
        final /* synthetic */ TTBaseAd a;

        C0040c(c cVar, TTBaseAd tTBaseAd) {
            this.a = tTBaseAd;
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public String getActionText() {
            return this.a.getActionText();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public int getAdImageMode() {
            return this.a.getImageMode();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public String getDescription() {
            return this.a.getAdDescription();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public GMAdDislike getDislikeDialog(Activity activity) {
            return getDislikeDialog(activity, null);
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public GMAdDislike getDislikeDialog(Activity activity, Map<String, Object> map) {
            return this.a.getDislikeDialog(activity, map);
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public String getIconUrl() {
            return this.a.getIconUrl();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public List<String> getImageList() {
            return this.a.getImages();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public String getImageUrl() {
            return this.a.getImageUrl();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public int getInteractionType() {
            return this.a.getInteractionType();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public GMNativeAdAppInfo getNativeAdAppInfo() {
            if (this.a.hasAppInfo()) {
                GMNativeAdAppInfo gMNativeAdAppInfo = new GMNativeAdAppInfo();
                gMNativeAdAppInfo.setAppName(this.a.getAppName());
                gMNativeAdAppInfo.setAuthorName(this.a.getAuthorName());
                gMNativeAdAppInfo.setPackageSizeBytes(this.a.getPackageSizeBytes());
                gMNativeAdAppInfo.setPermissionsUrl(this.a.getPermissionsUrl());
                gMNativeAdAppInfo.setPrivacyAgreement(this.a.getPrivacyAgreement());
                gMNativeAdAppInfo.setVersionName(this.a.getVersionName());
                gMNativeAdAppInfo.setPermissionsMap(this.a.getPermissionsMap());
                gMNativeAdAppInfo.setAppInfoExtra(this.a.getAppInfoExtra());
                return gMNativeAdAppInfo;
            }
            return null;
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public String getSource() {
            return this.a.getSource();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public double getStarRating() {
            return this.a.getStarRating();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public String getTitle() {
            return this.a.getAdTitle();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public boolean hasDislike() {
            return this.a.hasDislike();
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMNativeAdInfo
        public void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, GMViewBinder gMViewBinder) {
            this.a.registerViewForInteraction(activity, viewGroup, list, list2, null, gMViewBinder);
        }
    }

    public c(Context context, String str) {
        super(context, str);
        this.j0 = false;
    }

    private void b(boolean z) {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null && tTBaseAd.canAdReuse() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, this.O.getAdNetworkSlotId(), e())) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(this.O.getAdNetworkSlotId(), this.h, this.r, z, this.T, this.v, this.I, this.w);
        }
    }

    private GMNativeAdInfo d(TTBaseAd tTBaseAd) {
        return new C0040c(this, tTBaseAd);
    }

    private void d(AdError adError) {
        ThreadHelper.runOnUiThread(new b(adError));
    }

    private View e(TTBaseAd tTBaseAd) {
        this.O = tTBaseAd;
        this.O.setHasShown(true);
        this.O.setTTAdatperCallback(this.J);
        if (this.O.canAdReuse() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, this.O.getAdNetworkSlotId(), e())) {
            TTBaseAd tTBaseAd2 = this.O;
            a(tTBaseAd2, tTBaseAd2.getAdNetworkSlotId());
        }
        b(false);
        Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW) + "展示的广告类型：" + com.bytedance.msdk.base.a.a(this.O.getAdNetworkPlatformId()) + ",slotId：" + this.O.getAdNetworkSlotId() + ",slotType:" + this.O.getAdNetworkSlotType());
        View adView = this.O.getAdView();
        if (!this.O.isCustomAd() && this.O.getSubAdType() == 4 && this.O.getOriginType() == 2 && !this.O.isExpressAd()) {
            GMNativeToBannerListener gMNativeToBannerListener = this.k0;
            if (gMNativeToBannerListener != null) {
                try {
                    adView = gMNativeToBannerListener.getGMBannerViewFromNativeAd(d(this.O));
                    if (adView == null) {
                        Logger.d("TTMediationSDK", "--==-- banner混出自渲染信息流，getGMBannerViewFromNativeAd()返回null，将无法展示该广告");
                    }
                } catch (Throwable th) {
                    Logger.d("TTMediationSDK", "--==-- banner混出自渲染信息流，getGMBannerViewFromNativeAd()发生异常，将无法展示该广告，信息如下：");
                    th.printStackTrace();
                }
            } else {
                Logger.d("TTMediationSDK", "--==-- banner混出自渲染信息流，但未提供GMNativeToBannerListener，将无法展示该广告");
            }
        }
        if (this.O.hasDislike()) {
            this.O.setDislikeCallback((Activity) this.I, new a(this, adView));
        }
        return adView;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void D() {
        super.D();
        this.h0 = null;
        this.i0 = null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public String J() {
        if (this.j0) {
            return super.J();
        }
        return null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public GMAdEcpmInfo L() {
        if (this.j0) {
            return super.L();
        }
        return null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void Q() {
        GMBannerAdLoadCallback gMBannerAdLoadCallback = this.i0;
        if (gMBannerAdLoadCallback != null) {
            gMBannerAdLoadCallback.onAdLoaded();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void R() {
    }

    public void a(AdSlot adSlot, GMAdSlotBase gMAdSlotBase, GMBannerAdLoadCallback gMBannerAdLoadCallback) {
        if (f0()) {
            this.h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
            AdSlot adSlot2 = this.h;
            if (adSlot2 != null) {
                adSlot2.setAdType(1);
                this.h.setAdCount(1);
            }
            this.i0 = gMBannerAdLoadCallback;
            this.J = this;
            this.w = gMAdSlotBase;
            U();
        }
    }

    public void a(GMBannerAdListener gMBannerAdListener) {
        this.h0 = gMBannerAdListener;
    }

    public void a(GMNativeToBannerListener gMNativeToBannerListener) {
        this.k0 = gMNativeToBannerListener;
    }

    public void a(boolean z) {
        this.r.put(TTRequestExtraParams.PARAM_BANNER_ALLOW_SHOW_CLOSE_BTN, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void b(AdError adError) {
        GMBannerAdLoadCallback gMBannerAdLoadCallback = this.i0;
        if (gMBannerAdLoadCallback != null) {
            gMBannerAdLoadCallback.onAdFailedToLoad(adError);
        }
    }

    public View g0() {
        View view;
        View view2;
        TTBaseAd tTBaseAd;
        TTBaseAd next;
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> a2;
        TTBaseAd tTBaseAd2;
        synchronized (this) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
            view = null;
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, cVar != null ? cVar.G() : null);
            if (this.M) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a((List<TTBaseAd>) null, this.h);
                d(new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD)));
                char c = '\r';
                while (true) {
                    if (c != '\f') {
                        if (c == 14) {
                            break;
                        }
                        c = 14;
                    }
                }
            } else {
                List<TTBaseAd> v = v();
                List<k> M = M();
                if (M != null && M.size() > 0) {
                    HashMap<String, TTBaseAd> d = d(v);
                    view2 = null;
                    for (k kVar : M) {
                        if (kVar != null) {
                            String d2 = kVar.d();
                            TTBaseAd tTBaseAd3 = d.get(d2);
                            if (tTBaseAd3 != null && tTBaseAd3.isReady(this.f) && !tTBaseAd3.isHasShown() && (view2 = e(tTBaseAd3)) != null) {
                                break;
                            } else if (kVar.a() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, d2, e()) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2, this.h, false) == 3 && (a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2, this.h)) != null && a2.size() > 0 && (tTBaseAd2 = a2.get(0).a) != null && tTBaseAd2.isReady(this.f) && !tTBaseAd2.isHasShown()) {
                                c(tTBaseAd2);
                                view2 = e(tTBaseAd2);
                                if (view2 != null) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    view2 = null;
                }
                if (view2 == null && v != null && v.size() > 0) {
                    Iterator<TTBaseAd> it = v.iterator();
                    while (it.hasNext() && ((next = it.next()) == null || !next.isReady(this.f) || next.isHasShown() || (view2 = e(next)) == null)) {
                    }
                }
                if (view2 != null) {
                    this.M = true;
                    if (this.O != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.O);
                        a(arrayList);
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, false);
                    if (this.h0 != null && (tTBaseAd = this.O) != null && tTBaseAd.getAdNetworkPlatformId() == 2) {
                        Logger.d("ADMOB_EVENT", TTLogUtil.getTagThirdLevelById(this.f, this.O.getAdNetworkSlotId()) + "mTTAdBannerListener-->Admob--->onAdShow......");
                        m.b().a(this.f + "");
                        m.b().j(this.f + "");
                        this.h0.onAdShow();
                        if (this.O != null) {
                            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW_LISTEN) + "adSlotId：" + this.O.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(this.O.getAdNetworkPlatformId()));
                            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k.b().a(this.f, this.O.getAdNetworkSlotId());
                            l.b().e(this.f, this.O.getAdNetworkSlotId());
                        }
                        b(true);
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.b(this.O, this.h, 0, null, 0L, false);
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.b(this.f, this.O);
                    }
                    view = view2;
                } else {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(v, this.h);
                    d(new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD)));
                }
            }
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c h0() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c cVar;
        if (this.d == null && (cVar = this.H) != null) {
            this.d = cVar.b(this.f, 100);
            X();
            b0();
        }
        return this.d;
    }

    public boolean i0() {
        return ((Boolean) this.r.get(TTRequestExtraParams.PARAM_BANNER_ALLOW_SHOW_CLOSE_BTN)).booleanValue();
    }

    public boolean j0() {
        List<k> list;
        try {
            list = M();
        } catch (Throwable th) {
            th.printStackTrace();
            list = null;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        return p.a(this.q, this.p, this.o, this.h, this.M, this.b, l(), e(), list, cVar != null ? cVar.G() : null);
    }

    public void k0() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            tTBaseAd.onPause();
        }
    }

    public void l0() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            tTBaseAd.onResume();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
    public void onAdClicked() {
        GMBannerAdListener gMBannerAdListener = this.h0;
        if (gMBannerAdListener != null) {
            gMBannerAdListener.onAdClicked();
        }
        String str = null;
        long currentTimeMillis = System.currentTimeMillis();
        long j = -1;
        if (u.a(this.O)) {
            str = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        }
        TTBaseAd tTBaseAd = this.O;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(tTBaseAd, this.h, 0, str, j, tTBaseAd.isClickListenRepeatOnce());
    }

    @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
    public void onAdClosed() {
        GMBannerAdListener gMBannerAdListener = this.h0;
        if (gMBannerAdListener != null) {
            gMBannerAdListener.onAdClosed();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
    public void onAdLeftApplication() {
        GMBannerAdListener gMBannerAdListener = this.h0;
        if (gMBannerAdListener != null) {
            gMBannerAdListener.onAdLeftApplication();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
    public void onAdOpened() {
        GMBannerAdListener gMBannerAdListener = this.h0;
        if (gMBannerAdListener != null) {
            gMBannerAdListener.onAdOpened();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
    public void onAdShow() {
        this.j0 = true;
        if (this.h0 != null) {
            m b2 = m.b();
            b2.a(this.f + "");
            m b3 = m.b();
            b3.j(this.f + "");
            this.h0.onAdShow();
        }
        if (this.O != null) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW_LISTEN) + "adSlotId：" + this.O.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(this.O.getAdNetworkPlatformId()));
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k.b().a(this.f, this.O.getAdNetworkSlotId());
            l.b().e(this.f, this.O.getAdNetworkSlotId());
        }
        b(true);
        String str = null;
        long currentTimeMillis = System.currentTimeMillis();
        long j = -1;
        if (u.a(this.O)) {
            str = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.b(this.O, this.h, 0, str, j, false);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(1, this.h.getAdUnitId(), this.O.getAdType(), this.O.getCpm());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.b(this.f, this.O);
    }

    @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
    public void onAdShowFail(AdError adError) {
        String str;
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (u.a(this.O)) {
            str = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        } else {
            str = null;
            j = -1;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, adError, 1, 0, str, j);
        d(adError);
    }
}
