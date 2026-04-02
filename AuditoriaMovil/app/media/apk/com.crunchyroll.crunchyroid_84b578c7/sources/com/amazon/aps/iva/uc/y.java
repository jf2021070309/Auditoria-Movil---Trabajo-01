package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes.dex */
public final class y implements com.amazon.aps.iva.kc.j<Uri, Bitmap> {
    public final com.amazon.aps.iva.wc.i a;
    public final com.amazon.aps.iva.oc.c b;

    public y(com.amazon.aps.iva.wc.i iVar, com.amazon.aps.iva.oc.c cVar) {
        this.a = iVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<Bitmap> a(Uri uri, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        com.amazon.aps.iva.nc.w c = this.a.c(uri, hVar);
        if (c == null) {
            return null;
        }
        return o.a(this.b, (Drawable) ((com.amazon.aps.iva.wc.f) c).get(), i, i2);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final boolean b(Uri uri, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }
}
