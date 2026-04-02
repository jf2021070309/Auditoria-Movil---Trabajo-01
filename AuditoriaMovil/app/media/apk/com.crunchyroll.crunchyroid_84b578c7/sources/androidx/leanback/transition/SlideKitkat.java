package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
class SlideKitkat extends Visibility {
    public static final DecelerateInterpolator c = new DecelerateInterpolator();
    public static final AccelerateInterpolator d = new AccelerateInterpolator();
    public static final a e = new a();
    public static final b f = new b();
    public static final c g = new c();
    public static final d h = new d();
    public static final e i = new e();
    public static final f j = new f();
    public g b;

    /* loaded from: classes.dex */
    public static class a extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public final float a(View view) {
            return view.getTranslationX() - view.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends i {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public final float a(View view) {
            return view.getTranslationY() - view.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public final float a(View view) {
            return view.getTranslationX() + view.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends i {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public final float a(View view) {
            return view.getTranslationY() + view.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public final float a(View view) {
            if (view.getLayoutDirection() == 1) {
                return view.getTranslationX() + view.getWidth();
            }
            return view.getTranslationX() - view.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public static class f extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public final float a(View view) {
            if (view.getLayoutDirection() == 1) {
                return view.getTranslationX() - view.getWidth();
            }
            return view.getTranslationX() + view.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        float a(View view);

        float b(View view);

        Property<View, Float> c();
    }

    /* loaded from: classes.dex */
    public static abstract class h implements g {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public final float b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.leanback.transition.SlideKitkat.g
        public final Property<View, Float> c() {
            return View.TRANSLATION_X;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i implements g {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public final float b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.leanback.transition.SlideKitkat.g
        public final Property<View, Float> c() {
            return View.TRANSLATION_Y;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends AnimatorListenerAdapter {
        public boolean a = false;
        public float b;
        public final View c;
        public final float d;
        public final float e;
        public final int f;
        public final Property<View, Float> g;

        public j(View view, Property<View, Float> property, float f, float f2, int i) {
            this.g = property;
            this.c = view;
            this.e = f;
            this.d = f2;
            this.f = i;
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            View view = this.c;
            view.setTag(R.id.lb_slide_transition_value, new float[]{view.getTranslationX(), view.getTranslationY()});
            this.g.set(view, Float.valueOf(this.e));
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = this.a;
            View view = this.c;
            if (!z) {
                this.g.set(view, Float.valueOf(this.e));
            }
            view.setVisibility(this.f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Property<View, Float> property = this.g;
            View view = this.c;
            this.b = property.get(view).floatValue();
            property.set(view, Float.valueOf(this.d));
            view.setVisibility(this.f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            Float valueOf = Float.valueOf(this.b);
            Property<View, Float> property = this.g;
            View view = this.c;
            property.set(view, valueOf);
            view.setVisibility(0);
        }
    }

    public SlideKitkat() {
        b(80);
    }

    public static ObjectAnimator a(View view, Property property, float f2, float f3, float f4, BaseInterpolator baseInterpolator, int i2) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            if (View.TRANSLATION_Y == property) {
                f2 = fArr[1];
            } else {
                f2 = fArr[0];
            }
            view.setTag(R.id.lb_slide_transition_value, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f2, f3);
        j jVar = new j(view, property, f4, f3, i2);
        ofFloat.addListener(jVar);
        ofFloat.addPauseListener(jVar);
        ofFloat.setInterpolator(baseInterpolator);
        return ofFloat;
    }

    public final void b(int i2) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 48) {
                    if (i2 != 80) {
                        if (i2 != 8388611) {
                            if (i2 == 8388613) {
                                this.b = j;
                                return;
                            }
                            throw new IllegalArgumentException("Invalid slide direction");
                        }
                        this.b = i;
                        return;
                    }
                    this.b = h;
                    return;
                }
                this.b = f;
                return;
            }
            this.b = g;
            return;
        }
        this.b = e;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view;
        if (transitionValues2 != null) {
            view = transitionValues2.view;
        } else {
            view = null;
        }
        if (view == null) {
            return null;
        }
        float b2 = this.b.b(view);
        return a(view, this.b.c(), this.b.a(view), b2, b2, c, 0);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view;
        if (transitionValues != null) {
            view = transitionValues.view;
        } else {
            view = null;
        }
        if (view == null) {
            return null;
        }
        float b2 = this.b.b(view);
        return a(view, this.b.c(), b2, this.b.a(view), b2, d, 4);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.h);
        b(obtainStyledAttributes.getInt(3, 80));
        long j2 = obtainStyledAttributes.getInt(1, -1);
        if (j2 >= 0) {
            setDuration(j2);
        }
        long j3 = obtainStyledAttributes.getInt(2, -1);
        if (j3 > 0) {
            setStartDelay(j3);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }
}
