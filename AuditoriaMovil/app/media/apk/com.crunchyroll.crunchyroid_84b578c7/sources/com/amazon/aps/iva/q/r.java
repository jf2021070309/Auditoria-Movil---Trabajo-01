package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AppCompatMultiAutoCompleteTextView.java */
/* loaded from: classes.dex */
public final class r extends MultiAutoCompleteTextView {
    public static final int[] e = {16843126};
    public final d b;
    public final d0 c;
    public final l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        a1.a(context);
        y0.a(getContext(), this);
        d1 m = d1.m(getContext(), attributeSet, e, R.attr.autoCompleteTextViewStyle);
        if (m.l(0)) {
            setDropDownBackgroundDrawable(m.e(0));
        }
        m.n();
        d dVar = new d(this);
        this.b = dVar;
        dVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        d0 d0Var = new d0(this);
        this.c = d0Var;
        d0Var.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        d0Var.b();
        l lVar = new l(this);
        this.d = lVar;
        lVar.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a = lVar.a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.amazon.aps.iva.ff0.b.A(this, editorInfo, onCreateInputConnection);
        return this.d.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(com.amazon.aps.iva.l.a.a(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.d.d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.d.a(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.c;
        if (d0Var != null) {
            d0Var.g(i, context);
        }
    }
}
