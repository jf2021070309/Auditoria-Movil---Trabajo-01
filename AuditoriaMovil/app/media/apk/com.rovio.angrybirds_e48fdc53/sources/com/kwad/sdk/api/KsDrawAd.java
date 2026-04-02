package com.kwad.sdk.api;

import android.content.Context;
import android.view.View;
import com.kwad.sdk.api.core.KsAdSdkApi;
import com.kwad.sdk.api.model.AdExposureFailedReason;
@KsAdSdkApi
/* loaded from: classes.dex */
public interface KsDrawAd extends BaseKSAd {

    @KsAdSdkApi
    /* loaded from: classes.dex */
    public interface AdInteractionListener {
        @KsAdSdkApi
        void onAdClicked();

        @KsAdSdkApi
        void onAdShow();

        @KsAdSdkApi
        void onVideoPlayEnd();

        @KsAdSdkApi
        void onVideoPlayError();

        @KsAdSdkApi
        void onVideoPlayPause();

        @KsAdSdkApi
        void onVideoPlayResume();

        @KsAdSdkApi
        void onVideoPlayStart();
    }

    @KsAdSdkApi
    View getDrawView(Context context);

    @KsAdSdkApi
    int getECPM();

    @KsAdSdkApi
    int getInteractionType();

    @KsAdSdkApi
    int getMaterialType();

    @KsAdSdkApi
    void reportAdExposureFailed(int i, AdExposureFailedReason adExposureFailedReason);

    @KsAdSdkApi
    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    @KsAdSdkApi
    @Deprecated
    void setBidEcpm(int i);

    @KsAdSdkApi
    void setBidEcpm(long j, long j2);
}
