package com.amazon.aps.iva.yc;

import android.util.Log;
import com.amazon.aps.iva.kc.j;
import com.amazon.aps.iva.nc.w;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: StreamGifDecoder.java */
/* loaded from: classes.dex */
public final class i implements j<InputStream, c> {
    public final List<ImageHeaderParser> a;
    public final j<ByteBuffer, c> b;
    public final com.amazon.aps.iva.oc.b c;

    public i(List list, a aVar, com.amazon.aps.iva.oc.b bVar) {
        this.a = list;
        this.b = aVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final w<c> a(InputStream inputStream, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr2 = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, hVar);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final boolean b(InputStream inputStream, com.amazon.aps.iva.kc.h hVar) throws IOException {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) hVar.c(h.b)).booleanValue()) {
            if (com.bumptech.glide.load.a.b(this.c, inputStream2, this.a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
