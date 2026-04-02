package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.ct  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1283ct implements InterfaceC02430v {
    public static byte[] A02;
    public static String[] A03 = {"7FIKHU9lgq27", "AgQqvAltXhi1bYF8zppFCZ", "CRAmwsbXNtyv0vmCJJ9qOPCwxUiND3E6", "ItQqdqoRYHMWKQzbVRTeHzNwEAi", "W2szVhKnaW", "HNVKE5hkEvipBMdeuLWXlSQ07SgK2Jmi", "9NOG2BA2dnlUEqMWgY53wMXC47FXKBrl", "EneshuO9jiHnlHF2bjWwp7WA0EKVaMOF"};
    public final /* synthetic */ FN A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            byte b2 = (byte) ((copyOfRange[i5] - i4) - 16);
            if (A03[2].charAt(4) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "2VG06oAYTcRzKBDE7gWFCU36hzL5px1b";
            strArr[7] = "j1xG2z3v9jq0UO66H2WqYNbpklLAu6IG";
            copyOfRange[i5] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{111, 114, 114, -97, 117, 115, 110, -92, -124, -93, -80, -80, -89, -76, 98, -85, -81, -78, -76, -89, -75, -75, -85, -79, -80, 98, -88, -85, -76, -89, -90, -118, -119, 93, 124, -119, -119, Byte.MIN_VALUE, -115, 103, -118, -126, -126, -124, -119, -126, 100, -120, -117, -115, Byte.MIN_VALUE, -114, -114, -124, -118, -119};
    }

    static {
        A01();
    }

    public C1283ct(FN fn, Runnable runnable) {
        this.A00 = fn;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02430v
    public final void AAA(C1318dS c1318dS) {
        E5 e5;
        e5 = this.A00.A01;
        e5.A0D().A3i();
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02430v
    public final void AAB(C1318dS c1318dS, View view) {
        E5 e5;
        e5 = this.A00.A01;
        e5.A0D().A3h(c1318dS == ((AbstractC1281cr) this.A00).A00);
        if (c1318dS != ((AbstractC1281cr) this.A00).A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        InterfaceC02350n interfaceC02350n = ((AbstractC1281cr) this.A00).A01;
        FN fn = this.A00;
        ((AbstractC1281cr) fn).A01 = c1318dS;
        fn.A00 = view;
        if (!this.A00.A0C) {
            this.A00.A06.A0F(c1318dS);
            return;
        }
        this.A00.A06.A0E(view);
        this.A00.A0K(interfaceC02350n);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02430v
    public final void AAC(C1318dS c1318dS) {
        E5 e5;
        KU.A05(A00(31, 25, 11), A00(8, 23, 50), A00(0, 8, 46));
        e5 = this.A00.A01;
        e5.A0D().A3k();
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02430v
    public final void AB9(C1318dS c1318dS, KG kg) {
        E5 e5;
        e5 = this.A00.A01;
        e5.A0D().A3j(c1318dS == ((AbstractC1281cr) this.A00).A00, kg.A03().getErrorCode());
        if (c1318dS != ((AbstractC1281cr) this.A00).A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0K(c1318dS);
        this.A00.AAh(kg);
    }
}
