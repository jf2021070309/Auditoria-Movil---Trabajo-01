package com.ss.android.downloadlib.dr.dr;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
/* loaded from: classes3.dex */
public class o {
    public static byte[] dr(CharSequence charSequence, String str) throws Exception {
        return dr(charSequence.toString().getBytes(), str);
    }

    public static byte[] dr(byte[] bArr, String str) throws Exception {
        return dr(new ByteArrayInputStream(bArr), str);
    }

    public static byte[] dr(InputStream inputStream, String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return messageDigest.digest();
            }
            messageDigest.update(bArr, 0, read);
        }
    }
}
