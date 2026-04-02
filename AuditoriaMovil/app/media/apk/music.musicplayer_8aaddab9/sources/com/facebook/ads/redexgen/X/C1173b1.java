package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.b1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1173b1 implements C6N {
    public static String[] A02 = {"iWDBF2OKl3jtj3mE0UZLtkhUaVvUxXqs", "ms2LCEwCyzsqM8QDDj0PRev1P1CSm3w7", "hMtVrOKQMF9h", "gi6PEiuAAOhVuZEccjIoIAk9XYc1uF", "R32JKWcbl7Qu2cyp2LhmQehQDOktlipk", "kBJUlLOX6LAUVPMDIzawXbz3hNZwTKWy", "5r9f7V6KCkM3IvysTdnytDlDBRDUQAcw", "vGzO7SO4CN32udhBb2qyIGFDHHv1hOkX"};
    public final C1171az A00;
    public final C1045Xn A01;

    public C1173b1(C1045Xn c1045Xn) {
        this.A01 = c1045Xn;
        this.A00 = new C1171az(c1045Xn);
    }

    public final C1171az A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C6N
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final void AE0(Throwable th) {
        if (th == null || AnonymousClass69.A00(this.A01) >= Math.random()) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        C1171az c1171az = this.A00;
        String A022 = C6I.A04.A02();
        String A023 = C6J.A06.A02();
        HashMap hashMap = new HashMap();
        String message = th.getMessage();
        if (stringWriter2 != null) {
            int length = stringWriter2.length();
            if (A02[1].charAt(16) != 'D') {
                throw new RuntimeException();
            }
            A02[5] = "Ct83iaSYEVOHUGfDQtOJkAbKybUxEBTx";
            if (length > 500) {
                stringWriter2 = stringWriter2.substring(0, 500);
            }
        }
        c1171az.A99(A022, A023, hashMap, null, message, stringWriter2, th.getClass().getSimpleName());
    }
}
