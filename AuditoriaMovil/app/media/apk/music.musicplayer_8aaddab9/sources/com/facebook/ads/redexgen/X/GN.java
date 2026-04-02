package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public abstract class GN implements InterfaceC0882Rc {
    public final GV A00;
    public final EnumC0887Rh A01;

    public GN(GV gv, EnumC0887Rh enumC0887Rh) {
        this.A00 = gv;
        this.A01 = enumC0887Rh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0882Rc
    public void A3N(Map<RK, EnumC0887Rh> map, Map<GS, RU> map2) {
        map.put(this.A00, this.A01);
    }
}
