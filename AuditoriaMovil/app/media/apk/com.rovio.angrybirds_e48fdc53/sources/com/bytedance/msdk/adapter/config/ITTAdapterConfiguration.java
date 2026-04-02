package com.bytedance.msdk.adapter.config;

import android.content.Context;
import com.bytedance.msdk.api.v2.GMAppDialogClickListener;
import com.bytedance.msdk.api.v2.GMPrivacyConfig;
import com.bytedance.msdk.api.v2.IGMLiveTokenInjectionAuth;
import java.util.Map;
/* loaded from: classes.dex */
public interface ITTAdapterConfiguration extends IGMInitAdn {
    void checkVersion();

    String getAdNetworkName();

    String getAdapterVersion();

    String getBiddingToken(Context context, Map<String, Object> map);

    Map<String, Object> getBiddingTokenMap(Context context, Map<String, Object> map);

    String getGroMoreSdkVersion();

    Map<String, String> getMsdkRequestOptions();

    String getNetworkSdkPluginVersion();

    String getNetworkSdkVersion();

    @Deprecated
    void initializeNetwork(Context context, Map<String, Object> map, TTOnNetworkInitializationFinishedListener tTOnNetworkInitializationFinishedListener);

    boolean isNewInitFunction();

    void setInjectionAuth(IGMLiveTokenInjectionAuth iGMLiveTokenInjectionAuth);

    void setMsdkRequestOptions(Map<String, String> map);

    void setPrivacyConfig(GMPrivacyConfig gMPrivacyConfig);

    void setThemeStatus(Map<String, Object> map);

    int showOpenOrInstallAppDialog(GMAppDialogClickListener gMAppDialogClickListener);
}
