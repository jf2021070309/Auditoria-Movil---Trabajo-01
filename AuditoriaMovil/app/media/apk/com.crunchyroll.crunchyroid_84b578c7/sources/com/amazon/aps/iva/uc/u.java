package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class u implements com.amazon.aps.iva.kc.j<InputStream, Bitmap> {
    public final d a = new d();

    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<Bitmap> a(InputStream inputStream, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(com.amazon.aps.iva.hd.a.b(inputStream));
        return this.a.c(createSource, i, i2, hVar);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final /* bridge */ /* synthetic */ boolean b(InputStream inputStream, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return true;
    }
}
