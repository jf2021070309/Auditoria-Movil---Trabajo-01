package com.google.zxing.oned;

import com.amazon.aps.iva.q.c0;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes4.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    /* renamed from: com.google.zxing.oned.Code128Writer$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset;
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch;

        static {
            int[] iArr = new int[MinimalEncoder.Charset.values().length];
            $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset = iArr;
            try {
                iArr[MinimalEncoder.Charset.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[MinimalEncoder.Charset.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[MinimalEncoder.Charset.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MinimalEncoder.Latch.values().length];
            $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch = iArr2;
            try {
                iArr2[MinimalEncoder.Latch.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.SHIFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int check(String str, Map<EncodeHintType, ?> map) {
        int length = str.length();
        if (length >= 1 && length <= 80) {
            int i = -1;
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.FORCE_CODE_SET;
                if (map.containsKey(encodeHintType)) {
                    String obj = map.get(encodeHintType).toString();
                    obj.getClass();
                    obj.hashCode();
                    char c = 65535;
                    switch (obj.hashCode()) {
                        case 65:
                            if (obj.equals("A")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 66:
                            if (obj.equals("B")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 67:
                            if (obj.equals("C")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            i = 101;
                            break;
                        case 1:
                            i = 100;
                            break;
                        case 2:
                            i = CODE_CODE_C;
                            break;
                        default:
                            throw new IllegalArgumentException("Unsupported code set hint: ".concat(obj));
                    }
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt > 127) {
                            throw new IllegalArgumentException(c0.a("Bad character in input: ASCII value=", charAt));
                        }
                        break;
                }
                switch (i) {
                    case CODE_CODE_C /* 99 */:
                        if (charAt >= '0' && !((charAt > '9' && charAt <= 127) || charAt == 242 || charAt == 243 || charAt == 244)) {
                            break;
                        } else {
                            throw new IllegalArgumentException(c0.a("Bad character in input for forced code set C: ASCII value=", charAt));
                        }
                        break;
                    case 100:
                        if (charAt >= ' ') {
                            break;
                        } else {
                            throw new IllegalArgumentException(c0.a("Bad character in input for forced code set B: ASCII value=", charAt));
                        }
                    case 101:
                        if (charAt > '_' && charAt <= 127) {
                            throw new IllegalArgumentException(c0.a("Bad character in input for forced code set A: ASCII value=", charAt));
                        }
                        break;
                }
            }
            return i;
        }
        throw new IllegalArgumentException(c0.a("Contents length should be between 1 and 80 characters, but got ", length));
    }

    private static int chooseCode(CharSequence charSequence, int i, int i2) {
        CType findCType;
        CType findCType2;
        char charAt;
        CType findCType3 = findCType(charSequence, i);
        CType cType = CType.ONE_DIGIT;
        if (findCType3 == cType) {
            if (i2 == 101) {
                return 101;
            }
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (findCType3 == cType2) {
            if (i < charSequence.length() && ((charAt = charSequence.charAt(i)) < ' ' || (i2 == 101 && (charAt < CODE_FNC_3 || (charAt >= 241 && charAt <= 244))))) {
                return 101;
            }
            return 100;
        } else if (i2 == 101 && findCType3 == CType.FNC_1) {
            return 101;
        } else {
            if (i2 == CODE_CODE_C) {
                return CODE_CODE_C;
            }
            if (i2 == 100) {
                CType cType3 = CType.FNC_1;
                if (findCType3 == cType3 || (findCType = findCType(charSequence, i + 2)) == cType2 || findCType == cType) {
                    return 100;
                }
                if (findCType == cType3) {
                    if (findCType(charSequence, i + 3) != CType.TWO_DIGITS) {
                        return 100;
                    }
                    return CODE_CODE_C;
                }
                int i3 = i + 4;
                while (true) {
                    findCType2 = findCType(charSequence, i3);
                    if (findCType2 != CType.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                if (findCType2 == CType.ONE_DIGIT) {
                    return 100;
                }
                return CODE_CODE_C;
            }
            if (findCType3 == CType.FNC_1) {
                findCType3 = findCType(charSequence, i + 1);
            }
            if (findCType3 != CType.TWO_DIGITS) {
                return 100;
            }
            return CODE_CODE_C;
        }
    }

    private static boolean[] encodeFast(String str, int i) {
        int i2;
        int i3;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i4 < length) {
            if (i == -1) {
                i2 = chooseCode(str, i4, i6);
            } else {
                i2 = i;
            }
            int i8 = 100;
            if (i2 == i6) {
                switch (str.charAt(i4)) {
                    case 241:
                        i8 = 102;
                        break;
                    case 242:
                        i8 = CODE_FNC_2;
                        break;
                    case 243:
                        i8 = CODE_FNC_3;
                        break;
                    case 244:
                        if (i6 == 101) {
                            i8 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i6 != 100) {
                            if (i6 != 101) {
                                int i9 = i4 + 1;
                                if (i9 != length) {
                                    i8 = Integer.parseInt(str.substring(i4, i4 + 2));
                                    i4 = i9;
                                    break;
                                } else {
                                    throw new IllegalArgumentException("Bad number of characters for digit only encoding.");
                                }
                            } else {
                                i8 = str.charAt(i4) - ' ';
                                if (i8 < 0) {
                                    i8 += CODE_FNC_3;
                                    break;
                                }
                            }
                        } else {
                            i8 = str.charAt(i4) - ' ';
                            break;
                        }
                        break;
                }
                i4++;
            } else {
                if (i6 == 0) {
                    if (i2 != 100) {
                        if (i2 != 101) {
                            i3 = CODE_START_C;
                        } else {
                            i3 = 103;
                        }
                    } else {
                        i3 = 104;
                    }
                    i8 = i3;
                } else {
                    i8 = i2;
                }
                i6 = i2;
            }
            arrayList.add(Code128Reader.CODE_PATTERNS[i8]);
            i5 += i8 * i7;
            if (i4 != 0) {
                i7++;
            }
        }
        return produceResult(arrayList, i5);
    }

    private static CType findCType(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i2 = i + 1;
            if (i2 >= length) {
                return CType.ONE_DIGIT;
            }
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return CType.TWO_DIGITS;
            }
            return CType.ONE_DIGIT;
        }
        return CType.UNCODABLE;
    }

    public static boolean[] produceResult(Collection<int[]> collection, int i) {
        int[][] iArr = Code128Reader.CODE_PATTERNS;
        collection.add(iArr[i % 103]);
        collection.add(iArr[CODE_STOP]);
        int i2 = 0;
        int i3 = 0;
        for (int[] iArr2 : collection) {
            for (int i4 : iArr2) {
                i3 += i4;
            }
        }
        boolean[] zArr = new boolean[i3];
        for (int[] iArr3 : collection) {
            i2 += OneDimensionalCodeWriter.appendPattern(zArr, i2, iArr3, true);
        }
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        return encode(str, null);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_128);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean[] encode(java.lang.String r4, java.util.Map<com.google.zxing.EncodeHintType, ?> r5) {
        /*
            r3 = this;
            int r0 = check(r4, r5)
            if (r5 == 0) goto L1e
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.CODE128_COMPACT
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L1e
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = r5.toString()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L1e
            r5 = 1
            goto L1f
        L1e:
            r5 = 0
        L1f:
            if (r5 == 0) goto L2c
            com.google.zxing.oned.Code128Writer$MinimalEncoder r5 = new com.google.zxing.oned.Code128Writer$MinimalEncoder
            r0 = 0
            r5.<init>(r0)
            boolean[] r4 = com.google.zxing.oned.Code128Writer.MinimalEncoder.access$100(r5, r4)
            goto L30
        L2c:
            boolean[] r4 = encodeFast(r4, r0)
        L30:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.encode(java.lang.String, java.util.Map):boolean[]");
    }

    /* loaded from: classes4.dex */
    public static final class MinimalEncoder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final String A = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ";
        static final String B = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ";
        private static final int CODE_SHIFT = 98;
        private int[][] memoizedCost;
        private Latch[][] minPath;

        /* loaded from: classes4.dex */
        public enum Charset {
            A,
            B,
            C,
            NONE
        }

        /* loaded from: classes4.dex */
        public enum Latch {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private MinimalEncoder() {
        }

        public /* synthetic */ MinimalEncoder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private static void addPattern(Collection<int[]> collection, int i, int[] iArr, int[] iArr2, int i2) {
            collection.add(Code128Reader.CODE_PATTERNS[i]);
            if (i2 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = (i * iArr2[0]) + iArr[0];
        }

        private boolean canEncode(CharSequence charSequence, Charset charset, int i) {
            int i2;
            char charAt = charSequence.charAt(i);
            int i3 = AnonymousClass1.$SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[charset.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return false;
                    }
                    if (charAt != 241 && ((i2 = i + 1) >= charSequence.length() || !isDigit(charAt) || !isDigit(charSequence.charAt(i2)))) {
                        return false;
                    }
                    return true;
                } else if (charAt != 241 && charAt != 242 && charAt != 243 && charAt != 244 && B.indexOf(charAt) < 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (charAt != 241 && charAt != 242 && charAt != 243 && charAt != 244 && A.indexOf(charAt) < 0) {
                return false;
            } else {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean[] encode(String str) {
            this.memoizedCost = (int[][]) Array.newInstance(Integer.TYPE, 4, str.length());
            this.minPath = (Latch[][]) Array.newInstance(Latch.class, 4, str.length());
            Charset charset = Charset.NONE;
            encode(str, charset, 0);
            ArrayList arrayList = new ArrayList();
            int[] iArr = {0};
            int[] iArr2 = {1};
            int length = str.length();
            int i = 0;
            while (i < length) {
                Latch latch = this.minPath[charset.ordinal()][i];
                int i2 = AnonymousClass1.$SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[latch.ordinal()];
                int i3 = 100;
                if (i2 == 1) {
                    charset = Charset.A;
                    addPattern(arrayList, i == 0 ? 103 : 101, iArr, iArr2, i);
                } else if (i2 == 2) {
                    charset = Charset.B;
                    addPattern(arrayList, i == 0 ? 104 : 100, iArr, iArr2, i);
                } else if (i2 == 3) {
                    charset = Charset.C;
                    addPattern(arrayList, i == 0 ? Code128Writer.CODE_START_C : Code128Writer.CODE_CODE_C, iArr, iArr2, i);
                } else if (i2 == 4) {
                    addPattern(arrayList, CODE_SHIFT, iArr, iArr2, i);
                }
                if (charset == Charset.C) {
                    if (str.charAt(i) == 241) {
                        addPattern(arrayList, 102, iArr, iArr2, i);
                    } else {
                        addPattern(arrayList, Integer.parseInt(str.substring(i, i + 2)), iArr, iArr2, i);
                        int i4 = i + 1;
                        if (i4 < length) {
                            i = i4;
                        }
                    }
                } else {
                    switch (str.charAt(i)) {
                        case 241:
                            i3 = 102;
                            break;
                        case 242:
                            i3 = Code128Writer.CODE_FNC_2;
                            break;
                        case 243:
                            i3 = Code128Writer.CODE_FNC_3;
                            break;
                        case 244:
                            if ((charset == Charset.A && latch != Latch.SHIFT) || (charset == Charset.B && latch == Latch.SHIFT)) {
                                i3 = 101;
                                break;
                            }
                            break;
                        default:
                            i3 = str.charAt(i) - ' ';
                            break;
                    }
                    if (((charset == Charset.A && latch != Latch.SHIFT) || (charset == Charset.B && latch == Latch.SHIFT)) && i3 < 0) {
                        i3 += Code128Writer.CODE_FNC_3;
                    }
                    addPattern(arrayList, i3, iArr, iArr2, i);
                }
                i++;
            }
            this.memoizedCost = null;
            this.minPath = null;
            return Code128Writer.produceResult(arrayList, iArr[0]);
        }

        private static boolean isDigit(char c) {
            if (c >= '0' && c <= '9') {
                return true;
            }
            return false;
        }

        private int encode(CharSequence charSequence, Charset charset, int i) {
            int i2;
            int i3;
            int i4 = this.memoizedCost[charset.ordinal()][i];
            if (i4 > 0) {
                return i4;
            }
            Latch latch = Latch.NONE;
            int i5 = i + 1;
            int i6 = 0;
            boolean z = i5 >= charSequence.length();
            Charset[] charsetArr = {Charset.A, Charset.B};
            int i7 = Integer.MAX_VALUE;
            while (true) {
                if (i6 > 1) {
                    break;
                }
                if (canEncode(charSequence, charsetArr[i6], i)) {
                    Latch latch2 = Latch.NONE;
                    Charset charset2 = charsetArr[i6];
                    if (charset != charset2) {
                        latch2 = Latch.valueOf(charset2.toString());
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    if (!z) {
                        i3 += encode(charSequence, charsetArr[i6], i5);
                    }
                    if (i3 < i7) {
                        latch = latch2;
                        i7 = i3;
                    }
                    if (charset == charsetArr[(i6 + 1) % 2]) {
                        Latch latch3 = Latch.SHIFT;
                        int encode = z ? 2 : 2 + encode(charSequence, charset, i5);
                        if (encode < i7) {
                            i7 = encode;
                            latch = latch3;
                        }
                    }
                }
                i6++;
            }
            Charset charset3 = Charset.C;
            if (canEncode(charSequence, charset3, i)) {
                Latch latch4 = Latch.NONE;
                if (charset != charset3) {
                    latch4 = Latch.C;
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int i8 = (charSequence.charAt(i) != 241 ? 2 : 1) + i;
                if (i8 < charSequence.length()) {
                    i2 += encode(charSequence, charset3, i8);
                }
                if (i2 < i7) {
                    latch = latch4;
                    i7 = i2;
                }
            }
            if (i7 != Integer.MAX_VALUE) {
                this.memoizedCost[charset.ordinal()][i] = i7;
                this.minPath[charset.ordinal()][i] = latch;
                return i7;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) charSequence.charAt(i)));
        }
    }
}
