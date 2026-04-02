package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.app.Activity;
import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.r;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.listener.ITTAdapterFullVideoAdListener;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.TTVideoOptionUtil;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener;
import com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotFullVideo;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.Map;
/* loaded from: classes.dex */
public class f extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d implements ITTAdapterFullVideoAdListener {
    private GMFullVideoAdLoadCallback j0;
    private GMFullVideoAdListener k0;

    /* loaded from: classes.dex */
    class a implements d.c {
        a() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d.c
        public void a() {
            f.this.d(new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD)));
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
            if (f.this.k0 != null) {
                f.this.k0.onFullVideoAdShowFail(this.a);
            }
        }
    }

    public f(Context context, String str) {
        super(context, str);
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
        GMFullVideoAdLoadCallback gMFullVideoAdLoadCallback = this.j0;
        if (gMFullVideoAdLoadCallback != null) {
            gMFullVideoAdLoadCallback.onFullVideoAdLoad();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void R() {
        GMFullVideoAdLoadCallback gMFullVideoAdLoadCallback = this.j0;
        if (gMFullVideoAdLoadCallback != null) {
            gMFullVideoAdLoadCallback.onFullVideoCached();
        }
    }

    public void a(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        super.a(activity, map, new a());
        if (this.k0 == null) {
            Logger.d("TTMediationSDK", "注意：未设置GMFullVideoAdListener，将收不到广告播放/点击/关闭等回调信息");
        }
    }

    public void a(AdSlot adSlot, GMAdSlotFullVideo gMAdSlotFullVideo, GMFullVideoAdLoadCallback gMFullVideoAdLoadCallback) {
        if (f0()) {
            this.j0 = gMFullVideoAdLoadCallback;
            this.h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
            AdSlot adSlot2 = this.h;
            if (adSlot2 != null) {
                adSlot2.setAdType(8);
                this.h.setAdCount(1);
                TTVideoOptionUtil.setFullTTVideoOptionIfNeed(this.h);
            }
            this.J = this;
            this.w = gMAdSlotFullVideo;
            U();
        }
    }

    public void a(GMFullVideoAdListener gMFullVideoAdListener) {
        this.k0 = gMFullVideoAdListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void b(AdError adError) {
        GMFullVideoAdLoadCallback gMFullVideoAdLoadCallback = this.j0;
        if (gMFullVideoAdLoadCallback != null) {
            gMFullVideoAdLoadCallback.onFullVideoLoadFail(adError);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
    public void onFullVideoAdClick() {
        String str;
        String str2;
        GMFullVideoAdListener gMFullVideoAdListener;
        String str3 = null;
        if (r.a()) {
            TTBaseAd tTBaseAd = this.O;
            if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
                if (!r.a(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 5, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                    return;
                } else if (r.b()) {
                    str2 = u.a(Thread.currentThread().getStackTrace());
                    if (!h0() && (gMFullVideoAdListener = this.k0) != null) {
                        gMFullVideoAdListener.onFullVideoAdClick();
                    }
                    str = str2;
                }
            }
            str2 = null;
            if (!h0()) {
                gMFullVideoAdListener.onFullVideoAdClick();
            }
            str = str2;
        } else {
            GMFullVideoAdListener gMFullVideoAdListener2 = this.k0;
            if (gMFullVideoAdListener2 != null) {
                gMFullVideoAdListener2.onFullVideoAdClick();
            }
            str = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = -1;
        if (u.a(this.O)) {
            str3 = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        }
        TTBaseAd tTBaseAd2 = this.O;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(tTBaseAd2, this.h, 0, str3, j, str, tTBaseAd2.isClickListenRepeatOnce());
    }

    @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
    public void onFullVideoAdClosed() {
        GMFullVideoAdListener gMFullVideoAdListener;
        if (r.a()) {
            TTBaseAd tTBaseAd = this.O;
            if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
                if (!r.a(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 2, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 2, 0, 0, (String) null);
            }
            if (h0()) {
                return;
            }
            j0();
            gMFullVideoAdListener = this.k0;
            if (gMFullVideoAdListener == null) {
                return;
            }
        } else {
            j0();
            gMFullVideoAdListener = this.k0;
            if (gMFullVideoAdListener == null) {
                return;
            }
        }
        gMFullVideoAdListener.onFullVideoAdClosed();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFullVideoAdShow() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.f.onFullVideoAdShow():void");
    }

    @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
    public void onFullVideoAdShowFail(AdError adError) {
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

    @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
    public void onRewardVerify(RewardItem rewardItem) {
        GMFullVideoAdListener gMFullVideoAdListener = this.k0;
        if (gMFullVideoAdListener != null) {
            gMFullVideoAdListener.onRewardVerify(i.a(this.h, rewardItem, this.O));
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
    public void onSkippedVideo() {
        GMFullVideoAdListener gMFullVideoAdListener;
        if (r.a()) {
            TTBaseAd tTBaseAd = this.O;
            if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
                if (!r.a(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 3, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 3, 0, 0, (String) null);
            }
            if (h0()) {
                return;
            }
            j0();
            gMFullVideoAdListener = this.k0;
            if (gMFullVideoAdListener == null) {
                return;
            }
        } else {
            j0();
            gMFullVideoAdListener = this.k0;
            if (gMFullVideoAdListener == null) {
                return;
            }
        }
        gMFullVideoAdListener.onSkippedVideo();
    }

    @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
    public void onVideoComplete() {
        GMFullVideoAdListener gMFullVideoAdListener;
        if (r.a()) {
            TTBaseAd tTBaseAd = this.O;
            if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
                if (!r.a(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 1, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 1, 0, 0, (String) null);
            }
            if (h0()) {
                return;
            }
            j0();
            gMFullVideoAdListener = this.k0;
            if (gMFullVideoAdListener == null) {
                return;
            }
        } else {
            j0();
            gMFullVideoAdListener = this.k0;
            if (gMFullVideoAdListener == null) {
                return;
            }
        }
        gMFullVideoAdListener.onVideoComplete();
    }

    @Override // com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener
    public void onVideoError() {
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
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, (AdError) null, 2, 0, str, j);
        GMFullVideoAdListener gMFullVideoAdListener = this.k0;
        if (gMFullVideoAdListener != null) {
            gMFullVideoAdListener.onVideoError();
        }
    }
}
