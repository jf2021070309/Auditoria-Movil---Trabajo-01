package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes2.dex */
public class AndroidUtilsLight {
    private static volatile int zzgd = -1;

    public static byte[] getPackageCertificateHashBytes(Context context, String str) {
        MessageDigest zzi;
        PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
        if (packageInfo.signatures != null && packageInfo.signatures.length == 1 && (zzi = zzi("SHA1")) != null) {
            return zzi.digest(packageInfo.signatures[0].toByteArray());
        }
        return null;
    }

    public static MessageDigest zzi(String str) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 2) {
                try {
                    messageDigest = MessageDigest.getInstance(str);
                } catch (NoSuchAlgorithmException e) {
                }
                if (messageDigest == null) {
                    i = i2 + 1;
                } else {
                    return messageDigest;
                }
            } else {
                return null;
            }
        }
    }

    public static Context getDeviceProtectedStorageContext(Context context) {
        if (PlatformVersion.isAtLeastN() && !context.isDeviceProtectedStorage()) {
            return context.createDeviceProtectedStorageContext();
        }
        return context;
    }
}
