package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Jc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0680Jc {
    public double A00;
    public EnumC0686Ji A01;
    public EnumC0687Jj A02;
    public String A03;
    public String A04;
    @Nullable
    public Map<String, String> A05;
    public boolean A06;

    public final C0680Jc A00(double d2) {
        this.A00 = d2;
        return this;
    }

    public final C0680Jc A01(EnumC0686Ji enumC0686Ji) {
        this.A01 = enumC0686Ji;
        return this;
    }

    public final C0680Jc A02(EnumC0687Jj enumC0687Jj) {
        this.A02 = enumC0687Jj;
        return this;
    }

    public final C0680Jc A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C0680Jc A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C0680Jc A05(@Nullable Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C0680Jc A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C0681Jd A07(C8U c8u) {
        return new C0681Jd(c8u, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
