package com.bytedance.msdk.adapter.config;

import com.bytedance.msdk.api.AdError;
/* loaded from: classes.dex */
public interface TTOnNetworkInitializationFinishedListener {
    void onNetworkInitializationFinished(Class<? extends ITTAdapterConfiguration> cls, AdError adError);
}
