package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class TC implements InterfaceC0762Ml {
    public static byte[] A0B;
    public int A00;
    public AnonymousClass88 A01;
    public final C1046Xo A02;
    public final InterfaceC0684Jg A03;
    public final InterfaceC0761Mk A04;
    public final N7 A05;
    public final Q8 A06;
    public final LF A0A = new AK(this);
    public final ME A09 = new AI(this);
    public final N0 A07 = new AH(this);
    public final AbstractC0775My A08 = new AF(this);

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, 24, 11, 6, 7, 17, -11, 7, 7, 13, -10, 11, 15, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public TC(C1046Xo c1046Xo, N7 n7, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0761Mk interfaceC0761Mk) {
        this.A02 = c1046Xo;
        this.A03 = interfaceC0684Jg;
        this.A05 = n7;
        this.A06 = new Q8(c1046Xo);
        this.A06.A0c(new C04147u(c1046Xo));
        this.A06.getEventBus().A03(this.A0A, this.A09, this.A07, this.A08);
        this.A04 = interfaceC0761Mk;
        this.A06.setIsFullScreen(true);
        this.A06.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC0761Mk.A3H(this.A06, layoutParams);
        C0764Mn c0764Mn = new C0764Mn(c1046Xo);
        c0764Mn.setOnClickListener(new N5(this));
        interfaceC0761Mk.A3H(c0764Mn, c0764Mn.getDefaultLayoutParams());
    }

    public final void A04(int i2) {
        this.A06.setVideoProgressReportIntervalMs(i2);
    }

    public final void A05(View view) {
        this.A06.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            PS ps = new PS(this.A02, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i2 = (int) (16.0f * C0739Lm.A00);
            layoutParams.setMargins(i2, i2, i2, i2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            ps.setOnClickListener(new N6(this));
            this.A04.A3H(ps, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        this.A01 = new AnonymousClass88(this.A02, this.A03, this.A06, intent.getStringExtra(A02(8, 11, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)), intent.getBundleExtra(A02(58, 11, 1)));
        this.A06.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A06.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i3 = this.A00;
        if (i3 > 0) {
            this.A06.A0Y(i3);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A06.A0b(EnumC0853Pz.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void ABg(boolean z) {
        this.A04.A3s(A02(37, 21, 27), new C0774Mx());
        this.A06.A0W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AC5(boolean z) {
        this.A04.A3s(A02(37, 21, 27), new MJ());
        if (!this.A06.A0j()) {
            this.A06.A0b(EnumC0853Pz.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AEN(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void onDestroy() {
        this.A04.A3s(A02(37, 21, 27), new C0723Kw(this.A00, this.A06.getCurrentPositionInMillis()));
        this.A01.A0d(this.A06.getCurrentPositionInMillis());
        this.A06.A0Z(1);
        this.A06.A0V();
    }
}
