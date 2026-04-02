package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
/* renamed from: com.facebook.ads.redexgen.X.dX  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1323dX extends L7 {
    public static byte[] A01;
    public static String[] A02 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {29, 41, 28, 40, 44, 28, 37, 26, 48, 22, 26, 24, 39, 39, 32, 37, 30};
        String[] strArr = A02;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A02[5] = "QkfkB";
        A01 = bArr;
    }

    static {
        A02();
    }

    public C1323dX(String str) {
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        boolean A0I;
        String A00 = A00(0, 17, 116);
        try {
            C02420u.A04.await();
            A0I = C02420u.A0I(this.A00);
            if (A0I) {
                ((C1O) C02420u.A00.A03().get(this.A00)).A04((int) (System.currentTimeMillis() / 1000));
                C02420u.A00.A06(this.A00);
                C02420u.A00.A04();
                C02420u.A09();
            }
        } catch (InterruptedException e2) {
            C02420u.A01.A06().A8y(A00, C04398z.A11, new AnonymousClass90(e2));
        } catch (JSONException e3) {
            C02420u.A07();
            C02420u.A01.A06().A8y(A00, C04398z.A10, new AnonymousClass90(e3));
        }
    }
}
