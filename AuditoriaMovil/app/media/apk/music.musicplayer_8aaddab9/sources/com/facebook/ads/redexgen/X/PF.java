package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class PF {
    public static byte[] A08;
    public WeakReference<P4> A00;
    public WeakReference<SM> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1046Xo A03;
    public final C0820Or A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC0684Jg> A07;

    static {
        A09();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, 27, 18, 26, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, 27, 20, 20, 11, 18, 5, 19, 11, 25, 25, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, 27, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public PF(C1046Xo c1046Xo, P4 p4, InterfaceC0684Jg interfaceC0684Jg, C0820Or c0820Or, String str, String str2) {
        this.A03 = c1046Xo;
        this.A00 = new WeakReference<>(p4);
        this.A07 = new WeakReference<>(interfaceC0684Jg);
        this.A04 = c0820Or;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        SM sm = this.A01.get();
        if (sm == null) {
            return;
        }
        sm.close();
    }

    private void A05() {
        SM sm = this.A01.get();
        if (sm == null) {
            return;
        }
        sm.A80();
    }

    private void A06() {
        SM sm = this.A01.get();
        if (sm == null) {
            return;
        }
        sm.A8h();
    }

    private void A07() {
        this.A03.A0D().A4t();
        this.A02 = true;
        SM sm = this.A01.get();
        if (sm == null) {
            return;
        }
        sm.AF7();
        if (JQ.A1F(this.A03)) {
            this.A03.A09().AAR();
        }
    }

    private void A08() {
        SM sm = this.A01.get();
        if (sm == null) {
            return;
        }
        sm.AAo();
    }

    private void A0A(P4 p4, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = C0719Ks.A00(this.A03);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(57, 5, 81), A01);
        String opId = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        StringBuilder sb = new StringBuilder();
        String key = A01(14, 4, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT);
        sb.append(key);
        sb.append(opId);
        String key2 = sb.toString();
        String key3 = A00.getString(key2, A01);
        if (key3 != null) {
            A01 = key3;
        }
        p4.A0g(optString, A01);
    }

    private void A0B(P4 p4, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(98, 5, 12), A01);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A01);
        String optString3 = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        SharedPreferences.Editor edit = C0719Ks.A00(this.A03).edit();
        edit.putString(A01(14, 4, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT) + optString3, optString).apply();
        p4.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(PD pd, String str) throws JSONException {
        switch (pd) {
            case A0A:
                A0I(new JSONObject(str));
                break;
            case A0E:
                A06();
                break;
            case A03:
                A04();
                break;
            case A0D:
                A07();
                break;
            case A09:
                A0K(new JSONObject(str));
                break;
            case A0H:
                A0L(new JSONObject(str));
                break;
            case A04:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case A0M:
                A05();
            case A07:
                this.A03.A0D().A55(str);
                break;
            case A0C:
            case A0N:
            case A0K:
            case A0J:
            case A0G:
                A0D(pd, str);
                break;
            case A0B:
                A0J(new JSONObject(str));
                break;
            case A08:
                A08();
                break;
            case A0I:
                A0M(new JSONObject(str));
                break;
        }
        P4 p4 = this.A00.get();
        if (p4 == null) {
            return;
        }
        switch (PC.A00[pd.ordinal()]) {
            case 19:
                p4.A0S();
                return;
            case 20:
                p4.A0R();
                return;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                A0B(p4, str);
                return;
            case 22:
                A0A(p4, str);
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                p4.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(PD pd, String str) throws JSONException {
        SM sm = this.A01.get();
        if (sm == null) {
            return;
        }
        switch (pd) {
            case A0C:
                sm.AAs();
                return;
            case A0N:
                sm.ACH();
                return;
            case A0K:
                A0G(sm, str);
                return;
            case A0J:
                A0F(sm, str);
                return;
            case A0G:
                A0E(sm, str);
                return;
            default:
                return;
        }
    }

    private void A0E(SM sm, String str) throws JSONException {
        sm.ABW(new JSONObject(str).optBoolean(A01(87, 5, 108), false));
    }

    private void A0F(SM sm, String str) throws JSONException {
        sm.ACk(new JSONObject(str).optBoolean(A01(62, 12, 118), false));
    }

    private void A0G(SM sm, String str) throws JSONException {
        sm.ACm(new JSONObject(str).optBoolean(A01(74, 13, 82), false));
    }

    private void A0I(JSONObject jSONObject) {
        SM sm = this.A01.get();
        if (sm == null) {
            return;
        }
        String optString = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(optString)) {
            sm.A7v();
        } else {
            sm.A7w(optString);
        }
    }

    private void A0J(JSONObject jSONObject) {
        SM sm = this.A01.get();
        if (sm == null) {
            return;
        }
        sm.A81(jSONObject.optString(A01(0, 7, 85)));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC0684Jg interfaceC0684Jg = this.A07.get();
        if (interfaceC0684Jg == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new C0692Jo(this.A06, interfaceC0684Jg).A03(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String optString = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.A03.A0D().A8w(optInt, optString);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        SM sm = this.A01.get();
        if (sm == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        sm.ACz(optString);
    }

    public final void A0N(SM sm) {
        this.A01 = new WeakReference<>(sm);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        MF.A00(new PB(this, str));
    }
}
