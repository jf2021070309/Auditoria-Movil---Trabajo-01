package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;
/* loaded from: assets/audience_network.dex */
public final class FH extends AbstractC1269cf {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    @VisibleForTesting
    public static final AnonymousClass21 A03 = new C1259cU();
    @Nullable
    public C1263cZ A00;
    public final AnonymousClass20 A01;

    public FH(AnonymousClass20 anonymousClass20) {
        super(anonymousClass20.A05(), A03.A4M(anonymousClass20));
        this.A01 = anonymousClass20;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1269cf
    public final void A05() {
        C1263cZ c1263cZ = this.A00;
        if (c1263cZ != null) {
            c1263cZ.A0F();
        }
        InterfaceC02701w interfaceC02701w = super.A00;
        EnumC02691v enumC02691v = EnumC02691v.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC02701w.AEa(enumC02691v);
    }

    public final C1263cZ A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new C1263cZ(this.A01, this, this.A02);
        this.A00.A0I(this.A01.A0A(), this.A01.A06());
    }

    public final void A09(InterstitialAd interstitialAd, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        if (super.A00.A5J()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        C1263cZ c1263cZ = this.A00;
        if (c1263cZ != null) {
            c1263cZ.A0I(enumSet, str);
            return;
        }
        this.A01.A0J(enumSet);
        this.A01.A0G(str);
        A08();
    }

    public final boolean A0A() {
        C1263cZ c1263cZ = this.A00;
        if (c1263cZ != null) {
            return c1263cZ.A0J();
        }
        if (this.A01.A00() > 0) {
            int i2 = (MC.A00() > this.A01.A00() ? 1 : (MC.A00() == this.A01.A00() ? 0 : -1));
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (i2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        C1263cZ c1263cZ = this.A00;
        if (c1263cZ != null) {
            return c1263cZ.A0K();
        }
        return super.A00.A5c() == EnumC02691v.A06;
    }

    public final boolean A0C(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5K()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        C1263cZ c1263cZ = this.A00;
        if (c1263cZ != null) {
            return c1263cZ.A0L();
        }
        this.A00 = new C1263cZ(this.A01, this, this.A02);
        this.A00.A0L();
        return false;
    }
}
