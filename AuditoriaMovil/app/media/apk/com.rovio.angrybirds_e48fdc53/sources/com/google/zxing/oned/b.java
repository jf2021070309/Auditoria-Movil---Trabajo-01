package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b {
    private final int[] a = new int[4];
    private final StringBuilder b = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Result a(int i, BitArray bitArray, int[] iArr) {
        StringBuilder sb = this.b;
        sb.setLength(0);
        int a = a(bitArray, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> a2 = a(sb2);
        Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i), new ResultPoint(a, i)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (a2 != null) {
            result.putAllMetadata(a2);
        }
        return result;
    }

    private int a(BitArray bitArray, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < size; i3++) {
            int a = UPCEANReader.a(bitArray, iArr2, i, UPCEANReader.f);
            sb.append((char) ((a % 10) + 48));
            int length = iArr2.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = iArr2[i4] + i;
                i4++;
                i = i5;
            }
            if (a >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = bitArray.getNextUnset(bitArray.getNextSet(i));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(sb.toString()) % 4 != i2) {
            throw NotFoundException.getNotFoundInstance();
        }
        return i;
    }

    private static Map<ResultMetadataType, Object> a(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put((EnumMap) ResultMetadataType.ISSUE_NUMBER, (ResultMetadataType) Integer.valueOf(str));
        return enumMap;
    }
}
