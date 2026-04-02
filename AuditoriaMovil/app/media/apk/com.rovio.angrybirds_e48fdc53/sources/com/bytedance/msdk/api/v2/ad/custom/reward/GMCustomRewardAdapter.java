package com.bytedance.msdk.api.v2.ad.custom.reward;

import android.app.Activity;
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
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.api.v2.slot.GMAdSlotRewardVideo;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class GMCustomRewardAdapter extends GMCustomVideoAdapter implements IGMCustomRewardEvent {
    private volatile boolean h = false;

    public final void callAdVideoCache() {
        GMCustomAd gMCustomAd;
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter == null || (gMCustomAd = this.d) == null) {
            return;
        }
        tTAbsAdLoaderAdapter.notifyAdVideoCache(gMCustomAd, (AdError) null);
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.IGMCustomLoadAdCall
    public final void callLoadFail(GMCustomAdError gMCustomAdError) {
        if (isCallLoadFailCall()) {
            Logger.e("TTMediationSDK", "自定义Adapter 加载成功或者失败回调只能调用一次");
            return;
        }
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter != null) {
            tTAbsAdLoaderAdapter.notifyAdFailed(new AdError(AdError.ERROR_CODE_CUSTOM_REWARD_LOAD_ERROR, AdError.getMessage(AdError.ERROR_CODE_CUSTOM_REWARD_LOAD_ERROR), gMCustomAdError == null ? -1 : gMCustomAdError.getCode(), gMCustomAdError == null ? "" : gMCustomAdError.getMessage()));
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
        this.d = new GMCustomRewardAd();
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

    @Override // com.bytedance.msdk.api.v2.ad.custom.reward.IGMCustomRewardEvent
    public final void callRewardClick() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.2
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMCustomRewardAdapter.this.checkClick(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.2.1
                        @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                        public void callback() {
                            GMRewardedAdListener gMRewardedAdListener = (GMRewardedAdListener) ((GMCustomBaseAdapter) GMCustomRewardAdapter.this).d.getTTAdapterCallback();
                            if (gMRewardedAdListener != null) {
                                gMRewardedAdListener.onRewardClick();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.reward.IGMCustomRewardEvent
    public final void callRewardSkippedVideo() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.7
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMRewardedAdListener gMRewardedAdListener = (GMRewardedAdListener) ((GMCustomBaseAdapter) GMCustomRewardAdapter.this).d.getTTAdapterCallback();
                    if (gMRewardedAdListener != null) {
                        gMRewardedAdListener.onSkippedVideo();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.reward.IGMCustomRewardEvent
    public final void callRewardVerify(final RewardItem rewardItem) {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.6
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMRewardedAdListener gMRewardedAdListener = (GMRewardedAdListener) ((GMCustomBaseAdapter) GMCustomRewardAdapter.this).d.getTTAdapterCallback();
                    if (gMRewardedAdListener != null) {
                        gMRewardedAdListener.onRewardVerify(rewardItem);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.reward.IGMCustomRewardEvent
    public final void callRewardVideoComplete() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.4
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMRewardedAdListener gMRewardedAdListener = (GMRewardedAdListener) ((GMCustomBaseAdapter) GMCustomRewardAdapter.this).d.getTTAdapterCallback();
                    if (gMRewardedAdListener != null) {
                        gMRewardedAdListener.onVideoComplete();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.reward.IGMCustomRewardEvent
    public final void callRewardVideoError() {
        if (this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.5
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMRewardedAdListener gMRewardedAdListener = (GMRewardedAdListener) ((GMCustomBaseAdapter) GMCustomRewardAdapter.this).d.getTTAdapterCallback();
                    if (gMRewardedAdListener != null) {
                        gMRewardedAdListener.onVideoError();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.reward.IGMCustomRewardEvent
    public final void callRewardedAdClosed() {
        if (this.h && this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.3
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMRewardedAdListener gMRewardedAdListener = (GMRewardedAdListener) ((GMCustomBaseAdapter) GMCustomRewardAdapter.this).d.getTTAdapterCallback();
                    if (gMRewardedAdListener != null) {
                        gMRewardedAdListener.onRewardedAdClosed();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.reward.IGMCustomRewardEvent
    public final void callRewardedAdShow() {
        if (this.d != null) {
            checkLoadSuccess(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.1
                @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                public void callback() {
                    GMCustomRewardAdapter.this.checkShow(new GMCustomBaseAdapter.CheckCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.reward.GMCustomRewardAdapter.1.1
                        @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.CheckCallback
                        public void callback() {
                            GMRewardedAdListener gMRewardedAdListener = (GMRewardedAdListener) ((GMCustomBaseAdapter) GMCustomRewardAdapter.this).d.getTTAdapterCallback();
                            if (gMRewardedAdListener != null) {
                                GMCustomRewardAdapter.this.h = true;
                                gMRewardedAdListener.onRewardedAdShow();
                            }
                        }
                    });
                }
            });
        }
    }

    public abstract void load(Context context, GMAdSlotRewardVideo gMAdSlotRewardVideo, GMCustomServiceConfig gMCustomServiceConfig);

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter
    public void loadCustom(Context context, GMAdSlotBase gMAdSlotBase, GMCustomServiceConfig gMCustomServiceConfig) {
        if (gMAdSlotBase instanceof GMAdSlotRewardVideo) {
            load(context, (GMAdSlotRewardVideo) gMAdSlotBase, gMCustomServiceConfig);
        } else {
            callLoadFail(new GMCustomAdError(AdError.ERROR_ADN_NO_ERROR_CODE, "ClassCastException：load ad fail adSlot is not GMAdSlotRewardVideo"));
        }
    }

    public final void setMediaExtraInfo(Map<String, Object> map) {
        if (map != null) {
            this.g = new HashMap();
            this.g.putAll(map);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.custom.base.GMCustomVideoAdapter
    public abstract void showAd(Activity activity);
}
