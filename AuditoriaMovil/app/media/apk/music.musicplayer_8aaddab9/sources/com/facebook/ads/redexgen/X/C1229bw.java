package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.bw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1229bw implements InterfaceC03414s {
    public final /* synthetic */ F6 A00;

    public C1229bw(F6 f6) {
        this.A00 = f6;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03414s
    public final void ADI(AbstractC03344l abstractC03344l, C4O c4o, C4O c4o2) {
        this.A00.A1n(abstractC03344l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03414s
    public final void ADK(AbstractC03344l abstractC03344l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        this.A00.A0r.A0c(abstractC03344l);
        this.A00.A1o(abstractC03344l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03414s
    public final void ADM(AbstractC03344l abstractC03344l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        abstractC03344l.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC03344l, abstractC03344l, c4o, c4o2)) {
                this.A00.A1N();
            }
        } else if (!this.A00.A05.A0G(abstractC03344l, c4o, c4o2)) {
        } else {
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03414s
    public final void AFO(AbstractC03344l abstractC03344l) {
        this.A00.A06.A1D(abstractC03344l.A0H, this.A00.A0r);
    }
}
