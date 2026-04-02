package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
/* compiled from: BitmapResource.java */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.nc.w<Bitmap>, com.amazon.aps.iva.nc.s {
    public final Bitmap b;
    public final com.amazon.aps.iva.oc.c c;

    public e(Bitmap bitmap, com.amazon.aps.iva.oc.c cVar) {
        if (bitmap != null) {
            this.b = bitmap;
            if (cVar != null) {
                this.c = cVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static e c(Bitmap bitmap, com.amazon.aps.iva.oc.c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, cVar);
    }

    @Override // com.amazon.aps.iva.nc.w
    public final int a() {
        return com.amazon.aps.iva.hd.l.c(this.b);
    }

    @Override // com.amazon.aps.iva.nc.w
    public final void b() {
        this.c.d(this.b);
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Bitmap get() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.nc.s
    public final void initialize() {
        this.b.prepareToDraw();
    }
}
