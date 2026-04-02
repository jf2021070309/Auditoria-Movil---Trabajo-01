package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class SL implements InterfaceC0762Ml, PE {
    public static byte[] A06;
    public static String[] A07 = {"oiGCyLLJ3En0Vucm2lwQCmCmn0v6sJ5G", "mjDZ5bMhh2egn3gotl5Fak9vSR0Edani", "1hG9WDI3REfqDlfCDst9s2RoZGy9hyfa", "soGyy3NAn5Cor38t8b", "p7cBZk", "O0VCEzMFnvnMCBxUoY", "3U8Wd6", "kV1x0xBuSb6EFvzAtfCiFjMbzzjOwzOj"};
    @Nullable
    public AnonymousClass59 A00;
    public C04579s A01;
    public String A02;
    public final C1046Xo A03;
    public final InterfaceC0761Mk A04;
    public final NC A05;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-25, -14, -3, -25, -1, -7, 43, 56, 41, 43, 45, 62, 51, 64, 51, 62, 67, 29, 27, 40, 29, 31, 38, 0, 12, 10, -53, 3, -2, 0, 2, -1, 12, 12, 8, -53, -2, 18, 1, 6, 2, 11, 0, 2, 11, 2, 17, 20, 12, 15, 8, -53, 15, 17, 3, -53, -34, 18, 1, 6, 2, 11, 0, 2, -21, 2, 17, 20, 12, 15, 8, -17, 2, 20, -2, 15, 1, 2, 1, -13, 6, 1, 2, 12, -34, 0, 17, 6, 19, 6, 17, 22, 45, 57, 55, -8, 48, 43, 45, 47, 44, 57, 57, 53, -8, 53, 43, 62, 43, 56, 43, 90, 46, 98, 81, 86, 82, 91, 80, 82, 59, 82, 97, 100, 92, 95, 88, 46, 80, 97, 86, 99, 86, 97, 102, 13, 86, 96, 13, 91, 98, 89, 89, 57, 56, 45, 47, -31, -35, -46, -44, -42, -34, -42, -33, -27, -70, -75, 53, 49, 38, 40, 42, 50, 42, 51, 57, 36, 46, 41};
    }

    static {
        A02();
    }

    public SL(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0761Mk interfaceC0761Mk, AnonymousClass18 anonymousClass18, NC nc, @DynamicWebViewController$AdFormatType int i2) {
        this.A03 = c1046Xo;
        this.A04 = interfaceC0761Mk;
        this.A05 = nc;
        this.A02 = anonymousClass18.A0c().optString(A00(158, 12, 86));
        if (!anonymousClass18.A0t()) {
            this.A01 = new C04579s(c1046Xo, interfaceC0684Jg, interfaceC0761Mk, anonymousClass18, nc, i2);
            this.A01.setRtfActionsJavascriptListener(this);
            return;
        }
        this.A01 = null;
    }

    private void A01() {
        C04579s c04579s = this.A01;
        if (c04579s != null) {
            c04579s.close();
            return;
        }
        AnonymousClass59 anonymousClass59 = this.A00;
        if (anonymousClass59 != null) {
            anonymousClass59.finish(4);
            return;
        }
        this.A03.A06().A8y(A00(6, 11, 91), C04398z.A06, new AnonymousClass90(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 32, 126)));
        Activity A0C = this.A03.A0C();
        if (A0C == null) {
            return;
        }
        A0C.finish();
    }

    private boolean A03() {
        AnonymousClass59 anonymousClass59 = this.A00;
        String A00 = A00(6, 11, 91);
        if (anonymousClass59 != null && anonymousClass59.A0H() != null) {
            try {
                Intent intent = new Intent();
                intent.putExtra(A00(147, 11, 2), this.A02);
                intent.setClassName(A00(92, 19, 91), A00(23, 69, 46));
                this.A00.A0H().startActivityForResult(intent, 1001);
                this.A03.A0D().AEI();
                return true;
            } catch (ActivityNotFoundException e2) {
                this.A03.A0D().AEC();
                this.A03.A06().A8y(A00, C04398z.A0B, new AnonymousClass90(e2));
                return false;
            }
        }
        this.A03.A06().A8y(A00, C04398z.A06, new AnonymousClass90(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 32, 126)));
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A81(String str) {
        C0755Me c0755Me = new C0755Me(this.A03);
        String A00 = A00(143, 4, 91);
        boolean equals = A00.equals(str);
        String A002 = A00(0, 6, 23);
        if (!equals) {
            boolean equals2 = A002.equals(str);
            String[] strArr = A07;
            if (strArr[5].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "HXT1N9aUFCiTX8IjAD";
            strArr2[3] = "Hjw6INOHlWjDRzMVan";
            if (!equals2) {
                if (A00(17, 6, 75).equals(str)) {
                    c0755Me.A03(str);
                    this.A03.A0D().AED();
                    A01();
                    return;
                }
                A01();
                return;
            }
        }
        c0755Me.A03(str);
        boolean equals3 = A00.equals(str);
        if (A07[1].charAt(31) != 'i') {
            throw new RuntimeException();
        }
        A07[0] = "ID97lvjCTklEU0mENKFZ0jCzQAEYbfvd";
        if (equals3) {
            C1046Xo c1046Xo = this.A03;
            String[] strArr3 = A07;
            if (strArr3[7].charAt(27) != strArr3[2].charAt(27)) {
                A07[1] = "BoqZ4wfC0SiK5tBsDvOnRbTPQI0SuSvi";
                c1046Xo.A0D().AEF();
            } else {
                c1046Xo.A0D().AEF();
            }
        } else if (A002.equals(str)) {
            this.A03.A0D().AEE();
        }
        if (!A03()) {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        this.A00 = anonymousClass59;
        C04579s c04579s = this.A01;
        if (c04579s != null) {
            c04579s.A8n(intent, bundle, anonymousClass59);
        } else if (bundle == null && !A03()) {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void ABg(boolean z) {
        C04579s c04579s = this.A01;
        if (c04579s != null) {
            c04579s.ABg(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AC5(boolean z) {
        C04579s c04579s = this.A01;
        if (c04579s != null) {
            c04579s.AC5(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AEN(Bundle bundle) {
        if (this.A01 != null) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        String A7Q;
        if (i2 == 1001) {
            KT kt = new KT(intent);
            if (kt.A03() == null) {
                new C0755Me(this.A03).A04(String.valueOf(i3));
            } else {
                new C0755Me(this.A03).A04(String.valueOf(kt.A03()));
                if (kt.A02() != null) {
                    InterfaceC0761Mk interfaceC0761Mk = this.A04;
                    if (kt.A02().booleanValue()) {
                        A7Q = this.A05.A7R();
                    } else {
                        A7Q = this.A05.A7Q();
                    }
                    interfaceC0761Mk.A3r(A7Q);
                }
                if (kt.A04()) {
                    this.A04.A3r(this.A05.A5Z());
                }
            }
            A01();
            return true;
        }
        C04579s c04579s = this.A01;
        if (c04579s != null) {
            return c04579s.onActivityResult(i2, i3, intent);
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void onDestroy() {
        C04579s c04579s = this.A01;
        if (c04579s != null) {
            c04579s.onDestroy();
        }
        this.A01 = null;
        this.A00 = null;
    }
}
