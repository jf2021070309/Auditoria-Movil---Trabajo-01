package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.q;
/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ q.f a;

    public s(q.f fVar) {
        this.a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m = valueAnimator.getAnimatedFraction();
    }
}
