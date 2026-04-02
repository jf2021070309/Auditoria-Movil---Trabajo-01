package com.amazon.aps.iva.xf;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutContentUnavailableBinding.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;
    public final Toolbar c;

    public b(ConstraintLayout constraintLayout, TextView textView, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = toolbar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
