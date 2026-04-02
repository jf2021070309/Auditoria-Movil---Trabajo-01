package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Df  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0533Df {
    public static byte[] A00;
    public static String[] A01 = {"97CkWcXqrjyz7Qw2gcwWTf0UsRxLJkLY", "KmKspjn8yBhlsuKfHc5dD1By4HqwQES7", "tM7dEAyUMmHTAlM7QEv8AsYa9vZW08DW", "cnFzSmdUdmsM2SVrr3BadDXsi4nDpClW", "tMN7ldEkNAphgvj5y1u3W8bdaUauudV5", "yEIP5bnoN3ttum2IDgG23FKNyE9RzpP8", "N0hhc3G9NfQEzjT9vQvNmE", "ceiH1Z9CkPvfm4IJnpqvFzCjzC6OBPie"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0532De A04(C0660Ii c0660Ii) throws C0470Af {
        A0A(1, c0660Ii, false);
        long A0K = c0660Ii.A0K();
        int A0E = c0660Ii.A0E();
        long A0K2 = c0660Ii.A0K();
        int A0A = c0660Ii.A0A();
        int A0A2 = c0660Ii.A0A();
        int A0A3 = c0660Ii.A0A();
        int A0E2 = c0660Ii.A0E();
        return new C0532De(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & 240) >> 4), (c0660Ii.A0E() & 1) > 0, Arrays.copyOf(c0660Ii.A00, c0660Ii.A07()));
    }

    public static String A05(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{35, 26, 7, 23, 28, 6, 32, 1, 28, 25, 74, 87, 95, 74, 76, 91, 74, 75, 15, 76, 71, 78, 93, 78, 76, 91, 74, 93, 92, 15, 8, 89, 64, 93, 77, 70, 92, 8, 100, 121, 113, 100, 98, 117, 100, 101, 33, 98, 110, 101, 100, 33, 99, 110, 110, 106, 33, 117, 110, 33, 114, 117, 96, 115, 117, 33, 118, 104, 117, 105, 33, 90, 49, 121, 52, 55, 45, 33, 49, 121, 53, 50, 45, 33, 49, 121, 53, 51, 92, 33, 96, 117, 33, 88, 69, 77, 88, 94, 73, 88, 89, 29, 85, 88, 92, 89, 88, 79, 29, 73, 68, 77, 88, 29, 47, 37, 38, 38, 59, 105, 61, 48, 57, 44, 105, 46, 59, 44, 40, 61, 44, 59, 105, 61, 33, 40, 39, 105, 120, 105, 39, 38, 61, 105, 45, 44, 42, 38, 45, 40, 43, 37, 44, 115, 105, 20, 0, 19, 31, 27, 28, 21, 82, 16, 27, 6, 82, 19, 20, 6, 23, 0, 82, 31, 29, 22, 23, 1, 82, 28, 29, 6, 82, 1, 23, 6, 82, 19, 1, 82, 23, 10, 2, 23, 17, 6, 23, 22, 87, 67, 80, 92, 88, 95, 86, 17, 83, 88, 69, 17, 84, 73, 65, 84, 82, 69, 84, 85, 17, 69, 94, 17, 83, 84, 17, 66, 84, 69, 66, 65, 65, 69, 91, 94, 14, 90, 87, 94, 75, 14, 73, 92, 75, 79, 90, 75, 92, 14, 90, 70, 79, 64, 14, 28, 14, 64, 65, 90, 14, 74, 75, 77, 65, 74, 79, 76, 66, 75, 20, 14, 38, 42, 59, 59, 34, 37, 44, 107, 63, 50, 59, 46, 107, 36, 63, 35, 46, 57, 107, 63, 35, 42, 37, 107, 123, 107, 37, 36, 63, 107, 56, 62, 59, 59, 36, 57, 63, 46, 47, 113, 107, 41, 53, 56, 58, 60, 49, 54, 53, 61, 60, 43, 121, 54, 63, 121, 45, 48, 52, 60, 121, 61, 54, 52, 56, 48, 55, 121, 45, 43, 56, 55, 42, 63, 54, 43, 52, 42, 121, 55, 54, 45, 121, 35, 60, 43, 54, 60, 61, 121, 54, 44, 45, 84, 67, 85, 79, 66, 83, 67, 114, 95, 86, 67, 6, 65, 84, 67, 71, 82, 67, 84, 6, 82, 78, 71, 72, 6, 20, 6, 79, 85, 6, 72, 73, 82, 6, 66, 67, 69, 73, 66, 71, 68, 74, 67, 113, 106, 37, 119, 96, 118, 96, 119, 115, 96, 97, 37, 103, 108, 113, 118, 37, 104, 112, 118, 113, 37, 103, 96, 37, Byte.MAX_VALUE, 96, 119, 106, 37, 100, 99, 113, 96, 119, 37, 104, 100, 117, 117, 108, 107, 98, 37, 102, 106, 112, 117, 105, 108, 107, 98, 37, 118, 113, 96, 117, 118, 3, 24, 24, 87, 4, 31, 24, 5, 3, 87, 31, 18, 22, 19, 18, 5, 77, 87};
    }

    static {
        A06();
    }

    public static int A00(int val) {
        int i2 = 0;
        while (val > 0) {
            i2++;
            String[] strArr = A01;
            if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                throw new RuntimeException();
            }
            A01[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            val >>>= 1;
        }
        return i2;
    }

    public static long A01(long j2, long j3) {
        return (long) Math.floor(Math.pow(j2, 1.0d / j3));
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x004f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C0529Db A02(com.facebook.ads.redexgen.X.DZ r12) throws com.facebook.ads.redexgen.X.C0470Af {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0533Df.A02(com.facebook.ads.redexgen.X.DZ):com.facebook.ads.redexgen.X.Db");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C0530Dc A03(com.facebook.ads.redexgen.X.C0660Ii r9) throws com.facebook.ads.redexgen.X.C0470Af {
        /*
            r1 = 3
            r0 = 0
            A0A(r1, r9, r0)
            r3 = 7
            long r1 = r9.A0K()
            int r0 = (int) r1
            int r3 = r3 + 4
            java.lang.String r5 = r9.A0S(r0)
            int r0 = r5.length()
            int r3 = r3 + r0
            long r1 = r9.A0K()
            int r0 = (int) r1
            java.lang.String[] r4 = new java.lang.String[r0]
            int r6 = r3 + 4
            r3 = 0
        L20:
            long r7 = (long) r3
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3c
            long r7 = r9.A0K()
            int r0 = (int) r7
            int r6 = r6 + 4
            java.lang.String r0 = r9.A0S(r0)
            r4[r3] = r0
            r0 = r4[r3]
            int r0 = r0.length()
            int r6 = r6 + r0
            int r3 = r3 + 1
            goto L20
        L3c:
            int r0 = r9.A0E()
            r3 = r0 & 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0533Df.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 22
            if (r1 == r0) goto L55
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L55:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0533Df.A01
            java.lang.String r1 = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L66
            int r1 = r6 + 1
            com.facebook.ads.redexgen.X.Dc r0 = new com.facebook.ads.redexgen.X.Dc
            r0.<init>(r5, r4, r1)
            return r0
        L66:
            r2 = 198(0xc6, float:2.77E-43)
            r1 = 30
            r0 = 6
            java.lang.String r1 = A05(r2, r1, r0)
            com.facebook.ads.redexgen.X.Af r0 = new com.facebook.ads.redexgen.X.Af
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0533Df.A03(com.facebook.ads.redexgen.X.Ii):com.facebook.ads.redexgen.X.Dc");
    }

    public static void A07(int mappingsCount, DZ dz) throws C0470Af {
        int i2;
        int A02 = dz.A02(6) + 1;
        for (int i3 = 0; i3 < A02; i3++) {
            int A022 = dz.A02(16);
            if (A022 != 0) {
                Log.e(A05(0, 10, 66), A05(270, 41, 124) + A022);
            } else {
                if (dz.A04()) {
                    i2 = dz.A02(4) + 1;
                } else {
                    i2 = 1;
                }
                boolean A04 = dz.A04();
                if (A01[7].charAt(17) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "2d5iZcFzMvct5JxqCcZ0JFUoYSVZwGiZ";
                strArr[0] = "NTut6iZFc5ITOEQfsc6CPFa8BEeWuqD1";
                if (A04) {
                    int A023 = dz.A02(8) + 1;
                    for (int i4 = 0; i4 < A023; i4++) {
                        int i5 = mappingsCount - 1;
                        dz.A03(A00(i5));
                        int i6 = mappingsCount - 1;
                        dz.A03(A00(i6));
                    }
                }
                int i7 = dz.A02(2);
                if (i7 == 0) {
                    if (i2 > 1) {
                        for (int i8 = 0; i8 < mappingsCount; i8++) {
                            dz.A03(4);
                        }
                    }
                    for (int i9 = 0; i9 < i2; i9++) {
                        dz.A03(8);
                        dz.A03(8);
                        dz.A03(8);
                    }
                } else {
                    throw new C0470Af(A05(406, 58, 50));
                }
            }
        }
    }

    public static void A08(DZ dz) throws C0470Af {
        int A02 = dz.A02(6) + 1;
        for (int floorType = 0; floorType < A02; floorType++) {
            int A022 = dz.A02(16);
            if (A022 == 0) {
                dz.A03(8);
                dz.A03(16);
                dz.A03(16);
                dz.A03(6);
                dz.A03(8);
                int A023 = dz.A02(4) + 1;
                for (int rangeBits = 0; rangeBits < A023; rangeBits++) {
                    dz.A03(8);
                }
            } else if (A022 != 1) {
                throw new C0470Af(A05(114, 41, 126) + A022);
            } else {
                int j2 = dz.A02(5);
                int i2 = -1;
                int[] iArr = new int[j2];
                for (int i3 = 0; i3 < j2; i3++) {
                    iArr[i3] = dz.A02(4);
                    if (iArr[i3] > i2) {
                        i2 = iArr[i3];
                    }
                }
                int[] iArr2 = new int[i2 + 1];
                int i4 = 0;
                while (true) {
                    int length = iArr2.length;
                    String[] strArr = A01;
                    if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    if (i4 < length) {
                        iArr2[i4] = dz.A02(3) + 1;
                        int classSubclasses = dz.A02(2);
                        if (classSubclasses > 0) {
                            dz.A03(8);
                        }
                        for (int i5 = 0; i5 < (1 << classSubclasses); i5++) {
                            dz.A03(8);
                        }
                        i4++;
                    } else {
                        dz.A03(2);
                        int count = dz.A02(4);
                        int i6 = 0;
                        int i7 = 0;
                        for (int k2 = 0; k2 < j2; k2++) {
                            int rangeBits2 = iArr[k2];
                            i6 += iArr2[rangeBits2];
                            while (i7 < i6) {
                                dz.A03(count);
                                i7++;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A09(DZ dz) throws C0470Af {
        int A02 = dz.A02(6) + 1;
        for (int classifications = 0; classifications < A02; classifications++) {
            if (dz.A02(16) <= 2) {
                dz.A03(24);
                dz.A03(24);
                dz.A03(24);
                int A022 = dz.A02(6) + 1;
                dz.A03(8);
                int[] iArr = new int[A022];
                for (int i2 = 0; i2 < A022; i2++) {
                    int i3 = 0;
                    int A023 = dz.A02(3);
                    if (dz.A04()) {
                        i3 = dz.A02(5);
                    }
                    int highBits = i3 * 8;
                    iArr[i2] = highBits + A023;
                }
                for (int i4 = 0; i4 < A022; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        int k2 = 1 << i5;
                        if ((iArr[i4] & k2) != 0) {
                            dz.A03(8);
                        }
                    }
                }
            } else {
                throw new C0470Af(A05(363, 43, 17));
            }
        }
    }

    public static boolean A0A(int i2, C0660Ii c0660Ii, boolean z) throws C0470Af {
        if (c0660Ii.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C0470Af(A05(464, 18, 64) + c0660Ii.A04());
        } else if (c0660Ii.A0E() != i2) {
            if (z) {
                return false;
            }
            throw new C0470Af(A05(93, 21, 10) + Integer.toHexString(i2));
        } else if (c0660Ii.A0E() != 118 || c0660Ii.A0E() != 111 || c0660Ii.A0E() != 114 || c0660Ii.A0E() != 98 || c0660Ii.A0E() != 105 || c0660Ii.A0E() != 115) {
            if (z) {
                return false;
            }
            throw new C0470Af(A05(10, 28, 24));
        } else if (A01[6].length() != 22) {
            throw new RuntimeException();
        } else {
            String[] strArr = A01;
            strArr[1] = "3PFcydRg4Lp36gDWvcJwdxiXGhHOWBjb";
            strArr[0] = "aGBtdcQRGSwkEsynEcaJAL8zRbeII6kr";
            return true;
        }
    }

    public static C0531Dd[] A0B(DZ dz) {
        int A02 = dz.A02(6) + 1;
        C0531Dd[] c0531DdArr = new C0531Dd[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            c0531DdArr[windowType] = new C0531Dd(dz.A04(), dz.A02(16), dz.A02(16), dz.A02(8));
        }
        return c0531DdArr;
    }

    public static C0531Dd[] A0C(C0660Ii c0660Ii, int i2) throws C0470Af {
        A0A(5, c0660Ii, false);
        int i3 = c0660Ii.A0E() + 1;
        DZ dz = new DZ(c0660Ii.A00);
        dz.A03(c0660Ii.A06() * 8);
        for (int i4 = 0; i4 < i3; i4++) {
            A02(dz);
        }
        int A02 = dz.A02(6) + 1;
        for (int timeCount = 0; timeCount < A02; timeCount++) {
            int i5 = dz.A02(16);
            if (i5 != 0) {
                throw new C0470Af(A05(311, 52, 110));
            }
        }
        A08(dz);
        A09(dz);
        A07(i2, dz);
        C0531Dd[] A0B = A0B(dz);
        if (dz.A04()) {
            return A0B;
        }
        throw new C0470Af(A05(155, 43, 69));
    }
}
