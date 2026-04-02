package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import com.umeng.analytics.pro.cv;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public class y {
    private static final MessageDigest a = a();
    public static final Charset b = Charset.forName("UTF-8");
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private y() {
    }

    public static String a(String str) {
        byte[] digest;
        MessageDigest messageDigest = a;
        if (str == null) {
            return "";
        }
        byte[] bytes = str.getBytes(b);
        synchronized (y.class) {
            digest = messageDigest.digest(bytes);
        }
        return a(digest);
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = c;
            cArr[i] = cArr2[(b2 & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & cv.m];
        }
        return new String(cArr);
    }

    private static MessageDigest a() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
