package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import c.i.k.d0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.d.b.d.a;
import e.d.b.d.f.b;
import e.d.b.d.f.c;
import e.d.b.d.f.d;
import e.d.b.d.f.f;
import e.d.b.d.f.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int P = 0;
    public Integer U;
    public Animator V;
    public Animator W;
    public int a0;
    public int b0;
    public boolean c0;
    public int d0;
    public int e0;
    public boolean f0;
    public Behavior g0;

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f4548e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f4549f;

        /* renamed from: g  reason: collision with root package name */
        public int f4550g;

        /* renamed from: h  reason: collision with root package name */
        public final View.OnLayoutChangeListener f4551h;

        /* loaded from: classes2.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (Behavior.this.f4549f.get() == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Behavior.this.f4548e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
            this.f4551h = new a();
            this.f4548e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4551h = new a();
            this.f4548e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f4549f = new WeakReference<>(bottomAppBar);
            int i3 = BottomAppBar.P;
            View y = bottomAppBar.y();
            if (y != null) {
                AtomicInteger atomicInteger = d0.a;
                if (!d0.f.c(y)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) y.getLayoutParams();
                    fVar.f330d = 49;
                    this.f4550g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                    if (y instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) y;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f4551h);
                        floatingActionButton.d(null);
                        floatingActionButton.e(new f(bottomAppBar));
                        floatingActionButton.f(null);
                    }
                    bottomAppBar.C();
                    throw null;
                }
            }
            coordinatorLayout.r(bottomAppBar, i2);
            this.a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i2 == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f4552c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4553d;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4552c = parcel.readInt();
            this.f4553d = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            parcel.writeInt(this.f4552c);
            parcel.writeInt(this.f4553d ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return A(this.a0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f6374c;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private g getTopEdgeTreatment() {
        throw null;
    }

    public static void w(BottomAppBar bottomAppBar) {
        bottomAppBar.d0--;
    }

    public final float A(int i2) {
        boolean N = a.N(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) + 0) * (N ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean B() {
        FloatingActionButton x = x();
        return x != null && x.k();
    }

    public final void C() {
        getTopEdgeTreatment().f6375d = getFabTranslationX();
        y();
        if (this.f0) {
            B();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.g0 == null) {
            this.g0 = new Behavior();
        }
        return this.g0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f6374c;
    }

    public int getFabAlignmentMode() {
        return this.a0;
    }

    public int getFabAnimationMode() {
        return this.b0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f6373b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().a;
    }

    public boolean getHideOnScroll() {
        return this.c0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.d0(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.V;
            if (animator2 != null) {
                animator2.cancel();
            }
            C();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.W != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (B()) {
            actionMenuView.setTranslationX(z(actionMenuView, this.a0, this.f0));
        } else {
            actionMenuView.setTranslationX(z(actionMenuView, 0, false));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f369b);
        this.a0 = savedState.f4552c;
        this.f0 = savedState.f4553d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4552c = this.a0;
        savedState.f4553d = this.f0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        c.i.a.j0(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            g topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
            topEdgeTreatment.f6374c = f2;
            throw null;
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        throw null;
    }

    public void setFabAlignmentMode(int i2) {
        int i3;
        this.e0 = 0;
        boolean z = this.f0;
        AtomicInteger atomicInteger = d0.a;
        if (d0.f.c(this)) {
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (B()) {
                i3 = i2;
            } else {
                z = false;
                i3 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - z(actionMenuView, i3, z)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new d(this, actionMenuView, i3, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.W = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.W.start();
        } else {
            int i4 = this.e0;
            if (i4 != 0) {
                this.e0 = 0;
                getMenu().clear();
                n(i4);
            }
        }
        if (this.a0 != i2 && d0.f.c(this)) {
            Animator animator2 = this.V;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.b0 == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x(), "translationX", A(i2));
                ofFloat3.setDuration(300L);
                arrayList2.add(ofFloat3);
            } else {
                FloatingActionButton x = x();
                if (x != null && !x.j()) {
                    this.d0++;
                    x.i(new b(this, i2), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.V = animatorSet3;
            animatorSet3.addListener(new e.d.b.d.f.a(this));
            this.V.start();
        }
        this.a0 = i2;
    }

    public void setFabAnimationMode(int i2) {
        this.b0 = i2;
    }

    public void setFabCornerSize(float f2) {
        if (f2 == getTopEdgeTreatment().f6376e) {
            return;
        }
        getTopEdgeTreatment().f6376e = f2;
        throw null;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f6373b = f2;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().a = f2;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.c0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.U != null) {
            drawable = c.i.a.q0(drawable.mutate());
            c.i.a.i0(drawable, this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.U = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final FloatingActionButton x() {
        View y = y();
        if (y instanceof FloatingActionButton) {
            return (FloatingActionButton) y;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View y() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.f(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.y():android.view.View");
    }

    public int z(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 == 1 && z) {
            boolean N = a.N(this);
            int measuredWidth = N ? getMeasuredWidth() : 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                    measuredWidth = N ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
            }
            return measuredWidth - ((N ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
        }
        return 0;
    }
}
