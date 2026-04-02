package com.bytedance.msdk.api.splash;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.j;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.base.TTLoadBase;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import com.bytedance.msdk.api.v2.GMSettingConfigCallback;
import com.bytedance.msdk.api.v2.ad.AdUtils;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public class TTSplashAd implements TTLoadBase {
    private j a;

    @Deprecated
    public TTSplashAd(Activity activity, View view, String str) {
        this.a = new j(activity, view, str);
    }

    public TTSplashAd(Activity activity, String str) {
        this.a = new j(activity, str);
    }

    public void destroy() {
        j jVar = this.a;
        if (jVar != null) {
            jVar.D();
        }
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<AdLoadInfo> getAdLoadInfoList() {
        j jVar = this.a;
        return jVar != null ? jVar.E() : new ArrayList();
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public int getAdNetworkPlatformId() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.G();
        }
        return -2;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getAdNetworkRitId() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.H();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getBestEcpm() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getCacheList() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public int[] getMinWindowSize() {
        j jVar = this.a;
        if (jVar != null) {
            jVar.h0();
            return null;
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public List<GMAdEcpmInfo> getMultiBiddingEcpm() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.f();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public String getPreEcpm() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.J();
        }
        return null;
    }

    @Override // com.bytedance.msdk.api.base.TTLoadBase
    public GMAdEcpmInfo getShowEcpm() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.L();
        }
        return null;
    }

    public Bitmap getSplashBitMap() {
        j jVar = this.a;
        if (jVar != null) {
            jVar.i0();
            return null;
        }
        return null;
    }

    public void loadAd(AdSlot adSlot, TTSplashAdLoadCallback tTSplashAdLoadCallback, int i) {
        loadAd(adSlot, null, tTSplashAdLoadCallback, i);
    }

    public void loadAd(final AdSlot adSlot, final GMNetworkRequestInfo gMNetworkRequestInfo, final TTSplashAdLoadCallback tTSplashAdLoadCallback, final int i) {
        AdError adError;
        if (gMNetworkRequestInfo == null || gMNetworkRequestInfo.getAdNetworkFlatFromId() != 1 || TextUtils.isEmpty(gMNetworkRequestInfo.getAppId()) || TextUtils.isEmpty(b.e()) || gMNetworkRequestInfo.getAppId().equals(b.e())) {
            if (this.a == null) {
                return;
            }
            if (!a.f().a(this.a.l(), 3) && tTSplashAdLoadCallback != null) {
                adError = new AdError(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_RIT_ADTYPE_NO_SAME));
            } else if (a.f().K()) {
                if (a.f().B()) {
                    GMMediationAdSdk.registerConfigCallback(new GMSettingConfigCallback() { // from class: com.bytedance.msdk.api.splash.TTSplashAd.1
                        @Override // com.bytedance.msdk.api.v2.GMSettingConfigCallback
                        public void configLoad() {
                            j jVar = TTSplashAd.this.a;
                            AdSlot adSlot2 = adSlot;
                            jVar.a(adSlot2, AdUtils.getAdSlotSplash(adSlot2), gMNetworkRequestInfo, tTSplashAdLoadCallback, i);
                        }
                    });
                    return;
                } else {
                    this.a.a(adSlot, AdUtils.getAdSlotSplash(adSlot), gMNetworkRequestInfo, tTSplashAdLoadCallback, i);
                    return;
                }
            } else if (tTSplashAdLoadCallback == null) {
                return;
            } else {
                adError = new AdError(AdError.ERROR_CODE_SPLASH_MODULE_UNABLE, AdError.getMessage(AdError.ERROR_CODE_SPLASH_MODULE_UNABLE));
            }
        } else if (tTSplashAdLoadCallback == null) {
            return;
        } else {
            adError = new AdError(AdError.ERROR_CODE_PANGLE_APPID_NO_SAME, AdError.getMessage(AdError.ERROR_CODE_PANGLE_APPID_NO_SAME));
        }
        tTSplashAdLoadCallback.onSplashAdLoadFail(adError);
    }

    public void setMinWindowListener(TTSplashMinWindowListener tTSplashMinWindowListener) {
        j jVar = this.a;
        if (jVar != null) {
            jVar.a(tTSplashMinWindowListener);
        }
    }

    public void setSplashCardListener(TTSplashCardListener tTSplashCardListener) {
        j jVar = this.a;
        if (jVar != null) {
            jVar.a(tTSplashCardListener);
        }
    }

    public void setTTAdSplashListener(TTSplashAdListener tTSplashAdListener) {
        j jVar = this.a;
        if (jVar != null) {
            jVar.a(tTSplashAdListener);
        }
    }

    public void showAd(final ViewGroup viewGroup) {
        if (this.a != null) {
            ThreadHelper.runOnUiThread(new Runnable() { // from class: com.bytedance.msdk.api.splash.TTSplashAd.2
                @Override // java.lang.Runnable
                public void run() {
                    if (TTSplashAd.this.a != null) {
                        TTSplashAd.this.a.b(viewGroup);
                    }
                }
            });
        }
    }

    public boolean showWindowDirect(Rect rect, TTSplashAdListener tTSplashAdListener) {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.a(rect, tTSplashAdListener);
        }
        return false;
    }

    public void splashMinWindowAnimationFinish() {
        j jVar = this.a;
        if (jVar != null) {
            jVar.l0();
        }
    }
}
