package com.facebook.ads.internal.q.a;

import com.flurry.android.Constants;
import com.umeng.analytics.pro.cv;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes2.dex */
public class h {
    public static String a(File file) {
        FileInputStream fileInputStream;
        int read;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bArr = new byte[1024];
                    do {
                        read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        }
                    } while (read != -1);
                    return b(messageDigest.digest());
                } catch (IOException e) {
                    throw new Exception("IO exception.");
                } catch (NoSuchAlgorithmException e2) {
                    throw new Exception("No such algorithm.");
                }
            } catch (FileNotFoundException e3) {
                throw new Exception("File not found or not accessible.");
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e4) {
            }
        }
    }

    public static final String a(String str) {
        return a(new File(str));
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = (b >>> 4) & 15;
            int i2 = 0;
            while (true) {
                sb.append((i < 0 || i > 9) ? (char) ((i - 10) + 97) : (char) (i + 48));
                int i3 = b & cv.m;
                int i4 = i2 + 1;
                if (i2 >= 1) {
                    break;
                }
                i2 = i4;
                i = i3;
            }
        }
        return sb.toString();
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & Constants.UNKNOWN) + 256, 16).substring(1));
        }
        return sb.toString();
    }
}
