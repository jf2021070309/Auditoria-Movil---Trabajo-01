package com.facebook.ads.redexgen.X;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Wa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1006Wa extends Cq {
    public static byte[] A01;
    public static String[] A02 = {"VtWAGSJcoPK1ZfQIT7kg70", "uvijoF7s18JkyzfLjC52JO", "UbwrKHlSsB9uBr4pHbp3GiHEJPcDIn2y", "M5IiKhc4TX4EBu4m9nlnlg4KrGcCYGid", "uZSF2L4tKNd9pS0dTFbwskwuDNdjgXB", "5", "JxfitwILt0nkPD2n3YPqqh4", "RXlbAzoXPs3VSjVZyf6us5"};
    public long A00;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{47, 62, 57, 42, 63, 34, 36, 37, 83, 82, 113, 89, 72, 93, 120, 93, 72, 93};
    }

    static {
        A0A();
    }

    public C1006Wa() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C0660Ii c0660Ii) {
        return c0660Ii.A0E();
    }

    public static Boolean A01(C0660Ii c0660Ii) {
        return Boolean.valueOf(c0660Ii.A0E() == 1);
    }

    public static Double A02(C0660Ii c0660Ii) {
        return Double.valueOf(Double.longBitsToDouble(c0660Ii.A0L()));
    }

    public static Object A03(C0660Ii c0660Ii, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 8) {
                            HashMap<String, Object> A08 = A08(c0660Ii);
                            if (A02[5].length() != 0) {
                                String[] strArr = A02;
                                strArr[7] = "dv1uUJDV50UY3341cCSHZj";
                                strArr[6] = "lZLu8OCPwS2vewsoll9LjNz";
                                return A08;
                            }
                        } else if (i2 != 10) {
                            if (i2 != 11) {
                                return null;
                            }
                            return A07(c0660Ii);
                        } else {
                            ArrayList<Object> A06 = A06(c0660Ii);
                            String[] strArr2 = A02;
                            if (strArr2[1].length() == strArr2[0].length()) {
                                A02[4] = "2Wm";
                                return A06;
                            }
                        }
                        throw new RuntimeException();
                    }
                    return A09(c0660Ii);
                }
                return A05(c0660Ii);
            }
            return A01(c0660Ii);
        }
        return A02(c0660Ii);
    }

    public static String A05(C0660Ii c0660Ii) {
        int position = c0660Ii.A0I();
        int A06 = c0660Ii.A06();
        c0660Ii.A0Z(position);
        return new String(c0660Ii.A00, A06, position);
    }

    public static ArrayList<Object> A06(C0660Ii c0660Ii) {
        int A0H = c0660Ii.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(A0H);
        for (int type = 0; type < A0H; type++) {
            arrayList.add(A03(c0660Ii, A00(c0660Ii)));
        }
        return arrayList;
    }

    public static Date A07(C0660Ii c0660Ii) {
        Date date = new Date((long) A02(c0660Ii).doubleValue());
        c0660Ii.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C0660Ii c0660Ii) {
        int A0H = c0660Ii.A0H();
        HashMap<String, Object> hashMap = new HashMap<>(A0H);
        for (int i2 = 0; i2 < A0H; i2++) {
            hashMap.put(A05(c0660Ii), A03(c0660Ii, A00(c0660Ii)));
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(C0660Ii c0660Ii) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(c0660Ii);
            int A00 = A00(c0660Ii);
            if (A02[4].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "V4HwzONZDXYgxClN6ndm7q";
            strArr[0] = "UAxIIFeY73WGzRiRR4AY1i";
            if (A00 == 9) {
                return hashMap;
            }
            hashMap.put(A05, A03(c0660Ii, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final void A0B(C0660Ii c0660Ii, long j2) throws C0470Af {
        if (A00(c0660Ii) == 2) {
            if (!A04(8, 10, 28).equals(A05(c0660Ii)) || A00(c0660Ii) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c0660Ii);
            String A04 = A04(0, 8, FacebookMediationAdapter.ERROR_NULL_CONTEXT);
            if (metadata.containsKey(A04)) {
                double doubleValue = ((Double) metadata.get(A04)).doubleValue();
                if (doubleValue > 0.0d) {
                    this.A00 = (long) (1000000.0d * doubleValue);
                    return;
                }
                return;
            }
            return;
        }
        throw new C0470Af();
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final boolean A0C(C0660Ii c0660Ii) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
