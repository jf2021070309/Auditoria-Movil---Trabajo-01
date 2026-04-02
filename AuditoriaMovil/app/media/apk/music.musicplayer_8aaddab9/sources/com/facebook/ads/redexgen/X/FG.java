package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
/* loaded from: assets/audience_network.dex */
public final class FG extends AbstractC1269cf {
    public static String[] A02 = {"6CKGqR2K2MH05agWbJN3ka4F1ij3xhtD", "25gFyXHUhXKi43K8KJ4chgoS7w07JQQZ", "vjdmG7Wc53PSGoj25veSMfUO8xL7SxfR", "TQa00i6LjIP9KGMZzj8Rx2HUQjG1dRa1", "ap4e45gngLG", "PTi4Abr85pNMPfkRgyZo1NxbOs1aDg0f", "O7pu2EfbMgektne8Y3vUNLOEHbflJ4Uv", "IlEhKaiOmMN"};
    @Nullable
    public C1260cW A00;
    public final AnonymousClass24 A01;

    public FG(AnonymousClass24 anonymousClass24) {
        super(anonymousClass24.A0B, A00(anonymousClass24));
        this.A01 = anonymousClass24;
    }

    public static AnonymousClass23 A00(AnonymousClass24 anonymousClass24) {
        return new C1256cR(anonymousClass24);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1269cf
    public final void A05() {
        C1260cW c1260cW = this.A00;
        if (c1260cW != null) {
            c1260cW.A0E();
        }
        super.A00.AEa(EnumC02691v.A04);
    }

    @Nullable
    public final C1260cW A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new C1260cW(this.A01, this, this.A02);
        this.A00.A0I(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A09(com.facebook.ads.Ad ad, @Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (super.A00.A5J()) {
            return;
        }
        this.A01.A01(ad);
        C1260cW c1260cW = this.A00;
        if (c1260cW != null) {
            c1260cW.A0I(str, adExperienceType, z);
            String[] strArr = A02;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "snzzAybKLkKRz85P4BzzU6VwJ24uwEo8";
            strArr2[1] = "iwkpZYLOXs3iYxZlCgOD0Nxy0vDnSGoK";
            return;
        }
        AnonymousClass24 anonymousClass24 = this.A01;
        anonymousClass24.A05 = str;
        anonymousClass24.A02 = adExperienceType;
        anonymousClass24.A08 = z;
        A08();
    }

    public final void A0A(RewardData rewardData) {
        this.A01.A03 = rewardData;
        C1260cW c1260cW = this.A00;
        if (c1260cW != null) {
            c1260cW.A0G(rewardData);
        }
    }

    public final boolean A0B() {
        C1260cW c1260cW = this.A00;
        if (c1260cW != null) {
            return c1260cW.A0J();
        }
        return this.A01.A01 > 0 && MC.A00() > this.A01.A01;
    }

    public final boolean A0C() {
        C1260cW c1260cW = this.A00;
        if (c1260cW != null) {
            return c1260cW.A0K();
        }
        return super.A00.A5c() == EnumC02691v.A06;
    }

    public final boolean A0D(com.facebook.ads.Ad ad, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((C03525d) rewardedVideoShowAdConfig).A00();
        if (super.A00.A5K()) {
            return false;
        }
        this.A01.A01(ad);
        C1260cW c1260cW = this.A00;
        if (c1260cW != null) {
            return c1260cW.A0L(A00);
        }
        this.A00 = new C1260cW(this.A01, this, this.A02);
        this.A00.A0L(A00);
        return false;
    }
}
