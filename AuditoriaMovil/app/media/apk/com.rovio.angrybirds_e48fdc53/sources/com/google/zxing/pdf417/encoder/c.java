package com.google.zxing.pdf417.encoder;

import com.flurry.android.Constants;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.umeng.analytics.pro.cv;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
/* loaded from: classes2.dex */
final class c {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, cv.k, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, cv.k, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] c = new byte[128];
    private static final byte[] d = new byte[128];
    private static final Charset e = Charset.forName("ISO-8859-1");

    static {
        Arrays.fill(c, (byte) -1);
        for (int i = 0; i < a.length; i++) {
            byte b2 = a[i];
            if (b2 > 0) {
                c[b2] = (byte) i;
            }
        }
        Arrays.fill(d, (byte) -1);
        for (int i2 = 0; i2 < b.length; i2++) {
            byte b3 = b[i2];
            if (b3 > 0) {
                d[b3] = (byte) i2;
            }
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, Compaction compaction, Charset charset) {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = e;
        } else if (!e.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            a(characterSetECIByName.getValue(), sb);
        }
        int length = str.length();
        if (compaction == Compaction.TEXT) {
            a(str, 0, length, sb, 0);
        } else if (compaction == Compaction.BYTE) {
            byte[] bytes = str.getBytes(charset);
            a(bytes, 0, bytes.length, 1, sb);
        } else if (compaction == Compaction.NUMERIC) {
            sb.append((char) 902);
            a(str, 0, length, sb);
        } else {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                int a2 = a(str, i3);
                if (a2 >= 13) {
                    sb.append((char) 902);
                    i = 2;
                    a(str, i3, a2, sb);
                    i3 += a2;
                    i2 = 0;
                } else {
                    int b2 = b(str, i3);
                    if (b2 >= 5 || a2 == length) {
                        if (i != 0) {
                            sb.append((char) 900);
                            i = 0;
                            i2 = 0;
                        }
                        i2 = a(str, i3, b2, sb, i2);
                        i3 += b2;
                    } else {
                        int a3 = a(str, i3, charset);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        byte[] bytes2 = str.substring(i3, i3 + a3).getBytes(charset);
                        if (bytes2.length == 1 && i == 0) {
                            a(bytes2, 0, 1, 0, sb);
                        } else {
                            a(bytes2, 0, bytes2.length, i, sb);
                            i = 1;
                            i2 = 0;
                        }
                        i3 = a3 + i3;
                    }
                }
            }
        }
        return sb.toString();
    }

    private static int a(CharSequence charSequence, int i, int i2, StringBuilder sb, int i3) {
        char charAt;
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = 0;
        while (true) {
            char charAt2 = charSequence.charAt(i + i4);
            switch (i3) {
                case 0:
                    if (b(charAt2)) {
                        if (charAt2 == ' ') {
                            sb2.append((char) 26);
                            break;
                        } else {
                            sb2.append((char) (charAt2 - 'A'));
                            break;
                        }
                    } else if (c(charAt2)) {
                        sb2.append((char) 27);
                        i3 = 1;
                        continue;
                    } else if (d(charAt2)) {
                        i3 = 2;
                        sb2.append((char) 28);
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) d[charAt2]);
                        break;
                    }
                case 1:
                    if (c(charAt2)) {
                        if (charAt2 == ' ') {
                            sb2.append((char) 26);
                            break;
                        } else {
                            sb2.append((char) (charAt2 - 'a'));
                            break;
                        }
                    } else if (b(charAt2)) {
                        sb2.append((char) 27);
                        sb2.append((char) (charAt2 - 'A'));
                        break;
                    } else if (d(charAt2)) {
                        i3 = 2;
                        sb2.append((char) 28);
                        continue;
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) d[charAt2]);
                        break;
                    }
                case 2:
                    if (d(charAt2)) {
                        sb2.append((char) c[charAt2]);
                        break;
                    } else if (b(charAt2)) {
                        sb2.append((char) 28);
                        i3 = 0;
                        continue;
                    } else if (c(charAt2)) {
                        sb2.append((char) 27);
                        i3 = 1;
                    } else if (i + i4 + 1 < i2 && e(charSequence.charAt(i + i4 + 1))) {
                        i3 = 3;
                        sb2.append((char) 25);
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) d[charAt2]);
                        break;
                    }
                    break;
                default:
                    if (e(charAt2)) {
                        sb2.append((char) d[charAt2]);
                        break;
                    } else {
                        sb2.append((char) 29);
                        i3 = 0;
                        continue;
                    }
            }
            i4++;
            if (i4 >= i2) {
                int length = sb2.length();
                int i5 = 0;
                char c2 = 0;
                while (i5 < length) {
                    if (i5 % 2 != 0) {
                        charAt = (char) ((c2 * 30) + sb2.charAt(i5));
                        sb.append(charAt);
                    } else {
                        charAt = sb2.charAt(i5);
                    }
                    i5++;
                    c2 = charAt;
                }
                if (length % 2 != 0) {
                    sb.append((char) ((c2 * 30) + 29));
                }
                return i3;
            }
        }
    }

    private static void a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & Constants.UNKNOWN);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & Constants.UNKNOWN));
            i4++;
        }
    }

    private static void a(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            BigInteger bigInteger = new BigInteger("1" + str.substring(i + i3, i + i3 + min));
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    private static boolean a(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean b(char c2) {
        return c2 == ' ' || (c2 >= 'A' && c2 <= 'Z');
    }

    private static boolean c(char c2) {
        return c2 == ' ' || (c2 >= 'a' && c2 <= 'z');
    }

    private static boolean d(char c2) {
        return c[c2] != -1;
    }

    private static boolean e(char c2) {
        return d[c2] != -1;
    }

    private static boolean f(char c2) {
        return c2 == '\t' || c2 == '\n' || c2 == '\r' || (c2 >= ' ' && c2 <= '~');
    }

    private static int a(CharSequence charSequence, int i) {
        int i2 = 0;
        int length = charSequence.length();
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (a(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        return (r0 - r7) - r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(java.lang.CharSequence r6, int r7) {
        /*
            r5 = 13
            int r4 = r6.length()
            r0 = r7
        L7:
            if (r0 >= r4) goto L39
            char r2 = r6.charAt(r0)
            r1 = 0
        Le:
            if (r1 >= r5) goto L25
            boolean r3 = a(r2)
            if (r3 == 0) goto L25
            if (r0 >= r4) goto L25
            int r1 = r1 + 1
            int r3 = r0 + 1
            if (r3 >= r4) goto L3b
            char r0 = r6.charAt(r3)
            r2 = r0
            r0 = r3
            goto Le
        L25:
            if (r1 < r5) goto L2a
            int r0 = r0 - r7
            int r0 = r0 - r1
        L29:
            return r0
        L2a:
            if (r1 > 0) goto L7
            char r1 = r6.charAt(r0)
            boolean r1 = f(r1)
            if (r1 == 0) goto L39
            int r0 = r0 + 1
            goto L7
        L39:
            int r0 = r0 - r7
            goto L29
        L3b:
            r0 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.c.b(java.lang.CharSequence, int):int");
    }

    private static int a(String str, int i, Charset charset) {
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && a(charAt)) {
                i3++;
                int i4 = i2 + i3;
                if (i4 >= length) {
                    break;
                }
                charAt = str.charAt(i4);
            }
            if (i3 >= 13) {
                return i2 - i;
            }
            char charAt2 = str.charAt(i2);
            if (!newEncoder.canEncode(charAt2)) {
                throw new WriterException("Non-encodable character detected: " + charAt2 + " (Unicode: " + ((int) charAt2) + ')');
            }
            i2++;
        }
        return i2 - i;
    }

    private static void a(int i, StringBuilder sb) {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else if (i < 811800) {
            sb.append((char) 925);
            sb.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was " + i);
        }
    }
}
