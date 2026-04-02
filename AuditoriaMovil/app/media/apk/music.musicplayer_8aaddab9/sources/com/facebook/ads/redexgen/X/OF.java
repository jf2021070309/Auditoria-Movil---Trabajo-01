package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class OF implements DialogInterface.OnClickListener {
    public final /* synthetic */ OH A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public OF(OH oh, String str, Map map) {
        this.A00 = oh;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        InterfaceC0684Jg interfaceC0684Jg;
        interfaceC0684Jg = this.A00.A04;
        interfaceC0684Jg.A9L(this.A01, this.A02);
    }
}
