package com.bytedance.msdk.adapter.config;

import com.bytedance.msdk.api.AdError;
/* loaded from: classes.dex */
public interface IGMInitAdnResult {
    void fail(AdError adError);

    void success();
}
