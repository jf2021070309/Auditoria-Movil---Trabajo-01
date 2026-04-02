package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class UPCEANReader extends OneDReader {
    static final int[] b = {1, 1, 1};
    static final int[] c = {1, 1, 1, 1, 1};
    static final int[] d = {1, 1, 1, 1, 1, 1};
    static final int[][] e = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
    static final int[][] f = new int[20];
    private final StringBuilder a = new StringBuilder(20);
    private final d g = new d();
    private final a h = new a();

    abstract BarcodeFormat a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb);

    static {
        int i = 10;
        System.arraycopy(e, 0, f, 0, 10);
        while (true) {
            int i2 = i;
            if (i2 < 20) {
                int[] iArr = e[i2 - 10];
                int[] iArr2 = new int[iArr.length];
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    iArr2[i3] = iArr[(iArr.length - i3) - 1];
                }
                f[i2] = iArr2;
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] a(BitArray bitArray) {
        int[] iArr = new int[b.length];
        int i = 0;
        int[] iArr2 = null;
        boolean z = false;
        while (!z) {
            Arrays.fill(iArr, 0, b.length, 0);
            iArr2 = a(bitArray, i, false, b, iArr);
            int i2 = iArr2[0];
            i = iArr2[1];
            int i3 = i2 - (i - i2);
            if (i3 >= 0) {
                z = bitArray.isRange(i3, i2, false);
            }
        }
        return iArr2;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) {
        return decodeRow(i, bitArray, a(bitArray), map);
    }

    public Result decodeRow(int i, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) {
        int i2;
        String a;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        int decodeMiddle = decodeMiddle(bitArray, iArr, sb);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(decodeMiddle, i));
        }
        int[] decodeEnd = decodeEnd(bitArray, decodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((decodeEnd[0] + decodeEnd[1]) / 2.0f, i));
        }
        int i3 = decodeEnd[1];
        int i4 = (i3 - decodeEnd[0]) + i3;
        if (i4 >= bitArray.getSize() || !bitArray.isRange(i3, i4, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!checkChecksum(sb2)) {
            throw ChecksumException.getChecksumInstance();
        }
        BarcodeFormat a2 = a();
        Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[1] + iArr[0]) / 2.0f, i), new ResultPoint((decodeEnd[1] + decodeEnd[0]) / 2.0f, i)}, a2);
        try {
            Result a3 = this.g.a(i, bitArray, decodeEnd[1]);
            result.putMetadata(ResultMetadataType.UPC_EAN_EXTENSION, a3.getText());
            result.putAllMetadata(a3.getResultMetadata());
            result.addResultPoints(a3.getResultPoints());
            i2 = a3.getText().length();
        } catch (ReaderException e2) {
            i2 = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            boolean z = false;
            int length = iArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                } else if (i2 != iArr2[i5]) {
                    i5++;
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if ((a2 == BarcodeFormat.EAN_13 || a2 == BarcodeFormat.UPC_A) && (a = this.h.a(sb2)) != null) {
            result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, a);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean checkChecksum(String str) {
        return a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }

    int[] decodeEnd(BitArray bitArray, int i) {
        return a(bitArray, i, false, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] a(BitArray bitArray, int i, boolean z, int[] iArr) {
        return a(bitArray, i, z, iArr, new int[iArr.length]);
    }

    private static int[] a(BitArray bitArray, int i, boolean z, int[] iArr, int[] iArr2) {
        int size = bitArray.getSize();
        int nextUnset = z ? bitArray.getNextUnset(i) : bitArray.getNextSet(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        for (int i3 = nextUnset; i3 < size; i3++) {
            if (bitArray.get(i3) ^ z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 == length - 1) {
                    if (patternMatchVariance(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{nextUnset, i3};
                    }
                    nextUnset += iArr2[0] + iArr2[1];
                    System.arraycopy(iArr2, 2, iArr2, 0, length - 2);
                    iArr2[length - 2] = 0;
                    iArr2[length - 1] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(BitArray bitArray, int[] iArr, int i, int[][] iArr2) {
        recordPattern(bitArray, i, iArr);
        float f2 = 0.48f;
        int i2 = -1;
        int length = iArr2.length;
        int i3 = 0;
        while (i3 < length) {
            float patternMatchVariance = patternMatchVariance(iArr, iArr2[i3], 0.7f);
            if (patternMatchVariance < f2) {
                i2 = i3;
            } else {
                patternMatchVariance = f2;
            }
            i3++;
            f2 = patternMatchVariance;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
