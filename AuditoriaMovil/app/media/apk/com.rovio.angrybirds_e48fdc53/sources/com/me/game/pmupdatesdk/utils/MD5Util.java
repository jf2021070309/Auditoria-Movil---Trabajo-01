package com.me.game.pmupdatesdk.utils;

import com.facebook.appevents.AppEventsConstants;
import com.flurry.android.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.MessageDigest;
/* loaded from: classes7.dex */
public class MD5Util {
    /* JADX WARN: Removed duplicated region for block: B:69:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getPartFileMd5(java.io.File r16, long r17, int r19) {
        /*
            r1 = 0
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> La3
            r1 = r0
            r3 = 0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L8f
            java.lang.String r4 = "r"
            r5 = r16
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L7b
            r3 = r0
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L7b
            r6 = 0
            r7 = 65536(0x10000, float:9.18355E-41)
            r8 = r17
            r3.seek(r8)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L72
            r10 = r19
            if (r10 >= r0) goto L26
            r7 = r19
        L26:
            r0 = 0
            int r11 = r3.read(r4, r0, r7)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r6 = r11
            r12 = -1
            if (r11 == r12) goto L3a
            r1.update(r4, r0, r6)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            int r10 = r10 - r6
            if (r10 > 0) goto L36
            goto L3a
        L36:
            if (r10 >= r7) goto L26
            r7 = r10
            goto L26
        L3a:
            byte[] r11 = r1.digest()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r12.<init>()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            int r13 = r11.length     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
        L44:
            if (r0 >= r13) goto L5e
            r14 = r11[r0]     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r15 = r14 & 255(0xff, float:3.57E-43)
            r2 = 16
            if (r15 >= r2) goto L53
            java.lang.String r2 = "0"
            r12.append(r2)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
        L53:
            java.lang.String r2 = java.lang.Integer.toHexString(r15)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r12.append(r2)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            int r0 = r0 + 1
            goto L44
        L5e:
            java.lang.String r2 = r12.toString()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r3.close()     // Catch: java.lang.Exception -> L66
            goto L67
        L66:
            r0 = move-exception
        L67:
            return r2
        L68:
            r0 = move-exception
            r2 = r0
            goto L85
        L6b:
            r0 = move-exception
            goto L96
        L6d:
            r0 = move-exception
            r10 = r19
            r2 = r0
            goto L85
        L72:
            r0 = move-exception
            goto L94
        L74:
            r0 = move-exception
            r8 = r17
            r10 = r19
            r2 = r0
            goto L85
        L7b:
            r0 = move-exception
            goto L92
        L7d:
            r0 = move-exception
            r5 = r16
            r8 = r17
            r10 = r19
            r2 = r0
        L85:
            if (r3 == 0) goto L8d
            r3.close()     // Catch: java.lang.Exception -> L8b
            goto L8d
        L8b:
            r0 = move-exception
            goto L8e
        L8d:
        L8e:
            throw r2
        L8f:
            r0 = move-exception
            r5 = r16
        L92:
            r8 = r17
        L94:
            r10 = r19
        L96:
            r2 = r0
            if (r3 == 0) goto La0
            r3.close()     // Catch: java.lang.Exception -> L9e
            goto La0
        L9e:
            r0 = move-exception
            goto La1
        La0:
        La1:
            r4 = 0
            return r4
        La3:
            r0 = move-exception
            r5 = r16
            r8 = r17
            r10 = r19
            r4 = 0
            r0.printStackTrace()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.me.game.pmupdatesdk.utils.MD5Util.getPartFileMd5(java.io.File, long, int):java.lang.String");
    }

    public static String string2MD5(String inStr) {
        byte[] byteArray = inStr.getBytes();
        return hexDigest(byteArray);
    }

    public static String hexDigest(byte[] bytes) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md5.digest(bytes);
            StringBuilder hexValue = new StringBuilder();
            for (byte md5Byte : md5Bytes) {
                int val = md5Byte & Constants.UNKNOWN;
                if (val < 16) {
                    hexValue.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                hexValue.append(Integer.toHexString(val));
            }
            return hexValue.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String convertMD5(String inStr) {
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;
    }

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        printStream.println("原始：tangfuqiang");
        PrintStream printStream2 = System.out;
        printStream2.println("MD5后：" + string2MD5("tangfuqiang"));
        PrintStream printStream3 = System.out;
        printStream3.println("加密的：" + convertMD5("tangfuqiang"));
        PrintStream printStream4 = System.out;
        printStream4.println("解密的：" + convertMD5(convertMD5("tangfuqiang")));
    }

    public static String getFileMD5(String path) {
        return getFileMD5(new File(path));
    }

    public static String getFileMD5(File file) {
        if (file.isFile()) {
            byte[] buffer = new byte[1024];
            try {
                MessageDigest digest = MessageDigest.getInstance("MD5");
                FileInputStream in = new FileInputStream(file);
                while (true) {
                    int len = in.read(buffer, 0, 1024);
                    if (len == -1) {
                        break;
                    }
                    digest.update(buffer, 0, len);
                }
                in.close();
                BigInteger bigInt = new BigInteger(1, digest.digest());
                StringBuilder builder = new StringBuilder(bigInt.toString(16));
                while (builder.length() < 32) {
                    builder.insert(0, '0');
                }
                return builder.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
