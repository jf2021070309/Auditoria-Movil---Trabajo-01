package com.ellation.widgets.behavior;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: HideBottomViewOnScrollBehavior.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ellation/widgets/behavior/HideBottomViewOnScrollBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HideBottomViewOnScrollBehavior extends CoordinatorLayout.c<View> {
    public int b;
    public a c;
    public l<? super View, q> d;

    /* compiled from: HideBottomViewOnScrollBehavior.kt */
    @SuppressLint({"Recycle"})
    /* loaded from: classes2.dex */
    public static final class a extends ValueAnimator {
        public static final /* synthetic */ int d = 0;
        public final View b;
        public final int c;

        public a(View view, int i) {
            j.f(view, "child");
            this.b = view;
            this.c = i;
            setInterpolator(new DecelerateInterpolator());
            setDuration(150L);
            addUpdateListener(new com.amazon.aps.iva.x00.a(this, 1));
        }
    }

    /* compiled from: HideBottomViewOnScrollBehavior.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            View view2 = view;
            j.f(view2, "target");
            HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = HideBottomViewOnScrollBehavior.this;
            ((RecyclerView) view2).addOnScrollListener(new com.ellation.widgets.behavior.a(hideBottomViewOnScrollBehavior));
            hideBottomViewOnScrollBehavior.d = com.ellation.widgets.behavior.b.h;
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        this.d = new b();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z;
        float min;
        j.f(coordinatorLayout, "coordinatorLayout");
        j.f(view, "child");
        j.f(view2, "target");
        j.f(iArr, "consumed");
        super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr, i3);
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        float f = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float translationY = view.getTranslationY();
        RecyclerView recyclerView = (RecyclerView) view2;
        boolean z2 = true;
        if (view.getHeight() >= recyclerView.computeVerticalScrollOffset()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            min = Math.min(f, translationY + i2);
        } else {
            if (view.getHeight() < recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset())) {
                z2 = false;
            }
            if (z2) {
                min = Math.min(f, translationY - i2);
            } else {
                min = Math.min(f, translationY + Math.abs(i2));
            }
        }
        view.setTranslationY(Math.max(0.0f, min));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        j.f(coordinatorLayout, "coordinatorLayout");
        j.f(view, "child");
        j.f(view2, "target");
        j.f(iArr, "consumed");
        super.onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4, i5, iArr);
        this.d.invoke(view2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        j.f(coordinatorLayout, "coordinatorLayout");
        j.f(view, "child");
        j.f(view2, "directTargetChild");
        j.f(view3, "target");
        if (i == 2) {
            this.b = i2;
            a aVar = this.c;
            if (aVar != null) {
                aVar.cancel();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        boolean z;
        float f;
        boolean z2;
        j.f(coordinatorLayout, "coordinatorLayout");
        j.f(view, "child");
        j.f(view2, "target");
        if (this.b == 0 || i == 1) {
            a aVar = this.c;
            if (aVar == null) {
                int measuredHeight = view.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                aVar = new a(view, measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            }
            this.c = aVar;
            if (view2.canScrollVertically(-1) && view2.canScrollVertically(1)) {
                z = false;
            } else {
                z = true;
            }
            aVar.cancel();
            if (z) {
                f = 0.0f;
            } else {
                f = aVar.c;
            }
            View view3 = aVar.b;
            if (view3.getTranslationY() == f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                aVar.setFloatValues(view3.getTranslationY(), f);
                aVar.start();
            }
        }
    }
}
