package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class b0 extends f0 {
    public z a;
    public y b;

    /* compiled from: PagerSnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends u {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.u
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.u
        public final int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.a0
        public final void onTargetFound(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            b0 b0Var2 = b0.this;
            int[] calculateDistanceToFinalSnap = b0Var2.calculateDistanceToFinalSnap(b0Var2.mRecyclerView.getLayoutManager(), view);
            int i = calculateDistanceToFinalSnap[0];
            int i2 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                aVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
            }
        }
    }

    public static int a(View view, a0 a0Var) {
        return ((a0Var.c(view) / 2) + a0Var.e(view)) - ((a0Var.l() / 2) + a0Var.k());
    }

    public static View b(RecyclerView.p pVar, a0 a0Var) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l = (a0Var.l() / 2) + a0Var.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = pVar.getChildAt(i2);
            int abs = Math.abs(((a0Var.c(childAt) / 2) + a0Var.e(childAt)) - l);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    public final a0 c(RecyclerView.p pVar) {
        y yVar = this.b;
        if (yVar == null || yVar.a != pVar) {
            this.b = new y(pVar);
        }
        return this.b;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.canScrollHorizontally()) {
            iArr[0] = a(view, c(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.canScrollVertically()) {
            iArr[1] = a(view, d(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.f0
    public final RecyclerView.a0 createScroller(RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.a0.b)) {
            return null;
        }
        return new a(this.mRecyclerView.getContext());
    }

    public final a0 d(RecyclerView.p pVar) {
        z zVar = this.a;
        if (zVar == null || zVar.a != pVar) {
            this.a = new z(pVar);
        }
        return this.a;
    }

    @Override // androidx.recyclerview.widget.f0
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return b(pVar, d(pVar));
        }
        if (pVar.canScrollHorizontally()) {
            return b(pVar, c(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.f0
    @SuppressLint({"UnknownNullness"})
    public final int findTargetSnapPosition(RecyclerView.p pVar, int i, int i2) {
        a0 a0Var;
        boolean z;
        PointF computeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (pVar.canScrollVertically()) {
            a0Var = d(pVar);
        } else if (pVar.canScrollHorizontally()) {
            a0Var = c(pVar);
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            return -1;
        }
        int childCount = pVar.getChildCount();
        boolean z2 = false;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = pVar.getChildAt(i5);
            if (childAt != null) {
                int a2 = a(childAt, a0Var);
                if (a2 <= 0 && a2 > i4) {
                    view2 = childAt;
                    i4 = a2;
                }
                if (a2 >= 0 && a2 < i3) {
                    view = childAt;
                    i3 = a2;
                }
            }
        }
        int i6 = 1;
        if (!pVar.canScrollHorizontally() ? i2 > 0 : i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && view != null) {
            return pVar.getPosition(view);
        }
        if (!z && view2 != null) {
            return pVar.getPosition(view2);
        }
        if (z) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = pVar.getPosition(view);
        int itemCount2 = pVar.getItemCount();
        if ((pVar instanceof RecyclerView.a0.b) && (computeScrollVectorForPosition = ((RecyclerView.a0.b) pVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
            z2 = true;
        }
        if (z2 == z) {
            i6 = -1;
        }
        int i7 = position + i6;
        if (i7 < 0 || i7 >= itemCount) {
            return -1;
        }
        return i7;
    }
}
