package com.bytedance.msdk.api.interstitial;

import android.app.Activity;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.b;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.ad.AdUtils;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public class TTInterstitialAd implements TTLoadBase {
    private b a;

    public TTInterstitialAd(Activity activity, String str) {
        this.a = new b(activity, str);
    }

    public void destroy() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.D();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        b bVar = this.a;
        return bVar != null ? bVar.E() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public int getAdNetworkPlatformId() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.G();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getAdNetworkRitId() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.H();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getPreEcpm() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.J();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.L();
        }
        return null;
    }

    public boolean isReady() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.i0();
        }
        return false;
    }

    public void loadAd(AdSlot adSlot, TTInterstitialAdLoadCallback tTInterstitialAdLoadCallback) {
        AdError adError;
        if (this.a != null) {
            if (!a.f().a(this.a.l(), 2) && tTInterstitialAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().F()) {
                this.a.a(adSlot, AdUtils.getAdSlotInterstitial(adSlot), tTInterstitialAdLoadCallback);
                return;
            } else if (tTInterstitialAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_INTERACTION_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_INTERACTION_MODULE_UNABLE));
            }
            tTInterstitialAdLoadCallback.onInterstitialLoadFail(adError);
        }
    }

    public void setTTAdInterstitialListener(TTInterstitialAdListener tTInterstitialAdListener) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(tTInterstitialAdListener);
        }
    }

    public void showAd(Activity activity) {
        b bVar = this.a;
        if (bVar != null) {
            if (activity == null) {
                Logger.e("TTMediationSDK", "activity can not be null !");
            } else {
                bVar.a(activity);
            }
        }
    }
}
