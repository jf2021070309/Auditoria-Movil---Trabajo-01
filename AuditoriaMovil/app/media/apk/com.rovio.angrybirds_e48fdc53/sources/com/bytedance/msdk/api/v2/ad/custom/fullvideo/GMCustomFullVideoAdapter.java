package com.bytedance.msdk.api.v2.ad.custom.fullvideo;

import android.content.Context;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomAdError;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomAd;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomVideoAdapter;
import com.bytedance.msdk.api.v2.ad.custom.bean.GMCustomServiceConfig;
import com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.api.v2.slot.GMAdSlotFullVideo;
import com.bytedance.msdk.api.v2.slot.GMAdSlotInterstitialFull;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class GMCustomFullVideoAdapter extends GMCustomVideoAdapter implements IGMCustomFullVideoEvent {
    private volatile boolean h = false;

    public final void callAdVideoCache() {
        GMCustomAd gMCustomAd;
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter == null || (gMCustomAd = this.d) == null) {
            return;
        }
        tTAbsAdLoaderAdapter.notifyAdVideoCache(gMCustomAd, (AdError) null);
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.fullvideo.IGMCustomFullVideoEvent
    public final void callFullVideoAdClick() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.2
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMCustomFullVideoAdapter.this.checkClick(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.2.1
                        @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                        public void callback() {
                            GMFullVideoAdListener gMFullVideoAdListener = (GMFullVideoAdListener) ((GMCustomBaseAdapter) GMCustomFullVideoAdapter.this).d.getTTAdapterCallback();
                            if (gMFullVideoAdListener != null) {
                                gMFullVideoAdListener.onFullVideoAdClick();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.fullvideo.IGMCustomFullVideoEvent
    public final void callFullVideoAdClosed() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.3
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMFullVideoAdListener gMFullVideoAdListener = (GMFullVideoAdListener) ((GMCustomBaseAdapter) GMCustomFullVideoAdapter.this).d.getTTAdapterCallback();
                    if (gMFullVideoAdListener != null) {
                        gMFullVideoAdListener.onFullVideoAdClosed();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.fullvideo.IGMCustomFullVideoEvent
    public final void callFullVideoAdShow() {
        if (this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.1
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMCustomFullVideoAdapter.this.checkShow(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.1.1
                        @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                        public void callback() {
                            GMFullVideoAdListener gMFullVideoAdListener = (GMFullVideoAdListener) ((GMCustomBaseAdapter) GMCustomFullVideoAdapter.this).d.getTTAdapterCallback();
                            if (gMFullVideoAdListener != null) {
                                GMCustomFullVideoAdapter.this.h = true;
                                gMFullVideoAdListener.onFullVideoAdShow();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.fullvideo.IGMCustomFullVideoEvent
    public final void callFullVideoComplete() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.4
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMFullVideoAdListener gMFullVideoAdListener = (GMFullVideoAdListener) ((GMCustomBaseAdapter) GMCustomFullVideoAdapter.this).d.getTTAdapterCallback();
                    if (gMFullVideoAdListener != null) {
                        gMFullVideoAdListener.onVideoComplete();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.fullvideo.IGMCustomFullVideoEvent
    public final void callFullVideoError() {
        if (this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.5
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMFullVideoAdListener gMFullVideoAdListener = (GMFullVideoAdListener) ((GMCustomBaseAdapter) GMCustomFullVideoAdapter.this).d.getTTAdapterCallback();
                    if (gMFullVideoAdListener != null) {
                        gMFullVideoAdListener.onVideoError();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.fullvideo.IGMCustomFullVideoEvent
    public final void callFullVideoRewardVerify(final RewardItem rewardItem) {
        if (!this.h || rewardItem == null || this.d == null) {
            return;
        }
        checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.7
            @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
            public void callback() {
                GMFullVideoAdListener gMFullVideoAdListener = (GMFullVideoAdListener) ((GMCustomBaseAdapter) GMCustomFullVideoAdapter.this).d.getTTAdapterCallback();
                if (gMFullVideoAdListener != null) {
                    gMFullVideoAdListener.onRewardVerify(rewardItem);
                }
            }
        });
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.fullvideo.IGMCustomFullVideoEvent
    public final void callFullVideoSkippedVideo() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.fullvideo.GMCustomFullVideoAdapter.6
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMFullVideoAdListener gMFullVideoAdListener = (GMFullVideoAdListener) ((GMCustomBaseAdapter) GMCustomFullVideoAdapter.this).d.getTTAdapterCallback();
                    if (gMFullVideoAdListener != null) {
                        gMFullVideoAdListener.onSkippedVideo();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.IGMCustomLoadAdCall
    public final void callLoadFail(GMCustomAdError gMCustomAdError) {
        if (isCallLoadFailCall()) {
            Logger.e("TTMediationSDK", "自定义Adapter 加载成功或者失败回调只能调用一次");
            return;
        }
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter != null) {
            tTAbsAdLoaderAdapter.notifyAdFailed(new AdError(AdError.ERROR_CODE_CUSTOM_FULL_VIDEO_LOAD_ERROR, AdError.getMessage(AdError.ERROR_CODE_CUSTOM_FULL_VIDEO_SHOW_ERROR), gMCustomAdError == null ? -1 : gMCustomAdError.getCode(), gMCustomAdError == null ? "" : gMCustomAdError.getMessage()));
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
        this.d = new GMCustomFullVideoAd();
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

    public abstract void load(Context context, GMAdSlotFullVideo gMAdSlotFullVideo, GMCustomServiceConfig gMCustomServiceConfig);

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter
    public void loadCustom(Context context, GMAdSlotBase gMAdSlotBase, GMCustomServiceConfig gMCustomServiceConfig) {
        GMAdSlotFullVideo gMAdSlotFullVideo;
        if (gMAdSlotBase instanceof GMAdSlotInterstitialFull) {
            gMAdSlotFullVideo = ((GMAdSlotInterstitialFull) gMAdSlotBase).getGMAdSlotFullVideo();
        } else if (!(gMAdSlotBase instanceof GMAdSlotFullVideo)) {
            callLoadFail(new GMCustomAdError(AdError.ERROR_ADN_NO_ERROR_CODE, "ClassCastException：load ad fail adSlot is not GMAdSlotInterstitialFull or GMAdSlotFullVideo"));
            return;
        } else {
            gMAdSlotFullVideo = (GMAdSlotFullVideo) gMAdSlotBase;
        }
        load(context, gMAdSlotFullVideo, gMCustomServiceConfig);
    }

    public final void setMediaExtraInfo(Map<String, Object> map) {
        if (map != null) {
            this.g = new HashMap();
            this.g.putAll(map);
        }
    }
}
