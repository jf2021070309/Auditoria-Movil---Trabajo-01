package com.sdk.ksdk.gro.reward;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class GMRewardUtils {
    private static final String TAG = "TMeRewardUtils";

    public static Map<String, String> getCustomData() {
        Map<String, String> customData = new HashMap<>();
        customData.put("pangle", "pangle media_extra");
        customData.put("gdt", "gdt custom data");
        customData.put("ks", "ks custom data");
        customData.put("sigmob", "sigmob custom data");
        customData.put("mintegral", "mintegral custom data");
        customData.put("baidu", "baidu custom data");
        customData.put("gromoreExtra", "gromore serverside verify extra data");
        return customData;
    }

    public static void processRewardVerify(RewardItem rewardItem) {
        Map<String, Object> customData = rewardItem.getCustomData();
        if (customData != null) {
            Boolean isGroMoreServerSideVerify = (Boolean) customData.get("isGroMoreServerSideVerify");
            if (isGroMoreServerSideVerify != null && isGroMoreServerSideVerify.booleanValue()) {
                rewardItem.rewardVerify();
                Integer reason = (Integer) customData.get("reason");
                if (reason != null) {
                    Logger.d(TAG, "rewardItem，开发者服务器回传的reason，开发者不传时为空");
                }
                Integer errorCode = (Integer) customData.get("errorCode");
                if (errorCode != null) {
                    String errorMsg = (String) customData.get("errorMsg");
                    Logger.d(TAG, "rewardItem, gromore服务端验证异常时的错误信息，未发生异常时为0或20000：errorCode:" + errorCode + ", errMsg: " + errorMsg);
                }
                String gromoreExtra = (String) customData.get("gromoreExtra");
                Logger.d(TAG, "rewardItem, 开发者通过AdSlot传入的extra信息，会透传给媒体的服务器。开发者不传时为空，extra:" + gromoreExtra);
                String transId = (String) customData.get("transId");
                Logger.d(TAG, "rewardItem, gromore服务端验证产生的transId，一次广告播放会产生的唯一的transid: " + transId);
                return;
            }
            String adnName = (String) customData.get("adnName");
            if (!TextUtils.isEmpty(adnName)) {
                char c = 65535;
                if (adnName.hashCode() == 102199 && adnName.equals("gdt")) {
                    c = 0;
                }
                if (c == 0) {
                    Logger.d(TAG, "rewardItem gdt: " + customData.get("transId"));
                }
            }
        }
    }

    public static GMRewardedAdListener getRewardPlayAgainListener() {
        return new GMRewardedAdListener() { // from class: com.sdk.ksdk.gro.reward.GMRewardUtils.1
            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
            public void onRewardedAdShow() {
                Log.d(GMRewardUtils.TAG, "onRewardedAdShow---play again");
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
            public void onRewardedAdShowFail(AdError adError) {
                if (adError == null) {
                    return;
                }
                Log.d(GMRewardUtils.TAG, "onRewardedAdShowFail---play again, errCode: " + adError.code + ", errMsg: " + adError.message);
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
            public void onRewardClick() {
                Log.d(GMRewardUtils.TAG, "onRewardClick---play again");
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
            public void onRewardedAdClosed() {
                Log.d(GMRewardUtils.TAG, "onRewardedAdClosed---play again");
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
            public void onVideoComplete() {
                Log.d(GMRewardUtils.TAG, "onVideoComplete---play again");
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
            public void onVideoError() {
                Log.d(GMRewardUtils.TAG, "onVideoError---play again");
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
            public void onRewardVerify(RewardItem rewardItem) {
                Log.d(GMRewardUtils.TAG, "onRewardVerify---play again");
                if (rewardItem != null) {
                    boolean isRewardVerify = rewardItem.rewardVerify();
                    Log.d(GMRewardUtils.TAG, "onRewardVerify rewardItem isRewardVerify: " + isRewardVerify);
                }
            }

            @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
            public void onSkippedVideo() {
                Log.d(GMRewardUtils.TAG, "onSkippedVideo---play again");
            }
        };
    }
}
