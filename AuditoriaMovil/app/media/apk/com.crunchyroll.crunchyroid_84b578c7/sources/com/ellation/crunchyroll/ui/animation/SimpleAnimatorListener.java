package com.ellation.crunchyroll.ui.animation;

import android.animation.Animator;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: SimpleAnimatorListener.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/ui/animation/SimpleAnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Lcom/amazon/aps/iva/kb0/q;", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class SimpleAnimatorListener implements Animator.AnimatorListener {
    public static final int $stable = 0;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        j.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        j.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        j.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        j.f(animator, "animation");
    }
}
