package com.unity3d.services.core.request;

import java.util.Map;
/* loaded from: classes2.dex */
public interface ISDKMetrics {
    void sendEvent(String str);

    void sendEventWithTags(String str, Map<String, String> map);
}
