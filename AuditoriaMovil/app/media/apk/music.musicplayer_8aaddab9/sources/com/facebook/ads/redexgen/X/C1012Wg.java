package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Wg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1012Wg implements InterfaceC0522Cl {
    public final long A00;
    public final Ck A01;

    public C1012Wg(long j2) {
        this(j2, 0L);
    }

    public C1012Wg(long j2, long j3) {
        this.A00 = j2;
        this.A01 = new Ck(j3 == 0 ? C0523Cm.A04 : new C0523Cm(0L, j3));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final long A6R() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final Ck A7N(long j2) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final boolean A8g() {
        return false;
    }
}
