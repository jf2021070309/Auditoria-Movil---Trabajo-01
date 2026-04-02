package com.android.support.v4.main;

import android.content.Context;
import android.os.Process;
import android.util.Base64;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
/* loaded from: classes3.dex */
public class c2a {
    public static void onCreate(Context context, String str) {
        try {
            byte[] digest = MessageDigest.getInstance(text("U0hBMQ==")).digest(((X509Certificate) CertificateFactory.getInstance(text("WDUwOQ==")).generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded());
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (int i2 = 0; i2 < digest.length; i2++) {
                String hexString = Integer.toHexString(digest[i2]);
                int length = hexString.length();
                if (length == 1) {
                    hexString = new StringBuffer().append("0").append(hexString).toString();
                }
                if (length > 2) {
                    hexString = hexString.substring(length - 2, length);
                }
                sb.append(hexString.toUpperCase());
                if (i2 < digest.length - 1) {
                    sb.append(CoreConstants.COLON_CHAR);
                }
            }
            String sb2 = sb.toString();
            if (!sb2.equals(text(str))) {
                System.exit(0);
            }
            if (sb2.equals(text(str))) {
                return;
            }
            Process.killProcess(Process.myPid());
        } catch (Exception e2) {
            Toast.makeText(context, new StringBuffer().append(text("RXJyb3I6IA==")).append(e2).toString(), 1).show();
            System.exit(0);
        }
    }

    public static String text(String str) {
        String str2 = "";
        try {
            str2 = new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e2) {
        }
        return str2;
    }
}
