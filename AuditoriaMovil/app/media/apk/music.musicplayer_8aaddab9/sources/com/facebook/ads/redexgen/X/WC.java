package com.facebook.ads.redexgen.X;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class WC implements InterfaceC0517Cc {
    public static byte[] A03;
    public static final InterfaceC0519Cf A04;
    public Ce A00;
    public DY A01;
    public boolean A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 120, 112, 117, 124, 125, 57, 109, 118, 57, 125, 124, 109, 124, 107, 116, 112, 119, 124, 57, 123, 112, 109, 106, 109, 107, 124, 120, 116, 57, 109, 96, 105, 124};
    }

    static {
        A02();
        A04 = new WD();
    }

    public static C0660Ii A00(C0660Ii c0660Ii) {
        c0660Ii.A0Y(0);
        return c0660Ii;
    }

    private boolean A03(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        DU du = new DU();
        if (du.A03(interfaceC0518Cd, true) && (du.A04 & 2) == 2) {
            int length = Math.min(du.A00, 8);
            C0660Ii c0660Ii = new C0660Ii(length);
            interfaceC0518Cd.AD4(c0660Ii.A00, 0, length);
            C0660Ii scratch = A00(c0660Ii);
            if (WE.A04(scratch)) {
                this.A01 = new WE();
            } else {
                C0660Ii scratch2 = A00(c0660Ii);
                if (W9.A06(scratch2)) {
                    this.A01 = new W9();
                } else {
                    C0660Ii scratch3 = A00(c0660Ii);
                    if (!WB.A04(scratch3)) {
                        return false;
                    }
                    this.A01 = new WB();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void A8I(Ce ce) {
        this.A00 = ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final int ADU(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC0518Cd)) {
                interfaceC0518Cd.AE8();
            } else {
                throw new C0470Af(A01(0, 34, FacebookMediationAdapter.ERROR_NULL_CONTEXT));
            }
        }
        if (!this.A02) {
            InterfaceC0525Co AFI = this.A00.AFI(0, 1);
            this.A00.A5C();
            this.A01.A06(this.A00, AFI);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0518Cd, c0521Cj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void AEQ(long j2, long j3) {
        DY dy = this.A01;
        if (dy != null) {
            dy.A05(j2, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final boolean AF0(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        try {
            return A03(interfaceC0518Cd);
        } catch (C0470Af unused) {
            return false;
        }
    }
}
