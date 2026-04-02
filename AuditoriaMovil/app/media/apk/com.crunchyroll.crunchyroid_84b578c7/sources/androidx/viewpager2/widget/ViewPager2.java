package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.viewpager2.widget.c;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q3.l;
import com.amazon.aps.iva.q3.p;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect b;
    public final Rect c;
    public final androidx.viewpager2.widget.a d;
    public int e;
    public boolean f;
    public final a g;
    public d h;
    public int i;
    public Parcelable j;
    public i k;
    public h l;
    public androidx.viewpager2.widget.c m;
    public androidx.viewpager2.widget.a n;
    public com.amazon.aps.iva.h9.c o;
    public androidx.viewpager2.widget.b p;
    public RecyclerView.m q;
    public boolean r;
    public boolean s;
    public int t;
    public f u;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            super(0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f = true;
            viewPager2.m.m = true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.j {
        public c(int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayoutManager {
        public d(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.b0 b0Var, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(b0Var, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.b0 b0Var, l lVar) {
            super.onInitializeAccessibilityNodeInfo(wVar, b0Var, lVar);
            ViewPager2.this.u.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final boolean performAccessibilityAction(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i, Bundle bundle) {
            ViewPager2.this.u.getClass();
            return super.performAccessibilityAction(wVar, b0Var, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class f extends b {
        public final a a = new a();
        public final b b = new b();
        public androidx.viewpager2.widget.f c;

        /* loaded from: classes.dex */
        public class a implements p {
            public a() {
            }

            @Override // com.amazon.aps.iva.q3.p
            public final boolean perform(View view, p.a aVar) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.s) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements p {
            public b() {
            }

            @Override // com.amazon.aps.iva.q3.p
            public final boolean perform(View view, p.a aVar) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.s) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.d.s(recyclerView, 2);
            this.c = new androidx.viewpager2.widget.f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (g0.d.c(viewPager2) == 0) {
                g0.d.s(viewPager2, 1);
            }
        }

        public final void b() {
            int itemCount;
            int i;
            int i2 = 16908360;
            ViewPager2 viewPager2 = ViewPager2.this;
            g0.k(16908360, viewPager2);
            boolean z = false;
            g0.i(0, viewPager2);
            g0.k(16908361, viewPager2);
            g0.i(0, viewPager2);
            g0.k(16908358, viewPager2);
            g0.i(0, viewPager2);
            g0.k(16908359, viewPager2);
            g0.i(0, viewPager2);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.s) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.b;
            a aVar = this.a;
            if (orientation == 0) {
                if (viewPager2.h.getLayoutDirection() == 1) {
                    z = true;
                }
                if (z) {
                    i = 16908360;
                } else {
                    i = 16908361;
                }
                if (z) {
                    i2 = 16908361;
                }
                if (viewPager2.e < itemCount - 1) {
                    g0.l(viewPager2, new l.a(i, (String) null), null, aVar);
                }
                if (viewPager2.e > 0) {
                    g0.l(viewPager2, new l.a(i2, (String) null), null, bVar);
                    return;
                }
                return;
            }
            if (viewPager2.e < itemCount - 1) {
                g0.l(viewPager2, new l.a(16908359, (String) null), null, aVar);
            }
            if (viewPager2.e > 0) {
                g0.l(viewPager2, new l.a(16908358, (String) null), null, bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends b0 {
        public h() {
        }

        @Override // androidx.recyclerview.widget.b0, androidx.recyclerview.widget.f0
        public final View findSnapView(RecyclerView.p pVar) {
            if (ViewPager2.this.o.b.n) {
                return null;
            }
            return super.findSnapView(pVar);
        }
    }

    /* loaded from: classes.dex */
    public class i extends RecyclerView {
        public i(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.u.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.e);
            accessibilityEvent.setToIndex(viewPager2.e);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.s && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.s && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();
        public int b;
        public int c;
        public Parcelable d;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new j[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j() {
            throw null;
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* loaded from: classes.dex */
    public static class k implements Runnable {
        public final int b;
        public final RecyclerView c;

        public k(i iVar, int i) {
            this.b = i;
            this.c = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.smoothScrollToPosition(this.b);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = new Rect();
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
        this.d = aVar;
        this.f = false;
        this.g = new a();
        this.i = -1;
        this.q = null;
        this.r = false;
        this.s = true;
        this.t = -1;
        this.u = new f();
        i iVar = new i(context);
        this.k = iVar;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        iVar.setId(g0.e.a());
        this.k.setDescendantFocusability(131072);
        d dVar = new d(context);
        this.h = dVar;
        this.k.setLayoutManager(dVar);
        this.k.setScrollingTouchSlop(1);
        int[] iArr = com.amazon.aps.iva.f9.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.k.addOnChildAttachStateChangeListener(new com.amazon.aps.iva.h9.d());
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.m = cVar;
            this.o = new com.amazon.aps.iva.h9.c(this, cVar, this.k);
            h hVar = new h();
            this.l = hVar;
            hVar.attachToRecyclerView(this.k);
            this.k.addOnScrollListener(this.m);
            androidx.viewpager2.widget.a aVar2 = new androidx.viewpager2.widget.a();
            this.n = aVar2;
            this.m.b = aVar2;
            androidx.viewpager2.widget.d dVar2 = new androidx.viewpager2.widget.d(this);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.n.a.add(dVar2);
            this.n.a.add(eVar);
            this.u.a(this.k);
            this.n.a.add(aVar);
            androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(this.h);
            this.p = bVar;
            this.n.a.add(bVar);
            i iVar2 = this.k;
            attachViewToParent(iVar2, 0, iVar2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        RecyclerView.h adapter;
        if (this.i == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.j;
        if (parcelable != null) {
            if (adapter instanceof com.amazon.aps.iva.g9.e) {
                ((com.amazon.aps.iva.g9.e) adapter).c(parcelable);
            }
            this.j = null;
        }
        int max = Math.max(0, Math.min(this.i, adapter.getItemCount() - 1));
        this.e = max;
        this.i = -1;
        this.k.scrollToPosition(max);
        this.u.b();
    }

    public final void b(int i2, boolean z) {
        if (!this.o.b.n) {
            c(i2, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void c(int i2, boolean z) {
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        RecyclerView.h adapter = getAdapter();
        boolean z4 = false;
        if (adapter == null) {
            if (this.i != -1) {
                this.i = Math.max(i2, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
            int i5 = this.e;
            if (min == i5) {
                if (this.m.g == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return;
                }
            }
            if (min == i5 && z) {
                return;
            }
            double d2 = i5;
            this.e = min;
            this.u.b();
            androidx.viewpager2.widget.c cVar = this.m;
            if (cVar.g == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                cVar.H6();
                c.a aVar = cVar.h;
                d2 = aVar.a + aVar.b;
            }
            androidx.viewpager2.widget.c cVar2 = this.m;
            cVar2.getClass();
            if (z) {
                i3 = 2;
            } else {
                i3 = 3;
            }
            cVar2.f = i3;
            cVar2.n = false;
            if (cVar2.j != min) {
                z4 = true;
            }
            cVar2.j = min;
            cVar2.b1(2);
            if (z4) {
                cVar2.G(min);
            }
            if (!z) {
                this.k.scrollToPosition(min);
                return;
            }
            double d3 = min;
            if (Math.abs(d3 - d2) > 3.0d) {
                i iVar = this.k;
                if (d3 > d2) {
                    i4 = min - 3;
                } else {
                    i4 = min + 3;
                }
                iVar.scrollToPosition(i4);
                i iVar2 = this.k;
                iVar2.post(new k(iVar2, min));
                return;
            }
            this.k.smoothScrollToPosition(min);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.k.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.k.canScrollVertically(i2);
    }

    public final void d() {
        h hVar = this.l;
        if (hVar != null) {
            View findSnapView = hVar.findSnapView(this.h);
            if (findSnapView == null) {
                return;
            }
            int position = this.h.getPosition(findSnapView);
            if (position != this.e && getScrollState() == 0) {
                this.n.onPageSelected(position);
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i2 = ((j) parcelable).b;
            sparseArray.put(this.k.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.u.getClass();
        this.u.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.h getAdapter() {
        return this.k.getAdapter();
    }

    public int getCurrentItem() {
        return this.e;
    }

    public int getItemDecorationCount() {
        return this.k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.t;
    }

    public int getOrientation() {
        return this.h.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.k;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.m.g;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        int i3;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                i2 = viewPager2.getAdapter().getItemCount();
                i3 = 0;
            } else {
                i3 = viewPager2.getAdapter().getItemCount();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) l.f.a(i2, i3, 0, false).a);
        RecyclerView.h adapter = viewPager2.getAdapter();
        if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && viewPager2.s) {
            if (viewPager2.e > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.e < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.k.getMeasuredWidth();
        int measuredHeight = this.k.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.b;
        rect.left = paddingLeft;
        rect.right = (i4 - i2) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i5 - i3) - getPaddingBottom();
        Rect rect2 = this.c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.k.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChild(this.k, i2, i3);
        int measuredWidth = this.k.getMeasuredWidth();
        int measuredHeight = this.k.getMeasuredHeight();
        int measuredState = this.k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.i = jVar.c;
        this.j = jVar.d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.b = this.k.getId();
        int i2 = this.i;
        if (i2 == -1) {
            i2 = this.e;
        }
        jVar.c = i2;
        Parcelable parcelable = this.j;
        if (parcelable != null) {
            jVar.d = parcelable;
        } else {
            RecyclerView.h adapter = this.k.getAdapter();
            if (adapter instanceof com.amazon.aps.iva.g9.e) {
                jVar.d = ((com.amazon.aps.iva.g9.e) adapter).a();
            }
        }
        return jVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        boolean z;
        int currentItem;
        this.u.getClass();
        boolean z2 = false;
        if (i2 != 8192 && i2 != 4096) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            f fVar = this.u;
            fVar.getClass();
            if (i2 == 8192 || i2 == 4096) {
                z2 = true;
            }
            if (z2) {
                ViewPager2 viewPager2 = ViewPager2.this;
                if (i2 == 8192) {
                    currentItem = viewPager2.getCurrentItem() - 1;
                } else {
                    currentItem = viewPager2.getCurrentItem() + 1;
                }
                if (viewPager2.s) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i2, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.k.getAdapter();
        f fVar = this.u;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(fVar.c);
        } else {
            fVar.getClass();
        }
        a aVar = this.g;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(aVar);
        }
        this.k.setAdapter(hVar);
        this.e = 0;
        a();
        f fVar2 = this.u;
        fVar2.b();
        if (hVar != null) {
            hVar.registerAdapterDataObserver(fVar2.c);
        }
        if (hVar != null) {
            hVar.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i2) {
        b(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.u.b();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.t = i2;
        this.k.requestLayout();
    }

    public void setOrientation(int i2) {
        this.h.setOrientation(i2);
        this.u.b();
    }

    public void setPageTransformer(g gVar) {
        if (gVar != null) {
            if (!this.r) {
                this.q = this.k.getItemAnimator();
                this.r = true;
            }
            this.k.setItemAnimator(null);
        } else if (this.r) {
            this.k.setItemAnimator(this.q);
            this.q = null;
            this.r = false;
        }
        this.p.getClass();
        if (gVar == null) {
            return;
        }
        this.p.getClass();
        this.p.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.s = z;
        this.u.b();
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageSelected(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
