package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;
/* renamed from: com.facebook.ads.redexgen.X.1q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02641q {
    public static String[] A0C = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    @Nullable
    public RewardData A01;
    @Nullable
    public EnumC0702Jy A02;
    @Nullable
    public String A03;
    @Nullable
    public String A04;
    public boolean A05;
    public final KJ A06;
    public final KL A07;
    public final String A08;
    @Nullable
    public final EnumSet<CacheFlag> A09;
    public final int A0A;
    public final AdPlacementType A0B;

    public C02641q(String str, KL kl, AdPlacementType adPlacementType, KJ kj, int i2) {
        this(str, kl, adPlacementType, kj, i2, EnumSet.of(CacheFlag.NONE));
    }

    public C02641q(String str, KL kl, AdPlacementType adPlacementType, KJ kj, int i2, @Nullable EnumSet<CacheFlag> enumSet) {
        this.A08 = str;
        this.A0B = adPlacementType;
        this.A06 = kj;
        this.A0A = i2;
        this.A09 = enumSet;
        this.A07 = kl;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0B;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        KJ kj = this.A06;
        if (kj == null) {
            return AdPlacementType.NATIVE;
        }
        if (kj == KJ.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final C0709Kg A01(C1046Xo c1046Xo, KQ kq, @Nullable AdExperienceType adExperienceType) {
        C0748Lx c0748Lx;
        String str;
        String str2 = this.A08;
        KJ kj = this.A06;
        if (kj != null) {
            c0748Lx = new C0748Lx(kj.A03(), this.A06.A02());
        } else {
            c0748Lx = null;
        }
        KL kl = this.A07;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            str = AdSettings.getTestAdType().getAdTypeString();
        } else {
            str = null;
        }
        C0709Kg c0709Kg = new C0709Kg(c1046Xo, str2, c0748Lx, kl, str, this.A0A, AdSettings.isTestMode(c1046Xo), AdSettings.isMixedAudience(), kq, M3.A01(JQ.A0H(c1046Xo)), this.A03, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0C;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return c0709Kg;
    }

    public final void A02(int i2) {
        this.A00 = i2;
    }

    public final void A03(@Nullable RewardData rewardData) {
        this.A01 = rewardData;
    }

    public final void A04(@Nullable EnumC0702Jy enumC0702Jy) {
        this.A02 = enumC0702Jy;
    }

    public final void A05(@Nullable String str) {
        this.A03 = str;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(boolean z) {
        this.A05 = z;
    }
}
