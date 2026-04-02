package e.d.b.d.y;

import android.animation.ValueAnimator;
/* loaded from: classes2.dex */
public class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f6704c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
