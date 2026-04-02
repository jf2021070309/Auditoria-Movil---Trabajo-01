package com.google.zxing.oned;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes2.dex */
public final class Code93Reader extends OneDReader {
    static final int[] a;
    private static final char[] b = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final int c;
    private final StringBuilder d = new StringBuilder(20);
    private final int[] e = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, TTAdConstant.DEEPLINK_FALL_BACK_CODE, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, TTAdConstant.IMAGE_LIST_SIZE_CODE, 364, 358, 310, 314, 302, 468, 466, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 366, 374, 430, 294, 474, 470, 306, 350};
        a = iArr;
        c = iArr[47];
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) {
        int[] a2;
        int nextSet = bitArray.getNextSet(a(bitArray)[1]);
        int size = bitArray.getSize();
        int[] iArr = this.e;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.d;
        sb.setLength(0);
        while (true) {
            recordPattern(bitArray, nextSet, iArr);
            int a3 = a(iArr);
            if (a3 < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char a4 = a(a3);
            sb.append(a4);
            int i2 = nextSet;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int nextSet2 = bitArray.getNextSet(i2);
            if (a4 == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                if (nextSet2 == size || !bitArray.get(nextSet2)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                b(sb);
                sb.setLength(sb.length() - 2);
                return new Result(a(sb), null, new ResultPoint[]{new ResultPoint((a2[1] + a2[0]) / 2.0f, i), new ResultPoint(nextSet + (i4 / 2.0f), i)}, BarcodeFormat.CODE_93);
            }
            nextSet = nextSet2;
        }
    }

    private int[] a(BitArray bitArray) {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        Arrays.fill(this.e, 0);
        int[] iArr = this.e;
        int length = iArr.length;
        boolean z = false;
        int i = nextSet;
        int i2 = 0;
        for (int i3 = nextSet; i3 < size; i3++) {
            if (bitArray.get(i3) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 == length - 1) {
                    if (a(iArr) == c) {
                        return new int[]{i, i3};
                    }
                    i += iArr[0] + iArr[1];
                    System.arraycopy(iArr, 2, iArr, 0, length - 2);
                    iArr[length - 2] = 0;
                    iArr[length - 1] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr[i2] = 1;
                z = !z;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i++;
            i2 = iArr[i] + i2;
        }
        int length2 = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length2; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i2);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                int i5 = 0;
                while (i5 < round) {
                    i5++;
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    private static char a(int i) {
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2] == i) {
                return b[i2];
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static String a(CharSequence charSequence) {
        int i;
        char c2;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i2 >= length - 1) {
                    throw FormatException.getFormatInstance();
                }
                char charAt2 = charSequence.charAt(i2 + 1);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            c2 = (char) (charAt2 - '@');
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            c2 = (char) (charAt2 - '&');
                            break;
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            c2 = (char) (charAt2 - 11);
                            break;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            c2 = (char) (charAt2 + 16);
                            break;
                        } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                            c2 = (char) (charAt2 + '+');
                            break;
                        } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                            c2 = 127;
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            c2 = (char) (charAt2 - ' ');
                            break;
                        } else if (charAt2 == 'Z') {
                            c2 = ':';
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            c2 = (char) (charAt2 + ' ');
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    default:
                        c2 = 0;
                        break;
                }
                sb.append(c2);
                i = i2 + 1;
            } else {
                sb.append(charAt);
                i = i2;
            }
            i2 = i + 1;
        }
        return sb.toString();
    }

    private static void b(CharSequence charSequence) {
        int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }

    private static void a(CharSequence charSequence, int i, int i2) {
        int i3 = 1;
        int i4 = i - 1;
        int i5 = 0;
        while (i4 >= 0) {
            int indexOf = ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3) + i5;
            int i6 = i3 + 1;
            if (i6 > i2) {
                i6 = 1;
            }
            i4--;
            i3 = i6;
            i5 = indexOf;
        }
        if (charSequence.charAt(i) != b[i5 % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }
}
