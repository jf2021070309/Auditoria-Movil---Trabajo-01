package com.kwad.components.core.page.recycle;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.kwad.components.core.t.n;
import com.kwad.sdk.utils.s;
/* loaded from: classes.dex */
public class DetailWebRecycleView extends b {
    private int NR;
    private boolean NS;
    private boolean NT;
    private int NU;
    private int NV;
    private boolean NW;
    a NX;
    private Runnable NY;
    private n NZ;
    private int mr;

    /* loaded from: classes.dex */
    public interface a {
        boolean pl();
    }

    public DetailWebRecycleView(Context context) {
        this(context, null);
    }

    public DetailWebRecycleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailWebRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NR = 1000;
        this.NS = false;
        this.NT = false;
        Runnable runnable = new Runnable() { // from class: com.kwad.components.core.page.recycle.DetailWebRecycleView.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Object f = s.f(DetailWebRecycleView.this, "mGapWorker");
                    if (f != null) {
                        s.f(f, "postFromTraversal", DetailWebRecycleView.this, 0, Integer.valueOf(DetailWebRecycleView.this.NR));
                    }
                } catch (RuntimeException e) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                }
            }
        };
        this.NY = runnable;
        this.NZ = new n(runnable);
        this.mr = context instanceof Activity ? com.kwad.sdk.d.a.a.e((Activity) context) : com.kwad.sdk.d.a.a.getScreenHeight(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this.NZ, 50L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.core.page.recycle.b, android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.NZ);
    }

    @Override // com.kwad.components.core.page.recycle.b, android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar = this.NX;
        if (aVar == null || !aVar.pl()) {
            this.NV = computeVerticalScrollOffset();
            if (motionEvent.getY() <= this.NU - this.NV) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        this.NV = computeVerticalScrollOffset;
        if (computeVerticalScrollOffset >= this.NU) {
            return false;
        }
        fling((int) f, (int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        this.NV = computeVerticalScrollOffset;
        if ((i2 > 0 && computeVerticalScrollOffset < this.NU) && !this.NW && computeVerticalScrollOffset < this.mr) {
            scrollBy(0, i2);
            iArr[1] = i2;
        }
        if (i2 < 0 && this.NV > 0 && !ViewCompat.canScrollVertically(view, -1)) {
            scrollBy(0, i2);
            iArr[1] = i2;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 0) {
            View childAt = getLayoutManager().getChildAt(getLayoutManager().getChildCount() - 1);
            if (childAt != null) {
                int bottom = childAt.getBottom();
                int bottom2 = getBottom() - getPaddingBottom();
                int position = getLayoutManager().getPosition(childAt);
                if (bottom == bottom2 && position == getLayoutManager().getItemCount() - 1) {
                    this.NW = true;
                    return;
                }
            }
            this.NW = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.NT) {
            this.NT = false;
        } else if (this.NS) {
        } else {
            super.requestChildFocus(view, view2);
        }
    }

    public void setInterceptRequestFocusForWeb(boolean z) {
        this.NS = z;
    }

    public void setInterceptRequestFocusForWebFiredOnce(boolean z) {
        this.NT = z;
    }

    public void setInterceptTouchListener(a aVar) {
        this.NX = aVar;
    }

    public void setTopViewHeight(int i) {
        this.NU = i;
    }
}
