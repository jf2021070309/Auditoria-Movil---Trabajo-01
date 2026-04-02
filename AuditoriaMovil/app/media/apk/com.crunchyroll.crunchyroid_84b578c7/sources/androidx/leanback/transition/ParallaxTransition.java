package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.amazon.aps.iva.e5.a;
import com.amazon.aps.iva.f5.q;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class ParallaxTransition extends Visibility {
    public static final LinearInterpolator b = new LinearInterpolator();

    public ParallaxTransition() {
    }

    public static ValueAnimator a(View view) {
        q qVar = (q) view.getTag(R.id.lb_parallax_source);
        if (qVar == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(b);
        ofFloat.addUpdateListener(new a(qVar));
        return ofFloat;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        return a(view);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return a(view);
    }

    public ParallaxTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
