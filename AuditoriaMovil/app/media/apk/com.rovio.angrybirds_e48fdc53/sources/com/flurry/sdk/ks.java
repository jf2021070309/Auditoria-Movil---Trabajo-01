package com.flurry.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes2.dex */
public class ks<ObjectType> {
    private static final String a = ks.class.getSimpleName();
    private static final byte[] b = {113, -92, -8, 125, 121, 107, -65, -61, -74, -114, -32, 0, -57, -87, -35, -56, -6, -52, 51, 126, -104, 49, 79, -52, 118, -84, 99, -52, -14, -126, -27, -64};
    private String c;
    private li<ObjectType> d;

    public ks(String str, li<ObjectType> liVar) {
        this.c = str;
        this.d = liVar;
    }

    public static int a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        kg kgVar = new kg();
        kgVar.update(bArr);
        return kgVar.b();
    }

    public final byte[] a(ObjectType objecttype) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.d.a(byteArrayOutputStream, objecttype);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ko.a(3, a, "Encoding " + this.c + ": " + new String(byteArray));
        lg lgVar = new lg(new le());
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        lgVar.a(byteArrayOutputStream2, byteArray);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        c(byteArray2);
        return byteArray2;
    }

    private static void c(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int length2 = b.length;
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) ((bArr[i] ^ b[i % length2]) ^ ((i * 31) % 251));
            }
        }
    }

    public final ObjectType b(byte[] bArr) {
        if (bArr == null) {
            throw new IOException("Decoding: " + this.c + ": Nothing to decode");
        }
        c(bArr);
        byte[] bArr2 = (byte[]) new lg(new le()).a(new ByteArrayInputStream(bArr));
        ko.a(3, a, "Decoding: " + this.c + ": " + new String(bArr2));
        return this.d.a(new ByteArrayInputStream(bArr2));
    }
}
