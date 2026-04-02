package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
/* loaded from: classes2.dex */
public final class Detector {
    private static final int[] g = {3808, 476, 2107, 1799};
    private final BitMatrix a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;

    public Detector(BitMatrix bitMatrix) {
        this.a = bitMatrix;
    }

    public AztecDetectorResult detect() {
        return detect(false);
    }

    public AztecDetectorResult detect(boolean z) {
        ResultPoint[] a2 = a(a());
        if (z) {
            ResultPoint resultPoint = a2[0];
            a2[0] = a2[2];
            a2[2] = resultPoint;
        }
        a(a2);
        return new AztecDetectorResult(a(this.a, a2[this.f % 4], a2[(this.f + 1) % 4], a2[(this.f + 2) % 4], a2[(this.f + 3) % 4]), b(a2), this.b, this.d, this.c);
    }

    private void a(ResultPoint[] resultPointArr) {
        long j;
        int i;
        if (!a(resultPointArr[0]) || !a(resultPointArr[1]) || !a(resultPointArr[2]) || !a(resultPointArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i2 = this.e * 2;
        int[] iArr = {a(resultPointArr[0], resultPointArr[1], i2), a(resultPointArr[1], resultPointArr[2], i2), a(resultPointArr[2], resultPointArr[3], i2), a(resultPointArr[3], resultPointArr[0], i2)};
        this.f = a(iArr, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f + i3) % 4];
            if (this.b) {
                j = j2 << 7;
                i = (i4 >> 1) & 127;
            } else {
                j = j2 << 10;
                i = ((i4 >> 1) & 31) + ((i4 >> 2) & 992);
            }
            j2 = j + i;
        }
        int a2 = a(j2, this.b);
        if (this.b) {
            this.c = (a2 >> 6) + 1;
            this.d = (a2 & 63) + 1;
            return;
        }
        this.c = (a2 >> 11) + 1;
        this.d = (a2 & 2047) + 1;
    }

