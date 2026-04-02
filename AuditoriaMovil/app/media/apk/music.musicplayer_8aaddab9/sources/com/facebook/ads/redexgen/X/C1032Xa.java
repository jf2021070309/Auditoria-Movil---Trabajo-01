package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
/* renamed from: com.facebook.ads.redexgen.X.Xa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1032Xa extends L7 {
    public final /* synthetic */ C1045Xn A00;

    public C1032Xa(C1045Xn c1045Xn) {
        this.A00 = c1045Xn;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
