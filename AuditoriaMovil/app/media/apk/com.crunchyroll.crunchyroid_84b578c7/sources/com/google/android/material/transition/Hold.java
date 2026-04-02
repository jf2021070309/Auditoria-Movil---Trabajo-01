package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.a9.l0;
import com.amazon.aps.iva.a9.u;
/* loaded from: classes3.dex */
public final class Hold extends l0 {
    @Override // com.amazon.aps.iva.a9.l0
    public Animator onAppear(ViewGroup viewGroup, View view, u uVar, u uVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // com.amazon.aps.iva.a9.l0
    public Animator onDisappear(ViewGroup viewGroup, View view, u uVar, u uVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
