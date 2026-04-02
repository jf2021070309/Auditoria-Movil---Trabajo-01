package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
/* loaded from: assets/audience_network.dex */
public class UI implements InterfaceC0703Jz {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ UD A01;

    public UI(UD ud, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = ud;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jz
    public final void AEf() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jz
    public final void AEi(NativeAd nativeAd) {
        this.A01.A0I(U1.A0L(nativeAd.getInternalNativeAd()), new UE(U1.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jz
    public final void AFN() {
        this.A01.A0D();
    }
}
