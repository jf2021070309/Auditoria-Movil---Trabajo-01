package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ny  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0801Ny extends RelativeLayout {
    public static InterfaceC0761Mk A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public AbstractC1218bk A00;
    public C1046Xo A01;
    public C02440w A02;
    @Nullable
    public T2 A03;
    @Nullable
    public OP A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 119);
            i5++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, 22, 19, 25, 23, 9, 16, -60, -14, 5, 24, 13, 26, 9, -60, 26, 13, 9, 27, -60, 5, 8, 9, 20, 24, 9, 22, -60, 13, 23, 18, -53, 24, -60, 7, 22, 9, 5, 24, 9, 8, -60, 20, 22, 19, 20, 9, 22, 16, 29, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        A09 = (int) (C0739Lm.A00 * 8.0f);
        A08 = A09 * 10;
        A0A = (int) (C0739Lm.A00 * 15.0f);
        A05 = new T1();
    }

    public C0801Ny(C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A01 = c1046Xo;
        this.A02 = new C02440w(c1046Xo);
        ML.A0K(this.A02);
        this.A00 = new F7();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList<com.facebook.ads.redexgen.X.PU> A01(com.facebook.ads.redexgen.X.AnonymousClass18 r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L8:
            java.util.List r5 = r7.A0b()
            int r0 = r5.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r3 = 0
        L16:
            int r0 = r5.size()
            if (r3 >= r0) goto L31
            java.lang.Object r2 = r5.get(r3)
            com.facebook.ads.redexgen.X.1B r2 = (com.facebook.ads.redexgen.X.C1B) r2
            int r1 = r5.size()
            com.facebook.ads.redexgen.X.PU r0 = new com.facebook.ads.redexgen.X.PU
            r0.<init>(r3, r1, r2)
            r4.add(r0)
            int r3 = r3 + 1
            goto L16
        L31:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0801Ny.A01(com.facebook.ads.redexgen.X.18):java.util.ArrayList");
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(U1 u1, int i2) {
        ArrayList<PU> A01 = A01(u1.A11());
        this.A02.setCardsInfo(A01);
        this.A03 = new T2(this.A01, A01, u1.A11(), this.A01.A00().A08(), u1, A05, u1.A11().A0T(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        this.A03.A0F(i2 - A08, 16, 0);
        this.A03.A07();
        setupDotsLayout(u1, A01);
    }

    public final void A06(C0869Qp c0869Qp) {
        T2 t2 = this.A03;
        if (t2 != null) {
            t2.A0G(c0869Qp);
        } else {
            this.A01.A06().A8y(A00(51, 7, 29), C04398z.A1k, new AnonymousClass90(A00(0, 51, 45)));
        }
        this.A02.A22(c0869Qp);
    }

    public static InterfaceC0761Mk getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        T2 t2;
        if (z && (t2 = this.A03) != null) {
            t2.A0F((i4 - i2) - A08, 16, 0);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i2) {
        OP op = this.A04;
        if (op != null) {
            op.A00(i2);
        }
    }

    private void setupDotsLayout(U1 u1, ArrayList<PU> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Z(new T0(this));
        this.A04 = new OP(this.A01, u1.A11().A0M().A01(), arrayList.size());
        ML.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
