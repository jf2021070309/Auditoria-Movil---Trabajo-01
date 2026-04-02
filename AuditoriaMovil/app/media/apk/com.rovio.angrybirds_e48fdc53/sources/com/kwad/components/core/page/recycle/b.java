package com.kwad.components.core.page.recycle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes.dex */
public class b extends g {
    private Rect NJ;
    private int NK;
    private int NL;
    private boolean NM;
    private int NN;
    private a NO;
    private boolean NP;
    private boolean NQ;

    /* loaded from: classes.dex */
    public interface a {
        boolean pk();
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NN = Integer.MIN_VALUE;
        this.NQ = false;
    }

    private void a(int i, int i2, int i3) {
        while (true) {
            if (this.NN == Integer.MIN_VALUE) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                this.NN = iArr[1];
            }
            int findFirstVisibleItemPosition = f.b(this).findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = f.b(this).findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1) {
                return;
            }
            if (i >= findFirstVisibleItemPosition && i <= findLastVisibleItemPosition) {
                int i4 = i - findFirstVisibleItemPosition;
                if (getChildCount() > i4) {
                    int[] iArr2 = new int[2];
                    getChildAt(i4).getLocationOnScreen(iArr2);
                    scrollBy(0, (iArr2[1] - this.NN) - i3);
                    return;
                }
                return;
            } else if (i > findLastVisibleItemPosition) {
                scrollBy(0, i2);
                a(i, i2, i3);
                return;
            } else {
                scrollBy(0, -i2);
            }
        }
    }

    private void pi() {
        Rect rect = this.NJ;
        if (rect == null) {
            this.NJ = new Rect();
        } else {
            rect.setEmpty();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                this.NJ.union(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
        }
    }

    private void pj() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter instanceof d) {
            ((d) adapter).pn();
        }
    }

    private void scrollToPositionWithOffset(int i, int i2) {
        a(i, getHeight(), 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pj();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.NK != 0) {
            pi();
            Rect rect = this.NJ;
            if (rect != null && !rect.isEmpty()) {
                canvas.save();
                canvas.clipRect(this.NJ);
                canvas.drawColor(this.NK);
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.NP) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.NQ) {
            stopScroll();
        }
        a aVar = this.NO;
        if (aVar == null || !aVar.pk()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.NL;
        if (i3 > 0 && i3 < size) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.NL, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.NP) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void scrollToPosition(int i) {
        if (this.NM) {
            scrollToPositionWithOffset(i, 0);
        } else {
            super.scrollToPosition(i);
        }
    }

    public void setDisableScroll(boolean z) {
        this.NP = z;
    }

    public void setDownStop(boolean z) {
        this.NQ = z;
    }

    public void setIgnoreTouchSwipeHandler(a aVar) {
        this.NO = aVar;
    }

    public void setUnderneathColor(int i) {
        this.NK = i;
        pi();
        invalidate();
    }

    public void setUseCustomScrollToPosition(boolean z) {
        this.NM = z;
    }
}
