package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class WE extends DY {
    public static byte[] A02;
    public static String[] A03 = {"RjYCDLb2NANzCnedRKoQM0GQ", "QX5lqyT5r1TYXy6sq6A", "sDmzmZu2Epi", "QleORMZQxcHxPLUcnR0aaEPVJ", "tBrVRsKa63H7cOEQm0uGMqa5cwtrVWSW", "PEwzIbtLaNn1pzRcppb", "zVqUyH", "ZIYCsXe3luBjtUiXTHmKPLmA"};
    public WF A00;
    public IV A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{6, 18, 3, 14, 8, 72, 1, 11, 6, 4};
    }

    static {
        A03();
    }

    private int A00(C0660Ii c0660Ii) {
        int i2 = (c0660Ii.A00[2] & 255) >> 4;
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
            case 7:
                c0660Ii.A0Z(4);
                c0660Ii.A0O();
                int A0E = i2 == 6 ? c0660Ii.A0E() : c0660Ii.A0I();
                c0660Ii.A0Y(0);
                return A0E + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static boolean A04(C0660Ii c0660Ii) {
        return c0660Ii.A04() >= 5 && c0660Ii.A0E() == 127 && c0660Ii.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C0660Ii c0660Ii) {
        if (!A05(c0660Ii.A00)) {
            return -1L;
        }
        int A00 = A00(c0660Ii);
        String[] strArr = A03;
        if (strArr[2].length() != strArr[0].length()) {
            String[] strArr2 = A03;
            strArr2[2] = "M0DKrSciZtY";
            strArr2[0] = "bwyyvFLni8GVBC8P6VU38e20";
            return A00;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C0660Ii c0660Ii, long j2, DX dx) throws IOException, InterruptedException {
        byte[] bArr = c0660Ii.A00;
        if (this.A01 == null) {
            this.A01 = new IV(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, c0660Ii.A07());
            data[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(data);
            dx.A00 = Format.A07(null, A02(0, 10, 95), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, singletonList, null, 0, null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.A00 = new WF(this);
            this.A00.A01(c0660Ii);
            return true;
        } else if (!A05(bArr)) {
            return true;
        } else {
            WF wf = this.A00;
            if (wf != null) {
                wf.A00(j2);
                dx.A01 = this.A00;
            }
            return false;
        }
    }
}
