package com.bytedance.msdk.api.v2;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
/* loaded from: classes.dex */
public class GMLocation {
    private double a;
    private double b;

    public GMLocation(double d, double d2) {
        this.a = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        this.b = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        this.a = d;
        this.b = d2;
    }

    public double getLatitude() {
        return this.a;
    }

    public double getLongitude() {
        return this.b;
    }

    public void setLatitude(double d) {
        this.a = d;
    }

    public void setLongitude(double d) {
        this.b = d;
    }
}
