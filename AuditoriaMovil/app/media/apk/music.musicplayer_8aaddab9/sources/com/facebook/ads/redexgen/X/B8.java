package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
/* loaded from: assets/audience_network.dex */
public final class B8 implements U0 {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public B8(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Ju
    public final void A9q() {
        C0725Ky.A00(new C0953Tw(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Ju
    public final void A9u() {
        C0725Ky.A00(new C0954Tx(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Ju
    public final void AAh(KG kg) {
        C0725Ky.A00(new C0956Tz(this, kg));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Ju
    public final void ABL() {
        C0725Ky.A00(new C0952Tv(this));
    }

    @Override // com.facebook.ads.redexgen.X.U0
    public final void ABQ() {
        C0725Ky.A00(new C0955Ty(this));
    }
}
