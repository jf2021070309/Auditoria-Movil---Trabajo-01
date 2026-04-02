package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;
/* loaded from: assets/audience_network.dex */
public class MY implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ TX A01;

    public MY(TX tx, EditText editText) {
        this.A01 = tx;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new TY(this, dialogInterface));
    }
}
