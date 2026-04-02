package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public class PB implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ PF A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{108, 64, 90, 67, 75, 15, 65, 64, 91, 15, 95, 78, 93, 92, 74, 15, 92, 74, 93, 89, 74, 93, 15, 66, 74, 92, 92, 78, 72, 74, 123, 76, 76, 81, 76, 30, 78, 95, 76, 77, 87, 80, 89, 30, 116, 109, 113, 112, 30, 87, 80, 30, 78, 81, 77, 74, 115, 91, 77, 77, 95, 89, 91, 30, 103, 115, 114, 110, 77, 99, Byte.MAX_VALUE, 32, 61, 49, 55, 36, 26, 33, 36, 49, 36, 108, 97, 104, 125, 28, 26};
    }

    public PB(PF pf, String str) {
        this.A00 = pf;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0820Or c0820Or;
        String str;
        C0820Or c0820Or2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 47)))) {
                    this.A00.A0C(PD.A00(jSONObject.optString(A00(81, 4, 49))), jSONObject.optString(A00(71, 10, 108), A00(85, 2, 78)));
                    return;
                }
                c0820Or2 = this.A00.A04;
                c0820Or2.A04(C04398z.A0s, A00(0, 30, 6));
            } catch (JSONException e2) {
                c0820Or = this.A00.A04;
                int i2 = C04398z.A0w;
                c0820Or.A04(i2, A00(30, 34, 23) + e2.getMessage());
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
