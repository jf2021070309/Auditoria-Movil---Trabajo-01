package com.bumptech.glide.load;

import com.amazon.aps.iva.oc.b;
import com.amazon.aps.iva.uc.x;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static int a(b bVar, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int a = ((ImageHeaderParser) list.get(i)).a(inputStream, bVar);
                if (a != -1) {
                    return a;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(b bVar, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType d = ((ImageHeaderParser) list.get(i)).d(inputStream);
                inputStream.reset();
                if (d != ImageHeaderParser.ImageType.UNKNOWN) {
                    return d;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType c(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType c = list.get(i).c(byteBuffer);
                com.amazon.aps.iva.hd.a.c(byteBuffer);
                if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c;
                }
            } catch (Throwable th) {
                com.amazon.aps.iva.hd.a.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
