package com.amazon.aps.iva.pe;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: ActivityInGraceNotificationBinding.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final Toolbar f;

    public b(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = toolbar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
