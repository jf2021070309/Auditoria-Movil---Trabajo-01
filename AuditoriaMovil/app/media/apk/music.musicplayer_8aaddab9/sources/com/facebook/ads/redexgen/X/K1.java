package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class K1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ U3 A00;

    public K1(U3 u3) {
        this.A00 = u3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Map<String, String> A01;
        if (this.A00.A01.A0a != null) {
            C1315dP c1315dP = this.A00.A01.A0a;
            A01 = this.A00.A01();
            c1315dP.A0P(A01);
        }
    }
}
