package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.i0;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.TTVideoOptionUtil;
import com.bytedance.msdk.api.v2.ad.GMAdTokenCallback;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomTTBaseAd;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeAd;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeAdLoadCallback;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMPrimeNativeAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotNative;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class g extends d {
    private GMNativeAdLoadCallback h0;
    private GMAdTokenCallback i0;
    private boolean j0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.c {
        a() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a.c
        public void a() {
            ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) g.this).M = true;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a.c
        public void a(GMNativeAd gMNativeAd) {
            boolean z = true;
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) g.this).f, g.this.e()) == 2 || g.this.j0) {
                z = false;
            } else {
                g.this.j0 = true;
            }
            g.this.a(gMNativeAd, z);
            g.this.a(gMNativeAd);
        }
    }

    /* loaded from: classes.dex */
    class b implements a.c {
        b() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a.c
        public void a() {
            ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) g.this).M = true;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a.c
        public void a(GMNativeAd gMNativeAd) {
            g.this.a(gMNativeAd, false);
        }
    }

    public g(Context context, String str) {
        super(context, str);
        this.j0 = false;
    }

    private List<GMNativeAd> a(List<TTBaseAd> list, int i) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<TTBaseAd> it = list.iterator();
        while (it.hasNext() && arrayList2.size() < i) {
            TTBaseAd next = it.next();
            arrayList.add(next);
            if (Logger.isDebug()) {
                Logger.e("TTMediationSDK", "");
                Logger.e("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW) + "返回给开发者最终广告：slotId=" + next.getAdNetworkSlotId() + ",slotType:" + next.getAdNetworkSlotType() + ",cpm=" + next.getCpm() + ",广告类型：" + com.bytedance.msdk.base.a.a(next.getAdNetworkPlatformId()) + ",ImageMode=" + next.getImageMode() + ",showSort=" + next.getShowSort() + ",isExpressAd=" + next.isExpressAd());
            }
            arrayList2.add(new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a(next, this.h, new a()));
            it.remove();
        }
        a(arrayList);
        return arrayList2;
    }

    private void a(AdSlot adSlot, GMAdSlotNative gMAdSlotNative) {
        int i;
        AdSlot adSlot2;
        if (f0()) {
            this.h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
            AdSlot adSlot3 = this.h;
            if (adSlot3 != null) {
                adSlot3.setAdType(5);
                if (this.h.getAdCount() <= 0) {
                    adSlot2 = this.h;
                    i = 1;
                } else {
                    i = 3;
                    if (this.h.getAdCount() > 3) {
                        adSlot2 = this.h;
                    }
                    TTVideoOptionUtil.setFeedTTVideoOptionIfNeed(this.h);
                }
                adSlot2.setAdCount(i);
                TTVideoOptionUtil.setFeedTTVideoOptionIfNeed(this.h);
            }
            this.w = gMAdSlotNative;
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GMNativeAd gMNativeAd) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar;
        TTBaseAd tTBaseAd = gMNativeAd.getTTBaseAd();
        if (tTBaseAd == null || tTBaseAd.getAdNetworkPlatformId() == 7 || (tTBaseAd instanceof GMCustomTTBaseAd) || (cVar = this.d) == null || cVar.M()) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().b(this.I, this.f, e());
    }

    private void a(String str, List<TTBaseAd> list) {
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> a2;
        TTBaseAd tTBaseAd;
        if (b(str, list) || bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(str, this.h, false) != 3 || (a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(str, this.h)) == null || a2.size() <= 0) {
            return;
        }
        for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar : a2) {
            if (eVar != null && (tTBaseAd = eVar.a) != null && !tTBaseAd.isHasShown() && eVar.a.isReady(this.f)) {
                list.add(eVar.a);
                c(eVar.a);
            }
        }
    }

    private boolean b(String str, List<TTBaseAd> list) {
        if (list != null && list.size() > 0) {
            for (TTBaseAd tTBaseAd : list) {
                if (tTBaseAd != null && TextUtils.equals(str, tTBaseAd.getAdNetworkSlotId())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void e(List<TTBaseAd> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList<TTBaseAd> arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        list.clear();
        for (TTBaseAd tTBaseAd : arrayList) {
            if (tTBaseAd != null && !tTBaseAd.isHasShown() && tTBaseAd.isReady(l())) {
                list.add(tTBaseAd);
            }
        }
    }

    private void g0() {
        List<TTBaseAd> list;
        try {
            List<k> M = M();
            if (M == null || M.size() <= 0) {
                return;
            }
            for (k kVar : M) {
                if (kVar != null) {
                    String d = kVar.d();
                    if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, d, e())) {
                        if (kVar.f() == 100) {
                            list = this.q;
                        } else if (kVar.f() == 0) {
                            list = this.o;
                        }
                        a(d, list);
                    }
                }
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.q, (Comparator<TTBaseAd>) null);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.o, (Comparator<TTBaseAd>) null);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.p, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.c());
            Logger.d("TMe", "--==-- sorted ok");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private List<GMNativeAd> h0() {
        AdSlot adSlot = this.h;
        if (adSlot == null) {
            return null;
        }
        int adCount = adSlot.getAdCount();
        e(this.q);
        e(this.p);
        e(this.o);
        g0();
        List<TTBaseAd> v = v();
        v.size();
        return a(v, adCount);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void D() {
        super.D();
        this.h0 = null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void Q() {
        List<GMNativeAd> h0;
        if (this.h0 == null || (h0 = h0()) == null || h0.size() <= 0) {
            return;
        }
        if (Logger.isDebug()) {
            Logger.e("TTMediationSDK", "返回给外部开发者的广告数量：sumList.size=" + h0.size());
        }
        for (GMNativeAd gMNativeAd : h0) {
            if (gMNativeAd != null) {
                if (gMNativeAd instanceof bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a) {
                    ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a) gMNativeAd).a(true);
                }
                if (gMNativeAd.canAdReuse() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, gMNativeAd.getAdNetworkRitId(), e())) {
                    a(gMNativeAd.getTTBaseAd(), gMNativeAd.getAdNetworkRitId());
                }
            }
        }
        this.h0.onAdLoaded(h0);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void R() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void a(AdError adError) {
        GMAdTokenCallback gMAdTokenCallback;
        super.a(adError);
        if (this.A != 0 || (gMAdTokenCallback = this.i0) == null) {
            return;
        }
        this.A = 2;
        gMAdTokenCallback.onAdTokenLoadedFail(adError);
    }

    public void a(AdSlot adSlot, GMAdSlotNative gMAdSlotNative, GMAdTokenCallback gMAdTokenCallback) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar != null && cVar.M()) {
            this.i0 = gMAdTokenCallback;
            a(adSlot, gMAdSlotNative);
        } else if (gMAdTokenCallback != null) {
            gMAdTokenCallback.onAdTokenLoadedFail(new AdError(AdError.ERROR_COED_NOT_PRIME, AdError.getMessage(AdError.ERROR_COED_NOT_PRIME)));
        }
    }

    public void a(AdSlot adSlot, GMAdSlotNative gMAdSlotNative, GMNativeAdLoadCallback gMNativeAdLoadCallback) {
        this.h0 = gMNativeAdLoadCallback;
        a(adSlot, gMAdSlotNative);
    }

    public void a(GMNativeAd gMNativeAd, boolean z) {
        TTBaseAd tTBaseAd = gMNativeAd.getTTBaseAd();
        if (tTBaseAd != null && tTBaseAd.canAdReuse() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, gMNativeAd.getAdNetworkRitId(), e())) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(gMNativeAd.getAdNetworkRitId(), this.h, this.r, z, this.T, this.v, this.I, this.w);
        }
    }

    public void a(String str, GMNativeAdLoadCallback gMNativeAdLoadCallback) {
        AdError adError;
        if (this.A != 1) {
            if (gMNativeAdLoadCallback == null) {
                return;
            }
            adError = new AdError(AdError.ERROR_COED_NO_TOKEN, AdError.getMessage(AdError.ERROR_COED_NO_TOKEN));
        } else if (this.z) {
            if (gMNativeAdLoadCallback == null) {
                return;
            }
            adError = new AdError(AdError.ERROR_CODE_LOADED, AdError.getMessage(AdError.ERROR_CODE_LOADED));
        } else if (this.N) {
            Logger.e("TTMediationSDK", "调用过销毁方法_destroy()！！！");
            if (gMNativeAdLoadCallback == null) {
                return;
            }
            adError = new AdError(AdError.ERROR_CODE_DESTROY, AdError.getMessage(AdError.ERROR_CODE_DESTROY));
        } else if (!this.s.g()) {
            this.z = true;
            this.h0 = gMNativeAdLoadCallback;
            c(str);
            return;
        } else if (gMNativeAdLoadCallback == null) {
            return;
        } else {
            adError = new AdError(AdError.AD_REQUEST_TIMEOUT, "Ad load timeout!");
        }
        gMNativeAdLoadCallback.onAdLoadedFail(adError);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void a(List<TTBaseAd> list, AdError adError) {
        ArrayList arrayList;
        super.a(list, adError);
        if (this.h0 instanceof GMPrimeNativeAdLoadCallback) {
            if (i0.a(list)) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (TTBaseAd tTBaseAd : list) {
                    arrayList.add(new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_goto109.a(tTBaseAd, this.h, new b()));
                }
            }
            ((GMPrimeNativeAdLoadCallback) this.h0).onSingleAdLoad(arrayList, adError);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void b(AdError adError) {
        GMAdTokenCallback gMAdTokenCallback;
        GMNativeAdLoadCallback gMNativeAdLoadCallback = this.h0;
        if (gMNativeAdLoadCallback != null) {
            gMNativeAdLoadCallback.onAdLoadedFail(adError);
        }
        if (this.A != 0 || this.z || (gMAdTokenCallback = this.i0) == null) {
            return;
        }
        this.A = 2;
        gMAdTokenCallback.onAdTokenLoadedFail(adError);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void b(String str) {
        GMAdTokenCallback gMAdTokenCallback;
        super.b(str);
        if (this.A != 0 || (gMAdTokenCallback = this.i0) == null) {
            return;
        }
        this.A = 1;
        gMAdTokenCallback.onAdTokenLoaded(str);
    }
}
