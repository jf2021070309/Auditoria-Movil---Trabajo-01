package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.HashMap;
/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class d extends ViewGroup {
    public c b;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public c getConstraintSet() {
        if (this.b == null) {
            this.b = new c();
        }
        c cVar = this.b;
        cVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, c.a> hashMap = cVar.e;
        hashMap.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new c.a());
            }
            c.a aVar2 = hashMap.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof b) {
                    b bVar = (b) childAt;
                    aVar2.d(id, aVar);
                    if (bVar instanceof Barrier) {
                        c.b bVar2 = aVar2.e;
                        bVar2.i0 = 1;
                        Barrier barrier = (Barrier) bVar;
                        bVar2.g0 = barrier.getType();
                        bVar2.j0 = barrier.getReferencedIds();
                        bVar2.h0 = barrier.getMargin();
                    }
                }
                aVar2.d(id, aVar);
            }
        }
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;
        public final float r0;
        public final boolean s0;
        public final float t0;
        public final float u0;
        public final float v0;
        public final float w0;
        public final float x0;
        public final float y0;
        public final float z0;

        public a() {
            super(-2, -2);
            this.r0 = 1.0f;
            this.s0 = false;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 1.0f;
            this.y0 = 1.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.r0 = 1.0f;
            this.s0 = false;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 1.0f;
            this.y0 = 1.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == 28) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                    this.s0 = true;
                } else if (index == 23) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == 24) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == 22) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == 20) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == 21) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == 16) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
