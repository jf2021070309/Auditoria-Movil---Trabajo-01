package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class UN implements InterfaceC0684Jg {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static InterfaceC0684Jg A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1045Xn A00;
    public final InterfaceC04469g A01;
    public final InterfaceC0683Jf A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = UN.class.getSimpleName();
        A06 = false;
    }

    public UN(C1045Xn c1045Xn) {
        InterfaceC0682Je A00;
        this.A00 = c1045Xn;
        if (JS.A0T(c1045Xn)) {
            this.A01 = C04449e.A00(c1045Xn);
            A00 = C0689Jl.A01(c1045Xn, this.A01);
        } else {
            E1 A01 = C04449e.A01(c1045Xn);
            A00 = C0689Jl.A00(c1045Xn, A01);
            this.A01 = A01;
        }
        this.A02 = new UQ(c1045Xn, A00);
        MQ.A08.execute(new UP(this));
        A04(c1045Xn);
    }

    public static synchronized InterfaceC0684Jg A01(C1045Xn c1045Xn) {
        InterfaceC0684Jg interfaceC0684Jg;
        synchronized (UN.class) {
            if (A03 == null) {
                A03 = new UN(c1045Xn);
            }
            interfaceC0684Jg = A03;
        }
        return interfaceC0684Jg;
    }

    public static synchronized void A04(C1045Xn c1045Xn) {
        synchronized (UN.class) {
            if (A06) {
                return;
            }
            c1045Xn.A02().A9r();
            A06 = true;
        }
    }

    private void A05(C0681Jd c0681Jd) {
        if (!c0681Jd.A0A()) {
            String str = A05;
            Log.e(str, A02(7, 29, 24) + c0681Jd.A06() + A02(0, 7, 55));
            return;
        }
        A06(c0681Jd);
        this.A01.AFm(c0681Jd, new UO(this, c0681Jd));
    }

    @SuppressLint({"ThrowException"})
    private void A06(C0681Jd c0681Jd) {
        switch (c0681Jd.A06()) {
            case A0O:
            case A0J:
            case A07:
            case A0I:
            case A0P:
            case A0R:
            case A0S:
                AnonymousClass90 anonymousClass90 = new AnonymousClass90(new Exception(A02(36, 5, 50)));
                anonymousClass90.A03(1);
                try {
                    anonymousClass90.A05(new JSONObject().put(A02(48, 4, FacebookMediationAdapter.ERROR_NULL_CONTEXT), c0681Jd.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A06().A8z(A02(41, 7, 50), C04398z.A17, anonymousClass90);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A8q(String str, Map<String, String> map) {
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A8t(String str, Map<String, String> map) {
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A8u(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A07).A06(C0694Jq.A0A(str, EnumC0691Jn.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A8v(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A08).A06(C0694Jq.A0A(str, EnumC0691Jn.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A8x(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A91(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A93(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A05).A02(EnumC0687Jj.A0D).A06(C0694Jq.A0A(str, EnumC0691Jn.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A94(String str, @Nullable Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A05).A02(EnumC0687Jj.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A95(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A05).A02(EnumC0687Jj.A0F).A06(C0694Jq.A0A(str, EnumC0691Jn.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A96(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A05).A02(EnumC0687Jj.A0J).A06(C0694Jq.A0A(str, EnumC0691Jn.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A98(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A0I).A06(C0694Jq.A0A(str, EnumC0691Jn.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9A(String str, Map<String, String> map, String str2, EnumC0686Ji enumC0686Ji) {
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(enumC0686Ji).A02(EnumC0687Jj.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9B(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A0K).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9F(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A05).A02(EnumC0687Jj.A0M).A06(C0694Jq.A0A(str, EnumC0691Jn.A0Z)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9H(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A0N).A06(C0694Jq.A0A(str, EnumC0691Jn.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9J(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9K(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A05).A02(EnumC0687Jj.A0O).A06(C0694Jq.A0A(str, EnumC0691Jn.A0e)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9L(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A0S).A06(C0694Jq.A0A(str, EnumC0691Jn.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9M(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A04).A02(EnumC0687Jj.A0R).A06(C0694Jq.A0A(str, EnumC0691Jn.A0h)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9N(String str, Map<String, String> map) {
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A05).A02(EnumC0687Jj.A0T).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void A9P(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0680Jc().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0686Ji.A05).A02(EnumC0687Jj.A0U).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0684Jg
    public final void ADA(String str) {
        new RF(this.A00).execute(str);
    }
}
