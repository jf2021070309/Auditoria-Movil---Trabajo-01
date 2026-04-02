package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1365eF {
    @Nullable
    public InterfaceC1364eE A00;

    public final void A00() {
        InterfaceC1364eE interfaceC1364eE = this.A00;
        if (interfaceC1364eE != null) {
            interfaceC1364eE.onStart();
        }
    }

    public final void A01() {
        InterfaceC1364eE interfaceC1364eE = this.A00;
        if (interfaceC1364eE != null) {
            interfaceC1364eE.onStop();
        }
    }

    public final void A02(InterfaceC1364eE interfaceC1364eE) {
        this.A00 = interfaceC1364eE;
    }
}
