package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {
    public static final DecelerateInterpolator f = new DecelerateInterpolator();
    public static final a g = new a();
    public static final b h = new b();
    public static final c i = new c();
    public static final d j = new d();
    public static final e k = new e();
    public g b;
    public Visibility c;
    public final float d;
    public final f e;

    /* loaded from: classes.dex */
    public static class a extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public final float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                return fadeAndShortSlide.a(viewGroup) + view.getTranslationX();
            }
            return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public final float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
            }
            return view.getTranslationX() + fadeAndShortSlide.a(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public final float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int centerX;
            int width = (view.getWidth() / 2) + iArr[0];
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = fadeAndShortSlide.getEpicenter();
            if (epicenter == null) {
                centerX = (viewGroup.getWidth() / 2) + iArr[0];
            } else {
                centerX = epicenter.centerX();
            }
            if (width < centerX) {
                return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
            }
            return fadeAndShortSlide.a(viewGroup) + view.getTranslationX();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public final float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return fadeAndShortSlide.b(viewGroup) + view.getTranslationY();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public final float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() - fadeAndShortSlide.b(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public class f extends g {
        public f() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public final float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int centerY;
            int height = (view.getHeight() / 2) + iArr[1];
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = FadeAndShortSlide.this.getEpicenter();
            if (epicenter == null) {
                centerY = (viewGroup.getHeight() / 2) + iArr[1];
            } else {
                centerY = epicenter.centerY();
            }
            if (height < centerY) {
                return view.getTranslationY() - fadeAndShortSlide.b(viewGroup);
            }
            return fadeAndShortSlide.b(viewGroup) + view.getTranslationY();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationX();
        }

        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY();
        }
    }

    public FadeAndShortSlide() {
        this.c = new Fade();
        this.d = -1.0f;
        this.e = new f();
        c(8388611);
    }

    public final float a(ViewGroup viewGroup) {
        float f2 = this.d;
        if (f2 < 0.0f) {
            return viewGroup.getWidth() / 4;
        }
        return f2;
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.c.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final float b(ViewGroup viewGroup) {
        float f2 = this.d;
        if (f2 < 0.0f) {
            return viewGroup.getHeight() / 4;
        }
        return f2;
    }

    public final void c(int i2) {
        if (i2 != 48) {
            if (i2 != 80) {
                if (i2 != 112) {
                    if (i2 != 8388611) {
                        if (i2 != 8388613) {
                            if (i2 == 8388615) {
                                this.b = i;
                                return;
                            }
                            throw new IllegalArgumentException("Invalid slide direction");
                        }
                        this.b = h;
                        return;
                    }
                    this.b = g;
                    return;
                }
                this.b = this.e;
                return;
            }
            this.b = j;
            return;
        }
        this.b = k;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        this.c.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        this.c.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i2 = iArr[0];
        int i3 = iArr[1];
        float translationX = view.getTranslationX();
        ObjectAnimator a2 = com.amazon.aps.iva.e5.b.a(view, transitionValues2, i2, i3, this.b.a(this, viewGroup, view, iArr), this.b.b(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f, this);
        Animator onAppear = this.c.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (a2 == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return a2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a2).with(onAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        ObjectAnimator a2 = com.amazon.aps.iva.e5.b.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.b.a(this, viewGroup, view, iArr), this.b.b(this, viewGroup, view, iArr), f, this);
        Animator onDisappear = this.c.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (a2 == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return a2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a2).with(onDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.c.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.c.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.c = (Visibility) this.c.clone();
        return fadeAndShortSlide;
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Fade();
        this.d = -1.0f;
        this.e = new f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.h);
        c(obtainStyledAttributes.getInt(3, 8388611));
        obtainStyledAttributes.recycle();
    }
}
