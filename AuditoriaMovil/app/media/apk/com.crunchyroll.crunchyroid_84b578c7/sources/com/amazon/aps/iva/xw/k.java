package com.amazon.aps.iva.xw;

import android.app.Dialog;
import android.view.View;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Dialog, Integer, View> {
    public static final k h = new k();

    public k() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final View invoke(Dialog dialog, Integer num) {
        Dialog dialog2 = dialog;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(dialog2, "$this$null");
        return dialog2.findViewById(intValue);
    }
}
