package com.kwad.sdk.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
/* loaded from: classes3.dex */
public class d extends ViewPager {
    private int aMp;
    private boolean aMq;

    public d(Context context) {
        super(context);
        this.aMq = false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aMq = false;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.aMq) {
            return super.canScrollHorizontally(i);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        if (this.aMq) {
            int x = (int) motionEvent.getX();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    int i = x - this.aMp;
                    if (getCurrentItem() == 0 && i > 0) {
                        parent = getParent();
                        z = false;
                    }
                }
                this.aMp = x;
                return super.dispatchTouchEvent(motionEvent);
            }
            parent = getParent();
            z = true;
            parent.requestDisallowInterceptTouchEvent(z);
            this.aMp = x;
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.aMq && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.aMq && super.onTouchEvent(motionEvent);
    }

    public void setScrollable(boolean z) {
        this.aMq = z;
    }
}
