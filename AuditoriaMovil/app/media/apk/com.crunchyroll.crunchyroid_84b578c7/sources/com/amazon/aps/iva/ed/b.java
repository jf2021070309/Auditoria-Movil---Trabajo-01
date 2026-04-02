package com.amazon.aps.iva.ed;

import android.graphics.Bitmap;
import android.widget.ImageView;
/* compiled from: BitmapImageViewTarget.java */
/* loaded from: classes.dex */
public final class b extends f<Bitmap> {
    @Override // com.amazon.aps.iva.ed.f
    public final void setResource(Bitmap bitmap) {
        ((ImageView) this.view).setImageBitmap(bitmap);
    }
}
