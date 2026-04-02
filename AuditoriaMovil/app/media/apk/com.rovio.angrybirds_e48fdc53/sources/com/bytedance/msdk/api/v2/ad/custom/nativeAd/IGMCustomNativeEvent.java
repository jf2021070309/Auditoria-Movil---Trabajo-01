package com.bytedance.msdk.api.v2.ad.custom.nativeAd;

import android.view.View;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomAdError;
/* loaded from: classes.dex */
public interface IGMCustomNativeEvent {
    void callNativeAdClick();

    void callNativeAdShow();

    void callNativeDislikeCancel();

    void callNativeDislikeRefuse();

    void callNativeDislikeSelected(int i, String str);

    void callNativeDislikeShow();

    void callNativeOnDownloadActive(long j, long j2, String str, String str2);

    void callNativeOnDownloadFailed(long j, long j2, String str, String str2);

    void callNativeOnDownloadFinished(long j, String str, String str2);

    void callNativeOnDownloadPaused(long j, long j2, String str, String str2);

    void callNativeOnIdle();

    void callNativeOnInstalled(String str, String str2);

    void callNativeRenderFail(View view, String str, int i);

    void callNativeRenderSuccess(float f, float f2);

    void callNativeVideoCompleted();

    void callNativeVideoError(GMCustomAdError gMCustomAdError);

    void callNativeVideoPause();

    void callNativeVideoProgressUpdate(long j, long j2);

    void callNativeVideoResume();

    void callNativeVideoStart();
}
