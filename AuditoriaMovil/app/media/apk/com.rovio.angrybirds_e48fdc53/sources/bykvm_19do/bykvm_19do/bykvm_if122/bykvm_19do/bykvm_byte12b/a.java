package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_byte12b;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.p;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.v2.GMAdDislike;
import com.bytedance.msdk.api.v2.GMDislikeCallback;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.bytedance.msdk.api.v2.ad.draw.GMDrawAd;
import com.bytedance.msdk.api.v2.ad.draw.GMDrawAdListener;
import com.bytedance.msdk.api.v2.ad.draw.GMDrawCustomVideoReporter;
import com.bytedance.msdk.api.v2.ad.draw.GMDrawExpressAdListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeAdAppInfo;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMViewBinder;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class a implements GMDrawAd, GMVideoListener {
    private TTBaseAd a;
    private AdSlot b;
    private GMDrawAdListener c;
    private d d;
    private GMVideoListener e;
    private boolean f = false;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_byte12b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0032a extends GMDrawCustomVideoReporter {
        final /* synthetic */ GMNativeCustomVideoReporter a;

        C0032a(a aVar, GMNativeCustomVideoReporter gMNativeCustomVideoReporter) {
            this.a = gMNativeCustomVideoReporter;
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoAutoStart() {
            this.a.reportVideoAutoStart();
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoBreak(long j) {
            this.a.reportVideoBreak(j);
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoContinue(long j) {
            this.a.reportVideoContinue(j);
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoError(long j, int i, int i2) {
            this.a.reportVideoError(j, i, i2);
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoFinish() {
            this.a.reportVideoFinish();
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoPause(long j) {
            this.a.reportVideoPause(j);
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoStart() {
            this.a.reportVideoStart();
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoStartError(int i, int i2) {
            this.a.reportVideoStartError(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements GMDrawExpressAdListener {
        b() {
        }

        @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAdListener
        public void onAdClick() {
            if (a.this.c != null) {
                a.this.c.onAdClick();
            }
            String str = null;
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (u.a(a.this.a)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            h.a(a.this.a, a.this.b, 0, str, j, a.this.a.isClickListenRepeatOnce());
        }

        @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAdListener
        public void onAdShow() {
            a.this.f = true;
            if (a.this.c != null) {
                a.this.c.onAdShow();
            }
            if (a.this.b != null && a.this.a != null) {
                Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(a.this.b.getAdUnitId(), TTLogUtil.TAG_EVENT_SHOW_LISTEN) + "adSlotId：" + a.this.a.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(a.this.a.getAdNetworkPlatformId()));
                m b = m.b();
                StringBuilder sb = new StringBuilder();
                sb.append(a.this.b.getAdUnitId());
                sb.append("");
                b.a(sb.toString());
                m b2 = m.b();
                b2.j(a.this.b.getAdUnitId() + "");
                k b3 = k.b();
                b3.a(a.this.b.getAdUnitId() + "", a.this.a.getAdNetworkSlotId());
                l b4 = l.b();
                b4.e(a.this.b.getAdUnitId() + "", a.this.a.getAdNetworkSlotId());
            }
            a.this.d.a(a.this);
            String str = null;
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (u.a(a.this.a)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            String str2 = str;
            long j2 = j;
            boolean isShowListenRepeatOnce = a.this.a.isShowListenRepeatOnce();
            if (!isShowListenRepeatOnce) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(1, a.this.b.getAdUnitId(), a.this.a.getAdType(), a.this.a.getCpm());
            }
            h.b(a.this.a, a.this.b, 0, str2, j2, isShowListenRepeatOnce);
            g.b(a.this.b != null ? a.this.b.getAdUnitId() : "", a.this.a);
        }

        @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawExpressAdListener
        public void onRenderFail(View view, String str, int i) {
            if (a.this.c instanceof GMDrawExpressAdListener) {
                ((GMDrawExpressAdListener) a.this.c).onRenderFail(view, str, i);
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawExpressAdListener
        public void onRenderSuccess(float f, float f2) {
            if (a.this.c instanceof GMDrawExpressAdListener) {
                ((GMDrawExpressAdListener) a.this.c).onRenderSuccess(f, f2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements GMDrawAdListener {
        c() {
        }

        @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAdListener
        public void onAdClick() {
            if (a.this.c != null) {
                a.this.c.onAdClick();
            }
            String str = null;
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (u.a(a.this.a)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            h.a(a.this.a, a.this.b, 0, str, j, a.this.a.isClickListenRepeatOnce());
        }

        @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAdListener
        public void onAdShow() {
            a.this.f = true;
            if (a.this.c != null) {
                a.this.c.onAdShow();
            }
            if (a.this.b != null && a.this.a != null) {
                Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(a.this.b.getAdUnitId(), TTLogUtil.TAG_EVENT_SHOW_LISTEN) + "adSlotId：" + a.this.a.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(a.this.a.getAdNetworkPlatformId()));
                m b = m.b();
                StringBuilder sb = new StringBuilder();
                sb.append(a.this.b.getAdUnitId());
                sb.append("");
                b.a(sb.toString());
                m b2 = m.b();
                b2.j(a.this.b.getAdUnitId() + "");
                k b3 = k.b();
                b3.a(a.this.b.getAdUnitId() + "", a.this.a.getAdNetworkSlotId());
                l b4 = l.b();
                b4.e(a.this.b.getAdUnitId() + "", a.this.a.getAdNetworkSlotId());
            }
            a.this.d.a(a.this);
            String str = null;
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (u.a(a.this.a)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            String str2 = str;
            long j2 = j;
            boolean isShowListenRepeatOnce = a.this.a.isShowListenRepeatOnce();
            if (!isShowListenRepeatOnce) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(1, a.this.b.getAdUnitId(), a.this.a.getAdType(), a.this.a.getCpm());
            }
            h.b(a.this.a, a.this.b, 0, str2, j2, isShowListenRepeatOnce);
            g.b(a.this.b != null ? a.this.b.getAdUnitId() : "", a.this.a);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void a(GMDrawAd gMDrawAd);
    }

    public a(TTBaseAd tTBaseAd, AdSlot adSlot, d dVar) {
        this.a = tTBaseAd;
        this.b = adSlot;
        this.d = dVar;
    }

    private void a() {
        TTBaseAd tTBaseAd;
        GMDrawAdListener cVar;
        if (this.a.isExpressAd()) {
            tTBaseAd = this.a;
            cVar = new b();
        } else {
            tTBaseAd = this.a;
            cVar = new c();
        }
        tTBaseAd.setGMDrawAdListener(cVar);
    }

    public void a(TTBaseAd tTBaseAd) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().x()) {
            h.a(tTBaseAd, this.b, u.a(Thread.currentThread().getStackTrace()), 2);
        }
    }

    public void a(boolean z) {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            tTBaseAd.setHasShown(z);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public boolean canAdReuse() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.canAdReuse();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void destroy() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            try {
                tTBaseAd.onDestroy();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void dislikeClick(String str, Map<String, Object> map) {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            h.a(tTBaseAd, this.b, str);
            this.a.dislikeClick(str, map);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getActionText() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getActionText();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public int getAdImageMode() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getImageMode();
        }
        return -1;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    @Deprecated
    public View getAdLogoView() {
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public int getAdNetworkPlatformId() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getAdNetworkPlatformId();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getAdNetworkPlatformName() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getAdNetWorkName();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getAdNetworkRitId() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getAdNetworkSlotId();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public GMAdEcpmInfo getBestEcpm() {
        if (this.a != null && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().t()) {
            return p.a(this.b, this.a, false);
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getDescription() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getAdDescription();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public GMAdDislike getDislikeDialog(Activity activity) {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getDislikeDialog(activity, null);
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public View getExpressView() {
        h.a(this.b, p.a(this.a));
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd == null || !tTBaseAd.isExpressAd()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.a);
            h.a(arrayList, this.b);
            return null;
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.a();
        }
        TTBaseAd tTBaseAd2 = this.a;
        h.a(tTBaseAd2, this.b, tTBaseAd2.isShowRepeatOnce());
        return this.a.getAdView();
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public Map<String, Object> getExtraMsg() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getExtraMsg();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public GMDrawCustomVideoReporter getGMDrawCustomVideoReporter() {
        TTBaseAd tTBaseAd = this.a;
        GMNativeCustomVideoReporter gMNativeCustomVideoReporter = tTBaseAd != null ? tTBaseAd.getGMNativeCustomVideoReporter() : null;
        if (gMNativeCustomVideoReporter == null) {
            return null;
        }
        return new C0032a(this, gMNativeCustomVideoReporter);
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getIconUrl() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getIconUrl();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public int getImageHeight() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getImageHeight();
        }
        return 0;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public List<String> getImageList() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getImages();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getImageUrl() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getImageUrl();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public int getImageWidth() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getImageWidth();
        }
        return 0;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public int getInteractionType() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getInteractionType();
        }
        return -1;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public Map<String, Object> getMediaExtraInfo() {
        TTBaseAd tTBaseAd = this.a;
        return tTBaseAd != null ? tTBaseAd.getMediaExtraInfo() : new HashMap();
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public GMNativeAdAppInfo getNativeAdAppInfo() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd == null || !tTBaseAd.hasAppInfo()) {
            return null;
        }
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

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getPackageName() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getPackageName();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getPreEcpm() {
        if (this.a == null || !this.f) {
            return null;
        }
        return (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().v() || !(this.a.isServerBiddingAd() || this.a.isClientBiddingAd() || this.a.isMultiBiddingAd())) ? this.a.getNetWorkPlatFormCpm() : GMNetworkPlatformConst.AD_NETWORK_NO_PERMISSION;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public int getSdkNumType() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getAdNetworkPlatformId();
        }
        return -1;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public GMAdEcpmInfo getShowEcpm() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd == null || !this.f) {
            return null;
        }
        return p.a(this.b, tTBaseAd, true);
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getSource() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getSource();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public double getStarRating() {
        TTBaseAd tTBaseAd = this.a;
        return tTBaseAd != null ? tTBaseAd.getStarRating() : PangleAdapterUtils.CPM_DEFLAUT_VALUE;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public TTBaseAd getTTBaseAd() {
        return this.a;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getTitle() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getAdTitle();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public int getVideoHeight() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public String getVideoUrl() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getVideoUrl();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public int getVideoWidth() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public boolean hasDislike() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.hasDislike();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public boolean isExpressAd() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.isExpressAd();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public boolean isHasShown() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.isHasShown();
        }
        return true;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public boolean isReady() {
        AdSlot adSlot;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        h.a(arrayList, (List<TTBaseAd>) null, (List<TTBaseAd>) null, this.b, p.a(this.a));
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd == null || (adSlot = this.b) == null) {
            return false;
        }
        return tTBaseAd.isReady(adSlot.getAdUnitId());
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public boolean isServerBidding() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            return tTBaseAd.isServerBiddingAd();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void onPause() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            tTBaseAd.onPause();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener
    public void onProgressUpdate(long j, long j2) {
        GMVideoListener gMVideoListener = this.e;
        if (gMVideoListener != null) {
            gMVideoListener.onProgressUpdate(j, j2);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener
    public void onVideoCompleted() {
        GMVideoListener gMVideoListener = this.e;
        if (gMVideoListener != null) {
            gMVideoListener.onVideoCompleted();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener
    public void onVideoError(AdError adError) {
        String str;
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (u.a(this.a)) {
            str = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        } else {
            str = null;
            j = -1;
        }
        h.a(this.a, this.b, (AdError) null, 2, 0, str, j);
        GMVideoListener gMVideoListener = this.e;
        if (gMVideoListener != null) {
            gMVideoListener.onVideoError(adError);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener
    public void onVideoPause() {
        GMVideoListener gMVideoListener = this.e;
        if (gMVideoListener != null) {
            gMVideoListener.onVideoPause();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener
    public void onVideoResume() {
        GMVideoListener gMVideoListener = this.e;
        if (gMVideoListener != null) {
            gMVideoListener.onVideoResume();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener
    public void onVideoStart() {
        GMVideoListener gMVideoListener = this.e;
        if (gMVideoListener != null) {
            gMVideoListener.onVideoStart();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, GMViewBinder gMViewBinder) {
        h.a(this.b, p.a(this.a));
        if (this.a == null) {
            h.a((List<TTBaseAd>) null, this.b);
            return;
        }
        a();
        this.a.registerViewForInteraction(activity, viewGroup, list, list2, null, gMViewBinder);
        d dVar = this.d;
        if (dVar != null) {
            dVar.a();
        }
        a(this.a);
        TTBaseAd tTBaseAd = this.a;
        h.a(tTBaseAd, this.b, tTBaseAd.isShowRepeatOnce());
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void render() {
        if (this.a != null) {
            a();
            this.a.render();
            a(this.a);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void resume() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            tTBaseAd.onResume();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void setDislikeCallback(Activity activity, GMDislikeCallback gMDislikeCallback) {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            tTBaseAd.setDislikeCallback(activity, gMDislikeCallback);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void setDrawAdListener(GMDrawAdListener gMDrawAdListener) {
        this.c = gMDrawAdListener;
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void setUseCustomVideo(boolean z) {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            tTBaseAd.setUseCustomVideo(z);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void setVideoListener(GMVideoListener gMVideoListener) {
        this.e = gMVideoListener;
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            tTBaseAd.setTTVideoListener(this);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.draw.GMDrawAd
    public void unregisterView() {
        TTBaseAd tTBaseAd = this.a;
        if (tTBaseAd != null) {
            tTBaseAd.unregisterView();
        }
    }
}
