package com.ss.android.dr;

import com.flurry.android.Constants;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
/* loaded from: classes3.dex */
public class o {
    private static final char[] dr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String dr(File file) {
        return dr(file, 9, 8192L);
    }

    public static String dr(File file, int i, long j) {
        if (file != null) {
            try {
                if (file.exists()) {
                    return ge(file, i, j);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public static int dr(String str, File file) {
        return dr(str, file, (ge) null);
    }

    public static int dr(String str, File file, ge geVar) {
        String ge;
        if (str == null || str.length() == 0) {
            return 2;
        }
        try {
            if (geVar != null) {
                if (geVar.dr() <= 0) {
                    try {
                        geVar.ge();
                    } catch (Throwable th) {
                    }
                    return 5;
                }
            } else if (file == null || !file.exists()) {
                return 5;
            }
            int i = -1;
            long j = -1;
            try {
                dr dr2 = dr(str);
                if (dr2 != null) {
                    if (dr2.dr > 1) {
                        return 3;
                    }
                    i = dr2.o;
                    j = dr2.g;
                }
                dr drVar = null;
                if (geVar != null) {
                    ge = dr(geVar, i, j);
                } else {
                    ge = ge(file, i, j);
                }
                if (ge != null && ge.length() != 0) {
                    if (dr2 != null && (dr2.dr != 1 || dr2.ge != 1)) {
                        if (dr2.q != null) {
                            try {
                                drVar = dr(ge);
                            } catch (Throwable th2) {
                            }
                            if (drVar != null && dr2.o == drVar.o && dr2.g == drVar.g && dr2.q.equals(drVar.q)) {
                                return 0;
                            }
                        }
                        return 1;
                    }
                    if (!ge.equals(str)) {
                        return 1;
                    }
                    return 0;
                }
                return 6;
            } catch (Throwable th3) {
                return 4;
            }
        } catch (Throwable th4) {
            return 99;
        }
    }

    private static String ge(File file, int i, long j) throws Exception {
        return dr(new com.ss.android.dr.dr(file), i, j);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|6|(6:13|14|(3:16|(1:18)|19)|(1:21)|22|(4:31|33|34|35)(3:26|27|28))|38|14|(0)|(0)|22|(1:24)|31|33|34|35) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[Catch: all -> 0x00a0, TryCatch #1 {all -> 0x00a0, blocks: (B:6:0x000d, B:10:0x001a, B:15:0x002e, B:17:0x0040, B:19:0x004c, B:21:0x0063, B:22:0x006d, B:30:0x0082), top: B:43:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: all -> 0x00a0, TryCatch #1 {all -> 0x00a0, blocks: (B:6:0x000d, B:10:0x001a, B:15:0x002e, B:17:0x0040, B:19:0x004c, B:21:0x0063, B:22:0x006d, B:30:0x0082), top: B:43:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String dr(com.ss.android.dr.ge r21, int r22, long r23) throws java.lang.Exception {
        /*
            r0 = r22
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
            if (r1 != 0) goto Ld
            java.lang.String r0 = ""
            return r0
        Ld:
            long r9 = r21.dr()     // Catch: java.lang.Throwable -> La0
            r11 = 1
            if (r0 <= 0) goto L2b
            r2 = 0
            int r2 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2b
            long r2 = (long) r0     // Catch: java.lang.Throwable -> La0
            long r2 = r2 * r23
            r4 = 8
            long r4 = r4 * r9
            r6 = 10
            long r4 = r4 / r6
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L28
            goto L2b
        L28:
            r12 = r23
            goto L2e
        L2b:
            r12 = r9
            r0 = r11
        L2e:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r14 = new byte[r2]     // Catch: java.lang.Throwable -> La0
            r15 = 0
            r2 = r21
            r3 = r1
            r4 = r14
            r5 = r15
            r7 = r12
            dr(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> La0
            r2 = 2
            if (r0 <= r2) goto L61
            long r2 = (long) r0     // Catch: java.lang.Throwable -> La0
            long r2 = r2 * r12
            long r2 = r9 - r2
            int r7 = r0 + (-1)
            long r4 = (long) r7     // Catch: java.lang.Throwable -> La0
            long r17 = r2 / r4
            r8 = r11
        L4a:
            if (r8 >= r7) goto L61
            long r2 = r12 + r17
            long r15 = r15 + r2
            r2 = r21
            r3 = r1
            r4 = r14
            r5 = r15
            r19 = r7
            r20 = r8
            r7 = r12
            dr(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> La0
            int r8 = r20 + 1
            r7 = r19
            goto L4a
        L61:
            if (r0 <= r11) goto L6d
            long r5 = r9 - r12
            r2 = r21
            r3 = r1
            r4 = r14
            r7 = r12
            dr(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> La0
        L6d:
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = dr(r1)     // Catch: java.lang.Throwable -> La0
            if (r0 != r11) goto L82
            int r2 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r2 != 0) goto L82
        L7c:
            r21.ge()     // Catch: java.lang.Throwable -> L80
            goto L81
        L80:
            r0 = move-exception
        L81:
            return r1
        L82:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r2.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = dr(r0, r12)     // Catch: java.lang.Throwable -> La0
            r2.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = ";"
            r2.append(r0)     // Catch: java.lang.Throwable -> La0
            r2.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> La0
            r21.ge()     // Catch: java.lang.Throwable -> L9e
            goto L9f
        L9e:
            r0 = move-exception
        L9f:
            return r1
        La0:
            r0 = move-exception
            r1 = r0
            r21.ge()     // Catch: java.lang.Throwable -> La6
            goto La7
        La6:
            r0 = move-exception
        La7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.dr.o.dr(com.ss.android.dr.ge, int, long):java.lang.String");
    }

    private static void dr(ge geVar, MessageDigest messageDigest, byte[] bArr, long j, long j2) throws IOException {
        geVar.dr(j, j2);
        long j3 = 0;
        while (j3 < j2) {
            int dr2 = geVar.dr(bArr, 0, (int) Math.min(j2 - j3, bArr.length));
            if (dr2 <= 0) {
                throw new IOException("updateSample unexpected readCount <= 0, readCount = " + dr2 + ", readTotalCount = " + j3 + ", sampleSize = " + j2);
            }
            messageDigest.update(bArr, 0, dr2);
            j3 += dr2;
        }
    }

    private static String dr(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        int length = bArr.length;
        int i = length * 2;
        char[] cArr = new char[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = bArr[i3 + 0] & Constants.UNKNOWN;
            int i5 = i2 + 1;
            char[] cArr2 = dr;
            cArr[i2] = cArr2[i4 >> 4];
            i2 = i5 + 1;
            cArr[i5] = cArr2[i4 & 15];
        }
        return new String(cArr, 0, i);
    }

    private static String dr(int i, long j) {
        return "ttmd5:1:1:" + dr(i) + "g" + dr(j);
    }

    private static dr dr(String str) throws Exception {
        if (str.startsWith("ttmd5:")) {
            String[] split = str.split(";");
            String[] split2 = split[0].split(":");
            dr drVar = new dr();
            drVar.dr = Integer.parseInt(split2[1]);
            if (drVar.dr > 1) {
                return drVar;
            }
            drVar.ge = Integer.parseInt(split2[2]);
            String[] split3 = split2[3].split("g");
            drVar.o = (int) ge(split3[0]);
            drVar.g = ge(split3[1]);
            drVar.q = split[1];
            return drVar;
        }
        return null;
    }

    private static String dr(long j) {
        return Long.toHexString((j << 4) + 31);
    }

    private static long ge(String str) throws RuntimeException {
        try {
            return (Long.parseLong(str, 16) - 31) >> 4;
        } catch (Throwable th) {
            throw new RuntimeException("ttmd5 decryptNum error, num = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr {
        private int dr;
        private long g;
        private int ge;
        private int o;
        private String q;

        private dr() {
        }
    }
}
