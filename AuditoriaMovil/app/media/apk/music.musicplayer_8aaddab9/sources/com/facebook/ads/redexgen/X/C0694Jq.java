package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Jq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0694Jq {
    public static byte[] A00;
    public static final Map<String, String> A01;
    public static final Map<String, List<String>> A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-68, -51, -49, -52, -33, -52, -42, -27, -34, -34, -43, -36, -3, 0, -14, -11, -16, 5, -6, -2, -10, -16, -2, 4, -68, -81, -69, -65, -81, -67, -66, -87, -66, -77, -73, -81, -87, -73, -67, -111, -108, 123, -126, -111, -118, -118, -127, -120, 123, -120, -117, -125, -125, -123, -118, -125};
    }

    static {
        A03();
        A02 = new HashMap();
        A01 = new HashMap();
    }

    @Nullable
    public static String A01(String str) {
        return A01.get(str);
    }

    public static List<String> A02(C1046Xo c1046Xo, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                arrayList.add(jSONArray.getString(i2));
            } catch (JSONException e2) {
                c1046Xo.A06().A8y(A00(39, 17, 1), C04398z.A12, new AnonymousClass90(e2));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C0692Jo c0692Jo, EnumC0691Jn enumC0691Jn) {
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0693Jp(c0692Jo, enumC0691Jn));
    }

    public static void A05(C1046Xo c1046Xo, String str, long j2) {
        C0692Jo c0692Jo = new C0692Jo(str, c1046Xo.A08());
        HashMap hashMap = new HashMap();
        hashMap.put(A00(24, 15, 47), MC.A06(j2));
        hashMap.put(A00(12, 12, 118), MC.A04(j2));
        c0692Jo.A02(EnumC0691Jn.A0D, hashMap);
    }

    public static void A06(C1046Xo c1046Xo, JSONObject jSONObject, long j2, @Nullable String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A00(2, 4, 80));
        if (optJSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(6, 6, 85));
        if (TextUtils.isEmpty(str) && optJSONArray != null) {
            A07(c1046Xo, optJSONObject, A02(c1046Xo, optJSONArray), j2, null);
        } else if (TextUtils.isEmpty(str) || !A02.containsKey(str)) {
        } else {
            A07(c1046Xo, optJSONObject, A02.get(str), j2, str);
        }
    }

    public static void A07(C1046Xo c1046Xo, JSONObject jSONObject, List<String> list, long j2, @Nullable String str) {
        String A002 = A00(0, 2, 62);
        if (jSONObject.has(A002)) {
            String optString = jSONObject.optString(A002);
            A08(optString, str);
            A09(optString, list);
            A05(c1046Xo, optString, j2);
        }
    }

    public static void A08(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A01.put(str, str2);
    }

    public static void A09(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        A02.put(str, list);
    }

    public static boolean A0A(String str, EnumC0691Jn enumC0691Jn) {
        return A0B(str, enumC0691Jn.A02());
    }

    public static boolean A0B(String str, String str2) {
        return A02.containsKey(str) && A02.get(str).contains(str2);
    }
}
