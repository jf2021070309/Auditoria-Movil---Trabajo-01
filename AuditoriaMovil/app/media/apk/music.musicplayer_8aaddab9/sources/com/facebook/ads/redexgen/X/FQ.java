package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public final class FQ extends AbstractC1305dF {
    public static byte[] A0E;
    public static String[] A0F = {"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    public long A00;
    public AnonymousClass14 A01;
    public AnonymousClass15 A02;
    public AnonymousClass18 A03;
    public C1046Xo A04;
    public C0692Jo A05;
    public EnumC0717Kp A06;
    @Nullable
    @DoNotStrip
    public P4 A07;
    public String A08;
    @Nullable
    public String A09;
    public String A0A;
    public final String A0C = UUID.randomUUID().toString();
    public final AtomicBoolean A0D = new AtomicBoolean();
    public boolean A0B = false;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 110, 97, 100, 104, 99, 121, 89, 98, 102, 104, 99, 7, 15, 14, 3, 11, 30, 3, 5, 4, 46, 11, 30, 11, 89, 69, 72, 74, 76, 68, 76, 71, 93, 96, 77, 12, 14, 25, 24, 25, 26, 21, 18, 25, 24, 51, 14, 21, 25, 18, 8, 29, 8, 21, 19, 18, 55, 25, 5, 85, 66, 86, 82, 66, 84, 83, 115, 78, 74, 66, 4, 19, 1, 23, 4, 18, 37, 19, 4, 0, 19, 4, 35, 36, 58, 104, Byte.MAX_VALUE, 109, 123, 104, 126, Byte.MAX_VALUE, 126, 76, 115, 126, Byte.MAX_VALUE, 117, 91, 126, 94, 123, 110, 123, 88, 111, 116, 126, 118, Byte.MAX_VALUE, 25, 14, 28, 10, 25, 15, 14, 15, 52, 29, 2, 15, 14, 4, 87, 81, 67, 106, 75, 86, 76, 81, 64, 124, 103, 96, 120, 124, 108, 64, 109, 83, 76, 64, 82, 113, 92, 85, 64};
    }

    static {
        A08();
    }

    private void A06() {
        C2T A00 = C2T.A00(this.A04);
        AnonymousClass15 anonymousClass15 = this.A02;
        A00.A06(anonymousClass15, anonymousClass15.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C2T.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i2 = super.A00;
        String A04 = A04(58, 24, 2);
        if (i2 != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0F[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A04(1, 22, 43), 0) != 1) {
                int i3 = super.A00;
                if (A0F[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0F;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(A04, i3);
                return;
            }
        }
        if (!JQ.A0e(this.A04)) {
            intent.putExtra(A04, 6);
        }
    }

    private void A0A(boolean z) {
        if (this.A06 == EnumC0717Kp.A0C) {
            A0C(z);
            return;
        }
        EnumC0717Kp enumC0717Kp = this.A06;
        String[] strArr = A0F;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (enumC0717Kp == EnumC0717Kp.A0B) {
            A0B(z);
        } else {
            A0C(z);
        }
    }

    private void A0B(boolean z) {
        C7U c7u = new C7U(this.A04);
        boolean z2 = JQ.A1P(this.A04) && C03555g.A0A(this.A03.A0c());
        if (z2) {
            C03555g c03555g = new C03555g(c7u, this.A03.A0c(), this.A03.A0X(), this.A03.A0Y(), z2, new C1311dL(this));
            C0692Jo funnelLoggingHandler = new C0692Jo(this.A03.A0T(), this.A04.A08());
            c7u.A0b(funnelLoggingHandler);
            c03555g.A0B();
            return;
        }
        C02611n.A02(this.A04, this.A03, z, new C1310dK(this));
    }

    private void A0C(boolean isUnifiedAssetsLoaderEnabled) {
        C7U c7u = new C7U(this.A04);
        c7u.A0b(this.A05);
        boolean z = JQ.A1P(this.A04) && C03555g.A0A(this.A03.A0c());
        boolean A0r = this.A03.A0r();
        if (z) {
            new C03555g(c7u, this.A03.A0c(), this.A03.A0X(), this.A03.A0Y(), z, new C1313dN(this, A0r)).A0B();
            return;
        }
        C1294d4 c1294d4 = (C1294d4) this.A03;
        if (!c1294d4.A0s()) {
            if (TextUtils.isEmpty(c1294d4.A0N().A0D().A08())) {
                this.A01.ACC(this, AdError.INTERNAL_ERROR);
                return;
            }
            C02621o.A02(this.A04, c7u, c1294d4);
        }
        c7u.A0U(new FR(this, isUnifiedAssetsLoaderEnabled, A0r, c1294d4, this), new C7N(c1294d4.A0Y(), A04(133, 14, 21)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1305dF
    public final int A0D() {
        AnonymousClass18 anonymousClass18 = this.A03;
        if (anonymousClass18 == null) {
            String[] strArr = A0F;
            if (strArr[4].charAt(5) != strArr[5].charAt(5)) {
                A0F[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
                return -1;
            }
            throw new RuntimeException();
        }
        return anonymousClass18.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1305dF
    public final AnonymousClass18 A0E() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1305dF
    public final boolean A0F() {
        if (!this.A0D.get()) {
            return false;
        }
        String A03 = C0839Pl.A03(super.A01, this.A0C, this.A08);
        this.A03.A0e(super.A01);
        this.A03.A0i(A03);
        AdActivityIntent A04 = LL.A04(this.A04);
        A04.putExtra(A04(164, 8, 91), this.A06);
        A04.putExtra(A04(108, 25, 100), this.A03);
        A04.putExtra(A04(156, 8, 119), this.A0C);
        if (A03 != null) {
            A04.putExtra(A04(93, 15, 8), A03);
        }
        A04.putExtra(A04(47, 11, 87), this.A0A);
        A04.putExtra(A04(147, 9, 91), this.A0B);
        A04.putExtra(A04(82, 11, 89), this.A00);
        String str = this.A09;
        if (str != null) {
            A04.putExtra(A04(34, 13, 20), str);
        }
        A09(A04);
        A04.setFlags(A04.getFlags() | 268435456);
        A04.putExtra(A04(23, 11, 115), this.A03.A0T());
        ActivityUtils.A03(this.A04);
        LL.A09(this.A04, A04);
        return true;
    }

    public final void A0G(C1046Xo c1046Xo, AnonymousClass14 anonymousClass14, C02651r c02651r, boolean z, @Nullable String str, @Nullable String str2) {
        this.A0D.set(false);
        this.A04 = c1046Xo;
        this.A01 = anonymousClass14;
        this.A0B = C02631p.A02(str);
        this.A0A = c02651r.A02();
        this.A00 = c02651r.A00();
        this.A09 = str2;
        String str3 = this.A0A;
        this.A08 = str3 != null ? str3.split(A04(0, 1, 25))[0] : A04(0, 0, 20);
        this.A03 = C1294d4.A01(c02651r.A03(), this.A04);
        this.A03.A0l(c02651r.A01().A0F());
        this.A03.A0g(str);
        this.A03.A0d(c02651r.A01().A06());
        this.A05 = new C0692Jo(this.A03.A0T(), c1046Xo.A08());
        if (this.A03.A0r()) {
            this.A06 = this.A03.A0s() ? EnumC0717Kp.A0D : EnumC0717Kp.A05;
            if (this.A03.A0o()) {
                this.A04.A0D().AEo(EnumC02250c.A04);
            } else {
                this.A04.A0D().AEo(EnumC02250c.A06);
            }
        } else {
            int A0J = this.A03.A0J();
            if (A0J == 0) {
                this.A06 = EnumC0717Kp.A0C;
                this.A04.A0D().AEo(EnumC02250c.A09);
            } else if (A0J == 1) {
                this.A06 = EnumC0717Kp.A0B;
                this.A04.A0D().AEo(EnumC02250c.A08);
            }
        }
        this.A02 = new AnonymousClass15(this.A0C, this, anonymousClass14);
        A06();
        if (this.A03.A0s()) {
            this.A03.A0m(new C0755Me(this.A04).A06());
        }
        AnonymousClass18 anonymousClass18 = this.A03;
        String[] strArr = A0F;
        if (strArr[4].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0F[2] = "Eum2kzY1KsvV3iHB7OkWnIxnMBSPWXGg";
        if (anonymousClass18.A0t()) {
            this.A0D.set(true);
            this.A01.AC9(this);
            return;
        }
        A0A(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02350n
    public final String A64() {
        return this.A03.A0T();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02350n
    public final void onDestroy() {
        A07();
    }
}
