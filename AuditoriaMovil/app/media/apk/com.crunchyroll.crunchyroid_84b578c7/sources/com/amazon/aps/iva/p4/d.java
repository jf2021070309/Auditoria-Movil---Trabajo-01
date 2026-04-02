package com.amazon.aps.iva.p4;

import android.graphics.Bitmap;
/* compiled from: Image.kt */
/* loaded from: classes.dex */
public final class d implements r {
    public final Bitmap a;

    public d(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.a;
        sb.append(bitmap.getWidth());
        sb.append("px x ");
        sb.append(bitmap.getHeight());
        sb.append("px))");
        return sb.toString();
    }
}
