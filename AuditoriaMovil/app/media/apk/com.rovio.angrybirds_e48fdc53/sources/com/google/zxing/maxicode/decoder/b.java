package com.google.zxing.maxicode.decoder;

import com.google.zxing.common.DecoderResult;
import com.umeng.analytics.pro.cv;
import java.text.DecimalFormat;
/* loaded from: classes2.dex */
final class b {
    private static final String[] a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DecoderResult a(byte[] bArr, int i) {
        String e;
        StringBuilder sb = new StringBuilder(144);
        switch (i) {
            case 2:
            case 3:
                if (i == 2) {
                    e = new DecimalFormat("0000000000".substring(0, c(bArr))).format(d(bArr));
                } else {
                    e = e(bArr);
                }
                DecimalFormat decimalFormat = new DecimalFormat("000");
                String format = decimalFormat.format(a(bArr));
                String format2 = decimalFormat.format(b(bArr));
                sb.append(a(bArr, 10, 84));
                if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                    sb.insert(9, e + (char) 29 + format + (char) 29 + format2 + (char) 29);
                    break;
                } else {
                    sb.insert(0, e + (char) 29 + format + (char) 29 + format2 + (char) 29);
                    break;
                }
            case 4:
                sb.append(a(bArr, 1, 93));
                break;
            case 5:
                sb.append(a(bArr, 1, 77));
                break;
        }
        return new DecoderResult(bArr, sb.toString(), null, String.valueOf(i));
    }

    private static int a(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    private static int a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            i += a(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
        }
        return i;
    }

    private static int a(byte[] bArr) {
        return a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    private static int b(byte[] bArr) {
        return a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }

    private static int c(byte[] bArr) {
        return a(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    private static int d(byte[] bArr) {
        return a(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, cv.k, cv.l, cv.m, cv.n, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    private static String e(byte[] bArr) {
        return String.valueOf(new char[]{a[0].charAt(a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), a[0].charAt(a(bArr, new byte[]{33, 34, 35, 36, 25, 26})), a[0].charAt(a(bArr, new byte[]{27, 28, 29, 30, 19, 20})), a[0].charAt(a(bArr, new byte[]{21, 22, 23, 24, cv.k, cv.l})), a[0].charAt(a(bArr, new byte[]{cv.m, cv.n, 17, 18, 7, 8})), a[0].charAt(a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    private static String a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        StringBuilder sb = new StringBuilder();
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        while (i9 < i + i2) {
            char charAt = a[i11].charAt(bArr[i9]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i12 = 1;
                    int i13 = i11;
                    i3 = i9;
                    i4 = charAt - 65520;
                    i10 = i13;
                    break;
                case 65525:
                    i12 = 2;
                    i10 = i11;
                    i3 = i9;
                    i4 = 0;
                    break;
                case 65526:
                    i12 = 3;
                    i10 = i11;
                    i3 = i9;
                    i4 = 0;
                    break;
                case 65527:
                    i3 = i9;
                    i12 = -1;
                    i4 = 0;
                    break;
                case 65528:
                    i3 = i9;
                    i12 = -1;
                    i4 = 1;
                    break;
                case 65529:
                    i12 = -1;
                    int i14 = i11;
                    i3 = i9;
                    i4 = i14;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    int i15 = i9;
                    i4 = i11;
                    i3 = i15;
                    break;
                case 65531:
                    int i16 = i9 + 1 + 1 + 1 + 1 + 1;
                    sb.append(new DecimalFormat("000000000").format((bArr[i5] << 24) + (bArr[i6] << 18) + (bArr[i7] << 12) + (bArr[i8] << 6) + bArr[i16]));
                    i4 = i11;
                    i3 = i16;
                    break;
            }
            int i17 = i12 - 1;
            if (i12 == 0) {
                i4 = i10;
            }
            i12 = i17;
            int i18 = i4;
            i9 = i3 + 1;
            i11 = i18;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
