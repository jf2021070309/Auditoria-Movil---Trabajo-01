package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class J0 {
    public static byte[] A05;
    public static String[] A06 = {"6HhNm3cPNapwaqbb", "rETS2R3vEEslStUJRpCBgfLkJK0S9xqh", "MEYGBk1oMmhBWHD5huW8XB9PkOXmJxmW", "Ebyfs41o5airltqaiKadsdL394JDYdET", "45eNA9gLGf59sMGZ1iMI", "", "A0Zue4QITY9ZnpF1VrB6IK97BmW1DYMt", "lY4WeGl5g11cW0QvoH9uVkbc4B0XWsja"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            byte b2 = copyOfRange[i5];
            String[] strArr = A06;
            if (strArr[2].charAt(1) != strArr[1].charAt(1)) {
                throw new RuntimeException();
            }
            A06[3] = "kNkKJeUYPfq8eMd2tA59MaBH22H8N5Ts";
            copyOfRange[i5] = (byte) ((b2 - i4) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{13, 58, 58, 55, 58, -24, 56, 41, 58, 59, 49, 54, 47, -24, 9, 30, 11, -24, 43, 55, 54, 46, 49, 47};
    }

    static {
        A02();
    }

    public J0(List<byte[]> initializationData, int i2, int i3, int i4, float f2) {
        this.A04 = initializationData;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = f2;
    }

    public static J0 A00(C0660Ii c0660Ii) throws C0470Af {
        try {
            c0660Ii.A0Z(4);
            int A0E = (c0660Ii.A0E() & 3) + 1;
            if (A0E != 3) {
                ArrayList arrayList = new ArrayList();
                int numSequenceParameterSets = c0660Ii.A0E() & 31;
                for (int j2 = 0; j2 < numSequenceParameterSets; j2++) {
                    arrayList.add(A03(c0660Ii));
                }
                int A0E2 = c0660Ii.A0E();
                for (int numPictureParameterSets = 0; numPictureParameterSets < A0E2; numPictureParameterSets++) {
                    arrayList.add(A03(c0660Ii));
                }
                int i2 = -1;
                int i3 = -1;
                float f2 = 1.0f;
                int width = A06[4].length();
                if (width != 27) {
                    String[] strArr = A06;
                    strArr[2] = "yEkjaL4nSOxIxbdygxb0eg7rmaPMv2Rh";
                    strArr[1] = "JEi8k2PtpDNktftvz60xHr0NAbywlG3U";
                    if (numSequenceParameterSets > 0) {
                        int height = ((byte[]) arrayList.get(0)).length;
                        C0655Id A062 = C0656Ie.A06((byte[]) arrayList.get(0), A0E, height);
                        i2 = A062.A06;
                        i3 = A062.A02;
                        f2 = A062.A00;
                    }
                    return new J0(arrayList, A0E, i2, i3, f2);
                }
                throw new RuntimeException();
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C0470Af(A01(0, 24, 119), e2);
        }
    }

    public static byte[] A03(C0660Ii c0660Ii) {
        int offset = c0660Ii.A0I();
        int A062 = c0660Ii.A06();
        c0660Ii.A0Z(offset);
        return IN.A08(c0660Ii.A00, A062, offset);
    }
}
