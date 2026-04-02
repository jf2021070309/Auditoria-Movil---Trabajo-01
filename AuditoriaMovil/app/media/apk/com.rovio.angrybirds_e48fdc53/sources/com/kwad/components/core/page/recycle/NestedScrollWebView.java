package com.kwad.components.core.page.recycle;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.VelocityTrackerCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.kwad.sdk.core.webview.KsAdWebView;
/* loaded from: classes.dex */
public class NestedScrollWebView extends KsAdWebView implements NestedScrollingChild {
    private int Ob;
    private int Oc;
    private final int[] Od;
    private final int[] Oe;
    private int Of;
    private boolean Og;
    private int Oh;
    private int Oi;
    private NestedScrollingChildHelper Oj;
    private VelocityTracker Ok;
    private int Ol;

    public NestedScrollWebView(Context context) {
        super(context);
        this.Od = new int[2];
        this.Oe = new int[2];
        pm();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Od = new int[2];
        this.Oe = new int[2];
        pm();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Od = new int[2];
        this.Oe = new int[2];
        pm();
    }

    private void pm() {
        this.Ol = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.Oj = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        this.Oi = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Oh = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.Oj.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.Oj.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.Oj.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.Oj.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.Oj.hasNestedScrollingParent();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.Oj.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.Ol != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(((getContext() instanceof Activity ? com.kwad.sdk.d.a.a.e((Activity) getContext()) : com.kwad.sdk.d.a.a.getScreenHeight(getContext())) - (com.kwad.components.core.t.d.qp() ? com.kwad.sdk.d.a.a.getStatusBarHeight(getContext()) : 0)) - this.Ol, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // com.kwad.sdk.core.webview.KsAdWebView, android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (hasFocus()) {
            return;
        }
        requestFocus();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int[] iArr;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean z = false;
        if (actionMasked == 0) {
            this.Of = 0;
        }
        if (this.Ok == null) {
            this.Ok = VelocityTracker.obtain();
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        int y = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, this.Of);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.Ob - y;
                    if (dispatchNestedPreScroll(0, i, this.Oe, this.Od)) {
                        i -= this.Oe[1];
                        obtain.offsetLocation(0.0f, this.Od[1]);
                        this.Of += this.Od[1];
                    }
                    int scrollY = getScrollY();
                    this.Ob = y - this.Od[1];
                    int max = Math.max(0, scrollY + i);
                    int i2 = i - (max - scrollY);
                    if (dispatchNestedScroll(0, max - i2, 0, i2, this.Od)) {
                        this.Ob = this.Ob - this.Od[1];
                        obtain.offsetLocation(0.0f, iArr[1]);
                        this.Of += this.Od[1];
                    }
                    if (Math.abs(this.Oe[1]) >= 5 || Math.abs(this.Od[1]) >= 5) {
                        if (!this.Og) {
                            this.Og = true;
                            super.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        }
                        onTouchEvent = false;
                    } else {
                        if (this.Og) {
                            this.Og = false;
                            onTouchEvent = false;
                        } else {
                            onTouchEvent = super.onTouchEvent(obtain);
                        }
                        obtain.recycle();
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        stopNestedScroll();
                        onTouchEvent = super.onTouchEvent(motionEvent);
                    }
                    onTouchEvent = false;
                }
            }
            this.Ok.addMovement(motionEvent);
            this.Ok.computeCurrentVelocity(1000, this.Oi);
            float f = -VelocityTrackerCompat.getYVelocity(this.Ok, MotionEventCompat.getPointerId(motionEvent, actionIndex));
            if (Math.abs(f) > this.Oh && !dispatchNestedPreFling(0.0f, f) && hasNestedScrollingParent()) {
                dispatchNestedFling(0.0f, f, true);
            }
            boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
            stopNestedScroll();
            if (Math.abs(motionEvent.getY() - this.Ob) < 10.0f) {
                Math.abs(motionEvent.getX() - this.Oc);
            }
            onTouchEvent = onTouchEvent2;
            z = true;
        } else {
            this.Ob = y;
            this.Oc = (int) motionEvent.getX();
            startNestedScroll(2);
            int[] iArr2 = this.Oe;
            iArr2[0] = 0;
            iArr2[1] = 0;
            int[] iArr3 = this.Od;
            iArr3[0] = 0;
            iArr3[1] = 0;
            onTouchEvent = super.onTouchEvent(motionEvent);
            this.Og = false;
        }
        if (!z) {
            this.Ok.addMovement(motionEvent);
        }
        return onTouchEvent;
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.Oj.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.Oj.startNestedScroll(i);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.Oj.stopNestedScroll();
    }
}
