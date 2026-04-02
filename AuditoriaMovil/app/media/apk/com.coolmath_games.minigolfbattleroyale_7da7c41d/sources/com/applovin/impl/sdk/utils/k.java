package com.applovin.impl.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.internal.security.CertificateUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public class k {
    public static String a(String str, String str2) {
        return a(str, str2, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    public static String a(String str, String str2, long j) {
        return a(str, str2, j, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    private static String a(String str, String str2, long j, byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (bArr != null) {
                    char c = ' ';
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
                            byteArrayOutputStream.write(((byte) ((j >> 0) & 255)) ^ a[0]);
                            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ a[1]);
                            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ a[2]);
                            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ a[3]);
                            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ a[4]);
                            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ a[5]);
                            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ a[6]);
                            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ a[7]);
                            int i9 = 0;
                            while (i9 < bytes.length) {
                                long j2 = j + i9;
                                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                                long j5 = j4 ^ (j4 >> c);
                                byteArrayOutputStream.write((byte) (((i9 + 0 >= bytes.length ? (byte) 0 : bytes[i]) ^ a[i % a.length]) ^ ((j5 >> 0) & 255)));
                                byteArrayOutputStream.write((byte) ((a[i2 % a.length] ^ (i9 + 1 >= bytes.length ? (byte) 0 : bytes[i2])) ^ ((j5 >> 8) & 255)));
                                byteArrayOutputStream.write((byte) ((a[i3 % a.length] ^ (i9 + 2 >= bytes.length ? (byte) 0 : bytes[i3])) ^ ((j5 >> 16) & 255)));
                                byteArrayOutputStream.write((byte) ((a[i4 % a.length] ^ (i9 + 3 >= bytes.length ? (byte) 0 : bytes[i4])) ^ ((j5 >> 24) & 255)));
                                byteArrayOutputStream.write((byte) ((a[i5 % a.length] ^ (i9 + 4 >= bytes.length ? (byte) 0 : bytes[i5])) ^ ((j5 >> 32) & 255)));
                                byteArrayOutputStream.write((byte) ((a[i6 % a.length] ^ (i9 + 5 >= bytes.length ? (byte) 0 : bytes[i6])) ^ ((j5 >> 40) & 255)));
                                byteArrayOutputStream.write((byte) ((a[i7 % a.length] ^ (i9 + 6 >= bytes.length ? (byte) 0 : bytes[i7])) ^ ((j5 >> 48) & 255)));
                                byteArrayOutputStream.write((byte) ((a[i8 % a.length] ^ (i9 + 7 >= bytes.length ? (byte) 0 : bytes[i8])) ^ ((j5 >> 56) & 255)));
                                i9 += 8;
                                c = ' ';
                            }
                            String b = b(byteArrayOutputStream.toByteArray());
                            return "1:" + a(bArr) + CertificateUtil.DELIMITER + substring + CertificateUtil.DELIMITER + b;
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
                    char c = ' ';
                    if (bArr.length >= 32) {
                        if (TextUtils.isEmpty(str) || str.trim().startsWith("{")) {
                            return str;
                        }
                        String[] split = str.split(CertificateUtil.DELIMITER);
                        char c2 = 0;
                        try {
                            if ("1".equals(split[0]) && split.length == 4) {
                                char c3 = 1;
                                String str3 = split[1];
                                String str4 = split[2];
                                byte[] a = a(split[3]);
                                if (str2.endsWith(str4) && a(bArr).equals(str3)) {
                                    byte[] a2 = a(str2.substring(0, 32), bArr);
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a);
                                    char c4 = '\b';
                                    try {
                                        long read = (((byteArrayInputStream.read() ^ a2[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ a2[0]) & 255) << 0) | (((byteArrayInputStream.read() ^ a2[1]) & 255) << 8) | (((byteArrayInputStream.read() ^ a2[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ a2[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ a2[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ a2[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ a2[7]) & 255) << 56);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        byte[] bArr2 = new byte[8];
                                        int read2 = byteArrayInputStream.read(bArr2);
                                        int i = 0;
                                        while (read2 >= 0) {
                                            long j = i + read;
                                            long j2 = (j ^ (j >> 33)) * (-4417276706812531889L);
                                            long j3 = (j2 ^ (j2 >> 29)) * (-8796714831421723037L);
                                            long j4 = j3 ^ (j3 >> c);
                                            byteArrayOutputStream.write((byte) ((bArr2[c2] ^ a2[(i + 0) % a2.length]) ^ ((j4 >> c2) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[c3] ^ a2[(i + 1) % a2.length]) ^ ((j4 >> c4) & 255)));
                                            byteArrayOutputStream.write((byte) ((a2[(i + 2) % a2.length] ^ bArr2[2]) ^ ((j4 >> 16) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[3] ^ a2[(i + 3) % a2.length]) ^ ((j4 >> 24) & 255)));
                                            byteArrayOutputStream.write((byte) ((a2[(i + 4) % a2.length] ^ bArr2[4]) ^ ((j4 >> c) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[5] ^ a2[(i + 5) % a2.length]) ^ ((j4 >> 40) & 255)));
                                            byteArrayOutputStream.write((byte) ((a2[(i + 6) % a2.length] ^ bArr2[6]) ^ ((j4 >> 48) & 255)));
                                            byteArrayOutputStream.write((byte) ((a2[(i + 7) % a2.length] ^ bArr2[7]) ^ ((j4 >> 56) & 255)));
                                            i += 8;
                                            read2 = byteArrayInputStream.read(bArr2);
                                            read = read;
                                            c4 = '\b';
                                            c2 = 0;
                                            c = ' ';
                                            c3 = 1;
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
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-1 algorithm not found", e);
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
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("SHA-1 algorithm not found", e2);
        }
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String b(byte[] bArr) throws UnsupportedEncodingException {
        return c(Base64.encode(bArr, 2));
    }

    private static String c(byte[] bArr) throws UnsupportedEncodingException {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
