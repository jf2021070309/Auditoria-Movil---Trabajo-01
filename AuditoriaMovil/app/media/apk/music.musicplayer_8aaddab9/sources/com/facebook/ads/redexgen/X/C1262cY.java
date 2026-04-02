package com.facebook.ads.redexgen.X;

import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.cY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1262cY extends AbstractC02360o {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C1260cW A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C1262cY(C1260cW c1260cW) {
        this.A00 = c1260cW;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A08() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A09() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0A() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        MD md;
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
        md = this.A00.A05;
        md.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass24;
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        anonymousClass24 = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onAdClicked(anonymousClass24.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass24;
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        anonymousClass24 = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(anonymousClass24.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0F(InterfaceC02350n interfaceC02350n) {
        FI fi;
        FI fi2;
        AnonymousClass24 anonymousClass24;
        AnonymousClass24 anonymousClass242;
        FI fi3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass243;
        AnonymousClass24 anonymousClass244;
        fi = this.A00.A03;
        if (fi == null) {
            this.A00.A08.A06().A8y(A00(0, 3, 70), C04398z.A0F, new AnonymousClass90(A00(3, 18, 43)));
            return;
        }
        C1260cW c1260cW = this.A00;
        fi2 = c1260cW.A03;
        c1260cW.A06 = fi2.A0E();
        AbstractC1305dF abstractC1305dF = (AbstractC1305dF) interfaceC02350n;
        anonymousClass24 = this.A00.A0A;
        if (anonymousClass24.A03 != null) {
            anonymousClass244 = this.A00.A0A;
            abstractC1305dF.A01(anonymousClass244.A03);
        }
        anonymousClass242 = this.A00.A0A;
        int A0D = abstractC1305dF.A0D();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        anonymousClass242.A00 = A0D;
        this.A00.A07 = true;
        C1260cW c1260cW2 = this.A00;
        fi3 = c1260cW2.A03;
        c1260cW2.A02 = fi3.A0T();
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        anonymousClass243 = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(anonymousClass243.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02360o
    public final void A0G(KG kg) {
        AnonymousClass24 anonymousClass24;
        long j2;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass242;
        this.A00.A0B(true);
        anonymousClass24 = this.A00.A0A;
        C0R A0D = anonymousClass24.A0B.A0D();
        j2 = this.A00.A01;
        A0D.A2a(MC.A01(j2), kg.A03().getErrorCode(), kg.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A09;
        anonymousClass242 = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onError(anonymousClass242.A00(), LY.A00(kg));
    }
}
