package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutCancellationRescueBenefitsBinding.java */
/* loaded from: classes2.dex */
public final class g implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final ConstraintLayout f;

    public g(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = imageView2;
        this.e = textView2;
        this.f = constraintLayout2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
