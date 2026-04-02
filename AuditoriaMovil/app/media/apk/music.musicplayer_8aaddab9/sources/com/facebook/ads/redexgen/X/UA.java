package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class UA extends AbstractC02360o {
    public static byte[] A01;
    public final /* synthetic */ U1 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public UA(U1 u1) {
        this.A00 = u1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0B(C1315dP c1315dP) {
        U0 u0;
        this.A00.A0h(c1315dP, true);
        u0 = this.A00.A0G;
        if (u0 != null && c1315dP.A0H() != null) {
            UB ub = new UB(this);
            for (U1 u1 : c1315dP.A0H()) {
                u1.A0i(ub);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0C() {
        U0 u0;
        U0 u02;
        u0 = this.A00.A0G;
        if (u0 != null) {
            u02 = this.A00.A0G;
            u02.A9q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0F(InterfaceC02350n interfaceC02350n) {
        FL fl;
        FL fl2;
        fl = this.A00.A0A;
        if (fl != null) {
            fl2 = this.A00.A0A;
            fl2.A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0G(KG kg) {
        long j2;
        U0 u0;
        U0 u02;
        C0R A0D = this.A00.A13().A0D();
        j2 = this.A00.A00;
        A0D.A2a(MC.A01(j2), kg.A03().getErrorCode(), kg.A04());
        u0 = this.A00.A0G;
        if (u0 != null) {
            u02 = this.A00.A0G;
            u02.AAh(kg);
        }
    }
}
