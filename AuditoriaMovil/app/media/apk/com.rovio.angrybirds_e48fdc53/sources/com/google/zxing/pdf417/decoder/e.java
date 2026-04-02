package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes2.dex */
final class e {
    private static final char[] a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final Charset c = Charset.forName("ISO-8859-1");
    private static final BigInteger[] d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum a {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        d[1] = valueOf;
        for (int i = 2; i < d.length; i++) {
            d[i] = d[i - 1].multiply(valueOf);
        }
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DecoderResult a(int[] iArr, String str) {
        int a2;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = c;
        int i = 2;
        int i2 = iArr[1];
        PDF417ResultMetadata pDF417ResultMetadata = new PDF417ResultMetadata();
        while (i < iArr[0]) {
            switch (i2) {
                case 900:
                    a2 = a(iArr, i, sb);
                    break;
                case 901:
                case 924:
                    a2 = a(i2, iArr, charset, i, sb);
                    break;
                case 902:
                    a2 = b(iArr, i, sb);
                    break;
                case 913:
                    a2 = i + 1;
                    sb.append((char) iArr[i]);
                    break;
                case 922:
                case 923:
                    throw FormatException.getFormatInstance();
                case 925:
                    a2 = i + 1;
                    break;
                case 926:
                    a2 = i + 2;
                    break;
                case 927:
                    a2 = i + 1;
                    charset = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i]).name());
                    break;
                case PDF417Common.MAX_CODEWORDS_IN_BARCODE /* 928 */:
                    a2 = a(iArr, i, pDF417ResultMetadata);
                    break;
                default:
                    a2 = a(iArr, i - 1, sb);
                    break;
            }
            if (a2 < iArr.length) {
                i = a2 + 1;
                i2 = iArr[a2];
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, sb.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    private static int a(int[] iArr, int i, PDF417ResultMetadata pDF417ResultMetadata) {
        if (i + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i2 = 0;
        while (i2 < 2) {
            iArr2[i2] = iArr[i];
            i2++;
            i++;
        }
        pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(a(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int a2 = a(iArr, i, sb);
        pDF417ResultMetadata.setFileId(sb.toString());
        if (iArr[a2] == 923) {
            int i3 = a2 + 1;
            int[] iArr3 = new int[iArr[0] - i3];
            int i4 = 0;
            int i5 = i3;
            boolean z = false;
            while (i5 < iArr[0] && !z) {
                int i6 = i5 + 1;
                int i7 = iArr[i5];
                if (i7 < 900) {
                    iArr3[i4] = i7;
                    i4++;
                    i5 = i6;
                } else {
                    switch (i7) {
                        case 922:
                            pDF417ResultMetadata.setLastSegment(true);
                            i5 = i6 + 1;
                            z = true;
                            break;
                        default:
                            throw FormatException.getFormatInstance();
                    }
                }
            }
            pDF417ResultMetadata.setOptionalData(Arrays.copyOf(iArr3, i4));
            return i5;
        } else if (iArr[a2] == 922) {
            pDF417ResultMetadata.setLastSegment(true);
            return a2 + 1;
        } else {
            return a2;
        }
    }

    private static int a(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[(iArr[0] - i) << 1];
        int[] iArr3 = new int[(iArr[0] - i) << 1];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
                i = i3;
            } else {
                switch (i4) {
                    case 900:
                        iArr2[i2] = 900;
                        i2++;
                        i = i3;
                        continue;
                    case 901:
                    case 902:
                    case 922:
                    case 923:
                    case 924:
                    case PDF417Common.MAX_CODEWORDS_IN_BARCODE /* 928 */:
                        i = i3 - 1;
                        z = true;
                        continue;
                    case 913:
                        iArr2[i2] = 913;
                        i = i3 + 1;
                        iArr3[i2] = iArr[i3];
                        i2++;
                        continue;
                    default:
                        i = i3;
                        continue;
                }
            }
        }
        a(iArr2, iArr3, i2, sb);
        return i;
    }

    private static void a(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        a aVar = a.ALPHA;
        a aVar2 = a.ALPHA;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            char c2 = 0;
            switch (aVar) {
                case ALPHA:
                    if (i3 < 26) {
                        c2 = (char) (i3 + 65);
                        break;
                    } else if (i3 == 26) {
                        c2 = ' ';
                        break;
                    } else if (i3 == 27) {
                        aVar = a.LOWER;
                        break;
                    } else if (i3 == 28) {
                        aVar = a.MIXED;
                        break;
                    } else if (i3 == 29) {
                        a aVar3 = aVar;
                        aVar = a.PUNCT_SHIFT;
                        aVar2 = aVar3;
                        break;
                    } else if (i3 == 913) {
                        sb.append((char) iArr2[i2]);
                        break;
                    } else if (i3 == 900) {
                        aVar = a.ALPHA;
                        break;
                    }
                    break;
                case LOWER:
                    if (i3 < 26) {
                        c2 = (char) (i3 + 97);
                        break;
                    } else if (i3 == 26) {
                        c2 = ' ';
                        break;
                    } else if (i3 == 27) {
                        a aVar4 = aVar;
                        aVar = a.ALPHA_SHIFT;
                        aVar2 = aVar4;
                        break;
                    } else if (i3 == 28) {
                        aVar = a.MIXED;
                        break;
                    } else if (i3 == 29) {
                        a aVar5 = aVar;
                        aVar = a.PUNCT_SHIFT;
                        aVar2 = aVar5;
                        break;
                    } else if (i3 == 913) {
                        sb.append((char) iArr2[i2]);
                        break;
                    } else if (i3 == 900) {
                        aVar = a.ALPHA;
                        break;
                    }
                    break;
                case MIXED:
                    if (i3 < 25) {
                        c2 = b[i3];
                        break;
                    } else if (i3 == 25) {
                        aVar = a.PUNCT;
                        break;
                    } else if (i3 == 26) {
                        c2 = ' ';
                        break;
                    } else if (i3 == 27) {
                        aVar = a.LOWER;
                        break;
                    } else if (i3 == 28) {
                        aVar = a.ALPHA;
                        break;
                    } else if (i3 == 29) {
                        a aVar6 = aVar;
                        aVar = a.PUNCT_SHIFT;
                        aVar2 = aVar6;
                        break;
                    } else if (i3 == 913) {
                        sb.append((char) iArr2[i2]);
                        break;
                    } else if (i3 == 900) {
                        aVar = a.ALPHA;
                        break;
                    }
                    break;
                case PUNCT:
                    if (i3 < 29) {
                        c2 = a[i3];
                        break;
                    } else if (i3 == 29) {
                        aVar = a.ALPHA;
                        break;
                    } else if (i3 == 913) {
                        sb.append((char) iArr2[i2]);
                        break;
                    } else if (i3 == 900) {
                        aVar = a.ALPHA;
                        break;
                    }
                    break;
                case ALPHA_SHIFT:
                    if (i3 < 26) {
                        c2 = (char) (i3 + 65);
                        aVar = aVar2;
                        break;
                    } else if (i3 == 26) {
                        c2 = ' ';
                        aVar = aVar2;
                        break;
                    } else {
                        if (i3 == 900) {
                            aVar = a.ALPHA;
                            break;
                        }
                        aVar = aVar2;
                        break;
                    }
                case PUNCT_SHIFT:
                    if (i3 < 29) {
                        c2 = a[i3];
                        aVar = aVar2;
                        break;
                    } else if (i3 == 29) {
                        aVar = a.ALPHA;
                        break;
                    } else if (i3 == 913) {
                        sb.append((char) iArr2[i2]);
                        aVar = aVar2;
                        break;
                    } else {
                        if (i3 == 900) {
                            aVar = a.ALPHA;
                            break;
                        }
                        aVar = aVar2;
                        break;
                    }
            }
            if (c2 != 0) {
                sb.append(c2);
            }
        }
    }

    private static int a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i == 901) {
            int i3 = 0;
            long j = 0;
            int[] iArr2 = new int[6];
            boolean z = false;
            int i4 = iArr[i2];
            int i5 = i2 + 1;
            while (i5 < iArr[0] && !z) {
                int i6 = i3 + 1;
                iArr2[i3] = i4;
                j = (j * 900) + i4;
                int i7 = i5 + 1;
                i4 = iArr[i5];
                if (i4 == 900 || i4 == 901 || i4 == 902 || i4 == 924 || i4 == 928 || i4 == 923 || i4 == 922) {
                    z = true;
                    i5 = i7 - 1;
                    i3 = i6;
                } else if (i6 % 5 != 0 || i6 <= 0) {
                    i3 = i6;
                    i5 = i7;
                } else {
                    for (int i8 = 0; i8 < 6; i8++) {
                        byteArrayOutputStream.write((byte) (j >> ((5 - i8) * 8)));
                    }
                    j = 0;
                    i3 = 0;
                    i5 = i7;
                }
            }
            if (i5 == iArr[0] && i4 < 900) {
                iArr2[i3] = i4;
                i3++;
            }
            for (int i9 = 0; i9 < i3; i9++) {
                byteArrayOutputStream.write((byte) iArr2[i9]);
            }
            i2 = i5;
        } else if (i == 924) {
            int i10 = 0;
            long j2 = 0;
            boolean z2 = false;
            while (i2 < iArr[0] && !z2) {
                int i11 = i2 + 1;
                int i12 = iArr[i2];
                if (i12 < 900) {
                    i10++;
                    j2 = (j2 * 900) + i12;
                    i2 = i11;
                } else if (i12 == 900 || i12 == 901 || i12 == 902 || i12 == 924 || i12 == 928 || i12 == 923 || i12 == 922) {
                    i2 = i11 - 1;
                    z2 = true;
                } else {
                    i2 = i11;
                }
                if (i10 % 5 == 0 && i10 > 0) {
                    for (int i13 = 0; i13 < 6; i13++) {
                        byteArrayOutputStream.write((byte) (j2 >> ((5 - i13) * 8)));
                    }
                    j2 = 0;
                    i10 = 0;
                }
            }
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        r11.append(a(r5, r2));
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(int[] r9, int r10, java.lang.StringBuilder r11) {
        /*
            r8 = 900(0x384, float:1.261E-42)
            r3 = 1
            r1 = 0
            r0 = 15
            int[] r5 = new int[r0]
            r0 = r1
            r2 = r1
        La:
            r4 = r9[r1]
            if (r10 >= r4) goto L4f
            if (r0 != 0) goto L4f
            int r4 = r10 + 1
            r6 = r9[r10]
            r7 = r9[r1]
            if (r4 != r7) goto L19
            r0 = r3
        L19:
            if (r6 >= r8) goto L35
            r5[r2] = r6
            int r2 = r2 + 1
            r10 = r4
        L20:
            int r4 = r2 % 15
            if (r4 == 0) goto L2a
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L2a
            if (r0 == 0) goto La
        L2a:
            if (r2 <= 0) goto La
            java.lang.String r2 = a(r5, r2)
            r11.append(r2)
            r2 = r1
            goto La
        L35:
            if (r6 == r8) goto L4b
            r7 = 901(0x385, float:1.263E-42)
            if (r6 == r7) goto L4b
            r7 = 924(0x39c, float:1.295E-42)
            if (r6 == r7) goto L4b
            r7 = 928(0x3a0, float:1.3E-42)
            if (r6 == r7) goto L4b
            r7 = 923(0x39b, float:1.293E-42)
            if (r6 == r7) goto L4b
            r7 = 922(0x39a, float:1.292E-42)
            if (r6 != r7) goto L50
        L4b:
            int r10 = r4 + (-1)
            r0 = r3
            goto L20
        L4f:
            return r10
        L50:
            r10 = r4
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.e.b(int[], int, java.lang.StringBuilder):int");
    }

    private static String a(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(d[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) != '1') {
            throw FormatException.getFormatInstance();
        }
        return bigInteger2.substring(1);
    }
}
