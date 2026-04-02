package com.sdk.ksdk.gro;

import android.content.Context;
import com.bytedance.msdk.api.v2.GMAdConfig;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMConfigUserInfoForSegment;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.msdk.api.v2.GMPrivacyConfig;
import com.sdk.ksdk.util.Logger;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class GMAdManagerHolder {
    public static boolean sInit;

    public static void init(Context context, String appid, String appname) {
        doInit(context, appid, appname);
    }

    private static void doInit(Context context, String appid, String appname) {
        if (!sInit) {
            Logger.i("initializegromore");
            GMMediationAdSdk.initialize(context, buildV2Config(context, appid, appname));
            sInit = true;
        }
    }

    public static GMAdConfig buildV2Config(Context context, String appid, String appname) {
        return new GMAdConfig.Builder().setAppId(appid).setAppName(appname).setDebug(true).build();
    }

    private static GMConfigUserInfoForSegment getConfigUserInfo() {
        GMConfigUserInfoForSegment userInfo = new GMConfigUserInfoForSegment();
        userInfo.setUserId("msdk-demo");
        userInfo.setGender("male");
        userInfo.setChannel("msdk-channel");
        userInfo.setSubChannel("msdk-sub-channel");
        userInfo.setAge(999);
        userInfo.setUserValueGroup("msdk-demo-user-value-group");
        Map<String, String> customInfos = new HashMap<>();
        customInfos.put("aaaa", "test111");
        customInfos.put("bbbb", "test222");
        userInfo.setCustomInfos(customInfos);
        return userInfo;
    }

    private static GMPrivacyConfig getPrivacyConfig() {
        return new GMPrivacyConfig() { // from class: com.sdk.ksdk.gro.GMAdManagerHolder.1
            @Override // com.bytedance.msdk.api.v2.GMPrivacyConfig
            public boolean isCanUsePhoneState() {
                return true;
            }

            @Override // com.bytedance.msdk.api.v2.GMPrivacyConfig
            public String getMacAddress() {
                return "";
            }

            @Override // com.bytedance.msdk.api.v2.GMPrivacyConfig
            public GMAdConstant.ADULT_STATE getAgeGroup() {
                return GMAdConstant.ADULT_STATE.AGE_ADULT;
            }
        };
    }
}
