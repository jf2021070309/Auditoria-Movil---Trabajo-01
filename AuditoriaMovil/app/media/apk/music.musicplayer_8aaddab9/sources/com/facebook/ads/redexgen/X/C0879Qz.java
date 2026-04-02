package com.facebook.ads.redexgen.X;

import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.Qz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0879Qz {
    public R3 A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C0879Qz A00(R3 r3) {
        this.A00 = r3;
        return this;
    }

    public final C0879Qz A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C0879Qz A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C0879Qz A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C0879Qz A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final R0 A05() {
        return new R0(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
