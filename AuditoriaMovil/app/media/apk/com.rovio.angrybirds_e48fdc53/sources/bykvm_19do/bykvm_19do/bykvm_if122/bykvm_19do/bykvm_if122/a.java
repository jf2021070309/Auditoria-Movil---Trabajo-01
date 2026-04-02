package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.app.Activity;
import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.r;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.listener.ITTAdapterFullVideoAdListener;
import com.bytedance.msdk.adapter.listener.ITTAdapterInterstitialListener;
import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener;
import com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotInterstitialFull;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d {
    private GMInterstitialFullAdLoadCallback j0;
    private GMInterstitialFullAdListener k0;
    ITTAdapterFullVideoAdListener l0;
    ITTAdapterInterstitialListener m0;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0034a implements d.c {
        C0034a() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d.c
        public void a() {
            a.this.d(new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD)));
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
            if (a.this.k0 != null) {
                a.this.k0.onInterstitialFullShowFail(this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements ITTAdapterFullVideoAdListener {
        c() {
        }

        @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
        public void onFullVideoAdClick() {
            String str;
            String str2;
            String str3 = null;
            if (r.a()) {
                if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.getAdNetWorkName())) {
                    if (!r.a(Thread.currentThread().getStackTrace())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 5, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                        return;
                    } else if (r.b()) {
                        str2 = u.a(Thread.currentThread().getStackTrace());
                        if (!a.this.h0() && a.this.k0 != null) {
                            a.this.k0.onInterstitialFullClick();
                        }
                        str = str2;
                    }
                }
                str2 = null;
                if (!a.this.h0()) {
                    a.this.k0.onInterstitialFullClick();
                }
                str = str2;
            } else {
                if (a.this.k0 != null) {
                    a.this.k0.onInterstitialFullClick();
                }
                str = null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O)) {
                str3 = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 0, str3, j, str, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.isClickListenRepeatOnce());
        }

        @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
        public void onFullVideoAdClosed() {
            if (r.a()) {
                if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.getAdNetWorkName())) {
                    if (!r.a(Thread.currentThread().getStackTrace())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 2, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                        return;
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 2, 0, 0, (String) null);
                }
                if (a.this.h0()) {
                    return;
                }
                a.this.j0();
                if (a.this.k0 == null) {
                    return;
                }
            } else {
                a.this.j0();
                if (a.this.k0 == null) {
                    return;
                }
            }
            a.this.k0.onInterstitialFullClosed();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0131  */
        @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFullVideoAdShow() {
            /*
                Method dump skipped, instructions count: 390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.a.c.onFullVideoAdShow():void");
        }

        @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
        public void onFullVideoAdShowFail(AdError adError) {
            String str;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            } else {
                str = null;
                j = -1;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, adError, 1, 0, str, j);
            a.this.d(adError);
        }

        @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
        public void onRewardVerify(RewardItem rewardItem) {
            if (a.this.k0 != null) {
                a.this.k0.onRewardVerify(i.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, rewardItem, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O));
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
        public void onSkippedVideo() {
            if (r.a()) {
                if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.getAdNetWorkName())) {
                    if (!r.a(Thread.currentThread().getStackTrace())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 3, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                        return;
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 3, 0, 0, (String) null);
                }
                if (a.this.h0()) {
                    return;
                }
                a.this.j0();
                if (a.this.k0 == null) {
                    return;
                }
            } else {
                a.this.j0();
                if (a.this.k0 == null) {
                    return;
                }
            }
            a.this.k0.onSkippedVideo();
        }

        @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
        public void onVideoComplete() {
            if (r.a()) {
                if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.getAdNetWorkName())) {
                    if (!r.a(Thread.currentThread().getStackTrace())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 1, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                        return;
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 1, 0, 0, (String) null);
                }
                if (a.this.h0()) {
                    return;
                }
                a.this.j0();
                if (a.this.k0 == null) {
                    return;
                }
            } else {
                a.this.j0();
                if (a.this.k0 == null) {
                    return;
                }
            }
            a.this.k0.onVideoComplete();
        }

        @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
        public void onVideoError() {
            String str;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            } else {
                str = null;
                j = -1;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, (AdError) null, 2, 0, str, j);
            if (a.this.k0 != null) {
                a.this.k0.onVideoError();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements ITTAdapterInterstitialListener {
        d() {
        }

        @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
        public void onAdLeftApplication() {
            if (a.this.k0 != null) {
                a.this.k0.onAdLeftApplication();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
        public void onAdOpened() {
            if (a.this.k0 != null) {
                a.this.k0.onAdOpened();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
        public void onInterstitialAdClick() {
            if (a.this.k0 != null) {
                a.this.k0.onInterstitialFullClick();
            }
            String str = null;
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 0, str, j, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.isClickListenRepeatOnce());
        }

        @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
        public void onInterstitialClosed() {
            a.this.j0();
            if (a.this.k0 != null) {
                a.this.k0.onInterstitialFullClosed();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
        public void onInterstitialShow() {
            if (a.this.k0 != null) {
                a.this.k0.onInterstitialFullShow();
            }
            m b = m.b();
            b.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).f + "");
            if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O != null) {
                Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).f, TTLogUtil.TAG_EVENT_SHOW_LISTEN) + "adSlotId：" + ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.getAdNetworkPlatformId()));
                k.b().a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).f, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O.getAdNetworkSlotId());
            }
            a.this.g0();
            a aVar = a.this;
            aVar.d(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) aVar).O);
            String str = null;
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.b(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, 0, str, j, false);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.b(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).f, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O);
        }

        @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
        public void onInterstitialShowFail(AdError adError) {
            String str;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            } else {
                str = null;
                j = -1;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) a.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) a.this).h, adError, 1, 0, str, j);
            a.this.d(adError);
        }
    }

    public a(Context context, String str) {
        super(context, str);
        this.l0 = new c();
        this.m0 = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AdError adError) {
        ThreadHelper.runOnUiThread(new b(adError));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void D() {
        super.D();
        this.k0 = null;
        this.j0 = null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void Q() {
        GMInterstitialFullAdLoadCallback gMInterstitialFullAdLoadCallback = this.j0;
        if (gMInterstitialFullAdLoadCallback != null) {
            gMInterstitialFullAdLoadCallback.onInterstitialFullAdLoad();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void R() {
        GMInterstitialFullAdLoadCallback gMInterstitialFullAdLoadCallback = this.j0;
        if (gMInterstitialFullAdLoadCallback != null) {
            gMInterstitialFullAdLoadCallback.onInterstitialFullCached();
        }
    }

    public void a(Activity activity) {
        super.b(activity, null, new C0034a());
    }

    public void a(AdSlot adSlot, GMAdSlotInterstitialFull gMAdSlotInterstitialFull, GMInterstitialFullAdLoadCallback gMInterstitialFullAdLoadCallback) {
        if (f0()) {
            this.h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
            AdSlot adSlot2 = this.h;
            if (adSlot2 != null) {
                adSlot2.setAdType(10);
                this.h.setAdCount(1);
            }
            this.j0 = gMInterstitialFullAdLoadCallback;
            this.J = this.l0;
            this.w = gMAdSlotInterstitialFull;
            U();
        }
    }

    public void a(GMInterstitialFullAdListener gMInterstitialFullAdListener) {
        this.k0 = gMInterstitialFullAdListener;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d
    public void a(TTBaseAd tTBaseAd, Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        ITTAdatperCallback iTTAdatperCallback;
        if (tTBaseAd != null) {
            if (tTBaseAd.getSubAdType() == 1) {
                iTTAdatperCallback = this.m0;
            } else if (tTBaseAd.getSubAdType() == 2) {
                iTTAdatperCallback = this.l0;
            }
            this.J = iTTAdatperCallback;
        }
        super.a(tTBaseAd, activity, map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void b(AdError adError) {
        GMInterstitialFullAdLoadCallback gMInterstitialFullAdLoadCallback = this.j0;
        if (gMInterstitialFullAdLoadCallback != null) {
            gMInterstitialFullAdLoadCallback.onInterstitialFullLoadFail(adError);
        }
    }
}
