package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
/* renamed from: com.facebook.ads.redexgen.X.dF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1305dF implements InterfaceC02350n {
    public int A00;
    public RewardData A01;

    public abstract int A0D();

    public abstract AnonymousClass18 A0E();

    public abstract boolean A0F();

    public final void A00(int i2) {
        this.A00 = i2;
    }

    public final void A01(RewardData rewardData) {
        this.A01 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02350n
    public final AdPlacementType A7A() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
