package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class W9 extends DY {
    public static byte[] A05;
    public static String[] A06 = {"Wz5kpI", "Qu4rCXWHGrZxyCLJ91nJYm9HwbbNBaAB", "jcFxTUNQ9mBSPSNjMUJY07wGvzfGS2C0", "wRecpgZSCUfboq2e81nqZjs5B", "2wu5mHiieWPMNFHGOEN0thCm6IWO9Xya", "P54DBngSoaRE6HRNMaW6H3WNUnBy8S0x", "u1kez8Hi5IXqm6uzKKQ3Ad3inAYpSzVQ", "yOq9tmgmQLY5WHe8QvjpkSndY9PHYfSY"};
    public int A00;
    public C0528Da A01;
    public C0530Dc A02;
    public C0532De A03;
    public boolean A04;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{61, 41, 56, 53, 51, 115, 42, 51, 46, 62, 53, 47};
    }

    static {
        A04();
    }

    public static int A00(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    public static int A01(byte b2, C0528Da c0528Da) {
        if (!c0528Da.A04[A00(b2, c0528Da.A00, 1)].A03) {
            return c0528Da.A02.A03;
        }
        return c0528Da.A02.A04;
    }

    private final C0528Da A02(C0660Ii c0660Ii) throws IOException {
        if (this.A03 == null) {
            this.A03 = C0533Df.A04(c0660Ii);
            return null;
        }
        C0530Dc c0530Dc = this.A02;
        if (A06[7].charAt(1) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "EnVW7ymY5FyvrkHYKpVAYit2P";
        strArr[0] = "59lsEN";
        if (c0530Dc == null) {
            this.A02 = C0533Df.A03(c0660Ii);
            return null;
        }
        byte[] bArr = new byte[c0660Ii.A07()];
        System.arraycopy(c0660Ii.A00, 0, bArr, 0, c0660Ii.A07());
        C0531Dd[] A0C = C0533Df.A0C(c0660Ii, this.A03.A05);
        return new C0528Da(this.A03, this.A02, bArr, A0C, C0533Df.A00(A0C.length - 1));
    }

    public static void A05(C0660Ii c0660Ii, long j2) {
        c0660Ii.A0X(c0660Ii.A07() + 4);
        c0660Ii.A00[c0660Ii.A07() - 4] = (byte) (j2 & 255);
        c0660Ii.A00[c0660Ii.A07() - 3] = (byte) ((j2 >>> 8) & 255);
        c0660Ii.A00[c0660Ii.A07() - 2] = (byte) ((j2 >>> 16) & 255);
        c0660Ii.A00[c0660Ii.A07() - 1] = (byte) (255 & (j2 >>> 24));
    }

    public static boolean A06(C0660Ii c0660Ii) {
        try {
            return C0533Df.A0A(1, c0660Ii, true);
        } catch (C0470Af unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C0660Ii c0660Ii) {
        if ((c0660Ii.A00[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(c0660Ii.A00[0], this.A01);
        int i2 = this.A04 ? (this.A00 + A01) / 4 : 0;
        A05(c0660Ii, i2);
        this.A04 = true;
        this.A00 = A01;
        return i2;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A08(long j2) {
        super.A08(j2);
        this.A04 = j2 != 0;
        C0532De c0532De = this.A03;
        this.A00 = c0532De != null ? c0532De.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C0660Ii c0660Ii, long j2, DX dx) throws IOException, InterruptedException {
        if (this.A01 != null) {
            String[] strArr = A06;
            if (strArr[5].charAt(2) != strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            A06[2] = "mO0nJ77ourwQSXFSw31DnFJId1Q3DZ07";
            return false;
        }
        this.A01 = A02(c0660Ii);
        if (this.A01 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A01.A02.A09);
        arrayList.add(this.A01.A03);
        dx.A00 = Format.A07(null, A03(0, 12, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
        return true;
    }
}
