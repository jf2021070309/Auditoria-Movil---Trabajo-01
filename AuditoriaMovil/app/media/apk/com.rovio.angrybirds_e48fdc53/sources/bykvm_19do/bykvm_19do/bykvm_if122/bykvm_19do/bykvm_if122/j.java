package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.p;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener;
import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.TTRequestExtraParams;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashAdLoadCallback;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashCardListener;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashMinWindowListener;
import com.bytedance.msdk.api.v2.slot.GMAdSlotSplash;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class j extends d implements ITTAdapterSplashAdListener {
    private GMSplashAdLoadCallback h0;
    private GMSplashAdListener i0;
    private GMSplashMinWindowListener j0;
    private GMSplashCardListener k0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ AdError a;

        a(AdError adError) {
            this.a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.this.i0 != null) {
                j.this.i0.onAdShowFail(this.a);
            }
        }
    }

    public j(Activity activity, View view, String str) {
        super(activity, str);
    }

    public j(Activity activity, String str) {
        super(activity, str);
    }

    private void a(TTBaseAd tTBaseAd, ViewGroup viewGroup) {
        this.O = tTBaseAd;
        this.O.setHasShown(true);
        this.O.setTTAdatperCallback(this.J);
        if (this.O.canAdReuse() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, this.O.getAdNetworkSlotId(), e())) {
            TTBaseAd tTBaseAd2 = this.O;
            a(tTBaseAd2, tTBaseAd2.getAdNetworkSlotId());
        }
        Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW) + "展示的广告类型：" + com.bytedance.msdk.base.a.a(this.O.getAdNetworkPlatformId()) + ",slotId：" + this.O.getAdNetworkSlotId() + ",slotType:" + this.O.getAdNetworkSlotType());
        m b = m.b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append("");
        b.j(sb.toString());
        l.b().e(this.f, this.O.getAdNetworkSlotId());
        this.O.showSplashAd(viewGroup);
    }

    private void d(AdError adError) {
        ThreadHelper.runOnUiThread(new a(adError));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void D() {
        super.D();
        this.i0 = null;
        this.h0 = null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void Q() {
        GMSplashAdLoadCallback gMSplashAdLoadCallback = this.h0;
        if (gMSplashAdLoadCallback != null) {
            gMSplashAdLoadCallback.onSplashAdLoadSuccess();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void R() {
    }

    public void a(AdSlot adSlot, GMAdSlotSplash gMAdSlotSplash, GMNetworkRequestInfo gMNetworkRequestInfo, GMSplashAdLoadCallback gMSplashAdLoadCallback) {
        a(adSlot, gMAdSlotSplash, gMNetworkRequestInfo, gMSplashAdLoadCallback, -1);
    }

    public void a(AdSlot adSlot, GMAdSlotSplash gMAdSlotSplash, GMNetworkRequestInfo gMNetworkRequestInfo, GMSplashAdLoadCallback gMSplashAdLoadCallback, int i) {
        if (f0()) {
            this.h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
            AdSlot adSlot2 = this.h;
            if (adSlot2 != null) {
                adSlot2.setAdType(3);
                this.h.setAdCount(1);
            }
            this.T = gMNetworkRequestInfo;
            this.h0 = gMSplashAdLoadCallback;
            if (i != -1) {
                this.r.put(TTRequestExtraParams.PARAM_AD_LOAD_TIMEOUT, Integer.valueOf(i));
            }
            this.J = this;
            this.w = gMAdSlotSplash;
            U();
        }
    }

    public void a(GMSplashAdListener gMSplashAdListener) {
        this.i0 = gMSplashAdListener;
    }

    public void a(GMSplashCardListener gMSplashCardListener) {
        this.k0 = gMSplashCardListener;
    }

    public void a(GMSplashMinWindowListener gMSplashMinWindowListener) {
        this.j0 = gMSplashMinWindowListener;
    }

    public boolean a(Rect rect, ITTAdatperCallback iTTAdatperCallback) {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd == null || tTBaseAd.getAdNetworkPlatformId() != 7) {
            return false;
        }
        this.O.showMinWindow(rect, iTTAdatperCallback);
        return true;
    }

    public void b(ViewGroup viewGroup) {
        boolean z;
        AdError adError;
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> a2;
        TTBaseAd tTBaseAd;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        List<k> list = null;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, cVar != null ? cVar.G() : null);
        if (this.M) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a((List<TTBaseAd>) null, this.h);
            adError = new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD));
        } else {
            List<TTBaseAd> v = v();
            if (viewGroup != null) {
                try {
                    list = M();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (list != null && list.size() > 0) {
                    HashMap<String, TTBaseAd> d = d(v);
                    for (k kVar : list) {
                        if (kVar != null) {
                            String d2 = kVar.d();
                            TTBaseAd tTBaseAd2 = d.get(d2);
                            if (tTBaseAd2 != null && tTBaseAd2.isReady(this.f) && !tTBaseAd2.isHasShown()) {
                                a(tTBaseAd2, viewGroup);
                            } else if (kVar.a() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, d2, e()) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2, this.h, false) == 3 && (a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2, this.h)) != null && a2.size() > 0 && (tTBaseAd = a2.get(0).a) != null && tTBaseAd.isReady(this.f) && !tTBaseAd.isHasShown()) {
                                Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW) + "adSlotId：" + tTBaseAd.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd.getAdNetworkPlatformId()) + ",isReady()：" + tTBaseAd.isReady(this.f));
                                c(tTBaseAd);
                                a(tTBaseAd, viewGroup);
                            }
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                boolean z2 = z;
                if (!z && v != null && v.size() > 0) {
                    Iterator<TTBaseAd> it = v.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        TTBaseAd next = it.next();
                        if (next != null && next.isReady(this.f) && !next.isHasShown()) {
                            a(next, viewGroup);
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    this.M = true;
                    if (this.O != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.O);
                        a(arrayList);
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, false);
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(v, this.h);
                adError = new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD));
            } else {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(v, this.h);
                adError = new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD));
            }
        }
        d(adError);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void b(AdError adError) {
        GMSplashAdLoadCallback gMSplashAdLoadCallback = this.h0;
        if (gMSplashAdLoadCallback != null) {
            gMSplashAdLoadCallback.onSplashAdLoadFail(adError);
        }
    }

    protected void g0() {
        if (this.O.canAdReuse() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, this.O.getAdNetworkSlotId(), e())) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(this.O.getAdNetworkSlotId(), this.h, this.r, true, this.T, this.v, this.I, this.w);
        }
    }

    @Override // com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener
    public Activity getActivity() {
        GMSplashCardListener gMSplashCardListener = this.k0;
        if (gMSplashCardListener != null) {
            return gMSplashCardListener.getActivity();
        }
        return null;
    }

    public int[] h0() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            tTBaseAd.getMinWindowSize();
            return null;
        }
        return null;
    }

    public Bitmap i0() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            tTBaseAd.getSplashBitMap();
            return null;
        }
        return null;
    }

    public int j0() {
        return ((Integer) this.r.get(TTRequestExtraParams.PARAM_AD_LOAD_TIMEOUT)).intValue();
    }

    public void k(int i) {
        this.r.put(TTRequestExtraParams.PARAM_AD_LOAD_TIMEOUT, Integer.valueOf(i));
    }

    public boolean k0() {
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

    public void l0() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            tTBaseAd.splashMinWindowAnimationFinish();
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
    public void onAdClicked() {
        GMSplashAdListener gMSplashAdListener = this.i0;
        if (gMSplashAdListener != null) {
            gMSplashAdListener.onAdClicked();
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

    @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
    public void onAdDismiss() {
        GMSplashAdListener gMSplashAdListener = this.i0;
        if (gMSplashAdListener != null) {
            gMSplashAdListener.onAdDismiss();
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(this.I, this.f, e());
    }

    @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
    public void onAdShow() {
        GMSplashAdListener gMSplashAdListener = this.i0;
        if (gMSplashAdListener != null) {
            gMSplashAdListener.onAdShow();
        }
        m b = m.b();
        b.a(this.f + "");
        if (this.O != null) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW_LISTEN) + "adSlotId：" + this.O.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(this.O.getAdNetworkPlatformId()));
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k.b().a(this.f, this.O.getAdNetworkSlotId());
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

    @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
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

    @Override // com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
    public void onAdSkip() {
        GMSplashAdListener gMSplashAdListener = this.i0;
        if (gMSplashAdListener != null) {
            gMSplashAdListener.onAdSkip();
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(this.I, this.f, e());
    }

    @Override // com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener
    public void onMinWindowPlayFinish() {
        GMSplashMinWindowListener gMSplashMinWindowListener = this.j0;
        if (gMSplashMinWindowListener != null) {
            gMSplashMinWindowListener.onMinWindowPlayFinish();
        }
    }

    @Override // com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener
    public void onMinWindowStart() {
        GMSplashMinWindowListener gMSplashMinWindowListener = this.j0;
        if (gMSplashMinWindowListener != null) {
            gMSplashMinWindowListener.onMinWindowStart();
        }
    }

    @Override // com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener
    public void onSplashCardClick() {
        GMSplashCardListener gMSplashCardListener = this.k0;
        if (gMSplashCardListener != null) {
            gMSplashCardListener.onSplashCardClick();
        }
    }

    @Override // com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener
    public void onSplashClickEyeClick() {
        GMSplashCardListener gMSplashCardListener = this.k0;
        if (gMSplashCardListener != null) {
            gMSplashCardListener.onSplashClickEyeClick();
        }
    }

    @Override // com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener
    public void onSplashClickEyeClose() {
        GMSplashCardListener gMSplashCardListener = this.k0;
        if (gMSplashCardListener != null) {
            gMSplashCardListener.onSplashClickEyeClose();
        }
    }

    @Override // com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener
    public void onSplashEyeReady() {
        GMSplashCardListener gMSplashCardListener = this.k0;
        if (gMSplashCardListener != null) {
            gMSplashCardListener.onSplashEyeReady();
        }
    }

    @Override // com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener
    public void setSupportSplashClickEye(boolean z) {
        GMSplashCardListener gMSplashCardListener = this.k0;
        if (gMSplashCardListener != null) {
            gMSplashCardListener.setSupportSplashClickEye(z);
        }
    }
}
