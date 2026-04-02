package com.google.zxing.common;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.q.c0;
import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class MinimalECIInput implements ECIInput {
    private static final int COST_PER_ECI = 3;
    private final int[] bytes;
    private final int fnc1;

    /* loaded from: classes4.dex */
    public static final class InputEdge {
        private final char c;
        private final int cachedTotalSize;
        private final int encoderIndex;
        private final InputEdge previous;

        public boolean isFNC1() {
            if (this.c == 1000) {
                return true;
            }
            return false;
        }

        private InputEdge(char c, ECIEncoderSet eCIEncoderSet, int i, InputEdge inputEdge, int i2) {
            char c2 = c == i2 ? (char) 1000 : c;
            this.c = c2;
            this.encoderIndex = i;
            this.previous = inputEdge;
            int length = c2 == 1000 ? 1 : eCIEncoderSet.encode(c, i).length;
            length = (inputEdge == null ? 0 : inputEdge.encoderIndex) != i ? length + 3 : length;
            this.cachedTotalSize = inputEdge != null ? length + inputEdge.cachedTotalSize : length;
        }
    }

    public MinimalECIInput(String str, Charset charset, int i) {
        this.fnc1 = i;
        ECIEncoderSet eCIEncoderSet = new ECIEncoderSet(str, charset, i);
        if (eCIEncoderSet.length() == 1) {
            this.bytes = new int[str.length()];
            for (int i2 = 0; i2 < this.bytes.length; i2++) {
                char charAt = str.charAt(i2);
                int[] iArr = this.bytes;
                if (charAt == i) {
                    charAt = 1000;
                }
                iArr[i2] = charAt;
            }
            return;
        }
        this.bytes = encodeMinimally(str, eCIEncoderSet, i);
    }

    public static void addEdge(InputEdge[][] inputEdgeArr, int i, InputEdge inputEdge) {
        if (inputEdgeArr[i][inputEdge.encoderIndex] == null || inputEdgeArr[i][inputEdge.encoderIndex].cachedTotalSize > inputEdge.cachedTotalSize) {
            inputEdgeArr[i][inputEdge.encoderIndex] = inputEdge;
        }
    }

    public static void addEdges(String str, ECIEncoderSet eCIEncoderSet, InputEdge[][] inputEdgeArr, int i, InputEdge inputEdge, int i2) {
        int i3;
        int i4;
        char charAt = str.charAt(i);
        int length = eCIEncoderSet.length();
        if (eCIEncoderSet.getPriorityEncoderIndex() >= 0 && (charAt == i2 || eCIEncoderSet.canEncode(charAt, eCIEncoderSet.getPriorityEncoderIndex()))) {
            i4 = eCIEncoderSet.getPriorityEncoderIndex();
            i3 = i4 + 1;
        } else {
            i3 = length;
            i4 = 0;
        }
        for (int i5 = i4; i5 < i3; i5++) {
            if (charAt == i2 || eCIEncoderSet.canEncode(charAt, i5)) {
                addEdge(inputEdgeArr, i + 1, new InputEdge(charAt, eCIEncoderSet, i5, inputEdge, i2));
            }
        }
    }

    public static int[] encodeMinimally(String str, ECIEncoderSet eCIEncoderSet, int i) {
        int i2;
        int i3;
        int length = str.length();
        InputEdge[][] inputEdgeArr = (InputEdge[][]) Array.newInstance(InputEdge.class, length + 1, eCIEncoderSet.length());
        addEdges(str, eCIEncoderSet, inputEdgeArr, 0, null, i);
        int i4 = 1;
        while (true) {
            i2 = 0;
            if (i4 > length) {
                break;
            }
            for (int i5 = 0; i5 < eCIEncoderSet.length(); i5++) {
                InputEdge inputEdge = inputEdgeArr[i4][i5];
                if (inputEdge != null && i4 < length) {
                    addEdges(str, eCIEncoderSet, inputEdgeArr, i4, inputEdge, i);
                }
            }
            while (i2 < eCIEncoderSet.length()) {
                inputEdgeArr[i4 - 1][i2] = null;
                i2++;
            }
            i4++;
        }
        int i6 = -1;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < eCIEncoderSet.length(); i8++) {
            InputEdge inputEdge2 = inputEdgeArr[length][i8];
            if (inputEdge2 != null && inputEdge2.cachedTotalSize < i7) {
                i7 = inputEdge2.cachedTotalSize;
                i6 = i8;
            }
        }
        if (i6 >= 0) {
            ArrayList arrayList = new ArrayList();
            for (InputEdge inputEdge3 = inputEdgeArr[length][i6]; inputEdge3 != null; inputEdge3 = inputEdge3.previous) {
                if (inputEdge3.isFNC1()) {
                    arrayList.add(0, 1000);
                } else {
                    byte[] encode = eCIEncoderSet.encode(inputEdge3.c, inputEdge3.encoderIndex);
                    for (int length2 = encode.length - 1; length2 >= 0; length2--) {
                        arrayList.add(0, Integer.valueOf(encode[length2] & UnsignedBytes.MAX_VALUE));
                    }
                }
                if (inputEdge3.previous != null) {
                    i3 = inputEdge3.previous.encoderIndex;
                } else {
                    i3 = 0;
                }
                if (i3 != inputEdge3.encoderIndex) {
                    arrayList.add(0, Integer.valueOf(eCIEncoderSet.getECIValue(inputEdge3.encoderIndex) + 256));
                }
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            while (i2 < size) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                i2++;
            }
            return iArr;
        }
        throw new IllegalStateException(e.e("Failed to encode \"", str, "\""));
    }

    @Override // com.google.zxing.common.ECIInput
    public char charAt(int i) {
        int i2;
        if (i >= 0 && i < length()) {
            if (!isECI(i)) {
                if (isFNC1(i)) {
                    i2 = this.fnc1;
                } else {
                    i2 = this.bytes[i];
                }
                return (char) i2;
            }
            throw new IllegalArgumentException(a.d("value at ", i, " is not a character but an ECI"));
        }
        throw new IndexOutOfBoundsException(c0.a("", i));
    }

    @Override // com.google.zxing.common.ECIInput
    public int getECIValue(int i) {
        if (i >= 0 && i < length()) {
            if (isECI(i)) {
                return this.bytes[i] - 256;
            }
            throw new IllegalArgumentException(a.d("value at ", i, " is not an ECI but a character"));
        }
        throw new IndexOutOfBoundsException(c0.a("", i));
    }

    public int getFNC1Character() {
        return this.fnc1;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean haveNCharacters(int i, int i2) {
        if ((i + i2) - 1 >= this.bytes.length) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (isECI(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean isECI(int i) {
        if (i >= 0 && i < length()) {
            int i2 = this.bytes[i];
            if (i2 > 255 && i2 <= 999) {
                return true;
            }
            return false;
        }
        throw new IndexOutOfBoundsException(c0.a("", i));
    }

    public boolean isFNC1(int i) {
        if (i >= 0 && i < length()) {
            if (this.bytes[i] == 1000) {
                return true;
            }
            return false;
        }
        throw new IndexOutOfBoundsException(c0.a("", i));
    }

    @Override // com.google.zxing.common.ECIInput
    public int length() {
        return this.bytes.length;
    }

    @Override // com.google.zxing.common.ECIInput
    public CharSequence subSequence(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= length()) {
            StringBuilder sb = new StringBuilder();
            while (i < i2) {
                if (!isECI(i)) {
                    sb.append(charAt(i));
                    i++;
                } else {
                    throw new IllegalArgumentException(a.d("value at ", i, " is not a character but an ECI"));
                }
            }
            return sb;
        }
        throw new IndexOutOfBoundsException(c0.a("", i));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (isECI(i)) {
                sb.append("ECI(");
                sb.append(getECIValue(i));
                sb.append(')');
            } else if (charAt(i) < 128) {
                sb.append('\'');
                sb.append(charAt(i));
                sb.append('\'');
            } else {
                sb.append((int) charAt(i));
            }
        }
        return sb.toString();
    }
}
