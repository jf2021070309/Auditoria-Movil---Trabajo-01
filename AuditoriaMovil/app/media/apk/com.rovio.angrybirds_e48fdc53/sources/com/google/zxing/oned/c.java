package com.google.zxing.oned;

import com.facebook.appevents.AppEventsConstants;
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
public final class c {
    private static final int[] a = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] b = new int[4];
    private final StringBuilder c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Result a(int i, BitArray bitArray, int[] iArr) {
        StringBuilder sb = this.c;
        sb.setLength(0);
        int a2 = a(bitArray, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> a3 = a(sb2);
        Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i), new ResultPoint(a2, i)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (a3 != null) {
            result.putAllMetadata(a3);
        }
        return result;
    }

    private int a(BitArray bitArray, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < size; i3++) {
            int a2 = UPCEANReader.a(bitArray, iArr2, i, UPCEANReader.f);
            sb.append((char) ((a2 % 10) + 48));
            int length = iArr2.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = iArr2[i4] + i;
                i4++;
                i = i5;
            }
            if (a2 >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = bitArray.getNextUnset(bitArray.getNextSet(i));
            }
        }
        if (sb.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (a((CharSequence) sb.toString()) != a(i2)) {
            throw NotFoundException.getNotFoundInstance();
        }
        return i;
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    private static int a(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == a[i2]) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static Map<ResultMetadataType, Object> a(String str) {
        String b;
        if (str.length() == 5 && (b = b(str)) != null) {
            EnumMap enumMap = new EnumMap(ResultMetadataType.class);
            enumMap.put((EnumMap) ResultMetadataType.SUGGESTED_PRICE, (ResultMetadataType) b);
            return enumMap;
        }
        return null;
    }

    private static String b(String str) {
        String str2;
        switch (str.charAt(0)) {
            case '0':
                str2 = "£";
                break;
            case '5':
                str2 = "$";
                break;
            case '9':
                if ("90000".equals(str)) {
                    return null;
                }
                if ("99991".equals(str)) {
                    return "0.00";
                }
                if ("99990".equals(str)) {
                    return "Used";
                }
                str2 = "";
                break;
            default:
                str2 = "";
                break;
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        return str2 + valueOf + '.' + (i < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO + i : String.valueOf(i));
    }
}
