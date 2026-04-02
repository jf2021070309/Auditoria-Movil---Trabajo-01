package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public abstract class GO implements InterfaceC0882Rc {
    public final RU A00;
    public final C4L A01;

    public GO(C4L c4l, RU ru) {
        this.A01 = c4l;
        this.A00 = ru;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0882Rc
    public void A3N(Map<RK, EnumC0887Rh> map, Map<GS, RU> map2) {
        map2.put(this.A01, this.A00);
    }
}
