package com.bytedance.mapplog.util;

import bykvm_19do.bykvm_19do.bykvm_19do.l0;
/* loaded from: classes.dex */
public class TTEncryptUtils {
    private static boolean a = true;

    static {
        try {
            System.loadLibrary("tobEmbedEncryptForM");
            a = true;
        } catch (UnsatisfiedLinkError e) {
            a = false;
            l0.a(e);
            for (int i = 0; i < 20; i++) {
                l0.c("********** --==-- 注意：GroMore so库【tobEmbedEncryptForM】未打进apk中，请检查打包环节 --==-- **********", null);
            }
        }
    }

    public static boolean a() {
        return a;
    }

    public static byte[] a(byte[] bArr, int i) {
        try {
            return ttEncrypt(bArr, i);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static native byte[] ttEncrypt(byte[] bArr, int i);
}
