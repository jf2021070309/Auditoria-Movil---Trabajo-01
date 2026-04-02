package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Xh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1039Xh implements InterfaceC04278l {
    public static byte[] A04;
    public static String[] A05 = {"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    public Context A00;
    public final InterfaceC04268k A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    @Nullable
    public C04248i A01 = A00();

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{107, Byte.MAX_VALUE, 96, 112, 124, 106, 123, 123, 102, 97, 104, 124, 112, 100, 106, 118};
    }

    static {
        A03();
    }

    public C1039Xh(Context context, InterfaceC04268k interfaceC04268k) {
        this.A00 = context;
        this.A02 = interfaceC04268k;
    }

    @Nullable
    private C04248i A00() {
        return C04248i.A00(C0719Ks.A00(this.A00).getString(A01(0, 16, 81), null));
    }

    private void A02() {
        this.A02.A9Z(new C1040Xi(this));
    }

    public final void A04(@Nullable String[] strArr, @Nullable Integer num, @Nullable Integer num2) {
        C04248i c04248i = new C04248i(strArr, num, num2);
        if (c04248i.equals(this.A01)) {
            return;
        }
        this.A01 = c04248i;
        this.A03.set(true);
        SharedPreferences A00 = C0719Ks.A00(this.A00);
        if (A05[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        A00.edit().putString(A01(0, 16, 81), this.A01.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04278l
    @Nullable
    public final C04248i A6J() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04278l
    public final boolean A8d() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0X = JQ.A0X(this.A00);
        String A07 = this.A01.A07();
        for (String str : A0X) {
            if (A07.contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04278l
    public final boolean AEr() {
        A02();
        return this.A03.getAndSet(false);
    }
}
