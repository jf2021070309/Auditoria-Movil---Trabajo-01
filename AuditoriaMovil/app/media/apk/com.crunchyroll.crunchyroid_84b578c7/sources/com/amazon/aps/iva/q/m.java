package com.amazon.aps.iva.q;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: classes.dex */
public final class m {
    public final TextView a;
    public final com.amazon.aps.iva.k4.f b;

    public m(TextView textView) {
        this.a = textView;
        this.b = new com.amazon.aps.iva.k4.f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a.a(inputFilterArr);
    }

    public final boolean b() {
        return this.b.a.b();
    }

    public final void c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z) {
        this.b.a.c(z);
    }

    public final void e(boolean z) {
        this.b.a.d(z);
    }
}
