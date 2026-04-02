package com.bytedance.msdk.api.reward;

import android.app.Activity;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.ad.AdUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class TTRewardAd implements TTLoadBase {
    private i a;

    public TTRewardAd(Activity activity, String str) {
        this.a = new i(activity, str);
    }

    public void destroy() {
        i iVar = this.a;
        if (iVar != null) {
            iVar.D();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        i iVar = this.a;
        return iVar != null ? iVar.E() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public int getAdNetworkPlatformId() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.G();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getAdNetworkRitId() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.H();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getPreEcpm() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.J();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.L();
        }
        return null;
    }

    public boolean isReady() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.i0();
        }
        return false;
    }

    public void loadRewardAd(AdSlot adSlot, TTRewardedAdLoadCallback tTRewardedAdLoadCallback) {
        AdError adError;
        if (this.a != null) {
            if (!a.f().a(this.a.l(), 7) && tTRewardedAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().J()) {
                this.a.a(adSlot, AdUtils.getAdSlotRewardVideo(adSlot), tTRewardedAdLoadCallback);
                return;
            } else if (tTRewardedAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_REWARD_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_REWARD_MODULE_UNABLE));
            }
            tTRewardedAdLoadCallback.onRewardVideoLoadFail(adError);
        }
    }

    public void setRewardAdListener(TTRewardedAdListener tTRewardedAdListener) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.a(tTRewardedAdListener);
        }
    }

    public void setRewardPlayAgainListener(TTRewardedAdListener tTRewardedAdListener) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.b(tTRewardedAdListener);
        }
    }

    public void showRewardAd(Activity activity) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.a(activity, (Map<TTAdConstant.GroMoreExtraKey, Object>) null);
        }
    }

    @Deprecated
    public void showRewardAd(Activity activity, TTRewardedAdListener tTRewardedAdListener) {
        showRewardAd(activity, null, tTRewardedAdListener);
    }

    public void showRewardAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.a(activity, map);
        }
    }

    @Deprecated
    public void showRewardAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map, TTRewardedAdListener tTRewardedAdListener) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.a(tTRewardedAdListener);
            this.a.a(activity, map);
        }
    }
}
