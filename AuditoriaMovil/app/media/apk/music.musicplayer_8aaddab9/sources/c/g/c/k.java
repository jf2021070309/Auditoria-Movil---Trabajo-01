package c.g.c;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public abstract class k extends b {

    /* renamed from: i  reason: collision with root package name */
    public boolean f1920i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1921j;

    @Override // c.g.c.b
    public void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // c.g.c.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f1909b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f1920i = true;
                } else if (index == 22) {
                    this.f1921j = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // c.g.c.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1920i || this.f1921j) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i2 = 0; i2 < this.f1823b; i2++) {
                    View d2 = constraintLayout.d(this.a[i2]);
                    if (d2 != null) {
                        if (this.f1920i) {
                            d2.setVisibility(visibility);
                        }
                        if (this.f1921j && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            d2.setTranslationZ(d2.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }
}
