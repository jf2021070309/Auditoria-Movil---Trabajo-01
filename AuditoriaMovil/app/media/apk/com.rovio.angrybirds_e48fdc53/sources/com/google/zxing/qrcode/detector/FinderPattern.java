package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;
/* loaded from: classes2.dex */
public final class FinderPattern extends ResultPoint {
    private final float a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FinderPattern(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private FinderPattern(float f, float f2, float f3, int i) {
        super(f, f2);
        this.a = f3;
        this.b = i;
    }

    public float getEstimatedModuleSize() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.a);
        return abs <= 1.0f || abs <= this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FinderPattern b(float f, float f2, float f3) {
        int i = this.b + 1;
        return new FinderPattern(((this.b * getX()) + f2) / i, ((this.b * getY()) + f) / i, ((this.b * this.a) + f3) / i, i);
    }
}
