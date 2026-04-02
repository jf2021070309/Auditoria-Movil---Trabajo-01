package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
/* loaded from: assets/audience_network.dex */
public class MX implements DialogInterface.OnClickListener {
    public final /* synthetic */ TX A00;

    public MX(TX tx) {
        this.A00 = tx;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }
}
