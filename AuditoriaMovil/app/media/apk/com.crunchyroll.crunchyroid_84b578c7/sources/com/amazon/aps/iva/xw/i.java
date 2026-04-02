package com.amazon.aps.iva.xw;

import android.view.View;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<View, Integer, View> {
    public static final i h = new i();

    public i() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final View invoke(View view, Integer num) {
        View view2 = view;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(view2, "$this$null");
        return view2.findViewById(intValue);
    }
}
