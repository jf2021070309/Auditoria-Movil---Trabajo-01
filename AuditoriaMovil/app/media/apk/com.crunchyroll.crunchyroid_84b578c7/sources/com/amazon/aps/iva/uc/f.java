package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
/* compiled from: BitmapTransformation.java */
/* loaded from: classes.dex */
public abstract class f implements com.amazon.aps.iva.kc.l<Bitmap> {
    @Override // com.amazon.aps.iva.kc.l
    public final com.amazon.aps.iva.nc.w b(com.bumptech.glide.c cVar, com.amazon.aps.iva.nc.w wVar, int i, int i2) {
        if (com.amazon.aps.iva.hd.l.i(i, i2)) {
            com.amazon.aps.iva.oc.c cVar2 = com.bumptech.glide.a.a(cVar).b;
            Bitmap bitmap = (Bitmap) wVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = c(cVar2, bitmap, i, i2);
            if (!bitmap.equals(c)) {
                return e.c(c, cVar2);
            }
            return wVar;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.n.a("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    public abstract Bitmap c(com.amazon.aps.iva.oc.c cVar, Bitmap bitmap, int i, int i2);
}
