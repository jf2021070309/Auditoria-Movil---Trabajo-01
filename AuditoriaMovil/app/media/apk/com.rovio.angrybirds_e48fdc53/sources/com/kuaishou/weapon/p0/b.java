package com.kuaishou.weapon.p0;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class b {
    public static final String a = "AES/CBC/NoPadding";
    public static final int b = 16;
    public static final String c = "a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=";
    private static final String d = "AES/CBC/PKCS5Padding";
    private static final String e = "AES";
    private static final String f = "AES/CBC/PKCS7Padding";

    public static byte[] a(String str, String str2, byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), e);
        Cipher cipher = Cipher.getInstance(d);
        cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
        return cipher.doFinal(bArr);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, e);
            Cipher cipher = Cipher.getInstance(d);
            byte[] bArr3 = new byte[16];
            for (int i = 0; i < 16; i++) {
                bArr3[i] = 0;
            }
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            if (z) {
                byte[] bArr4 = new byte[bArr2.length - 16];
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length - 16);
                bArr2 = bArr4;
            }
            return cipher.doFinal(bArr2);
        } catch (Throwable th) {
            System.out.println(th.getMessage());
            return null;
        }
    }

    public static byte[] b(String str, String str2, byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), e);
        Cipher cipher = Cipher.getInstance(d);
        cipher.init(2, secretKeySpec, new IvParameterSpec(str.getBytes()));
        return cipher.doFinal(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
        if (r8 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r7, java.lang.String r8, byte[] r9) {
        /*
            r0 = -1
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> La7
            r1.<init>(r9)     // Catch: java.lang.Throwable -> La7
            int r9 = r1.length()     // Catch: java.lang.Throwable -> La7
            r2 = 0
            r3 = 16
            if (r9 >= r3) goto L2a
            int r9 = r1.length()     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r4.<init>(r1)     // Catch: java.lang.Throwable -> La7
            r1 = r2
        L19:
            int r5 = 16 - r9
            if (r1 >= r5) goto L25
            java.lang.String r5 = "0"
            r4.append(r5)     // Catch: java.lang.Throwable -> La7
            int r1 = r1 + 1
            goto L19
        L25:
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> La7
            goto L34
        L2a:
            int r9 = r1.length()     // Catch: java.lang.Throwable -> La7
            if (r9 <= r3) goto L34
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.lang.Throwable -> La7
        L34:
            r9 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L92
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L92
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L8f
            javax.crypto.spec.SecretKeySpec r8 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L8b
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "AES"
            r8.<init>(r1, r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L8b
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L8b
            r6 = r2
        L53:
            if (r6 >= r3) goto L5a
            r5[r6] = r2     // Catch: java.lang.Throwable -> L8b
            int r6 = r6 + 1
            goto L53
        L5a:
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L8b
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L8b
            r5 = 2
            r1.init(r5, r8, r3)     // Catch: java.lang.Throwable -> L8b
            javax.crypto.CipherInputStream r8 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L8b
            r8.<init>(r4, r1)     // Catch: java.lang.Throwable -> L8b
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L89
        L6c:
            int r1 = r8.read(r9)     // Catch: java.lang.Throwable -> L89
            if (r1 == r0) goto L76
            r7.write(r9, r2, r1)     // Catch: java.lang.Throwable -> L89
            goto L6c
        L76:
            r8.close()     // Catch: java.lang.Throwable -> L89
            r7.close()     // Catch: java.io.IOException -> L7d java.lang.Throwable -> La7
            goto L7e
        L7d:
            r7 = move-exception
        L7e:
            r4.close()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> La7
            goto L83
        L82:
            r7 = move-exception
        L83:
            r8.close()     // Catch: java.io.IOException -> L87 java.lang.Throwable -> La7
            goto La6
        L87:
            r7 = move-exception
            goto La6
        L89:
            r9 = move-exception
            goto L8d
        L8b:
            r8 = move-exception
            r8 = r9
        L8d:
            r9 = r7
            goto L95
        L8f:
            r7 = move-exception
            r8 = r9
            goto L95
        L92:
            r7 = move-exception
            r8 = r9
            r4 = r8
        L95:
            if (r9 == 0) goto L9c
            r9.close()     // Catch: java.io.IOException -> L9b java.lang.Throwable -> La7
            goto L9c
        L9b:
            r7 = move-exception
        L9c:
            if (r4 == 0) goto La3
            r4.close()     // Catch: java.io.IOException -> La2 java.lang.Throwable -> La7
            goto La3
        La2:
            r7 = move-exception
        La3:
            if (r8 == 0) goto La6
            goto L83
        La6:
            return r2
        La7:
            r7 = move-exception
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.b.c(java.lang.String, java.lang.String, byte[]):int");
    }
}
