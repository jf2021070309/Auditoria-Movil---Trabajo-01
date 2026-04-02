package com.amazon.aps.iva.x2;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.x2.o;
/* compiled from: MotionHelper.java */
/* loaded from: classes.dex */
public final class n extends androidx.constraintlayout.widget.b implements o.g {
    public boolean j;
    public boolean k;
    public float l;
    public View[] m;

    public float getProgress() {
        return this.l;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.m);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.j = obtainStyledAttributes.getBoolean(index, this.j);
                } else if (index == 0) {
                    this.k = obtainStyledAttributes.getBoolean(index, this.k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.l = f;
        int i = 0;
        if (this.c > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.h;
            if (viewArr == null || viewArr.length != this.c) {
                this.h = new View[this.c];
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                this.h[i2] = constraintLayout.getViewById(this.b[i2]);
            }
            this.m = this.h;
            while (i < this.c) {
                View view = this.m[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            boolean z = viewGroup.getChildAt(i) instanceof n;
            i++;
        }
    }

    @Override // com.amazon.aps.iva.x2.o.g
    public final void a() {
    }

    @Override // com.amazon.aps.iva.x2.o.g
    public final void b() {
    }

    @Override // com.amazon.aps.iva.x2.o.g
    public final void c() {
    }
}
