package com.ellation.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazon.aps.iva.p3.o;
import com.amazon.aps.iva.p3.q;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: NestedScrollCoordinatorLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ellation/widgets/NestedScrollCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/amazon/aps/iva/p3/o;", "", "enabled", "Lcom/amazon/aps/iva/kb0/q;", "setNestedScrollingEnabled", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NestedScrollCoordinatorLayout extends CoordinatorLayout implements o {
    public final q b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedScrollCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.b.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.b.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.b.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.b.e(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.b.h(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        j.f(view, "target");
        return dispatchNestedFling(f, f2, z);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        j.f(view, "target");
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        j.f(view, "target");
        j.f(iArr, "consumed");
        dispatchNestedPreScroll(i, i2, iArr, null);
        if (iArr[1] == 0) {
            super.onNestedPreScroll(view, i, i2, iArr, 0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, com.amazon.aps.iva.p3.r
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        j.f(view, "target");
        super.onNestedScroll(view, i, i2, i3, i4, i5);
        this.b.f(i, i2, i3, i4, null, i5, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, com.amazon.aps.iva.p3.r
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        j.f(view, "child");
        j.f(view2, "target");
        return this.b.j(i, i2) || super.onStartNestedScroll(view, view2, i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, com.amazon.aps.iva.p3.r
    public final void onStopNestedScroll(View view, int i) {
        j.f(view, "target");
        super.onStopNestedScroll(view, i);
        stopNestedScroll(i);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.b.i(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.b.j(i, 0);
    }

    @Override // com.amazon.aps.iva.p3.o
    public final void stopNestedScroll(int i) {
        this.b.k(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new q(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.b.k(0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        j.f(view, "child");
        j.f(view2, "target");
        return startNestedScroll(i) || super.onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        j.f(view, "target");
        super.onStopNestedScroll(view);
        stopNestedScroll();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, com.amazon.aps.iva.p3.r
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        j.f(view, "target");
        j.f(iArr, "consumed");
        this.b.c(i, i2, iArr, null, i3);
        if (iArr[1] == 0) {
            super.onNestedPreScroll(view, i, i2, iArr, i3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        j.f(view, "target");
        super.onNestedScroll(view, i, i2, i3, i4);
        dispatchNestedScroll(i, i2, i3, i4, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, com.amazon.aps.iva.p3.s
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        j.f(view, "target");
        j.f(iArr, "consumed");
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
        dispatchNestedScroll(i, i2, i3, i4, null);
        this.b.f(i, i2, i3, i4, null, i5, null);
    }
}
