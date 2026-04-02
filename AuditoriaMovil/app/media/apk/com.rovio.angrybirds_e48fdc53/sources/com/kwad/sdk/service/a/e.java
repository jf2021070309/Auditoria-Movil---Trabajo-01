package com.kwad.sdk.service.a;

import android.content.Context;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes3.dex */
public interface e {
    boolean af(AdTemplate adTemplate);

    String getApiVersion();

    int getApiVersionCode();

    String getAppId();

    String getAppName();

    Context getContext();

    boolean getIsExternal();

    String getSDKVersion();

    boolean hasInitFinish();

    boolean isPersonalRecommend();

    boolean isProgrammaticRecommend();

    boolean oi();

    com.kwad.sdk.core.response.b.e sI();
}
