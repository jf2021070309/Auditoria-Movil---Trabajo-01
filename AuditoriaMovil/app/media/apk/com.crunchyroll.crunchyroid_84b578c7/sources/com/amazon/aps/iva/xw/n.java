package com.amazon.aps.iva.xw;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<RecyclerView.f0, Integer, View> {
    public static final n h = new n();

    public n() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final View invoke(RecyclerView.f0 f0Var, Integer num) {
        RecyclerView.f0 f0Var2 = f0Var;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(f0Var2, "$this$null");
        return f0Var2.itemView.findViewById(intValue);
    }
}
