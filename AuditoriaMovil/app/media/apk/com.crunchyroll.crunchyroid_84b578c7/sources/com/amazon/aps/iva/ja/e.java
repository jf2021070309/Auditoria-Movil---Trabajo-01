package com.amazon.aps.iva.ja;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: NetworkCache.java */
/* loaded from: classes.dex */
public final class e {
    public final d a;

    public e(com.amazon.aps.iva.z9.c cVar) {
        this.a = cVar;
    }

    public static String a(String str, c cVar, boolean z) {
        String str2;
        if (z) {
            str2 = cVar.tempExtension();
        } else {
            str2 = cVar.extension;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return defpackage.e.e("lottie_cache_", replaceAll, str2);
    }

    public final File b() {
        com.amazon.aps.iva.z9.c cVar = (com.amazon.aps.iva.z9.c) this.a;
        cVar.getClass();
        File file = new File(cVar.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File c(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(b(), a(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
