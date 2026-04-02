package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.amazon.aps.iva.q3.l;
import com.google.common.primitives.Ints;
import java.util.Arrays;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean a;
    public int b;
    public int[] c;
    public View[] d;
    public final SparseIntArray e;
    public final SparseIntArray f;
    public c g;
    public final Rect h;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int b(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        public final int a(int i, int i2) {
            int c = c(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int c2 = c(i5);
                i3 += c2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = c2;
                }
            }
            if (i3 + c > i2) {
                return i4 + 1;
            }
            return i4;
        }

        public int b(int i, int i2) {
            int c = c(i);
            if (c == i2) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int c2 = c(i4);
                i3 += c2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = c2;
                }
            }
            if (c + i3 > i2) {
                return 0;
            }
            return i3;
        }

        public abstract int c(int i);

        public final void d() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        g(RecyclerView.p.getProperties(context, attributeSet, i, i2).b);
    }

    public final void a(int i) {
        int i2;
        int[] iArr = this.c;
        int i3 = this.b;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    public final int b(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.c;
            int i3 = this.b;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.c;
        return iArr2[i2 + i] - iArr2[i];
    }

    public final int c(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!b0Var.g) {
            return this.g.a(i, this.b);
        }
        int b2 = wVar.b(i);
        if (b2 == -1) {
            return 0;
        }
        return this.g.a(b2, this.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        boolean z;
        int i = this.b;
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = cVar.d;
            if (i3 >= 0 && i3 < b0Var.b()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i > 0) {
                int i4 = cVar.d;
                ((p.b) cVar2).a(i4, Math.max(0, cVar.g));
                i -= this.g.c(i4);
                cVar.d += cVar.e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return super.computeHorizontalScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return super.computeHorizontalScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return super.computeVerticalScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return super.computeVerticalScrollRange(b0Var);
    }

    public final int d(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!b0Var.g) {
            return this.g.b(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b2 = wVar.b(i);
        if (b2 == -1) {
            return 0;
        }
        return this.g.b(b2, this.b);
    }

    public final int e(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!b0Var.g) {
            return this.g.c(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b2 = wVar.b(i);
        if (b2 == -1) {
            return 1;
        }
        return this.g.c(b2);
    }

    public final void f(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean shouldMeasureChild;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int b2 = b(bVar.e, bVar.f);
        if (this.mOrientation == 1) {
            i3 = RecyclerView.p.getChildMeasureSpec(b2, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.p.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.p.getChildMeasureSpec(b2, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.p.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z) {
            shouldMeasureChild = shouldReMeasureChild(view, i3, i2, qVar);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i3, i2, qVar);
        }
        if (shouldMeasureChild) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount = getChildCount();
        int i3 = 1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount;
            i2 = 0;
        }
        int b2 = b0Var.b();
        ensureLayoutState();
        int k = this.mOrientationHelper.k();
        int g = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < b2 && d(position, wVar, b0Var) == 0) {
                if (((RecyclerView.q) childAt.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.e(childAt) < g && this.mOrientationHelper.b(childAt) >= k) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public final void g(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i >= 1) {
            this.b = i;
            this.g.d();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Span count should be at least 1. Provided ", i));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 1) {
            return this.b;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return c(b0Var.b() - 1, wVar, b0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 0) {
            return this.b;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return c(b0Var.b() - 1, wVar, b0Var) + 1;
    }

    public final void h() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        a(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int d;
        int paddingLeft;
        int d2;
        int i13;
        int i14;
        int childMeasureSpec;
        int i15;
        boolean z3;
        boolean z4;
        View b2;
        int j = this.mOrientationHelper.j();
        if (j != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (getChildCount() > 0) {
            i = this.c[this.b];
        } else {
            i = 0;
        }
        if (z) {
            h();
        }
        if (cVar.e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i16 = this.b;
        if (!z2) {
            i16 = d(cVar.d, wVar, b0Var) + e(cVar.d, wVar, b0Var);
        }
        int i17 = 0;
        while (i17 < this.b) {
            int i18 = cVar.d;
            if (i18 >= 0 && i18 < b0Var.b()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 || i16 <= 0) {
                break;
            }
            int i19 = cVar.d;
            int e = e(i19, wVar, b0Var);
            if (e <= this.b) {
                i16 -= e;
                if (i16 < 0 || (b2 = cVar.b(wVar)) == null) {
                    break;
                }
                this.d[i17] = b2;
                i17++;
            } else {
                throw new IllegalArgumentException(defpackage.e.f(com.amazon.aps.iva.b6.x.a("Item at position ", i19, " requires ", e, " spans but GridLayoutManager has only "), this.b, " spans."));
            }
        }
        if (i17 == 0) {
            bVar.b = true;
            return;
        }
        if (z2) {
            i4 = 1;
            i3 = i17;
            i2 = 0;
        } else {
            i2 = i17 - 1;
            i3 = -1;
            i4 = -1;
        }
        int i20 = 0;
        while (i2 != i3) {
            View view = this.d[i2];
            b bVar2 = (b) view.getLayoutParams();
            int e2 = e(getPosition(view), wVar, b0Var);
            bVar2.f = e2;
            bVar2.e = i20;
            i20 += e2;
            i2 += i4;
        }
        float f = 0.0f;
        int i21 = 0;
        for (int i22 = 0; i22 < i17; i22++) {
            View view2 = this.d[i22];
            if (cVar.k == null) {
                if (z2) {
                    addView(view2);
                    z3 = false;
                } else {
                    z3 = false;
                    addView(view2, 0);
                }
            } else {
                z3 = false;
                if (z2) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            }
            calculateItemDecorationsForChild(view2, this.h);
            f(view2, j, z3);
            int c2 = this.mOrientationHelper.c(view2);
            if (c2 > i21) {
                i21 = c2;
            }
            float d3 = (this.mOrientationHelper.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f;
            if (d3 > f) {
                f = d3;
            }
        }
        if (z) {
            a(Math.max(Math.round(f * this.b), i));
            i21 = 0;
            for (int i23 = 0; i23 < i17; i23++) {
                View view3 = this.d[i23];
                f(view3, Ints.MAX_POWER_OF_TWO, true);
                int c3 = this.mOrientationHelper.c(view3);
                if (c3 > i21) {
                    i21 = c3;
                }
            }
        }
        for (int i24 = 0; i24 < i17; i24++) {
            View view4 = this.d[i24];
            if (this.mOrientationHelper.c(view4) != i21) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.b;
                int i25 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i26 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int b3 = b(bVar3.e, bVar3.f);
                if (this.mOrientation == 1) {
                    i15 = RecyclerView.p.getChildMeasureSpec(b3, Ints.MAX_POWER_OF_TWO, i26, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i25, Ints.MAX_POWER_OF_TWO);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, Ints.MAX_POWER_OF_TWO);
                    childMeasureSpec = RecyclerView.p.getChildMeasureSpec(b3, Ints.MAX_POWER_OF_TWO, i25, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i15 = makeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, i15, childMeasureSpec, (RecyclerView.q) view4.getLayoutParams())) {
                    view4.measure(i15, childMeasureSpec);
                }
            }
        }
        int i27 = 0;
        bVar.a = i21;
        if (this.mOrientation == 1) {
            if (cVar.f == -1) {
                i14 = cVar.b;
                i13 = i14 - i21;
            } else {
                int i28 = cVar.b;
                i13 = i28;
                i14 = i21 + i28;
            }
            i8 = 0;
            i7 = i13;
            i9 = i14;
            i6 = 0;
        } else {
            if (cVar.f == -1) {
                i6 = cVar.b;
                i5 = i6 - i21;
            } else {
                int i29 = cVar.b;
                i5 = i29;
                i6 = i21 + i29;
            }
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        while (i27 < i17) {
            View view5 = this.d[i27];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    d2 = getPaddingLeft() + this.c[this.b - bVar4.e];
                    paddingLeft = d2 - this.mOrientationHelper.d(view5);
                } else {
                    paddingLeft = this.c[bVar4.e] + getPaddingLeft();
                    d2 = this.mOrientationHelper.d(view5) + paddingLeft;
                }
                i11 = paddingLeft;
                i12 = i7;
                d = i9;
                i10 = d2;
            } else {
                int paddingTop = getPaddingTop() + this.c[bVar4.e];
                i10 = i6;
                i11 = i8;
                i12 = paddingTop;
                d = this.mOrientationHelper.d(view5) + paddingTop;
            }
            layoutDecoratedWithMargins(view5, i11, i12, i10, d);
            if (bVar4.d() || bVar4.c()) {
                bVar.c = true;
            }
            bVar.d |= view5.hasFocusable();
            i27++;
            i6 = i10;
            i8 = i11;
            i7 = i12;
            i9 = d;
        }
        Arrays.fill(this.d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i) {
        boolean z;
        super.onAnchorReady(wVar, b0Var, aVar, i);
        h();
        if (b0Var.b() > 0 && !b0Var.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int d = d(aVar.b, wVar, b0Var);
            if (z) {
                while (d > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    d = d(i3, wVar, b0Var);
                }
            } else {
                int b2 = b0Var.b() - 1;
                int i4 = aVar.b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int d2 = d(i5, wVar, b0Var);
                    if (d2 <= d) {
                        break;
                    }
                    i4 = i5;
                    d = d2;
                }
                aVar.b = i4;
            }
        }
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == r11) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.b0 b0Var, com.amazon.aps.iva.q3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(wVar, b0Var, lVar);
        lVar.h(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, com.amazon.aps.iva.q3.l lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, lVar);
            return;
        }
        b bVar = (b) layoutParams;
        int c2 = c(bVar.b(), wVar, b0Var);
        if (this.mOrientation == 0) {
            lVar.j(l.g.a(bVar.e, bVar.f, c2, 1, false, false));
        } else {
            lVar.j(l.g.a(c2, 1, bVar.e, bVar.f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.g.d();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.g.d();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.g.d();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.g.d();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.g.d();
        this.g.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        boolean z = b0Var.g;
        SparseIntArray sparseIntArray = this.f;
        SparseIntArray sparseIntArray2 = this.e;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                b bVar = (b) getChildAt(i).getLayoutParams();
                int b2 = bVar.b();
                sparseIntArray2.put(b2, bVar.f);
                sparseIntArray.put(b2, bVar.e);
            }
        }
        super.onLayoutChildren(wVar, b0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int scrollHorizontallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        h();
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
        return super.scrollHorizontallyBy(i, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int scrollVerticallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        h();
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
        return super.scrollVerticallyBy(i, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.p.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.c;
            chooseSize = RecyclerView.p.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.p.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.c;
            chooseSize2 = RecyclerView.p.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && !this.a) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.q {
        public int e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        g(i);
    }

    public GridLayoutManager(Context context, int i, int i2) {
        super(context, 1, false);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        g(i);
    }
}
