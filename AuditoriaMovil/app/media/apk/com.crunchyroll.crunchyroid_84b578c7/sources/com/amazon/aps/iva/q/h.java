package com.amazon.aps.iva.q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import com.amazon.aps.iva.h3.a;
/* compiled from: AppCompatCheckedTextViewHelper.java */
/* loaded from: classes.dex */
public final class h {
    public final CheckedTextView a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public h(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.d) {
                    a.b.h(mutate, this.b);
                }
                if (this.e) {
                    a.b.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
