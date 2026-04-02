package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.g.a.i.a;
import c.g.a.i.d;
import c.g.c.b;
import c.g.c.i;
/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: i  reason: collision with root package name */
    public int f278i;

    /* renamed from: j  reason: collision with root package name */
    public int f279j;

    /* renamed from: k  reason: collision with root package name */
    public a f280k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f280k.u0;
    }

    public int getMargin() {
        return this.f280k.v0;
    }

    public int getType() {
        return this.f278i;
    }

    @Override // c.g.c.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f280k = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f1909b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f280k.u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f280k.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1825d = this.f280k;
        n();
    }

    @Override // c.g.c.b
    public void j(d dVar, boolean z) {
        int i2 = this.f278i;
        this.f279j = i2;
        if (z) {
            if (i2 == 5) {
                this.f279j = 1;
            } else if (i2 == 6) {
                this.f279j = 0;
            }
        } else if (i2 == 5) {
            this.f279j = 0;
        } else if (i2 == 6) {
            this.f279j = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).t0 = this.f279j;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f280k.u0 = z;
    }

    public void setDpMargin(int i2) {
        this.f280k.v0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f280k.v0 = i2;
    }

    public void setType(int i2) {
        this.f278i = i2;
    }
}
