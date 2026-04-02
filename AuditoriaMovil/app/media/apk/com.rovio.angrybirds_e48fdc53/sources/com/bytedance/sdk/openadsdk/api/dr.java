package com.bytedance.sdk.openadsdk.api;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;
/* loaded from: classes.dex */
public class dr {
    protected EventListener dr;

    /* JADX INFO: Access modifiers changed from: protected */
    public void dr(int i, Result result) {
        if (!dr()) {
            this.dr.onEvent(i, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void dr(int i) {
        dr(i, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean dr() {
        return this.dr == null;
    }
}
