package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class TJ implements PK {
    public final /* synthetic */ TE A00;

    public TJ(TE te) {
        this.A00 = te;
    }

    @Override // com.facebook.ads.redexgen.X.PK
    public final void AB7() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A0R;
        atomicBoolean.set(true);
        this.A00.A0N();
    }
}
