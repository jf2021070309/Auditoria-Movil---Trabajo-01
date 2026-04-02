package com.amazon.aps.iva.h60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutWatchScreenLoadingBinding.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final FrameLayout a;
    public final LinearLayout b;
    public final ConstraintLayout c;
    public final ConstraintLayout d;

    public c(FrameLayout frameLayout, LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.a = frameLayout;
        this.b = linearLayout;
        this.c = constraintLayout;
        this.d = constraintLayout2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
