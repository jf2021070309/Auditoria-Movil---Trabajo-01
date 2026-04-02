package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: ActivityDowngradeSuccessBinding.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public b(ImageView imageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
