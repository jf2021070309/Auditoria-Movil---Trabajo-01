package com.kwad.sdk.api;

import com.kwad.sdk.api.core.KsAdSdkApi;
@KsAdSdkApi
/* loaded from: classes.dex */
public interface KsImage {
    @KsAdSdkApi
    int getHeight();

    @KsAdSdkApi
    String getImageUrl();

    @KsAdSdkApi
    int getWidth();

    @KsAdSdkApi
    boolean isValid();
}
