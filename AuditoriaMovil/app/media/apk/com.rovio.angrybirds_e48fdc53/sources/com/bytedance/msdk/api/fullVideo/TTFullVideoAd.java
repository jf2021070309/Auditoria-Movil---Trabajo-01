package com.bytedance.msdk.api.fullVideo;

import android.app.Activity;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.f;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.ad.AdUtils;
import com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class TTFullVideoAd implements TTLoadBase {
    private f a;

    public TTFullVideoAd(Activity activity, String str) {
        this.a = new f(activity, str);
    }

    public void destroy() {
        f fVar = this.a;
        if (fVar != null) {
            fVar.D();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        f fVar = this.a;
        return fVar != null ? fVar.E() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public int getAdNetworkPlatformId() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.G();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getAdNetworkRitId() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.H();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getPreEcpm() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.J();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.L();
        }
        return null;
    }

    public boolean isReady() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.i0();
        }
        return false;
    }

    public void loadFullAd(AdSlot adSlot, TTFullVideoAdLoadCallback tTFullVideoAdLoadCallback) {
        AdError adError;
        if (this.a != null) {
            if (!a.f().a(this.a.l(), 8) && tTFullVideoAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().E()) {
                this.a.a(adSlot, AdUtils.getAdSlotFullVideo(adSlot), tTFullVideoAdLoadCallback);
                return;
            } else if (tTFullVideoAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_FULL_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_FULL_MODULE_UNABLE));
            }
            tTFullVideoAdLoadCallback.onFullVideoLoadFail(adError);
        }
    }

    public void setFullVideoAdListener(GMFullVideoAdListener gMFullVideoAdListener) {
        f fVar = this.a;
        if (fVar != null) {
            fVar.a(gMFullVideoAdListener);
        }
    }

    public void showFullAd(Activity activity) {
        f fVar = this.a;
        if (fVar != null) {
            fVar.a(activity, (Map<TTAdConstant.GroMoreExtraKey, Object>) null);
        }
    }

    @Deprecated
    public void showFullAd(Activity activity, TTFullVideoAdListener tTFullVideoAdListener) {
        showFullAd(activity, null, tTFullVideoAdListener);
    }

    public void showFullAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        f fVar = this.a;
        if (fVar != null) {
            fVar.a(activity, map);
        }
    }

    @Deprecated
    public void showFullAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map, TTFullVideoAdListener tTFullVideoAdListener) {
        f fVar = this.a;
        if (fVar != null) {
            fVar.a(tTFullVideoAdListener);
            this.a.a(activity, map);
        }
    }
}
