package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.m.a;
/* loaded from: classes3.dex */
public class ScaledDrawableWrapper extends a {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(Drawable drawable, int i, int i2) {
        super(drawable);
        this.width = i;
        this.height = i2;
    }

    @Override // com.amazon.aps.iva.m.a, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // com.amazon.aps.iva.m.a, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }
}
