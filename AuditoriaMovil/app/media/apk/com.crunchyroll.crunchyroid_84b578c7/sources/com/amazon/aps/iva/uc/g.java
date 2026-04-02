package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import com.amazon.aps.iva.uc.t;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.kc.j<ByteBuffer, Bitmap> {
    public final n a;

    public g(n nVar) {
        this.a = nVar;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<Bitmap> a(ByteBuffer byteBuffer, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        n nVar = this.a;
        List<ImageHeaderParser> list = nVar.d;
        return nVar.a(new t.a(nVar.c, byteBuffer, list), i, i2, hVar, n.k);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final boolean b(ByteBuffer byteBuffer, com.amazon.aps.iva.kc.h hVar) throws IOException {
        this.a.getClass();
        return true;
    }
}
