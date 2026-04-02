package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import c.i.k.d0;
import c.i.k.y;
import c.i.l.k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import e.d.b.d.c.j;
import e.d.b.d.q.d;
import e.d.b.d.q.f;
import e.d.b.d.q.g;
import e.d.b.d.r.q;
import e.d.b.d.w.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class FloatingActionButton extends q implements y, k, e.d.b.d.p.a, n, CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f4646b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f4647c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f4648d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f4649e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f4650f;

    /* renamed from: g  reason: collision with root package name */
    public int f4651g;

    /* renamed from: h  reason: collision with root package name */
    public int f4652h;

    /* renamed from: i  reason: collision with root package name */
    public int f4653i;

    /* renamed from: j  reason: collision with root package name */
    public int f4654j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4655k;

    /* renamed from: l  reason: collision with root package name */
    public d f4656l;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4657b;

        public BaseBehavior() {
            this.f4657b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.d.b.d.b.f6319h);
            this.f4657b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public boolean B(FloatingActionButton floatingActionButton, Rect rect) {
            Objects.requireNonNull(floatingActionButton);
            floatingActionButton.getLeft();
            throw null;
        }

        public final boolean C(View view, FloatingActionButton floatingActionButton) {
            return this.f4657b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f332f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (C(appBarLayout, floatingActionButton)) {
                if (this.a == null) {
                    this.a = new Rect();
                }
                Rect rect = this.a;
                e.d.b.d.r.d.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.i(null, false);
                    return true;
                }
                floatingActionButton.m(null, false);
                return true;
            }
            return false;
        }

        public final boolean E(View view, FloatingActionButton floatingActionButton) {
            if (C(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.i(null, false);
                    return true;
                }
                floatingActionButton.m(null, false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return B((FloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void f(CoordinatorLayout.f fVar) {
            if (fVar.f334h == 0) {
                fVar.f334h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    E(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> d2 = coordinatorLayout.d(floatingActionButton);
            int size = d2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = d2.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && E(view2, floatingActionButton)) {
                        break;
                    }
                } else if (D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i2);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements e.d.b.d.v.b {
        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public class c<T extends FloatingActionButton> implements d.f {
        public final j<T> a;

        public c(j<T> jVar) {
            this.a = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.d.b.d.q.d.f
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.d.b.d.q.d.f
        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    private d getImpl() {
        if (this.f4656l == null) {
            this.f4656l = Build.VERSION.SDK_INT >= 21 ? new g(this, new b()) : new d(this, new b());
        }
        return this.f4656l;
    }

    @Override // e.d.b.d.p.a
    public boolean a() {
        throw null;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.w == null) {
            impl.w = new ArrayList<>();
        }
        impl.w.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.v == null) {
            impl.v = new ArrayList<>();
        }
        impl.v.add(animatorListener);
    }

    public void f(j<? extends FloatingActionButton> jVar) {
        d impl = getImpl();
        c cVar = new c(null);
        if (impl.x == null) {
            impl.x = new ArrayList<>();
        }
        impl.x.add(cVar);
    }

    @Deprecated
    public boolean g(Rect rect) {
        AtomicInteger atomicInteger = d0.a;
        if (d0.f.c(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            throw null;
        }
        return false;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f4646b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f4647c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f6492l;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f6493m;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.f4652h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public e.d.b.d.c.g getHideMotionSpec() {
        return getImpl().q;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f4650f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f4650f;
    }

    public e.d.b.d.w.j getShapeAppearanceModel() {
        e.d.b.d.w.j jVar = getImpl().f6488h;
        Objects.requireNonNull(jVar);
        return jVar;
    }

    public e.d.b.d.c.g getShowMotionSpec() {
        return getImpl().p;
    }

    public int getSize() {
        return this.f4651g;
    }

    public int getSizeDimension() {
        return h(this.f4651g);
    }

    @Override // c.i.k.y
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // c.i.k.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // c.i.l.k
    public ColorStateList getSupportImageTintList() {
        return this.f4648d;
    }

    @Override // c.i.l.k
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f4649e;
    }

    public boolean getUseCompatPadding() {
        return this.f4655k;
    }

    public final int h(int i2) {
        int i3 = this.f4652h;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        return i2 != -1 ? i2 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    public void i(a aVar, boolean z) {
        d impl = getImpl();
        e.d.b.d.q.a aVar2 = aVar == null ? null : new e.d.b.d.q.a(this, aVar);
        if (impl.g()) {
            return;
        }
        Animator animator = impl.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.r()) {
            impl.y.b(z ? 8 : 4, z);
            if (aVar2 != null) {
                aVar2.a.a(aVar2.f6476b);
                return;
            }
            return;
        }
        e.d.b.d.c.g gVar = impl.q;
        AnimatorSet b2 = gVar != null ? impl.b(gVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f);
        b2.addListener(new e.d.b.d.q.b(impl, z, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b2.addListener(it.next());
            }
        }
        b2.start();
    }

    public boolean j() {
        return getImpl().g();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public boolean k() {
        return getImpl().h();
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f4648d;
        if (colorStateList == null) {
            c.i.a.l(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f4649e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(c.b.i.j.c(colorForState, mode));
    }

    public void m(a aVar, boolean z) {
        d impl = getImpl();
        e.d.b.d.q.a aVar2 = aVar == null ? null : new e.d.b.d.q.a(this, aVar);
        if (impl.h()) {
            return;
        }
        Animator animator = impl.o;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.p == null;
        if (!impl.r()) {
            impl.y.b(0, z);
            impl.y.setAlpha(1.0f);
            impl.y.setScaleY(1.0f);
            impl.y.setScaleX(1.0f);
            impl.o(1.0f);
            if (aVar2 != null) {
                aVar2.a.b(aVar2.f6476b);
                return;
            }
            return;
        }
        if (impl.y.getVisibility() != 0) {
            impl.y.setAlpha(0.0f);
            impl.y.setScaleY(z2 ? 0.4f : 0.0f);
            impl.y.setScaleX(z2 ? 0.4f : 0.0f);
            impl.o(z2 ? 0.4f : 0.0f);
        }
        e.d.b.d.c.g gVar = impl.p;
        AnimatorSet b2 = gVar != null ? impl.b(gVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f);
        b2.addListener(new e.d.b.d.q.c(impl, z, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b2.addListener(it.next());
            }
        }
        b2.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        Objects.requireNonNull(impl);
        if (!(impl instanceof g)) {
            ViewTreeObserver viewTreeObserver = impl.y.getViewTreeObserver();
            if (impl.E == null) {
                impl.E = new f(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.E);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.E = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        this.f4653i = (getSizeDimension() - this.f4654j) / 2;
        getImpl().u();
        throw null;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f369b);
        Objects.requireNonNull(extendableSavedState.f4668c.getOrDefault("expandableWidgetHelper", null));
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        AbsSavedState absSavedState = AbsSavedState.a;
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4646b != colorStateList) {
            this.f4646b = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f4647c != mode) {
            this.f4647c = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f2) {
        d impl = getImpl();
        if (impl.f6491k != f2) {
            impl.f6491k = f2;
            impl.l(f2, impl.f6492l, impl.f6493m);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        d impl = getImpl();
        if (impl.f6492l != f2) {
            impl.f6492l = f2;
            impl.l(impl.f6491k, f2, impl.f6493m);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        d impl = getImpl();
        if (impl.f6493m != f2) {
            impl.f6493m = f2;
            impl.l(impl.f6491k, impl.f6492l, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i2 != this.f4652h) {
            this.f4652h = i2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f6489i) {
            getImpl().f6489i = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        throw null;
    }

    public void setHideMotionSpec(e.d.b.d.c.g gVar) {
        getImpl().q = gVar;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(e.d.b.d.c.g.b(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.o(impl.s);
            if (this.f4648d != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        throw null;
    }

    public void setMaxImageSize(int i2) {
        this.f4654j = i2;
        d impl = getImpl();
        if (impl.t != i2) {
            impl.t = i2;
            impl.o(impl.s);
        }
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f4650f != colorStateList) {
            this.f4650f = colorStateList;
            getImpl().p(this.f4650f);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().m();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().m();
    }

    public void setShadowPaddingEnabled(boolean z) {
        d impl = getImpl();
        impl.f6490j = z;
        impl.u();
        throw null;
    }

    @Override // e.d.b.d.w.n
    public void setShapeAppearanceModel(e.d.b.d.w.j jVar) {
        getImpl().f6488h = jVar;
    }

    public void setShowMotionSpec(e.d.b.d.c.g gVar) {
        getImpl().p = gVar;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(e.d.b.d.c.g.b(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f4652h = 0;
        if (i2 != this.f4651g) {
            this.f4651g = i2;
            requestLayout();
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // c.i.l.k
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f4648d != colorStateList) {
            this.f4648d = colorStateList;
            l();
        }
    }

    @Override // c.i.l.k
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f4649e != mode) {
            this.f4649e = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().n();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().n();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().n();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4655k != z) {
            this.f4655k = z;
            getImpl().j();
        }
    }

    @Override // e.d.b.d.r.q, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }
}
