package e.d.b.d.y;

import android.animation.ValueAnimator;
/* loaded from: classes2.dex */
public class i implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ h a;

    public i(h hVar) {
        this.a = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f6704c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
