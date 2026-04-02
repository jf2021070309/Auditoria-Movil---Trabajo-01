package com.amazon.aps.iva.pe;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: FragmentOnHoldNotificationBinding.java */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;

    public c(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
