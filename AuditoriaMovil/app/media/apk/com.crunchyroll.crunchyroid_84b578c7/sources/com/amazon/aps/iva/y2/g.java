package com.amazon.aps.iva.y2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.u2.l;
/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class g extends androidx.constraintlayout.widget.b {
    public boolean j;
    public boolean k;

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.b
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    public void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.j = true;
                } else if (index == 22) {
                    this.k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j || this.k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.c; i++) {
                    View viewById = constraintLayout.getViewById(this.b[i]);
                    if (viewById != null) {
                        if (this.j) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.k && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            g((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            g((ConstraintLayout) parent);
        }
    }

    public void m(l lVar, int i, int i2) {
    }
}
