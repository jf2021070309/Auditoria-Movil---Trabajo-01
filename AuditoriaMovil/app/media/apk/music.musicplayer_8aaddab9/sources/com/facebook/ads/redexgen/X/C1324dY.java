package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
/* renamed from: com.facebook.ads.redexgen.X.dY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1324dY extends L7 {
    public static byte[] A01;
    public static String[] A02 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = (copyOfRange[i5] - i4) - 47;
            if (A02[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i5] = (byte) i6;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A02[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A02[3] = "LuOw";
        A01 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C1324dY(String str) {
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        boolean A0I;
        try {
            C02420u.A04.await();
            synchronized (C02420u.A00) {
                Iterator<String> keys = C02420u.A00.A03().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0I = C02420u.A0I(this.A00);
                    if (A0I) {
                        C02420u.A0B((C1O) C02420u.A00.A03().get(next), next, next.equals(this.A00));
                    }
                }
                C02420u.A00.A04();
                C02420u.A09();
            }
        } catch (InterruptedException e2) {
            C02420u.A01.A06().A8y(A00(0, 17, 8), C04398z.A11, new AnonymousClass90(e2));
        } catch (JSONException e3) {
            C02420u.A07();
            C02420u.A01.A06().A8y(A00(0, 17, 8), C04398z.A10, new AnonymousClass90(e3));
        }
    }
}
