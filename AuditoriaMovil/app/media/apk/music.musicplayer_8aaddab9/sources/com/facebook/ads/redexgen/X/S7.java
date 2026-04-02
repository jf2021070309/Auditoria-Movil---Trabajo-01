package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class S7 extends L7 {
    public static byte[] A01;
    public static String[] A02 = {"aQtlI1Us5cYHMsIV", "ql6TdDFLVKaOF", "ILd0cBh", "B0sTrIURZDTgtQOqZ9wP44Me", "PUGSIMdaF2lm0BEktB", "ig45kctSq2tkP", "eb7l2wEenDPHh06UHeaR81tCSX", "F61vU5UciYvMkd8uRJU0Fm"};
    public final /* synthetic */ C8I A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[7] = "csAIefbP6dEHufce3C5MSz";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 117);
            i5++;
        }
    }

    public static void A02() {
        A01 = new byte[]{67, 86, 81, 82, 92, 13, 91, 82, 99, 82, 95, 13, 96, 97, 78, 95, 97, 82, 81, 13, 93, 89, 78, 102, 86, 91, 84};
    }

    static {
        A02();
    }

    public S7(C8I c8i) {
        this.A00 = c8i;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        boolean z;
        z = this.A00.A08;
        if (!z) {
            this.A00.A0G(A00(0, 27, SyslogConstants.LOG_CLOCK));
        }
    }
}
