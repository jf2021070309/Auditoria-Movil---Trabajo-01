package com.bytedance.sdk.openadsdk.live.core;

import com.bytedance.android.live.base.api.ILiveHostActionParam;
import java.util.Map;
/* loaded from: classes.dex */
public class dr implements ILiveHostActionParam {
    private ITTLiveHostAction dr;

    public dr(ITTLiveHostAction iTTLiveHostAction) {
        this.dr = iTTLiveHostAction;
    }

    @Override // com.bytedance.android.live.base.api.ILiveHostActionParam
    public void logEvent(boolean z, String str, String str2, Map<String, String> map) {
        ITTLiveHostAction iTTLiveHostAction = this.dr;
        if (iTTLiveHostAction != null) {
            iTTLiveHostAction.logEvent(z, str, str2, map);
        }
    }
}
