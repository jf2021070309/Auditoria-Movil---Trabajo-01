package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class SC extends L7 {
    public final /* synthetic */ AnonymousClass92 A00;

    public SC(AnonymousClass92 anonymousClass92) {
        this.A00 = anonymousClass92;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        OZ oz;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        OZ oz2;
        oz = this.A00.A00;
        if (oz != null) {
            oz2 = this.A00.A00;
            oz2.A0Z();
        }
        AbstractC0760Mj abstractC0760Mj = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC0760Mj.setToolbarActionMode(closeButtonStyle);
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
