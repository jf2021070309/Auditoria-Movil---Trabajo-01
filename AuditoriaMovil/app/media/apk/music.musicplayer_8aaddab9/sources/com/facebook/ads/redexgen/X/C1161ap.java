package com.facebook.ads.redexgen.X;

import android.content.pm.ConfigurationInfo;
/* renamed from: com.facebook.ads.redexgen.X.ap  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1161ap implements InterfaceC03956v {
    public final /* synthetic */ C1155aj A00;

    public C1161ap(C1155aj c1155aj) {
        this.A00 = c1155aj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ConfigurationInfo configurationInfo;
        ConfigurationInfo configurationInfo2;
        configurationInfo = this.A00.A00;
        if (configurationInfo != null) {
            C1155aj c1155aj = this.A00;
            configurationInfo2 = c1155aj.A00;
            return c1155aj.A04(configurationInfo2.reqKeyboardType);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
