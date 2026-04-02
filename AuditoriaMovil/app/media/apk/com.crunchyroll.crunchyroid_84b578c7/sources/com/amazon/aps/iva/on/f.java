package com.amazon.aps.iva.on;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: LayoutSortAndFiltersHeaderBinding.java */
/* loaded from: classes2.dex */
public final class f implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;

    public f(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2) {
        this.b = constraintLayout;
        this.d = textView;
        this.c = imageView;
        this.e = imageView2;
    }

    public final ConstraintLayout a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (i) {
            case 0:
            default:
                return constraintLayout;
        }
    }

    public f(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, ImageView imageView, TextView textView) {
        this.b = constraintLayout;
        this.e = lottieAnimationView;
        this.c = imageView;
        this.d = textView;
    }
}
