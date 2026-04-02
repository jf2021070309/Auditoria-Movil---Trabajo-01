package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class z extends a0 {
    @Override // androidx.recyclerview.widget.a0
    public final int b(View view) {
        return this.a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int c(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return this.a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int d(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return this.a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int e(View view) {
        return this.a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int f() {
        return this.a.getHeight();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int g() {
        RecyclerView.p pVar = this.a;
        return pVar.getHeight() - pVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int h() {
        return this.a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int i() {
        return this.a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int j() {
        return this.a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int k() {
        return this.a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int l() {
        RecyclerView.p pVar = this.a;
        return (pVar.getHeight() - pVar.getPaddingTop()) - pVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int m(View view) {
        RecyclerView.p pVar = this.a;
        Rect rect = this.c;
        pVar.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int n(View view) {
        RecyclerView.p pVar = this.a;
        Rect rect = this.c;
        pVar.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.a0
    public final void o(int i) {
        this.a.offsetChildrenVertical(i);
    }
}
