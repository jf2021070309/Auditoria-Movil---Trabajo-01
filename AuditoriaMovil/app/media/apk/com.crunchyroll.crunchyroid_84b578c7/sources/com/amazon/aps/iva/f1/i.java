package com.amazon.aps.iva.f1;

import android.graphics.Bitmap;
/* compiled from: AndroidImageBitmap.android.kt */
/* loaded from: classes.dex */
public final class i implements i0 {
    public final Bitmap a;

    public i(Bitmap bitmap) {
        com.amazon.aps.iva.yb0.j.f(bitmap, "bitmap");
        this.a = bitmap;
    }

    @Override // com.amazon.aps.iva.f1.i0
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // com.amazon.aps.iva.f1.i0
    public final int getWidth() {
        return this.a.getWidth();
    }
}
