package com.amazon.aps.iva.zc;

import android.graphics.Bitmap;
import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.nc.w;
import java.io.ByteArrayOutputStream;
/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes.dex */
public final class a implements c<Bitmap, byte[]> {
    public final Bitmap.CompressFormat b = Bitmap.CompressFormat.JPEG;
    public final int c = 100;

    @Override // com.amazon.aps.iva.zc.c
    public final w<byte[]> i(w<Bitmap> wVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.b, this.c, byteArrayOutputStream);
        wVar.b();
        return new com.amazon.aps.iva.vc.b(byteArrayOutputStream.toByteArray());
    }
}
