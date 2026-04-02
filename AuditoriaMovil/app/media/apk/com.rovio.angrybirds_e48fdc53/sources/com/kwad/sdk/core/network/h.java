package com.kwad.sdk.core.network;

import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.g;
/* loaded from: classes.dex */
public interface h<R extends g, T extends BaseResultData> {
    void onError(R r, int i, String str);

    void onStartRequest(R r);

    void onSuccess(R r, T t);
}
