package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class y extends a0 {
    @Override // androidx.recyclerview.widget.a0
    public final int b(View view) {
        return this.a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int c(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return this.a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int d(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return this.a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int e(View view) {
        return this.a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int f() {
        return this.a.getWidth();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int g() {
        RecyclerView.p pVar = this.a;
        return pVar.getWidth() - pVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int h() {
        return this.a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int i() {
        return this.a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int j() {
        return this.a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int k() {
        return this.a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int l() {
        RecyclerView.p pVar = this.a;
        return (pVar.getWidth() - pVar.getPaddingLeft()) - pVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int m(View view) {
        RecyclerView.p pVar = this.a;
        Rect rect = this.c;
        pVar.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int n(View view) {
        RecyclerView.p pVar = this.a;
        Rect rect = this.c;
        pVar.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.a0
    public final void o(int i) {
        this.a.offsetChildrenHorizontal(i);
    }
}
