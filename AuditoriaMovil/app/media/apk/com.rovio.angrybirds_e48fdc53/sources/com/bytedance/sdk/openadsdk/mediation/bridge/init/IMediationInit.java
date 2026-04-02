package com.bytedance.sdk.openadsdk.mediation.bridge.init;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes.dex */
public interface IMediationInit extends Bridge {
    void initAdn(Context context, ValueSet valueSet);
}
