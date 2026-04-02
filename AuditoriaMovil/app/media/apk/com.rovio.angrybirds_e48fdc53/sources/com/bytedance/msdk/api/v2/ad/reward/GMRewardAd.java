package com.bytedance.msdk.api.v2.ad.reward;

import android.app.Activity;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.ad.GMBaseAd;
import com.bytedance.msdk.api.v2.slot.GMAdSlotRewardVideo;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GMRewardAd extends GMBaseAd implements TTLoadBase {
    private i b;

    public GMRewardAd(Activity activity, String str) {
        this.b = new i(activity, str);
    }

    public void destroy() {
        i iVar = this.b;
        if (iVar != null) {
            iVar.D();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        i iVar = this.b;
        return iVar != null ? iVar.E() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public int getAdNetworkPlatformId() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.G();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getAdNetworkRitId() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.H();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        i iVar = this.b;
        return iVar != null ? iVar.I() : new HashMap();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getPreEcpm() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.J();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.L();
        }
        return null;
    }

    public boolean isReady() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.i0();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.GMBaseAd
    public void loadAd(GMAdSlotRewardVideo gMAdSlotRewardVideo, GMRewardedAdLoadCallback gMRewardedAdLoadCallback) {
        AdError adError;
        super.loadAd(gMAdSlotRewardVideo, gMRewardedAdLoadCallback);
        if (this.b != null) {
            if (!a.f().a(this.b.l(), 7) && gMRewardedAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().J()) {
                this.b.a(getAdSlot(), gMAdSlotRewardVideo, gMRewardedAdLoadCallback);
                return;
            } else if (gMRewardedAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_REWARD_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_REWARD_MODULE_UNABLE));
            }
            gMRewardedAdLoadCallback.onRewardVideoLoadFail(adError);
        }
    }

    public void setRewardAdListener(GMRewardedAdListener gMRewardedAdListener) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.a(gMRewardedAdListener);
        }
    }

    public void setRewardPlayAgainListener(GMRewardedAdListener gMRewardedAdListener) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.b(gMRewardedAdListener);
        }
    }

    public void showRewardAd(Activity activity) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.a(activity, (Map<TTAdConstant.GroMoreExtraKey, Object>) null);
            this.b.b((TTBaseAd) null);
        }
    }

    public void showRewardAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.a(activity, map);
        }
    }
}
