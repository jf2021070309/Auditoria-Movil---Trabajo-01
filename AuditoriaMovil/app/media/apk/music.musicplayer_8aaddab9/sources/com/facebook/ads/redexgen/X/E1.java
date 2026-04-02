package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class E1 implements XI {
    public static byte[] A03;
    public static String[] A04 = {"zSqnO64p11LQVC3SPrHTwk7q", "RQQcRArwNRw7pCFobI7zm4AECBhyO", "uX7W3VjoXSZ8mIic8tH9fb17VHeYN2EI", "VdQ4q", "h", "roUcO9bhLUMzgbi0", "6tdL5l5B64y16QievzXwm2hdxMIwTdT2", "M1EyYsdVjnJYnVOvo"};
    public boolean A00 = true;
    public final C1045Xn A01;
    public final C04218d A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A04;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "GUa5RhIL61d4FW3HWW0RBx9i";
        strArr2[1] = "4nKtohmUbY7tHai9z2t8ojCMJbrZv";
        A03 = new byte[]{62, 28, 19, 90, 9, 93, 25, 24, 17, 24, 9, 24, 93, 28, 9, 9, 24, 16, 13, 9, 14, 93, 24, 5, 30, 24, 24, 25, 24, 25, 93, 24, 11, 24, 19, 9, 14, 83, 16, 21, 7, 24, 21, 46, 59, 59, 42, 34, 63, 59, Byte.MAX_VALUE, 122, 111, 122, 16, 29, 50, 36, 50, 50, 40, 46, 47, 30, 40, 37, 32, 54, 32, 32, 58, 60, 61, 12, 39, 58, 62, 54, 76, 81, 85, 93, 20, 15, 11, 5, 14, 63, 9, 4, Byte.MAX_VALUE, 114, 123, 110};
    }

    static {
        A04();
    }

    public E1(C1045Xn c1045Xn) {
        this.A01 = c1045Xn;
        this.A02 = new C04218d(c1045Xn);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(C1044Xm.A04.A00));
            jSONObject.put(A00(82, 8, 53), cursor.getString(C1044Xm.A09.A00));
            jSONObject.put(A00(90, 4, 94), cursor.getString(C1044Xm.A0A.A00));
            jSONObject.put(A00(78, 4, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), MC.A02(cursor.getDouble(C1044Xm.A08.A00)));
            jSONObject.put(A00(66, 12, 6), MC.A02(cursor.getDouble(C1044Xm.A07.A00)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(C1044Xm.A06.A00));
            String string = cursor.getString(C1044Xm.A03.A00);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(C1044Xm.A02.A00));
            jSONObject.put(A00(38, 5, 36), this.A01.A02().A6r());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(2));
            jSONObject.put(A00(82, 8, 53), cursor.getString(0));
            jSONObject.put(A00(90, 4, 94), cursor.getString(4));
            jSONObject.put(A00(78, 4, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), MC.A02(cursor.getDouble(5)));
            jSONObject.put(A00(66, 12, 6), MC.A02(cursor.getDouble(6)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(9));
            jSONObject.put(A00(38, 5, 36), this.A01.A02().A6r());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            String string = cursor.getString(C1043Xl.A02.A00);
            String string2 = cursor.getString(C1043Xl.A01.A00);
            String[] strArr = A04;
            if (strArr[6].charAt(14) != strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "IfQdYzKY6vCyBSxPg";
            strArr2[5] = "fxZpsWnZoPKbT5Dt";
            jSONObject.put(string, string2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04459f
    @SuppressLint({"CatchGeneralException"})
    public final int A3y(int i2) {
        int i3 = 0;
        if (i2 > -1) {
            try {
                i3 = this.A02.A08(i2);
            } catch (Exception e2) {
                if (this.A01.A03().A8P()) {
                    Log.e(XI.A00, A00(0, 38, 40), e2);
                }
            }
        }
        this.A02.A0I();
        if (this.A00) {
            this.A02.A0J();
        }
        return i3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04469g
    public final void A3z() {
        this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04459f
    public final boolean A4i(String str) {
        return this.A02.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04459f
    @Nullable
    public final JSONArray A5e() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A0A();
            JSONArray jSONArray = null;
            if (cursor.getCount() > 0) {
                jSONArray = A01(cursor);
            }
            cursor.close();
            return jSONArray;
        } catch (JSONException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04459f
    @Nullable
    public final JSONObject A5f() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A0B();
            JSONObject jSONObject = null;
            if (cursor.getCount() > 0) {
                jSONObject = A03(cursor);
            }
            cursor.close();
            return jSONObject;
        } catch (JSONException unused) {
            String[] strArr = A04;
            if (strArr[3].length() != strArr[4].length()) {
                String[] strArr2 = A04;
                strArr2[0] = "fQ4GsEetTW4Q8M7eeZgpps0V";
                strArr2[1] = "7a4bIAh8lhheYJZGYQIYoy5madi9z";
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04459f
    public final int A6Z() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A09();
            int i2 = cursor.moveToFirst() ? cursor.getInt(0) : 0;
            cursor.close();
            return i2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04459f
    @Nullable
    public final String A6c(String str) {
        String str2 = null;
        Cursor A0D = this.A02.A0D(str);
        if (A0D != null) {
            if (A0D.moveToNext() && A0D.getCount() > 0) {
                C8b c8b = C1044Xm.A0A;
                String[] strArr = A04;
                if (strArr[7].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[3] = "VgiME";
                strArr2[4] = "4";
                str2 = A0D.getString(A0D.getColumnIndex(c8b.A01));
            }
            A0D.close();
        }
        return str2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04459f
    public final Pair<JSONObject, JSONArray> A7e(int i2) {
        Cursor cursor = null;
        try {
            try {
                cursor = this.A02.A0C(i2);
                JSONArray jSONArray = null;
                JSONObject jSONObject = null;
                if (cursor.getCount() > 0) {
                    jSONObject = A03(cursor);
                    jSONArray = A02(cursor);
                }
                Pair<JSONObject, JSONArray> pair = new Pair<>(jSONObject, jSONArray);
                cursor.close();
                return pair;
            } catch (JSONException unused) {
                Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                if (cursor != null) {
                    cursor.close();
                }
                return pair2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04459f
    public final boolean A8G(String str) {
        return this.A02.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9d != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04469g
    public final void AFm(C0681Jd c0681Jd, AbstractC04439d<String> abstractC04439d) {
        this.A02.A0G(c0681Jd.A08(), c0681Jd.A05().A00, c0681Jd.A06().toString(), c0681Jd.A04(), c0681Jd.A03(), c0681Jd.A07(), c0681Jd.A09(), abstractC04439d);
    }
}
