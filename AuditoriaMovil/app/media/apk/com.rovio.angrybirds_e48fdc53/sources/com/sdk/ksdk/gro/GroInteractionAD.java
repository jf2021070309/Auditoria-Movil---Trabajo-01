package com.sdk.ksdk.gro;

import android.app.Activity;
import android.util.Log;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.msdk.api.v2.GMSettingConfigCallback;
import com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAd;
import com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener;
import com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotInterstitialFull;
import com.sdk.ksdk.listener.InteractionListener;
import com.sdk.ksdk.util.Logger;
import com.sdk.ksdk.util.Var;
/* loaded from: classes3.dex */
public class GroInteractionAD {
    private static final String TAG_Time = "KSDK-GROMORE_Time";
    private String[] ids;
    GMInterstitialFullAd mGMInterstitialFullAd;
    private int timeTotal = 0;
    private int total = 0;
    private int clickCount = 3;
    private int timeClickCount = 3;
    public float sizeWidth = 350.0f;
    public float sizeHeight = 350.0f;

    public void loadFullInter(Activity activity, InteractionListener listener) {
        if (activity == null) {
            Logger.i("请求inter，传入参数有误");
            return;
        }
        String[] strArr = this.ids;
        if (strArr == null) {
            Logger.i("请求inter，id集合为空");
            return;
        }
        int index = 0;
        if (strArr.length > 1) {
            index = this.total % strArr.length;
        }
        if (index > strArr.length - 1) {
            Logger.i("inter id越界");
            return;
        }
        Logger.i("请求inter，id:" + this.ids[index]);
        loadCOnfigAD(activity, this.ids[index], listener);
    }

    public void loadFullInteraction_Time(Activity activity) {
        if (activity == null) {
            Logger.i(TAG_Time, "请求inter，传入参数有误");
            return;
        }
        String[] strArr = this.ids;
        if (strArr == null) {
            Logger.i(TAG_Time, "请求inter，id集合为空");
            return;
        }
        int index = 0;
        if (strArr.length > 1) {
            index = this.timeTotal % strArr.length;
        }
        if (index > strArr.length - 1) {
            Logger.i(TAG_Time, "inter id越界");
            return;
        }
        Logger.i(TAG_Time, "Time：请求inter，id:" + this.ids[index]);
        loadCOnfigAD(activity, this.ids[index], null);
    }

    private void loadCOnfigAD(final Activity activity, final String id, final InteractionListener listener) {
        if (GMMediationAdSdk.configLoadSuccess()) {
            loadInterstitialFullAd(activity, id, listener);
        } else {
            GMMediationAdSdk.registerConfigCallback(new GMSettingConfigCallback() { // from class: com.sdk.ksdk.gro.GroInteractionAD.1
                @Override // com.bytedance.msdk.api.v2.GMSettingConfigCallback
                public void configLoad() {
                    GroInteractionAD.this.loadInterstitialFullAd(activity, id, listener);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadInterstitialFullAd(final Activity activity, String id, final InteractionListener listener) {
        this.mGMInterstitialFullAd = new GMInterstitialFullAd(activity, id);
        GMAdSlotInterstitialFull adSlotInterstitialFull = new GMAdSlotInterstitialFull.Builder().setImageAdSize(600, 600).setUserID("user123").setOrientation(1).build();
        this.mGMInterstitialFullAd.loadAd(adSlotInterstitialFull, new GMInterstitialFullAdLoadCallback() { // from class: com.sdk.ksdk.gro.GroInteractionAD.2
            @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdLoadCallback
            public void onInterstitialFullLoadFail(AdError adError) {
                Log.e(Var.TAG, "load interaction ad error : " + adError.code + ", " + adError.message);
            }

            @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdLoadCallback
            public void onInterstitialFullAdLoad() {
                Log.e(Var.TAG, "load interaction ad success ! ");
            }

            @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdLoadCallback
            public void onInterstitialFullCached() {
                Log.d(Var.TAG, "onInterstitialFullCached....缓存成功！");
                GroInteractionAD.this.showInterstitialFullAd(activity, listener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInterstitialFullAd(Activity activity, final InteractionListener listener) {
        GMInterstitialFullAd gMInterstitialFullAd = this.mGMInterstitialFullAd;
        if (gMInterstitialFullAd != null && gMInterstitialFullAd.isReady()) {
            this.mGMInterstitialFullAd.setAdInterstitialFullListener(new GMInterstitialFullAdListener() { // from class: com.sdk.ksdk.gro.GroInteractionAD.3
                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onInterstitialFullShow() {
                    Log.d(Var.TAG, "onInterstitialFullShow");
                    InteractionListener interactionListener = listener;
                    if (interactionListener != null) {
                        interactionListener.interactionShow();
                        GroInteractionAD.this.total++;
                        return;
                    }
                    GroInteractionAD.this.timeTotal++;
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onInterstitialFullShowFail(AdError adError) {
                    Log.d(Var.TAG, "onInterstitialFullShowFail");
                    InteractionListener interactionListener = listener;
                    if (interactionListener != null) {
                        interactionListener.interactionError(adError.toString());
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onInterstitialFullClick() {
                    Log.d(Var.TAG, "onInterstitialFullClick");
                    InteractionListener interactionListener = listener;
                    if (interactionListener != null) {
                        interactionListener.interactionClick();
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onInterstitialFullClosed() {
                    Log.d(Var.TAG, "onInterstitialFullClosed");
                    InteractionListener interactionListener = listener;
                    if (interactionListener != null) {
                        interactionListener.interactionClose();
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onVideoComplete() {
                    Log.d(Var.TAG, "onVideoComplete");
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onVideoError() {
                    Log.d(Var.TAG, "onVideoError");
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onSkippedVideo() {
                    Log.d(Var.TAG, "onSkippedVideo");
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onAdOpened() {
                    Log.d(Var.TAG, "onAdOpened");
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onAdLeftApplication() {
                    Log.d(Var.TAG, "onAdLeftApplication");
                }

                @Override // com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdListener
                public void onRewardVerify(RewardItem rewardItem) {
                    Log.d(Var.TAG, "onRewardVerify");
                }
            });
            this.mGMInterstitialFullAd.showAd(activity);
        }
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public void setClickCount(int count) {
        this.clickCount = count;
    }

    public void setTimeClickCount(int count) {
        this.timeClickCount = count;
    }
}
