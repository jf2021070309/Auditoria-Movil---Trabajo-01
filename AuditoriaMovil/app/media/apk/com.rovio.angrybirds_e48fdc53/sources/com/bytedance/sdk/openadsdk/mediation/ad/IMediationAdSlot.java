package com.bytedance.sdk.openadsdk.mediation.ad;

import java.util.Map;
/* loaded from: classes.dex */
public interface IMediationAdSlot {
    Map<String, Object> getExtraObject();

    MediationNativeToBannerListener getMediationNativeToBannerListener();

    MediationSplashRequestInfo getMediationSplashRequestInfo();

    int getRewardAmount();

    String getRewardName();

    String getScenarioId();

    float getShakeViewHeight();

    float getShakeViewWidth();

    float getVolume();

    String getWxAppId();

    boolean isAllowShowCloseBtn();

    boolean isBidNotify();

    boolean isMuted();

    boolean isSplashPreLoad();

    boolean isSplashShakeButton();

    boolean isUseSurfaceView();
}
