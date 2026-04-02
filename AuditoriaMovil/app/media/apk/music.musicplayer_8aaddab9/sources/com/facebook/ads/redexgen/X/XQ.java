package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;
/* loaded from: assets/audience_network.dex */
public class XQ implements C8Y {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ XP A01;

    public XQ(XP xp, AdvertisingId advertisingId) {
        this.A01 = xp;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C8Y
    public final boolean A8Y() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C8Y
    public final String getId() {
        return this.A00.getId();
    }
}
