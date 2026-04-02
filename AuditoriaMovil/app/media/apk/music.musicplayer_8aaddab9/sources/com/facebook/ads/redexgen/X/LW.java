package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class LW {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{121, 123, 110, 111, -120, 119, 126, 118, -120, 106, 109, 124, -120, 119, 120, -120, 108, 113, 106, 114, 119, -71, -73, -55, -71, -73, -70, -69, -70, -75, -73, -70, -25, -6, -10, -12, -29, -31, -26, -29, -10, -29, -82, -81, -76, -70, -71, -45, -43};
    }

    @VisibleForTesting(otherwise = 2)
    private final String A01(@Nullable String str) throws JSONException {
        String A002 = A00(47, 2, 49);
        if (str != null) {
            A002 = new JSONObject(str).getJSONObject(A00(42, 5, 31)).optString(A00(32, 10, 91), A002);
        }
        JSONObject jSONObject = new JSONObject(A002);
        jSONObject.put(A00(21, 11, 47), true);
        return jSONObject.toString();
    }

    public final InterstitialAd A03(C1046Xo c1046Xo, String str, @Nullable String str2) {
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c1046Xo.A0C(), str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A01(str2)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A04(C1046Xo c1046Xo, boolean z) {
        int i2 = 0;
        String A002 = A00(0, 21, 2);
        if (!z) {
            i2 = C0719Ks.A00(c1046Xo).getInt(A002, 0) + 1;
        }
        C0719Ks.A00(c1046Xo).edit().putInt(A002, i2).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (new org.json.JSONObject(new org.json.JSONObject(r8).getJSONObject(A00(42, 5, 31)).optString(A00(32, 10, 91), A00(47, 2, 49))).optBoolean(A00(21, 11, 47), false) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.facebook.ads.redexgen.X.C1046Xo r7, @androidx.annotation.Nullable java.lang.String r8, int r9) {
        /*
            r6 = this;
            r4 = 0
            if (r9 > 0) goto L4
            return r4
        L4:
            if (r8 == 0) goto L44
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r3.<init>(r8)     // Catch: org.json.JSONException -> L5c
            r2 = 42
            r1 = 5
            r0 = 31
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r5 = r3.getJSONObject(r0)     // Catch: org.json.JSONException -> L5c
            r2 = 32
            r1 = 10
            r0 = 91
            java.lang.String r3 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L5c
            r2 = 47
            r1 = 2
            r0 = 49
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = r5.optString(r3, r0)     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r3.<init>(r0)     // Catch: org.json.JSONException -> L5c
            r2 = 21
            r1 = 11
            r0 = 47
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L5c
            boolean r0 = r3.optBoolean(r0, r4)     // Catch: org.json.JSONException -> L5c
            if (r0 != 0) goto L5c
        L44:
            android.content.SharedPreferences r3 = com.facebook.ads.redexgen.X.C0719Ks.A00(r7)     // Catch: org.json.JSONException -> L5c
            r2 = 0
            r1 = 21
            r0 = 2
            java.lang.String r1 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L5c
            int r0 = r9 + (-1)
            int r1 = r3.getInt(r1, r0)     // Catch: org.json.JSONException -> L5c
            int r0 = r9 + (-1)
            if (r1 < r0) goto L5b
            r4 = 1
        L5b:
            return r4
        L5c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LW.A05(com.facebook.ads.redexgen.X.Xo, java.lang.String, int):boolean");
    }
}
