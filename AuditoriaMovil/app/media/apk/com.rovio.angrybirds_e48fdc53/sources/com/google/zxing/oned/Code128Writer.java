package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes2.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat != BarcodeFormat.CODE_128) {
            throw new IllegalArgumentException("Can only encode CODE_128, but got " + barcodeFormat);
        }
        return super.encode(str, barcodeFormat, i, i2, map);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int i;
        int i2 = 0;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
        }
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        throw new IllegalArgumentException("Bad character in input: " + charAt);
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i4 < length) {
            int a2 = a(str, i4, i5);
            if (a2 == i5) {
                switch (str.charAt(i4)) {
                    case 241:
                        i = 102;
                        break;
                    case 242:
                        i = 97;
                        break;
                    case 243:
                        i = 96;
                        break;
                    case 244:
                        i = 100;
                        break;
                    default:
                        if (i5 != 100) {
                            i = Integer.parseInt(str.substring(i4, i4 + 2));
                            i4++;
                            break;
                        } else {
                            i = str.charAt(i4) - ' ';
                            break;
                        }
                }
                i4++;
                a2 = i5;
            } else if (i5 != 0) {
                i = a2;
            } else if (a2 == 100) {
                i = 104;
            } else {
                i = 105;
            }
            arrayList.add(Code128Reader.a[i]);
            int i8 = i7 + (i * i6);
            i6 = i4 != 0 ? i6 + 1 : i6;
            i7 = i8;
            i5 = a2;
        }
        arrayList.add(Code128Reader.a[i7 % 103]);
        arrayList.add(Code128Reader.a[106]);
        int i9 = 0;
        for (int[] iArr : arrayList) {
            int length2 = iArr.length;
            int i10 = 0;
            while (i10 < length2) {
                int i11 = iArr[i10] + i9;
                i10++;
                i9 = i11;
            }
        }
        boolean[] zArr = new boolean[i9];
        for (int[] iArr2 : arrayList) {
            i2 += appendPattern(zArr, i2, iArr2, true);
        }
        return zArr;
    }

    private static a a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        if (i + 1 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i + 1);
        if (charAt2 < '0' || charAt2 > '9') {
            return a.ONE_DIGIT;
        }
        return a.TWO_DIGITS;
    }

    private static int a(CharSequence charSequence, int i, int i2) {
        a a2;
        a a3;
        a a4 = a(charSequence, i);
        if (a4 == a.UNCODABLE || a4 == a.ONE_DIGIT) {
            return 100;
        }
        if (i2 != 99) {
            if (i2 == 100) {
                if (a4 != a.FNC_1 && (a2 = a(charSequence, i + 2)) != a.UNCODABLE && a2 != a.ONE_DIGIT) {
                    if (a2 == a.FNC_1) {
                        return a(charSequence, i + 3) == a.TWO_DIGITS ? 99 : 100;
                    }
                    int i3 = i + 4;
                    while (true) {
                        a3 = a(charSequence, i3);
                        if (a3 != a.TWO_DIGITS) {
                            break;
                        }
                        i3 += 2;
                    }
                    return a3 == a.ONE_DIGIT ? 100 : 99;
                }
                return i2;
            }
            if (a4 == a.FNC_1) {
                a4 = a(charSequence, i + 1);
            }
            return a4 == a.TWO_DIGITS ? 99 : 100;
        }
        return i2;
    }
}
