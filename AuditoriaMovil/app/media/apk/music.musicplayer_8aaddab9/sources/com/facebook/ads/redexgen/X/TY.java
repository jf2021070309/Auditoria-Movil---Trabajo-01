package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class TY extends L7 {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ MY A01;

    public TY(MY my, DialogInterface dialogInterface) {
        this.A01 = my;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        InterfaceC0875Qv interfaceC0875Qv;
        InterfaceC0875Qv interfaceC0875Qv2;
        C1045Xn c1045Xn;
        Map<? extends String, ? extends String> A04;
        interfaceC0875Qv = this.A01.A01.A02;
        if (interfaceC0875Qv != null) {
            interfaceC0875Qv2 = this.A01.A01.A02;
            c1045Xn = this.A01.A01.A00;
            String A03 = C0715Kn.A03(c1045Xn);
            R9 r9 = new R9();
            A04 = this.A01.A01.A04(this.A01.A00.getText().toString());
            interfaceC0875Qv2.AD8(A03, r9.A05(A04).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
