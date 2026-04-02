package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class Barrier extends b {
    public int j;
    public int k;
    public com.amazon.aps.iva.u2.a l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.l.v0;
    }

    public int getMargin() {
        return this.l.w0;
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.l = new com.amazon.aps.iva.u2.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.l.v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.l.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.e = this.l;
        l();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void k(com.amazon.aps.iva.u2.e eVar, boolean z) {
        int i = this.j;
        this.k = i;
        if (z) {
            if (i == 5) {
                this.k = 1;
            } else if (i == 6) {
                this.k = 0;
            }
        } else if (i == 5) {
            this.k = 0;
        } else if (i == 6) {
            this.k = 1;
        }
        if (eVar instanceof com.amazon.aps.iva.u2.a) {
            ((com.amazon.aps.iva.u2.a) eVar).u0 = this.k;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.v0 = z;
    }

    public void setDpMargin(int i) {
        this.l.w0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.l.w0 = i;
    }

    public void setType(int i) {
        this.j = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
