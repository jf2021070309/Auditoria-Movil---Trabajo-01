package com.bytedance.sdk.openadsdk.mediation.init;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public interface IMediationConfig {
    JSONObject getCustomLocalConfig();

    boolean getHttps();

    Map<String, Object> getLocalExtra();

    MediationConfigUserInfoForSegment getMediationConfigUserInfoForSegment();

    String getOpensdkVer();

    String getPublisherDid();

    boolean isOpenAdnTest();

    boolean isSupportH265();

    boolean isSupportSplashZoomout();

    boolean isWxInstalled();

    String wxAppId();
}
