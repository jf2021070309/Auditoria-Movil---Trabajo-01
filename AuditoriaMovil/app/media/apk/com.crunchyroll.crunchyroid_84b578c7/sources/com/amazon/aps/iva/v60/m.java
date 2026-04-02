package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutUpsellTierItemBinding.java */
/* loaded from: classes2.dex */
public final class m implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public m(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4, TextView textView5, FrameLayout frameLayout, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = linearLayout;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
