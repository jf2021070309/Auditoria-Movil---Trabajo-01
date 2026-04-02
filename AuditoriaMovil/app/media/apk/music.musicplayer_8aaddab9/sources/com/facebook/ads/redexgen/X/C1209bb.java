package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.bb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1209bb extends AbstractC02360o {
    public static byte[] A03;
    @Nullable
    public View A00;
    public final AnonymousClass54 A01;
    public final E5 A02;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public C1209bb(AnonymousClass54 anonymousClass54) {
        this.A02 = anonymousClass54.A09();
        this.A01 = anonymousClass54;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0C() {
        this.A02.A0D().A3c();
        C0725Ky.A00(new C1211bd(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0D() {
        this.A02.A0D().A3f();
        C0725Ky.A00(new C1210bc(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0D().A3e();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C0927Sv) {
                KN.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            FN A08 = this.A01.A08();
            if (A08 != null) {
                A08.A0F();
            }
            C0725Ky.A00(new C1212be(this));
            AnonymousClass54 anonymousClass54 = this.A01;
            anonymousClass54.A0B(anonymousClass54.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && JQ.A0u(this.A01.A07().getContext())) {
                final O8 o8 = new O8();
                this.A01.A0D(o8);
                o8.A0C(this.A01.getPlacementId());
                o8.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0D() != null) {
                    o8.A09(this.A01.A08().A0D().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C0927Sv) {
                    o8.A0A(((C0927Sv) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5D
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = C1209bb.this.A00;
                        if (view4 != null) {
                            O8 o82 = o8;
                            view5 = C1209bb.this.A00;
                            int width = view5.getWidth();
                            view6 = C1209bb.this.A00;
                            o82.setBounds(0, 0, width, view6.getHeight());
                            O8 o83 = o8;
                            o83.A0D(!o83.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(o8);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0F(InterfaceC02350n interfaceC02350n) {
        this.A02.A0D().A3d(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0G(KG kg) {
        this.A02.A0D().A2a(MC.A01(this.A01.A04()), kg.A03().getErrorCode(), kg.A04());
        C0725Ky.A00(new C1213bf(this, kg));
    }
}
