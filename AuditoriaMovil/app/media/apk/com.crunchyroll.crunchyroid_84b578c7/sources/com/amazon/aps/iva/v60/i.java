package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutCancellationRescueDowngradeBinding.java */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final TextView c;

    public i(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = textView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
