package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Gi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0610Gi {
    public static byte[] A00;
    public static String[] A01 = {"ijZd2SvY", "Ph5fJqf6OowbUT2cqzgcB298kDhnW2OX", "wB5WDB4JU6krUWdN", "eBmlwoifn7sQacvwvpCdDN7mM49lFTV9", "8TaUd8AxspPDe4hMAHd3njvqxnnZalZZ", "my8xvAbSAhbAvtjE", "sCujs14tvAISPjVlxjJqhwIZMpV4htIn", "ZuHVfppKLGIB3c7uxsgIg35bH7izaigq"};
    public static final int A02;
    public static final int A03;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-52, -18, -22, -34, -3, -14, -11, 113, -127, 116, 94, -71, -77, -85, -90, -99, -75, -77, -70, -70, -77, -72, -79, 106, -68, -81, -73, -85, -77, -72, -82, -81, -68, 106, -71, -80, 106, -73, -85, -74, -80, -71, -68, -73, -81, -82, 106, -99, -113, -109, 106, -104, -117, -106, 106, -65, -72, -77, -66, 120};
    }

    static {
        A02();
        A03 = C0676Iy.A08(A01(11, 4, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH));
        A02 = C0676Iy.A08(A01(7, 4, 33));
    }

    public static int A00(C0660Ii c0660Ii) {
        int b2 = 0;
        while (c0660Ii.A04() != 0) {
            int A0E = c0660Ii.A0E();
            String[] strArr = A01;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "2iVFcVRayhlXICIL";
            strArr2[5] = "cB88SmkuRLYvydLN";
            b2 += A0E;
            if (A0E != 255) {
                return b2;
            }
        }
        return -1;
    }

    public static void A03(long j2, C0660Ii c0660Ii, InterfaceC0525Co[] interfaceC0525CoArr) {
        int countryCode;
        while (c0660Ii.A04() > 1) {
            int A002 = A00(c0660Ii);
            int A003 = A00(c0660Ii);
            int A06 = c0660Ii.A06() + A003;
            if (A003 == -1 || A003 > c0660Ii.A04()) {
                Log.w(A01(0, 7, 125), A01(15, 45, 62));
                A06 = c0660Ii.A07();
            } else if (A002 == 4 && A003 >= 8) {
                int A0E = c0660Ii.A0E();
                int A0I = c0660Ii.A0I();
                int i2 = 0;
                if (A0I == 49) {
                    i2 = c0660Ii.A08();
                }
                int A0E2 = c0660Ii.A0E();
                if (A0I == 47) {
                    c0660Ii.A0Z(1);
                }
                int ccCount = (A0E == 181 && (A0I == 49 || A0I == 47) && A0E2 == 3) ? 1 : 0;
                if (A0I == 49) {
                    int countryCode2 = A03;
                    if (i2 != countryCode2) {
                        int countryCode3 = A02;
                        if (i2 != countryCode3) {
                            countryCode = 0;
                            ccCount &= countryCode;
                        }
                    }
                    countryCode = 1;
                    ccCount &= countryCode;
                }
                if (ccCount != 0) {
                    int countryCode4 = c0660Ii.A0E();
                    c0660Ii.A0Z(1);
                    int i3 = (countryCode4 & 31) * 3;
                    int ccCount2 = c0660Ii.A06();
                    for (InterfaceC0525Co interfaceC0525Co : interfaceC0525CoArr) {
                        c0660Ii.A0Y(ccCount2);
                        interfaceC0525Co.AEL(c0660Ii, i3);
                        interfaceC0525Co.AEM(j2, 1, i3, 0, null);
                    }
                }
            }
            c0660Ii.A0Y(A06);
        }
    }
}
