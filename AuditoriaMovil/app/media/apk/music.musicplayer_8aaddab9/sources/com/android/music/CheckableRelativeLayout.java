package com.android.music;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RelativeLayout;
/* loaded from: classes.dex */
public class CheckableRelativeLayout extends RelativeLayout implements Checkable {
    public static final int[] a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public boolean f2944b;

    public CheckableRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f2944b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            RelativeLayout.mergeDrawableStates(onCreateDrawableState, a);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f2944b != z) {
            this.f2944b = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f2944b);
    }
}
