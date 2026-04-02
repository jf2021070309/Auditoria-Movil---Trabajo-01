package com.amazon.aps.iva.c8;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.DrawerLayoutUtils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ c(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                androidx.media3.ui.b bVar = (androidx.media3.ui.b) view;
                bVar.getClass();
                bVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bVar.invalidate(bVar.b);
                return;
            default:
                DrawerLayoutUtils.a((DrawerLayout) view, valueAnimator);
                return;
        }
    }
}
