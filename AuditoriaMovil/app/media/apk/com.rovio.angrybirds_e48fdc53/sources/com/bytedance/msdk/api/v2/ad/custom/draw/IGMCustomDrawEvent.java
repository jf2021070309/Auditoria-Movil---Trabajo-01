package com.bytedance.msdk.api.v2.ad.custom.draw;

import android.view.View;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomAdError;
/* loaded from: classes.dex */
public interface IGMCustomDrawEvent {
    void callDrawAdClick();

    void callDrawAdShow();

    void callDrawDislikeCancel();

    void callDrawDislikeRefuse();

    void callDrawDislikeSelected(int i, String str);

    void callDrawDislikeShow();

    void callDrawRenderFail(View view, String str, int i);

    void callDrawRenderSuccess(float f, float f2);

    void callDrawVideoCompleted();

    void callDrawVideoError(GMCustomAdError gMCustomAdError);

    void callDrawVideoPause();

    void callDrawVideoProgressUpdate(long j, long j2);

    void callDrawVideoResume();

    void callDrawVideoStart();
}
