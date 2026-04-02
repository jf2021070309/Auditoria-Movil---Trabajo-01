package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.cp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1279cp implements InterfaceC02450x {
    public static byte[] A02;
    public static String[] A03 = {"CodBKn6Rx4Nd2NCJ9VlYeJoUvBmT0K9p", "5Rf8WjvcJZOUdeEvkpnEyeT6h0OK8cqO", "9H9umRBAwWbsUQsHVAjP1GvoefoGWKiv", "nqryT6E7", "BkgpBj4q", "vUmBCwuwnOwC6wDkIlhiKnb32h6Srhe1", "47HB5bdSxtP74yDXUEGozfNjn4WOkRGN", "xids5JFtyjlo4uGEh5DI8Wwgi7h0jVQM"};
    public final /* synthetic */ FM A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = (copyOfRange[i5] ^ i4) ^ 34;
            String[] strArr = A03;
            if (strArr[5].charAt(5) == strArr[1].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "sVZQ6Ml9fBzEITS5ybXWTtwXQoWqWbAN";
            strArr2[1] = "MwEMOJFXQFuJpU8zWQ85tYeWswvxAO3B";
            copyOfRange[i5] = (byte) i6;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{109, 105, 105, 98, 109, 98, 61, 61, 15, 42, 47, 62, 58, 43, 60, 110, 39, 61, 110, 32, 59, 34, 34, 110, 33, 32, 110, 34, 33, 47, 42, 7, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, 15, 42, 93, 122, 96, 113, 102, 103, 96, 125, 96, 125, 117, 120, 52, 125, 121, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 125, 102, 113, 112, 106, 101, 111, 121, 100, 98, 111, 37, 98, 101, Byte.MAX_VALUE, 110, 101, Byte.MAX_VALUE, 37, 106, 104, Byte.MAX_VALUE, 98, 100, 101, 37, 93, 66, 78, 92, 47, 62, 39, 96, 97, 70, 97, 123, 106, 125, 124, 123, 102, 123, 102, 110, 99, 67, 96, 104, 104, 102, 97, 104, 70, 98, Byte.MAX_VALUE, 125, 106, 124, 124, 102, 96, 97};
    }

    static {
        A01();
    }

    public C1279cp(FM fm, Runnable runnable) {
        this.A00 = fm;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AAy(C1317dR c1317dR, String str, boolean z) {
        this.A00.A06.A0C();
        boolean z2 = !TextUtils.isEmpty(str);
        if (z && z2) {
            Intent intent = new Intent(A00(74, 26, 41));
            intent.setData(Uri.parse(str));
            LL.A0B(this.A00.A0B, intent);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AAz(C1317dR c1317dR) {
        this.A00.A06.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AB0(C1317dR c1317dR) {
        this.A00.A06.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AB1(C1317dR c1317dR) {
        if (c1317dR != this.A00.A00) {
            return;
        }
        if (c1317dR == null) {
            this.A00.A0B.A06().A8y(A00(100, 3, 108), C04398z.A0P, new AnonymousClass90(A00(8, 37, 108)));
            AB2(c1317dR, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        FM fm = this.A00;
        fm.A01 = c1317dR;
        fm.A0F();
        this.A00.A06.A0F(c1317dR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AB2(C1317dR c1317dR, AdError adError) {
        if (c1317dR != this.A00.A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0K(c1317dR);
        this.A00.A0B.A0D().A4Y(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A06.A0G(new KG(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AB3(C1317dR c1317dR) {
        KU.A05(A00(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 31, 45), A00(45, 29, 54), A00(0, 8, 121));
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AB4() {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AB5() {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void AB6() {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02450x
    public final void onInterstitialActivityDestroyed() {
        this.A00.A06.A02();
    }
}
