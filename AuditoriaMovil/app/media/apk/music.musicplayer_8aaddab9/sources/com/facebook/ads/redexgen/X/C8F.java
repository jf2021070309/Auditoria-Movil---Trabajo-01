package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.8F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8F extends TM {
    public static byte[] A0E;
    public static String[] A0F = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;
    @Nullable
    public LinearLayout A02;
    public C1298d8 A03;
    public C7U A04;
    @Nullable
    public C2M A05;
    @Nullable
    public OP A06;
    public S1 A07;
    @DoNotStrip
    public AbstractC0868Qo A08;
    public C0869Qp A09;
    public String A0A;
    public List<PU> A0B;
    public final C1046Xo A0C;
    public final MD A0D;

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0F;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 74);
            i5++;
        }
    }

    public static void A09() {
        A0E = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114};
    }

    static {
        A09();
        A0G = (int) (C0739Lm.A00 * 48.0f);
        A0H = (int) (C0739Lm.A00 * 8.0f);
        A0I = (int) (C0739Lm.A00 * 8.0f);
        A0K = (int) (C0739Lm.A00 * 56.0f);
        A0J = (int) (C0739Lm.A00 * 12.0f);
    }

    public C8F(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, C7U c7u, InterfaceC0761Mk interfaceC0761Mk, C1298d8 c1298d8) {
        super(c1046Xo, interfaceC0684Jg, interfaceC0761Mk, c1298d8);
        this.A0D = new MD();
        this.A04 = c7u;
        this.A0C = c1046Xo;
    }

    private final void A0A() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2M c2m = this.A05;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A05 = null;
        }
        OP op = this.A06;
        if (op != null) {
            op.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011f, code lost:
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0121, code lost:
        r4.A0C.A09().AFT(r4.A05, ((com.facebook.ads.redexgen.X.TM) r4).A08.A0T(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0132, code lost:
        r4.A0U(r4.A02, false, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0137, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
        if (r5 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0B(int r18, @androidx.annotation.Nullable android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C8F.A0B(int, android.os.Bundle):void");
    }

    private void A0C(C1298d8 c1298d8) {
        this.A03 = c1298d8;
        this.A0A = this.A03.A0T();
        this.A00 = this.A03.A0H();
        this.A01 = this.A03.A0I();
        List<C1B> A0b = this.A03.A0b();
        this.A0B = new ArrayList(A0b.size());
        for (int i2 = 0; i2 < A0b.size(); i2++) {
            this.A0B.add(new PU(i2, A0b.size(), A0b.get(i2)));
        }
    }

    private void A0D(S1 s1) {
        new F7().A0G(this.A05);
        s1.A0Z(new C0897Rr(this));
        this.A06 = new OP(this.A0C, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.TM
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        A0V(anonymousClass59);
        A0C((C1298d8) intent.getSerializableExtra(A07(0, 14, 93)));
        A0B(anonymousClass59.A0H().getResources().getConfiguration().orientation, bundle);
        anonymousClass59.A0K(new C0896Rq(this, anonymousClass59));
        int A03 = super.A08.A0N().A0D().A03();
        if (A03 > 0) {
            A0T(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TM, com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void ABg(boolean z) {
        super.ABg(z);
        S1 s1 = this.A07;
        if (s1 != null) {
            s1.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.TM, com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AC5(boolean z) {
        super.AC5(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AEN(Bundle bundle) {
        S1 s1 = this.A07;
        if (s1 != null) {
            s1.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TM
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AEN(bundle);
        A0A();
        A0B(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.TM, com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void onDestroy() {
        super.onDestroy();
        if (JQ.A1F(this.A0C)) {
            this.A0C.A09().AFK(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0A.A8v(this.A0A, new OA().A03(this.A09).A02(this.A0D).A05());
        }
        A0A();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A06(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
