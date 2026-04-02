package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;
/* renamed from: com.facebook.ads.redexgen.X.bf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1213bf extends AbstractRunnableC0721Ku {
    public final /* synthetic */ C1209bb A00;
    public final /* synthetic */ KG A01;

    public C1213bf(C1209bb c1209bb, KG kg) {
        this.A00 = c1209bb;
        this.A01 = kg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0721Ku
    public final void A01() {
        AnonymousClass54 anonymousClass54;
        AnonymousClass54 anonymousClass542;
        AnonymousClass54 anonymousClass543;
        anonymousClass54 = this.A00.A01;
        if (anonymousClass54.A06() != null) {
            anonymousClass542 = this.A00.A01;
            AdListener A06 = anonymousClass542.A06();
            anonymousClass543 = this.A00.A01;
            A06.onError(anonymousClass543.A07(), LY.A00(this.A01));
        }
    }
}
