package com.kwad.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class p {
    private static String aIu = "";
    private static String aIv = "";
    private static String aIw = "";

    private static String a(String str, InputStream inputStream) {
        String fl;
        synchronized (p.class) {
            com.kwad.sdk.pngencrypt.o oVar = new com.kwad.sdk.pngencrypt.o(inputStream, true);
            oVar.GR();
            fl = oVar.GQ().fl(str);
            oVar.end();
        }
        return fl;
    }

    public static String db(int i) {
        Context HA = ServiceProvider.HA();
        String str = aIu;
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty("aes_key")) {
                com.kwad.sdk.core.e.c.e("EncryptUtils", "EncryptUtils getKey get id is error ");
            }
            try {
                InputStream open = HA.getResources().getAssets().open("ksad_common_encrypt_image.png");
                if (open == null) {
                    open = HA.getAssets().open("ksad_common_encrypt_image.png");
                }
                String a = a("aes_key", open);
                if (TextUtils.isEmpty(a)) {
                    com.kwad.sdk.core.e.c.e("EncryptUtils", "EncryptUtils getKey get encryptedKey is invalid ");
                }
                aIu = a;
                return a;
            }
        }
        return str;
    }
}
