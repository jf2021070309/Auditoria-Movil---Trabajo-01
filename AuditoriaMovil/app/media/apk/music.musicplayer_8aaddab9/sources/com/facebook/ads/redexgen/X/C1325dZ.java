package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.dZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1325dZ extends L7 {
    public static byte[] A01;
    public final /* synthetic */ JSONObject A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C1325dZ(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        try {
            C02420u.A03.await();
            synchronized (C02420u.A00) {
                C02420u.A00.A09(this.A00);
                C02420u.A04.countDown();
            }
        } catch (InterruptedException e2) {
            C02420u.A01.A06().A8y(A00(0, 17, 116), C04398z.A11, new AnonymousClass90(e2));
        } catch (JSONException e3) {
            C02420u.A07();
            C02420u.A01.A06().A8y(A00(0, 17, 116), C04398z.A10, new AnonymousClass90(e3));
        }
    }
}
