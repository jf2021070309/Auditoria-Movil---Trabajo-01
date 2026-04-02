package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class OU extends C2A {
    public final /* synthetic */ C0796Nt A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OU(C0796Nt c0796Nt, double d2, double d3, double d4, boolean z) {
        super(d2, d3, d4, z);
        this.A00 = c0796Nt;
    }

    @Override // com.facebook.ads.redexgen.X.C2A
    public final void A00(boolean z, boolean z2, C2C c2c) {
        InterfaceC0684Jg interfaceC0684Jg;
        String str;
        Map<String, String> A0J;
        if (z2) {
            interfaceC0684Jg = this.A00.A06;
            str = this.A00.A0B;
            A0J = this.A00.A0J(EnumC0847Pt.A03);
            interfaceC0684Jg.A9P(str, A0J);
        }
    }
}
