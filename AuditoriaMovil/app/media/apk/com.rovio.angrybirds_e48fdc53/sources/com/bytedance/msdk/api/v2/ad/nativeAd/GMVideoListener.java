package com.bytedance.msdk.api.v2.ad.nativeAd;

import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.api.AdError;
/* loaded from: classes.dex */
public interface GMVideoListener extends ITTAdatperCallback {
    void onProgressUpdate(long j, long j2);

    void onVideoCompleted();

    void onVideoError(AdError adError);

    void onVideoPause();

    void onVideoResume();

    void onVideoStart();
}
