package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
/* loaded from: classes2.dex */
public abstract class AbstractRSSReader extends OneDReader {
    private final int[] a = new int[4];
    private final int[] b = new int[8];
    private final float[] c = new float[4];
    private final float[] d = new float[4];
    private final int[] e = new int[this.b.length / 2];
    private final int[] f = new int[this.b.length / 2];

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] getDecodeFinderCounters() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] getDataCharacterCounters() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float[] getOddRoundingErrors() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float[] getEvenRoundingErrors() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] getOddCounts() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] getEvenCounts() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int parseFinderValue(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (patternMatchVariance(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Deprecated
    protected static int count(int[] iArr) {
        return MathUtils.sum(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void increment(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void decrement(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isFinderPattern(int[] iArr) {
        int i;
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + i) + iArr[3]);
        if (f < 0.7916667f || f > 0.89285713f) {
            return false;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            if (i5 > i3) {
                i3 = i5;
            }
            if (i5 >= i2) {
                i5 = i2;
            }
            i4++;
            i2 = i5;
        }
        return i3 < i2 * 10;
    }
}
