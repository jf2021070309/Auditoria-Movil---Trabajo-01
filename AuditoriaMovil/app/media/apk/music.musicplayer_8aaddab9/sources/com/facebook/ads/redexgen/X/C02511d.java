package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.1d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02511d {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    @Nullable
    public C7U A00;
    public OB A01 = OB.A06;
    @Nullable
    @DoNotStrip
    public P4 A02;
    public final C1298d8 A03;
    public final InterfaceC02501c A04;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50};
    }

    static {
        A07();
    }

    public C02511d(C1046Xo c1046Xo, C02651r c02651r, InterfaceC02501c interfaceC02501c, @Nullable String str) {
        this.A03 = A02(c1046Xo, c02651r, str, c02651r.A03());
        this.A04 = interfaceC02501c;
    }

    @Nullable
    private AdError A00(C1046Xo c1046Xo) {
        if (this.A03.A0b().isEmpty()) {
            c1046Xo.A06().A8y(A06(62, 3, 18), C04398z.A0R, new AnonymousClass90(A06(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1298d8 A02(C1046Xo c1046Xo, C02651r c02651r, @Nullable String str, JSONObject jSONObject) {
        C1298d8 adDataBundle = C1298d8.A01(jSONObject, c1046Xo);
        adDataBundle.A0g(str);
        C9I A01 = c02651r.A01();
        if (A01 != null) {
            adDataBundle.A0d(A01.A06());
        }
        return adDataBundle;
    }

    private C7U A04(C1046Xo c1046Xo) {
        C7U c7u = this.A00;
        return c7u != null ? c7u : new C7U(c1046Xo);
    }

    private void A08(C1046Xo c1046Xo) {
        C1W A062 = this.A03.A0N().A0D().A06();
        A0A(A062 != null ? A062.A0A() : OB.A06);
        C1289cz c1289cz = new C1289cz(this);
        C7U c7u = new C7U(c1046Xo);
        boolean z = JQ.A1P(c1046Xo) && C03555g.A0A(this.A03.A0c());
        String[] strArr = A06;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "rsw451NGt86";
        strArr2[2] = "Yd4DtCWl7E1Fg10XBidxjBNo2K";
        if (z) {
            C03555g c03555g = new C03555g(c7u, this.A03.A0c(), this.A03.A0X(), this.A03.A0Y(), z, new C1288cy(this));
            C0692Jo funnelLoggingHandler = new C0692Jo(this.A03.A0T(), c1046Xo.A08());
            c7u.A0b(funnelLoggingHandler);
            c03555g.A0B();
            return;
        }
        C1298d8 c1298d8 = this.A03;
        String[] strArr3 = A06;
        if (strArr3[1].charAt(24) != strArr3[0].charAt(24)) {
            C02611n.A02(c1046Xo, c1298d8, true, c1289cz);
            return;
        }
        String[] strArr4 = A06;
        strArr4[6] = "NvwaqOE8NtZ";
        strArr4[2] = "Mi75BUZiVIPk9FHJPOQQgiG4jh";
        C02611n.A02(c1046Xo, c1298d8, true, c1289cz);
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x00c9 */
    /* JADX WARN: Incorrect condition in loop: B:21:0x0112 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09(com.facebook.ads.redexgen.X.C1046Xo r21, java.util.EnumSet<com.facebook.ads.CacheFlag> r22) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02511d.A09(com.facebook.ads.redexgen.X.Xo, java.util.EnumSet):void");
    }

    private void A0A(OB ob) {
        this.A01 = ob;
    }

    public final AnonymousClass18 A0B() {
        return this.A03;
    }

    public final EnumC0717Kp A0C() {
        if (this.A03.A0r()) {
            return EnumC0717Kp.A03;
        }
        int size = this.A03.A0b().size();
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (size > 1) {
                return EnumC0717Kp.A07;
            }
            if (this.A03.A0N().A0D().A06() != null) {
                EnumC0717Kp enumC0717Kp = EnumC0717Kp.A09;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC0717Kp;
                }
            } else if (A0I()) {
                EnumC0717Kp enumC0717Kp2 = EnumC0717Kp.A0A;
                String[] strArr3 = A06;
                if (strArr3[6].length() != strArr3[2].length()) {
                    A06[3] = "JH";
                    return enumC0717Kp2;
                }
                throw new RuntimeException();
            } else {
                EnumC0717Kp enumC0717Kp3 = EnumC0717Kp.A08;
                if (A06[3].length() == 32) {
                    A06[3] = "ySAy4b6nQ";
                    return enumC0717Kp3;
                }
                String[] strArr4 = A06;
                strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                return enumC0717Kp3;
            }
        }
        throw new RuntimeException();
    }

    public final OB A0D() {
        return this.A01;
    }

    public final String A0E() {
        return this.A03.A0T();
    }

    public final void A0F() {
        this.A04.AFM();
    }

    public final void A0G(Intent intent, RewardData rewardData, String str) {
        this.A03.A0e(rewardData);
        this.A03.A0i(str);
        intent.putExtra(A06(48, 14, 94), this.A03);
    }

    public final void A0H(C1046Xo c1046Xo, EnumSet<CacheFlag> enumSet) {
        AdError A00 = A00(c1046Xo);
        if (A00 != null) {
            this.A04.A9s(A00);
            return;
        }
        this.A04.ADg();
        if (A0C() == EnumC0717Kp.A09) {
            A08(c1046Xo);
        } else {
            A09(c1046Xo, enumSet);
        }
    }

    public final boolean A0I() {
        return !TextUtils.isEmpty(this.A03.A0N().A0D().A08());
    }

    public final boolean A0J() {
        return this.A03.A0o();
    }
}
