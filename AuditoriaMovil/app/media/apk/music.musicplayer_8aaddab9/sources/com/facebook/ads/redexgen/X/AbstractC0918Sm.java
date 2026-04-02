package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Sm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0918Sm extends OZ {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public KV A00;
    @Nullable
    public IU A01;
    public IH A02;
    public final AnonymousClass18 A03;
    public final C1B A04;
    public final OD A05;

    public static String A0A(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{9, 5, 7, 68, 12, 11, 9, 15, 8, 5, 5, 1, 68, 11, 14, 25, 68, 3, 4, 30, 15, 24, 25, 30, 3, 30, 3, 11, 6, 68, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0B();
        A0B = (int) (C0739Lm.A00 * 48.0f);
        A0F = (int) (C0739Lm.A00 * 16.0f);
        A08 = (int) (C0739Lm.A00 * 4.0f);
        A0E = (int) (C0739Lm.A00 * 44.0f);
        A0C = (int) (C0739Lm.A00 * 8.0f);
        A0D = (int) (C0739Lm.A00 * 12.0f);
        A0H = (int) (C0739Lm.A00 * 12.0f);
        A0G = (int) (C0739Lm.A00 * 26.0f);
        A09 = C2U.A01(-1, 77);
        A0A = C2U.A01(A09, 90);
    }

    public AbstractC0918Sm(C0806Od c0806Od, boolean z) {
        super(c0806Od, z);
        this.A03 = c0806Od.A04();
        this.A04 = this.A03.A0N();
        this.A05 = A09(c0806Od);
        AbstractC0760Mj A082 = c0806Od.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    private OD A09(C0806Od c0806Od) {
        String A0A2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c0806Od.A04().A0X().equals(A0A(37, 14, 56))) {
            A0A2 = Q2.A04.A02();
        } else {
            A0A2 = A0A(0, 37, 124);
        }
        C0919Sn c0919Sn = new C0919Sn(c0806Od.A05(), A0B, this.A04.A0E().A00() == C1G.A05, getColors(), this.A04.A0F().A06(), A0A2, c0806Od.A06(), c0806Od.A09(), c0806Od.A0B(), c0806Od.A07());
        this.A02 = new IH(c0919Sn, 400, 100, 0);
        ML.A0K(c0919Sn);
        c0919Sn.A0A(c0806Od.A00());
        addView(c0919Sn, layoutParams);
        return c0919Sn;
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public void A0b(C1B c1b, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d2, bundle);
        this.A05.setInfo(c1b.A0E(), c1b.A0F(), str, this.A03.A0Q().A01(), null);
    }

    public final int A0e(@Nullable AbstractC0760Mj abstractC0760Mj) {
        return abstractC0760Mj == null ? AbstractC0760Mj.A00 : abstractC0760Mj.getToolbarHeight();
    }

    public void A0f() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new KV(true);
            IU iu = this.A01;
            if (iu != null) {
                KV kv = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                A07[7] = "KTvg88bTO6HmKn15GgbH1";
                kv.A0I(iu);
            }
            C1K A01 = this.A03.A0M().A01();
            this.A00.A0I(new II(getAdDetailsView().getCTAButton(), 300, -1, A01.A09(true)));
            this.A00.A0I(new IX(getAdDetailsView().getCTAButton(), 300, ML.A08(A09, A0A, A08), ML.A05(A01.A08(true), A08)));
            this.A00.A0I(new IS(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    public AnonymousClass18 getAdDataBundle() {
        return this.A03;
    }

    public IH getAdDetailsAnimation() {
        return this.A02;
    }

    public OD getAdDetailsView() {
        return this.A05;
    }

    public C1B getAdInfo() {
        return this.A04;
    }

    public KV getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.OZ, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0A(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        IU iu = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (iu == null) {
            this.A01 = new IU(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A00.A0I(this.A01);
            this.A00.A0G();
        }
    }
}
