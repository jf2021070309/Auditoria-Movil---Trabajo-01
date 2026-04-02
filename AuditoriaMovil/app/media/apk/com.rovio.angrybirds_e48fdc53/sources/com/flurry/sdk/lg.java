package com.flurry.sdk;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public final class lg<ObjectType> extends lf<ObjectType> {
    public lg(li<ObjectType> liVar) {
        super(liVar);
    }

    @Override // com.flurry.sdk.lf, com.flurry.sdk.li
    public final void a(OutputStream outputStream, ObjectType objecttype) {
        GZIPOutputStream gZIPOutputStream;
        if (outputStream != null) {
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    super.a(gZIPOutputStream, objecttype);
                    ma.a(gZIPOutputStream);
                } catch (Throwable th) {
                    th = th;
                    ma.a(gZIPOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
        }
    }

    @Override // com.flurry.sdk.lf, com.flurry.sdk.li
    public final ObjectType a(InputStream inputStream) {
        GZIPInputStream gZIPInputStream;
        Throwable th;
        ObjectType objecttype = null;
        if (inputStream != null) {
            try {
                gZIPInputStream = new GZIPInputStream(inputStream);
            } catch (Throwable th2) {
                gZIPInputStream = null;
                th = th2;
            }
            try {
                objecttype = (ObjectType) super.a(gZIPInputStream);
                ma.a((Closeable) gZIPInputStream);
            } catch (Throwable th3) {
                th = th3;
                ma.a((Closeable) gZIPInputStream);
                throw th;
            }
        }
        return objecttype;
    }
}
