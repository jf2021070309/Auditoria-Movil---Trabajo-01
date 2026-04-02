package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.app.Activity;
import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.listener.ITTAdapterInterstitialListener;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener;
import com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotInterstitial;
import com.bytedance.msdk.base.TTBaseAd;
/* loaded from: classes.dex */
public class b extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d implements ITTAdapterInterstitialListener {
    private GMInterstitialAdLoadCallback j0;
    private GMInterstitialAdListener k0;

    /* loaded from: classes.dex */
    class a implements d.c {
        a() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d.c
        public void a() {
            b.this.d(new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0035b implements Runnable {
        final /* synthetic */ AdError a;

        RunnableC0035b(AdError adError) {
            this.a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.k0 != null) {
                b.this.k0.onInterstitialShowFail(this.a);
            }
        }
    }

    public b(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AdError adError) {
        ThreadHelper.runOnUiThread(new RunnableC0035b(adError));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void D() {
        super.D();
        this.k0 = null;
        this.j0 = null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void Q() {
        GMInterstitialAdLoadCallback gMInterstitialAdLoadCallback = this.j0;
        if (gMInterstitialAdLoadCallback != null) {
            gMInterstitialAdLoadCallback.onInterstitialLoad();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void R() {
    }

    public void a(Activity activity) {
        a(activity, new a());
    }

    public void a(AdSlot adSlot, GMAdSlotInterstitial gMAdSlotInterstitial, GMInterstitialAdLoadCallback gMInterstitialAdLoadCallback) {
        if (f0()) {
            this.h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
            AdSlot adSlot2 = this.h;
            if (adSlot2 != null) {
                adSlot2.setAdType(2);
                this.h.setAdCount(1);
            }
            this.j0 = gMInterstitialAdLoadCallback;
            this.J = this;
            this.w = gMAdSlotInterstitial;
            U();
        }
    }

    public void a(GMInterstitialAdListener gMInterstitialAdListener) {
        this.k0 = gMInterstitialAdListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void b(AdError adError) {
        GMInterstitialAdLoadCallback gMInterstitialAdLoadCallback = this.j0;
        if (gMInterstitialAdLoadCallback != null) {
            gMInterstitialAdLoadCallback.onInterstitialLoadFail(adError);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
    public void onAdLeftApplication() {
        GMInterstitialAdListener gMInterstitialAdListener = this.k0;
        if (gMInterstitialAdListener != null) {
            gMInterstitialAdListener.onAdLeftApplication();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
    public void onAdOpened() {
        GMInterstitialAdListener gMInterstitialAdListener = this.k0;
        if (gMInterstitialAdListener != null) {
            gMInterstitialAdListener.onAdOpened();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
    public void onInterstitialAdClick() {
        GMInterstitialAdListener gMInterstitialAdListener = this.k0;
        if (gMInterstitialAdListener != null) {
            gMInterstitialAdListener.onInterstitialAdClick();
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

    @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
    public void onInterstitialClosed() {
        GMInterstitialAdListener gMInterstitialAdListener = this.k0;
        if (gMInterstitialAdListener != null) {
            gMInterstitialAdListener.onInterstitialClosed();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
    public void onInterstitialShow() {
        GMInterstitialAdListener gMInterstitialAdListener = this.k0;
        if (gMInterstitialAdListener != null) {
            gMInterstitialAdListener.onInterstitialShow();
        }
        m b = m.b();
        b.a(this.f + "");
        if (this.O != null) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW_LISTEN) + "adSlotId：" + this.O.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(this.O.getAdNetworkPlatformId()));
            k.b().a(this.f, this.O.getAdNetworkSlotId());
        }
        g0();
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

    @Override // com.bytedance.msdk.api.v2.ad.interstitial.GMInterstitialAdListener
    public void onInterstitialShowFail(AdError adError) {
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
