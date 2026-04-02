package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class XN implements RZ {
    public final /* synthetic */ C1045Xn A00;
    public final /* synthetic */ C0709Kg A01;

    public XN(C0709Kg c0709Kg, C1045Xn c1045Xn) {
        this.A01 = c0709Kg;
        this.A00 = c1045Xn;
    }

    @Override // com.facebook.ads.redexgen.X.RZ
    public final Map<String, String> A6W() {
        return this.A01.A08(C9U.A00().A01(this.A00, true).A6V());
    }
}
