package com.amazon.aps.iva.oc;

import android.graphics.Bitmap;
/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes.dex */
public class d implements c {
    @Override // com.amazon.aps.iva.oc.c
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.amazon.aps.iva.oc.c
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.amazon.aps.iva.oc.c
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.amazon.aps.iva.oc.c
    public final void b() {
    }

    @Override // com.amazon.aps.iva.oc.c
    public final void a(int i) {
    }
}
