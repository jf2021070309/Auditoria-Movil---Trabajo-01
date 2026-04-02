package com.bytedance.msdk.api.banner;

import android.app.Activity;
import android.view.View;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.h;
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
public class TTBannerViewAd implements TTLoadBase {
    private h a;

    public TTBannerViewAd(Activity activity, String str) {
        this.a = new h(activity, str);
    }

    public void destroy() {
        h hVar = this.a;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        h hVar = this.a;
        return hVar != null ? hVar.b() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public int getAdNetworkPlatformId() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.c();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getAdNetworkRitId() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    public View getBannerView() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.g();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.i();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getPreEcpm() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.j();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.l();
        }
        return null;
    }

    public void loadAd(AdSlot adSlot, TTAdBannerLoadCallBack tTAdBannerLoadCallBack) {
        AdError adError;
        if (this.a != null) {
            if (!a.f().a(this.a.m(), 1) && tTAdBannerLoadCallBack != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().A()) {
                this.a.a(adSlot, AdUtils.getAdSlotBanner(adSlot), tTAdBannerLoadCallBack);
                return;
            } else if (tTAdBannerLoadCallBack == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_BANNER_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_BANNER_MODULE_UNABLE));
            }
            tTAdBannerLoadCallBack.onAdFailedToLoad(adError);
        }
    }

    public void setAllowShowCloseBtn(boolean z) {
        h hVar = this.a;
        if (hVar != null) {
            hVar.a(z);
        }
    }

    @Deprecated
    public void setRefreshTime(int i) {
    }

    public void setTTAdBannerListener(TTAdBannerListener tTAdBannerListener) {
        h hVar = this.a;
        if (hVar != null) {
            hVar.a(tTAdBannerListener);
        }
    }
}
