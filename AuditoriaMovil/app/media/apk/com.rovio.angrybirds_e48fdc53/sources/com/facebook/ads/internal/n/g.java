package com.facebook.ads.internal.n;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class g {
    private final double a;
    private final double b;

    public g(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double optDouble = jSONObject.optDouble("value", PangleAdapterUtils.CPM_DEFLAUT_VALUE);
        double optDouble2 = jSONObject.optDouble("scale", PangleAdapterUtils.CPM_DEFLAUT_VALUE);
        if (optDouble == PangleAdapterUtils.CPM_DEFLAUT_VALUE || optDouble2 == PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            return null;
        }
        return new g(optDouble, optDouble2);
    }

    public double a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }
}
