package com.amazon.aps.iva.y8;

import android.animation.ValueAnimator;
import com.amazon.aps.iva.y8.d;
/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ d.a a;
    public final /* synthetic */ d b;

    public b(d dVar, d.a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.b;
        dVar.getClass();
        d.a aVar = this.a;
        d.d(floatValue, aVar);
        dVar.a(floatValue, aVar, false);
        dVar.invalidateSelf();
    }
}
