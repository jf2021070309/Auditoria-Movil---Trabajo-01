package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.kc.j<ImageDecoder.Source, Bitmap> {
    public final com.amazon.aps.iva.oc.d a = new com.amazon.aps.iva.oc.d();

    @Override // com.amazon.aps.iva.kc.j
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.nc.w<Bitmap> a(ImageDecoder.Source source, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return c(com.amazon.aps.iva.j80.a.b(source), i, i2, hVar);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final /* bridge */ /* synthetic */ boolean b(ImageDecoder.Source source, com.amazon.aps.iva.kc.h hVar) throws IOException {
        com.amazon.aps.iva.j80.b.d(source);
        return true;
    }

    public final e c(ImageDecoder.Source source, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new com.amazon.aps.iva.tc.a(i, i2, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new e(decodeBitmap, this.a);
    }
}
