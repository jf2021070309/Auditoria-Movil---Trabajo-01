package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.qq.e.comm.adevent.AdEventType;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes2.dex */
public final class Code39Reader extends OneDReader {
    static final int[] a;
    static final int b;
    private final boolean c;
    private final boolean d;
    private final StringBuilder e;
    private final int[] f;

    static {
        int[] iArr = {52, 289, 97, 352, 49, AdEventType.COMPLAIN_SUCCESS, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, AdEventType.VIDEO_CLICKED, 133, 388, 196, 148, 168, 162, 138, 42};
        a = iArr;
        b = iArr[39];
    }

    public Code39Reader() {
        this(false);
    }

    public Code39Reader(boolean z) {
        this(z, false);
    }

    public Code39Reader(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.e = new StringBuilder(20);
        this.f = new int[9];
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) {
        int[] a2;
        String sb;
        int[] iArr = this.f;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.e;
        sb2.setLength(0);
        int nextSet = bitArray.getNextSet(a(bitArray, iArr)[1]);
        int size = bitArray.getSize();
        while (true) {
            recordPattern(bitArray, nextSet, iArr);
            int a3 = a(iArr);
            if (a3 < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char a4 = a(a3);
            sb2.append(a4);
            int i2 = nextSet;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int nextSet2 = bitArray.getNextSet(i2);
            if (a4 == '*') {
                sb2.setLength(sb2.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                int i6 = (nextSet2 - nextSet) - i4;
                if (nextSet2 != size && (i6 << 1) < i4) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.c) {
                    int length = sb2.length() - 1;
                    int i7 = 0;
                    for (int i8 = 0; i8 < length; i8++) {
                        i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.e.charAt(i8));
                    }
                    if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7 % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.d) {
                    sb = a(sb2);
                } else {
                    sb = sb2.toString();
                }
                return new Result(sb, null, new ResultPoint[]{new ResultPoint((a2[1] + a2[0]) / 2.0f, i), new ResultPoint(nextSet + (i4 / 2.0f), i)}, BarcodeFormat.CODE_39);
            }
            nextSet = nextSet2;
        }
    }

    private static int[] a(BitArray bitArray, int[] iArr) {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        for (int i2 = nextSet; i2 < size; i2++) {
            if (bitArray.get(i2) ^ z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (a(iArr) == b && bitArray.isRange(Math.max(0, nextSet - ((i2 - nextSet) / 2)), nextSet, false)) {
                        return new int[]{nextSet, i2};
                    }
                    nextSet += iArr[0] + iArr[1];
                    System.arraycopy(iArr, 2, iArr, 0, length - 2);
                    iArr[length - 2] = 0;
                    iArr[length - 1] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i4 |= 1 << ((length - 1) - i7);
                    i6++;
                    i5 += i8;
                }
            }
            if (i6 == 3) {
                int i9 = i6;
                for (int i10 = 0; i10 < length && i9 > 0; i10++) {
                    int i11 = iArr[i10];
                    if (i11 > i2) {
                        i9--;
                        if ((i11 << 1) >= i5) {
                            return -1;
                        }
                    }
                }
                return i4;
            } else if (i6 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    private static char a(int i) {
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i2);
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static String a(CharSequence charSequence) {
        char c;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                char charAt2 = charSequence.charAt(i2 + 1);
                switch (charAt) {
                    case '$':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            c = (char) (charAt2 - '@');
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case '%':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            c = (char) (charAt2 - '&');
                            break;
                        } else if (charAt2 >= 'F' && charAt2 <= 'W') {
                            c = (char) (charAt2 - 11);
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case '+':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            c = (char) (charAt2 + ' ');
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case '/':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            c = (char) (charAt2 - ' ');
                            break;
                        } else if (charAt2 == 'Z') {
                            c = ':';
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    default:
                        c = 0;
                        break;
                }
                sb.append(c);
                i = i2 + 1;
            } else {
                sb.append(charAt);
                i = i2;
            }
            i2 = i + 1;
        }
        return sb.toString();
    }
}
