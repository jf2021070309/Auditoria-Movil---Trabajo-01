package com.flurry.sdk;

import com.facebook.ads.AudienceNetworkActivity;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class lj implements li<String> {
    @Override // com.flurry.sdk.li
    public final /* synthetic */ void a(OutputStream outputStream, String str) {
        String str2 = str;
        if (outputStream == null || str2 == null) {
            return;
        }
        byte[] bytes = str2.getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.flurry.sdk.li
    public final /* synthetic */ String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ma.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toString();
    }
}
