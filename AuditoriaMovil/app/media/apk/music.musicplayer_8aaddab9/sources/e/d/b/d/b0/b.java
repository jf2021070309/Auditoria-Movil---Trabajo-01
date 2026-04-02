package e.d.b.d.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;
/* loaded from: classes2.dex */
public class b extends AnimatorListenerAdapter {
    public final /* synthetic */ e.d.b.d.l.d a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f6326b;

    public b(FabTransformationBehavior fabTransformationBehavior, e.d.b.d.l.d dVar, Drawable drawable) {
        this.a = dVar;
        this.f6326b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(this.f6326b);
    }
}
