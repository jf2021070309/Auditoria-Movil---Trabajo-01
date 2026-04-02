package com.amazon.aps.iva.zi;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: ActivityOnboardingV2Binding.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final FrameLayout c;

    public a(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = frameLayout2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
