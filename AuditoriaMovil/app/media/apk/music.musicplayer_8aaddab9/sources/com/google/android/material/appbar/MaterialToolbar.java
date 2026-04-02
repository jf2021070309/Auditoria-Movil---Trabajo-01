package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c.i.k.d0;
import e.d.b.d.b;
import e.d.b.d.r.k;
import e.d.b.d.w.g;
import e.d.b.d.z.a.a;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    public Integer P;
    public boolean U;
    public boolean V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2131887176), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        TypedArray d2 = k.d(context2, attributeSet, b.u, R.attr.toolbarStyle, 2131887176, new int[0]);
        if (d2.hasValue(0)) {
            setNavigationIconTint(d2.getColor(0, -1));
        }
        this.U = d2.getBoolean(2, false);
        this.V = d2.getBoolean(1, false);
        d2.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.q(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.f6591c.f6603b = new e.d.b.d.o.a(context2);
            gVar.x();
            gVar.p(d0.l(this));
            d0.c.q(this, gVar);
        }
    }

    public Integer getNavigationIconTint() {
        return this.P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            e.d.b.d.a.d0(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.U || this.V) {
            TextView G = e.d.b.d.a.G(this, getTitle());
            TextView G2 = e.d.b.d.a.G(this, getSubtitle());
            if (G == null && G2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i6 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && childAt != G && childAt != G2) {
                    if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.U && G != null) {
                w(G, pair);
            }
            if (!this.V || G2 == null) {
                return;
            }
            w(G2, pair);
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e.d.b.d.a.c0(this, f2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.P != null) {
            drawable = c.i.a.q0(drawable.mutate());
            c.i.a.i0(drawable, this.P.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.P = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.V != z) {
            this.V = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.U != z) {
            this.U = z;
            requestLayout();
        }
    }

    public final void w(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i3 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i2, view.getTop(), i3, view.getBottom());
    }
}
