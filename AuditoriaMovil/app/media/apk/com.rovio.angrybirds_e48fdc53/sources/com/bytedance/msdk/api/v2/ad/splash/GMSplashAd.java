package com.bytedance.msdk.api.v2.ad.splash;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewGroup;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.j;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import com.bytedance.msdk.api.v2.GMSettingConfigCallback;
import com.bytedance.msdk.api.v2.ad.GMBaseAd;
import com.bytedance.msdk.api.v2.slot.GMAdSlotSplash;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GMSplashAd extends GMBaseAd implements TTLoadBase {
    private j b;

    public GMSplashAd(Activity activity, String str) {
        this.b = new j(activity, str);
    }

    public void destroy() {
        j jVar = this.b;
        if (jVar != null) {
            jVar.D();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        j jVar = this.b;
        return jVar != null ? jVar.E() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public int getAdNetworkPlatformId() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.G();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getAdNetworkRitId() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.H();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        j jVar = this.b;
        return jVar != null ? jVar.I() : new HashMap();
    }

    public int[] getMinWindowSize() {
        j jVar = this.b;
        if (jVar != null) {
            jVar.h0();
            return null;
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    @Deprecated
    public String getPreEcpm() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.J();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.L();
        }
        return null;
    }

    public Bitmap getSplashBitMap() {
        j jVar = this.b;
        if (jVar != null) {
            jVar.i0();
            return null;
        }
        return null;
    }

    public int getTimeOut() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.j0();
        }
        return -1;
    }

    public boolean isReady() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.k0();
        }
        return false;
    }

    @Override // com.bytedance.msdk.api.v2.ad.GMBaseAd
    public void loadAd(final GMAdSlotSplash gMAdSlotSplash, final GMNetworkRequestInfo gMNetworkRequestInfo, final GMSplashAdLoadCallback gMSplashAdLoadCallback) {
        AdError adError;
        super.loadAd(gMAdSlotSplash, gMNetworkRequestInfo, gMSplashAdLoadCallback);
        if (gMNetworkRequestInfo == null || gMNetworkRequestInfo.getAdNetworkFlatFromId() != 1 || TextUtils.isEmpty(gMNetworkRequestInfo.getAppId()) || TextUtils.isEmpty(b.e()) || gMNetworkRequestInfo.getAppId().equals(b.e())) {
            if (this.b == null) {
                return;
            }
            if (!a.f().a(this.b.l(), 3) && gMSplashAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().K()) {
                this.b.k(gMAdSlotSplash.getTimeOut());
                if (a.f().B()) {
                    GMMediationAdSdk.registerConfigCallback(new GMSettingConfigCallback() { // from class: com.bytedance.msdk.api.v2.ad.splash.GMSplashAd.1
                        @Override // com.bytedance.msdk.api.v2.GMSettingConfigCallback
                        public void configLoad() {
                            GMSplashAd.this.b.a(GMSplashAd.this.getAdSlot(), gMAdSlotSplash, gMNetworkRequestInfo, gMSplashAdLoadCallback);
                        }
                    });
                    return;
                } else {
                    this.b.a(getAdSlot(), gMAdSlotSplash, gMNetworkRequestInfo, gMSplashAdLoadCallback);
                    return;
                }
            } else if (gMSplashAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_SPLASH_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_SPLASH_MODULE_UNABLE));
            }
        } else if (gMSplashAdLoadCallback == null) {
            return;
        } else {
            adError = new AdError(AdError.ERROR_CODE_PANGLE_APPID_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_PANGLE_APPID_NO_SAME));
        }
        gMSplashAdLoadCallback.onSplashAdLoadFail(adError);
    }

    public void loadAd(GMAdSlotSplash gMAdSlotSplash, GMSplashAdLoadCallback gMSplashAdLoadCallback) {
        loadAd(gMAdSlotSplash, null, gMSplashAdLoadCallback);
    }

    public void setAdSplashListener(GMSplashAdListener gMSplashAdListener) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(gMSplashAdListener);
        }
    }

    public void setMinWindowListener(GMSplashMinWindowListener gMSplashMinWindowListener) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(gMSplashMinWindowListener);
        }
    }

    public void setSplashCardListener(GMSplashCardListener gMSplashCardListener) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(gMSplashCardListener);
        }
    }

    public void showAd(final ViewGroup viewGroup) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.b((TTBaseAd) null);
            ThreadHelper.runOnUiThread(new Runnable() { // from class: com.bytedance.msdk.api.v2.ad.splash.GMSplashAd.2
                @Override // java.lang.Runnable
                public void run() {
                    if (GMSplashAd.this.b != null) {
                        GMSplashAd.this.b.b(viewGroup);
                    }
                }
            });
        }
    }

    public void showSplashCardView(ViewGroup viewGroup, Activity activity) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(viewGroup, activity);
        }
    }

    public void showSplashClickEyeView(ViewGroup viewGroup) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(viewGroup);
        }
    }

    public boolean showWindowDirect(Rect rect, GMSplashAdListener gMSplashAdListener) {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.a(rect, gMSplashAdListener);
        }
        return false;
    }

    public void splashMinWindowAnimationFinish() {
        j jVar = this.b;
        if (jVar != null) {
            jVar.l0();
        }
    }
}
