package com.kwad.sdk.api.loader;

import com.facebook.appevents.AppEventsConstants;
import com.flurry.android.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
/* loaded from: classes.dex */
final class s {
    private static final char[] ajy = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable] */
    public static String getFileMD5(File file) {
        Throwable th;
        Exception e;
        DigestInputStream digestInputStream;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                digestInputStream = new DigestInputStream(new FileInputStream((File) file), messageDigest);
                try {
                    while (digestInputStream.read(new byte[1024]) != -1) {
                    }
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder(digest.length * 2);
                    for (byte b : digest) {
                        int i = b & Constants.UNKNOWN;
                        if (i < 16) {
                            sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        }
                        sb.append(Integer.toHexString(i));
                    }
                    String sb2 = sb.toString();
                    b(digestInputStream);
                    return sb2;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    b(digestInputStream);
                    return "";
                }
            } catch (Throwable th2) {
                th = th2;
                b(file);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            digestInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            file = 0;
            b(file);
            throw th;
        }
    }
}
