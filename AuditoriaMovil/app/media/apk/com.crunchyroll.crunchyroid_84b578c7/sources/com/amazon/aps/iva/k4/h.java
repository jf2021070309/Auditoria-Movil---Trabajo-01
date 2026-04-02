package com.amazon.aps.iva.k4;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* compiled from: EmojiTransformationMethod.java */
/* loaded from: classes.dex */
public final class h implements TransformationMethod {
    public final TransformationMethod a;

    public h(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.d.a().b() == 1) {
            return androidx.emoji2.text.d.a().h(charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
