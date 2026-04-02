package com.kwad.sdk.api;

import com.kwad.sdk.api.core.KsAdSdkApi;
@KsAdSdkApi
/* loaded from: classes.dex */
public interface KsInitCallback {
    void onFail(int i, String str);

    void onSuccess();
}
