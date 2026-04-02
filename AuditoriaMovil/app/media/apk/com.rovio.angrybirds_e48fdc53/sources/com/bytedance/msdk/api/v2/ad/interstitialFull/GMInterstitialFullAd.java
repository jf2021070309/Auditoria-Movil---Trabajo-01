package com.bytedance.msdk.api.v2.ad.interstitialFull;

import android.app.Activity;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.a;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.ad.GMBaseAd;
import com.bytedance.msdk.api.v2.slot.GMAdSlotInterstitialFull;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GMInterstitialFullAd extends GMBaseAd implements TTLoadBase {
    private a b;

    public GMInterstitialFullAd(Activity activity, String str) {
        this.b = new a(activity, str);
    }

    public void destroy() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.D();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        a aVar = this.b;
        return aVar != null ? aVar.E() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public int getAdNetworkPlatformId() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.G();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getAdNetworkRitId() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.H();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        a aVar = this.b;
        return aVar != null ? aVar.I() : new HashMap();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getPreEcpm() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.J();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.L();
        }
        return null;
    }

    public boolean isReady() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.i0();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.GMBaseAd
    public void loadAd(GMAdSlotInterstitialFull gMAdSlotInterstitialFull, GMInterstitialFullAdLoadCallback gMInterstitialFullAdLoadCallback) {
        AdError adError;
        super.loadAd(gMAdSlotInterstitialFull, gMInterstitialFullAdLoadCallback);
        if (this.b != null) {
            if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(this.b.l(), 10) && gMInterstitialFullAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().G()) {
                this.b.a(getAdSlot(), gMAdSlotInterstitialFull, gMInterstitialFullAdLoadCallback);
                return;
            } else if (gMInterstitialFullAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_INTERACTION_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_INTERACTION_MODULE_UNABLE));
            }
            gMInterstitialFullAdLoadCallback.onInterstitialFullLoadFail(adError);
        }
    }

    public void setAdInterstitialFullListener(GMInterstitialFullAdListener gMInterstitialFullAdListener) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(gMInterstitialFullAdListener);
        }
    }

    public void showAd(Activity activity) {
        a aVar = this.b;
        if (aVar != null) {
            if (activity == null) {
                Logger.e("TTMediationSDK", "activity can not be null !");
                return;
            }
            aVar.a(activity);
            this.b.b((TTBaseAd) null);
        }
    }
}
