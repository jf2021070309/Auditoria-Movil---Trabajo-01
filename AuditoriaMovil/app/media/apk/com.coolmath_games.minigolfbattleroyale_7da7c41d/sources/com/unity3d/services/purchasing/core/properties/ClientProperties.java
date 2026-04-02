package com.unity3d.services.purchasing.core.properties;

import com.unity3d.services.purchasing.core.IPurchasingAdapter;
/* loaded from: classes2.dex */
public class ClientProperties {
    private static IPurchasingAdapter adapter;

    public static void setAdapter(IPurchasingAdapter iPurchasingAdapter) {
        adapter = iPurchasingAdapter;
    }

    public static IPurchasingAdapter getAdapter() {
        return adapter;
    }
}
