package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.Nullable;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.9n  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04529n extends FrameLayout implements SM {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    @Nullable
    public C0869Qp A00;
    @DynamicWebViewController$AdFormatType
    public final int A01;
    public final AnonymousClass18 A02;
    public final C1046Xo A03;
    public final InterfaceC0684Jg A04;
    public final MD A05;
    @Nullable
    public final InterfaceC0822Ot A06;
    public final P4 A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, 18, 65, 21, 70, 65, 84, 71, 65, 21, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, 27, 21, 120, 84, 94, 80, 21, 70, 64, 71, 80, 21, 65, 93, 84, 65, 21, 92, 65, 18, 70, 21, 92, 91, 21, 76, 90, 64, 71, 21, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, 27, 77, 88, 89, 21, 83, 92, 89, 80, 27, 30, 26, 25, 45, 60, 49, 61, 54, 59, 61, 22, 61, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 64, 79, 90, 71, 88, 75, 111, 74, 106, 79, 90, 79, 108, 91, 64, 74, 66, 75, 47, 48, 60, 46, 13, 32, 41, 60};
    }

    static {
        A02();
    }

    public C04529n(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i2) {
        this(c1046Xo, interfaceC0684Jg, null, anonymousClass18, str, i2, null);
    }

    public C04529n(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, @Nullable InterfaceC0822Ot interfaceC0822Ot, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i2, @Nullable MD md) {
        super(c1046Xo);
        this.A03 = c1046Xo;
        this.A04 = interfaceC0684Jg;
        this.A02 = anonymousClass18;
        this.A08 = str;
        this.A06 = interfaceC0822Ot;
        this.A01 = i2;
        if (this.A01 == 3) {
            this.A07 = new P4(this.A03, anonymousClass18, interfaceC0684Jg, i2);
            this.A09 = false;
        } else {
            P4 A02 = P5.A02(anonymousClass18.A0Y());
            if (A02 != null) {
                this.A07 = A02;
                this.A09 = true;
            } else {
                this.A07 = new P4(this.A03, anonymousClass18, interfaceC0684Jg, i2);
                P5.A03(anonymousClass18, this.A07);
                this.A09 = false;
            }
        }
        if (md != null) {
            this.A05 = md;
            this.A07.A0Z(md);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new ST(this));
        this.A07.A0a(interfaceC0822Ot);
        EnumC0742Lr.A04(this, EnumC0742Lr.A0A);
        if (JQ.A1F(c1046Xo)) {
            c1046Xo.A09().AFV(this.A07.A0O(), anonymousClass18.A0T(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0D().A4v();
            this.A07.A0X();
        } else {
            this.A03.A0D().A4w();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    InterfaceC0822Ot interfaceC0822Ot = this.A06;
                    if (interfaceC0822Ot != null) {
                        interfaceC0822Ot.AAd();
                    }
                    if (JQ.A1F(this.A03)) {
                        this.A03.A09().AAR();
                    }
                } else {
                    AF7();
                }
            }
        }
        A08();
    }

    private final void A04() {
        P4.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AnonymousClass18 anonymousClass18) {
        intent.putExtra(A01(SyslogConstants.LOG_LOCAL1, 8, 40), EnumC0717Kp.A04);
        intent.putExtra(A01(118, 18, 95), anonymousClass18);
        intent.addFlags(268435456);
    }

    @SuppressLint({"CatchGeneralException"})
    private final void A06(AnonymousClass18 anonymousClass18) {
        AdActivityIntent A04 = LL.A04(this.A03);
        A05(A04, anonymousClass18);
        try {
            LL.A09(this.A03, A04);
        } catch (Exception e2) {
            this.A03.A06().A8y(A01(FacebookMediationAdapter.ERROR_NULL_CONTEXT, 11, 38), C04398z.A05, new AnonymousClass90(e2));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e2);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new OH(this.A03, this.A08, this.A00, this.A05, this.A04).A08(this.A02.A0T(), str, new HashMap());
    }

    public final void A08() {
        ML.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A7v() {
        A07(this.A02.A0N().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A7w(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A80() {
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A81(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A8h() {
        new Handler(Looper.getMainLooper()).post(new SS(this));
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void AAo() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void AAs() {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ABW(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACH() {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACk(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACm(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACz(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void AF7() {
        InterfaceC0822Ot interfaceC0822Ot = this.A06;
        if (interfaceC0822Ot != null) {
            interfaceC0822Ot.AAd();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void close() {
    }

    public InterfaceC0684Jg getAdEventManager() {
        return this.A04;
    }

    public P4 getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(@Nullable C0869Qp c0869Qp) {
        this.A00 = c0869Qp;
        this.A07.A0e(c0869Qp);
    }
}
