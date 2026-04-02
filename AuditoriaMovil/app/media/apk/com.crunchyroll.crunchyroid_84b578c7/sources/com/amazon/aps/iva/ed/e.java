package com.amazon.aps.iva.ed;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: DrawableImageViewTarget.java */
/* loaded from: classes.dex */
public class e extends f<Drawable> {
    public e(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public e(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    @Override // com.amazon.aps.iva.ed.f
    public void setResource(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }
}
