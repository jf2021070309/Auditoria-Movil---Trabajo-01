package c.g.b.a;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.g.b.a.c;
import c.g.c.i;
/* loaded from: classes.dex */
public class b extends c.g.c.b implements c.InterfaceC0030c {

    /* renamed from: i  reason: collision with root package name */
    public boolean f1808i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1809j;

    /* renamed from: k  reason: collision with root package name */
    public float f1810k;

    /* renamed from: l  reason: collision with root package name */
    public View[] f1811l;

    @Override // c.g.b.a.c.InterfaceC0030c
    public void a(c cVar, int i2, int i3, float f2) {
    }

    @Override // c.g.b.a.c.InterfaceC0030c
    public void b(c cVar, int i2, int i3) {
    }

    public float getProgress() {
        return this.f1810k;
    }

    @Override // c.g.c.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f1915h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f1808i = obtainStyledAttributes.getBoolean(index, this.f1808i);
                } else if (index == 0) {
                    this.f1809j = obtainStyledAttributes.getBoolean(index, this.f1809j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f2) {
        this.f1810k = f2;
        int i2 = 0;
        if (this.f1823b <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i2 < childCount) {
                boolean z = viewGroup.getChildAt(i2) instanceof b;
                i2++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f1828g;
        if (viewArr == null || viewArr.length != this.f1823b) {
            this.f1828g = new View[this.f1823b];
        }
        for (int i3 = 0; i3 < this.f1823b; i3++) {
            this.f1828g[i3] = constraintLayout.d(this.a[i3]);
        }
        this.f1811l = this.f1828g;
        while (i2 < this.f1823b) {
            View view = this.f1811l[i2];
            i2++;
        }
    }
}
