package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class le implements li<byte[]> {
    @Override // com.flurry.sdk.li
    public final /* synthetic */ void a(OutputStream outputStream, byte[] bArr) {
        byte[] bArr2 = bArr;
        if (outputStream == null || bArr2 == null) {
            return;
        }
        outputStream.write(bArr2, 0, bArr2.length);
    }

    @Override // com.flurry.sdk.li
    public final /* synthetic */ byte[] a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ma.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
