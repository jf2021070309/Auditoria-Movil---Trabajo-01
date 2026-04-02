package com.sdk.ksdk.gro;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.msdk.api.v2.GMSettingConfigCallback;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardAd;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotRewardVideo;
import com.sdk.ksdk.gro.reward.GMRewardUtils;
import com.sdk.ksdk.listener.NRewardVideoListener;
import com.sdk.ksdk.util.Logger;
import com.sdk.ksdk.util.Var;
/* loaded from: classes3.dex */
public class GroRewardAD {
    private static final String TAG_Time = "KSDK-GROMORE_Time";
    private GMRewardAd mRewardAd;
    private int total = 0;
    private int timeTotal = 0;
    private int clickCount = 2;
    private int timeClickCount = 3;

    public void loadReward(Activity activity, String id, NRewardVideoListener listener) {
        if (activity == null || TextUtils.isEmpty(id)) {
            Logger.i("请求reward，传入参数有误");
            return;
        }
        Logger.i("请求reward，id:" + id);
        startLoad(activity, id, listener);
    }

    public void loadReward_Time(Activity activity, String id) {
        if (activity == null || TextUtils.isEmpty(id)) {
            Logger.i(TAG_Time, "Time：请求Reward，传入参数有误");
            return;
        }
        Logger.i(TAG_Time, "Time：请求Reward，id:" + id);
        startLoad(activity, id, null);
    }

    private void startLoad(final Activity activity, final String id, final NRewardVideoListener listener) {
        if (GMMediationAdSdk.configLoadSuccess()) {
            loadRewardAd(activity, id, listener);
        } else {
            GMMediationAdSdk.registerConfigCallback(new GMSettingConfigCallback() { // from class: com.sdk.ksdk.gro.GroRewardAD.1
                @Override // com.bytedance.msdk.api.v2.GMSettingConfigCallback
                public void configLoad() {
                    GroRewardAD.this.loadRewardAd(activity, id, listener);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRewardAd(final Activity activity, String id, final NRewardVideoListener listener) {
        this.mRewardAd = new GMRewardAd(activity, id);
        GMAdSlotRewardVideo adSlotRewardVideo = new GMAdSlotRewardVideo.Builder().setUserID("user123").setOrientation(1).build();
        this.mRewardAd.loadAd(adSlotRewardVideo, new GMRewardedAdLoadCallback() { // from class: com.sdk.ksdk.gro.GroRewardAD.2
            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback
            public void onRewardVideoAdLoad() {
                Log.e(Var.TAG, "load RewardVideo ad success !");
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback
            public void onRewardVideoCached() {
                Log.d(Var.TAG, "onRewardVideoCached....缓存成功");
                GroRewardAD.this.showRewardAd(activity, listener);
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback
            public void onRewardVideoLoadFail(AdError adError) {
                Log.e(Var.TAG, "load RewardVideo ad error : " + adError.code + ", " + adError.message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRewardAd(Activity activity, final NRewardVideoListener listener) {
        if (this.mRewardAd.isReady()) {
            this.mRewardAd.setRewardAdListener(new GMRewardedAdListener() { // from class: com.sdk.ksdk.gro.GroRewardAD.3
                @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
                public void onRewardClick() {
                    Log.d(Var.TAG, "onRewardClick");
                    NRewardVideoListener nRewardVideoListener = listener;
                    if (nRewardVideoListener != null) {
                        nRewardVideoListener.rewardVideoClick();
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
                public void onRewardVerify(RewardItem rewardItem) {
                    Log.d(Var.TAG, "onRewardVerify");
                    NRewardVideoListener nRewardVideoListener = listener;
                    if (nRewardVideoListener != null) {
                        nRewardVideoListener.rewardVideoVerify(true, 0, "", 0, "");
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
                public void onRewardedAdClosed() {
                    Log.d(Var.TAG, "onRewardedAdClosed");
                    NRewardVideoListener nRewardVideoListener = listener;
                    if (nRewardVideoListener != null) {
                        nRewardVideoListener.rewardVideoClose();
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
                public void onRewardedAdShow() {
                    Log.d(Var.TAG, "onRewardedAdShow");
                    NRewardVideoListener nRewardVideoListener = listener;
                    if (nRewardVideoListener != null) {
                        nRewardVideoListener.rewardVideoShow();
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
                public void onRewardedAdShowFail(AdError adError) {
                    Log.d(Var.TAG, "onRewardedAdShowFail:" + adError.toString());
                    NRewardVideoListener nRewardVideoListener = listener;
                    if (nRewardVideoListener != null) {
                        nRewardVideoListener.rewardVideoError(adError.toString());
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
                public void onSkippedVideo() {
                    Log.d(Var.TAG, "onSkippedVideo");
                    NRewardVideoListener nRewardVideoListener = listener;
                    if (nRewardVideoListener != null) {
                        nRewardVideoListener.rewardVideoSkipped();
                    }
                }

                @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
                public void onVideoComplete() {
                    Log.d(Var.TAG, "onVideoComplete");
                    NRewardVideoListener nRewardVideoListener = listener;
                    if (nRewardVideoListener != null) {
                        nRewardVideoListener.rewardVideoComplete();
                        GroRewardAD.this.total++;
                        return;
                    }
                    GroRewardAD.this.timeTotal++;
                }

                @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
                public void onVideoError() {
                    Log.d(Var.TAG, "onVideoError");
                }
            });
            this.mRewardAd.setRewardPlayAgainListener(GMRewardUtils.getRewardPlayAgainListener());
            this.mRewardAd.showRewardAd(activity);
        }
    }

    public void setClickCount(int count) {
        this.clickCount = count;
    }

    public void setTimeClickCount(int count) {
        this.timeClickCount = count;
    }
}
