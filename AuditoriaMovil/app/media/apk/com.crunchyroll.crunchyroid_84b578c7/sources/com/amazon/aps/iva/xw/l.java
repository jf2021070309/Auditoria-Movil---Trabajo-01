package com.amazon.aps.iva.xw;

import android.app.Dialog;
import android.view.View;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<androidx.fragment.app.g, Integer, View> {
    public static final l h = new l();

    public l() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final View invoke(androidx.fragment.app.g gVar, Integer num) {
        View findViewById;
        androidx.fragment.app.g gVar2 = gVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(gVar2, "$this$null");
        Dialog dialog = gVar2.getDialog();
        if (dialog == null || (findViewById = dialog.findViewById(intValue)) == null) {
            View view = gVar2.getView();
            if (view != null) {
                return view.findViewById(intValue);
            }
            return null;
        }
        return findViewById;
    }
}
