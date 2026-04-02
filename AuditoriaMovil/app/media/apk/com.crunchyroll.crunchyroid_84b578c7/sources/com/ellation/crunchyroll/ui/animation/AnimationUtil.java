package com.ellation.crunchyroll.ui.animation;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import com.amazon.aps.iva.e.k;
import com.amazon.aps.iva.el.d0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.v1.s;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import kotlin.Metadata;
/* compiled from: AnimationUtil.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J4\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007J\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002J,\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\u001b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/ellation/crunchyroll/ui/animation/AnimationUtil;", "", "Landroid/view/View;", "swapOut", "swapIn", "Lcom/amazon/aps/iva/kb0/q;", "fadeSwap", "", "duration", "fadeSwapWithDuration", "view", "Landroid/animation/TimeInterpolator;", "interpolator", "Lkotlin/Function0;", "onAnimationEnd", "fadeIn", "fadeOut", "Landroid/content/Context;", "context", "pulse", "fadeOutView", "fadeInView", "fadeInAndOut", "hideViewWithFade", "showViewWithFade", "", "targetHeight", "slideDown", "slideUp", "FADE_DURATION", "J", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AnimationUtil {
    public static final int $stable = 0;
    private static final long FADE_DURATION = 300;
    public static final AnimationUtil INSTANCE = new AnimationUtil();

    private AnimationUtil() {
    }

    public static final void fadeIn(View view) {
        j.f(view, "view");
        fadeIn$default(view, 0L, null, null, 14, null);
    }

    public static /* synthetic */ void fadeIn$default(View view, long j, TimeInterpolator timeInterpolator, a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = FADE_DURATION;
        }
        if ((i & 4) != 0) {
            timeInterpolator = new DecelerateInterpolator();
        }
        if ((i & 8) != 0) {
            aVar = AnimationUtil$fadeIn$1.INSTANCE;
        }
        fadeIn(view, j, timeInterpolator, aVar);
    }

    public static final void fadeIn$lambda$1(a aVar) {
        j.f(aVar, "$onAnimationEnd");
        aVar.invoke();
    }

    public static final void fadeOut(View view) {
        j.f(view, "view");
        fadeOut$default(view, 0L, 2, null);
    }

    public static /* synthetic */ void fadeOut$default(View view, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = FADE_DURATION;
        }
        fadeOut(view, j);
    }

    public static final void fadeOut$lambda$2(a aVar) {
        j.f(aVar, "$onAnimationEnd");
        aVar.invoke();
    }

    public static final void fadeOut$lambda$3(View view) {
        j.f(view, "$view");
        view.setVisibility(8);
        view.setAlpha(1.0f);
    }

    public static final void fadeSwap(View view, View view2) {
        j.f(view, "swapOut");
        j.f(view2, "swapIn");
        fadeSwapWithDuration$default(INSTANCE, view, view2, 0L, 4, null);
    }

    private final void fadeSwapWithDuration(final View view, final View view2, final long j) {
        if (view2.getVisibility() == 0) {
            return;
        }
        view.animate().setInterpolator(new AccelerateInterpolator()).alpha(0.0f).withEndAction(new Runnable() { // from class: com.amazon.aps.iva.v50.a
            @Override // java.lang.Runnable
            public final void run() {
                AnimationUtil.fadeSwapWithDuration$lambda$0(view, view2, j);
            }
        }).setDuration(j).start();
    }

    public static /* synthetic */ void fadeSwapWithDuration$default(AnimationUtil animationUtil, View view, View view2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 250;
        }
        animationUtil.fadeSwapWithDuration(view, view2, j);
    }

    public static final void fadeSwapWithDuration$lambda$0(View view, View view2, long j) {
        j.f(view, "$swapOut");
        j.f(view2, "$swapIn");
        view.setVisibility(8);
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setVisibility(0);
        view2.animate().setInterpolator(new DecelerateInterpolator()).alpha(1.0f).setDuration(j).start();
    }

    public static final void hideViewWithFade$lambda$4(View view) {
        j.f(view, "$view");
        view.setVisibility(4);
    }

    public final void fadeInAndOut(View view, View view2) {
        j.f(view, "fadeOutView");
        j.f(view2, "fadeInView");
        fadeOut$default(view, 0L, 2, null);
        fadeIn$default(view2, 0L, null, null, 14, null);
    }

    public final void hideViewWithFade(View view) {
        j.f(view, "view");
        view.animate().alpha(0.0f).withEndAction(new k(view, 11)).start();
    }

    public final void pulse(Context context, View view) {
        j.f(context, "context");
        j.f(view, "view");
        view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.pulse));
    }

    public final void showViewWithFade(View view) {
        j.f(view, "view");
        view.setVisibility(0);
        view.animate().alpha(1.0f).start();
    }

    public final void slideDown(final View view, final int i) {
        j.f(view, "view");
        Animation animation = new Animation() { // from class: com.ellation.crunchyroll.ui.animation.AnimationUtil$slideDown$animation$1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                boolean z;
                int i2;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (f == 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = -2;
                } else {
                    i2 = (int) (i * f);
                    View view2 = view;
                    if (i2 > 0) {
                        view2.setVisibility(0);
                    }
                }
                layoutParams.height = i2;
                view.requestLayout();
            }

            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(500L);
        view.startAnimation(animation);
    }

    public final void slideUp(final View view) {
        j.f(view, "view");
        final int measuredHeight = view.getMeasuredHeight();
        Animation animation = new Animation() { // from class: com.ellation.crunchyroll.ui.animation.AnimationUtil$slideUp$animation$1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                boolean z;
                j.f(transformation, "t");
                if (f == 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    view.setVisibility(8);
                    view.getLayoutParams().height = -2;
                } else {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i = measuredHeight;
                    layoutParams.height = i - ((int) (i * f));
                }
                view.requestLayout();
            }

            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setDuration(500L);
        view.startAnimation(animation);
    }

    public static final void fadeIn(View view, long j) {
        j.f(view, "view");
        fadeIn$default(view, j, null, null, 12, null);
    }

    public final void fadeOut(View view, long j, TimeInterpolator timeInterpolator, a<q> aVar) {
        j.f(view, "view");
        j.f(timeInterpolator, "interpolator");
        j.f(aVar, "onAnimationEnd");
        view.animate().setInterpolator(timeInterpolator).alpha(0.0f).setDuration(j).withEndAction(new s(1, aVar)).start();
    }

    public static final void fadeIn(View view, long j, TimeInterpolator timeInterpolator) {
        j.f(view, "view");
        j.f(timeInterpolator, "interpolator");
        fadeIn$default(view, j, timeInterpolator, null, 8, null);
    }

    public static final void fadeIn(View view, long j, TimeInterpolator timeInterpolator, a<q> aVar) {
        j.f(view, "view");
        j.f(timeInterpolator, "interpolator");
        j.f(aVar, "onAnimationEnd");
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().setInterpolator(timeInterpolator).alpha(1.0f).setDuration(j).withEndAction(new e1(aVar, 7)).start();
    }

    public static final void fadeOut(View view, long j) {
        j.f(view, "view");
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().setInterpolator(new AccelerateInterpolator()).alpha(0.0f).withEndAction(new d0(view, 1)).setDuration(j).start();
    }
}
