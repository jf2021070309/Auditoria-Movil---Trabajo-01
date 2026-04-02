package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public abstract class XS implements C8X {
    public final C8U A00;

    public XS(C8U c8u) {
        this.A00 = c8u;
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    public final Map<String, String> A4S() {
        return C9Q.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    public final Map<String, String> A5h() {
        return AnonymousClass98.A02();
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    @Nullable
    public final String A6p() {
        return AnonymousClass98.A00();
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    public final String A6r() {
        return C03675s.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    public final boolean A8V() {
        return LR.A00().A03();
    }
}
