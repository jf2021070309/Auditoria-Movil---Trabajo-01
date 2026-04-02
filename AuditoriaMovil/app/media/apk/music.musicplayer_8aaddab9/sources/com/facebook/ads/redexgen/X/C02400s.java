package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;
/* renamed from: com.facebook.ads.redexgen.X.0s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02400s {
    public static InterfaceC02350n A00;

    @Nullable
    public final InterfaceC02350n A00(C1046Xo c1046Xo, AdPlacementType adPlacementType) {
        InterfaceC02350n interfaceC02350n = A00;
        if (interfaceC02350n != null) {
            return interfaceC02350n;
        }
        int i2 = C02390r.A00[adPlacementType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return new FQ();
                    }
                    return new FX(c1046Xo);
                }
                return new C1315dP(c1046Xo);
            }
            return new C1317dR();
        }
        return new C1318dS();
    }
}