    private static int a(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + (i3 & 1) + ((i3 >> (i - 2)) << 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int a(long j, boolean z) {
        int i;
        int i2;
        int i3 = 0;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i4 = i - i2;
        int[] iArr = new int[i];
        for (int i5 = i - 1; i5 >= 0; i5--) {
            iArr[i5] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decode(iArr, i4);
            for (int i6 = 0; i6 < i2; i6++) {
                i3 = iArr[i6] + (i3 << 4);
            }
            return i3;
        } catch (ReedSolomonException e) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private ResultPoint[] a(a aVar) {
        boolean z = true;
        this.e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar;
        a aVar4 = aVar;
        while (this.e < 9) {
            a a2 = a(aVar4, z, 1, -1);
            a a3 = a(aVar3, z, 1, 1);
            a a4 = a(aVar2, z, -1, 1);
            a a5 = a(aVar, z, -1, -1);
            if (this.e > 2) {
                float b = (b(a5, a2) * this.e) / (b(aVar, aVar4) * (this.e + 2));
                if (b >= 0.75d) {
                    if (b <= 1.25d) {
                        if (!a(a2, a3, a4, a5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            z = !z;
            this.e++;
            aVar = a5;
            aVar2 = a4;
            aVar3 = a3;
            aVar4 = a2;
        }
        if (this.e != 5 && this.e != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.b = this.e == 5;
        return a(new ResultPoint[]{new ResultPoint(aVar4.b() + 0.5f, aVar4.c() - 0.5f), new ResultPoint(aVar3.b() + 0.5f, aVar3.c() + 0.5f), new ResultPoint(aVar2.b() - 0.5f, aVar2.c() + 0.5f), new ResultPoint(aVar.b() - 0.5f, aVar.c() - 0.5f)}, (this.e * 2) - 3, this.e * 2);
    }

    private a a() {
        ResultPoint a2;
        ResultPoint a3;
        ResultPoint a4;
        ResultPoint a5;
        ResultPoint a6;
        ResultPoint a7;
        ResultPoint a8;
        ResultPoint a9;
        try {
            ResultPoint[] detect = new WhiteRectangleDetector(this.a).detect();
            a2 = detect[0];
            a3 = detect[1];
            a4 = detect[2];
            a5 = detect[3];
        } catch (NotFoundException e) {
            int width = this.a.getWidth() / 2;
            int height = this.a.getHeight() / 2;
            a2 = a(new a(width + 7, height - 7), false, 1, -1).a();
            a3 = a(new a(width + 7, height + 7), false, 1, 1).a();
            a4 = a(new a(width - 7, height + 7), false, -1, 1).a();
            a5 = a(new a(width - 7, height - 7), false, -1, -1).a();
        }
        int round = MathUtils.round((((a2.getX() + a5.getX()) + a3.getX()) + a4.getX()) / 4.0f);
        int round2 = MathUtils.round((((a5.getY() + a2.getY()) + a3.getY()) + a4.getY()) / 4.0f);
        try {
            ResultPoint[] detect2 = new WhiteRectangleDetector(this.a, 15, round, round2).detect();
            a6 = detect2[0];
            a7 = detect2[1];
            a8 = detect2[2];
            a9 = detect2[3];
        } catch (NotFoundException e2) {
            a6 = a(new a(round + 7, round2 - 7), false, 1, -1).a();
            a7 = a(new a(round + 7, round2 + 7), false, 1, 1).a();
            a8 = a(new a(round - 7, round2 + 7), false, -1, 1).a();
            a9 = a(new a(round - 7, round2 - 7), false, -1, -1).a();
        }
        return new a(MathUtils.round((((a6.getX() + a9.getX()) + a7.getX()) + a8.getX()) / 4.0f), MathUtils.round((((a9.getY() + a6.getY()) + a7.getY()) + a8.getY()) / 4.0f));
    }

    private ResultPoint[] b(ResultPoint[] resultPointArr) {
        return a(resultPointArr, this.e * 2, b());
    }

    private BitMatrix a(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        GridSampler gridSampler = GridSampler.getInstance();
        int b = b();
        float f = (b / 2.0f) - this.e;
        float f2 = (b / 2.0f) + this.e;
        return gridSampler.sampleGrid(bitMatrix, b, b, f, f, f2, f, f2, f2, f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    private int a(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
        int i2 = 0;
        float a2 = a(resultPoint, resultPoint2);
        float f = a2 / i;
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = ((resultPoint2.getX() - resultPoint.getX()) * f) / a2;
        float y2 = (f * (resultPoint2.getY() - resultPoint.getY())) / a2;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.a.get(MathUtils.round((i3 * x2) + x), MathUtils.round((i3 * y2) + y))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    private boolean a(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.b() - 3, aVar.c() + 3);
        a aVar6 = new a(aVar2.b() - 3, aVar2.c() - 3);
        a aVar7 = new a(aVar3.b() + 3, aVar3.c() - 3);
        a aVar8 = new a(aVar4.b() + 3, aVar4.c() + 3);
        int a2 = a(aVar8, aVar5);
        return a2 != 0 && a(aVar5, aVar6) == a2 && a(aVar6, aVar7) == a2 && a(aVar7, aVar8) == a2;
    }

    private int a(a aVar, a aVar2) {
        float b = b(aVar, aVar2);
        float b2 = (aVar2.b() - aVar.b()) / b;
        float c = (aVar2.c() - aVar.c()) / b;
        float b3 = aVar.b();
        float c2 = aVar.c();
        boolean z = this.a.get(aVar.b(), aVar.c());
        int ceil = (int) Math.ceil(b);
        int i = 0;
        float f = b3;
        float f2 = c2;
        for (int i2 = 0; i2 < ceil; i2++) {
            f += b2;
            f2 += c;
            if (this.a.get(MathUtils.round(f), MathUtils.round(f2)) != z) {
                i++;
            }
        }
        float f3 = i / b;
        if (f3 <= 0.1f || f3 >= 0.9f) {
            return ((f3 > 0.1f ? 1 : (f3 == 0.1f ? 0 : -1)) <= 0) == z ? 1 : -1;
        }
        return 0;
    }

    private a a(a aVar, boolean z, int i, int i2) {
        int b = aVar.b() + i;
        int c = aVar.c();
        while (true) {
            c += i2;
            if (!a(b, c) || this.a.get(b, c) != z) {
                break;
            }
            b += i;
        }
        int i3 = c - i2;
        int i4 = b - i;
        while (a(i4, i3) && this.a.get(i4, i3) == z) {
            i4 += i;
        }
        int i5 = i4 - i;
        int i6 = i3;
        while (a(i5, i6) && this.a.get(i5, i6) == z) {
            i6 += i2;
        }
        return new a(i5, i6 - i2);
    }

    private static ResultPoint[] a(ResultPoint[] resultPointArr, float f, float f2) {
        float f3 = f2 / (2.0f * f);
        float x = resultPointArr[0].getX() - resultPointArr[2].getX();
        float y = resultPointArr[0].getY() - resultPointArr[2].getY();
        float x2 = (resultPointArr[0].getX() + resultPointArr[2].getX()) / 2.0f;
        float y2 = (resultPointArr[0].getY() + resultPointArr[2].getY()) / 2.0f;
        ResultPoint resultPoint = new ResultPoint((f3 * x) + x2, (f3 * y) + y2);
        ResultPoint resultPoint2 = new ResultPoint(x2 - (x * f3), y2 - (y * f3));
        float x3 = resultPointArr[1].getX() - resultPointArr[3].getX();
        float y3 = resultPointArr[1].getY() - resultPointArr[3].getY();
        float x4 = (resultPointArr[1].getX() + resultPointArr[3].getX()) / 2.0f;
        float y4 = (resultPointArr[1].getY() + resultPointArr[3].getY()) / 2.0f;
        return new ResultPoint[]{resultPoint, new ResultPoint((f3 * x3) + x4, (f3 * y3) + y4), resultPoint2, new ResultPoint(x4 - (x3 * f3), y4 - (f3 * y3))};
    }

    private boolean a(int i, int i2) {
        return i >= 0 && i < this.a.getWidth() && i2 > 0 && i2 < this.a.getHeight();
    }

    private boolean a(ResultPoint resultPoint) {
        return a(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    private static float b(a aVar, a aVar2) {
        return MathUtils.distance(aVar.b(), aVar.c(), aVar2.b(), aVar2.c());
    }

    private static float a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private int b() {
        if (this.b) {
            return (this.c * 4) + 11;
        }
        if (this.c <= 4) {
            return (this.c * 4) + 15;
        }
        return (this.c * 4) + ((((this.c - 4) / 8) + 1) * 2) + 15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a {
        private final int a;
        private final int b;

        ResultPoint a() {
            return new ResultPoint(b(), c());
        }

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        int b() {
            return this.a;
        }

        int c() {
            return this.b;
        }

        public String toString() {
            return "<" + this.a + ' ' + this.b + '>';
        }
    }
}
