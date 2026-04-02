package com.amazon.aps.iva.aa0;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
/* compiled from: HttpRequests.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final /* synthetic */ int a = 0;

    static {
        com.amazon.aps.iva.oe0.a aVar = com.amazon.aps.iva.oe0.a.a;
    }

    public static final byte[] a(byte[] bArr) throws IOException {
        j.f(bArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.flush();
            q qVar = q.a;
            com.amazon.aps.iva.a60.b.k(gZIPOutputStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            com.amazon.aps.iva.a60.b.k(byteArrayOutputStream, null);
            j.e(byteArray, "zippedBytes");
            return byteArray;
        } finally {
        }
    }
}
