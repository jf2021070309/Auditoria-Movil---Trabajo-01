package com.bytedance.sdk.openadsdk.mediation.bridge.init;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
/* loaded from: classes.dex */
public abstract class MediationInitImpl implements IMediationInit {
    public MediationInitConfig mInitConfig;

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public final <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8240) {
            initAdn((Context) valueSet.objectValue(8009, Context.class), (ValueSet) valueSet.objectValue(8424, ValueSet.class));
        }
        return (T) callFunction(i, valueSet, cls);
    }

    public <T> T callFunction(int i, ValueSet valueSet, Class<T> cls) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.IMediationInit
    public final void initAdn(Context context, ValueSet valueSet) {
        MediationInitConfig create = MediationInitConfig.create(valueSet);
        this.mInitConfig = create;
        realInitAdn(context, create);
    }

    public abstract void realInitAdn(Context context, MediationInitConfig mediationInitConfig);

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
