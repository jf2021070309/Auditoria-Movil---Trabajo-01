package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Pk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0838Pk {
    public final AnonymousClass19 A00;
    public final C1I A01;
    public final C1M A02;
    public final C1U A03;
    public final C1046Xo A04;
    public final C0692Jo A05;
    public static String[] A06 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A09 = (int) (C0739Lm.A00 * 4.0f);
    public static final int A07 = (int) (C0739Lm.A00 * 72.0f);
    public static final int A08 = (int) (C0739Lm.A00 * 8.0f);

    public C0838Pk(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, AnonymousClass18 anonymousClass18) {
        this.A04 = c1046Xo;
        this.A05 = new C0692Jo(anonymousClass18.A0T(), interfaceC0684Jg);
        this.A00 = anonymousClass18.A0M();
        this.A01 = anonymousClass18.A0N().A0E();
        this.A03 = anonymousClass18.A0Q();
        this.A02 = anonymousClass18.A0N().A0G();
    }

    private View A00() {
        F6 f6 = new F6(this.A04);
        f6.setLayoutManager(new c0(this.A04, 0, false));
        f6.setAdapter(new C0892Rm(this.A04, this.A02.A00(), A09));
        return f6;
    }

    private View A01(@Nullable View$OnClickListenerC0923Sr view$OnClickListenerC0923Sr) {
        OW ow = new OW(this.A04, this.A00.A01(), true, false, false);
        ow.A01(this.A01.A06(), this.A01.A01(), null, false, true);
        ow.setAlignment(17);
        OQ oq = new OQ(this.A04);
        ML.A0M(oq, 0);
        oq.setRadius(50);
        new AsyncTaskC0925St(oq, this.A04).A04().A07(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i2 = A07;
        linearLayout.addView(oq, new LinearLayout.LayoutParams(i2, i2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i3 = A08;
        layoutParams.setMargins(0, i3, 0, i3);
        linearLayout.addView(ow, layoutParams);
        if (view$OnClickListenerC0923Sr != null) {
            ML.A0J(view$OnClickListenerC0923Sr);
            linearLayout.addView(view$OnClickListenerC0923Sr, layoutParams);
            if (TextUtils.isEmpty(view$OnClickListenerC0923Sr.getText())) {
                ML.A0H(view$OnClickListenerC0923Sr);
            }
        }
        return linearLayout;
    }

    private final EnumC0837Pj A02() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC0837Pj.A04;
        }
        EnumC0837Pj enumC0837Pj = EnumC0837Pj.A03;
        String[] strArr = A06;
        if (strArr[3].charAt(8) != strArr[7].charAt(8)) {
            A06[4] = "qwlEjiYhEcV8j1J";
            return enumC0837Pj;
        }
        throw new RuntimeException();
    }

    public final Pair<EnumC0837Pj, View> A03(@Nullable View$OnClickListenerC0923Sr view$OnClickListenerC0923Sr) {
        View A00;
        EnumC0837Pj A02 = A02();
        if (C0836Pi.A00[A02.ordinal()] != 1) {
            A00 = A01(view$OnClickListenerC0923Sr);
        } else {
            A00 = A00();
        }
        C0694Jq.A04(A00, this.A05, EnumC0691Jn.A0S);
        return new Pair<>(A02, A00);
    }
}
