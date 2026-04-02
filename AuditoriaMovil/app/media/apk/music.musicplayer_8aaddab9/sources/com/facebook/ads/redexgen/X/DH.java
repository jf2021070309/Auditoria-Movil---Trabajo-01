package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class DH implements WS {
    public static byte[] A03;
    public static String[] A04 = {"hwqziZW7AZPod2dXLouvGwTTrlxQftu5", "HWTvO3PtXP9N2f8hjjNBE5ELyu96O7C2", "XZiXxIUms072zxq0eptbFHl9id1xfsii", "R678H1T6QVa3UEsgGNCZuIT3k3f5TJMX", "R3CvDfTCre2oGIfhbqMtFAzPo9CSve3e", "yCxuKEdtUnEmK00296URo1FADbxWErUf", "IeIjE9tQRhU2QKWiPhSO822TtqgvRx0R", "yf6PTLZVRmp8JK3c15ye5co8mawgp7Wk"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A04[1].charAt(18) != 'N') {
            throw new RuntimeException();
        }
        A04[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        A03 = new byte[]{-117, Byte.MAX_VALUE, -52, -72, -56, -65, -106, -38, -41, -22, -41, -106, -23, -33, -16, -37, -106, -29, -33, -23, -29, -41, -22, -39, -34, -80, -106, -74, -62, -46, -55, -77, -59, -59, -53, -59, -46};
    }

    static {
        A02();
    }

    public DH(long[] jArr, long[] jArr2, long j2) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j2;
    }

    public static DH A00(long durationUs, long j2, Ci ci, C0660Ii c0660Ii) {
        int A0E;
        long position = j2;
        c0660Ii.A0Z(10);
        int A08 = c0660Ii.A08();
        if (A08 <= 0) {
            return null;
        }
        int i2 = ci.A03;
        long A0F = C0676Iy.A0F(A08, 1000000 * (i2 >= 32000 ? 1152 : 576), i2);
        int A0I = c0660Ii.A0I();
        int A0I2 = c0660Ii.A0I();
        int A0I3 = c0660Ii.A0I();
        c0660Ii.A0Z(2);
        int scale = ci.A02;
        long j3 = position + scale;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int i3 = 0; i3 < A0I; i3++) {
            jArr[i3] = (i3 * A0F) / A0I;
            jArr2[i3] = Math.max(position, j3);
            if (A0I3 == 1) {
                A0E = c0660Ii.A0E();
            } else if (A0I3 == 2) {
                A0E = c0660Ii.A0I();
            } else if (A0I3 == 3) {
                A0E = c0660Ii.A0G();
            } else if (A0I3 != 4) {
                return null;
            } else {
                A0E = c0660Ii.A0H();
            }
            position += A0E * A0I2;
            int segmentSize = A04[7].charAt(10);
            if (segmentSize == 80) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[5] = "SApHUsB0TeciBaZ8FVEH7XQ0HhkRahgp";
            strArr[4] = "ro1Cj1bOUorcqHsrq9aZZzvMMKgEvTZf";
        }
        int entryCount = (durationUs > (-1L) ? 1 : (durationUs == (-1L) ? 0 : -1));
        if (entryCount != 0) {
            int entryCount2 = (durationUs > position ? 1 : (durationUs == position ? 0 : -1));
            if (entryCount2 != 0) {
                Log.w(A01(27, 10, 57), A01(2, 25, 79) + durationUs + A01(0, 2, 56) + position);
            }
        }
        return new DH(jArr, jArr2, A0F);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final long A6R() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final Ck A7N(long j2) {
        int A0B = C0676Iy.A0B(this.A02, j2, true, true);
        C0523Cm c0523Cm = new C0523Cm(this.A02[A0B], this.A01[A0B]);
        if (c0523Cm.A01 < j2) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new Ck(c0523Cm, new C0523Cm(jArr[A0B + 1], this.A01[A0B + 1]));
            }
        }
        return new Ck(c0523Cm);
    }

    @Override // com.facebook.ads.redexgen.X.WS
    public final long A7d(long j2) {
        return this.A02[C0676Iy.A0B(this.A01, j2, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final boolean A8g() {
        return true;
    }
}
