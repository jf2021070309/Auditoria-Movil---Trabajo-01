package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class H5 implements RB {
    public static byte[] A01;
    public static String[] A02 = {"pV4qaXw6VxHe7sBZO1Jm7", "tYmmDZR", "QxtgKachTN194eYcwGU9LkTJFmNVHEQq", "xizWbh8OYfs2b3YS4RQSAfdZXrf", "ZGXkvbP8ihMVuHVBPcyrpbYPgwlZhzIP", "8ikrsMyeeixNpMm9GyoBY2XQC58AAuyp", "5oOpXt9UGuRFEd", "RP1a17xo5hy9tsnm95xYo1Dg0S3kboh6"};
    public final boolean A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 74, 110, 66, 67, 89, 72, 67, 89, 23, 13, 19, 36, 34, 36, 40, 55, 36, 97, 52, 51, 45, 123, 97, 12, 43, 62, 43, 42, 44, 101, Byte.MAX_VALUE};
    }

    static {
        A01();
    }

    public H5(boolean z) {
        this.A00 = z;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                List<String> headers = map.get(str);
                for (String str2 : headers) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    String header = A00(1, 1, 79);
                    sb.append(header);
                    sb.append(str2);
                    sb.toString();
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final boolean A8Z() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final void A9D(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 13) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 18) + ((String) obj);
        }
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "GaHF5freueg6l7URhKCrm47FqBCtqYBi";
        strArr2[5] = "OrzNjk0gyiryng1un1TYaQe8BXJyjneo";
        A02(requestProperties);
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final void A9E(InterfaceC0874Qu interfaceC0874Qu) {
        if (interfaceC0874Qu != null) {
            String str = A00(11, 13, 126) + interfaceC0874Qu.getUrl();
            String str2 = A00(24, 8, 96) + interfaceC0874Qu.A7Z();
            A02(interfaceC0874Qu.A6j());
        }
    }
}
