package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;
/* loaded from: assets/audience_network.dex */
public final class MH {
    public static EnumC0853Pz A00(VideoStartReason videoStartReason) {
        int i2 = MG.A00[videoStartReason.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return EnumC0853Pz.A03;
                }
                return EnumC0853Pz.A04;
            }
            return EnumC0853Pz.A03;
        }
        return EnumC0853Pz.A02;
    }
}
