package com.amazon.aps.iva.vp;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.gson.JsonObject;
/* compiled from: BatchFileHandler.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<byte[], byte[]> {
    public static final c h = new c();

    public c() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final byte[] invoke(byte[] bArr) {
        byte[] bArr2 = bArr;
        j.f(bArr2, "it");
        int length = bArr2.length;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ev_size", Integer.valueOf(length));
        String jsonElement = jsonObject.toString();
        j.e(jsonElement, "JsonObject()\n           …              .toString()");
        byte[] bytes = jsonElement.getBytes(com.amazon.aps.iva.oe0.a.b);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
