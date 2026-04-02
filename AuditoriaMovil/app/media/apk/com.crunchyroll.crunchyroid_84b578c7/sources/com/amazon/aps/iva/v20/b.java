package com.amazon.aps.iva.v20;

import android.app.Dialog;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.i;
/* compiled from: MembershipCardDialog.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.a<q> {
    public b(Dialog dialog) {
        super(0, dialog, Dialog.class, "dismiss", "dismiss()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        ((Dialog) this.receiver).dismiss();
        return q.a;
    }
}
