package com.amazon.aps.iva.ac;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((SwipeDismissTouchListener) obj2).lambda$performDismiss$0((ViewGroup.LayoutParams) obj, valueAnimator);
                return;
            default:
                AppBarLayout.b((AppBarLayout) obj2, (MaterialShapeDrawable) obj, valueAnimator);
                return;
        }
    }
}
