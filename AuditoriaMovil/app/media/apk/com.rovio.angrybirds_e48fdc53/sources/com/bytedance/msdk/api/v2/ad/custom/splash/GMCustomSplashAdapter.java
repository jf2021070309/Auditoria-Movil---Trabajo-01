package com.bytedance.msdk.api.v2.ad.custom.splash;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomAdError;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter;
import com.bytedance.msdk.api.v2.ad.custom.base.IGMCustomLoadAdCall;
import com.bytedance.msdk.api.v2.ad.custom.bean.GMCustomServiceConfig;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.api.v2.slot.GMAdSlotSplash;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class GMCustomSplashAdapter extends GMCustomBaseAdapter implements IGMCustomSplashEvent, IGMCustomLoadAdCall {
    private volatile boolean h = false;

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.IGMCustomLoadAdCall
    public final void callLoadFail(GMCustomAdError gMCustomAdError) {
        if (isCallLoadFailCall()) {
            Logger.e("TTMediationSDK", "自定义Adapter 加载成功或者失败回调只能调用一次");
            return;
        }
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter != null) {
            tTAbsAdLoaderAdapter.notifyAdFailed(new AdError(AdError.ERROR_CODE_CUSTOM_SPLASH_LOAD_ERROR, AdError.getMessage(AdError.ERROR_CODE_CUSTOM_SPLASH_LOAD_ERROR), gMCustomAdError == null ? -1 : gMCustomAdError.getCode(), gMCustomAdError == null ? "" : gMCustomAdError.getMessage()));
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.IGMCustomLoadAdCall
    public final void callLoadSuccess() {
        callLoadSuccess(PangleAdapterUtils.CPM_DEFLAUT_VALUE, null);
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.IGMCustomLoadAdCall
    public final void callLoadSuccess(double d) {
        callLoadSuccess(d, null);
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.IGMCustomLoadAdCall
    public void callLoadSuccess(double d, Map<String, Object> map) {
        if (isCallLoadSuccessCall()) {
            Logger.e("TTMediationSDK", "自定义Adapter 加载成功或者失败回调只能调用一次");
            return;
        }
        Logger.e("TTMediationSDK", "自定义Adapter callLoadSuccess");
        this.d = new GMCustomSplashAd();
        this.d.setMediaExtraInfo(this.g);
        this.d.setAdType(this.b.t());
        if (d > PangleAdapterUtils.CPM_DEFLAUT_VALUE && getBiddingType() == 1) {
            this.d.setCpm(d);
        }
        this.d.putExtraMsg(map);
        this.d.setGMCustomBaseAdapter(this);
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter != null) {
            tTAbsAdLoaderAdapter.notifyAdLoaded(this.d);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.IGMCustomLoadAdCall
    public void callLoadSuccess(Map<String, Object> map) {
        callLoadSuccess(PangleAdapterUtils.CPM_DEFLAUT_VALUE, map);
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.splash.IGMCustomSplashEvent
    public final void callSplashAdClicked() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.splash.GMCustomSplashAdapter.1
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMCustomSplashAdapter.this.checkClick(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.splash.GMCustomSplashAdapter.1.1
                        @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                        public void callback() {
                            GMSplashAdListener gMSplashAdListener = (GMSplashAdListener) ((GMCustomBaseAdapter) GMCustomSplashAdapter.this).d.getTTAdapterCallback();
                            if (gMSplashAdListener != null) {
                                gMSplashAdListener.onAdClicked();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.splash.IGMCustomSplashEvent
    public final void callSplashAdDismiss() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.splash.GMCustomSplashAdapter.4
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMSplashAdListener gMSplashAdListener = (GMSplashAdListener) ((GMCustomBaseAdapter) GMCustomSplashAdapter.this).d.getTTAdapterCallback();
                    if (gMSplashAdListener != null) {
                        gMSplashAdListener.onAdDismiss();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.splash.IGMCustomSplashEvent
    public final void callSplashAdShow() {
        if (this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.splash.GMCustomSplashAdapter.2
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMCustomSplashAdapter.this.checkShow(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.splash.GMCustomSplashAdapter.2.1
                        @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                        public void callback() {
                            GMSplashAdListener gMSplashAdListener = (GMSplashAdListener) ((GMCustomBaseAdapter) GMCustomSplashAdapter.this).d.getTTAdapterCallback();
                            if (gMSplashAdListener != null) {
                                GMCustomSplashAdapter.this.h = true;
                                gMSplashAdListener.onAdShow();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.splash.IGMCustomSplashEvent
    public final void callSplashAdSkip() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.splash.GMCustomSplashAdapter.3
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMSplashAdListener gMSplashAdListener = (GMSplashAdListener) ((GMCustomBaseAdapter) GMCustomSplashAdapter.this).d.getTTAdapterCallback();
                    if (gMSplashAdListener != null) {
                        gMSplashAdListener.onAdSkip();
                    }
                }
            });
        }
    }

    public abstract void load(Context context, GMAdSlotSplash gMAdSlotSplash, GMCustomServiceConfig gMCustomServiceConfig);

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter
    public void loadCustom(Context context, GMAdSlotBase gMAdSlotBase, GMCustomServiceConfig gMCustomServiceConfig) {
        if (gMAdSlotBase instanceof GMAdSlotSplash) {
            load(context, (GMAdSlotSplash) gMAdSlotBase, gMCustomServiceConfig);
        } else {
            callLoadFail(new GMCustomAdError(AdError.ERROR_ADN_NO_ERROR_CODE, "ClassCastException：load ad fail adSlot is not GMAdSlotSplash"));
        }
    }

    public final void setMediaExtraInfo(Map<String, Object> map) {
        if (map != null) {
            this.g = new HashMap();
            this.g.putAll(map);
        }
    }

    public abstract void showAd(ViewGroup viewGroup);

    public final void showAdInner(ViewGroup viewGroup) {
        try {
            this.a = true;
            showAd(viewGroup);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
