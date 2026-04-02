package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;
/* loaded from: classes2.dex */
public final class FinderPattern {
    private final int a;
    private final int[] b;
    private final ResultPoint[] c;

    public FinderPattern(int i, int[] iArr, int i2, int i3, int i4) {
        this.a = i;
        this.b = iArr;
        this.c = new ResultPoint[]{new ResultPoint(i2, i4), new ResultPoint(i3, i4)};
    }

    public int getValue() {
        return this.a;
    }

    public int[] getStartEnd() {
        return this.b;
    }

    public ResultPoint[] getResultPoints() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof FinderPattern) && this.a == ((FinderPattern) obj).a;
    }

    public int hashCode() {
        return this.a;
    }
}
