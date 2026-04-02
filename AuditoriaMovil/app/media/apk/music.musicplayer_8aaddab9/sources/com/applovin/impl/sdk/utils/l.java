package com.applovin.impl.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public class l {
    public static String a(String str, String str2) {
        return a(str, str2, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    public static String a(String str, String str2, long j2) {
        return a(str, str2, j2, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    private static String a(String str, String str2, long j2, byte[] bArr) {
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (bArr != null) {
                    char c2 = ' ';
                    if (bArr.length >= 32) {
                        if (str == null || str.isEmpty()) {
                            return str;
                        }
                        try {
                            String substring = str2.substring(32);
                            String substring2 = str2.substring(0, 32);
                            byte[] bytes = str.getBytes("UTF-8");
                            byte[] a = a(substring2, bArr);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(((byte) ((j2 >> 0) & 255)) ^ a[0]);
                            byteArrayOutputStream.write(((byte) ((j2 >> 8) & 255)) ^ a[1]);
                            byteArrayOutputStream.write(((byte) ((j2 >> 16) & 255)) ^ a[2]);
                            byteArrayOutputStream.write(((byte) ((j2 >> 24) & 255)) ^ a[3]);
                            byteArrayOutputStream.write(((byte) ((j2 >> 32) & 255)) ^ a[4]);
                            byteArrayOutputStream.write(((byte) ((j2 >> 40) & 255)) ^ a[5]);
                            byteArrayOutputStream.write(((byte) ((j2 >> 48) & 255)) ^ a[6]);
                            byteArrayOutputStream.write(((byte) ((j2 >> 56) & 255)) ^ a[7]);
                            int i2 = 0;
                            while (i2 < bytes.length) {
                                long j3 = j2 + i2;
                                long j4 = (j3 ^ (j3 >> 33)) * (-4417276706812531889L);
                                long j5 = (j4 ^ (j4 >> 29)) * (-8796714831421723037L);
                                long j6 = j5 ^ (j5 >> c2);
                                int i3 = i2 + 0;
                                byteArrayOutputStream.write((byte) (((i3 >= bytes.length ? (byte) 0 : bytes[i3]) ^ a[i3 % a.length]) ^ ((j6 >> 0) & 255)));
                                int i4 = i2 + 1;
                                byteArrayOutputStream.write((byte) ((a[i4 % a.length] ^ (i4 >= bytes.length ? (byte) 0 : bytes[i4])) ^ ((j6 >> 8) & 255)));
                                int i5 = i2 + 2;
                                byteArrayOutputStream.write((byte) ((a[i5 % a.length] ^ (i5 >= bytes.length ? (byte) 0 : bytes[i5])) ^ ((j6 >> 16) & 255)));
                                int i6 = i2 + 3;
                                byteArrayOutputStream.write((byte) ((a[i6 % a.length] ^ (i6 >= bytes.length ? (byte) 0 : bytes[i6])) ^ ((j6 >> 24) & 255)));
                                int i7 = i2 + 4;
                                byteArrayOutputStream.write((byte) ((a[i7 % a.length] ^ (i7 >= bytes.length ? (byte) 0 : bytes[i7])) ^ ((j6 >> 32) & 255)));
                                int i8 = i2 + 5;
                                byteArrayOutputStream.write((byte) ((a[i8 % a.length] ^ (i8 >= bytes.length ? (byte) 0 : bytes[i8])) ^ ((j6 >> 40) & 255)));
                                int i9 = i2 + 6;
                                byteArrayOutputStream.write((byte) ((a[i9 % a.length] ^ (i9 >= bytes.length ? (byte) 0 : bytes[i9])) ^ ((j6 >> 48) & 255)));
                                int i10 = i2 + 7;
                                byteArrayOutputStream.write((byte) ((a[i10 % a.length] ^ (i10 >= bytes.length ? (byte) 0 : bytes[i10])) ^ ((j6 >> 56) & 255)));
                                i2 += 8;
                                c2 = ' ';
                            }
                            String b2 = b(byteArrayOutputStream.toByteArray());
                            String a2 = a(bArr);
                            return "1:" + a2 + ":" + substring + ":" + b2;
                        } catch (IOException unused) {
                            return null;
                        }
                    }
                    throw new IllegalArgumentException("Salt is too short");
                }
                throw new IllegalArgumentException("No salt specified");
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static String a(String str, String str2, byte[] bArr) {
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (bArr != null) {
                    char c2 = ' ';
                    if (bArr.length >= 32) {
                        if (TextUtils.isEmpty(str) || str.trim().startsWith("{")) {
                            return str;
                        }
                        String[] split = str.split(":");
                        char c3 = 0;
                        try {
                            if ("1".equals(split[0]) && split.length == 4) {
                                char c4 = 1;
                                String str3 = split[1];
                                String str4 = split[2];
                                byte[] a = a(split[3]);
                                if (str2.endsWith(str4) && a(bArr).equals(str3)) {
                                    byte[] a2 = a(str2.substring(0, 32), bArr);
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a);
                                    char c5 = '\b';
                                    try {
                                        long read = (((byteArrayInputStream.read() ^ a2[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ a2[0]) & 255) << 0) | (((byteArrayInputStream.read() ^ a2[1]) & 255) << 8) | (((byteArrayInputStream.read() ^ a2[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ a2[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ a2[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ a2[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ a2[7]) & 255) << 56);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        byte[] bArr2 = new byte[8];
                                        int read2 = byteArrayInputStream.read(bArr2);
                                        int i2 = 0;
                                        while (read2 >= 0) {
                                            long j2 = i2 + read;
                                            long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                                            long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                                            long j5 = j4 ^ (j4 >> c2);
                                            byteArrayOutputStream.write((byte) ((bArr2[c3] ^ a2[(i2 + 0) % a2.length]) ^ ((j5 >> c3) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[c4] ^ a2[(i2 + 1) % a2.length]) ^ ((j5 >> c5) & 255)));
                                            long j6 = read;
                                            byteArrayOutputStream.write((byte) ((a2[(i2 + 2) % a2.length] ^ bArr2[2]) ^ ((j5 >> 16) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[3] ^ a2[(i2 + 3) % a2.length]) ^ ((j5 >> 24) & 255)));
                                            byteArrayOutputStream.write((byte) ((a2[(i2 + 4) % a2.length] ^ bArr2[4]) ^ ((j5 >> c2) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[5] ^ a2[(i2 + 5) % a2.length]) ^ ((j5 >> 40) & 255)));
                                            byteArrayOutputStream.write((byte) ((a2[(i2 + 6) % a2.length] ^ bArr2[6]) ^ ((j5 >> 48) & 255)));
                                            byteArrayOutputStream.write((byte) ((a2[(i2 + 7) % a2.length] ^ bArr2[7]) ^ ((j5 >> 56) & 255)));
                                            i2 += 8;
                                            read2 = byteArrayInputStream.read(bArr2);
                                            read = j6;
                                            c5 = '\b';
                                            c3 = 0;
                                            c2 = ' ';
                                            c4 = 1;
                                        }
                                        return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                                    } catch (IOException unused) {
                                        return null;
                                    }
                                }
                                return null;
                            }
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                    throw new IllegalArgumentException("Salt is too short");
                }
                throw new IllegalArgumentException("No salt specified");
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("SHA-1 algorithm not found", e2);
        }
    }

    private static byte[] a(String str) {
        return Base64.decode(b(str), 0);
    }

    private static byte[] a(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 encoding not found", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("SHA-1 algorithm not found", e3);
        }
    }

    private static String b(String str) {
        return str.replace(CoreConstants.DASH_CHAR, '+').replace('_', '/').replace('*', '=');
    }

    private static String b(byte[] bArr) throws UnsupportedEncodingException {
        return c(Base64.encode(bArr, 2));
    }

    private static String c(byte[] bArr) throws UnsupportedEncodingException {
        return new String(bArr, "UTF-8").replace('+', CoreConstants.DASH_CHAR).replace('/', '_').replace('=', '*');
    }
}
