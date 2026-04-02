package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.ci  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1272ci implements InterfaceC02701w {
    public static byte[] A04;
    public static String[] A05 = {"iEaWyjzULIZCFnp1nESlU5XZjwcvRjHd", "KbGYZiX8Pduw0KfpYwrRe1NWFWC1OMxy", "fhu9engps4P6WEn4zln6smGq5lQXex4h", "tbT6PfDqIL055", "rKa5gX4b0", "TAsNWcfBygYGmj6nueBPL3we7Mc4FYi0", "mn5595Nd0", "gAb4cPpeQcskkpTdmUE6rt9G8rZq3FNo"};
    public EnumC02691v A00 = EnumC02691v.A03;
    public EnumC02691v A01 = EnumC02691v.A03;
    public final AbstractC1269cf A02;
    public final C1046Xo A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[7].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            A05[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 29);
            i5++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-73, 11, 6, -73, 118, 104, -95, -73, -67, 104, -85, -87, -74, 104, -85, -80, -87, -74, -81, -83, 104, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, 104, -115, -70, -70, -73, -70, 104, -75, -73, -84, -83, 104, -86, -63, 104, -69, -83, -68, -68, -79, -74, -81, 104, -119, -84, -101, -83, -68, -68, -79, -74, -81, -69, 118, -69, -83, -68, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, -115, -70, -70, -73, -70, -107, -73, -84, -83, 112, 113, 112, 108, 107, -97, -114, -109, -113, -104, -115, -113, 120, -113, -98, -95, -103, -100, -107, -103, -59, -62, -64, 115, -41, -14, -17, -18, -25, -96, -23, -18, -12, -27, -14, -18, -31, -20, -96, -12, -14, -31, -18, -13, -23, -12, -23, -17, -18, -82, -15, 0, -7, -67, -64, -78, -75, 121, 122, -63, -74, -67, -59, 118, 119, 15, 3, -4, 15, -69, 4, 14, -69, -4, 7, 13, 0, -4, -1, 20, -69, -25, -22, -36, -33, -28, -23, -30, -57, -69, -25, -22, -36, -33, -32, -33, -69, 10, 13, -69, -18, -29, -22, -14, -28, -23, -30, -45, -57, -64, -45, Byte.MAX_VALUE, -56, -46, Byte.MAX_VALUE, -64, -53, -47, -60, -64, -61, -40, Byte.MAX_VALUE, -78, -89, -82, -74, -88, -83, -90, -14, -26, -33, -14, -98, -25, -15, -98, -20, -19, -14, -98, -54, -51, -65, -62, -61, -62};
    }

    static {
        A01();
    }

    public C1272ci(C1046Xo c1046Xo, AbstractC1269cf abstractC1269cf) {
        this.A03 = c1046Xo;
        this.A02 = abstractC1269cf;
    }

    private void A02(EnumC02691v enumC02691v, EnumC02691v enumC02691v2) {
        String A00 = A00(113, 26, 99);
        String str = A00(108, 5, 54) + enumC02691v + A00(0, 4, 122) + enumC02691v2;
        this.A03.A06().A8y(A00(139, 3, 115), C04398z.A0W, new AnonymousClass90(A00, str));
        this.A03.A0D().AFq(A00 + ' ' + str);
    }

    private void A03(String str, String str2, boolean z) {
        AdSettings.IntegrationErrorMode A00 = C02661s.A00(this.A03);
        String format = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String A002 = A00(139, 3, 115);
        String A003 = A00(91, 17, 13);
        if (!z) {
            Log.e(A003, format);
            this.A03.A06().A8y(A002, C04398z.A0U, new AnonymousClass90(format));
            this.A03.A0D().AFp(format);
            return;
        }
        int i2 = C02681u.A00[A00.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.A02.A05();
                this.A02.A06(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A03.A0D().AFp(format);
                Log.e(A003, format);
                this.A03.A06().A8y(A002, C04398z.A0U, new AnonymousClass90(format));
            }
            Log.e(A003, format);
            return;
        }
        throw new C02711x(format + A00(4, 87, 43));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02701w
    public final boolean A5J() {
        boolean z = (this.A00 == EnumC02691v.A03 || this.A00 == EnumC02691v.A05) && this.A01 != EnumC02691v.A08;
        if (z) {
            this.A00 = EnumC02691v.A07;
        } else {
            A03(A00(142, 6, 52), A00(154, 42, 126), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02701w
    public final boolean A5K() {
        boolean z = this.A00 == EnumC02691v.A06 && (this.A01 != EnumC02691v.A08 || JQ.A0f(this.A03));
        if (z) {
            this.A00 = EnumC02691v.A03;
            this.A01 = EnumC02691v.A08;
        } else {
            EnumC02691v enumC02691v = this.A00;
            EnumC02691v enumC02691v2 = EnumC02691v.A06;
            String A00 = A00(148, 6, 49);
            if (enumC02691v != enumC02691v2) {
                A03(A00, A00(219, 18, 97), true);
            } else {
                A03(A00, A00(196, 23, 66), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02701w
    public final EnumC02691v A5c() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02701w
    public final void AEa(EnumC02691v enumC02691v) {
        this.A00 = enumC02691v;
        this.A01 = enumC02691v;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02701w
    public final void AEd(AdError adError) {
        this.A00 = EnumC02691v.A05;
        this.A01 = EnumC02691v.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02701w
    public final void AEh() {
        if (this.A00 != EnumC02691v.A07) {
            A02(this.A00, EnumC02691v.A06);
        }
        this.A00 = EnumC02691v.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02701w
    public final void AEn() {
        if (this.A01 != EnumC02691v.A08) {
            A02(this.A00, EnumC02691v.A09);
        }
        this.A01 = EnumC02691v.A09;
    }
}
