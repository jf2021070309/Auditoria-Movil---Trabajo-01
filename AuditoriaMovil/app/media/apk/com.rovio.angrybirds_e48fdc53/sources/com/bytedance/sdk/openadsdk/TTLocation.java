package com.bytedance.sdk.openadsdk;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
/* loaded from: classes.dex */
public class TTLocation implements LocationProvider {
    private double dr;
    private double ge;

    public TTLocation(double d, double d2) {
        this.dr = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        this.ge = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        this.dr = d;
        this.ge = d2;
    }

    @Override // com.bytedance.sdk.openadsdk.LocationProvider
    public double getLatitude() {
        return this.dr;
    }

    public void setLatitude(double d) {
        this.dr = d;
    }

    @Override // com.bytedance.sdk.openadsdk.LocationProvider
    public double getLongitude() {
        return this.ge;
    }

    public void setLongitude(double d) {
        this.ge = d;
    }
}
