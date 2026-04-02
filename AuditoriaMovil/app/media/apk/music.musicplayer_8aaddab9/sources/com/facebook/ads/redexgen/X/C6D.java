package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ThreadSafe
@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.facebook.ads.redexgen.X.6D  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6D {
    public static EnumC03966w A06;
    public static byte[] A07;
    public static String[] A08 = {"eZKmHpMMDfaoBqW8nqrxEoXtMavqlqNM", "AtFM24PyHDF8", "75v22abHTVt154frUD1Ye4KyqdVteY4i", "Q1X3dzo1KUJ0DHl8HY6jDpMlStfBjogW", "z2ZYiDayfErc", "35EgzrmLPkhoCqMLba9eqfKFMV7fawsP", "opJsobvHgIMCHkez4yG45JKspLs2PehX", "oVaFSOpmfGo5v5TJJzClDpDAWRdHWsbi"};
    public static final AtomicReference<C6D> A09;
    public C6F A00;
    public C03816h A01;
    public final Context A02;
    public final C6C A03;
    public final AtomicReference<C6S> A04 = new AtomicReference<>();
    public final AtomicReference<C1170ay> A05 = new AtomicReference<>();

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{99, 101, 116, Byte.MAX_VALUE, 25, 20, 92, 90, 114, 109, 113};
    }

    static {
        A01();
        A09 = new AtomicReference<>();
    }

    public C6D(Context context, C6C c6c, EnumC03966w enumC03966w) {
        this.A02 = context;
        this.A03 = c6c;
        this.A01 = new C03816h(this.A02, this.A03);
        if (this.A04.get() == null && C7J.A0E(enumC03966w)) {
            A02(enumC03966w);
        }
    }

    private synchronized void A02(EnumC03966w enumC03966w) {
        if (this.A04.get() == null) {
            C6O.A02(this.A03.A0Z());
            C1170ay c1170ay = new C1170ay(this.A03, this.A01);
            this.A05.set(c1170ay);
            this.A00 = new C6F();
            this.A00.A00(c1170ay);
            if (this.A01.A06() && C7J.A0E(enumC03966w)) {
                c1170ay.A05(enumC03966w);
            }
            A06 = enumC03966w;
            this.A00.A01(enumC03966w);
            this.A04.set(C6S.A00(this.A02, this.A03));
        }
    }

    private boolean A03(EnumC03966w enumC03966w) {
        if (C7J.A0E(enumC03966w)) {
            A02(enumC03966w);
        }
        if (enumC03966w.equals(A06)) {
            return false;
        }
        A06 = enumC03966w;
        C6F c6f = this.A00;
        if (c6f != null) {
            c6f.A01(enumC03966w);
        }
        if (A08[0].charAt(4) != 't') {
            A08[2] = "al3lqCaa3X6BhafyoLSdmdZ2qZ9PyUcx";
            return true;
        }
        throw new RuntimeException();
    }

    private boolean A04(String str, AnonymousClass70 anonymousClass70) {
        if (!C7J.A0E(A06) || this.A04.get() == null) {
            return false;
        }
        C03816h c03816h = this.A01;
        if (c03816h != null) {
            c03816h.A05(EnumC03986y.A02, A06, str, anonymousClass70);
            return true;
        }
        return true;
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A05(MotionEvent motionEvent) {
        try {
            if (this.A04.get() == null) {
                return;
            }
            this.A04.get().A05(motionEvent);
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized boolean A06(String str) {
        JSONObject jSONObject;
        AnonymousClass70 anonymousClass70;
        String string;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    jSONObject = new JSONObject(str).getJSONObject(A00(0, 2, 69));
                } catch (JSONException unused) {
                } catch (Throwable th) {
                    C6O.A03(th);
                }
                if (jSONObject != null) {
                    r7 = jSONObject.has(A00(6, 2, 106)) ? false | A03(EnumC03966w.A00(jSONObject.getInt(A00(6, 2, 106)))) : false;
                    JSONArray jSONArray = jSONObject.getJSONArray(A00(2, 2, 83));
                    if (jSONObject.has(A00(8, 3, 69))) {
                        anonymousClass70 = AnonymousClass70.A00(jSONObject.getInt(A00(8, 3, 69)));
                    } else {
                        anonymousClass70 = AnonymousClass70.A04;
                    }
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        if (jSONObject2.has(A00(4, 2, 52)) && (string = jSONObject2.getString(A00(4, 2, 52))) != null && !string.isEmpty()) {
                            C7J.A0B(this.A03, C6J.A04.A02(), string);
                            r7 |= A04(string, anonymousClass70);
                        }
                    }
                    return r7;
                }
                return false;
            }
        }
        return false;
    }
}
