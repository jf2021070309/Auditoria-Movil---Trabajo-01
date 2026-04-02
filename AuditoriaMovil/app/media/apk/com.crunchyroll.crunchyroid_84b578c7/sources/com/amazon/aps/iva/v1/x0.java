package com.amazon.aps.iva.v1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Set;
/* compiled from: AndroidViewsHandler.android.kt */
/* loaded from: classes.dex */
public final class x0 extends ViewGroup {
    public final HashMap<com.amazon.aps.iva.p2.a, androidx.compose.ui.node.e> b;
    public final HashMap<androidx.compose.ui.node.e, com.amazon.aps.iva.p2.a> c;

    public x0(Context context) {
        super(context);
        setClipChildren(false);
        this.b = new HashMap<>();
        this.c = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<com.amazon.aps.iva.p2.a, androidx.compose.ui.node.e> getHolderToLayoutNode() {
        return this.b;
    }

    public final HashMap<androidx.compose.ui.node.e, com.amazon.aps.iva.p2.a> getLayoutNodeToHolder() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(View view, View view2) {
        com.amazon.aps.iva.yb0.j.f(view, "child");
        com.amazon.aps.iva.yb0.j.f(view2, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<com.amazon.aps.iva.p2.a> keySet = this.b.keySet();
        com.amazon.aps.iva.yb0.j.e(keySet, "holderToLayoutNode.keys");
        for (com.amazon.aps.iva.p2.a aVar : keySet) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                z2 = false;
            }
            if (z2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                Set<com.amazon.aps.iva.p2.a> keySet = this.b.keySet();
                com.amazon.aps.iva.yb0.j.e(keySet, "holderToLayoutNode.keys");
                for (com.amazon.aps.iva.p2.a aVar : keySet) {
                    int i4 = aVar.s;
                    if (i4 != Integer.MIN_VALUE && (i3 = aVar.t) != Integer.MIN_VALUE) {
                        aVar.measure(i4, i3);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            androidx.compose.ui.node.e eVar = this.b.get(childAt);
            if (childAt.isLayoutRequested() && eVar != null) {
                androidx.compose.ui.node.e.U(eVar, false, 3);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
