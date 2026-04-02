package com.bytedance.msdk.api.v2.ad.banner;

import android.app.Activity;
import android.view.View;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.h;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.ad.GMBaseAd;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GMBannerAd extends GMBaseAd implements TTLoadBase {
    private h b;

    public GMBannerAd(Activity activity, String str) {
        this.b = new h(activity, str);
    }

    public void destroy() {
        h hVar = this.b;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        h hVar = this.b;
        return hVar != null ? hVar.b() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public int getAdNetworkPlatformId() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.c();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getAdNetworkRitId() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    public View getBannerView() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.g();
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        h hVar = this.b;
        return hVar != null ? hVar.h() : new HashMap();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.i();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getPreEcpm() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.j();
        }
        return null;
    }

    public int getRefreshTime() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.k();
        }
        return 0;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.l();
        }
        return null;
    }

    public boolean isAllSHowCloseBtn() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.n();
        }
        return false;
    }

    public boolean isReady() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.o();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.GMBaseAd
    public void loadAd(GMAdSlotBanner gMAdSlotBanner, GMBannerAdLoadCallback gMBannerAdLoadCallback) {
        AdError adError;
        super.loadAd(gMAdSlotBanner, gMBannerAdLoadCallback);
        if (this.b != null) {
            if (!a.f().a(this.b.m(), 1) && gMBannerAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().A()) {
                this.b.a(gMAdSlotBanner.isAllowShowCloseBtn());
                this.b.a(getAdSlot(), gMAdSlotBanner, gMBannerAdLoadCallback);
                return;
            } else if (gMBannerAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_BANNER_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_BANNER_MODULE_UNABLE));
            }
            gMBannerAdLoadCallback.onAdFailedToLoad(adError);
        }
    }

    public void onPause() {
        h hVar = this.b;
        if (hVar != null) {
            hVar.p();
        }
    }

    public void onResume() {
        h hVar = this.b;
        if (hVar != null) {
            hVar.q();
        }
    }

    public void setAdBannerListener(GMBannerAdListener gMBannerAdListener) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(gMBannerAdListener);
        }
    }

    public void setNativeToBannerListener(GMNativeToBannerListener gMNativeToBannerListener) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(gMNativeToBannerListener);
        }
    }
}
