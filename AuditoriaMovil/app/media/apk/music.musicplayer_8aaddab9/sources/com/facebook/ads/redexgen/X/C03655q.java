package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.5q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03655q {
    public final long A00;
    public final EnumC03645p A01;
    public final String A02;
    public final boolean A03;

    public C03655q(String str, boolean z, EnumC03645p enumC03645p) {
        this(str, z, enumC03645p, System.currentTimeMillis());
    }

    public C03655q(String str, boolean z, EnumC03645p enumC03645p, long j2) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC03645p;
        this.A00 = j2;
    }

    public static C03655q A00() {
        return new C03655q("", true, EnumC03645p.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC03645p A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
