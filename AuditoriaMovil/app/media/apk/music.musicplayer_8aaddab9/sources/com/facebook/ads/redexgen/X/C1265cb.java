package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.cb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1265cb extends AbstractC02360o {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ C1263cZ A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, 29, 17, 16, 10, 12, 17, 18, 18, 27, 12, 94, 23, 13, 94, 16, 11, 18, 18};
    }

    static {
        A01();
    }

    public C1265cb(C1263cZ c1263cZ) {
        this.A00 = c1263cZ;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A06 = false;
            interstitialAdExtendedListener = this.A00.A09;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        FM fm;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        MD md;
        FM fm2;
        FM fm3;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A06 = false;
        fm = this.A00.A03;
        if (fm != null) {
            fm2 = this.A00.A03;
            fm2.A0M(new C1266cc(this));
            fm3 = this.A00.A03;
            fm3.A0H();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDismissed(anonymousClass20.A01());
        md = this.A00.A05;
        md.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDisplayed(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        this.A00.A08.A0D().A2X();
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onAdClicked(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onLoggingImpression(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0E(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
        if (r4 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
        r5 = new com.facebook.ads.redexgen.X.LW();
        r3 = r6.A00.A08;
        r0 = r6.A00.A0A;
        r1 = r0.A07();
        r0 = r6.A00.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
        if (r5.A05(r3, r1, r0.A0G()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
        r5.A04(r6.A00.A08, true);
        r4 = r6.A00;
        r3 = r4.A08;
        r0 = r6.A00.A0A;
        r1 = r0.A09();
        r0 = r6.A00.A0A;
        r4.A01 = r5.A03(r3, r1, r0.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013f, code lost:
        r5.A04(r6.A00.A08, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0148, code lost:
        if (r4 > 0) goto L16;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(com.facebook.ads.redexgen.X.InterfaceC02350n r7) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1265cb.A0F(com.facebook.ads.redexgen.X.0n):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0G(KG kg) {
        long j2;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        C0R A0D = this.A00.A08.A0D();
        j2 = this.A00.A00;
        A0D.A2a(MC.A01(j2), kg.A03().getErrorCode(), kg.A04());
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onError(anonymousClass20.A01(), LY.A00(kg));
    }
}
