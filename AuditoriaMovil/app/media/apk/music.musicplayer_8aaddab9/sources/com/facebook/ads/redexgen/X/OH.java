package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class OH {
    public static byte[] A09;
    @Nullable
    public OG A00;
    public boolean A01;
    public boolean A02;
    public final C1046Xo A03;
    public final InterfaceC0684Jg A04;
    public final MD A05;
    public final InterfaceC0761Mk A06;
    @Nullable
    public final C0869Qp A07;
    public final String A08;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    public OH(C1046Xo c1046Xo, String str, @Nullable C0869Qp c0869Qp, MD md, InterfaceC0684Jg interfaceC0684Jg) {
        this.A01 = true;
        this.A03 = c1046Xo;
        this.A08 = str;
        this.A07 = c0869Qp;
        this.A05 = md;
        this.A04 = interfaceC0684Jg;
        this.A06 = new C0924Ss(this);
    }

    public OH(C1046Xo c1046Xo, String str, @Nullable C0869Qp c0869Qp, MD md, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0761Mk interfaceC0761Mk) {
        this.A01 = true;
        this.A03 = c1046Xo;
        this.A08 = str;
        this.A07 = c0869Qp;
        this.A05 = md;
        this.A04 = interfaceC0684Jg;
        this.A06 = interfaceC0761Mk;
    }

    public static void A03(C1046Xo c1046Xo, @Nullable C0869Qp c0869Qp, MD md, InterfaceC0684Jg interfaceC0684Jg, C1L c1l, String str) {
        AbstractC02280f A01 = C02290g.A01(c1046Xo, interfaceC0684Jg, str, Uri.parse(c1l.A05()), new OA().A03(c0869Qp).A02(md).A05(), false, false);
        if (A01 != null) {
            A01.A09();
        }
    }

    private void A05(String str, String str2, Map<String, String> map) {
        this.A04.A9M(str, map);
        C0738Ll.A00(new OE(this, map, str, str2), new OF(this, str, map), ActivityUtils.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 52);
        try {
            AbstractC02280f A012 = C02290g.A01(this.A03, this.A04, str, Uri.parse(str2), new OA(map).A03(this.A07).A02(this.A05).A05(), this.A01, this.A02);
            if (A012 != null) {
                A012.A0B();
            }
            if (this.A00 != null) {
                this.A00.AAP();
            }
            this.A06.A3r(this.A08);
        } catch (ActivityNotFoundException e2) {
            Log.e(A01, A01(44, 20, 100) + str2, e2);
        } catch (Exception e3) {
            Log.e(A01, A01(22, 22, 95), e3);
        }
    }

    public final void A07(OG og) {
        this.A00 = og;
    }

    public final void A08(String str, String str2, Map<String, String> map) {
        new C0692Jo(str, this.A04).A02(EnumC0691Jn.A0J, null);
        if (this.A05.A09(this.A03)) {
            this.A04.A8u(str, map);
        } else if (JQ.A12(this.A03)) {
            A05(str, str2, map);
        } else {
            A06(str, str2, map);
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}
