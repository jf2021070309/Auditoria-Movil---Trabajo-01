package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* compiled from: AppCompatToggleButton.java */
/* loaded from: classes.dex */
public final class g0 extends ToggleButton {
    public final d b;
    public final d0 c;
    public m d;

    public g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        y0.a(getContext(), this);
        d dVar = new d(this);
        this.b = dVar;
        dVar.d(attributeSet, 16842827);
        d0 d0Var = new d0(this);
        this.c = d0Var;
        d0Var.f(attributeSet, 16842827);
        getEmojiTextViewHelper().c(attributeSet, 16842827);
    }

    private m getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new m(this);
        }
        return this.d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
        d0 d0Var = this.c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.b;
        if (dVar != null) {
            dVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        d0 d0Var = this.c;
        d0Var.k(colorStateList);
        d0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        d0 d0Var = this.c;
        d0Var.l(mode);
        d0Var.b();
    }
}
