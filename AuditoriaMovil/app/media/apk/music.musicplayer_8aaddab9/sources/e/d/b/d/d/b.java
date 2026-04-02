package e.d.b.d.d;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
/* loaded from: classes2.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f6340b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f6341c;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f6341c = baseBehavior;
        this.a = coordinatorLayout;
        this.f6340b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6341c.G(this.a, this.f6340b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
