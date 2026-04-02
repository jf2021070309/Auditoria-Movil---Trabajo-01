package com.amazon.aps.iva.yc;

import android.graphics.Bitmap;
import com.amazon.aps.iva.kc.j;
import com.amazon.aps.iva.nc.w;
import java.io.IOException;
/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes.dex */
public final class g implements j<com.amazon.aps.iva.gc.a, Bitmap> {
    public final com.amazon.aps.iva.oc.c a;

    public g(com.amazon.aps.iva.oc.c cVar) {
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final w<Bitmap> a(com.amazon.aps.iva.gc.a aVar, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return com.amazon.aps.iva.uc.e.c(aVar.a(), this.a);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final /* bridge */ /* synthetic */ boolean b(com.amazon.aps.iva.gc.a aVar, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return true;
    }
}
