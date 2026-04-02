package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public final class A6 extends AbstractC0918Sm implements N1 {
    public static byte[] A0D;
    public static String[] A0E = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    @Nullable
    public View A00;
    public View A01;
    public C1046Xo A02;
    @Nullable
    public AbstractC0760Mj A03;
    public C0838Pk A04;
    @Nullable
    public IH A05;
    public boolean A06;
    public final InterfaceC0761Mk A07;
    public final ON A08;
    public final OO A09;
    public final Q8 A0A;
    public final C0665In A0B;
    public final AtomicBoolean A0C;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A07();
    }

    public A6(C0806Od c0806Od) {
        super(c0806Od, false);
        this.A0C = new AtomicBoolean(false);
        this.A06 = false;
        this.A02 = c0806Od.A05();
        this.A03 = c0806Od.A08();
        this.A01 = new View(this.A02);
        ML.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A04();
        this.A07 = c0806Od.A09();
        OX.A00(c0806Od.A05(), this, getAdInfo().A0D().A07());
        this.A0A = A00(c0806Od);
        getAdDetailsView().bringToFront();
        this.A0B = A01(c0806Od);
        A0f();
        this.A04 = new C0838Pk(this.A02, c0806Od.A06(), getAdDataBundle());
        this.A08 = new C0916Sk(this);
        this.A09 = new OO(c0806Od, getAdDataBundle(), this.A0A, this.A0B, getAdDetailsView(), this.A07, this.A08);
    }

    private Q8 A00(C0806Od c0806Od) {
        Q8 q8 = (Q8) c0806Od.A02();
        int A0e = A0e(c0806Od.A08());
        ImageView imageView = (ImageView) c0806Od.A03();
        imageView.setPadding(AbstractC0918Sm.A0D, AbstractC0918Sm.A0D, AbstractC0918Sm.A0D, AbstractC0918Sm.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0918Sm.A0E, AbstractC0918Sm.A0E);
        layoutParams.setMargins(0, A0e, AbstractC0918Sm.A0C, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(q8, layoutParams2);
        q8.addView(imageView, layoutParams);
        return q8;
    }

    private C0665In A01(C0806Od c0806Od) {
        C0665In A0A = c0806Od.A0A();
        A0A.A06(-1, AbstractC0918Sm.A09);
        A0A.setPadding(AbstractC0918Sm.A0H, AbstractC0918Sm.A0H, AbstractC0918Sm.A0H, AbstractC0918Sm.A0H);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC0918Sm.A0G);
        layoutParams.addRule(12);
        addView(A0A, layoutParams);
        return A0A;
    }

    private void A03() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0A.A0d(getAnimationPlugin());
        }
    }

    private void A04() {
        AbstractC0760Mj abstractC0760Mj = this.A03;
        if (abstractC0760Mj == null) {
            return;
        }
        this.A05 = new IH(abstractC0760Mj, 400, -abstractC0760Mj.getToolbarHeight(), 0);
    }

    private void A05() {
        new C0692Jo(getAdDataBundle().A0T(), getAdEventManager()).A02(EnumC0691Jn.A0p, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0C.set(true);
        ML.A0T(this);
        ML.A0H(this.A0A);
        ML.A0Z(this.A0A, this.A0B, this.A09, this.A00);
        ML.A0L(this.A03);
        C0838Pk c0838Pk = this.A04;
        View$OnClickListenerC0923Sr ctaButton = getCtaButton();
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0E[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<EnumC0837Pj, View> A03 = c0838Pk.A03(ctaButton);
        this.A00 = (View) A03.second;
        int i2 = C0807Oe.A00[((EnumC0837Pj) A03.first).ordinal()];
        if (i2 == 1) {
            getAdDetailsView().setVisibility(0);
            RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
            screenshotParams.setMargins(0, A0e(this.A03), 0, 0);
            screenshotParams.addRule(2, getAdDetailsView().getId());
            addView(this.A00, screenshotParams);
        } else if (i2 != 2) {
        } else {
            ML.A0Z(getAdDetailsView());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(AbstractC0918Sm.A0F, AbstractC0918Sm.A0F, AbstractC0918Sm.A0F, AbstractC0918Sm.A0F);
            addView(this.A00, layoutParams);
        }
    }

    private void A06() {
        IH ih = this.A05;
        if (ih != null) {
            ih.A3L(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3L(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final void A09(AnonymousClass86 anonymousClass86) {
        super.A09(anonymousClass86);
        A05();
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final void A0A(AnonymousClass84 anonymousClass84) {
        super.A0A(anonymousClass84);
        int duration = this.A0A.getDuration() - anonymousClass84.A00();
        if (getAnimationPlugin() != null) {
            int remainingVideoTimeInMillis = A0E[1].charAt(18);
            if (remainingVideoTimeInMillis != 51) {
                throw new RuntimeException();
            }
            A0E[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final void A0W() {
        super.A0W();
        A03();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0918Sm, com.facebook.ads.redexgen.X.OZ
    public final void A0b(C1B c1b, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d2, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A02(0, 31, 118), false)) {
            A06();
        }
        if (bundle.getBoolean(A02(55, 18, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT), false)) {
            A05();
        }
        if (bundle.getBoolean(A02(31, 24, 116), false)) {
            OO oo = this.A09;
            if (A0E[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            oo.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0d(boolean z) {
        if (z && !this.A06) {
            boolean z2 = this.A0C.get();
            String[] strArr = A0E;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0E;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z2) {
                    this.A09.A07(this);
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0O = getAdInfo().A0O();
        if (A0E[5].charAt(17) != 'k') {
            A0E[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0O && !this.A0C.get()) {
                this.A0A.A0a(EnumC0848Pu.A08);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0918Sm
    public final void A0f() {
        super.A0f();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A8o(this.A0A);
        }
    }

    public final boolean A0g() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0g() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0918Sm, com.facebook.ads.redexgen.X.OZ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
