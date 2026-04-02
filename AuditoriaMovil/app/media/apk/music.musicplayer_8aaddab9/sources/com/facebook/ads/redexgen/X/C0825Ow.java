package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Ow  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0825Ow extends FrameLayout {
    public static byte[] A0K;
    public static String[] A0L = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};
    @Nullable
    public EnumC0853Pz A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass18 A05;
    public final C7U A06;
    public final C1046Xo A07;
    public final C0692Jo A08;
    public final InterfaceC0761Mk A09;
    public final NC A0A;
    public final InterfaceC0824Ov A0B;
    public final Q8 A0C;
    public final AnonymousClass88 A0D;
    public final N0 A0E;
    public final AbstractC0775My A0F;
    public final ME A0G;
    public final LF A0H;
    public final L2 A0I;
    public final L0 A0J;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0K = new byte[]{5, 19, 20, 20, 3, 8, 18, 50, 15, 11, 3, 78, 95, 88, 75, 94, 67, 69, 68, 95, 71, 70, 87, 86, 98, 115, 103, 97, 119, 118, 80, 107, 71, 97, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37, 88, 71, 74, 75, 65};
    }

    static {
        A0C();
    }

    public C0825Ow(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, AnonymousClass18 anonymousClass18, C7U c7u, C0692Jo c0692Jo, InterfaceC0761Mk interfaceC0761Mk, NC nc, InterfaceC0824Ov interfaceC0824Ov) {
        super(c1046Xo);
        this.A0I = new L2() { // from class: com.facebook.ads.redexgen.X.9Z
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 5);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{16, 18, 5, 16, 1, 18, 5, 4};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A02 */
            public final void A03(L3 l3) {
                InterfaceC0824Ov interfaceC0824Ov2;
                JSONObject A03;
                C0825Ow.this.A03 = true;
                interfaceC0824Ov2 = C0825Ow.this.A0B;
                A03 = C0825Ow.this.A03();
                interfaceC0824Ov2.ACg(A00(0, 8, 101), A03);
            }
        };
        this.A0H = new LF() { // from class: com.facebook.ads.redexgen.X.9E
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{65, 93, 80, 72};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A02 */
            public final void A03(C0731Le c0731Le) {
                InterfaceC0824Ov interfaceC0824Ov2;
                JSONObject A03;
                C0825Ow.this.A04 = true;
                interfaceC0824Ov2 = C0825Ow.this.A0B;
                A03 = C0825Ow.this.A03();
                interfaceC0824Ov2.ACg(A00(0, 4, 62), A03);
            }
        };
        this.A0G = new ME() { // from class: com.facebook.ads.redexgen.X.9D
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 93);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{28, 13, 25, 31, 9};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A02 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                InterfaceC0824Ov interfaceC0824Ov2;
                JSONObject A03;
                interfaceC0824Ov2 = C0825Ow.this.A0B;
                A03 = C0825Ow.this.A03();
                interfaceC0824Ov2.ACg(A00(0, 5, 49), A03);
            }
        };
        this.A0J = new L0() { // from class: com.facebook.ads.redexgen.X.9C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass84 anonymousClass84) {
                C0825Ow.this.A0H(anonymousClass84);
                C0825Ow.this.A0A();
            }
        };
        this.A0E = new N0() { // from class: com.facebook.ads.redexgen.X.9B
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 77);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{20, 32, 30, 33, 29, 22, 37, 22, 21};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A02 */
            public final void A03(AnonymousClass86 anonymousClass86) {
                InterfaceC0824Ov interfaceC0824Ov2;
                Q8 q8;
                JSONObject A04;
                C0825Ow.this.A07();
                interfaceC0824Ov2 = C0825Ow.this.A0B;
                C0825Ow c0825Ow = C0825Ow.this;
                q8 = c0825Ow.A0C;
                A04 = c0825Ow.A04(q8.getDuration());
                interfaceC0824Ov2.ACg(A00(0, 9, 100), A04);
            }
        };
        this.A0F = new C9A(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c1046Xo;
        this.A05 = anonymousClass18;
        this.A06 = c7u;
        this.A08 = c0692Jo;
        this.A09 = interfaceC0761Mk;
        this.A0A = nc;
        this.A0C = new Q8(c1046Xo);
        this.A0B = interfaceC0824Ov;
        this.A0C.setFunnelLoggingHandler(c0692Jo);
        this.A0C.getEventBus().A03(this.A0I, this.A0H, this.A0G, this.A0J, this.A0E, this.A0F);
        this.A0D = new AnonymousClass88(c1046Xo, interfaceC0684Jg, this.A0C, anonymousClass18.A0T());
        A0B();
        this.A0C.setVideoURI(this.A06.A0Q(this.A05.A0N().A0D().A08()));
        A09();
        ML.A0M(this, this.A05.A0M().A01().A07(true));
        String A07 = anonymousClass18.A0N().A0D().A07();
        if (!TextUtils.isEmpty(A07)) {
            OX.A00(c1046Xo, this, A07);
        }
        addView(this.A0C, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0C.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i2);
            jSONObject.put(A02(11, 8, 12), this.A0C.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0C.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0C.A0j());
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0L[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0C.postDelayed(new SQ(this), JQ.A0I(this.A07));
    }

    private void A09() {
        this.A0C.postDelayed(new SP(this), JQ.A0J(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.ACg(A02(36, 8, SyslogConstants.LOG_ALERT), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0N().A0D().A07())) {
            C04087m c04087m = new C04087m(this.A07);
            this.A0C.A0c(c04087m);
            c04087m.setImage(this.A05.A0N().A0D().A07());
        }
        C03896p c03896p = new C03896p(this.A07, true, this.A08);
        this.A0C.A0c(c03896p);
        this.A0C.A0c(new KM(c03896p, QC.A03, true));
        this.A0C.A0c(new C04027c(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(AnonymousClass84 anonymousClass84) {
        if (this.A0C.getState() == EnumC0866Qm.A02 && JQ.A0z(this.A07)) {
            this.A0C.postDelayed(new SO(this, anonymousClass84), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A06().A8y(A02(44, 5, 8), C04398z.A2O, new AnonymousClass90(str));
        if (JQ.A10(this.A07)) {
            A07();
            return;
        }
        InterfaceC0761Mk interfaceC0761Mk = this.A09;
        NC nc = this.A0A;
        String[] strArr = A0L;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC0761Mk.A3r(nc.A6Y());
        this.A09.A3r(this.A0A.A6T());
    }

    public final void A0N() {
        this.A0C.setVolume(this.A05.A0N().A0D().A09() ? 0.0f : 1.0f);
        this.A0C.A0b(EnumC0853Pz.A02, 26);
        A08();
    }

    public final void A0O() {
        Q8 q8 = this.A0C;
        if (q8 != null) {
            if (!this.A02) {
                q8.A0a(EnumC0848Pu.A03);
            }
            this.A0C.getEventBus().A04(this.A0I, this.A0H, this.A0G, this.A0J, this.A0E, this.A0F);
            this.A0C.A0V();
        }
        this.A0D.A0g();
    }

    public final void A0P() {
        this.A0C.A0Z(9);
        ML.A0T(this);
        ML.A0H(this.A0C);
        ML.A0Z(this.A0C);
    }

    public final void A0Q() {
        this.A0C.A0a(EnumC0848Pu.A04);
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0C.setVolume(0.0f);
        } else {
            this.A0C.setVolume(1.0f);
        }
        A0A();
        if (A0L[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0L[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z) {
        if (this.A0C.A0i()) {
            return;
        }
        this.A00 = this.A0C.getVideoStartReason();
        this.A01 = z;
        this.A0C.A0e(false, 19);
    }

    public final void A0T(boolean z) {
        if (this.A0C.A0j() || this.A02 || this.A0C.getState() == EnumC0866Qm.A06 || this.A00 == null) {
            return;
        }
        boolean z2 = this.A01;
        if (A0L[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z2 || z) {
            this.A0C.A0b(this.A00, 27);
        }
    }

    public final void A0U(boolean z) {
        this.A0C.A0e(z, 18);
    }

    public final void A0V(boolean z) {
        this.A0C.A0b(EnumC0853Pz.A04, 25);
    }
}
