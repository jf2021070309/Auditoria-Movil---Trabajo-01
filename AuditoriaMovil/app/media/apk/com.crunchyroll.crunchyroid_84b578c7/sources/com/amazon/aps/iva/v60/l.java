package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutSubscriptionAlreadyPremiumBinding.java */
/* loaded from: classes2.dex */
public final class l implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;

    public l(ImageView imageView, TextView textView, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = textView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
