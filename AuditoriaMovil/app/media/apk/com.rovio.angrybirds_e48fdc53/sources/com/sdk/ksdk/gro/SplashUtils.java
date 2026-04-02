package com.sdk.ksdk.gro;

import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
/* loaded from: classes3.dex */
public class SplashUtils {
    public static GMNetworkRequestInfo getGMNetworkRequestInfo() {
        return new GMNetworkRequestInfo() { // from class: com.sdk.ksdk.gro.SplashUtils.1
            @Override // com.bytedance.msdk.api.v2.GMNetworkRequestInfo
            public int getAdNetworkFlatFromId() {
                return super.getAdNetworkFlatFromId();
            }

            @Override // com.bytedance.msdk.api.v2.GMNetworkRequestInfo
            public String getAdNetworkSlotId() {
                return super.getAdNetworkSlotId();
            }

            @Override // com.bytedance.msdk.api.v2.GMNetworkRequestInfo
            public String getAppId() {
                return super.getAppId();
            }

            @Override // com.bytedance.msdk.api.v2.GMNetworkRequestInfo
            public String getAppKey() {
                return super.getAppKey();
            }
        };
    }
}
