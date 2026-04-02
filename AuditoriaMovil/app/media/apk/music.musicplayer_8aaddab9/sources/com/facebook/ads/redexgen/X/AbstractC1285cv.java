package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.cv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1285cv implements C7M {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC1285cv(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAF() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAM() {
        A01(true);
    }
}
