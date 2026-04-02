package com.bytedance.msdk.api.v2.ad.nativeAd;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.v2.GMAdDislike;
import com.bytedance.msdk.api.v2.GMDislikeCallback;
import com.bytedance.msdk.api.v2.ad.GMAdAppDownloadListener;
import com.bytedance.msdk.api.v2.ad.GMShakeViewListener;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface GMNativeAd {
    @Deprecated
    boolean canAdReuse();

    void cancelDownload();

    void destroy();

    void dislikeClick(String str, Map<String, Object> map);

    String getActionText();

    int getAdImageMode();

    @Deprecated
    View getAdLogoView();

    @Deprecated
    int getAdNetworkPlatformId();

    String getAdNetworkPlatformName();

    @Deprecated
    String getAdNetworkRitId();

    GMAdEcpmInfo getBestEcpm();

    String getDescription();

    GMAdDislike getDislikeDialog(Activity activity);

    GMAdDislike getDislikeDialog(Activity activity, Map<String, Object> map);

    int getDownloadStatus();

    View getExpressView();

    Map<String, Object> getExtraMsg();

    GMNativeCustomVideoReporter getGMNativeCustomVideoReporter();

    String getIconUrl();

    int getImageHeight();

    List<String> getImageList();

    String getImageUrl();

    int getImageWidth();

    int getInteractionType();

    Map<String, Object> getMediaExtraInfo();

    GMNativeAdAppInfo getNativeAdAppInfo();

    String getPackageName();

    @Deprecated
    String getPreEcpm();

    @Deprecated
    int getSdkNumType();

    GMAdEcpmInfo getShowEcpm();

    String getSource();

    double getStarRating();

    @Deprecated
    TTBaseAd getTTBaseAd();

    String getTitle();

    int getVideoHeight();

    String getVideoUrl();

    int getVideoWidth();

    boolean hasDislike();

    boolean isExpressAd();

    boolean isHasShown();

    boolean isReady();

    boolean isServerBidding();

    void onPause();

    void pauseAppDownload();

    void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, GMViewBinder gMViewBinder);

    void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, GMViewBinder gMViewBinder);

    @Deprecated
    void registerView(ViewGroup viewGroup, List<View> list, List<View> list2, GMViewBinder gMViewBinder);

    void render();

    void resume();

    void resumeAppDownload();

    void setAppDownloadListener(GMAdAppDownloadListener gMAdAppDownloadListener);

    void setDislikeCallback(Activity activity, GMDislikeCallback gMDislikeCallback);

    void setGMShakeViewListener(GMShakeViewListener gMShakeViewListener);

    void setGMVideoRewardListener(GMVideoRewardListener gMVideoRewardListener);

    void setNativeAdListener(GMNativeAdListener gMNativeAdListener);

    void setUseCustomVideo(boolean z);

    void setVideoListener(GMVideoListener gMVideoListener);

    void unregisterView();
}
