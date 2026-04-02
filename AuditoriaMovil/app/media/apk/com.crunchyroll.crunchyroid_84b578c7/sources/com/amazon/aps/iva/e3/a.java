package com.amazon.aps.iva.e3;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
/* compiled from: PackageInfoCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: PackageInfoCompat.java */
    /* renamed from: com.amazon.aps.iva.e3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0213a {
        public static Signature[] a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        public static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        public static Signature[] c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        public static boolean d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        public static boolean e(PackageManager packageManager, String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    public static long a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0213a.b(packageInfo);
        }
        return packageInfo.versionCode;
    }
}
