package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.8I  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8I extends SF {
    public static byte[] A0K;
    public static String[] A0L = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    @Nullable
    public OZ A00;
    public C0839Pl A01;
    @Nullable
    public EnumC0853Pz A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass57 A09;
    public final Q8 A0A;
    public final AnonymousClass88 A0B;
    public final N0 A0C;
    public final AbstractC0775My A0D;
    public final ME A0E;
    public final LF A0F;
    public final L2 A0G;
    public final L0 A0H;
    public final C0690Jm A0I;
    public final C0665In A0J;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0K = new byte[]{-3, 21, 7, 5, 21, -1, -38, -51, -56, -55, -45};
    }

    static {
        A08();
    }

    public C8I(C1046Xo c1046Xo, NC nc, InterfaceC0684Jg interfaceC0684Jg, AnonymousClass18 anonymousClass18, C7U c7u, InterfaceC0761Mk interfaceC0761Mk) {
        super(c1046Xo, nc, interfaceC0684Jg, anonymousClass18, c7u, interfaceC0761Mk);
        this.A09 = new S8(this);
        this.A0G = new L2() { // from class: com.facebook.ads.redexgen.X.8v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(L3 l3) {
                C8I.this.A07 = true;
            }
        };
        this.A0F = new LF() { // from class: com.facebook.ads.redexgen.X.8Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(C0731Le c0731Le) {
                C8I.this.A08 = true;
                C8I.this.A0P();
            }
        };
        this.A0E = new ME() { // from class: com.facebook.ads.redexgen.X.8N
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            public final /* bridge */ /* synthetic */ void A03(AnonymousClass85 anonymousClass85) {
            }
        };
        this.A0H = new L0() { // from class: com.facebook.ads.redexgen.X.8L
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass84 anonymousClass84) {
                OZ oz;
                C8I.this.A0F(anonymousClass84);
                C8I.this.A0E(anonymousClass84);
                oz = C8I.this.A00;
                oz.A0A(anonymousClass84);
            }
        };
        this.A0C = new N0() { // from class: com.facebook.ads.redexgen.X.8K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(AnonymousClass86 anonymousClass86) {
                Q8 q8;
                C8I c8i = C8I.this;
                q8 = c8i.A0A;
                c8i.A0D(anonymousClass86, q8.getState() != EnumC0866Qm.A06, false);
            }
        };
        this.A0D = new C8J(this);
        boolean z = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        this.A0A = new Q8(super.A03);
        this.A0A.setFunnelLoggingHandler(super.A05);
        this.A0A.getEventBus().A03(this.A0G, this.A0F, this.A0E, this.A0H, this.A0C, this.A0D);
        this.A0B = new AnonymousClass88(super.A03, super.A04, this.A0A, super.A01.A0T());
        this.A01 = new C0839Pl(super.A03, super.A09, super.A01.A0Z(), interfaceC0761Mk);
        this.A0I = new C0690Jm(super.A03, super.A05);
        this.A0J = new C0665In(super.A03);
        A07();
        this.A0A.setVideoURI(super.A02.A0Q(super.A01.A0N().A0D().A08()));
        A05();
        int A03 = super.A01.A0N().A0D().A03();
        if (JQ.A1Y(super.A03)) {
            this.A05 = A03 == 0;
        } else {
            this.A05 = A03 <= 0;
        }
        if (super.A01.A0N().A0M() && super.A01.A0N().A0D().A02() > 0) {
            z = true;
        }
        this.A03 = z;
        ML.A0M(this, super.A01.A0M().A01().A07(true));
        if (JQ.A1S(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private OZ A00(int i2) {
        return C0803Oa.A00(new C0805Oc(super.A03, super.A04, super.A08, super.A01, this.A0A, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i2).A0F(this.A0I).A0I(this.A0J).A0J(), null, true);
    }

    private void A04() {
        this.A0A.postDelayed(new S7(this), JQ.A0I(super.A03));
    }

    private void A05() {
        this.A0A.postDelayed(new S6(this), JQ.A0J(super.A03));
    }

    private void A06() {
        this.A05 = true;
        OZ oz = this.A00;
        if (oz != null) {
            oz.A0Z();
        }
    }

    private void A07() {
        this.A0A.A0c(this.A0J);
        this.A0A.A0c(this.A0I);
        if (!TextUtils.isEmpty(super.A01.A0N().A0D().A07())) {
            C04087m c04087m = new C04087m(super.A03);
            this.A0A.A0c(c04087m);
            c04087m.setImage(super.A01.A0N().A0D().A07());
        }
        C03896p c03896p = new C03896p(super.A03, true, super.A05);
        this.A0A.A0c(c03896p);
        this.A0A.A0c(new KM(c03896p, QC.A03, true));
        this.A0A.A0c(new C04027c(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(AnonymousClass86 anonymousClass86, boolean z, boolean z2) {
        if (this.A06) {
            return;
        }
        if (A0L[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        OZ oz = this.A00;
        if (oz != null) {
            oz.A09(anonymousClass86);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z, z2);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(AnonymousClass84 anonymousClass84) {
        if (this.A0A.getState() == EnumC0866Qm.A02 && JQ.A0z(super.A03)) {
            this.A0A.postDelayed(new S9(this, anonymousClass84), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(AnonymousClass84 anonymousClass84) {
        int A00 = anonymousClass84.A00();
        if (this.A03) {
            int A02 = super.A01.A0N().A0D().A02() - (A00 / 1000);
            if (A02 > 0) {
                super.A07.setToolbarActionMessage(super.A01.A0R().A00().replace(A03(0, 6, 74), String.valueOf(A02)));
            } else {
                super.A07.setToolbarActionMessage(A03(0, 0, 25));
                A0H(false, false);
            }
        }
        float min = A00 / Math.min(super.A01.A0N().A0D().A03() * 1000.0f, this.A0A.getDuration());
        super.A07.setProgress(100.0f * min);
        if (min >= 1.0f && !this.A05) {
            A06();
            String[] strArr = A0L;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
            strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
            super.A07.setToolbarActionMode(getCloseButtonStyle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(String str) {
        int i2 = 0;
        int i3 = 0;
        Q8 q8 = this.A0A;
        if (q8 != null) {
            i2 = q8.getCurrentPositionInMillis();
            i3 = this.A0A.getDuration();
        }
        super.A03.A06().A8y(A03(6, 5, 12), C04398z.A2O, new AnonymousClass90(str));
        if (JQ.A10(super.A03)) {
            A0D(new AnonymousClass86(i2, i3), false, true);
            return;
        }
        InterfaceC0761Mk interfaceC0761Mk = super.A08;
        if (A0L[3].charAt(0) == 'z') {
            throw new RuntimeException();
        }
        A0L[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        interfaceC0761Mk.A3r(super.A09.A6Y());
        super.A08.A3r(super.A09.A6T());
    }

    private synchronized void A0H(boolean z, boolean z2) {
        if (this.A03 && !z && !z2) {
            super.A08.A3r(super.A09.A5Z());
            this.A01.A05();
            this.A03 = false;
            if (this.A00 != null) {
                this.A00.A0X();
            }
            return;
        }
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final void A0Q() {
        ML.A0L(this.A00);
        ML.A0L(super.A07);
        this.A0A.setVolume(super.A01.A0N().A0D().A09() ? 0.0f : 1.0f);
        this.A0A.A0b(EnumC0853Pz.A02, 20);
        OZ oz = this.A00;
        if (oz != null && this.A03) {
            oz.A0Y();
        }
        OZ oz2 = this.A00;
        if (oz2 != null && !this.A05) {
            oz2.A0a();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final void A0S(AnonymousClass59 anonymousClass59) {
        anonymousClass59.A0K(this.A09);
        this.A00 = A00(anonymousClass59.A0H().getResources().getConfiguration().orientation);
        addView(this.A00, SF.A0D);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        ML.A0H(this.A00);
        ML.A0H(super.A07);
        OZ oz = this.A00;
        setUpFullscreenMode(oz != null && oz.A0c());
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final boolean A0T() {
        OZ oz = this.A00;
        return oz != null && oz.A0d(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void ABg(boolean z) {
        if (this.A0A.A0i()) {
            return;
        }
        this.A02 = this.A0A.getVideoStartReason();
        this.A04 = z;
        this.A0A.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AC5(boolean z) {
        if (this.A0A.A0j() || this.A06 || this.A0A.getState() == EnumC0866Qm.A06 || this.A02 == null) {
            return;
        }
        if (!this.A04 || z) {
            Q8 q8 = this.A0A;
            EnumC0853Pz enumC0853Pz = this.A02;
            String[] strArr = A0L;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0L[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            q8.A0b(enumC0853Pz, 19);
        }
    }

    private int getCloseButtonStyle() {
        OZ oz = this.A00;
        if (oz != null) {
            return oz.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.SF, com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void onDestroy() {
        super.onDestroy();
        if (JQ.A1F(super.A03)) {
            super.A03.A09().AFK(this.A0A);
        }
        OZ oz = this.A00;
        if (oz != null) {
            oz.A0W();
        }
        Q8 q8 = this.A0A;
        if (q8 != null) {
            if (!this.A06) {
                q8.A0a(EnumC0848Pu.A05);
            }
            this.A0A.getEventBus().A04(this.A0G, this.A0F, this.A0E, this.A0H, this.A0C, this.A0D);
            this.A0A.A0V();
        }
        this.A0B.A0g();
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C0839Pl c0839Pl) {
        this.A01 = c0839Pl;
    }
}
