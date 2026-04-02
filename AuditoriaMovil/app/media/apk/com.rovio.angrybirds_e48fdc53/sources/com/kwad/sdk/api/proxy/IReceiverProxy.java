package com.kwad.sdk.api.proxy;

import android.content.Context;
import android.content.Intent;
import com.kwad.sdk.api.core.KsAdSdkDynamicApi;
@KsAdSdkDynamicApi
/* loaded from: classes.dex */
public interface IReceiverProxy extends IComponentProxy {
    @KsAdSdkDynamicApi
    void onReceive(Context context, Intent intent);
}
