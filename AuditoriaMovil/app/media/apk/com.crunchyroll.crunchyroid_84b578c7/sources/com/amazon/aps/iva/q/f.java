package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AppCompatCheckBox.java */
/* loaded from: classes.dex */
public class f extends CheckBox implements com.amazon.aps.iva.t3.m {
    private m mAppCompatEmojiTextHelper;
    private final d mBackgroundTintHelper;
    private final i mCompoundButtonHelper;
    private final d0 mTextHelper;

    public f(Context context) {
        this(context, null);
    }

    private m getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new m(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.mCompoundButtonHelper;
        if (iVar != null) {
            iVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // com.amazon.aps.iva.t3.m
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.mCompoundButtonHelper;
        if (iVar != null) {
            return iVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.mCompoundButtonHelper;
        if (iVar != null) {
            return iVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.mCompoundButtonHelper;
        if (iVar != null) {
            if (iVar.f) {
                iVar.f = false;
                return;
            }
            iVar.f = true;
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
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
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // com.amazon.aps.iva.t3.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.mCompoundButtonHelper;
        if (iVar != null) {
            iVar.b = colorStateList;
            iVar.d = true;
            iVar.a();
        }
    }

    @Override // com.amazon.aps.iva.t3.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.mCompoundButtonHelper;
        if (iVar != null) {
            iVar.c = mode;
            iVar.e = true;
            iVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        y0.a(getContext(), this);
        i iVar = new i(this);
        this.mCompoundButtonHelper = iVar;
        iVar.b(attributeSet, i);
        d dVar = new d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.mTextHelper = d0Var;
        d0Var.f(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.amazon.aps.iva.l.a.a(getContext(), i));
    }
}
