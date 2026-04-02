package com.bytedance.sdk.openadsdk.mediation.bridge.valueset;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
/* loaded from: classes.dex */
public class MediationValueUtil {
    public static <T> T checkClassType(Class<T> cls) {
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            return (T) false;
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return (T) Float.valueOf(0.0f);
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return (T) Double.valueOf((double) PangleAdapterUtils.CPM_DEFLAUT_VALUE);
        }
        return null;
    }
}
