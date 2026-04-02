package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class h implements com.amazon.aps.iva.kc.j<ByteBuffer, Bitmap> {
    public final d a = new d();

    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<Bitmap> a(ByteBuffer byteBuffer, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.a.c(createSource, i, i2, hVar);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final /* bridge */ /* synthetic */ boolean b(ByteBuffer byteBuffer, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return true;
    }
}
