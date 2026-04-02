package com.amazon.aps.iva.c8;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.xw.t0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                t tVar = (t) obj;
                tVar.getClass();
                tVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                t tVar2 = (t) obj;
                tVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = tVar2.b;
                if (view != null) {
                    view.setAlpha(floatValue);
                }
                ViewGroup viewGroup = tVar2.c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                ViewGroup viewGroup2 = tVar2.e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue);
                    return;
                }
                return;
            default:
                com.amazon.aps.iva.c70.a aVar = (com.amazon.aps.iva.c70.a) obj;
                int i2 = com.amazon.aps.iva.c70.a.e;
                com.amazon.aps.iva.yb0.j.f(aVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                com.amazon.aps.iva.yb0.j.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                t0.h(aVar, null, null, null, (Integer) animatedValue, 7);
                return;
        }
    }
}
