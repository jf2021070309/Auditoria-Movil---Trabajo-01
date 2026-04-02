package com.amazon.aps.iva.lf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutThirdPartyAppItemBinding.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final ImageView f;

    public b(ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = imageView;
        this.f = imageView2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
