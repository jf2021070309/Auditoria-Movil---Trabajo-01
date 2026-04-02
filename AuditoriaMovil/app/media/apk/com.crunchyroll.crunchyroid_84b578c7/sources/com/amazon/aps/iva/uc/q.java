package com.amazon.aps.iva.uc;

import com.amazon.aps.iva.hd.a;
import com.amazon.aps.iva.l4.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ExifInterfaceImageHeaderParser.java */
/* loaded from: classes.dex */
public final class q implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, com.amazon.aps.iva.oc.b bVar) throws IOException {
        com.amazon.aps.iva.l4.a aVar = new com.amazon.aps.iva.l4.a(inputStream);
        a.c c = aVar.c("Orientation");
        int i = 1;
        if (c != null) {
            try {
                i = c.f(aVar.f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(ByteBuffer byteBuffer, com.amazon.aps.iva.oc.b bVar) throws IOException {
        AtomicReference<byte[]> atomicReference = com.amazon.aps.iva.hd.a.a;
        return a(new a.C0333a(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
