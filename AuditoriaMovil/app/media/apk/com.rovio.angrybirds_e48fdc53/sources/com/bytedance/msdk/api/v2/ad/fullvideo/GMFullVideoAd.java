package com.bytedance.msdk.api.v2.ad.fullvideo;

import android.app.Activity;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.f;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.ad.GMBaseAd;
import com.bytedance.msdk.api.v2.slot.GMAdSlotFullVideo;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GMFullVideoAd extends GMBaseAd implements TTLoadBase {
    private f b;

    public GMFullVideoAd(Activity activity, String str) {
        this.b = new f(activity, str);
    }

    public void destroy() {
        f fVar = this.b;
        if (fVar != null) {
            fVar.D();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        f fVar = this.b;
        return fVar != null ? fVar.E() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public int getAdNetworkPlatformId() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.G();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getAdNetworkRitId() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.H();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        f fVar = this.b;
        return fVar != null ? fVar.I() : new HashMap();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getPreEcpm() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.J();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.L();
        }
        return null;
    }

    public boolean isReady() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.i0();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.GMBaseAd
    public void loadAd(GMAdSlotFullVideo gMAdSlotFullVideo, GMFullVideoAdLoadCallback gMFullVideoAdLoadCallback) {
        AdError adError;
        super.loadAd(gMAdSlotFullVideo, gMFullVideoAdLoadCallback);
        if (this.b != null) {
            if (!a.f().a(this.b.l(), 8) && gMFullVideoAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().E()) {
                this.b.a(getAdSlot(), gMAdSlotFullVideo, gMFullVideoAdLoadCallback);
                return;
            } else if (gMFullVideoAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_FULL_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_FULL_MODULE_UNABLE));
            }
            gMFullVideoAdLoadCallback.onFullVideoLoadFail(adError);
        }
    }

    public void setFullVideoAdListener(GMFullVideoAdListener gMFullVideoAdListener) {
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(gMFullVideoAdListener);
        }
    }

    public void showFullAd(Activity activity) {
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(activity, (Map<TTAdConstant.GroMoreExtraKey, Object>) null);
            this.b.b((TTBaseAd) null);
        }
    }

    public void showFullAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(activity, map);
        }
    }
}
