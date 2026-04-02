package com.amazon.aps.iva.zc;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.nc.w;
import com.amazon.aps.iva.uc.e;
/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes.dex */
public final class b implements c<Drawable, byte[]> {
    public final com.amazon.aps.iva.oc.c b;
    public final c<Bitmap, byte[]> c;
    public final c<com.amazon.aps.iva.yc.c, byte[]> d;

    public b(com.amazon.aps.iva.oc.c cVar, a aVar, com.amazon.aps.iva.hb.d dVar) {
        this.b = cVar;
        this.c = aVar;
        this.d = dVar;
    }

    @Override // com.amazon.aps.iva.zc.c
    public final w<byte[]> i(w<Drawable> wVar, h hVar) {
        Drawable drawable = wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.c.i(e.c(((BitmapDrawable) drawable).getBitmap(), this.b), hVar);
        } else if (drawable instanceof com.amazon.aps.iva.yc.c) {
            return this.d.i(wVar, hVar);
        } else {
            return null;
        }
    }
}
