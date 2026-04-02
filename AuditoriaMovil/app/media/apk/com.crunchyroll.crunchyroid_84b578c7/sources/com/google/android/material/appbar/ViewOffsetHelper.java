package com.google.android.material.appbar;

import android.view.View;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ViewOffsetHelper {
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private final View view;
    private boolean verticalOffsetEnabled = true;
    private boolean horizontalOffsetEnabled = true;

    public ViewOffsetHelper(View view) {
        this.view = view;
    }

    public void applyOffsets() {
        View view = this.view;
        int top = this.offsetTop - (view.getTop() - this.layoutTop);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        view.offsetTopAndBottom(top);
        View view2 = this.view;
        view2.offsetLeftAndRight(this.offsetLeft - (view2.getLeft() - this.layoutLeft));
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.horizontalOffsetEnabled;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.verticalOffsetEnabled;
    }

    public void onViewLayout() {
        this.layoutTop = this.view.getTop();
        this.layoutLeft = this.view.getLeft();
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        this.horizontalOffsetEnabled = z;
    }

    public boolean setLeftAndRightOffset(int i) {
        if (this.horizontalOffsetEnabled && this.offsetLeft != i) {
            this.offsetLeft = i;
            applyOffsets();
            return true;
        }
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        if (this.verticalOffsetEnabled && this.offsetTop != i) {
            this.offsetTop = i;
            applyOffsets();
            return true;
        }
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        this.verticalOffsetEnabled = z;
    }
}
